package com.taobao.android.weex_uikit.widget.input;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f16189a;
    private e b;

    static {
        kge.a(-325810139);
    }

    public g(e eVar, e eVar2) {
        this.f16189a = eVar;
        this.b = eVar2;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            if (this.f16189a != null) {
                if (this.f16189a.f16186a) {
                    return this.f16189a.b.matcher(str).replaceAll(this.f16189a.c);
                }
                return this.f16189a.b.matcher(str).replaceFirst(this.f16189a.c);
            }
        } catch (Throwable th) {
            com.taobao.android.weex_framework.util.g.a(th);
        }
        return str;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        try {
            if (this.b != null) {
                if (this.b.f16186a) {
                    return this.b.b.matcher(str).replaceAll(this.b.c);
                }
                return this.b.b.matcher(str).replaceFirst(this.b.c);
            }
        } catch (Throwable th) {
            com.taobao.android.weex_framework.util.g.a(th);
        }
        return str;
    }
}
