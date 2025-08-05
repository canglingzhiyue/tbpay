package tb;

import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.liveroom.good.model.GoodLiveInfo;
import com.taobao.live.liveroom.good.model.LiveItem;
import com.taobao.live.liveroom.good.model.d;
import com.taobao.live.liveroom.good.model.e;
import com.taobao.live.liveroom.good.model.f;
import com.taobao.live.liveroom.good.showcase.model.a;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import com.taobao.uniinfra_kmp.common_utils.serialization.b;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010)H\u0004J\u0012\u0010*\u001a\u00020+2\b\u0010(\u001a\u0004\u0018\u00010)H\u0004J\u001c\u0010,\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010)2\b\u0010.\u001a\u0004\u0018\u00010)H\u0004J\u001a\u0010/\u001a\u00020+2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u00100\u001a\u00020\rH\u0004J\u0010\u00101\u001a\u00020+2\u0006\u00102\u001a\u00020\u000fH&J\u0012\u00103\u001a\u00020+2\b\u0010(\u001a\u0004\u0018\u00010)H&J\b\u00104\u001a\u00020+H\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\rX\u0084D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\rX\u0084D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\rX\u0084D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\rX\u0084D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\rX\u0084D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/taobao/live/liveroom/good/showcase/goodplayer/TaoLiveBaseGoodPlayer;", "", "mGoodLiveContext", "Lcom/taobao/live/liveroom/good/model/TaoLiveGoodLiveContext;", "delegate", "Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate;", "<init>", "(Lcom/taobao/live/liveroom/good/model/TaoLiveGoodLiveContext;Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate;)V", "getMGoodLiveContext", "()Lcom/taobao/live/liveroom/good/model/TaoLiveGoodLiveContext;", "getDelegate", "()Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate;", RPCDataItems.SWITCH_TAG_LOG, "", "mCanShowCard", "", "getMCanShowCard", "()Z", "setMCanShowCard", "(Z)V", "KEY_SHOWCASE_PRIORITY", "getKEY_SHOWCASE_PRIORITY", "()Ljava/lang/String;", "SHOWCASE_SOURCE_HOLD", "getSHOWCASE_SOURCE_HOLD", "SHOWCASE_SOURCE_DETAIL_DEFAULT", "getSHOWCASE_SOURCE_DETAIL_DEFAULT", "SHOWCASE_SOURCE_PM", "getSHOWCASE_SOURCE_PM", "SHOWCASE_SOURCE_STASH_POP", "getSHOWCASE_SOURCE_STASH_POP", "mShowcaseItemModel", "Lcom/taobao/live/liveroom/good/showcase/model/TaoLiveShowcaseItemModel;", "getMShowcaseItemModel", "()Lcom/taobao/live/liveroom/good/showcase/model/TaoLiveShowcaseItemModel;", "setMShowcaseItemModel", "(Lcom/taobao/live/liveroom/good/showcase/model/TaoLiveShowcaseItemModel;)V", "mDataHandler", "Lcom/taobao/live/liveroom/good/model/TaoLiveDataHandler;", "singleGoodShowCheck", "liveItem", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "processBeforeRender", "", "checkPriority", "currItem", "newItem", "onShowCaseShow", "goodSource", "setCanShow", "canShowCard", "refresh", "destroy", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class tqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final f f34268a;
    private final tqg b;
    private a j;
    private final String c = "TaoLiveBaseGoodPlayer";
    private boolean d = true;
    private final String e = "showPriority";
    private final String f = "hold";
    private final String g = "detailDefault";
    private final String h = "pm";
    private final String i = "stashpop";
    private final d k = new d();

    static {
        kge.a(-1801997420);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        }
    }

    public tqb(f fVar, tqg tqgVar) {
        e e;
        e e2;
        this.f34268a = fVar;
        this.b = tqgVar;
        d dVar = this.k;
        f fVar2 = this.f34268a;
        boolean z = false;
        boolean i = (fVar2 == null || (e2 = fVar2.e()) == null) ? false : e2.i();
        f fVar3 = this.f34268a;
        if (fVar3 != null && (e = fVar3.e()) != null) {
            z = e.j();
        }
        dVar.a(i, z);
    }

    public final f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("4aaee653", new Object[]{this}) : this.f34268a;
    }

    public final tqg b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tqg) ipChange.ipc$dispatch("16bcba33", new Object[]{this}) : this.b;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.f;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.g;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.h;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.i;
    }

    public final void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4ae864", new Object[]{this, aVar});
        } else {
            this.j = aVar;
        }
    }

    public final a h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("95de3b43", new Object[]{this}) : this.j;
    }

    public final boolean a(LiveItem liveItem) {
        GoodLiveInfo a2;
        GoodLiveInfo a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c34d0e5c", new Object[]{this, liveItem})).booleanValue();
        }
        String str = null;
        if (tqi.INSTANCE.a(liveItem)) {
            String str2 = this.c;
            Object[] objArr = new Object[6];
            objArr[0] = "showProducts | not show for gray, id=";
            objArr[1] = liveItem != null ? liveItem.a() : null;
            objArr[2] = " goodIndex=";
            objArr[3] = liveItem != null ? Integer.valueOf(liveItem.d()) : null;
            objArr[4] = "  name=";
            if (liveItem != null) {
                str = liveItem.c();
            }
            objArr[5] = str;
            trd.INSTANCE.b(str2, Arrays.copyOf(objArr, objArr.length));
            return false;
        }
        tqi tqiVar = tqi.INSTANCE;
        f fVar = this.f34268a;
        if (tqiVar.a((fVar == null || (a3 = fVar.a()) == null) ? null : a3.a(), liveItem)) {
            return true;
        }
        String str3 = this.c;
        Object[] objArr2 = new Object[2];
        objArr2[0] = "showProducts| liveId check fail. mVideoInfo.liveId=";
        f fVar2 = this.f34268a;
        if (fVar2 != null && (a2 = fVar2.a()) != null) {
            str = a2.a();
        }
        objArr2[1] = str;
        trd.INSTANCE.b(str3, Arrays.copyOf(objArr2, objArr2.length));
        return false;
    }

    public final void b(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d82c19", new Object[]{this, liveItem});
            return;
        }
        this.k.a(this.f34268a, liveItem, "");
        this.k.a(liveItem, tqi.INSTANCE.a());
    }

    public final boolean a(LiveItem liveItem, LiveItem liveItem2) {
        Integer num;
        Integer num2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dbfcc4c", new Object[]{this, liveItem, liveItem2})).booleanValue();
        }
        if (liveItem == null || liveItem2 == null) {
            return true;
        }
        KMPJsonObject itemExtData = liveItem.getItemExtData();
        int intValue = (itemExtData == null || (num2 = itemExtData.getInt(this.e)) == null) ? Integer.MAX_VALUE : num2.intValue();
        KMPJsonObject itemExtData2 = liveItem2.getItemExtData();
        return ((itemExtData2 == null || (num = itemExtData2.getInt(this.e)) == null) ? Integer.MIN_VALUE : num.intValue()) <= intValue;
    }

    public final void a(LiveItem liveItem, String goodSource) {
        tqg tqgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0bc5222", new Object[]{this, liveItem, goodSource});
            return;
        }
        q.d(goodSource, "goodSource");
        HashMap hashMap = new HashMap();
        hashMap.put("goodOpenFrom", goodSource);
        if (liveItem == null || (tqgVar = this.b) == null) {
            return;
        }
        b.a aVar = b.Companion;
        tqgVar.a(JSON.toJSONString(liveItem), hashMap);
    }
}
