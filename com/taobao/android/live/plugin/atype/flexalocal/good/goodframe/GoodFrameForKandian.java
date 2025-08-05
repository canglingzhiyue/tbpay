package com.taobao.android.live.plugin.atype.flexalocal.good.goodframe;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.goodlist.f;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.utils.y;
import tb.ddv;
import tb.ddw;
import tb.kge;
import tb.sgr;

/* loaded from: classes5.dex */
public class GoodFrameForKandian extends AbstractGoodFrame implements f, ddv, sgr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GoodFrameForKandian";

    static {
        kge.a(-1541192436);
        kge.a(-1754585422);
        kge.a(191318335);
        kge.a(1522751733);
    }

    public static /* synthetic */ Object ipc$super(GoodFrameForKandian goodFrameForKandian, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode != -1014400728) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onEvent((String) objArr[0], objArr[1]);
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : TAG;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame
    public boolean isKandian() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ed4694b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        goodRelatedInit();
        init();
    }

    public GoodFrameForKandian(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(activity, str, z, tBLiveDataModel, view, aVar);
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ddw.a().a(this);
        if (!y.a() || !com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.k().booleanValue()) {
            return;
        }
        if (!y.b(this.mContext) && !y.c(this.mContext)) {
            return;
        }
        y.a(this);
    }

    @Override // tb.sgr
    public void onScreenOrientationChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
            return;
        }
        hide();
        this.mGoodsView = null;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ddw.a().b(this);
        y.b(this);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        super.onEvent(str, obj);
        if (!str.equals("com.taobao.taolive.room.hide_goods_list.out")) {
            return;
        }
        hide();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.hide_goods_list.out", "com.taobao.taolive.goods.force_goods_timeout"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this}) : c.a(this.mGoodLiveContext);
    }
}
