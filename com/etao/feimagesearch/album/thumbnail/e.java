package com.etao.feimagesearch.album.thumbnail;

import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f6508a;
    private o b;
    private ImageView c;

    static {
        kge.a(-277342555);
    }

    public e(o media, ImageView targetView) {
        q.c(media, "media");
        q.c(targetView, "targetView");
        this.b = media;
        this.c = targetView;
    }

    public final o b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("7983e43c", new Object[]{this}) : this.b;
    }

    public final ImageView c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("3b72af66", new Object[]{this}) : this.c;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f6508a = z;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f6508a;
    }
}
