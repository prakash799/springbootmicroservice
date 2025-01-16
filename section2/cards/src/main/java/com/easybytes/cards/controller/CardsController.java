package com.easybytes.cards.controller;

import com.easybytes.cards.constants.CardsConstant;
import com.easybytes.cards.dto.CardsDto;
import com.easybytes.cards.dto.ResponseDto;
import com.easybytes.cards.service.ICardsService;
import jakarta.validation.constraints.Pattern;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CardsController {

    private ICardsService icardsService;

    public CardsController(ICardsService icardsService) {
        this.icardsService = icardsService;
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createCard(@RequestBody CardsDto cardsDto) {

        icardsService.createCard(cardsDto.getMobileNumber());
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(CardsConstant.STATUS_201, CardsConstant.MESSAGE_201));
    }

    @GetMapping("/fetch")
    public ResponseEntity<CardsDto> fetchCardDetails(@RequestParam
                                                     @Pattern(regexp = "^$|[0-9]{10}", message = "Mobile number cannot be less then 10 digits")
                                                     String mobileNumber) {
        CardsDto cardsDto = icardsService.fetchCard(mobileNumber);
        return ResponseEntity.status(HttpStatus.OK).body(cardsDto);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDto> updateCardDetails(@RequestBody CardsDto cardsDto) {

        boolean isUpdated = icardsService.updateCard(cardsDto);
        if (isUpdated) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseDto(CardsConstant.STATUS_200, CardsConstant.MESSAGE_200));
        } else {
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED)
                    .body(new ResponseDto(CardsConstant.STATUS_417, CardsConstant.MESSAGE_417_UPDATE));
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDto> deleteCardDetails(@RequestParam String mobileNumber) {
        boolean isDeleted = icardsService.deleteCard(mobileNumber);
        if (isDeleted) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseDto(CardsConstant.STATUS_200, CardsConstant.MESSAGE_200));
        } else {
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED)
                    .body(new ResponseDto(CardsConstant.STATUS_417, CardsConstant.MESSAGE_417_DELETE));
        }
    }


}
