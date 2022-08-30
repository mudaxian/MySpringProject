package com.mudaxian.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dicomstudies {
    private String studyinstanceuid;
    private String studydate;
    private String studytime;
    private String studynumber;
    private String modality;
    private String studydescription;
    private String accessionnumber;
    private String referphysician;
    private String performingphysicia;
    private String performingphysician;
    private String physicianreadingst;
    private String physicianreadingstudy;
    private String patientsage;
    private String patientsweight;
    private String patientid;
    private BigDecimal accesstime;
    private String backupstatus;
    private Byte[] reportfinding;
    private String reportimp;
    private BigDecimal reportstatus;
    private BigDecimal teachfile;
    private String havestudywl;
    private String burnorprint;
    private String savemark;
    private String site;
    private String bodysite;
    private int status;
    private String aistatus;
    private String finalstudytime;
    private String syncompletetime;
}
