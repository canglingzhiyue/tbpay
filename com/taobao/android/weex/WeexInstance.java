package com.taobao.android.weex;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.taobao.android.weex.config.WeexApmCustomData;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes6.dex */
public interface WeexInstance extends Serializable {
    void addInstanceListener(h hVar);

    boolean canGoBack();

    void destroy();

    void dispatchEvent(WeexEventTarget weexEventTarget, String str, WeexValue weexValue);

    void dispatchExternalEvent(n nVar) throws WeexExternalEventCheckException;

    void dispatchNodeEvent(int i, String str, WeexValue weexValue);

    void execute(byte[] bArr, String str);

    Context getContext();

    <T> T getExtend(Class<T> cls);

    int getInstanceId();

    WeexInstanceStatus getInstanceStatus();

    Map<String, Object> getInstanceTags();

    View getRootView();

    Object getTag(String str);

    void goBack();

    void initWithData(byte[] bArr, String str);

    void initWithEmpty();

    void initWithURL(String str);

    void onActivityPause();

    void onActivityResult(int i, int i2, Intent intent);

    void onActivityResume();

    void onActivityStart();

    void onActivityStop();

    void onViewAppear();

    void onViewDisappear();

    void registerModule(String str, Class<? extends WeexModule> cls);

    void removeInstanceListener(h hVar);

    void render(WeexValue weexValue);

    WeexValue requireModule(String str);

    void resetContext(Context context);

    void setApmAware(boolean z);

    void setInstanceData(WeexValue weexValue);

    void setTag(String str, Object obj);

    void setWeexApmCustomData(WeexApmCustomData weexApmCustomData);

    void updateBaseFontSize(float f);

    void updateContainerSize(float f, float f2);

    void updateInstanceData(String str, String str2, WeexValue weexValue);

    void updateInstanceEnv(String str, WeexValue weexValue);

    void updateRTL(boolean z);

    void updateRenderEnvironments(o oVar);
}
