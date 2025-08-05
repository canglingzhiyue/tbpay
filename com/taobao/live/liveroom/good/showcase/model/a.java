package com.taobao.live.liveroom.good.showcase.model;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.liveroom.good.model.LiveItem;
import com.taobao.uniinfra_kmp.common_utils.serialization.b;
import kotlin.Metadata;
import tb.kge;
import tb.tqk;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B'\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\nJ\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aR\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/taobao/live/liveroom/good/showcase/model/TaoLiveShowcaseItemModel;", "", "liveItem", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "itemId", "", "type", "Lcom/taobao/live/liveroom/good/showcase/model/TaoLiveShowcaseType;", "<init>", "(Lcom/taobao/live/liveroom/good/model/LiveItem;Ljava/lang/Long;Lcom/taobao/live/liveroom/good/showcase/model/TaoLiveShowcaseType;)V", "(Lcom/taobao/live/liveroom/good/model/LiveItem;)V", "value", "mItemId", "getMItemId", "()J", "mType", "getMType", "()Lcom/taobao/live/liveroom/good/showcase/model/TaoLiveShowcaseType;", "mLiveItem", "getMLiveItem", "()Lcom/taobao/live/liveroom/good/model/LiveItem;", "mShowTime", "getMShowTime", "setMShowTime", "(J)V", "getLiveItemStr", "", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f17795a;
    private TaoLiveShowcaseType b;
    private LiveItem c;
    private long d;

    static {
        kge.a(915660041);
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.f17795a;
    }

    public final TaoLiveShowcaseType b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveShowcaseType) ipChange.ipc$dispatch("94ceb2f5", new Object[]{this}) : this.b;
    }

    public final LiveItem c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveItem) ipChange.ipc$dispatch("836dba9c", new Object[]{this}) : this.c;
    }

    public final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        LiveItem liveItem = this.c;
        if (liveItem == null) {
            return null;
        }
        b.a aVar = com.taobao.uniinfra_kmp.common_utils.serialization.b.Companion;
        return JSON.toJSONString(liveItem);
    }

    public a(LiveItem liveItem, Long l, TaoLiveShowcaseType taoLiveShowcaseType) {
        this.c = liveItem;
        this.f17795a = l != null ? l.longValue() : 0L;
        this.b = taoLiveShowcaseType;
    }

    public a(LiveItem liveItem) {
        TaoLiveShowcaseType taoLiveShowcaseType;
        Long a2;
        this.c = liveItem;
        this.f17795a = (liveItem == null || (a2 = liveItem.a()) == null) ? 0L : a2.longValue();
        if (tqk.Companion.a(liveItem)) {
            taoLiveShowcaseType = TaoLiveShowcaseType.TYPE_SECKILL;
        } else {
            taoLiveShowcaseType = TaoLiveShowcaseType.TYPE_NORMAL;
        }
        this.b = taoLiveShowcaseType;
    }
}
