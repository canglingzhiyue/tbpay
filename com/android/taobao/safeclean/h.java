package com.android.taobao.safeclean;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cjb;
import tb.kge;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private String f6402a = "";
    private Map<String, List<d>> b = new HashMap();

    static {
        kge.a(196267488);
        kge.a(687885549);
    }

    /* renamed from: lambda$qwYX9rsi4ki9c5Da9VQ-wdCMrps */
    public static /* synthetic */ void m615lambda$qwYX9rsi4ki9c5Da9VQwdCMrps(h hVar) {
        hVar.a();
    }

    public h() {
        a("clean", m.a());
        cjb.a(new Runnable() { // from class: com.android.taobao.safeclean.-$$Lambda$h$qwYX9rsi4ki9c5Da9VQ-wdCMrps
            {
                h.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h.m615lambda$qwYX9rsi4ki9c5Da9VQwdCMrps(h.this);
            }
        });
    }

    public /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f6402a = g.a().c("local");
        if (TextUtils.isEmpty(this.f6402a) || !g.a().e().booleanValue()) {
            return;
        }
        a("clean", "", this.f6402a);
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        for (d dVar : new ArrayList(this.b.get(str))) {
            dVar.a("local", str2, str3);
        }
    }

    public void a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36076ea3", new Object[]{this, str, dVar});
            return;
        }
        synchronized (this.b) {
            if (this.b.containsKey(str)) {
                this.b.get(str).add(dVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(dVar);
                this.b.put(str, arrayList);
            }
        }
    }
}
