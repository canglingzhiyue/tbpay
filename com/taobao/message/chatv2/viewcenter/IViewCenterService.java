package com.taobao.message.chatv2.viewcenter;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.message.chatv2.viewcenter.config.LayoutInfo;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.inner2.Disposable;
import com.taobao.message.lab.comfrm.render.WidgetInterface;

/* loaded from: classes7.dex */
public interface IViewCenterService extends Disposable {
    WidgetInterface<?> createView(int i);

    WidgetInterface<?> createView(LayoutInfo layoutInfo);

    View getView(int i);

    void postEvent(Event event);

    <T> void registerService(Class<T> cls, T t);

    void renderView(WidgetInterface<?> widgetInterface, JSONObject jSONObject);

    void renderView(WidgetInterface widgetInterface, JSONObject jSONObject, ActionDispatcher actionDispatcher);
}
