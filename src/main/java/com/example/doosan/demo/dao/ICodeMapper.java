package com.example.doosan.demo.dao;

import com.example.doosan.demo.vo.CodeVO;
import com.example.doosan.demo.vo.SubCodeVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICodeMapper {
	List<CodeVO> getCodes(String groupId);
	
	List<SubCodeVO> getSubCodes(@Param("groupId") String groupId, @Param("subGroupId") String subGroupId);

	CodeVO getCode(@Param("groupId") String groupId, @Param("code") String code);
}
