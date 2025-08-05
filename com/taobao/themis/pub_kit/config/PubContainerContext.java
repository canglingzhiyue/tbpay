package com.taobao.themis.pub_kit.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.pub_kit.guide.PubAddIconGuide;
import com.taobao.themis.pub_kit.guide.PubIconChangeGuide;
import com.taobao.themis.pub_kit.guide.e;
import com.taobao.themis.pub_kit.guide.h;
import java.io.Serializable;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u000206X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/taobao/themis/pub_kit/config/PubContainerContext;", "Ljava/io/Serializable;", "()V", "addIconGuideIsShowing", "", "getAddIconGuideIsShowing", "()Z", "setAddIconGuideIsShowing", "(Z)V", "hasAddToIcon", "getHasAddToIcon", "setHasAddToIcon", "hasClickAddIconButton", "getHasClickAddIconButton", "setHasClickAddIconButton", "isRecommendGuideShowing", "setRecommendGuideShowing", "pubAddIconGuide", "Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide;", "getPubAddIconGuide", "()Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide;", "setPubAddIconGuide", "(Lcom/taobao/themis/pub_kit/guide/PubAddIconGuide;)V", "pubCloseButtonGuide", "Lcom/taobao/themis/pub_kit/guide/PubCloseButtonGuide;", "getPubCloseButtonGuide", "()Lcom/taobao/themis/pub_kit/guide/PubCloseButtonGuide;", "setPubCloseButtonGuide", "(Lcom/taobao/themis/pub_kit/guide/PubCloseButtonGuide;)V", "pubIconChangeGuide", "Lcom/taobao/themis/pub_kit/guide/PubIconChangeGuide;", "getPubIconChangeGuide", "()Lcom/taobao/themis/pub_kit/guide/PubIconChangeGuide;", "setPubIconChangeGuide", "(Lcom/taobao/themis/pub_kit/guide/PubIconChangeGuide;)V", "pubOperateGuide", "Lcom/taobao/themis/pub_kit/guide/PubOperateGuide;", "getPubOperateGuide", "()Lcom/taobao/themis/pub_kit/guide/PubOperateGuide;", "setPubOperateGuide", "(Lcom/taobao/themis/pub_kit/guide/PubOperateGuide;)V", "pubRevisitBackGuide", "Lcom/taobao/themis/pub_kit/guide/PubRevisitBackGuide;", "getPubRevisitBackGuide", "()Lcom/taobao/themis/pub_kit/guide/PubRevisitBackGuide;", "setPubRevisitBackGuide", "(Lcom/taobao/themis/pub_kit/guide/PubRevisitBackGuide;)V", "userClickedCount", "", "getUserClickedCount", "()I", "setUserClickedCount", "(I)V", "userEnterTime", "", "getUserEnterTime", "()J", "setUserEnterTime", "(J)V", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubContainerContext implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean addIconGuideIsShowing;
    private boolean hasAddToIcon;
    private boolean hasClickAddIconButton;
    private boolean isRecommendGuideShowing;
    private PubAddIconGuide pubAddIconGuide;
    private com.taobao.themis.pub_kit.guide.b pubCloseButtonGuide;
    private PubIconChangeGuide pubIconChangeGuide;
    private e pubOperateGuide;
    private h pubRevisitBackGuide;
    private int userClickedCount;
    private long userEnterTime = System.currentTimeMillis();

    static {
        kge.a(-568220017);
        kge.a(1028243835);
    }

    public final boolean getHasAddToIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d16ff29c", new Object[]{this})).booleanValue() : this.hasAddToIcon;
    }

    public final void setHasAddToIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38251fb0", new Object[]{this, new Boolean(z)});
        } else {
            this.hasAddToIcon = z;
        }
    }

    public final boolean getHasClickAddIconButton() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c1ef36f3", new Object[]{this})).booleanValue() : this.hasClickAddIconButton;
    }

    public final void setHasClickAddIconButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bb70fd1", new Object[]{this, new Boolean(z)});
        } else {
            this.hasClickAddIconButton = z;
        }
    }

    public final boolean getAddIconGuideIsShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7dfe344e", new Object[]{this})).booleanValue() : this.addIconGuideIsShowing;
    }

    public final void setAddIconGuideIsShowing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3187bdd6", new Object[]{this, new Boolean(z)});
        } else {
            this.addIconGuideIsShowing = z;
        }
    }

    public final long getUserEnterTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8c6248ff", new Object[]{this})).longValue() : this.userEnterTime;
    }

    public final void setUserEnterTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9712d125", new Object[]{this, new Long(j)});
        } else {
            this.userEnterTime = j;
        }
    }

    public final e getPubOperateGuide() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("8feb6bd6", new Object[]{this}) : this.pubOperateGuide;
    }

    public final void setPubOperateGuide(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3430626", new Object[]{this, eVar});
        } else {
            this.pubOperateGuide = eVar;
        }
    }

    public final PubAddIconGuide getPubAddIconGuide() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubAddIconGuide) ipChange.ipc$dispatch("e3992326", new Object[]{this}) : this.pubAddIconGuide;
    }

    public final void setPubAddIconGuide(PubAddIconGuide pubAddIconGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6dc0e2", new Object[]{this, pubAddIconGuide});
        } else {
            this.pubAddIconGuide = pubAddIconGuide;
        }
    }

    public final com.taobao.themis.pub_kit.guide.b getPubCloseButtonGuide() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.pub_kit.guide.b) ipChange.ipc$dispatch("98aed273", new Object[]{this}) : this.pubCloseButtonGuide;
    }

    public final void setPubCloseButtonGuide(com.taobao.themis.pub_kit.guide.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7e3b4f", new Object[]{this, bVar});
        } else {
            this.pubCloseButtonGuide = bVar;
        }
    }

    public final h getPubRevisitBackGuide() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("8e970758", new Object[]{this}) : this.pubRevisitBackGuide;
    }

    public final void setPubRevisitBackGuide(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749f46be", new Object[]{this, hVar});
        } else {
            this.pubRevisitBackGuide = hVar;
        }
    }

    public final PubIconChangeGuide getPubIconChangeGuide() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubIconChangeGuide) ipChange.ipc$dispatch("2140ffb8", new Object[]{this}) : this.pubIconChangeGuide;
    }

    public final void setPubIconChangeGuide(PubIconChangeGuide pubIconChangeGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b385b4", new Object[]{this, pubIconChangeGuide});
        } else {
            this.pubIconChangeGuide = pubIconChangeGuide;
        }
    }

    public final int getUserClickedCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fd7803", new Object[]{this})).intValue() : this.userClickedCount;
    }

    public final void setUserClickedCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc4af67", new Object[]{this, new Integer(i)});
        } else {
            this.userClickedCount = i;
        }
    }

    public final boolean isRecommendGuideShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e9c8406", new Object[]{this})).booleanValue() : this.isRecommendGuideShowing;
    }

    public final void setRecommendGuideShowing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e5484a", new Object[]{this, new Boolean(z)});
        } else {
            this.isRecommendGuideShowing = z;
        }
    }
}
