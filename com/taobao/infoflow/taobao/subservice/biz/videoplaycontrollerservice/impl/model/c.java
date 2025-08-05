package com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final float f17565a;
    private final Rect b;

    static {
        kge.a(1348397298);
    }

    public c(float f, Rect rect) {
        this.f17565a = f;
        this.b = rect;
    }

    public float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.f17565a;
    }

    public Rect b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("28899072", new Object[]{this}) : this.b;
    }
}
