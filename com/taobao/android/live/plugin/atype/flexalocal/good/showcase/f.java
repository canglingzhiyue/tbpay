package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.List;
import tb.hiq;
import tb.his;
import tb.kge;

/* loaded from: classes5.dex */
public class f extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOWCASE_SOURCE_PCG = "pcgCarousel";
    private List<ItemlistV2ResponseData.ItemListv1> h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    static {
        kge.a(-552008618);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d52b322", new Object[]{fVar})).intValue() : fVar.l;
    }

    public f(FrameLayout frameLayout, VideoInfo videoInfo, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        super(frameLayout, videoInfo, cVar);
        this.i = 0;
        this.j = 5;
        this.k = 10;
        this.l = 10;
        this.m = 5;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f == null) {
            his.b("PcgGoodPlayer", "init ｜ context is null.");
        } else {
            if (this.b != null && this.b.admireInfo != null && this.b.admireInfo.contributionEnabled) {
                z = true;
            }
            if (!this.f.i() || !this.f.c.g || z) {
                his.b("PcgGoodPlayer", "init ｜ enablePcg=" + this.f.i() + " enablePcgRecCarouselShow=" + this.f.c.g);
                return;
            }
            c();
            this.e.sendEmptyMessageDelayed(1, this.j * 1000);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String str = this.f.c.h;
        if (StringUtils.isEmpty(str)) {
            his.b("PcgGoodPlayer", "initConfig ｜ config is null.");
            return;
        }
        his.a("PcgGoodPlayer", "initConfig ｜ config=" + str);
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            return;
        }
        this.j = com.taobao.taolive.sdk.utils.g.a(parseObject, "showDelay", this.j);
        this.k = com.taobao.taolive.sdk.utils.g.a(parseObject, StEvent.SHOW_TIME, this.k);
        this.l = com.taobao.taolive.sdk.utils.g.a(parseObject, "showEnd", this.l);
        this.m = com.taobao.taolive.sdk.utils.g.a(parseObject, "itemNum", this.m);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        his.a("PcgGoodPlayer", "canShowPcg | canShowCard=" + z);
        if (z) {
            return;
        }
        this.g = false;
        this.f13782a.setVisibility(8);
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message == null) {
        } else {
            if (1 == message.what) {
                if (this.f == null || this.f.x() == null) {
                    return;
                }
                this.h = this.f.x().c();
                StringBuilder sb = new StringBuilder();
                sb.append("MSG_START_SHOW_PCG | mPcgGoods | isEmpty=");
                List<ItemlistV2ResponseData.ItemListv1> list = this.h;
                if (list == null || list.isEmpty()) {
                    z = true;
                }
                sb.append(z);
                sb.append(" mCanShowCard=");
                sb.append(this.g);
                his.a("PcgGoodPlayer", sb.toString());
                d();
            } else if (2 == message.what) {
                h.b(this.f13782a, new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.f.1
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
                        f.this.f13782a.setVisibility(8);
                        f.this.e.sendEmptyMessageDelayed(3, f.a(f.this) * 1000);
                    }
                });
            } else if (3 != message.what) {
            } else {
                d();
            }
        }
    }

    private boolean d() {
        List<ItemlistV2ResponseData.ItemListv1> list;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.g && (list = this.h) != null && !list.isEmpty()) {
            if (this.i >= this.h.size() || (i = this.i) >= this.m) {
                his.a("PcgGoodPlayer", "showPcg | mCurrentPlayIndex=" + this.i + " size=" + this.h.size() + "   mItemNum=" + this.m);
            } else {
                ItemlistV2ResponseData.ItemListv1 itemListv1 = this.h.get(i);
                this.i++;
                if (itemListv1 == null || itemListv1.liveItemDO == null) {
                    return d();
                }
                if (!a(this.b, itemListv1.liveItemDO, this.f)) {
                    return d();
                }
                if (itemListv1.liveItemDO.extendVal != null && Boolean.parseBoolean(itemListv1.liveItemDO.extendVal.closePopItem)) {
                    his.a("PcgGoodPlayer", "showProducts | item is filter, itemId=" + itemListv1.liveItemDO.goodsIndex);
                    return false;
                } else if (com.taobao.taolive.sdk.goodlist.c.b(itemListv1.liveItemDO) && !hiq.i(itemListv1.liveItemDO)) {
                    his.a("PcgGoodPlayer", "showPcg | isRec and gift is empty. itemId=" + itemListv1.liveItemDO.itemId + " name=" + itemListv1.liveItemDO.itemName);
                    return d();
                } else {
                    com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b.c(itemListv1.liveItemDO);
                    this.d.a(this.f, itemListv1.liveItemDO, this.b, "");
                    com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b.a(itemListv1.liveItemDO, hiq.a());
                    his.a("PcgGoodPlayer", "showPcg | itemId=" + itemListv1.liveItemDO.itemId + " name=" + itemListv1.liveItemDO.itemName + " goodIndex=" + itemListv1.liveItemDO.goodsIndex);
                    this.f13782a.setVisibility(0);
                    this.c.a(this.f13782a, itemListv1.liveItemDO);
                    h.a(this.f13782a, null);
                    this.e.sendEmptyMessageDelayed(2, (long) (this.k * 1000));
                    HashMap hashMap = new HashMap();
                    hashMap.put("goodOpenFrom", SHOWCASE_SOURCE_PCG);
                    com.taobao.android.live.plugin.atype.flexalocal.good.track.b.a(this.f, itemListv1.liveItemDO, this.b, "", hashMap);
                    return true;
                }
            }
        }
        return false;
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
        this.i = 0;
    }
}
