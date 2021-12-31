package com.exa.api.controller
import com.exa.api.entity.Buku
import com.exa.api.service.BukuService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired
@RestController
@RequestMapping('/books')
class BukuController {
@Autowired
private final BukuService bukuService

@GetMapping('')
List<Buku> findAll() {
bukuService.findAll()
}
@GetMapping('{id}')
Buku findById(@PathVariable('id') int id) {
bukuService.findById(id)
}
@PostMapping()
Buku save(@RequestBody Buku buku) {
bukuService.save(buku)
}
@PutMapping('{id}')
Buku update(@RequestBody Buku buku, @PathVariable('id') int id) {
bukuService.update(buku, id)
}
@DeleteMapping('{id}')
Buku delete(@PathVariable('id') int id) {
bukuService.delete(id)
}
}