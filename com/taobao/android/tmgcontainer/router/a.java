package com.taobao.android.tmgcontainer.router;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.d;
import com.taobao.android.nav.e;
import com.taobao.tmgcashier.TMGCashierActivity;
import tb.kge;
import tb.nan;

/* loaded from: classes6.dex */
public class a implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1801179488);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "TMGNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null && data.isHierarchical() && "true".equals(data.getQueryParameter("tmg_container"))) {
            nan.a("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_router_block", "url=" + data);
            String uri = data.toString();
            if (uri.contains("renderType=2") && !uri.contains("wh_weex=true")) {
                uri = data.buildUpon().appendQueryParameter("wh_weex", "true").build().toString();
            }
            if (!TextUtils.isEmpty(uri) && uri.contains("renderType=2")) {
                intent.setClass(dVar.a(), TMGCashierActivity.class);
                intent.setData(Uri.parse(uri));
            } else if (!TextUtils.isEmpty(uri) && !uri.contains("wh_weex=true")) {
                intent.setClass(dVar.a(), TMGCashierActivity.class);
                intent.putExtra("hasNavBar", uri.contains("hasNavBar=1") ? 1 : 0);
                intent.putExtra("url", uri);
            }
        }
        return true;
    }
}
