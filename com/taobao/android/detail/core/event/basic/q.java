package com.taobao.android.detail.core.event.basic;

import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class q extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ImageView f9713a;

    static {
        kge.a(-150568185);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public q(ImageView imageView) {
        this.f9713a = imageView;
        emu.a("com.taobao.android.detail.core.event.basic.SaveBigImageEvent");
    }
}
