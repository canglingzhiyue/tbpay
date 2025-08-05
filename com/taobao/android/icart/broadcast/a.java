package com.taobao.android.icart.broadcast;

import android.content.Intent;
import android.view.View;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import tb.aat;
import tb.abf;
import tb.adz;
import tb.aey;
import tb.alo;
import tb.alq;
import tb.bbz;
import tb.bex;
import tb.cuo;
import tb.jqg;
import tb.jqi;
import tb.kge;
import tb.krl;
import tb.krm;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bbz f12771a;
    private abf<Intent> b = new abf<>();

    static {
        kge.a(2061405046);
    }

    public static /* synthetic */ bbz a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("394fcb6f", new Object[]{aVar}) : aVar.f12771a;
    }

    public static /* synthetic */ abf b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (abf) ipChange.ipc$dispatch("2af8fac3", new Object[]{aVar}) : aVar.b;
    }

    public a(bbz bbzVar) {
        this.f12771a = bbzVar;
        this.b.a(new krm(this.f12771a));
        this.b.a(new aey(this.f12771a));
        this.b.a(new krl(this.f12771a));
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bizId", "iCart");
        hashMap.put("eventName", "cartRefreshData");
        this.f12771a.T().b("broadcast", "addEventListener", new alq().a((View) null), hashMap, new alo() { // from class: com.taobao.android.icart.broadcast.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                } else if (executeResult != null) {
                    jqg.b("iCart", "CartRefreshMagabilityBroadcast addEventListener listener type=" + executeResult.f() + ",statusCode=" + executeResult.d() + ",data=" + executeResult.e());
                    Map<String, Object> e = executeResult.e();
                    if (e == null) {
                        return;
                    }
                    Object obj = e.get("detail");
                    Map<Object, ? extends Object> hashMap2 = obj instanceof Map ? (Map) obj : new HashMap<>();
                    if ("fail".equals(e.get("result"))) {
                        return;
                    }
                    if (jqi.a("iCart", "compensatingCheckResultOnRefreshBroadcast", true) && "fail".equals(hashMap2.get("result"))) {
                        jqg.b("CartRefreshMagabilityBroadcast", "补偿判断result=fail");
                        return;
                    }
                    cuo.INSTANCE.a(hashMap2);
                    if (a.a(a.this).u() == null || Objects.equals(a.a(a.this).P(), String.valueOf(hashMap2.get("cartInstanceId")))) {
                        return;
                    }
                    a.a(a.this).v().c();
                    bex.c(a.a(a.this), "Page_ShoppingCart_Notification", "mega=true");
                    a.a(a.this).v().c();
                    Intent intent = new Intent();
                    for (Object obj2 : hashMap2.keySet()) {
                        intent.putExtra(String.valueOf(obj2), String.valueOf(hashMap2.get(obj2)));
                    }
                    if (a.b(a.this).a((abf) intent)) {
                        return;
                    }
                    adz S = a.a(a.this).S();
                    if (a.a(a.this).u().isResumed() && (!(S instanceof aat) || ((aat) S).E())) {
                        return;
                    }
                    a.a(a.this).n().o().i(true);
                }
            }
        });
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bizId", "iCart");
        hashMap.put("eventName", "cartRefreshData");
        this.f12771a.T().b("broadcast", "removeEventListener", new alq().a((View) null), hashMap, new alo() { // from class: com.taobao.android.icart.broadcast.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                } else {
                    jqg.b("iCart", "CartRefreshMagabilityBroadcast removeEventListener");
                }
            }
        });
    }
}
