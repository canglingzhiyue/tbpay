package com.taobao.live.liveroom.good.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.room.utils.aw;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.io.Serializable;
import kotlin.Metadata;
import tb.kge;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u0000 -2\u00060\u0002j\u0002`\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001e\u0010$\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u001c\u0010'\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR\u001c\u0010*\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010\u0013¨\u0006."}, d2 = {"Lcom/taobao/live/liveroom/good/model/GoodLiveInfo;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "<init>", "()V", LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, "", "getLiveId", "()Ljava/lang/String;", "setLiveId", "(Ljava/lang/String;)V", aw.PARAM_ITEM_HOLD_TYPE, "getItemHoldType", "setItemHoldType", "itemConfigInfo", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "getItemConfigInfo", "()Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "setItemConfigInfo", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;)V", "itemTransferInfo", "getItemTransferInfo", "setItemTransferInfo", "admireInfo", "getAdmireInfo", "setAdmireInfo", "shopHasVip", "", "getShopHasVip", "()Ljava/lang/Boolean;", "setShopHasVip", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "shopVip", "getShopVip", "setShopVip", "hasAddCart", "getHasAddCart", "setHasAddCart", "nbItemStatus", "getNbItemStatus", "setNbItemStatus", "broadCaster", "getBroadCaster", "setBroadCaster", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GoodLiveInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b$a Companion;

    /* renamed from: a  reason: collision with root package name */
    private String f17784a;
    private KMPJsonObject admireInfo;
    private String b;
    private KMPJsonObject broadCaster;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private String i;
    private KMPJsonObject itemConfigInfo;
    private KMPJsonObject itemTransferInfo;

    static {
        kge.a(-1478710377);
        kge.a(1028243835);
        Companion = new b$a(null);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f17784a;
    }

    public final void setLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.f17784a = str;
        }
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public final void setItemHoldType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eacf965f", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final KMPJsonObject getItemConfigInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KMPJsonObject) ipChange.ipc$dispatch("3aa37ad4", new Object[]{this}) : this.itemConfigInfo;
    }

    public final void setItemConfigInfo(KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c67eb0a", new Object[]{this, kMPJsonObject});
        } else {
            this.itemConfigInfo = kMPJsonObject;
        }
    }

    public final KMPJsonObject getItemTransferInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KMPJsonObject) ipChange.ipc$dispatch("623fca8b", new Object[]{this}) : this.itemTransferInfo;
    }

    public final void setItemTransferInfo(KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265dff33", new Object[]{this, kMPJsonObject});
        } else {
            this.itemTransferInfo = kMPJsonObject;
        }
    }

    public final KMPJsonObject getAdmireInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KMPJsonObject) ipChange.ipc$dispatch("376c5537", new Object[]{this}) : this.admireInfo;
    }

    public final void setAdmireInfo(KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e433c307", new Object[]{this, kMPJsonObject});
        } else {
            this.admireInfo = kMPJsonObject;
        }
    }

    public final Boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("ce72322a", new Object[]{this}) : this.f;
    }

    public final void setShopHasVip(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb7194b", new Object[]{this, bool});
        } else {
            this.f = bool;
        }
    }

    public final Boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("18a3cb6b", new Object[]{this}) : this.g;
    }

    public final void setShopVip(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90433f41", new Object[]{this, bool});
        } else {
            this.g = bool;
        }
    }

    public final Boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("62d564ac", new Object[]{this}) : this.h;
    }

    public final void setHasAddCart(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421c57dd", new Object[]{this, bool});
        } else {
            this.h = bool;
        }
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.i;
    }

    public final void setNbItemStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fc68f8c", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public final KMPJsonObject getBroadCaster() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KMPJsonObject) ipChange.ipc$dispatch("be9c1595", new Object[]{this}) : this.broadCaster;
    }

    public final void setBroadCaster(KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c92645d1", new Object[]{this, kMPJsonObject});
        } else {
            this.broadCaster = kMPJsonObject;
        }
    }
}
