package bitcamp.pms.service;

import java.util.List;

import bitcamp.pms.vo.Member;

public interface MemberService {
  void add(Member member);
  void delete(int no);
  Member retrieveByNo(int no);
  Member retrieveByEmail(String email);
  List<Member> list(int pageNo, int pageSize);
  void change(Member member);
  boolean exist(String email, String password);
  int countPage(int pageSize);
}

