package com.alibaba.security.realidentity.biz.start.model;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class StartStatusResult implements Serializable {
    public String biz;
    public boolean gradeCertified;
    public boolean reviewStatus;
    public AuditStatus rpAuditStatus;

    /* loaded from: classes3.dex */
    public static class AuditStatus implements Serializable {
        public int code;
        public String desc;
        public String name;
    }
}
