package id.project.spring.springbootcekmutasi.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Arza Jasmelia.
 * springboot-cek-mutasi
 * on 12/09/2020
 */


@Data
@Entity
@Table(name = "rekening")
public class Rekening {

    @Id
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bank_code")
    private String bankCode;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "type")
    private String type;

    @Column(name = "amount")
    private String amount;

    @Column(name = "description")
    private String description;

    @Column(name = "balance")
    private String balance;

    @Column(name = "timestamp")
    private String timestamp;
}
