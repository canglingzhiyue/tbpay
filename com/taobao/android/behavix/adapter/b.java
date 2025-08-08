package com.taobao.android.behavix.adapter;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.d;
import org.json.JSONObject;
import tb.kge;
import tb.kth;
import tb.ktk;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static b f9167a;

    static {
        kge.a(205642139);
        f9167a = null;
    }

    private b() {
        ktk.a(d.b(), d.d());
    }

    public static b a() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7599ccf4", new Object[0]);
        }
        b bVar2 = f9167a;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (b.class) {
            if (f9167a == null) {
                f9167a = new b();
            }
            bVar = f9167a;
        }
        return bVar;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        kth a2 = ktk.a();
        if (a2 == null || StringUtils.isEmpty(str)) {
            return;
        }
        a2.b(str);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        kth a2 = ktk.a();
        if (a2 == null || StringUtils.isEmpty(str)) {
            return;
        }
        a2.a(str, str2);
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3502d8cc", new Object[]{this, str, jSONObject});
            return;
        }
        kth a2 = ktk.a();
        if (a2 == null || StringUtils.isEmpty(str) || jSONObject == null) {
            return;
        }
        a2.a(str, jSONObject);
    }
}
