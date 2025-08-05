package com.etao.feimagesearch.mnn.decode;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Rect> f6770a;
    private final String b;

    static {
        kge.a(1927067201);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!q.a(this.f6770a, cVar.f6770a) || !q.a((Object) this.b, (Object) cVar.b)) {
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
        ArrayList<Rect> arrayList = this.f6770a;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
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
        return "DetectCodeOutput(codeBoxList=" + this.f6770a + ", extraInfo=" + this.b + riy.BRACKET_END_STR;
    }

    public c(ArrayList<Rect> arrayList, String extraInfo) {
        q.c(extraInfo, "extraInfo");
        this.f6770a = arrayList;
        this.b = extraInfo;
    }

    public final ArrayList<Rect> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this}) : this.f6770a;
    }
}
