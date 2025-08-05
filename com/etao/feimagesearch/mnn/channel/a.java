package com.etao.feimagesearch.mnn.channel;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.d;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rwf;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f6760a;
    private final String b;

    static {
        kge.a(286617697);
    }

    public a(Bitmap bitmap, String str) {
        q.c(bitmap, "bitmap");
        this.f6760a = bitmap;
        this.b = str;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.b;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.b) && !q.a((Object) "unknown", (Object) this.b) && !q.a((Object) "notScreenShots", (Object) this.b);
    }

    public final Integer b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("50145ad0", new Object[]{this}) : Integer.valueOf(this.f6760a.hashCode());
    }

    public final Bitmap c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f13cc48", new Object[]{this});
        }
        if (rwf.c(this.f6760a.getWidth(), this.f6760a.getHeight()) <= 640) {
            return this.f6760a;
        }
        Bitmap b = d.b(this.f6760a, 640);
        return b == null ? this.f6760a : b;
    }
}
