package com.taobao.android.weex_framework;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.weex.WeexExternalEventCheckException;
import com.taobao.android.weex.n;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import java.util.Map;
import tb.jvq;
import tb.jvr;
import tb.jvs;

@Deprecated
/* loaded from: classes6.dex */
public interface p {

    /* loaded from: classes6.dex */
    public interface a {
        void onNativeEvent(String str, String str2);
    }

    /* loaded from: classes6.dex */
    public interface b {
        void onNativeStateChange(String str, String str2);
    }

    void addEventListener(String str, com.taobao.android.weex_framework.bridge.b bVar);

    void addInstanceEnv(String str, String str2);

    void callNativeUINode(int i, String str, MUSValue[] mUSValueArr);

    boolean canGoBack();

    void destroy();

    void dispatchEvent(MUSEventTarget mUSEventTarget, String str, JSONObject jSONObject);

    @Deprecated
    void dispatchEvent(String str, MUSValue mUSValue);

    void dispatchExternalEvent(n nVar) throws WeexExternalEventCheckException;

    void execute(MUSValue[] mUSValueArr);

    @Deprecated
    void fireEvent(int i, String str, JSONObject jSONObject);

    void fireEventOnNode(int i, String str, JSONObject jSONObject);

    void fireNativeEvent(String str, String str2);

    k getContext();

    Object getExecuteContext();

    int getInstanceId();

    Map<String, Object> getInstanceTags();

    r getMonitorInfo();

    String getNativeState(String str);

    double getPerformance(int i);

    com.taobao.android.weex_framework.ui.h getRenderComponent();

    View getRenderRoot();

    View getRenderView();

    int getRootHeight();

    Object getTag(String str);

    Context getUIContext();

    void goBack();

    void initWithData(byte[] bArr, Uri uri);

    void initWithURL(Uri uri);

    boolean isDestroyed();

    boolean isInvalid();

    boolean isRenderCalled();

    boolean isUIReady();

    void offScreenRendering();

    void onActivityPause();

    void onActivityResult(int i, int i2, Intent intent);

    void onActivityResume();

    void onActivityStart();

    void onActivityStop();

    void onScreenRendering();

    void onViewAppear();

    void onViewDisappear();

    void prepare(byte[] bArr, Map<String, Object> map);

    void refresh(JSONObject jSONObject, Map<String, Object> map);

    void register(JSONArray jSONArray, String str);

    void registerNativeEventCallback(String str, a aVar);

    void registerRenderListener(g gVar);

    void registerReportInfoListener(jvr jvrVar);

    void removeEventListener(String str);

    void render(JSONObject jSONObject, Map<String, Object> map);

    void renderByUrl(String str, String str2, JSONObject jSONObject, Map<String, Object> map);

    void resetContext(Context context);

    void scrollToDecelerate(int i);

    void sendInstanceMessage(String str, JSONObject jSONObject);

    void sendInstanceMessage(String str, String str2, JSONObject jSONObject);

    void setConstrainedSize(com.taobao.android.weex_framework.ui.a aVar);

    void setExecuteContext(Object obj);

    void setGestureConsumptionView(View view);

    void setGestureEventListener(jvq jvqVar);

    @Deprecated
    void setGestureStateListener(com.taobao.android.weex_framework.ui.c cVar);

    void setMonitorDetailDims(String str, String str2);

    void setMonitorDetailTime(String str, long j);

    void setScrollEnabled(boolean z);

    void setTag(String str, Object obj);

    void setWeexScrollListener(jvs jvsVar);

    void updateBaseFontSize(float f);

    void updateNativeState(String str, String str2);

    void updateViewport();
}
