package com.taobao.android.fluid.framework.deprecated.message.module.proxy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import java.io.Serializable;
import java.util.Map;
import tb.kge;
import tb.slw;
import tb.sma;
import tb.spy;
import tb.spz;

/* loaded from: classes5.dex */
public class ShortVideoTNodeModuleProxy implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShortVideoTNodeModuleProxy";

    static {
        kge.a(1551449236);
        kge.a(1028243835);
    }

    public static void sendMessage(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77e49d9", new Object[]{cVar});
            return;
        }
        JSON json = cVar.b;
        if (!(json instanceof JSONObject)) {
            return;
        }
        Object H = cVar.f19938a.H();
        if (!(H instanceof sma)) {
            return;
        }
        sma smaVar = (sma) H;
        slw slwVar = null;
        if (cVar.f && cVar.c != null) {
            slwVar = new slw(cVar);
        }
        spy spyVar = new spy((Map) json, slwVar);
        smaVar.sendMessage(spyVar);
        spz.c(TAG, "新架构 TNode 页面发送消息：" + spyVar);
    }
}
