package com.taobao.infoflow.protocol.subservice.biz;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes7.dex */
public interface IVideoCardAnimationService extends ISubService {
    public static final String SERVICE_NAME = "VideoCardAnimationService";

    boolean enableShow();

    float getAspectRatio();

    JSONObject getExposureParam();

    String getFirstFrameImagePath();

    String getLocalVideoPath();

    int getTimeOut();

    boolean isMeasureSuccess();

    void recordFatigue(String str);

    void setMeasureState(boolean z);
}
