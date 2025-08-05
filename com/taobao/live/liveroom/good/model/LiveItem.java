package com.taobao.live.liveroom.good.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonArray;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.kge;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0087\u00012\u00060\u0002j\u0002`\u0001:\u0006\u0087\u0001\u0088\u0001\u0089\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\nR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\nR\u001c\u0010!\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\b\"\u0004\b#\u0010\nR\u001c\u0010$\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\b\"\u0004\b&\u0010\nR\u001c\u0010'\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\u001a\u00103\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R\u001c\u00106\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\b\"\u0004\b8\u0010\nR\u001a\u00109\u001a\u00020:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R\u001c\u0010B\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010H\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\b\"\u0004\bI\u0010\nR\u001a\u0010J\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010-\"\u0004\bL\u0010/R\u001c\u0010M\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\b\"\u0004\bO\u0010\nR\u001a\u0010P\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010-\"\u0004\bQ\u0010/R\u001c\u0010R\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\b\"\u0004\bT\u0010\nR\u001c\u0010U\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\b\"\u0004\bV\u0010\nR\u001a\u0010W\u001a\u00020:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010<\"\u0004\bY\u0010>R\u001c\u0010Z\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010E\"\u0004\b\\\u0010GR\u001c\u0010]\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010E\"\u0004\b_\u0010GR\u001c\u0010`\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010E\"\u0004\bb\u0010GR(\u0010c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001c\u0010i\u001a\u0004\u0018\u00010jX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001c\u0010o\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010E\"\u0004\bq\u0010GR\u001c\u0010r\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010E\"\u0004\bt\u0010GR\u001c\u0010u\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010E\"\u0004\bw\u0010GR\u001c\u0010x\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010\b\"\u0004\bz\u0010\nR\u001c\u0010{\u001a\u0004\u0018\u00010jX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010l\"\u0004\b}\u0010nR\u001d\u0010~\u001a\u0004\u0018\u00010jX\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010l\"\u0005\b\u0080\u0001\u0010nR\"\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u008a\u0001"}, d2 = {"Lcom/taobao/live/liveroom/good/model/LiveItem;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "<init>", "()V", "clickSource", "", "getClickSource", "()Ljava/lang/String;", "setClickSource", "(Ljava/lang/String;)V", "cpsClickPos", "getCpsClickPos", "setCpsClickPos", "itemId", "", "getItemId", "()Ljava/lang/Long;", "setItemId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, "getLiveId", "setLiveId", "itemName", "getItemName", "setItemName", "itemShortTitle", "getItemShortTitle", "setItemShortTitle", "itemPic", "getItemPic", "setItemPic", "itemUrl", "getItemUrl", "setItemUrl", "itemPrice", "getItemPrice", "setItemPrice", "itemH5TaokeUrl", "getItemH5TaokeUrl", "setItemH5TaokeUrl", "native_vipTagsShow", "", "getNative_vipTagsShow", "()Z", "setNative_vipTagsShow", "(Z)V", "native_topItemAnimShow", "getNative_topItemAnimShow", "setNative_topItemAnimShow", "native_canShowVipEntrance", "getNative_canShowVipEntrance", "setNative_canShowVipEntrance", "native_buttonStatus", "getNative_buttonStatus", "setNative_buttonStatus", "goodsIndex", "", "getGoodsIndex", "()I", "setGoodsIndex", "(I)V", "groupNum", "getGroupNum", "setGroupNum", "extendVal", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "getExtendVal", "()Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "setExtendVal", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;)V", "isTop", "setTop", "itemTimeshift", "getItemTimeshift", "setItemTimeshift", "native_channel", "getNative_channel", "setNative_channel", "isSpeaking", "setSpeaking", "itemType", "getItemType", "setItemType", "isSubscribe", "setSubscribe", "_itemPos", "get_itemPos", "set_itemPos", "personalityData", "getPersonalityData", "setPersonalityData", "liveItemStatusData", "getLiveItemStatusData", "setLiveItemStatusData", "itemExtData", "getItemExtData", "setItemExtData", "extraUTParams", "", "getExtraUTParams", "()Ljava/util/Map;", "setExtraUTParams", "(Ljava/util/Map;)V", "native_itemBenefits", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonArray;", "getNative_itemBenefits", "()Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonArray;", "setNative_itemBenefits", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonArray;)V", "itemConfigInfo", "getItemConfigInfo", "setItemConfigInfo", "nativeConfigInfos", "getNativeConfigInfos", "setNativeConfigInfos", "itemActionData", "getItemActionData", "setItemActionData", "asac", "getAsac", "setAsac", "picTopLabels", "getPicTopLabels", "setPicTopLabels", "itemIcons", "getItemIcons", "setItemIcons", "sabItemAtmosphere", "Lcom/taobao/live/liveroom/good/model/LiveItem$SabItemAtmosphere;", "getSabItemAtmosphere", "()Lcom/taobao/live/liveroom/good/model/LiveItem$SabItemAtmosphere;", "setSabItemAtmosphere", "(Lcom/taobao/live/liveroom/good/model/LiveItem$SabItemAtmosphere;)V", "Companion", "LiveItemBenefit", "SabItemAtmosphere", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LiveItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c$b Companion;
    private Map<String, String> B;
    private String G;
    private SabItemAtmosphere J;

    /* renamed from: a  reason: collision with root package name */
    private String f17785a;
    private String b;
    private Long c;
    private String d;
    private String e;
    private KMPJsonObject extendVal;
    private String f;
    private String g;
    private String h;
    private String i;
    private KMPJsonObject itemActionData;
    private KMPJsonObject itemConfigInfo;
    private KMPJsonObject itemExtData;
    private KMPJsonArray itemIcons;
    private String j;
    private boolean k;
    private boolean l;
    private KMPJsonObject liveItemStatusData;
    private boolean m;
    private String n;
    private KMPJsonObject nativeConfigInfos;
    private KMPJsonArray native_itemBenefits;
    private int o = -1;
    private int p = this.o;
    private KMPJsonObject personalityData;
    private KMPJsonArray picTopLabels;
    private String r;
    private boolean s;
    private String t;
    private boolean u;
    private String v;
    private String w;
    private int x;

    static {
        kge.a(-1491342817);
        kge.a(1028243835);
        Companion = new c$b(null);
    }

    public final String getClickSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("63ee1e8c", new Object[]{this}) : this.f17785a;
    }

    public final void setClickSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318ce1d2", new Object[]{this, str});
        } else {
            this.f17785a = str;
        }
    }

    public final String getCpsClickPos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f775e3d", new Object[]{this}) : this.b;
    }

    public final void setCpsClickPos(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772b9841", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final Long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("c9b62fad", new Object[]{this}) : this.c;
    }

    public final void setItemId(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db724956", new Object[]{this, l});
        } else {
            this.c = l;
        }
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.d;
    }

    public final void setLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.e;
    }

    public final void setItemName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f74f151", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final String getItemShortTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("86d69474", new Object[]{this}) : this.f;
    }

    public final void setItemShortTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c81b82", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public final String getItemPic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f977f458", new Object[]{this}) : this.g;
    }

    public final void setItemPic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8a1f86", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public final String getItemUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3bf1b193", new Object[]{this}) : this.h;
    }

    public final void setItemUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("494809ab", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public final String getItemPrice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("73090bb9", new Object[]{this}) : this.i;
    }

    public final void setItemPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70562745", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public final String getItemH5TaokeUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6f286f0", new Object[]{this}) : this.j;
    }

    public final void setItemH5TaokeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82a7886", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final boolean getNative_vipTagsShow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e14efcc", new Object[]{this})).booleanValue() : this.k;
    }

    public final boolean getNative_topItemAnimShow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b429c2f", new Object[]{this})).booleanValue() : this.l;
    }

    public final void setNative_topItemAnimShow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529a77d", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public final boolean getNative_canShowVipEntrance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3619e3c3", new Object[]{this})).booleanValue() : this.m;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public final String getNative_buttonStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eca63303", new Object[]{this}) : this.n;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.o;
    }

    public final void setGoodsIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212034fe", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public final int getGroupNum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d4c8b3f7", new Object[]{this})).intValue() : this.p;
    }

    public final void setGroupNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5724a5f3", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public final KMPJsonObject getExtendVal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KMPJsonObject) ipChange.ipc$dispatch("6e7a465c", new Object[]{this}) : this.extendVal;
    }

    public final void setExtendVal(KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e566baea", new Object[]{this, kMPJsonObject});
        } else {
            this.extendVal = kMPJsonObject;
        }
    }

    public final String isTop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91a6d80e", new Object[]{this}) : this.r;
    }

    public final void setTop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927013e4", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    public final boolean getItemTimeshift() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a45a76d7", new Object[]{this})).booleanValue() : this.s;
    }

    public final void setItemTimeshift(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e20986d", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public final String getNative_channel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("229af1c8", new Object[]{this}) : this.t;
    }

    public final void setNative_channel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418f68ae", new Object[]{this, str});
        } else {
            this.t = str;
        }
    }

    public final boolean isSpeaking() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9643da5", new Object[]{this})).booleanValue() : this.u;
    }

    public final void setSpeaking(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221af51b", new Object[]{this, new Boolean(z)});
        } else {
            this.u = z;
        }
    }

    public final String getItemType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("62d8a076", new Object[]{this}) : this.v;
    }

    public final void setItemType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8318c8c0", new Object[]{this, str});
        } else {
            this.v = str;
        }
    }

    public final String isSubscribe() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b8617b9", new Object[]{this}) : this.w;
    }

    public final void setSubscribe(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b013d399", new Object[]{this, str});
        } else {
            this.w = str;
        }
    }

    public final int get_itemPos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("face9ad2", new Object[]{this})).intValue() : this.x;
    }

    public final void set_itemPos(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1db9a78", new Object[]{this, new Integer(i)});
        } else {
            this.x = i;
        }
    }

    public final KMPJsonObject getPersonalityData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KMPJsonObject) ipChange.ipc$dispatch("4355caeb", new Object[]{this}) : this.personalityData;
    }

    public final void setPersonalityData(KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17efe13b", new Object[]{this, kMPJsonObject});
        } else {
            this.personalityData = kMPJsonObject;
        }
    }

    public final KMPJsonObject getLiveItemStatusData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KMPJsonObject) ipChange.ipc$dispatch("92e5691c", new Object[]{this}) : this.liveItemStatusData;
    }

    public final void setLiveItemStatusData(KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("680d5fc2", new Object[]{this, kMPJsonObject});
        } else {
            this.liveItemStatusData = kMPJsonObject;
        }
    }

    public final KMPJsonObject getItemExtData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KMPJsonObject) ipChange.ipc$dispatch("e8c77a4b", new Object[]{this}) : this.itemExtData;
    }

    public final void setItemExtData(KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46777db", new Object[]{this, kMPJsonObject});
        } else {
            this.itemExtData = kMPJsonObject;
        }
    }

    public final Map<String, String> getExtraUTParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d234221b", new Object[]{this}) : this.B;
    }

    public final void setExtraUTParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e3ac56b", new Object[]{this, map});
        } else {
            this.B = map;
        }
    }

    public final KMPJsonArray getNative_itemBenefits() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KMPJsonArray) ipChange.ipc$dispatch("1228cb72", new Object[]{this}) : this.native_itemBenefits;
    }

    public final void setNative_itemBenefits(KMPJsonArray kMPJsonArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a377acfe", new Object[]{this, kMPJsonArray});
        } else {
            this.native_itemBenefits = kMPJsonArray;
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

    public final KMPJsonObject getNativeConfigInfos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KMPJsonObject) ipChange.ipc$dispatch("a10de57", new Object[]{this}) : this.nativeConfigInfos;
    }

    public final void setNativeConfigInfos(KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9c6e4f", new Object[]{this, kMPJsonObject});
        } else {
            this.nativeConfigInfos = kMPJsonObject;
        }
    }

    public final KMPJsonObject getItemActionData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KMPJsonObject) ipChange.ipc$dispatch("89a204e4", new Object[]{this}) : this.itemActionData;
    }

    public final void setItemActionData(KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d3aa2fa", new Object[]{this, kMPJsonObject});
        } else {
            this.itemActionData = kMPJsonObject;
        }
    }

    public final String getAsac() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f65364ef", new Object[]{this}) : this.G;
    }

    public final void setAsac(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68987967", new Object[]{this, str});
        } else {
            this.G = str;
        }
    }

    public final KMPJsonArray getPicTopLabels() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KMPJsonArray) ipChange.ipc$dispatch("5348d2d1", new Object[]{this}) : this.picTopLabels;
    }

    public final void setPicTopLabels(KMPJsonArray kMPJsonArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c5294e7", new Object[]{this, kMPJsonArray});
        } else {
            this.picTopLabels = kMPJsonArray;
        }
    }

    public final KMPJsonArray getItemIcons() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KMPJsonArray) ipChange.ipc$dispatch("e716f1a2", new Object[]{this}) : this.itemIcons;
    }

    public final void setItemIcons(KMPJsonArray kMPJsonArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ffebce", new Object[]{this, kMPJsonArray});
        } else {
            this.itemIcons = kMPJsonArray;
        }
    }

    public final SabItemAtmosphere k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SabItemAtmosphere) ipChange.ipc$dispatch("1ba0d62f", new Object[]{this}) : this.J;
    }

    public final void setSabItemAtmosphere(SabItemAtmosphere sabItemAtmosphere) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b731ac59", new Object[]{this, sabItemAtmosphere});
        } else {
            this.J = sabItemAtmosphere;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 D2\u00060\u0002j\u0002`\u0001:\u0001DB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\b\"\u0004\b1\u0010\nR\u001c\u00102\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\b\"\u0004\b4\u0010\nR\u001c\u00105\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\b\"\u0004\b7\u0010\nR\u001c\u00108\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\b\"\u0004\b:\u0010\nR\u001a\u0010;\u001a\u00020<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010A\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\b\"\u0004\bC\u0010\n¨\u0006E"}, d2 = {"Lcom/taobao/live/liveroom/good/model/LiveItem$LiveItemBenefit;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "<init>", "()V", "leftValue", "", "getLeftValue", "()Ljava/lang/String;", "setLeftValue", "(Ljava/lang/String;)V", "rightValue", "getRightValue", "setRightValue", "middleValue", "getMiddleValue", "setMiddleValue", "type", NetworkAbility.API_GET_TYPE, "setType", "url", "getUrl", "setUrl", "styleType", "getStyleType", "setStyleType", "sightType", "getSightType", "setSightType", "orderVal", "getOrderVal", "setOrderVal", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "endTime", "getEndTime", "setEndTime", "detailInfo", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "getDetailInfo", "()Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "setDetailInfo", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;)V", "styleTypeNew", "getStyleTypeNew", "setStyleTypeNew", "leftValueNew", "getLeftValueNew", "setLeftValueNew", "rightValueNew", "getRightValueNew", "setRightValueNew", "middleValueNew", "getMiddleValueNew", "setMiddleValueNew", "needServiceTag", "", "getNeedServiceTag", "()Z", "setNeedServiceTag", "(Z)V", "textColor", "getTextColor", "setTextColor", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class LiveItemBenefit implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a Companion;
        private KMPJsonObject detailInfo;
        private long endTime;
        private String leftValue;
        private String leftValueNew;
        private String middleValue;
        private String middleValueNew;
        private boolean needServiceTag;
        private String orderVal;
        private String rightValue;
        private String rightValueNew;
        private String sightType;
        private long startTime;
        private String styleType;
        private String styleTypeNew;
        private String textColor;
        private String type;
        private String url;

        static {
            kge.a(1409542355);
            kge.a(1028243835);
            Companion = new a(null);
        }

        public final String getLeftValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("facd7085", new Object[]{this}) : this.leftValue;
        }

        public final void setLeftValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e11e5bf9", new Object[]{this, str});
            } else {
                this.leftValue = str;
            }
        }

        public final String getRightValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12a04f2e", new Object[]{this}) : this.rightValue;
        }

        public final void setRightValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8531e08", new Object[]{this, str});
            } else {
                this.rightValue = str;
            }
        }

        public final String getMiddleValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("62ff4f13", new Object[]{this}) : this.middleValue;
        }

        public final void setMiddleValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14a1c22b", new Object[]{this, str});
            } else {
                this.middleValue = str;
            }
        }

        public final String getType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
        }

        public final void setType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
            } else {
                this.type = str;
            }
        }

        public final String getUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.url;
        }

        public final void setUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
            } else {
                this.url = str;
            }
        }

        public final String getStyleType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3e93c444", new Object[]{this}) : this.styleType;
        }

        public final void setStyleType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1622801a", new Object[]{this, str});
            } else {
                this.styleType = str;
            }
        }

        public final String getSightType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bfea09d8", new Object[]{this}) : this.sightType;
        }

        public final void setSightType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf94ed06", new Object[]{this, str});
            } else {
                this.sightType = str;
            }
        }

        public final String getOrderVal() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f2ce030", new Object[]{this}) : this.orderVal;
        }

        public final void setOrderVal(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e14c8046", new Object[]{this, str});
            } else {
                this.orderVal = str;
            }
        }

        public final long getStartTime() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue() : this.startTime;
        }

        public final void setStartTime(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0c94730", new Object[]{this, new Long(j)});
            } else {
                this.startTime = j;
            }
        }

        public final long getEndTime() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("250d18d", new Object[]{this})).longValue() : this.endTime;
        }

        public final void setEndTime(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e12d357", new Object[]{this, new Long(j)});
            } else {
                this.endTime = j;
            }
        }

        public final KMPJsonObject getDetailInfo() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (KMPJsonObject) ipChange.ipc$dispatch("42cba738", new Object[]{this}) : this.detailInfo;
        }

        public final void setDetailInfo(KMPJsonObject kMPJsonObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44beb126", new Object[]{this, kMPJsonObject});
            } else {
                this.detailInfo = kMPJsonObject;
            }
        }

        public final String getStyleTypeNew() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6515504e", new Object[]{this}) : this.styleTypeNew;
        }

        public final void setStyleTypeNew(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce332de8", new Object[]{this, str});
            } else {
                this.styleTypeNew = str;
            }
        }

        public final String getLeftValueNew() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6089b06d", new Object[]{this}) : this.leftValueNew;
        }

        public final void setLeftValueNew(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("414ad1a9", new Object[]{this, str});
            } else {
                this.leftValueNew = str;
            }
        }

        public final String getRightValueNew() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c4aee524", new Object[]{this}) : this.rightValueNew;
        }

        public final void setRightValueNew(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cda13a", new Object[]{this, str});
            } else {
                this.rightValueNew = str;
            }
        }

        public final String getMiddleValueNew() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a3e39f1f", new Object[]{this}) : this.middleValueNew;
        }

        public final void setMiddleValueNew(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e95c6637", new Object[]{this, str});
            } else {
                this.middleValueNew = str;
            }
        }

        public final boolean getNeedServiceTag() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63b1aadc", new Object[]{this})).booleanValue() : this.needServiceTag;
        }

        public final void setNeedServiceTag(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60c92270", new Object[]{this, new Boolean(z)});
            } else {
                this.needServiceTag = z;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/live/liveroom/good/model/LiveItem$LiveItemBenefit$Companion;", "", "<init>", "()V", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class a {
            static {
                kge.a(-464443301);
            }

            public /* synthetic */ a(o oVar) {
                this();
            }

            private a() {
            }
        }

        public final String getTextColor() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e093f79", new Object[]{this}) : this.textColor;
        }

        public final void setTextColor(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("255c6b85", new Object[]{this, str});
            } else {
                this.textColor = str;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u0000 \u001d2\u00060\u0002j\u0002`\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/taobao/live/liveroom/good/model/LiveItem$SabItemAtmosphere;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "<init>", "()V", "rightType", "", "getRightType", "()Ljava/lang/String;", "setRightType", "(Ljava/lang/String;)V", "subRightType", "getSubRightType", "setSubRightType", "posterMark", "getPosterMark", "setPosterMark", "benefitTitle", "getBenefitTitle", "setBenefitTitle", "benefitTitleImg", "getBenefitTitleImg", "setBenefitTitleImg", "subBenefitTitle", "getSubBenefitTitle", "setSubBenefitTitle", "atmosphereBgImg", "getAtmosphereBgImg", "setAtmosphereBgImg", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class SabItemAtmosphere implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c$e$b Companion;

        /* renamed from: a  reason: collision with root package name */
        private String f17786a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;

        static {
            kge.a(-1707488732);
            kge.a(1028243835);
            Companion = new c$e$b(null);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f17786a;
        }

        public final void setRightType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aaac24c5", new Object[]{this, str});
            } else {
                this.f17786a = str;
            }
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public final void setSubRightType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c570729", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public final String getPosterMark() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f215b49", new Object[]{this}) : this.c;
        }

        public final void setPosterMark(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bf3954d", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public final String getBenefitTitle() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c74058e2", new Object[]{this}) : this.d;
        }

        public final void setBenefitTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b16937d4", new Object[]{this, str});
            } else {
                this.d = str;
            }
        }

        public final String getBenefitTitleImg() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4da164ad", new Object[]{this}) : this.e;
        }

        public final void setBenefitTitleImg(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20b305d1", new Object[]{this, str});
            } else {
                this.e = str;
            }
        }

        public final String getSubBenefitTitle() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a73fae", new Object[]{this}) : this.f;
        }

        public final void setSubBenefitTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce688af0", new Object[]{this, str});
            } else {
                this.f = str;
            }
        }

        public final String getAtmosphereBgImg() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96bc13b3", new Object[]{this}) : this.g;
        }

        public final void setAtmosphereBgImg(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faee378b", new Object[]{this, str});
            } else {
                this.g = str;
            }
        }
    }
}
