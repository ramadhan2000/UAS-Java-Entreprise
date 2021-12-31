package com.exa.api.service
import com.exa.api.entity.Buku
interface BukuService {
List<Buku> findAll()
Buku findById(int id)
Buku save(Buku buku)
Buku update(Buku buku, int id)
Buku delete(int id)
}