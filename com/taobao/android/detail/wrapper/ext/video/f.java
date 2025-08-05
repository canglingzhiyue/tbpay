package com.taobao.android.detail.wrapper.ext.video;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.video.DetailVideoSource;
import com.taobao.avplayer.DWInstance;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes5.dex */
public class f extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DWInstance f11393a;
    public View b;
    public DetailVideoSource c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        kge.a(1665949963);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public f(DWInstance dWInstance, View view, DetailVideoSource detailVideoSource, int i, int i2, int i3, int i4) {
        this.f11393a = dWInstance;
        this.b = view;
        this.c = detailVideoSource;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        emu.a("com.taobao.android.detail.wrapper.ext.video.ShowMinVideoEvent");
    }
}
