package com.example.web;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@SelectClasspathResource("fdd/web")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
public class WebMeTest {
}
