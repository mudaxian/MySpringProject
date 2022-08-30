package com.mudaxian.service;

import com.mudaxian.pojo.Dicomstudies;

import java.util.List;

public interface DicomstudiesService {
    List<Dicomstudies> getAll();

    Dicomstudies getStudiesByPid(String patientid);

    Dicomstudies getStudiesByPidAndAccno(String patientid, String accessionnumber);

    boolean deleteStudieBypid(String patientid);
}
