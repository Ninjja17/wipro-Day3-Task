package com.wipro.Saving_information.service;

import com.wipro.Saving_information.dto.Responsedto;
import com.wipro.Saving_information.dto.Savingdto;
import com.wipro.Saving_information.dto.Savinginformationdto;
import com.wipro.Saving_information.entity.Saving;
import com.wipro.Saving_information.repository.Savingrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class SavingService {
    @Autowired
    private Savingrepo savingrepo;
    @Autowired
    private WebClient webClient ;
    private com.wipro.Saving_information.entity.Saving Saving;

    public static Responsedto getuser(String accountNumber) {
    }

    public Saving addSaving (Saving saving){
        return Savingrepo.save(Saving) ;
    }
    public Responsedto getusers(String savingNumbers){
        Responsedto dto=new Responsedto() ;
        Saving saving=Savingrepo.findBysavingNumbers(savingNumbers).orElseThrow(()->new
                Savingdto (Savingdto=mapToSavingdto(Saving );
        List<Savingdto> savingdtoList=webClient.get()
                .uri("http://localhost:9098/saving/"+savingNumbers)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Savingdto>>() {})
                .block();

                dto.setDto1(Savinginformationdto);
                dto.setDto2(SavingdtoList);
                return dto;
        )

        private Savinginformationdto mapToSavinginformationdto(Service user){
            Savinginformationdto dto=new Savinginformationdto() ;
            dto.setAccountId(user.getaccountId());
            dto.setName(user.getname());

            dto.setEmail(user.getemail());
            dto.setPassword(user.getpassword());
            dto.setLocation(getusers().getClass() )location);
            dto.setSavingBalance(dto.getSavingBalance());
            return dto;
        }
    }

}
