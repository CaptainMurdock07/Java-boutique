package com.formationjava.tpjdbc.dal;

import java.util.List;

import com.formationjava.tpjdbc.bo.Produit;

public interface ProduitDAO {
    List<Produit> getAll();
    Produit getByReference(int ref);
}
