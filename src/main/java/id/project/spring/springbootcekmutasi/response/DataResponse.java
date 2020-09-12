package id.project.spring.springbootcekmutasi.response;

import lombok.Data;

/**
 * @author Arza Jasmelia.
 * springboot-cek-mutasi
 * on 12/09/2020
 */

@Data
public class DataResponse {
    private String transactionId;
    private String type;
    private String amount;
    private String description;
    private String balance;
    private String timestamp;
}
