package com.spring.web.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class CommonUtils {

	public static File getFile(String path) throws IOException {
		ClassPathResource resource = new ClassPathResource(path);
		return resource.getFile();
	}

	public static <T> T getObjectFromPath(String path, Class<T> clazz) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		T objects = null;
		try {
			objects = mapper.readValue(getFile(path), clazz);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objects;
	}

	public static <T> List<T> mapJsonFileToList(String path, Class<T> elementType) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		CollectionType typeReference = mapper.getTypeFactory().constructCollectionType(ArrayList.class, elementType);
		try {
			return mapper.readValue(getFile(path), typeReference);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
}
