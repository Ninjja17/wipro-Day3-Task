package com.wipro.Saving_information.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Responsedto {
    public Savinginformationdto dto1;
    public List<Savingdto> dto2;

    public Savinginformationdto getDto1() {
        return dto1 ;
    }
    public void setDto1(Savinginformationdto dto1){
        this.dto1 =dto1;
    }
    public List<Savingdto> getDto2() {
        return dto2;
    }
    public void setDto2(List<Savingdto> dto2){
        this.dto2 = dto2;
    }
}
