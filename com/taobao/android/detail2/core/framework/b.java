package com.taobao.android.detail2.core.framework;

import android.app.Activity;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout;
import tb.ctu;
import tb.fjt;
import tb.fko;
import tb.fkr;
import tb.fkt;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAV_TOKEN = "NewDetailToken";

    /* renamed from: a  reason: collision with root package name */
    private fkr f11470a;
    private a c;
    private NewDetailMaskFrameLayout.d f;
    private com.alibaba.android.spindle.stage.b b = new com.alibaba.android.spindle.stage.b("NewDetail");
    private long d = -1;
    private boolean e = false;
    private long i = -2147483648L;

    static {
        kge.a(-493362018);
    }

    public b(a aVar, Intent intent) {
        this.c = aVar;
        this.f11470a = a(intent);
        fkr fkrVar = this.f11470a;
        if (fkrVar == null) {
            ctu.a("createNewDetailFeedsConfig");
            this.f11470a = new fkr(this, intent);
            ctu.a();
            fjt.a(fjt.TAG_RENDER, "初始化没有拿到nav阶段预加载好的feedsconfig");
            return;
        }
        fkrVar.a(this);
        fjt.a(fjt.TAG_RENDER, "初始化拿到nav阶段预加载好的feedsconfig");
    }

    public void a(NewDetailMaskFrameLayout.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8685dc95", new Object[]{this, dVar});
        } else {
            this.f = dVar;
        }
    }

    public NewDetailMaskFrameLayout.d k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NewDetailMaskFrameLayout.d) ipChange.ipc$dispatch("3368e1f", new Object[]{this}) : this.f;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.i = j;
        }
    }

    public long o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b56a", new Object[]{this})).longValue() : this.i;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d = System.currentTimeMillis();
        }
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        fjt.b(fjt.TAG_INSIDE_DETAIL, "mLastInsideTagTime currentIsInsideDetailForTag mLastInsideTagTime = " + this.d);
        return this.d > 0 && System.currentTimeMillis() - this.d < 10000;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.d = -1L;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.e = true;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.e = false;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e || j();
    }

    private fkr a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fkr) ipChange.ipc$dispatch("c351414", new Object[]{this, intent});
        }
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra(NAV_TOKEN);
        if (!StringUtils.isEmpty(stringExtra)) {
            return fko.a(stringExtra);
        }
        return null;
    }

    public a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("54baab7d", new Object[]{this}) : this.c;
    }

    public Activity g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2c7ab1fa", new Object[]{this}) : this.c.getNewDetailContext();
    }

    public fkr h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("44e0280a", new Object[]{this}) : this.f11470a;
    }

    public fkt n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkt) ipChange.ipc$dispatch("730a0882", new Object[]{this}) : this.f11470a.b();
    }

    public com.alibaba.android.spindle.stage.b i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.spindle.stage.b) ipChange.ipc$dispatch("e9b7fa25", new Object[]{this}) : this.b;
    }
}
