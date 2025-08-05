package com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class GoodsBaseTempView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public c mGoodLiveContext;

    static {
        kge.a(-1377391541);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    public void showPackage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7932290", new Object[]{this});
        }
    }

    public GoodsBaseTempView(c cVar) {
        super(cVar.f());
        this.mGoodLiveContext = cVar;
    }
}
