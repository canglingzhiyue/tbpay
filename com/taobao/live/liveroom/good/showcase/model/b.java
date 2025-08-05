package com.taobao.live.liveroom.good.showcase.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.liveroom.good.model.LiveItem;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.tqi;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0011J\u0010\u0010\u0016\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/live/liveroom/good/showcase/model/TaoLiveStashItemHolder;", "", "popItemCardList", "", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "speakingCardTime", "", "enableSpeakingCardOpt", "", "enableFirstCardStash", "<init>", "(Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "speaking", "Lcom/taobao/live/liveroom/good/showcase/model/TaoLiveShowcaseItemModel;", "nonSpeaking", "init", "", "update", "liveItem", "isDetailShow", "stopSpeaking", "deleteSpeaking", "getCacheItem", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f17796a;
    private final Boolean b;
    private final Boolean c;
    private a d;
    private a e;

    static {
        kge.a(-925484204);
    }

    public b(List<LiveItem> list, int i, Boolean bool, Boolean bool2) {
        this.f17796a = i;
        this.b = bool;
        this.c = bool2;
        a(list);
    }

    private final void a(List<LiveItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (q.a((Object) this.c, (Object) false)) {
        } else {
            LiveItem liveItem = list != null ? (LiveItem) p.a((List<? extends Object>) list, 0) : null;
            if (tqi.INSTANCE.b(liveItem)) {
                this.d = new a(liveItem);
            } else {
                this.e = new a(liveItem);
            }
        }
    }

    public final void a(LiveItem liveItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6556f7c", new Object[]{this, liveItem, new Boolean(z)});
            return;
        }
        if (!z) {
            this.e = null;
        }
        if (!tqi.INSTANCE.b(liveItem)) {
            return;
        }
        this.d = new a(liveItem);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d = null;
        }
    }

    public final void a(LiveItem liveItem) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34d0e58", new Object[]{this, liveItem});
        } else if (liveItem == null || (aVar = this.d) == null) {
        } else {
            if (!q.a(aVar != null ? Long.valueOf(aVar.a()) : null, liveItem.a())) {
                return;
            }
            this.d = null;
        }
    }

    public final a b() {
        KMPJsonObject extendVal;
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("82ca9d09", new Object[]{this});
        }
        if (q.a((Object) this.b, (Object) false)) {
            return null;
        }
        a aVar = this.d;
        if (aVar != null) {
            LiveItem c = aVar.c();
            long longValue = (c == null || (extendVal = c.getExtendVal()) == null || (l = extendVal.getLong("timepoint")) == null) ? -1L : l.longValue();
            if (longValue > 0 && tqi.INSTANCE.a() - longValue > this.f17796a * 1000) {
                this.d = null;
            }
        }
        a aVar2 = this.d;
        return aVar2 == null ? this.e : aVar2;
    }
}
