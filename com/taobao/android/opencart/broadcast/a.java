package com.taobao.android.opencart.broadcast;

import android.content.Context;
import android.view.View;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.alo;
import tb.alq;
import tb.alr;
import tb.alu;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
            return;
        }
        alu aluVar = new alu(new alr("iCart", "cart").a(context));
        HashMap hashMap = new HashMap();
        hashMap.put("bizId", "iCart");
        hashMap.put("eventName", "cartRefreshData");
        if (map != null) {
            hashMap.put("detail", map);
        }
        aluVar.b("broadcast", "dispatchEvent", new alq().a((View) null), hashMap, new alo() { // from class: com.taobao.android.opencart.broadcast.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                }
            }
        });
    }
}
