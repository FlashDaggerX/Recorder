package com.github.fdx.recorder;

@FunctionalInterface
public interface VaridicFunction {
	void call(Object... args);
}
