package com.wzy.service;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName ExampleImportSelecor
 * @Desc TODO
 * @Author Administrator
 * @Date 2019/6/28 10:26
 **/
public class ExampleImportSelecor implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		//返回全类名bean
		return new String[]{"com.wzy.service.Example5", "com.wzy.service.Example6"};
	}
}
