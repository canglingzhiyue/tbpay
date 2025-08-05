package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.hiu;
import tb.kge;

/* loaded from: classes5.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f13803a;
    public ShowcaseType b;
    public LiveItem c;
    public long d;

    static {
        kge.a(-564194230);
    }

    public k(LiveItem liveItem, long j, ShowcaseType showcaseType) {
        this.c = liveItem;
        this.f13803a = j;
        this.b = showcaseType;
    }

    public k(LiveItem liveItem) {
        this.c = liveItem;
        this.f13803a = liveItem.itemId;
        if (hiu.a(liveItem)) {
            this.b = ShowcaseType.TYPE_SECKILL;
        } else {
            this.b = ShowcaseType.TYPE_NORMAL;
        }
    }

    public LiveItem a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveItem) ipChange.ipc$dispatch("f2771749", new Object[]{this}) : this.c;
    }
}
