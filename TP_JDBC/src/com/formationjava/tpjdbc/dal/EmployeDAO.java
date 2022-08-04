package com.formationjava.tpjdbc.dal;

import java.util.List;

import com.formationjava.tpjdbc.bo.Employe;

public interface EmployeDAO {
      List<Employe> getAll();
      int getReference(String nom);
}
