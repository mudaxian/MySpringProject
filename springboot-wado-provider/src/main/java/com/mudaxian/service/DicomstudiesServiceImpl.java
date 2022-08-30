package com.mudaxian.service;

import com.mudaxian.dao.DicomstudiesDao;
import com.mudaxian.pojo.Dicomstudies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicomstudiesServiceImpl implements DicomstudiesService{

    @Autowired
    DicomstudiesDao dicomstudiesDao;

    @Override
    public List<Dicomstudies> getAll() {
        return dicomstudiesDao.getAll();
    }

    @Override
    public Dicomstudies getStudiesByPid(String patientid) {
        return dicomstudiesDao.getStudiesByPid(patientid);
    }

    @Override
    public Dicomstudies getStudiesByPidAndAccno(String patientid, String accessionnumber) {
        return dicomstudiesDao.getStudiesByPidAndAccno(patientid, accessionnumber);
    }

    @Override
    public boolean deleteStudieBypid(String patientid) {
        return dicomstudiesDao.deleteStudieBypid(patientid);
    }
}
