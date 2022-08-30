package com.mudaxian.dao;

import com.mudaxian.pojo.Dicomstudies;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DicomstudiesDao {
    List<Dicomstudies> getAll();

    Dicomstudies getStudiesByPid(String patientid);

    Dicomstudies getStudiesByPidAndAccno(String patientid, String accessionnumber);

    boolean deleteStudieBypid(String patientid);
}
