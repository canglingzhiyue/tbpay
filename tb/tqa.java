package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.liveroom.good.model.EnterGoodsData;
import com.taobao.live.liveroom.good.model.LiveItem;
import com.taobao.live.liveroom.good.model.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0013J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/taobao/live/liveroom/good/showcase/TaoLiveShowcaseController;", "", "goodLiveContext", "Lcom/taobao/live/liveroom/good/model/TaoLiveGoodLiveContext;", "enterGoodsData", "Lcom/taobao/live/liveroom/good/model/EnterGoodsData;", "higlightLiveItem", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "delegate", "Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate;", "<init>", "(Lcom/taobao/live/liveroom/good/model/TaoLiveGoodLiveContext;Lcom/taobao/live/liveroom/good/model/EnterGoodsData;Lcom/taobao/live/liveroom/good/model/LiveItem;Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate;)V", "mPcgGoodPlayer", "Lcom/taobao/live/liveroom/good/showcase/goodplayer/TaoLivePcgGoodPlayer;", "mSingleGoodPlayer", "Lcom/taobao/live/liveroom/good/showcase/goodplayer/TaoLiveSingleGoodPlayer;", "mHighlightGoodPlayer", "Lcom/taobao/live/liveroom/good/showcase/goodplayer/TaoLiveHighlightGoodPlayer;", "updateShowState", "", "isShow", "", "updateProduct", "liveItem", "hideProduct", "destroy", "onSabAtmosphereShowOrDismiss", "getIGoodDataObserver", "Lcom/taobao/live/liveroom/good/showcase/protocols/IGoodDataObserver;", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class tqa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AUCTION_CARD_HIDE = "cardHide";
    public static final String AUCTION_CARD_SHOW = "cardShow";
    public static final a Companion;
    public static final String EVENT_APPEAR = "good.showcase.appear";
    public static final String EVENT_DISAPPEAR = "good.showcase.disappear";
    public static final String EVENT_DISMISS_SAB_ATMOSHPERE = "com.taobao.taolive.room.dismiss_sab_atmosphere";

    /* renamed from: a */
    private final f f34267a;
    private final EnterGoodsData b;
    private final LiveItem c;
    private final tqg d;
    private tqd e;
    private tqe f;
    private tqc g;

    static {
        kge.a(-1697806801);
        Companion = new a(null);
    }

    public static /* synthetic */ t lambda$Tm03BU7TdwZXKrSRlTrTShlVW5Y(tqa tqaVar) {
        return a(tqaVar);
    }

    public tqa(f fVar, EnterGoodsData enterGoodsData, LiveItem liveItem, tqg delegate) {
        q.d(delegate, "delegate");
        this.f34267a = fVar;
        this.b = enterGoodsData;
        this.c = liveItem;
        this.d = delegate;
        f fVar2 = this.f34267a;
        boolean z = false;
        if (fVar2 != null && fVar2.b()) {
            z = true;
        }
        if (z) {
            this.g = new tqc(this.f34267a, this.d);
            tqc tqcVar = this.g;
            if (tqcVar == null) {
                return;
            }
            tqcVar.c(this.c);
            return;
        }
        this.e = new tqd(this.f34267a, this.d);
        tqd tqdVar = this.e;
        if (tqdVar != null) {
            tqdVar.j();
        }
        this.f = new tqe(this.f34267a, this.d);
        tqe tqeVar = this.f;
        if (tqeVar == null) {
            return;
        }
        EnterGoodsData enterGoodsData2 = this.b;
        List<LiveItem> list = null;
        List<LiveItem> b = enterGoodsData2 != null ? enterGoodsData2.b() : null;
        EnterGoodsData enterGoodsData3 = this.b;
        tqeVar.a(b, enterGoodsData3 != null ? enterGoodsData3.a() : list, new ruk() { // from class: tb.-$$Lambda$tqa$Tm03BU7TdwZXKrSRlTrTShlVW5Y
            @Override // tb.ruk
            /* renamed from: invoke */
            public final Object mo2427invoke() {
                return tqa.lambda$Tm03BU7TdwZXKrSRlTrTShlVW5Y(tqa.this);
            }
        });
    }

    public static final t a(tqa this$0) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("811bee8b", new Object[]{this$0});
        }
        q.d(this$0, "this$0");
        tqd tqdVar = this$0.e;
        if (tqdVar != null) {
            tqdVar.b(false);
        }
        return t.INSTANCE;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        tqe tqeVar = this.f;
        if (tqeVar != null) {
            tqeVar.c(z);
        }
        tqd tqdVar = this.e;
        if (tqdVar == null) {
            return;
        }
        tqdVar.b(z);
    }

    public final void a(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34d0e58", new Object[]{this, liveItem});
            return;
        }
        tqe tqeVar = this.f;
        if (tqeVar != null) {
            tqeVar.c(liveItem);
        }
        tqc tqcVar = this.g;
        if (tqcVar == null) {
            return;
        }
        tqcVar.d(liveItem);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        tqe tqeVar = this.f;
        if (tqeVar == null) {
            return;
        }
        tqeVar.j();
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        tqe tqeVar = this.f;
        if (tqeVar != null) {
            tqeVar.i();
        }
        tqd tqdVar = this.e;
        if (tqdVar != null) {
            tqdVar.i();
        }
        tqc tqcVar = this.g;
        if (tqcVar == null) {
            return;
        }
        tqcVar.i();
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        tqe tqeVar = this.f;
        if (tqeVar == null) {
            return;
        }
        tqeVar.b(z);
    }

    public final tqf c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tqf) ipChange.ipc$dispatch("1e6e5f73", new Object[]{this}) : this.f;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/taobao/live/liveroom/good/showcase/TaoLiveShowcaseController$Companion;", "", "<init>", "()V", "EVENT_APPEAR", "", "EVENT_DISAPPEAR", "AUCTION_CARD_SHOW", "AUCTION_CARD_HIDE", "EVENT_DISMISS_SAB_ATMOSHPERE", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-945110345);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }
}
