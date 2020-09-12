package id.project.spring.springbootcekmutasi.repository;

import id.project.spring.springbootcekmutasi.model.Rekening;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @author Arza Jasmelia.
 * springboot-cek-mutasi
 * on 12/09/2020
 */

@Repository
public interface CekMutasiRepository extends CrudRepository<Rekening, String>{
    ArrayList<Rekening> findByAccountNumber(String accountNumber);
}
