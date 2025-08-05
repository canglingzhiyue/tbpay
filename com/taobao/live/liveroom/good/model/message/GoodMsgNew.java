package com.taobao.live.liveroom.good.model.message;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.liveroom.good.model.LiveItem;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.kge;
import tb.tpv$b;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 22\u00060\u0002j\u0002`\u0001:\u00012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0018\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/taobao/live/liveroom/good/model/message/GoodMsgNew;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "<init>", "()V", "callbackServer", "", "getCallbackServer", "()Z", "setCallbackServer", "(Z)V", "action", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "liveItemDO", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "getLiveItemDO", "()Lcom/taobao/live/liveroom/good/model/LiveItem;", "setLiveItemDO", "(Lcom/taobao/live/liveroom/good/model/LiveItem;)V", "itemSortInfo", "Lcom/taobao/live/liveroom/good/model/message/ItemSortInfo;", "getItemSortInfo", "()Lcom/taobao/live/liveroom/good/model/message/ItemSortInfo;", "setItemSortInfo", "(Lcom/taobao/live/liveroom/good/model/message/ItemSortInfo;)V", "needChangeSort", "getNeedChangeSort", "setNeedChangeSort", "categoryItemSortInfo", "", "getCategoryItemSortInfo", "()Ljava/util/Map;", "setCategoryItemSortInfo", "(Ljava/util/Map;)V", "goodsList", "", "getGoodsList", "()Ljava/util/List;", "setGoodsList", "(Ljava/util/List;)V", "goodsIndex", "", "getGoodsIndex", "()I", "setGoodsIndex", "(I)V", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GoodMsgNew implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tpv$b Companion;

    /* renamed from: a  reason: collision with root package name */
    private boolean f17790a;
    private String b;
    private LiveItem c;
    private ItemSortInfo d;
    private boolean e;
    private Map<String, ItemSortInfo> f;
    private List<LiveItem> g;
    private int h;

    static {
        kge.a(1999114372);
        kge.a(1028243835);
        Companion = new tpv$b(null);
    }

    public final boolean getCallbackServer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cffee669", new Object[]{this})).booleanValue() : this.f17790a;
    }

    public final void setCallbackServer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e235883", new Object[]{this, new Boolean(z)});
        } else {
            this.f17790a = z;
        }
    }

    public final String getAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e81f414d", new Object[]{this}) : this.b;
    }

    public final void setAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb72d5c9", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final LiveItem a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveItem) ipChange.ipc$dispatch("a01a6e5e", new Object[]{this}) : this.c;
    }

    public final void setLiveItemDO(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82618223", new Object[]{this, liveItem});
        } else {
            this.c = liveItem;
        }
    }

    public final ItemSortInfo getItemSortInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemSortInfo) ipChange.ipc$dispatch("ed9e64a2", new Object[]{this}) : this.d;
    }

    public final void setItemSortInfo(ItemSortInfo itemSortInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15db510", new Object[]{this, itemSortInfo});
        } else {
            this.d = itemSortInfo;
        }
    }

    public final boolean getNeedChangeSort() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b8f3b25", new Object[]{this})).booleanValue() : this.e;
    }

    public final void setNeedChangeSort(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349d9b47", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public final Map<String, ItemSortInfo> getCategoryItemSortInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e7a243ef", new Object[]{this}) : this.f;
    }

    public final void setCategoryItemSortInfo(Map<String, ItemSortInfo> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d265e7f", new Object[]{this, map});
        } else {
            this.f = map;
        }
    }

    public final List<LiveItem> getGoodsList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1ea9b3c2", new Object[]{this}) : this.g;
    }

    public final void setGoodsList(List<LiveItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f389d94a", new Object[]{this, list});
        } else {
            this.g = list;
        }
    }

    public final int getGoodsIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bd3c2a8c", new Object[]{this})).intValue() : this.h;
    }

    public final void setGoodsIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212034fe", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }
}
