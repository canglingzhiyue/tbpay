package com.taobao.weex.remote;

import com.alibaba.fastjson.JSONArray;
import com.taobao.weex.common.WXRefreshData;
import com.taobao.weex.dom.CSSShorthand;
import com.taobao.weex.h;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public interface IWXBridgeManager {

    /* loaded from: classes9.dex */
    public enum BundType {
        Vue,
        Rax,
        Others
    }

    void bindMeasurementToRenderObject(long j);

    Object callModuleMethod(String str, String str2, String str3, JSONArray jSONArray);

    void callback(String str, String str2, Object obj, boolean z);

    void createInstance(String str, h hVar, Map<String, Object> map, String str2);

    void destroyInstance(String str);

    void fireEventOnNode(String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2);

    long[] getRenderFinishTime(String str);

    void initScriptsFramework(String str);

    void markDirty(String str, String str2, boolean z);

    void onInteractionTimeUpdate(String str);

    void post(Runnable runnable);

    void refreshInstance(String str, WXRefreshData wXRefreshData);

    void registerComponents(List<Map<String, Object>> list);

    void registerModules(Map<String, Object> map);

    void restart();

    void setMargin(String str, String str2, CSSShorthand.EDGE edge, float f);

    void setPadding(String str, String str2, CSSShorthand.EDGE edge, float f);

    void setPosition(String str, String str2, CSSShorthand.EDGE edge, float f);

    void setStyleHeight(String str, String str2, float f);

    void setStyleWidth(String str, String str2, float f);
}
