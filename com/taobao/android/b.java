package com.taobao.android;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import tb.nia;

/* loaded from: classes4.dex */
public class b implements nia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f9127a;

    public b(a aVar) {
        this.f9127a = aVar;
    }

    @Override // tb.nia
    public String getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81e05888", new Object[]{this}) : this.f9127a.a();
    }

    @Override // tb.nia
    public Bitmap process(String str, nia.a aVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("6877629f", new Object[]{this, str, aVar, bitmap}) : this.f9127a.a(str, new v(aVar), bitmap);
    }
}
