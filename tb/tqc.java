package tb;

import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.liveroom.good.model.GoodLiveInfo;
import com.taobao.live.liveroom.good.model.LiveItem;
import com.taobao.live.liveroom.good.model.f;
import com.taobao.live.liveroom.good.showcase.model.TaoLiveShowcaseType;
import com.taobao.taolive.sdk.mergeInfo.b;
import com.taobao.taolive.sdk.model.d;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import com.taobao.uniinfra_kmp.common_utils.serialization.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.tqg;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u001a\u0010\u000f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u001a\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\"\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/live/liveroom/good/showcase/goodplayer/TaoLiveHighlightGoodPlayer;", "Lcom/taobao/live/liveroom/good/showcase/goodplayer/TaoLiveBaseGoodPlayer;", "goodLiveContext", "Lcom/taobao/live/liveroom/good/model/TaoLiveGoodLiveContext;", "delegate", "Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate;", "<init>", "(Lcom/taobao/live/liveroom/good/model/TaoLiveGoodLiveContext;Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate;)V", RPCDataItems.SWITCH_TAG_LOG, "", "init", "", "liveItem", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "checkIsNeedShow", "showProducts", "goodSource", "render", "refresh", "isHotSale", "", "setCanShow", "canShowCard", "destroy", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class tqc extends tqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f34269a;

    static {
        kge.a(-1761679091);
    }

    public static /* synthetic */ Object ipc$super(tqc tqcVar, String str, Object... objArr) {
        if (str.hashCode() == 98379888) {
            super.i();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void a(tqc tqcVar, LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fcf0d4c", new Object[]{tqcVar, liveItem, str});
        } else {
            tqcVar.c(liveItem, str);
        }
    }

    public tqc(f fVar, tqg tqgVar) {
        super(fVar, tqgVar);
        this.f34269a = "TaoLiveHighlightGoodPlayer";
    }

    public final void c(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6349da", new Object[]{this, liveItem});
        } else {
            e(liveItem);
        }
    }

    private final void e(LiveItem liveItem) {
        tqg b;
        String string;
        GoodLiveInfo a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d179855c", new Object[]{this, liveItem});
        } else if (liveItem == null) {
        } else {
            String valueOf = String.valueOf(liveItem.a());
            String str = this.f34269a;
            Object[] objArr = {"checkIsNeedShow | id=", valueOf, "    name=", liveItem.c(), "  index=", Integer.valueOf(liveItem.d())};
            trd.INSTANCE.a(str, Arrays.copyOf(objArr, objArr.length));
            f a3 = a();
            String str2 = null;
            b(liveItem, q.a((Object) ((a3 == null || (a2 = a3.a()) == null) ? null : a2.b()), (Object) b.VALUE_ITEM_HOLD_TYPE_CARD) ? d() : e());
            KMPJsonObject extendVal = liveItem.getExtendVal();
            if (extendVal != null && (string = extendVal.getString(d.TYPE_MSG_UUID)) != null) {
                if (string.length() > 0) {
                    z = true;
                }
            }
            if (!z || (b = b()) == null) {
                return;
            }
            KMPJsonObject extendVal2 = liveItem.getExtendVal();
            if (extendVal2 != null) {
                str2 = extendVal2.getString(d.TYPE_MSG_UUID);
            }
            b.b(str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(com.taobao.live.liveroom.good.model.LiveItem r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tqc.b(com.taobao.live.liveroom.good.model.LiveItem, java.lang.String):void");
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/taobao/live/liveroom/good/showcase/goodplayer/TaoLiveHighlightGoodPlayer$showProducts$1", "Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate$AnimationListener;", "onAnimationStart", "", "onAnimationEnd", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class a implements tqg.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ LiveItem b;
        public final /* synthetic */ String c;

        @Override // tb.tqg.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public a(LiveItem liveItem, String str) {
            this.b = liveItem;
            this.c = str;
        }

        @Override // tb.tqg.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            tqc.this.b().f();
            tqc.a(tqc.this, this.b, this.c);
            tqc.this.b().e();
        }
    }

    private final void c(LiveItem liveItem, String str) {
        com.taobao.live.liveroom.good.showcase.model.a aVar;
        tqg b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d35f7124", new Object[]{this, liveItem, str});
            return;
        }
        b(liveItem);
        tqg b2 = b();
        if (b2 != null) {
            b2.d();
        }
        boolean a2 = tqk.Companion.a(liveItem);
        boolean b3 = tqi.INSTANCE.b(liveItem);
        if (liveItem != null && (b = b()) != null) {
            b.a aVar2 = com.taobao.uniinfra_kmp.common_utils.serialization.b.Companion;
            b.a(JSON.toJSONString(liveItem));
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
            aVar = new com.taobao.live.liveroom.good.showcase.model.a(liveItem, l, b3 ? TaoLiveShowcaseType.TYPE_EXPLAININT : TaoLiveShowcaseType.TYPE_NORMAL);
        }
        a(aVar);
        com.taobao.live.liveroom.good.showcase.model.a h = h();
        if (h != null) {
            h.a(tqi.INSTANCE.a());
        }
        a(liveItem, str);
    }

    private final void a(LiveItem liveItem, String str, boolean z) {
        com.taobao.live.liveroom.good.showcase.model.a aVar;
        tqg b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cea4f2", new Object[]{this, liveItem, str, new Boolean(z)});
            return;
        }
        b(liveItem);
        boolean a2 = tqk.Companion.a(liveItem);
        if (!z) {
            a(liveItem, str);
        }
        com.taobao.live.liveroom.good.showcase.model.a h = h();
        boolean b2 = tqi.INSTANCE.b(liveItem);
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
            aVar = new com.taobao.live.liveroom.good.showcase.model.a(liveItem, l, b2 ? TaoLiveShowcaseType.TYPE_EXPLAININT : TaoLiveShowcaseType.TYPE_NORMAL);
        }
        a(aVar);
        if (liveItem != null && (b = b()) != null) {
            b.a aVar2 = com.taobao.uniinfra_kmp.common_utils.serialization.b.Companion;
            b.a(JSON.toJSONString(liveItem), h);
        }
        com.taobao.live.liveroom.good.showcase.model.a h2 = h();
        if (h2 == null) {
            return;
        }
        h2.a(tqi.INSTANCE.a());
    }

    public void d(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dee679b", new Object[]{this, liveItem});
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
            tqg b = b();
            if (b == null) {
                return;
            }
            b.a aVar = com.taobao.uniinfra_kmp.common_utils.serialization.b.Companion;
            b.a(JSON.toJSONString(liveItem), h());
        }
    }

    @Override // tb.tqb
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            super.i();
        }
    }
}
