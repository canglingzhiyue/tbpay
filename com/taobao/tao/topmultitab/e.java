package com.taobao.tao.topmultitab;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.List;
import tb.kge;
import tb.ldf;
import tb.sqg;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f21155a;

    static {
        kge.a(-104647440);
        f21155a = 0;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        ldf.d("webViewOptimizationTrigger", "闲时触发预加载");
        JSONObject d = sqg.d();
        if (d == null) {
            return;
        }
        b(sqg.b(d));
        f21155a++;
    }

    public static void a(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{list});
            return;
        }
        ldf.d("webViewOptimizationTrigger", "reTrigger");
        if (f21155a == 0) {
            return;
        }
        b(list);
        f21155a++;
    }

    public static void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        ldf.d("webViewOptimizationTrigger", "reTriggerByIndex");
        if (f21155a == 0 || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
            return;
        }
        b(jSONObject2);
        f21155a++;
    }

    private static void b(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{list});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            JSONObject jSONObject = list.get(i).getJSONObject("content");
            if (jSONObject != null) {
                b(jSONObject);
            }
        }
    }

    private static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{jSONObject});
            return;
        }
        boolean booleanValue = jSONObject.getBooleanValue("isNeedPreRender");
        String string = jSONObject.getString("type");
        if (!booleanValue) {
            return;
        }
        IHomeSubTabController b = c.a().b(string);
        if (!(b instanceof com.taobao.infoflow.a)) {
            return;
        }
        ((com.taobao.infoflow.a) b).a();
    }
}
