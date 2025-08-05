package com.etao.feimagesearch.mnn.decode;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f6769a;
    private final String b;

    static {
        kge.a(749146762);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!q.a(this.f6769a, bVar.f6769a) || !q.a((Object) this.b, (Object) bVar.b)) {
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
        Bitmap bitmap = this.f6769a;
        int hashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DetectCodeInput(bitmap=" + this.f6769a + ", strategy=" + this.b + riy.BRACKET_END_STR;
    }

    public b(Bitmap bitmap, String strategy) {
        q.c(bitmap, "bitmap");
        q.c(strategy, "strategy");
        this.f6769a = bitmap;
        this.b = strategy;
    }

    public final Bitmap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("bc740346", new Object[]{this}) : this.f6769a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }
}
