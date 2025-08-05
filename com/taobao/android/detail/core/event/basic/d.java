package com.taobao.android.detail.core.event.basic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.event.video.GallerySourceType;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class d extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public GallerySourceType f9699a;

    static {
        kge.a(163262395);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public d(GallerySourceType gallerySourceType) {
        this.f9699a = gallerySourceType;
        emu.a("com.taobao.android.detail.core.event.basic.GalleryPopPathEvent");
    }
}
