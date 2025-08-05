package com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Rect f17563a;

    static {
        kge.a(1993723596);
    }

    public a(Rect rect) {
        this.f17563a = rect;
    }

    public Rect a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("ef387fb1", new Object[]{this}) : this.f17563a;
    }
}
