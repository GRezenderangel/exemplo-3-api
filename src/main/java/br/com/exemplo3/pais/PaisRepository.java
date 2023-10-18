package br.com.exemplo3.pais;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<Pais, UUID> {
}
