package com.taobao.android.themis.graphics.audio;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f15545a;

    public abstract void a();

    public abstract boolean a(float f);

    public abstract boolean a(int i);

    public abstract boolean a(String str);

    public abstract boolean a(boolean z);

    public abstract void b();

    public abstract void b(int i);

    public abstract boolean b(boolean z);

    public abstract void c();

    public abstract boolean c(boolean z);

    public abstract void d();

    public abstract boolean d(boolean z);

    public abstract float e();

    public abstract float f();

    public abstract boolean g();

    public abstract int h();

    public final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.f15545a = j;
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        long j = this.f15545a;
        if (j < 0) {
            return;
        }
        AudioContextProxy.nativeFireEvent(j, str, jSONObject == null ? "" : jSONObject.toString());
    }
}
