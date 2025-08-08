package com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.goodlist.d;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.hgu;
import tb.hgv;
import tb.hgw;
import tb.hit;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class b<T extends hgw, M extends hgu> implements hgv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public T f13751a;
    public M b;
    public com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b c = new com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b();
    public c d;

    static {
        kge.a(1661924662);
        kge.a(2119957753);
    }

    public abstract M bL_();

    public b(c cVar) {
        this.d = cVar;
        c cVar2 = this.d;
        if (cVar2 != null) {
            this.c.a(cVar2.c.b, this.d.c.c);
        }
    }

    @Override // tb.hgv
    public void a(hgw hgwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebef7c80", new Object[]{this, hgwVar});
            return;
        }
        this.f13751a = hgwVar;
        this.b = bL_();
        this.b.a(this);
    }

    @Override // tb.hgv
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    public c n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("72a85e8", new Object[]{this}) : this.d;
    }

    public com.taobao.taolive.sdk.goodlist.a a(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.goodlist.a) ipChange.ipc$dispatch("6b3cef7e", new Object[]{this, liveItem});
        }
        if (liveItem == null) {
            return null;
        }
        if (liveItem.liveItemStatusData == null) {
            liveItem.liveItemStatusData = new JSONObject();
        }
        c cVar = this.d;
        String b = (cVar == null || cVar.x() == null) ? "" : this.d.x().b();
        com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b bVar = this.c;
        c cVar2 = this.d;
        bVar.a(cVar2, liveItem, cVar2.t(), b);
        com.taobao.taolive.sdk.goodlist.a aVar = new com.taobao.taolive.sdk.goodlist.a(String.valueOf(liveItem.itemId), a(liveItem, 4), liveItem.parseJsonObject(), liveItem.goodsIndex, liveItem.extendVal != null ? liveItem.extendVal.timeVersion : 0L);
        aVar.a(liveItem, hit.a(this.d, liveItem));
        return aVar;
    }

    public int a(LiveItem liveItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33425ad3", new Object[]{this, liveItem, new Integer(i)})).intValue();
        }
        if (this.d.i()) {
            return 7;
        }
        if (liveItem != null && liveItem.extendVal != null && !StringUtils.isEmpty(liveItem.extendVal.itemBizType) && "secKill".equals(liveItem.extendVal.itemBizType) && !com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.f() && d.a()) {
            return 6;
        }
        return i;
    }
}
