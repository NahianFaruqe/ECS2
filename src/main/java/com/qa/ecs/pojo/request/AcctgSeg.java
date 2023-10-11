package com.qa.ecs.pojo.request;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "deptId", "vertical" })

public class AcctgSeg {

	@JsonProperty("deptId")
	private String deptId;
	@JsonProperty("vertical")
	private String vertical;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("deptId")
	public String getDeptId() {
		return deptId;
	}

	@JsonProperty("deptId")
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	@JsonProperty("vertical")
	public String getVertical() {
		return vertical;
	}

	@JsonProperty("vertical")
	public void setVertical(String vertical) {
		this.vertical = vertical;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}