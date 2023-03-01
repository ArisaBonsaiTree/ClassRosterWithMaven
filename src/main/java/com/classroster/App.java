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

public class App {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        ClassRosterController controller = new ClassRosterController(myView, myService);
        controller.run();
    }
}


