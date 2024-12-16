package com.MiniProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import java.util.Optional;

//import com.MiniProject.entityClasses.Members;
import com.MiniProject.Repository.MemberRepository;
import com.MiniProject.entityClasses.Members;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;
	/*
	 * public void saveMember(Members members) { memberRepository.save(members); }
	 */
	/*
	 * // Method to fetch member by ID only public Optional<Members>
	 * getMemberById(Long id) { return memberRepository.findById(id); // Retrieve
	 * member by ID }
	 */

	// manually saving object/data into the db

	public List<Members> getttingData() {
		return memberRepository.findAll();
	}
	
	
	public Members savingData(Members m) {

		return memberRepository.save(m);
	}

	// Delete Record
    public void deleteRecord(Long id)
    {
    	if(memberRepository.existsById(id))
    	{
    		memberRepository.deleteById(id);
    	}
    	else
    	{
    		System.out.println("ID you Enter is not available in the Database...");
    	}
    }
    
    //getting byname
    public List<Members> gettingData(String name)
    {
    	return memberRepository.findByAddress(name);
    }
    
    
    
}
