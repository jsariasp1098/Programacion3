package co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.mapping.mappers;

import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.mapping.dto.CitasDto;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.mapping.dto.UsuariosDto;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model.Cita;
import co.edu.uniquindio.programacion3.salasistemasappfx.salasistemasapp.model.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface CitasMapper {

    CitasMapper INSTANCE = Mappers.getMapper(CitasMapper.class);

    @Named("citaToCitaDto")
    CitasDto citaToCitasDto(Cita cita);

    Cita citasDtoToCita(CitasDto citasDto);

    @IterableMapping(qualifiedByName = "citaToCitaDto")
    List<CitasDto> getCitasDto(List<Cita> listCitas);

//    @Named("mappingToEmpeladoDto")
//    EmpleadoDto mappingToEmpeladoDto(Empleado empleado);


    @Mapping(target = "nombreUsuario", source = "cliente.nombre")
    @IterableMapping(qualifiedByName = "cunetaToCuentaDto")
    UsuariosDto clienteToClienteDto(Cliente cliente);



}
