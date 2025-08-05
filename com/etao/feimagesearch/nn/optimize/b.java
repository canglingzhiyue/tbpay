package com.etao.feimagesearch.nn.optimize;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f6921a;
    private Bitmap b;
    private boolean c;

    static {
        kge.a(317997598);
    }

    public b(int i, Bitmap bitmap) {
        this.f6921a = i;
        this.b = bitmap;
    }

    public b() {
        this.c = true;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f6921a;
    }

    public Bitmap c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("f13cc48", new Object[]{this}) : this.b;
    }
}
