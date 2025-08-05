package com.etao.feimagesearch.capture.dynamic.bean;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f6515a;
    private final KakaLibImageWrapper b;
    private final boolean d;

    static {
        kge.a(-1843943538);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!q.a(this.f6515a, aVar.f6515a) || !q.a(this.b, aVar.b) || this.d != aVar.d) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Bitmap bitmap = this.f6515a;
        int hashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
        KakaLibImageWrapper kakaLibImageWrapper = this.b;
        if (kakaLibImageWrapper != null) {
            i = kakaLibImageWrapper.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.d;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TakePhotoCache(snapshot=" + this.f6515a + ", imageWrapper=" + this.b + ", isFrontCamera=" + this.d + riy.BRACKET_END_STR;
    }

    public a(Bitmap snapshot, KakaLibImageWrapper imageWrapper, boolean z) {
        q.c(snapshot, "snapshot");
        q.c(imageWrapper, "imageWrapper");
        this.f6515a = snapshot;
        this.b = imageWrapper;
        this.d = z;
    }

    public final Bitmap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("bc740346", new Object[]{this}) : this.f6515a;
    }

    public final KakaLibImageWrapper b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KakaLibImageWrapper) ipChange.ipc$dispatch("a877eda7", new Object[]{this}) : this.b;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d;
    }
}
