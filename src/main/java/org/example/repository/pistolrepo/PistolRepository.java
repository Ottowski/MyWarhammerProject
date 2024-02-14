package org.example.repository.pistolrepo;

import java.util.List;

public interface PistolRepository {


    PistolEntity get(Long id);
    void add(PistolEntity pistolentity);
    void update(PistolEntity pistolentity);
    void remove(PistolEntity pistolentity);

    List<PistolEntity> getAllPistol();
}
