package com.smartFilter.controller;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import com.smartFilter.model.Grupo;

public class GrupoConverter implements Converter<String, Grupo>{

	@Override
	public Grupo convert(String codigo) {
		if (!StringUtils.isEmpty(codigo)){
			Grupo grupo = new Grupo();
			grupo.setCodigo(Long.valueOf(codigo));
			return grupo;
		}
		return null;
	}

}

