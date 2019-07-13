package com.wzy.class3;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author wzy
 * @title: MyImportSelector
 * @description: ImportSelector动态的向spring容器中注入bean
 * @date 2019/7/13 10:44
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{IndexDemo.class.getName()};
	}
}
