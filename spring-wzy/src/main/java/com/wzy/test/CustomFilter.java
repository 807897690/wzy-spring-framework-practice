package com.wzy.test;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @ClassName CustomFilter
 * @Desc TODO
 * @Author Administrator
 * @Date 2019/6/27 14:37
 **/
public class CustomFilter implements TypeFilter {
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		String className = metadataReader.getClassMetadata().getClassName();
		System.out.println("-------------->"+className);
		if(className.contains("e")) {
			return true;
		}
		return false;
	}
}
