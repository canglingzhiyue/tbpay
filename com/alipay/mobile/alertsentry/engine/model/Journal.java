package com.alipay.mobile.alertsentry.engine.model;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class Journal implements Serializable {
    public static final int DEFAULT = -1;
    public static final int NO = 0;
    public static final int YES = 1;
    public long beginTime;
    public long cost;
    public long cpuUsage;
    public int errorCode;
    public long freeMemory;
    public long time;
    public String uid = "";
    public String bizId = "";
    public String traceId = "";
    public String caseId = "";
    public String caseDesc = "";
    public String sceneId = "";
    public int timeout = -1;
    public int success = -1;
    public String errorMessage = "";
    public String result = "";
    public String request = "";
    public String extension = "";
    public String cacheKey = "";
}
