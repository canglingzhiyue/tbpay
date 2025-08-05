package com.etao.feimagesearch.mnn;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f6781a = true;
    public List<RectF> b;
    public List<Float> c;
    public String d;
    public String e;

    static {
        kge.a(-1001395221);
    }

    public i(List<RectF> list, List<Float> list2, String str, String str2) {
        this.b = list;
        this.c = list2;
        this.d = str;
        this.e = str2;
    }

    public List<RectF> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b;
    }
}
