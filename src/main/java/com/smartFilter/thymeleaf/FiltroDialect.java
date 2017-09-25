package com.smartFilter.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import com.smartFilter.thymeleaf.processor.ClassForErrorAttributeTagProcessor;
import com.smartFilter.thymeleaf.processor.MenuAttributeTagProcessor;
import com.smartFilter.thymeleaf.processor.MessageElementTagProcessor;
import com.smartFilter.thymeleaf.processor.OrderElementTagProcessor;
import com.smartFilter.thymeleaf.processor.PaginationElementTagProcessor;

public class FiltroDialect  extends AbstractProcessorDialect {
	public FiltroDialect() {
		super("Igor Filtro", "filtro", StandardDialect.PROCESSOR_PRECEDENCE);
	}

	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		final Set<IProcessor> processadores = new HashSet<>();
		processadores.add(new ClassForErrorAttributeTagProcessor(dialectPrefix));
		processadores.add(new  MessageElementTagProcessor(dialectPrefix));
		processadores.add(new OrderElementTagProcessor(dialectPrefix));
		processadores.add(new PaginationElementTagProcessor(dialectPrefix));
		processadores.add(new MenuAttributeTagProcessor(dialectPrefix));
		return processadores;
	}

}

