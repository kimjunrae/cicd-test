package com.example.doosan.demo.service;

import com.example.doosan.demo.dao.ICodeMapper;
import com.example.doosan.demo.vo.CodeVO;
import com.example.doosan.demo.vo.SubCodeVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CodeService {
	@Autowired
	@Resource(name = "doosanSession")
	private SqlSessionTemplate sqlSession;

	public List<CodeVO> getCodes(String groupId) {
		ICodeMapper dao = sqlSession.getMapper(ICodeMapper.class);
		return dao.getCodes(groupId);
	}

	public List<SubCodeVO> getSubCodes(String groupId, String subGroupId) {
		ICodeMapper dao = sqlSession.getMapper(ICodeMapper.class);
		return dao.getSubCodes(groupId, subGroupId);
	}

	public CodeVO getCode(String groupId, String code) {
		ICodeMapper dao = sqlSession.getMapper(ICodeMapper.class);

		return dao.getCode(groupId, code);
	}
}