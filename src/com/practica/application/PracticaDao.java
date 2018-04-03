package com.practica.application;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practica.dao.coordinacion.map.CargoMapper;
import com.practica.dao.coordinacion.map.EmpresaMapper;
import com.practica.dao.coordinacion.map.HojaVidaMapper;
import com.practica.dao.coordinacion.map.PracticaEstudianteMapper;
import com.practica.dao.coordinacion.map.ProgramaAcademicoMapper;
import com.practica.dao.general.map.PersonaMapper;
import com.practica.dao.general.map.UsuarioMapper;

public class PracticaDao {
	
	private static PracticaDao current = null;
	
	private PersonaMapper 			 personaMapper;
	private UsuarioMapper 			 usuarioMapper;
	private CargoMapper   			 cargoMapper;
	private HojaVidaMapper 			 hojaVidaMapper;
	private PracticaEstudianteMapper pracEstudianteMapper;
	private ProgramaAcademicoMapper  progAcademicoMapper;
	private EmpresaMapper 			 empresaMapper;

	private synchronized static void createInstance() {
		if (current == null) {
			current = new PracticaDao();
		}
	}

	public static PracticaDao getInstance() {
		if (current == null)
			createInstance();
		return current;
	}

	protected PracticaDao() {
		try{
			ApplicationContext beanFactoryMyBatis = new ClassPathXmlApplicationContext("/spring-mybatis-config.xml");
			inicializarMappers(beanFactoryMyBatis);
		}catch(Exception e){
			e.printStackTrace();
			e.getMessage();
		}
	}
	// inicializar Mappers MyBatis
	public void inicializarMappers(BeanFactory beanFactoryMyBatis) {
		personaMapper = (PersonaMapper) beanFactoryMyBatis.getBean("personaMapper");
		usuarioMapper = (UsuarioMapper) beanFactoryMyBatis.getBean("usuarioMapper");
		cargoMapper = (CargoMapper) beanFactoryMyBatis.getBean("cargoMapper");
		hojaVidaMapper = (HojaVidaMapper) beanFactoryMyBatis.getBean("hojaVidaMapper");
		pracEstudianteMapper = (PracticaEstudianteMapper) beanFactoryMyBatis.getBean("practicaEstuMapper");
		progAcademicoMapper = (ProgramaAcademicoMapper) beanFactoryMyBatis.getBean("programaAcadMapper");
		empresaMapper = (EmpresaMapper) beanFactoryMyBatis.getBean("empresaMapper");
	}

	public PersonaMapper getPersonaMapper() {
		return personaMapper;
	}

	public void setPersonaMapper(PersonaMapper personaMapper) {
		this.personaMapper = personaMapper;
	}

	public UsuarioMapper getUsuarioMapper() {
		return usuarioMapper;
	}

	public void setUsuarioMapper(UsuarioMapper usuarioMapper) {
		this.usuarioMapper = usuarioMapper;
	}

	public CargoMapper getCargoMapper() {
		return cargoMapper;
	}

	public void setCargoMapper(CargoMapper cargoMapper) {
		this.cargoMapper = cargoMapper;
	}

	public HojaVidaMapper getHojaVidaMapper() {
		return hojaVidaMapper;
	}

	public void setHojaVidaMapper(HojaVidaMapper hojaVidaMapper) {
		this.hojaVidaMapper = hojaVidaMapper;
	}

	public PracticaEstudianteMapper getPracEstudianteMapper() {
		return pracEstudianteMapper;
	}

	public void setPracEstudianteMapper(PracticaEstudianteMapper pracEstudianteMapper) {
		this.pracEstudianteMapper = pracEstudianteMapper;
	}

	public ProgramaAcademicoMapper getProgAcademicoMapper() {
		return progAcademicoMapper;
	}

	public void setProgAcademicoMapper(ProgramaAcademicoMapper progAcademicoMapper) {
		this.progAcademicoMapper = progAcademicoMapper;
	}

	public EmpresaMapper getEmpresaMapper() {
		return empresaMapper;
	}

	public void setEmpresaMapper(EmpresaMapper empresaMapper) {
		this.empresaMapper = empresaMapper;
	}

}