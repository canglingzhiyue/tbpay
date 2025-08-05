package com.taobao.android.live.plugin.atype.flexalocal.good.tab;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.android.live.plugin.atype.flexalocal.good.tab.GoodsMultiTabManager;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface c {
    public static final String TAB_TYPE_H5 = "h5";
    public static final String TAB_TYPE_NATIVE_DX = "nativeDX";
    public static final String TAB_TYPE_WEEX = "weex";

    GoodsMultiTabManager.NativeDXTabBundle a();

    void a(ViewPager viewPager, PagerAdapter pagerAdapter, ArrayList<VideoInfo.ExtraGoodsTabItem> arrayList);

    void a(Map<String, String> map);

    void a(Map<String, String> map, List<View> list, Context context, ViewGroup viewGroup, GoodsMultiTabManager.a aVar, GoodsMultiTabManager.b bVar);

    d b();

    void c(int i);

    int e();

    void g();

    List<d> i();
}
