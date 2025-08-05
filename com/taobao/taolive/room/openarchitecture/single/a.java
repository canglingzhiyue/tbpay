package com.taobao.taolive.room.openarchitecture.single;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.sdk.controller.e;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import java.util.Map;

/* loaded from: classes8.dex */
public interface a {
    Context getContext();

    e getGlobalContext();

    TBLiveRecEngineV2.RecModel getRecModel();

    TBLiveBizDataModel getTBLiveBizDataModel();

    String getUniStr();

    Map<String, String> getUtParams();

    void initParams(Object obj);

    void mute(boolean z);

    void needPresentAvatarPage(Map<String, String> map);

    void onDestroy();

    void onDidAppear();

    void onDidDisappear();

    void onPause();

    void onResume();

    void onStop(boolean z);

    void onWillAppear();

    void onWillDisappear();

    void reportRequest();

    void retryVideo();

    void setContainerOffset(JSONObject jSONObject);

    void setSmallWindowClickListener(ISmallWindowStrategy iSmallWindowStrategy);

    void updateUserTrackData(Map<String, String> map);
}
