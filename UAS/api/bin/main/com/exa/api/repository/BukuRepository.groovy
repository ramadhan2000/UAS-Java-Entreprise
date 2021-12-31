package com.exa.api.repository
import com.exa.api.entity.Buku
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BukuRepository extends JpaRepository<Buku, Integer> {
List<Buku> findAll()
Buku findById(Integer id)
Buku save(Buku buku)
void delete(Buku buku)
}