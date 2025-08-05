package com.taobao.android;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.alp;
import tb.dmq;
import tb.kge;
import tb.ruk;

/* loaded from: classes.dex */
public class z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1831797713);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        if (application != null) {
            com.alibaba.ability.e.a(application.getApplicationContext());
        }
        com.alibaba.ability.d.a(new com.alibaba.ability.c() { // from class: com.taobao.android.z.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ability.c
            public void a(Application application2, HashMap<String, Object> hashMap2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f47168dc", new Object[]{this, application2, hashMap2});
                    return;
                }
                com.taobao.android.tbabilitykit.n.a();
                dmq.a(new ruk<kotlin.t>() { // from class: com.taobao.android.z.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.t, java.lang.Object] */
                    @Override // tb.ruk
                    /* renamed from: invoke */
                    public /* synthetic */ kotlin.t mo2427invoke() {
                        IpChange ipChange3 = $ipChange;
                        return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("5a980813", new Object[]{this}) : a();
                    }

                    public kotlin.t a() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            return (kotlin.t) ipChange3.ipc$dispatch("bc9a1777", new Object[]{this});
                        }
                        alp.a();
                        return null;
                    }
                });
            }
        }, null, null);
        com.taobao.android.tbabilitykit.n.c();
    }
}
