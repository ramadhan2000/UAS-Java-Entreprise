package com.exa.api.entity
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Table
import javax.persistence.GenerationType
import javax.validation.constraints.NotNull
import javax.persistence.Column
@Entity
@Table(name = "books")
class Buku {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer id
@NotNull
@Column(nullable = false)
Integer category_id
String name
String isbn
}