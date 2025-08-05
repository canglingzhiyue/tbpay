package com.android.taobao.safeclean;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cjb;
import tb.kge;

/* loaded from: classes3.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private Map<String, List<d>> f6403a = new HashMap();

    static {
        kge.a(1610635439);
        kge.a(687885549);
    }

    /* renamed from: lambda$SxOx-PyApFnUtkOkECi9rshU41g */
    public static /* synthetic */ void m616lambda$SxOxPyApFnUtkOkECi9rshU41g(i iVar, String str, Map map) {
        iVar.b(str, map);
    }

    public static /* synthetic */ void lambda$tVZTn_OroUl4oLrzbqs8qsoA0X8(i iVar, String str, String str2, String str3) {
        iVar.b(str, str2, str3);
    }

    public i() {
        try {
            a("clean", m.a());
            a("addition", l.a());
            OrangeConfig.getInstance().registerListener(new String[]{"safe_clean_android"}, new com.taobao.orange.d() { // from class: com.android.taobao.safeclean.-$$Lambda$i$SxOx-PyApFnUtkOkECi9rshU41g
                @Override // com.taobao.orange.d
                public final void onConfigUpdate(String str, Map map) {
                    i.m616lambda$SxOxPyApFnUtkOkECi9rshU41g(i.this, str, map);
                }
            }, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public /* synthetic */ void b(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
        } else if (!str.equalsIgnoreCase("safe_clean_android")) {
        } else {
            boolean booleanValue = Boolean.valueOf(OrangeConfig.getInstance().getConfig("safe_clean_android", "safe_clean_enabled", "true")).booleanValue();
            Log.e("OrangeSource", "receive clean mode orange config switch:" + booleanValue);
            if (!booleanValue) {
                g.a().a((Boolean) false);
                return;
            }
            g.a().a((Boolean) true);
            a("clean", map);
            a("addition", map);
        }
    }

    private void a(final String str, Map<String, String> map) {
        final String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        if (str.equals("clean")) {
            config = OrangeConfig.getInstance().getConfig("safe_clean_android", "clean_model", "");
        } else {
            config = OrangeConfig.getInstance().getConfig("safe_clean_android", "addition_model", "");
        }
        Log.e("OrangeSource", "receive mode orange config data:" + config);
        if (TextUtils.isEmpty(config) || "{}".equals(config)) {
            return;
        }
        final String str2 = map.get("configVersion");
        if (!TextUtils.isEmpty(str2) && str2.equalsIgnoreCase(g.a().b())) {
            return;
        }
        cjb.a(new Runnable() { // from class: com.android.taobao.safeclean.-$$Lambda$i$tVZTn_OroUl4oLrzbqs8qsoA0X8
            {
                i.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i.lambda$tVZTn_OroUl4oLrzbqs8qsoA0X8(i.this, str, str2, config);
            }
        });
    }

    public /* synthetic */ void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
        } else {
            a(str, str2, str3);
        }
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        for (d dVar : new ArrayList(this.f6403a.get(str))) {
            Log.e("OrangeSource", "dispatch orange config data:" + str3);
            dVar.a("orange", str2, str3);
        }
    }

    public void a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36076ea3", new Object[]{this, str, dVar});
            return;
        }
        synchronized (this.f6403a) {
            if (this.f6403a.containsKey(str)) {
                this.f6403a.get(str).add(dVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(dVar);
                this.f6403a.put(str, arrayList);
            }
        }
    }
}
