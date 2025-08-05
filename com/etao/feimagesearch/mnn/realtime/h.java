package com.etao.feimagesearch.mnn.realtime;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<String> f6790a;
    private final ArrayList<l> b;
    private final Bitmap c;
    private final String d;

    static {
        kge.a(891013641);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (!q.a(this.f6790a, hVar.f6790a) || !q.a(this.b, hVar.b) || !q.a(this.c, hVar.c) || !q.a((Object) this.d, (Object) hVar.d)) {
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
        ArrayList<String> arrayList = this.f6790a;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        ArrayList<l> arrayList2 = this.b;
        int hashCode2 = (hashCode + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        Bitmap bitmap = this.c;
        int hashCode3 = (hashCode2 + (bitmap != null ? bitmap.hashCode() : 0)) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ImageOutput(actions=" + this.f6790a + ", objects=" + this.b + ", resizedBitmap=" + this.c + ", extraInfo=" + this.d + riy.BRACKET_END_STR;
    }

    public h(ArrayList<String> arrayList, ArrayList<l> arrayList2, Bitmap bitmap, String str) {
        this.f6790a = arrayList;
        this.b = arrayList2;
        this.c = bitmap;
        this.d = str;
    }

    public final ArrayList<l> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this}) : this.b;
    }

    public final Bitmap b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("e5c3e7c7", new Object[]{this}) : this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.d;
    }
}
