package id.project.spring.springbootcekmutasi.response;

import lombok.Data;

import java.util.ArrayList;

/**
 * @author Arza Jasmelia.
 * springboot-cek-mutasi
 * on 12/09/2020
 */

@Data
public class ContentResponse {
    private String bankName;
    private String bankCode;
    private String accountNumber;
    private String accountName;
    private ArrayList<DataResponse> data;
}
