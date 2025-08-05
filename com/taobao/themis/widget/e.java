package com.taobao.themis.widget;

import com.alibaba.fastjson.JSONObject;
import kotlin.Metadata;
import tb.hij;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/widget/IWidgetControllerExtension;", "Lcom/taobao/themis/kernel/extension/controller/IControllerExtension;", "getMonitorData", "", "callback", "Lcom/taobao/themis/widget/IWidgetControllerExtension$DataCallback;", "DataCallback", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface e extends hij {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/taobao/themis/widget/IWidgetControllerExtension$DataCallback;", "", "onSuccess", "", "data", "Lcom/alibaba/fastjson/JSONObject;", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    void a(a aVar);
}
