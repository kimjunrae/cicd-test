package com.example.doosan.demo.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubCodeVO extends BaseVO {
	String groupId;
	
	String subGroupId;
	
	String subCodeGroupId;
	
	String code;
	
	String value;
	
	String description;
}