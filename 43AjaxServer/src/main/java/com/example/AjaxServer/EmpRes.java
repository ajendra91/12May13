package com.example.AjaxServer;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmpRes <T>{

    public T data;
    public String status;
}
