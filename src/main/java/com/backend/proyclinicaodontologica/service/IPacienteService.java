package com.backend.proyclinicaodontologica.service;

import com.backend.proyclinicaodontologica.dto.entrada.paciente.PacienteEntradaDto;
import com.backend.proyclinicaodontologica.dto.salida.paciente.PacienteSalidaDto;
import com.backend.proyclinicaodontologica.entity.Paciente;

import java.util.List;

public interface IPacienteService {
    List<Paciente> listarPacientes();

    PacienteSalidaDto registrarPaciente(PacienteEntradaDto paciente);

    Paciente buscarPacientePorId(int id);

    void eliminarPaciente(int id);

    Paciente modificarPaciente(Paciente pacienteModificado);



}
