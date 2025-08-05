package com.taobao.homepage.view.widgets.bgcontainer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;
import tb.kge;
import tb.lbq;

/* loaded from: classes7.dex */
public class b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final BGContainerView f17348a;

    static {
        kge.a(-521077376);
        kge.a(-81756917);
    }

    public b(BGContainerView bGContainerView, lbq lbqVar) {
        this.f17348a = bGContainerView;
        this.f17348a.setPageProvider(lbqVar);
    }

    @Override // com.taobao.homepage.view.widgets.bgcontainer.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f17348a.scrollToPosition(0);
        }
    }

    @Override // com.taobao.homepage.view.widgets.bgcontainer.c
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f17348a.getLastHeaderScrollDistance();
    }

    @Override // com.taobao.homepage.view.widgets.bgcontainer.c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f17348a.updateHeaderView();
        }
    }

    @Override // com.taobao.homepage.view.widgets.bgcontainer.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f17348a.setBGContainerVisibility(i);
        }
    }

    @Override // com.taobao.homepage.view.widgets.bgcontainer.c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f17348a.startAnimation();
        }
    }

    @Override // com.taobao.homepage.view.widgets.bgcontainer.c
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f17348a.getCurrentBgViewId();
    }

    @Override // com.taobao.homepage.view.widgets.bgcontainer.c
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.f17348a.setBgView(view);
        }
    }

    @Override // com.taobao.homepage.view.widgets.bgcontainer.c
    public void a(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c114785", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            this.f17348a.updatePullStatus(i, f);
        }
    }

    @Override // com.taobao.homepage.view.widgets.bgcontainer.c
    public Bitmap f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8b0379cb", new Object[]{this});
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.f17348a.getWidth(), this.f17348a.getHeight(), Bitmap.Config.ARGB_8888);
        this.f17348a.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override // com.taobao.homepage.view.widgets.bgcontainer.c
    public void a(JSONObject jSONObject, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("883d7879", new Object[]{this, jSONObject, list});
        } else {
            this.f17348a.updateBgConfig(jSONObject, list);
        }
    }
}
