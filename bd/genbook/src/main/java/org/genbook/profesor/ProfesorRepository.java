package org.genbook.profesor;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProfesorRepository extends JpaRepository<profesor, Long> {

    @Query("SELECT u FROM profesor u WHERE u.correoprofesor=?1")
    Optional<profesor> findProfesorByEmail(String email);

}
