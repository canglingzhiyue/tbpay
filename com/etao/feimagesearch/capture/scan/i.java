package com.etao.feimagesearch.capture.scan;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f6593a;
    private final Rect[] b;
    private final h[] c;
    private final HashMap<String, String> d;

    static {
        kge.a(1358612831);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (!q.a(this.f6593a, iVar.f6593a) || !q.a(this.b, iVar.b) || !q.a(this.c, iVar.c) || !q.a(this.d, iVar.d)) {
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
        Bitmap bitmap = this.f6593a;
        int hashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
        Rect[] rectArr = this.b;
        int hashCode2 = (hashCode + (rectArr != null ? Arrays.hashCode(rectArr) : 0)) * 31;
        h[] hVarArr = this.c;
        int hashCode3 = (hashCode2 + (hVarArr != null ? Arrays.hashCode(hVarArr) : 0)) * 31;
        HashMap<String, String> hashMap = this.d;
        if (hashMap != null) {
            i = hashMap.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ScanResultWrapper(scaleBitmap=" + this.f6593a + ", scanCodeRects=" + Arrays.toString(this.b) + ", scanResults=" + Arrays.toString(this.c) + ", extParam=" + this.d + riy.BRACKET_END_STR;
    }

    public i(Bitmap bitmap, Rect[] rectArr, h[] hVarArr, HashMap<String, String> extParam) {
        q.c(extParam, "extParam");
        this.f6593a = bitmap;
        this.b = rectArr;
        this.c = hVarArr;
        this.d = extParam;
    }

    public final Bitmap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("bc740346", new Object[]{this}) : this.f6593a;
    }

    public final Rect[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect[]) ipChange.ipc$dispatch("657d3d71", new Object[]{this}) : this.b;
    }

    public final h[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h[]) ipChange.ipc$dispatch("d7c8034a", new Object[]{this}) : this.c;
    }

    public final HashMap<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("9d11238e", new Object[]{this}) : this.d;
    }
}
