package com.taobao.live.liveroom.good.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import tb.kge;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 +2\u00060\u0002j\u0002`\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\u001c\u0010(\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014¨\u0006,"}, d2 = {"Lcom/taobao/live/liveroom/good/model/EnterGoodsData;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "<init>", "()V", "popItemCardList", "", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "getPopItemCardList", "()Ljava/util/List;", "setPopItemCardList", "(Ljava/util/List;)V", "curItemList", "getCurItemList", "setCurItemList", aw.PARAM_ITEM_IDS, "", "getHoldItemIds", "()Ljava/lang/String;", "setHoldItemIds", "(Ljava/lang/String;)V", aw.PARAM_ITEM_HOLD_TYPE, "getItemHoldType", "setItemHoldType", "itemGroupListInfo", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "getItemGroupListInfo", "()Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "setItemGroupListInfo", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;)V", "useRecommendItem", "", "getUseRecommendItem", "()Ljava/lang/Boolean;", "setUseRecommendItem", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "itemCardTransferInfo", "getItemCardTransferInfo", "setItemCardTransferInfo", "popId", "getPopId", "setPopId", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EnterGoodsData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a$b Companion;

    /* renamed from: a  reason: collision with root package name */
    private List<LiveItem> f17783a;
    private List<LiveItem> b;
    private String c;
    private String d;
    private Boolean f;
    private String h;
    private KMPJsonObject itemCardTransferInfo;
    private KMPJsonObject itemGroupListInfo;

    static {
        kge.a(644762664);
        kge.a(1028243835);
        Companion = new a$b(null);
    }

    public final List<LiveItem> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f17783a;
    }

    public final void setPopItemCardList(List<LiveItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8f5fa8", new Object[]{this, list});
        } else {
            this.f17783a = list;
        }
    }

    public final List<LiveItem> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.b;
    }

    public final void setCurItemList(List<LiveItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f94e7", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }

    public final String getHoldItemIds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f3e21149", new Object[]{this}) : this.c;
    }

    public final void setHoldItemIds(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a01746b5", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final String getItemHoldType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d99e7cf7", new Object[]{this}) : this.d;
    }

    public final void setItemHoldType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eacf965f", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final KMPJsonObject getItemGroupListInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KMPJsonObject) ipChange.ipc$dispatch("46915aeb", new Object[]{this}) : this.itemGroupListInfo;
    }

    public final void setItemGroupListInfo(KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2b843b", new Object[]{this, kMPJsonObject});
        } else {
            this.itemGroupListInfo = kMPJsonObject;
        }
    }

    public final Boolean getUseRecommendItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("d9ad5ee2", new Object[]{this}) : this.f;
    }

    public final void setUseRecommendItem(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b53abfc", new Object[]{this, bool});
        } else {
            this.f = bool;
        }
    }

    public final KMPJsonObject getItemCardTransferInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KMPJsonObject) ipChange.ipc$dispatch("52abfddb", new Object[]{this}) : this.itemCardTransferInfo;
    }

    public final void setItemCardTransferInfo(KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b234fe3", new Object[]{this, kMPJsonObject});
        } else {
            this.itemCardTransferInfo = kMPJsonObject;
        }
    }

    public final String getPopId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2b8f1723", new Object[]{this}) : this.h;
    }

    public final void setPopId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f32c631b", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }
}
