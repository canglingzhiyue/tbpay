package com.taobao.mytaobao.basement.Bridge;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.MTBBasementContainerView;
import com.taobao.mytaobao.basement.weex.BasementWeexView;
import com.taobao.mytaobao.ut.c;
import com.taobao.tao.log.TLog;
import java.util.UUID;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f18310a;
    public static String b;
    public static String e;
    public static String f;
    public static String g;
    public static String i;

    static {
        kge.a(-571604712);
        f18310a = "notifyMyTaoBaoFloorChange";
        b = "notifyMyTaoBaoRefresh";
        e = "main";
        f = "basement";
        g = com.taobao.android.weex_framework.util.a.ATOM_EXT_floor;
        i = "notifyQuickBackFirstPage";
    }

    public static void a(MTBBasementContainerView mTBBasementContainerView, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f39e99f", new Object[]{mTBBasementContainerView, new Boolean(z), new Boolean(z2)});
            return;
        }
        JSONObject a2 = a();
        a2.put(g, (Object) (z ? f : e));
        if (z) {
            a2.put("isDirty", (Object) Boolean.valueOf(z2));
        }
        c.a("Page_MyTaobao", z ? "Page_MyTaobao_slide-transition" : "Page_MyTaobao_BackToMyTaobaoFromBasement", "a2141.7631743.67.1", (String) null, a2);
        TLog.loge(com.taobao.mytaobao.basement.monitor.b.MODULE_NAME, "native invoke notifyMyTaoBaoFloorChange");
        a(mTBBasementContainerView, f18310a, a2);
    }

    public static void a(MTBBasementContainerView mTBBasementContainerView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8966127", new Object[]{mTBBasementContainerView, str, jSONObject});
        } else if (mTBBasementContainerView == null) {
        } else {
            if (jSONObject == null) {
                jSONObject = a();
            }
            BasementWeexView weexView = mTBBasementContainerView.getWeexView();
            if (weexView == null) {
                return;
            }
            a(weexView, str, jSONObject);
        }
    }

    public static void a(BasementWeexView basementWeexView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("565e1014", new Object[]{basementWeexView, str, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = a();
        }
        basementWeexView.dispatchEvent(0, str, jSONObject);
        MtbBasementWeexApiPlugin.commitWeexEventTrace(str, jSONObject);
    }

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uuid", (Object) UUID.randomUUID());
        return jSONObject;
    }
}
