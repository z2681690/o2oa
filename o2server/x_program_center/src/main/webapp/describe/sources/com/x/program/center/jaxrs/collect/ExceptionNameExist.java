package com.x.program.center.jaxrs.collect;

import java.util.Objects;

import com.x.base.core.project.exception.PromptException;

class ExceptionNameExist extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	ExceptionNameExist(String name) {
		super("用户:" + Objects.toString(name) + "已注册.");
	}
}