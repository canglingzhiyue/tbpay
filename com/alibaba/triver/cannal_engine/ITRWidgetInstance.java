package com.alibaba.triver.cannal_engine;

import android.support.v4.app.Fragment;
import android.view.View;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.event.WidgetRenderContainer;
import com.alibaba.triver.cannal_engine.scene.WidgetStartParams;

/* loaded from: classes3.dex */
public interface ITRWidgetInstance extends Proxiable {
    void destroy();

    App getApp();

    View getRootView();

    JSONObject getWidgetMonitor();

    TRWidgetInstance.h getWidgetState();

    void onAttach(JSONObject jSONObject);

    void onDetach(JSONObject jSONObject);

    void onVisibilityChanged(int i);

    void pause();

    void registerWidgetExceptionListener(TRWidgetInstance.c cVar);

    void registerWidgetInitListener(TRWidgetInstance.d dVar);

    void registerWidgetJSLogListener(TRWidgetInstance.e eVar);

    void registerWidgetMonitorListener(TRWidgetInstance.f fVar);

    void registerWidgetRenderListener(TRWidgetInstance.g gVar);

    void render(WidgetStartParams widgetStartParams);

    void render(WidgetStartParams widgetStartParams, TRWidgetInstance.a aVar);

    void resume();

    void setFragment(Fragment fragment);

    void setRootContainer(WidgetRenderContainer widgetRenderContainer);

    void stop();

    void updateSize(int i, int i2);

    void updateSize(JSONObject jSONObject);
}
