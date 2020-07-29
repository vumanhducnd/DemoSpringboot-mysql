package com.crud.demo.web.rest;

import com.crud.demo.entity.Docgia;
import com.crud.demo.repository.DocgiaReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class DocgiaResource {
    @Autowired
    DocgiaReponsitory docgiaReponsitory;

    @GetMapping("/docgia")
    public ResponseEntity<List<Docgia>> getalldocgia(){
        return new ResponseEntity<>(docgiaReponsitory.findAll(), HttpStatus.OK);

    }
    @PostMapping("/docgia")
    public ResponseEntity<Docgia> saveDocgia(@Validated @RequestBody Docgia docgia){
        return ResponseEntity.ok(docgiaReponsitory.save(docgia));
    }
    @PutMapping("/docgia/{id}")
    public ResponseEntity<Docgia> updateDocgia(@PathVariable(value = "id") Long docgiaId, @Validated @RequestBody Docgia docgia){
        Optional<Docgia> docgia1 = docgiaReponsitory.findById(docgiaId);

        if(!docgia1.isPresent()){
            return ResponseEntity.notFound().build();
        }
        docgia.setId(docgiaId);
        return ResponseEntity.ok(docgiaReponsitory.save(docgia));
    }
    @DeleteMapping("/docgia/{id}")
    public ResponseEntity<String> deleteDocgia(@PathVariable(value = "id") Long docgiaId){
        Optional<Docgia> docgiadel = docgiaReponsitory.findById(docgiaId);
        if(!docgiadel.isPresent()){
            return ResponseEntity.notFound().build();
        }
        docgiaReponsitory.delete(docgiadel.get());
        return ResponseEntity.ok(docgiaId.toString());
    }


}
