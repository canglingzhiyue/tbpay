package com.taobao.android.riverlogger.inspector;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f14925a;
    private final JSONObject b;
    private final String c;
    private int d;

    static {
        kge.a(1644846301);
    }

    public q(String str, int i, String str2, JSONObject jSONObject) {
        this.f14925a = str;
        this.d = i;
        this.c = str2;
        this.b = jSONObject;
    }

    public void finalize() throws Throwable {
        c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        if (this.d >= 0 && (a2 = e.a()) != null) {
            a2.a(this.d, this.c, (JSONObject) null, MessagePriority.Normal);
        }
        super.finalize();
    }
}
