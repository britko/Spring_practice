package hello.hellospring.controller;

import lombok.Data;

@Data
public class MemberForm {
    private String name;
    private String pw;
    private String email;
}
