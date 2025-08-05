package com.etao.feimagesearch.newresult.base;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.cta;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f6815a;

    static {
        kge.a(-1713606481);
    }

    public abstract void a(int i);

    public abstract void a(RectF rectF);

    public abstract void a(JSONObject jSONObject);

    public abstract void a(String str);

    public abstract void a(String str, boolean z);

    public abstract void a(boolean z);

    public abstract void a(boolean z, String str);

    public abstract void ap_();

    public abstract void b(String str);

    public abstract void b(boolean z);

    public abstract void c(JSONObject jSONObject);

    public abstract void c(String str);

    public abstract void d(String str);

    public abstract JSONObject dV_();

    public abstract Bitmap e();

    public abstract RectF e(String str);

    public abstract Map<String, Object> ec_();

    public abstract Bitmap ed_();

    public abstract void f();

    public abstract cta g();

    public abstract void h();

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.f6815a = z;
        }
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.f6815a;
    }
}
