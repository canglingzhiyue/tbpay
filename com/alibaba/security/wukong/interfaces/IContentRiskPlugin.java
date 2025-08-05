package com.alibaba.security.wukong.interfaces;

import android.content.Context;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import java.util.Map;

/* loaded from: classes3.dex */
public interface IContentRiskPlugin {
    Map<String, Object> configInfo();

    String configType();

    IContentRiskPlatform getPlatform();

    String name();

    boolean onActivate(CcrcService.Config config);

    void onCreate(Context context);

    void onDeActivate();

    void onDetectSample(CCRCRiskSample cCRCRiskSample);

    boolean onInputConfig(Map<String, Object> map);

    String version();
}
