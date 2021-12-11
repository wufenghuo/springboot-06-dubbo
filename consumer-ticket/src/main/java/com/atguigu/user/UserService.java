package com.atguigu.user;

import com.atguigu.ticket.service.TicketService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @DubboReference
    TicketService ticketService;

    public void hello(){
        System.out.println(ticketService.getTicket());
        System.out.println("aaa");
    }
}
