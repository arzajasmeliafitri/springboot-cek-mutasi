package id.project.spring.springbootcekmutasi.controller;

import id.project.spring.springbootcekmutasi.model.Rekening;
import id.project.spring.springbootcekmutasi.repository.CekMutasiRepository;
import id.project.spring.springbootcekmutasi.response.ContentResponse;
import id.project.spring.springbootcekmutasi.response.DataResponse;
import id.project.spring.springbootcekmutasi.response.MessageResponse;
import id.project.spring.springbootcekmutasi.utility.Formatter;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Arza Jasmelia.
 * springboot-cek-mutasi
 * on 12/09/2020
 */


@RestController
@RequestMapping("/api/v1")
public class CekMutasiController extends Formatter{

    @Autowired
    CekMutasiRepository mutasiRekeningRepository;

    @GetMapping("/cekrekening/{accountNumber}")
    @ApiOperation(value = "Cek Mutasi",notes = "Cek Mutasi")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "Cek Mutasi found"),
            @ApiResponse(code = 404,message = "Cek Mutasi not found")
    })
    public MessageResponse CekMutasi(@PathVariable String accountNumber){

        ArrayList<Rekening> rekening = mutasiRekeningRepository.findByAccountNumber(accountNumber);

        ArrayList<DataResponse> listData = new ArrayList<>();
        for (int i=0; i<rekening.size(); i++){
            DataResponse dataResponse = new DataResponse();
            dataResponse.setTransactionId(rekening.get(i).getTransactionId());
            dataResponse.setTimestamp(rekening.get(i).getTimestamp());
            dataResponse.setType(rekening.get(i).getType());
            dataResponse.setAmount(rekening.get(i).getAmount());
            dataResponse.setDescription(rekening.get(i).getDescription());
            dataResponse.setBalance(rekening.get(i).getBalance());
            listData.add(dataResponse);
        }


        ContentResponse contentResponse = new ContentResponse();
        contentResponse.setBankCode(rekening.get(0).getBankCode());
        contentResponse.setBankName(rekening.get(0).getBankName());
        contentResponse.setAccountNumber(rekening.get(0).getAccountNumber());
        contentResponse.setAccountName(rekening.get(0).getAccountName());
        contentResponse.setData(listData);


        MessageResponse messageResponse = new MessageResponse();
        messageResponse.setCode("0000");
        messageResponse.setMessage("Success");
        messageResponse.setDate(getDate());
        messageResponse.setTime(getTime());
        messageResponse.setContent(contentResponse);


        return messageResponse;
    }


}
