package com.ubiqube.etsi.mano.config.properties;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ManoConfigTest {

	@Test
	void test() {
		ManoConfig config = new ManoConfig();
		config.setType("type");
		assertTrue("type".equals(config.getType()));
	}

}
