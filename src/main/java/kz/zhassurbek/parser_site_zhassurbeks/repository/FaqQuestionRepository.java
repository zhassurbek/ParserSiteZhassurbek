package kz.zhassurbek.parser_site_zhassurbeks.repository;

import kz.zhassurbek.parser_site_zhassurbeks.model.FaqQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FaqRepository extends JpaRepository<FaqQuestion, Long> {

    Optional<FaqQuestion> findById(Long id);

//    Optional<List<FaqQuestion>> findAllOrderByPosition();

}
