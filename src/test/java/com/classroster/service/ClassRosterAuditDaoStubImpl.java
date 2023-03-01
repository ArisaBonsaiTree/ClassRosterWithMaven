package com.classroster.service;

import com.classroster.dao.ClassRosterAuditDao;
import com.classroster.dao.ClassRosterPersistenceException;

public class ClassRosterAuditDaoStubImpl implements ClassRosterAuditDao {
    @Override
    public void writeAuditEntry(String entry) throws ClassRosterPersistenceException{
        // do nothing
    }
}
