package com.taobao.infoflow.protocol.subservice.biz;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes7.dex */
public interface IFaceDetectorService extends ISubService {
    public static final String SERVICE_NAME = "IFaceDetectorService";

    void setFirstFrameRendered();

    void startFaceDetector(View view, JSONObject jSONObject, JSONObject jSONObject2);

    void stopFaceDetector();
}
