package com.backend.proyclinicaodontologica.service.impl;


import com.backend.proyclinicaodontologica.dao.IDao;
import com.backend.proyclinicaodontologica.entity.Odontologo;

import java.util.List;

public class OdontologoService {
    private final IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo guardarOdontologo(Odontologo odontologo) {
        return odontologoIDao.registrar(odontologo);
    }

    public Odontologo buscarOdontologoPorId(int id) {
        return odontologoIDao.buscarPorId(id);
    }

    public List<Odontologo> listarOdontologos() {
        return odontologoIDao.listarTodos();
    }

    public void eliminarOdontologo(int id) {
        odontologoIDao.eliminar(id);
    }
}
