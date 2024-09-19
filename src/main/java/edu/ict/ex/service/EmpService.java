package edu.ict.ex.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ict.ex.mapper.EmpMapper;
import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.DeptEmpVO;
import edu.ict.ex.vo.EmpVO;


//Command 계층 = 비즈니스 로직
@Service
public class EmpService {
	@Autowired
	private EmpMapper empMapper;
	
	public List<EmpVO>getList(){
		System.out.println("getList()..");
		
		return empMapper.getList();
	}


	public int insert(EmpVO emoVO) {
		System.out.println("insert() ..");
		
		return empMapper.insert(emoVO);
		
	}

	public int getTotal() {
		
		return empMapper.getTotalCount();
	}


	public List<EmpVO> getListWithPaging(Criteria cri) {
		
		return empMapper.getListWithPaging(cri);
	}
	
	//조인처리한 결과
	public List<EmpVO> getEmpDeptList() {
		
		return empMapper.getEmpDeptList();
	}
	//조인처리한 결과2
	public List<DeptEmpVO> getDeptEmpList() {
		
		return empMapper.getDeptEmpList();
	}

	
}
