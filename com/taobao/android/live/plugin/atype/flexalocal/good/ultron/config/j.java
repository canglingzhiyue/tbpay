package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config;

import java.util.concurrent.CountDownLatch;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f13826a;
    public final boolean d;
    public final String e;

    static {
        kge.a(1876113883);
    }

    public j(CountDownLatch countDownLatch, boolean z) {
        this.f13826a = countDownLatch;
        this.d = z;
        this.e = this.d ? "taolivegoodspage2" : "taolivegoodspage";
    }
}
