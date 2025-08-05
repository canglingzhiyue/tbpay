package com.alibaba.triver.triver_shop.container.shopLoft;

import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(981366025);
    }

    public static final void a(ShopWrapWebView shopWrapWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c2f90a", new Object[]{shopWrapWebView});
            return;
        }
        q.d(shopWrapWebView, "<this>");
        WVStandardEventCenter.postNotificationToJS(shopWrapWebView, "shopContentList.containerAppear", "");
    }

    public static final void b(ShopWrapWebView shopWrapWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fcee00b", new Object[]{shopWrapWebView});
            return;
        }
        q.d(shopWrapWebView, "<this>");
        WVStandardEventCenter.postNotificationToJS(shopWrapWebView, "shopContentList.containerDisappear", "");
    }

    public static final void a(ShopWrapWebView shopWrapWebView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f73eea", new Object[]{shopWrapWebView, new Integer(i), new Integer(i2)});
            return;
        }
        q.d(shopWrapWebView, "<this>");
        WVStandardEventCenter.postNotificationToJS(shopWrapWebView, "shopContentList.media.videoPlay", com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("total", Integer.valueOf(i)), kotlin.j.a("current", Integer.valueOf(i2))).toString());
    }

    public static final void c(ShopWrapWebView shopWrapWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dac70c", new Object[]{shopWrapWebView});
            return;
        }
        q.d(shopWrapWebView, "<this>");
        WVStandardEventCenter.postNotificationToJS(shopWrapWebView, "shopContentList.media.videoPause", "");
    }

    public static final void d(ShopWrapWebView shopWrapWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde6ae0d", new Object[]{shopWrapWebView});
            return;
        }
        q.d(shopWrapWebView, "<this>");
        WVStandardEventCenter.postNotificationToJS(shopWrapWebView, "shopContentList.media.videoLongTap", "");
    }
}
