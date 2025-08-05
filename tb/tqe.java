package tb;

import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.liveroom.good.model.GoodLiveInfo;
import com.taobao.live.liveroom.good.model.LiveItem;
import com.taobao.live.liveroom.good.model.e;
import com.taobao.live.liveroom.good.model.f;
import com.taobao.live.liveroom.good.model.message.GoodMsgNew;
import com.taobao.live.liveroom.good.showcase.model.TaoLiveShowcaseType;
import com.taobao.taolive.sdk.model.d;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import com.taobao.uniinfra_kmp.common_utils.serialization.b;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.tqg;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00182\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ\u0006\u0010\u001a\u001a\u00020\rJ\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dJ\u001a\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\rH\u0002J\u0018\u0010#\u001a\u00020\r2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0018H\u0002J\u001a\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u00152\u0006\u0010&\u001a\u00020\nH\u0002J\"\u0010'\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u00152\u0006\u0010&\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u001dH\u0002J\u0010\u0010)\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002J\u0012\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u001a\u0010-\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u00152\u0006\u0010&\u001a\u00020\nH\u0002J\u0010\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u001dH\u0016J\u0012\u0010'\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u00100\u001a\u00020\rH\u0016J\u0012\u00101\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0012\u00102\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0012\u00103\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010,H\u0016J\u0018\u00105\u001a\u00020\r2\u0006\u00106\u001a\u00020!2\u0006\u00107\u001a\u00020\u000fH\u0016J\u0012\u00108\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010,H\u0016J\u0012\u00109\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010,H\u0016J\u0012\u0010:\u001a\u00020\r2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0012\u0010=\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010,H\u0016J&\u0010>\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u00152\b\u0010?\u001a\u0004\u0018\u00010\n2\b\u0010@\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/taobao/live/liveroom/good/showcase/goodplayer/TaoLiveSingleGoodPlayer;", "Lcom/taobao/live/liveroom/good/showcase/goodplayer/TaoLiveBaseGoodPlayer;", "Lcom/taobao/live/liveroom/good/showcase/protocols/IGoodDataObserver;", "goodLiveContext", "Lcom/taobao/live/liveroom/good/model/TaoLiveGoodLiveContext;", "delegate", "Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate;", "<init>", "(Lcom/taobao/live/liveroom/good/model/TaoLiveGoodLiveContext;Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate;)V", RPCDataItems.SWITCH_TAG_LOG, "", "mCardShowObserver", "Lkotlin/Function0;", "", "mNormalCardShowTime", "", "mSeckillCardShowTime", "mSpeakingCardShowTime", "mStashItemHolder", "Lcom/taobao/live/liveroom/good/showcase/model/TaoLiveStashItemHolder;", "currentLiveItem", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "init", "curItemList", "", "popItemCardList", "stop", "onSabAtmosphereShowOrDismiss", "isShow", "", "handleDisappearDelayed", "popCache", com.taobao.android.dinamicx_v4.animation.util.b.DELAY_MILLIS, "", "initShowTime", "checkIsNeedShow", "showProducts", "liveItem", "goodSource", "refresh", "isHotSale", "stopImmediately", "stopExplanation", "msgNew", "Lcom/taobao/live/liveroom/good/model/message/GoodMsgNew;", "render", "setCanShow", "canShowCard", "destroy", "onMessageAddProduct", "onMessageStopExplanation", "onMessageExplanation", "goodMsgNew", "onMessageGoodHotNum", "itemId", "total", "onMessageGoodHot", "onMessageExplanationDelete", "onGoodStateChange", "pmData", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "onUpdateItemFromPM", "onUpdateItem", "resultCode", "source", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class tqe extends tqb implements tqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final String f34272a;
    private ruk<t> b;
    private int c;
    private int d;
    private int e;
    private com.taobao.live.liveroom.good.showcase.model.b f;
    private LiveItem g;

    static {
        kge.a(1497473803);
        kge.a(2137537802);
    }

    public static /* synthetic */ Object ipc$super(tqe tqeVar, String str, Object... objArr) {
        if (str.hashCode() == 98379888) {
            super.i();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ t lambda$IHi5OmZQd0GRaHxgiq4xNYcBoco(tqe tqeVar, boolean z) {
        return b(tqeVar, z);
    }

    public static final /* synthetic */ void a(tqe tqeVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e106c40", new Object[]{tqeVar, liveItem});
        } else {
            tqeVar.g = liveItem;
        }
    }

    public static final /* synthetic */ void a(tqe tqeVar, LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ab060a", new Object[]{tqeVar, liveItem, str});
        } else {
            tqeVar.c(liveItem, str);
        }
    }

    public static final /* synthetic */ void a(tqe tqeVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cde5c84", new Object[]{tqeVar, new Boolean(z)});
        } else {
            tqeVar.d(z);
        }
    }

    public tqe(f fVar, tqg tqgVar) {
        super(fVar, tqgVar);
        this.f34272a = "TaoLiveSingleGoodPlayer";
        this.c = 10;
        this.d = 15;
        this.e = 600;
    }

    public final void a(List<LiveItem> list, List<LiveItem> list2, ruk<t> rukVar) {
        e e;
        e e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e63d32", new Object[]{this, list, list2, rukVar});
            return;
        }
        this.b = rukVar;
        k();
        int i = this.e;
        f a2 = a();
        Boolean bool = null;
        Boolean valueOf = (a2 == null || (e2 = a2.e()) == null) ? null : Boolean.valueOf(e2.a());
        f a3 = a();
        if (a3 != null && (e = a3.e()) != null) {
            bool = Boolean.valueOf(e.b());
        }
        this.f = new com.taobao.live.liveroom.good.showcase.model.b(list2, i, valueOf, bool);
        a(list);
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            a(this, false, 0L, 2, null);
        }
    }

    public final void b(boolean z) {
        KMPJsonObject nativeConfigInfos;
        LiveItem.SabItemAtmosphere k;
        LiveItem.SabItemAtmosphere k2;
        LiveItem.SabItemAtmosphere k3;
        LiveItem.SabItemAtmosphere k4;
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        LiveItem liveItem = this.g;
        if (liveItem == null) {
            return;
        }
        String str = null;
        if ((liveItem != null ? liveItem.k() : null) == null || a() == null || !a().f()) {
            return;
        }
        if (z) {
            LiveItem liveItem2 = this.g;
            if (!q.a((Object) ((liveItem2 == null || (k4 = liveItem2.k()) == null) ? null : k4.a()), (Object) "item_soldQuantity")) {
                LiveItem liveItem3 = this.g;
                if (!q.a((Object) ((liveItem3 == null || (k3 = liveItem3.k()) == null) ? null : k3.a()), (Object) "item_rankAtmosphere")) {
                    LiveItem liveItem4 = this.g;
                    if (!q.a((Object) ((liveItem4 == null || (k2 = liveItem4.k()) == null) ? null : k2.b()), (Object) "item_soldQuantity")) {
                        LiveItem liveItem5 = this.g;
                        if (liveItem5 != null && (k = liveItem5.k()) != null) {
                            str = k.b();
                        }
                        if (!q.a((Object) str, (Object) "item_rankAtmosphere")) {
                            tqg b2 = b();
                            if (b2 != null) {
                                b2.b(true);
                            }
                            i = 1;
                        }
                    }
                }
            }
            tqg b3 = b();
            if (b3 != null) {
                b3.b(false);
            }
        } else {
            tqg b4 = b();
            if (b4 != null) {
                b4.b(true);
            }
            i = 0;
        }
        LiveItem liveItem6 = this.g;
        if (liveItem6 != null && (nativeConfigInfos = liveItem6.getNativeConfigInfos()) != null) {
            nativeConfigInfos.put("sabItemAtmosphereState", (Object) Integer.valueOf(i));
        }
        c(this.g);
    }

    public static /* synthetic */ void a(tqe tqeVar, boolean z, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91dba55f", new Object[]{tqeVar, new Boolean(z), new Long(j), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        tqeVar.a(z, j);
    }

    private final void a(final boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1910d8", new Object[]{this, new Boolean(z), new Long(j)});
            return;
        }
        tqg b2 = b();
        if (b2 != null) {
            b2.j();
        }
        tqg b3 = b();
        if (b3 == null) {
            return;
        }
        b3.a(j, new ruk() { // from class: tb.-$$Lambda$tqe$IHi5OmZQd0GRaHxgiq4xNYcBoco
            @Override // tb.ruk
            /* renamed from: invoke */
            public final Object mo2427invoke() {
                return tqe.lambda$IHi5OmZQd0GRaHxgiq4xNYcBoco(tqe.this, z);
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/taobao/live/liveroom/good/showcase/goodplayer/TaoLiveSingleGoodPlayer$handleDisappearDelayed$1$1", "Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate$AnimationListener;", "onAnimationStart", "", "onAnimationEnd", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class a implements tqg.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public a(boolean z) {
            tqe.this = r1;
            this.b = z;
        }

        @Override // tb.tqg.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                tqg.b.a(tqe.this.b(), tqa.EVENT_DISMISS_SAB_ATMOSHPERE, null, 2, null);
            }
        }

        @Override // tb.tqg.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            tqe.this.b().f();
            tqe.this.b().a("good.showcase.disappear", tqe.this.b().h());
            f a2 = tqe.this.a();
            if (a2 != null) {
                a2.d(false);
            }
            tqe.a(tqe.this, this.b);
        }
    }

    public static final t b(tqe this$0, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("5090201c", new Object[]{this$0, new Boolean(z)});
        }
        q.d(this$0, "this$0");
        this$0.b().a(new a(z));
        return t.INSTANCE;
    }

    private final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        Object a2 = com.taobao.uniinfra_kmp.common_utils.serialization.a.a(com.taobao.uniinfra_kmp.common_utils.serialization.b.Companion, tqh.INSTANCE.a());
        KMPJsonObject kMPJsonObject = a2 instanceof KMPJsonObject ? (KMPJsonObject) a2 : null;
        if (kMPJsonObject != null && kMPJsonObject.containsKey((Object) "normal")) {
            Integer num = kMPJsonObject.getInt("normal");
            this.c = num != null ? num.intValue() : 10;
        }
        if (kMPJsonObject != null && kMPJsonObject.containsKey((Object) ecd.V_EFFECT_ACTION_SECKILL)) {
            Integer num2 = kMPJsonObject.getInt(ecd.V_EFFECT_ACTION_SECKILL);
            this.d = num2 != null ? num2.intValue() : 15;
        }
        if (kMPJsonObject != null && kMPJsonObject.containsKey((Object) "speaking")) {
            Integer num3 = kMPJsonObject.getInt("speaking");
            this.e = num3 != null ? num3.intValue() : 600;
        }
        String str = this.f34272a;
        Object[] objArr = {"initShowTime | normal=", Integer.valueOf(this.c), "  seckill=", Integer.valueOf(this.d), "    speaking=", Integer.valueOf(this.e)};
        trd.INSTANCE.a(str, Arrays.copyOf(objArr, objArr.length));
    }

    private final void a(List<LiveItem> list) {
        tqg b2;
        String string;
        GoodLiveInfo a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null) {
        } else {
            List<LiveItem> list2 = list;
            if (!(!list2.isEmpty())) {
                return;
            }
            LiveItem liveItem = list2.get(0);
            String valueOf = String.valueOf(liveItem.a());
            String str = this.f34272a;
            Object[] objArr = {"checkIsNeedShow | id=", valueOf, "    name=", liveItem.c(), "  index=", Integer.valueOf(liveItem.d())};
            trd.INSTANCE.a(str, Arrays.copyOf(objArr, objArr.length));
            f a3 = a();
            String str2 = null;
            b(liveItem, q.a((Object) ((a3 == null || (a2 = a3.a()) == null) ? null : a2.b()), (Object) com.taobao.taolive.sdk.mergeInfo.b.VALUE_ITEM_HOLD_TYPE_CARD) ? d() : e());
            KMPJsonObject extendVal = liveItem.getExtendVal();
            if (extendVal != null && (string = extendVal.getString(d.TYPE_MSG_UUID)) != null) {
                if (string.length() > 0) {
                    z = true;
                }
            }
            if (!z || (b2 = b()) == null) {
                return;
            }
            KMPJsonObject extendVal2 = liveItem.getExtendVal();
            if (extendVal2 != null) {
                str2 = extendVal2.getString(d.TYPE_MSG_UUID);
            }
            b2.b(str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(com.taobao.live.liveroom.good.model.LiveItem r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tqe.b(com.taobao.live.liveroom.good.model.LiveItem, java.lang.String):void");
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/taobao/live/liveroom/good/showcase/goodplayer/TaoLiveSingleGoodPlayer$showProducts$2", "Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate$AnimationListener;", "onAnimationStart", "", "onAnimationEnd", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class b implements tqg.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ LiveItem b;
        public final /* synthetic */ String c;

        public b(LiveItem liveItem, String str) {
            tqe.this = r1;
            this.b = liveItem;
            this.c = str;
        }

        @Override // tb.tqg.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                tqg.b.a(tqe.this.b(), tqa.EVENT_DISMISS_SAB_ATMOSHPERE, null, 2, null);
            }
        }

        @Override // tb.tqg.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            tqe.this.b().f();
            tqe.a(tqe.this, this.b, this.c);
            tqe.this.a(this.b, this.c);
            tqe.a(tqe.this, this.b);
            tqe.this.b().e();
        }
    }

    private final void a(LiveItem liveItem, String str, boolean z) {
        com.taobao.live.liveroom.good.showcase.model.a aVar;
        tqg b2;
        tqg b3;
        String str2;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cea4f2", new Object[]{this, liveItem, str, new Boolean(z)});
            return;
        }
        b(liveItem);
        boolean a2 = tqk.Companion.a(liveItem);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("goodOpenFrom", str);
        Long l = null;
        if (!z && (b3 = b()) != null) {
            if (liveItem != null) {
                b.a aVar2 = com.taobao.uniinfra_kmp.common_utils.serialization.b.Companion;
                str2 = JSON.toJSONString(liveItem);
            } else {
                str2 = null;
            }
            b3.a(str2, linkedHashMap);
        }
        com.taobao.live.liveroom.good.showcase.model.a h = h();
        if (q.a((Object) str, (Object) e()) || q.a((Object) str, (Object) d())) {
            z2 = true;
        }
        com.taobao.live.liveroom.good.showcase.model.b bVar = this.f;
        if (bVar != null) {
            bVar.a(liveItem, z2);
        }
        boolean b4 = tqi.INSTANCE.b(liveItem);
        if (a2) {
            if (liveItem != null) {
                l = liveItem.a();
            }
            aVar = new com.taobao.live.liveroom.good.showcase.model.a(liveItem, l, TaoLiveShowcaseType.TYPE_SECKILL);
        } else {
            if (liveItem != null) {
                l = liveItem.a();
            }
            aVar = new com.taobao.live.liveroom.good.showcase.model.a(liveItem, l, b4 ? TaoLiveShowcaseType.TYPE_EXPLAININT : TaoLiveShowcaseType.TYPE_NORMAL);
        }
        a(aVar);
        if (liveItem != null && (b2 = b()) != null) {
            b.a aVar3 = com.taobao.uniinfra_kmp.common_utils.serialization.b.Companion;
            b2.a(JSON.toJSONString(liveItem), h);
        }
        if (!z) {
            a(true, (b4 ? this.e : this.d) * 1000);
        }
        com.taobao.live.liveroom.good.showcase.model.a h2 = h();
        if (h2 == null) {
            return;
        }
        h2.a(tqi.INSTANCE.a());
    }

    private final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        tqg b2 = b();
        if (b2 != null) {
            b2.c();
        }
        tqg b3 = b();
        if (b3 != null) {
            b3.g();
        }
        com.taobao.live.liveroom.good.showcase.model.a aVar = null;
        a((com.taobao.live.liveroom.good.showcase.model.a) null);
        com.taobao.live.liveroom.good.showcase.model.b bVar = this.f;
        if (bVar != null) {
            aVar = bVar.b();
        }
        if (!z || aVar == null) {
            return;
        }
        b(aVar.c(), g());
    }

    private final void f(GoodMsgNew goodMsgNew) {
        LiveItem a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31b22d98", new Object[]{this, goodMsgNew});
            return;
        }
        tqi tqiVar = tqi.INSTANCE;
        com.taobao.live.liveroom.good.showcase.model.a h = h();
        Long l = null;
        if (!tqiVar.b(h != null ? h.c() : null)) {
            return;
        }
        Long a3 = (goodMsgNew == null || (a2 = goodMsgNew.a()) == null) ? null : a2.a();
        com.taobao.live.liveroom.good.showcase.model.a h2 = h();
        if (h2 != null) {
            l = Long.valueOf(h2.a());
        }
        if (!q.a(a3, l)) {
            return;
        }
        j();
    }

    private final void c(LiveItem liveItem, String str) {
        com.taobao.live.liveroom.good.showcase.model.a aVar;
        tqg b2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d35f7124", new Object[]{this, liveItem, str});
            return;
        }
        b(liveItem);
        tqg b3 = b();
        if (b3 != null) {
            b3.j();
        }
        ruk<t> rukVar = this.b;
        if (rukVar != null) {
            rukVar.mo2427invoke();
        }
        tqg b4 = b();
        if (b4 != null) {
            b4.d();
        }
        boolean a2 = tqk.Companion.a(liveItem);
        if (q.a((Object) str, (Object) e()) || q.a((Object) str, (Object) d())) {
            z = true;
        }
        com.taobao.live.liveroom.good.showcase.model.b bVar = this.f;
        if (bVar != null) {
            bVar.a(liveItem, z);
        }
        boolean b5 = tqi.INSTANCE.b(liveItem);
        if (liveItem != null && (b2 = b()) != null) {
            b.a aVar2 = com.taobao.uniinfra_kmp.common_utils.serialization.b.Companion;
            b2.a(JSON.toJSONString(liveItem));
        }
        Long l = null;
        if (a2) {
            if (liveItem != null) {
                l = liveItem.a();
            }
            aVar = new com.taobao.live.liveroom.good.showcase.model.a(liveItem, l, TaoLiveShowcaseType.TYPE_SECKILL);
        } else {
            if (liveItem != null) {
                l = liveItem.a();
            }
            aVar = new com.taobao.live.liveroom.good.showcase.model.a(liveItem, l, b5 ? TaoLiveShowcaseType.TYPE_EXPLAININT : TaoLiveShowcaseType.TYPE_NORMAL);
        }
        a(aVar);
        a(true, (b5 ? this.e : this.d) * 1000);
        com.taobao.live.liveroom.good.showcase.model.a h = h();
        if (h == null) {
            return;
        }
        h.a(tqi.INSTANCE.a());
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        a(z);
        if (c()) {
            return;
        }
        d(false);
    }

    public void c(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6349da", new Object[]{this, liveItem});
        } else if (liveItem == null || h() == null) {
        } else {
            Long a2 = liveItem.a();
            com.taobao.live.liveroom.good.showcase.model.a h = h();
            q.a(h);
            long a3 = h.a();
            if (a2 == null || a2.longValue() != a3) {
                return;
            }
            b(liveItem);
            tqg b2 = b();
            if (b2 == null) {
                return;
            }
            b.a aVar = com.taobao.uniinfra_kmp.common_utils.serialization.b.Companion;
            b2.a(JSON.toJSONString(liveItem), h());
        }
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
        a((com.taobao.live.liveroom.good.showcase.model.a) null);
        this.g = null;
    }

    @Override // tb.tqf
    public void a(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d660b13", new Object[]{this, goodMsgNew});
        } else if (goodMsgNew == null) {
        } else {
            b(goodMsgNew.a(), f());
        }
    }

    @Override // tb.tqf
    public void b(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47dbab94", new Object[]{this, goodMsgNew});
            return;
        }
        com.taobao.live.liveroom.good.showcase.model.b bVar = this.f;
        if (bVar != null) {
            bVar.a();
        }
        f(goodMsgNew);
    }

    @Override // tb.tqf
    public void c(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2514c15", new Object[]{this, goodMsgNew});
        } else if (goodMsgNew == null) {
        } else {
            b(goodMsgNew.a(), f());
        }
    }

    @Override // tb.tqf
    public void a(long j, int i) {
        LiveItem c;
        LiveItem c2;
        KMPJsonObject itemExtData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11c727", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        com.taobao.live.liveroom.good.showcase.model.a h = h();
        LiveItem liveItem = null;
        if ((h != null ? h.b() : null) != TaoLiveShowcaseType.TYPE_EXPLAININT) {
            return;
        }
        String str = this.f34272a;
        Object[] objArr = {"onMessageGoodHot | itemid=", Long.valueOf(j), "   total=", Integer.valueOf(i)};
        trd.INSTANCE.a(str, Arrays.copyOf(objArr, objArr.length));
        com.taobao.live.liveroom.good.showcase.model.a h2 = h();
        if (!(h2 != null && j == h2.a())) {
            return;
        }
        tqi tqiVar = tqi.INSTANCE;
        com.taobao.live.liveroom.good.showcase.model.a h3 = h();
        if (tqiVar.c(h3 != null ? h3.c() : null)) {
            return;
        }
        com.taobao.live.liveroom.good.showcase.model.a h4 = h();
        if (h4 != null && (c2 = h4.c()) != null && (itemExtData = c2.getItemExtData()) != null) {
            Integer num = itemExtData.getInt("itemSellingTotal");
            int intValue = num != null ? num.intValue() : -1;
            if (intValue >= i) {
                String str2 = this.f34272a;
                Object[] objArr2 = {"updateItem | currTotal=", Integer.valueOf(intValue), "   total=", Integer.valueOf(i), " itemId=", Long.valueOf(j)};
                trd.INSTANCE.b(str2, Arrays.copyOf(objArr2, objArr2.length));
                return;
            }
            itemExtData.put("itemSellingTotal", (Object) Integer.valueOf(i));
        } else {
            com.taobao.live.liveroom.good.showcase.model.a h5 = h();
            if (h5 != null && (c = h5.c()) != null) {
                KMPJsonObject kMPJsonObject = new KMPJsonObject(null, 1, null);
                kMPJsonObject.put("itemSellingTotal", (Object) Integer.valueOf(i));
                c.setItemExtData(kMPJsonObject);
            }
        }
        tqg b2 = b();
        if (b2 != null) {
            b2.a(j, i);
        }
        com.taobao.live.liveroom.good.showcase.model.a h6 = h();
        if (h6 != null) {
            liveItem = h6.c();
        }
        a(liveItem, f(), true);
    }

    @Override // tb.tqf
    public void d(GoodMsgNew goodMsgNew) {
        LiveItem a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc6ec96", new Object[]{this, goodMsgNew});
        } else if (goodMsgNew == null || (a2 = goodMsgNew.a()) == null) {
        } else {
            com.taobao.live.liveroom.good.showcase.model.b bVar = this.f;
            if (bVar != null) {
                bVar.a(a2);
            }
            f(goodMsgNew);
        }
    }

    @Override // tb.tqf
    public void a(KMPJsonObject kMPJsonObject) {
        LiveItem c;
        KMPJsonObject extendVal;
        LiveItem c2;
        KMPJsonObject extendVal2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0afae6", new Object[]{this, kMPJsonObject});
        } else if (kMPJsonObject == null) {
        } else {
            Long l = kMPJsonObject.getLong("itemId");
            com.taobao.live.liveroom.good.showcase.model.a h = h();
            LiveItem liveItem = null;
            if ((h != null ? h.b() : null) != TaoLiveShowcaseType.TYPE_SECKILL) {
                return;
            }
            com.taobao.live.liveroom.good.showcase.model.a h2 = h();
            if (!q.a(h2 != null ? Long.valueOf(h2.a()) : null, l)) {
                return;
            }
            String string = kMPJsonObject.getString("status");
            String string2 = kMPJsonObject.getString("type");
            if (!q.a((Object) string, (Object) "2") || !q.a((Object) "secKillSellout", (Object) string2)) {
                return;
            }
            com.taobao.live.liveroom.good.showcase.model.a h3 = h();
            KMPJsonObject jsonObject = (h3 == null || (c2 = h3.c()) == null || (extendVal2 = c2.getExtendVal()) == null) ? null : extendVal2.getJsonObject("secKillInfo");
            if (jsonObject == null) {
                return;
            }
            jsonObject.put("status", (Object) string);
            com.taobao.live.liveroom.good.showcase.model.a h4 = h();
            if (h4 != null && (c = h4.c()) != null && (extendVal = c.getExtendVal()) != null) {
                extendVal.put("secKillInfo", (Object) jsonObject);
            }
            com.taobao.live.liveroom.good.showcase.model.a h5 = h();
            if (h5 != null) {
                liveItem = h5.c();
            }
            a(liveItem, f(), false);
        }
    }

    @Override // tb.tqf
    public void e(GoodMsgNew goodMsgNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773c8d17", new Object[]{this, goodMsgNew});
        } else if (goodMsgNew == null) {
        } else {
            b(goodMsgNew.a(), f());
        }
    }

    @Override // tb.tqf
    public void a(LiveItem liveItem, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2071f76c", new Object[]{this, liveItem, str, str2});
        } else if (liveItem == null) {
        } else {
            c(liveItem);
            this.g = liveItem;
        }
    }
}
