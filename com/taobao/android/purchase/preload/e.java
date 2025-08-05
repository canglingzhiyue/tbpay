package com.taobao.android.purchase.preload;

import android.content.Context;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.pay.PayTask;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.arc;
import tb.bav;
import tb.bbh;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static JSONObject f14768a;
    private static bav b;

    static {
        kge.a(-154098771);
    }

    public static /* synthetic */ JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        f14768a = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ JSONObject a(Map map, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3505e36b", new Object[]{map, context}) : b(map, context);
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        if (b == null) {
            b = new bav("TBBuyResourcePreLoader-config");
        }
        if (b.a() == null) {
            b.a(context, com.taobao.android.buy.internal.a.DEFAULT_AURA_BUY_CONFIG);
        }
        f14768a = null;
        bbh.a(1, 1, 5L, TimeUnit.SECONDS, "TBBuyResourcePreLoader-AlipayExtInfo").execute(new Runnable() { // from class: com.taobao.android.purchase.preload.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                e.a(e.a(null, context));
                arc.a().a("TBBuyResourcePreLoader", "getAlipayExtInfo", "已经预加载好");
            }
        });
    }

    private static JSONObject b(Map<String, String> map, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("35d461ec", new Object[]{map, context}) : PayTask.getPreposeCashierRequestParams(map, context);
    }

    public static AURAPluginContainerNodeModel a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("4dd6302a", new Object[0]);
        }
        bav bavVar = b;
        if (bavVar == null || bavVar.a() == null) {
            arc.a().a("TBBuyResourcePreLoader", "getConfigNodeModel", "没有预加载好");
        }
        bav bavVar2 = b;
        if (bavVar2 != null) {
            return bavVar2.a();
        }
        return null;
    }

    public static JSONObject b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ecf0ff1f", new Object[]{context});
        }
        JSONObject jSONObject = f14768a;
        if (jSONObject != null) {
            return jSONObject;
        }
        arc.a().a("TBBuyResourcePreLoader", "getAlipayExtInfo", "没有预加载好");
        return b(null, context);
    }
}
