package com.taobao.live.liveroom.good.model.message;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import tb.kge;
import tb.tpx$b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001c2\u00060\u0002j\u0002`\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/taobao/live/liveroom/good/model/message/ItemSortInfo;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "<init>", "()V", "sortList", "", "Lcom/taobao/live/liveroom/good/model/message/ItemIdentifier;", "getSortList", "()Ljava/util/List;", "setSortList", "(Ljava/util/List;)V", "sortTime", "", "getSortTime", "()Ljava/lang/Long;", "setSortTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "customRules", "Lcom/taobao/live/liveroom/good/model/message/SortRule;", "getCustomRules", "setCustomRules", "currentItemSort", "getCurrentItemSort", "()Lcom/taobao/live/liveroom/good/model/message/ItemIdentifier;", "setCurrentItemSort", "(Lcom/taobao/live/liveroom/good/model/message/ItemIdentifier;)V", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ItemSortInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tpx$b Companion;

    /* renamed from: a  reason: collision with root package name */
    private List<ItemIdentifier> f17792a;
    private Long b;
    private List<SortRule> c;
    private ItemIdentifier d;

    static {
        kge.a(-1589092185);
        kge.a(1028243835);
        Companion = new tpx$b(null);
    }

    public final List<ItemIdentifier> getSortList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("913250ce", new Object[]{this}) : this.f17792a;
    }

    public final void setSortList(List<ItemIdentifier> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6abb4256", new Object[]{this, list});
        } else {
            this.f17792a = list;
        }
    }

    public final Long getSortTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("6bedf10d", new Object[]{this}) : this.b;
    }

    public final void setSortTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe80a253", new Object[]{this, l});
        } else {
            this.b = l;
        }
    }

    public final List<SortRule> getCustomRules() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("27382a10", new Object[]{this}) : this.c;
    }

    public final void setCustomRules(List<SortRule> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78045fbc", new Object[]{this, list});
        } else {
            this.c = list;
        }
    }

    public final ItemIdentifier getCurrentItemSort() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemIdentifier) ipChange.ipc$dispatch("d2ab5ec6", new Object[]{this}) : this.d;
    }

    public final void setCurrentItemSort(ItemIdentifier itemIdentifier) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc6ebba", new Object[]{this, itemIdentifier});
        } else {
            this.d = itemIdentifier;
        }
    }
}
