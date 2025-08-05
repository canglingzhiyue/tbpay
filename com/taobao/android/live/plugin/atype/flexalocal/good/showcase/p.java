package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.os.Message;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import tb.ddw;
import tb.fxr;
import tb.hiq;
import tb.his;
import tb.hiu;
import tb.kge;

/* loaded from: classes5.dex */
public class p extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOWCASE_SOURCE_DETAIL_DEFAULT = "detailDefault";
    public static final String SHOWCASE_SOURCE_HOLD = "hold";
    public static final String SHOWCASE_SOURCE_PM = "pm";
    public static final String SHOWCASE_SOURCE_STASH_POP = "stashpop";
    private k h;
    private com.taobao.alilive.aliliveframework.frame.a i;

    static {
        kge.a(505266510);
    }

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    public static /* synthetic */ void a(p pVar, LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d76c20a", new Object[]{pVar, liveItem, str});
        } else {
            pVar.b(liveItem, str);
        }
    }

    public p(FrameLayout frameLayout, VideoInfo videoInfo, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        super(frameLayout, videoInfo, cVar);
        this.i = cVar.C();
    }

    public void a(LiveItem liveItem, com.taobao.taolive.sdk.core.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f554e143", new Object[]{this, liveItem, bVar});
        } else {
            b(liveItem, bVar);
        }
    }

    public void a(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1232883", new Object[]{this, liveItem});
        } else if (liveItem == null || this.h == null || liveItem.itemId != this.h.f13803a) {
        } else {
            b(liveItem);
            this.c.a(this.f13782a, liveItem, this.h);
        }
    }

    private void a(final LiveItem liveItem, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9e578d", new Object[]{this, liveItem, str});
        } else if (!this.g) {
            his.a("HighlifghtSingleGoodPlayer", "showProducts | showProducts=false");
        } else if (!a(this.b, liveItem, this.f)) {
        } else {
            his.a("HighlifghtSingleGoodPlayer", "showProducts | id=" + liveItem.itemId + " goodIndx=" + liveItem.goodsIndex + "  name=" + liveItem.itemName);
            boolean z = this.h != null;
            k kVar = this.h;
            boolean z2 = kVar != null && kVar.f13803a == liveItem.itemId;
            if (!z) {
                b(liveItem, str);
                h.a(this.f13782a, null);
                ddw a2 = ddw.a();
                com.taobao.alilive.aliliveframework.frame.a aVar = this.i;
                a2.a("good.showcase.appear", null, aVar == null ? null : aVar.G());
                this.f.c(true);
            } else if (z && !z2) {
                if (!a(this.h.c, liveItem)) {
                    return;
                }
                h.b(this.f13782a, new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.p.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                            return;
                        }
                        p.this.c.a(p.this.f13782a);
                        p.a(p.this, liveItem, str);
                        h.a(p.this.f13782a, null);
                    }
                });
            } else {
                a(liveItem, str, false);
            }
        }
    }

    private void b(LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fefe70e", new Object[]{this, liveItem, str});
            return;
        }
        b(liveItem);
        this.f13782a.setVisibility(0);
        boolean a2 = hiu.a(liveItem);
        HashMap hashMap = new HashMap();
        hashMap.put("goodOpenFrom", str);
        com.taobao.android.live.plugin.atype.flexalocal.good.track.b.a(this.f, liveItem, this.b, "", hashMap);
        if (!TextUtils.equals(str, "detailDefault")) {
            TextUtils.equals(str, "hold");
        }
        boolean h = hiq.h(liveItem);
        this.c.a(this.f13782a, liveItem);
        if (a2) {
            this.h = new k(liveItem, liveItem.itemId, ShowcaseType.TYPE_SECKILL);
        } else {
            this.h = new k(liveItem, liveItem.itemId, h ? ShowcaseType.TYPE_EXPLAININT : ShowcaseType.TYPE_NORMAL);
        }
        this.h.d = hiq.a();
    }

    private void a(LiveItem liveItem, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652d4ce7", new Object[]{this, liveItem, str, new Boolean(z)});
            return;
        }
        b(liveItem);
        boolean a2 = hiu.a(liveItem);
        HashMap hashMap = new HashMap();
        hashMap.put("goodOpenFrom", str);
        if (!z) {
            com.taobao.android.live.plugin.atype.flexalocal.good.track.b.a(this.f, liveItem, this.b, "", hashMap);
        }
        k kVar = this.h;
        if (!TextUtils.equals(str, "detailDefault")) {
            TextUtils.equals(str, "hold");
        }
        boolean h = hiq.h(liveItem);
        if (a2) {
            this.h = new k(liveItem, liveItem.itemId, ShowcaseType.TYPE_SECKILL);
            this.c.a(this.f13782a, liveItem, kVar);
        } else {
            this.h = new k(liveItem, liveItem.itemId, h ? ShowcaseType.TYPE_EXPLAININT : ShowcaseType.TYPE_NORMAL);
            this.c.a(this.f13782a, liveItem, kVar);
        }
        this.h.d = hiq.a();
    }

    private void b(LiveItem liveItem, com.taobao.taolive.sdk.core.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24064b62", new Object[]{this, liveItem, bVar});
        } else if (liveItem == null) {
        } else {
            String l = Long.toString(liveItem.itemId);
            his.a("HighlifghtSingleGoodPlayer", "checkIsNeedShow | id=" + l + "    name=" + liveItem.itemName + "  index=" + liveItem.goodsIndex);
            a(liveItem, TextUtils.equals(com.taobao.taolive.sdk.mergeInfo.b.VALUE_ITEM_HOLD_TYPE_CARD, this.b.itemHoldType) ? SHOWCASE_SOURCE_HOLD : SHOWCASE_SOURCE_DETAIL_DEFAULT);
            if (liveItem.extendVal == null || TextUtils.isEmpty(liveItem.extendVal.msgUuid)) {
                return;
            }
            his.a("HighlifghtSingleGoodPlayer", "checkIsNeedShow | msgId=" + liveItem.extendVal.msgUuid);
            bVar.addItemUUid(liveItem.extendVal.msgUuid);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.showcase.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        this.g = true;
        this.h = null;
        this.c.a(this.f13782a);
    }

    private void b(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ae4644", new Object[]{this, liveItem});
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b.c(liveItem);
        this.d.a(this.f, liveItem, this.b, "");
        com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b.a(liveItem, hiq.a());
    }

    public static boolean a(LiveItem liveItem, LiveItem liveItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e652ed62", new Object[]{liveItem, liveItem2})).booleanValue();
        }
        if (liveItem == null || liveItem2 == null) {
            return true;
        }
        int i = Integer.MAX_VALUE;
        if (liveItem.itemExtData != null && liveItem.itemExtData.containsKey("showPriority")) {
            i = fxr.a("showPriority", liveItem.itemExtData, Integer.MAX_VALUE);
        }
        int i2 = Integer.MIN_VALUE;
        if (liveItem2.itemExtData != null && liveItem2.itemExtData.containsKey("showPriority")) {
            i2 = fxr.a("showPriority", liveItem2.itemExtData, Integer.MIN_VALUE);
        }
        return i2 <= i;
    }
}
