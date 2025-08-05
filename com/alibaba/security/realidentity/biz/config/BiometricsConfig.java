package com.alibaba.security.realidentity.biz.config;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public class BiometricsConfig implements Serializable {
    public static final int DEFAULT_RECAP_MODE_ONLINE = 1;
    public int actionCount;
    public List<Integer> bioSteps;
    public String bizConf;
    public boolean isSessionless;
    public boolean needOriginalImage;
    public boolean reachBusinessRetryLimit;
    public String secToken;
    public boolean stepAdjust;
    public boolean stepNav = false;
    public boolean stepResult = false;
    public String userName = "";
    public int[] strategy = null;
    public boolean isLessImageMode = true;
    public int bigImageSize = 280;
    public boolean isDetectWrongAction = true;
    public boolean isDetectOcclusion = true;
    public float motionBlurThreshold = 1.0f;
    public int timeOut = 40;
    public int reflectILThreshold = 400;
    public boolean isRecapEnable = false;
    public int recapMode = 1;
    public float recapThreshold = 60.0f;
    public boolean needDisplayWaitingView = false;
    public int actionWhileCheckFail = -1;
    public int[] strategyWhileCheckFail = null;
    public int imageCount = 1;
    public int imageIntervals = 250;
    public int bgDetectTimeIntervals = -1;
    public int bgDetectColorThreshold = -1;
    public boolean needSuccessVideo = false;
    public boolean needFailVideo = false;
    public byte[] licenseData = null;
    public byte[] licenseTimeData = null;
}
