package com.mudaxian.controller;

import com.mudaxian.pojo.Dicomstudies;
import com.mudaxian.service.DicomstudiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DicomstudiesController {
    @Autowired
    DicomstudiesService dicomstudiesService;

    @GetMapping("/getAll")
    public List<Dicomstudies> getAll() {
        return dicomstudiesService.getAll();
    }

    @GetMapping("/getStudiesByPid/{patientid}")
    public Dicomstudies getStudiesByPid(@PathVariable String patientid) {
        return dicomstudiesService.getStudiesByPid(patientid);
    }

    @GetMapping("/getStudiesByPidAndAccno/[{patientid},{accessionnumber}")
    public Dicomstudies getStudiesByPidAndAccno(@PathVariable String patientid, @PathVariable String accessionnumber) {
        System.out.println("patientid:"+patientid+",accessionnumber:"+accessionnumber);
        return dicomstudiesService.getStudiesByPidAndAccno(patientid, accessionnumber);
    }

    @GetMapping("/deleteStudieBypid/{patientid}")
    public boolean deleteStudieBypid(@PathVariable String patientid) {
        return dicomstudiesService.deleteStudieBypid(patientid);
    }
}
