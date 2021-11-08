package hello.hellospring.controller;

import lombok.Data;

@Data
public class MemberForm {
    private String userid;
    private String pw;
    private String name;
    private String email;
}
