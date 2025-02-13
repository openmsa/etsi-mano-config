package com.ubiqube.etsi.mano.config.properties;

import org.junit.jupiter.api.Test;

class ManoConfigTest {

	@Test
	void test() {
		ManoConfig config = new ManoConfig();
		config.setType("type");
		assert ("type".equals(config.getType()));
	}

}
