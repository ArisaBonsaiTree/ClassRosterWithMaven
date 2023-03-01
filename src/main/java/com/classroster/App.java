package com.classroster;

import com.classroster.controller.ClassRosterController;
import com.classroster.dao.ClassRosterAuditDao;
import com.classroster.dao.ClassRosterAuditDaoFileImpl;
import com.classroster.dao.ClassRosterDao;
import com.classroster.dao.ClassRosterDaoFileImpl;
import com.classroster.service.ClassRosterServiceLayer;
import com.classroster.service.ClassRosterServiceLayerImpl;
import com.classroster.ui.ClassRosterView;
import com.classroster.ui.UserIO;
import com.classroster.ui.UserIOConsoleImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassRosterController controller = ctx.getBean("controller", ClassRosterController.class);
        controller.run();
    }
}


