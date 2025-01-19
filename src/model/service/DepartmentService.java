package model.service;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

   // Criando e Injetando a Dependencia
   private DepartmentDao dao = DaoFactory.createDepartmentDao();

   public List<Department> findAll() {
      // Mock de Dados
      //List<Department> list = new ArrayList<>();
      //list.add(new Department(1, "Books"));
      //list.add(new Department(2, "Computers"));
      //list.add(new Department(3, "Electronics"));
      return dao.findAll();
   }

   public void saveOrUpdate(Department obj){
      // Se o Id for == null > Novo obj caso contrario...
      if (obj.getId() == null){
         dao.insert(obj);
      }
      else {
         dao.update(obj);
      }
   }

}
