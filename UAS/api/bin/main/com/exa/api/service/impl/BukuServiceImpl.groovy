package com.exa.api.service.impl
import com.exa.api.entity.Buku
import com.exa.api.repository.BukuRepository
import com.exa.api.service.BukuService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BukuServiceImpl implements BukuService {
@Autowired
private final BukuRepository BukuRepository

@Override
List<Buku> findAll() {
BukuRepository.findAll()
}

@Override
Buku findById(int id) {
BukuRepository.findById(id)
}
@Override
Buku save(Buku buku) {
BukuRepository.save(buku)
}
@Override
Buku update(Buku buku, int id) {
def record = BukuRepository.findById(id)
record.with {
category_id = buku.category_id
name = buku.name
isbn = buku.isbn
}
BukuRepository.save(record)
record
}
@Override
Buku delete(int id) {
def record = BukuRepository.findById(id)
BukuRepository.delete(record)
record
}
}