package com.taobao.android;

import android.graphics.drawable.BitmapDrawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;

/* loaded from: classes4.dex */
public class ae implements l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SuccPhenixEvent f9009a;

    public ae(SuccPhenixEvent succPhenixEvent) {
        this.f9009a = succPhenixEvent;
    }

    @Override // com.taobao.android.l
    public BitmapDrawable a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitmapDrawable) ipChange.ipc$dispatch("d697ec23", new Object[]{this}) : this.f9009a.getDrawable();
    }
}
