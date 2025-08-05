package com.alibaba.security.wukong.interfaces;

import android.content.Context;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import java.util.Map;

/* loaded from: classes3.dex */
public interface IContentRiskPlatform {
    void addAlgoHeartBeat(String str);

    String getCcrcCode();

    Context getContext();

    void inputInferData(Map<String, Object> map);

    void trackLog(TrackLog trackLog, boolean z);
}
