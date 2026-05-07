package com.example.filmy.kontroler;

import com.example.filmy.model.Gatunek;
import com.example.filmy.serwis.GatunekSerwis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gatunki")
public class GatunekKontroler {

    @Autowired
    private GatunekSerwis gatunekSerwis;

    @GetMapping
    public List<Gatunek> pobierzWszystkie() {
        return gatunekSerwis.pobierzWszystkie();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gatunek> pobierzPoId(@PathVariable Long id) {
        return gatunekSerwis.pobierzPoId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Gatunek dodaj(@RequestBody Gatunek gatunek) {
        return gatunekSerwis.dodaj(gatunek);
    }

    @PutMapping("/{id}")
    public Gatunek edytuj(@PathVariable Long id, @RequestBody Gatunek gatunek) {
        return gatunekSerwis.edytuj(id, gatunek);
    }

    @DeleteMapping("/{id}")
    public void usun(@PathVariable Long id) {
        gatunekSerwis.usun(id);
    }
}
