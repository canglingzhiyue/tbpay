package com.taobao.android.live.plugin.proxy.input;

import android.content.Context;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONObject;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import java.util.List;
import tb.ffg;
import tb.gwy;
import tb.plh;

/* loaded from: classes6.dex */
public interface IInputProxy extends IProxy {
    public static final String KEY = "IInputProxy";

    void absInputFrameOnCreateView(Object obj, ViewStub viewStub);

    void absInputFrameOnDestroy(Object obj);

    void atmosphereInstanceDestroy(a aVar);

    void atmosphereInstanceGetAtmosphereRes(a aVar, String str, String str2, String str3);

    List<JSONObject> atmosphereInstanceGetEffectResConfig(a aVar, String str);

    HashMap<Integer, String> atmosphereInstanceGetFansLightMap(a aVar);

    HashMap<String, JSONObject> atmosphereInstanceGetStickerIdMatchMap(a aVar);

    HashMap<String, JSONObject> atmosphereInstanceGetStickerKeyMatchMap(a aVar);

    void atmosphereInstanceProcessEffectRes(a aVar, JSONObject jSONObject, gwy gwyVar);

    JSONObject convertToPosition(Context context, JSONObject jSONObject);

    JSONObject convertToPositionStaticResource(Context context, JSONObject jSONObject);

    ffg createAtmosphereManager();

    JSONObject getAtmosphereResItem(a aVar, String str, String str2, String str3);

    JSONObject getAtmosphereResItem(String str, String str2, String str3);

    Object getInputFrame3AndSetSendMessageListener(Object obj, plh plhVar);

    Class<? extends BaseFrame> getInputFrame3Class();

    BaseFrame getMemberGuideFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar);

    List<JSONObject> getStickerConfig(a aVar);

    Class<? extends BaseFrame> getUserRecExpFrameClass();

    void iInputFrameHideContentView(Object obj);

    void iInputFrameHideKeyBoard(Object obj);

    void iInputFrameShowContentView(Object obj, int i);
}
