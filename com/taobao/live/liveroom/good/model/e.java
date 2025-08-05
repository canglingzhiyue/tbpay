package com.taobao.live.liveroom.good.model;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.tqh;
import tb.tra;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u00103\u001a\u00020\u0007J\u0012\u00104\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u00010\u0010H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR\u001e\u0010'\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR\u001a\u00100\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000b¨\u00066"}, d2 = {"Lcom/taobao/live/liveroom/good/model/TaoLiveGoodConfigContainer;", "", "liveInfo", "Lcom/taobao/live/liveroom/good/model/GoodLiveInfo;", "<init>", "(Lcom/taobao/live/liveroom/good/model/GoodLiveInfo;)V", "speakingCardOpt", "", "getSpeakingCardOpt", "()Z", "setSpeakingCardOpt", "(Z)V", "enableFirstDetailStash", "getEnableFirstDetailStash", "setEnableFirstDetailStash", "pcgShowcaseConfig", "", "getPcgShowcaseConfig", "()Ljava/lang/String;", "setPcgShowcaseConfig", "(Ljava/lang/String;)V", "enablePcgRecCarouselShow", "getEnablePcgRecCarouselShow", "setEnablePcgRecCarouselShow", "showVipUserAction", "getShowVipUserAction", "setShowVipUserAction", "showVipEnableServer", "getShowVipEnableServer", "setShowVipEnableServer", "shopVipEnable", "", "getShopVipEnable", "()I", "setShopVipEnable", "(I)V", "sEnableSeckillPreheatAddCart", "getSEnableSeckillPreheatAddCart", "setSEnableSeckillPreheatAddCart", "sEnableGLPerformance", "getSEnableGLPerformance", "()Ljava/lang/Integer;", "setSEnableGLPerformance", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "enablePreSale", "getEnablePreSale", "setEnablePreSale", "enableTwoButton", "getEnableTwoButton", "setEnableTwoButton", "gLPerformanceDX", "enableTwoButtonState", "buttonState", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean f;
    private int g;
    private boolean h;
    private Integer i;
    private boolean j;
    private boolean k;
    private boolean e = true;

    /* renamed from: a  reason: collision with root package name */
    private boolean f17788a = tqh.INSTANCE.c();
    private boolean b = tqh.INSTANCE.d();
    private String c = "{\"showDelay\":\"10\",\"showTime\":\"10\",\"showEnd\":\"30\",\"itemNum\":\"5\"}";
    private boolean d = tqh.INSTANCE.g();

    static {
        kge.a(355955284);
    }

    public e(GoodLiveInfo goodLiveInfo) {
        int m2371constructorimpl;
        boolean z = true;
        this.g = 1;
        this.h = true;
        this.g = tqh.INSTANCE.h();
        this.h = tqh.INSTANCE.i();
        this.f = (goodLiveInfo != null ? q.a((Object) goodLiveInfo.f(), (Object) true) : false) && !q.a((Object) goodLiveInfo.g(), (Object) true);
        this.j = (goodLiveInfo != null ? q.a((Object) goodLiveInfo.h(), (Object) true) : false) && tqh.INSTANCE.j();
        this.k = (!a(goodLiveInfo != null ? goodLiveInfo.i() : null) || !tqh.INSTANCE.k()) ? false : z;
        try {
            Result.a aVar = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(Integer.valueOf(Integer.parseInt(tra.INSTANCE.a("taolive", "glPerformance", "value", "0"))));
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        this.i = (Integer) (Result.m2374exceptionOrNullimpl(m2371constructorimpl) != null ? 0 : m2371constructorimpl);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f17788a;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f;
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.g;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.h;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.j;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.k;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        Integer num = this.i;
        if (num == null) {
            return false;
        }
        num.intValue();
        Integer num2 = this.i;
        if (num2 == null || num2.intValue() != 4) {
            Integer num3 = this.i;
            q.a(num3);
            if (num3.intValue() < 100) {
                return false;
            }
        }
        return true;
    }

    private final boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : q.a((Object) str, (Object) "nbButton") || q.a((Object) str, (Object) "twoButton");
    }
}
