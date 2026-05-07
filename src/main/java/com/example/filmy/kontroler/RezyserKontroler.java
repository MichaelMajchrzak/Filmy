package com.example.filmy.kontroler;

import com.example.filmy.model.Rezyser;
import com.example.filmy.serwis.RezyserSerwis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rezyserzy")
public class RezyserKontroler {

    @Autowired
    private RezyserSerwis rezyserSerwis;

    @GetMapping
    public List<Rezyser> pobierzWszystkich() {
        return rezyserSerwis.pobierzWszystkich();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rezyser> pobierzPoId(@PathVariable Long id) {
        return rezyserSerwis.pobierzPoId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Rezyser dodaj(@RequestBody Rezyser rezyser) {
        return rezyserSerwis.dodaj(rezyser);
    }

    @PutMapping("/{id}")
    public Rezyser edytuj(@PathVariable Long id, @RequestBody Rezyser rezyser) {
        return rezyserSerwis.edytuj(id, rezyser);
    }

    @DeleteMapping("/{id}")
    public void usun(@PathVariable Long id) {
        rezyserSerwis.usun(id);
    }
}
