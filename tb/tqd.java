package tb;

import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx_v4.animation.util.b;
import com.taobao.live.liveroom.good.model.GoodLiveInfo;
import com.taobao.live.liveroom.good.model.e;
import com.taobao.live.liveroom.good.model.f;
import com.taobao.live.liveroom.good.repository.TaoLiveItemlistV2ResponseData;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import com.taobao.uniinfra_kmp.common_utils.serialization.a;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u001a\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u001bH\u0016J\u0012\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u0018H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/taobao/live/liveroom/good/showcase/goodplayer/TaoLivePcgGoodPlayer;", "Lcom/taobao/live/liveroom/good/showcase/goodplayer/TaoLiveBaseGoodPlayer;", "goodLiveContext", "Lcom/taobao/live/liveroom/good/model/TaoLiveGoodLiveContext;", "delegate", "Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate;", "<init>", "(Lcom/taobao/live/liveroom/good/model/TaoLiveGoodLiveContext;Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate;)V", RPCDataItems.SWITCH_TAG_LOG, "", "MSG_START_SHOW_PCG", "", "MSG_DISAPPEAR_PCG", "MSG_PLAY_NEXT_PCG", "SHOWCASE_SOURCE_PCG", "mCurrentPlayIndex", "mShowDelay", "mShowTime", "mShowEnd", "mItemNum", "mPcgGoods", "", "Lcom/taobao/live/liveroom/good/repository/TaoLiveItemlistV2ResponseData$ItemListv1;", "init", "", "initConfig", "showPcg", "", "handlePCG", "msg", b.DELAY_MILLIS, "", "startShowPCG", "playNextPCG", "disappearPCG", "setCanShow", "canShowCard", "refresh", "liveItem", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "destroy", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class tqd extends tqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final String f34271a;
    private final int b;
    private final int c;
    private final int d;
    private final String e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private List<TaoLiveItemlistV2ResponseData.ItemListv1> k;

    static {
        kge.a(-312464019);
    }

    public static /* synthetic */ Object ipc$super(tqd tqdVar, String str, Object... objArr) {
        if (str.hashCode() == 98379888) {
            super.i();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: lambda$2ao5D7ECy2Ked1NtYg2-Tj6hsjo */
    public static /* synthetic */ t m2499lambda$2ao5D7ECy2Ked1NtYg2Tj6hsjo(tqd tqdVar) {
        return b(tqdVar);
    }

    public static /* synthetic */ t lambda$77rLOdqwOzx5lOIlcUfogquDMJI(tqd tqdVar) {
        return c(tqdVar);
    }

    public static /* synthetic */ t lambda$lRBKMP5qvJZ7VZV31Myz35tvjus(tqd tqdVar) {
        return a(tqdVar);
    }

    public tqd(f fVar, tqg tqgVar) {
        super(fVar, tqgVar);
        this.f34271a = "TaoLivePcgGoodPlayer";
        this.b = 1;
        this.c = 2;
        this.d = 3;
        this.e = com.taobao.android.live.plugin.atype.flexalocal.good.showcase.f.SHOWCASE_SOURCE_PCG;
        this.g = 5;
        this.h = 10;
        this.i = 10;
        this.j = 5;
    }

    public final void j() {
        e e;
        e e2;
        GoodLiveInfo a2;
        KMPJsonObject admireInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        f a3 = a();
        boolean a4 = (a3 == null || (a2 = a3.a()) == null || (admireInfo = a2.getAdmireInfo()) == null) ? false : q.a((Object) admireInfo.getBoolean("contributionEnabled"), (Object) true);
        f a5 = a();
        if (!(a5 != null && !a5.c())) {
            f a6 = a();
            if (!((a6 == null || (e2 = a6.e()) == null || e2.d()) ? false : true) && !a4) {
                k();
                a(this.b, this.g * 1000);
                return;
            }
        }
        String str = this.f34271a;
        Object[] objArr = new Object[4];
        objArr[0] = "init ｜ enablePcg=";
        f a7 = a();
        Boolean bool = null;
        objArr[1] = a7 != null ? Boolean.valueOf(a7.c()) : null;
        objArr[2] = " enablePcgRecCarouselShow=";
        f a8 = a();
        if (a8 != null && (e = a8.e()) != null) {
            bool = Boolean.valueOf(e.d());
        }
        objArr[3] = bool;
        trd.INSTANCE.b(str, Arrays.copyOf(objArr, objArr.length));
    }

    private final void k() {
        e e;
        String c;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        f a2 = a();
        if (a2 == null || (e = a2.e()) == null || (c = e.c()) == null) {
            return;
        }
        if (!(c.length() > 0)) {
            return;
        }
        Object[] objArr = {"initConfig ｜ config=", c};
        trd.INSTANCE.a(this.f34271a, Arrays.copyOf(objArr, objArr.length));
        Object a3 = a.a(com.taobao.uniinfra_kmp.common_utils.serialization.b.Companion, c);
        KMPJsonObject kMPJsonObject = a3 instanceof KMPJsonObject ? (KMPJsonObject) a3 : null;
        this.g = (kMPJsonObject == null || (num4 = kMPJsonObject.getInt("showDelay")) == null) ? this.g : num4.intValue();
        this.h = (kMPJsonObject == null || (num3 = kMPJsonObject.getInt(StEvent.SHOW_TIME)) == null) ? this.h : num3.intValue();
        this.i = (kMPJsonObject == null || (num2 = kMPJsonObject.getInt("showEnd")) == null) ? this.i : num2.intValue();
        this.j = (kMPJsonObject == null || (num = kMPJsonObject.getInt("itemNum")) == null) ? this.j : num.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0033, code lost:
        if ((((java.lang.CharSequence) r0).length() == 0) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean l() {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tqd.l():boolean");
    }

    private final void a(int i, long j) {
        tqg b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        tqg b2 = b();
        if (b2 != null) {
            b2.j();
        }
        if (i == this.b) {
            tqg b3 = b();
            if (b3 == null) {
                return;
            }
            b3.a(j, new ruk() { // from class: tb.-$$Lambda$tqd$77rLOdqwOzx5lOIlcUfogquDMJI
                @Override // tb.ruk
                /* renamed from: invoke */
                public final Object mo2427invoke() {
                    return tqd.lambda$77rLOdqwOzx5lOIlcUfogquDMJI(tqd.this);
                }
            });
        } else if (i == this.c) {
            tqg b4 = b();
            if (b4 == null) {
                return;
            }
            b4.a(j, new ruk() { // from class: tb.-$$Lambda$tqd$lRBKMP5qvJZ7VZV31Myz35tvjus
                @Override // tb.ruk
                /* renamed from: invoke */
                public final Object mo2427invoke() {
                    return tqd.lambda$lRBKMP5qvJZ7VZV31Myz35tvjus(tqd.this);
                }
            });
        } else if (i != this.d || (b = b()) == null) {
        } else {
            b.a(j, new ruk() { // from class: tb.-$$Lambda$tqd$2ao5D7ECy2Ked1NtYg2-Tj6hsjo
                @Override // tb.ruk
                /* renamed from: invoke */
                public final Object mo2427invoke() {
                    return tqd.m2499lambda$2ao5D7ECy2Ked1NtYg2Tj6hsjo(tqd.this);
                }
            });
        }
    }

    public static final t c(tqd this$0) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("59b0774c", new Object[]{this$0});
        }
        q.d(this$0, "this$0");
        this$0.m();
        return t.INSTANCE;
    }

    public static final t a(tqd this$0) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("4ca5020e", new Object[]{this$0});
        }
        q.d(this$0, "this$0");
        return t.INSTANCE;
    }

    public static final t b(tqd this$0) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("d32abcad", new Object[]{this$0});
        }
        q.d(this$0, "this$0");
        this$0.n();
        return t.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x003d, code lost:
        if ((((java.lang.CharSequence) r4).length() == 0) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0049, code lost:
        if (r4.isEmpty() != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m() {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.tqd.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r6
            java.lang.String r2 = "6158674"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            tb.tqg r0 = r6.b()
            if (r0 == 0) goto L1d
            java.util.List r0 = r0.i()
            goto L1e
        L1d:
            r0 = 0
        L1e:
            r6.k = r0
            java.lang.String r0 = r6.f34271a
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = "MSG_START_SHOW_PCG | mPcgGoods | isEmpty="
            r1[r2] = r4
            java.util.List<com.taobao.live.liveroom.good.repository.TaoLiveItemlistV2ResponseData$ItemListv1> r4 = r6.k
            if (r4 == 0) goto L4b
            boolean r5 = r4 instanceof java.lang.CharSequence
            if (r5 == 0) goto L3f
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 != 0) goto L3c
            r5 = 1
            goto L3d
        L3c:
            r5 = 0
        L3d:
            if (r5 != 0) goto L4b
        L3f:
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L4c
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L4c
        L4b:
            r2 = 1
        L4c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1[r3] = r2
            r2 = 2
            java.lang.String r3 = " mCanShowCard="
            r1[r2] = r3
            r2 = 3
            boolean r3 = r6.c()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1[r2] = r3
            tb.trd r2 = tb.trd.INSTANCE
            int r3 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            r2.a(r0, r1)
            r6.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tqd.m():void");
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            l();
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = this.f34271a;
        Object[] objArr = {"canShowPcg | canShowCard=", Boolean.valueOf(z)};
        trd.INSTANCE.a(str, Arrays.copyOf(objArr, objArr.length));
        if (z) {
            return;
        }
        a(false);
        tqg b = b();
        if (b == null) {
            return;
        }
        b.c();
    }

    @Override // tb.tqb
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        super.i();
        a(true);
        this.k = null;
        this.f = 0;
    }
}
