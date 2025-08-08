package com.taobao.taolive.room.ui.goods.adapter;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.ui.h5.H5TabFrame;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.goodlist.i;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.kge;

/* loaded from: classes8.dex */
public class c implements i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(173440456);
        kge.a(1115987660);
    }

    @Override // com.taobao.taolive.sdk.goodlist.i
    public View a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8b852186", new Object[]{this, obj});
        }
        if (!(obj instanceof H5TabFrame)) {
            return null;
        }
        return ((H5TabFrame) obj).getView();
    }

    @Override // com.taobao.taolive.sdk.goodlist.i
    public i.a a(Context context, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem, boolean z, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i.a) ipChange.ipc$dispatch("e216f14", new Object[]{this, context, extraGoodsTabItem, new Boolean(z), tBLiveDataModel});
        }
        if (extraGoodsTabItem == null) {
            ab.a("GoodsH5TabFrameAdapter", "[initH5TabFrame] tab item = null");
            return null;
        } else if (!StringUtils.equals("h5", extraGoodsTabItem.type)) {
            ab.a("GoodsH5TabFrameAdapter", "[initH5TabFrame] tab != h5, key = " + com.taobao.taolive.sdk.goodlist.c.a(extraGoodsTabItem));
            return null;
        } else if (StringUtils.isEmpty(extraGoodsTabItem.url)) {
            ab.a("GoodsH5TabFrameAdapter", "[initH5TabFrame] tab url = null");
            return null;
        } else {
            H5TabFrame h5TabFrame = new H5TabFrame(context, z, tBLiveDataModel, n.a());
            h5TabFrame.onBindData(tBLiveDataModel);
            h5TabFrame.init(extraGoodsTabItem.url);
            ab.a("GoodsH5TabFrameAdapter", "[initH5TabFrame] frame create success, url = " + extraGoodsTabItem.url);
            return h5TabFrame;
        }
    }

    @Override // com.taobao.taolive.sdk.goodlist.i
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else if (!(obj instanceof H5TabFrame)) {
        } else {
            ((H5TabFrame) obj).onDestroy();
        }
    }
}
