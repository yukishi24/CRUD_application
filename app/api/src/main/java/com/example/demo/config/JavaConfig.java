package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

import com.example.demo.form.RecordValueReader;

/**
 * modelMapperを使用する為のConfig Javaクラス
 * 
 * @author yukishi
 *
 */
@Configuration
public class JavaConfig {
	public ModelMapper modelMapper() {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().addValueReader(new RecordValueReader());
		return mapper;
	}
}
