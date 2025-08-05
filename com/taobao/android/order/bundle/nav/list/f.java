package com.taobao.android.order.bundle.nav.list;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ado;
import tb.kge;

/* loaded from: classes.dex */
public class f extends com.taobao.android.order.bundle.nav.a<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-900461066);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.order.bundle.nav.b
    public /* synthetic */ boolean c(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a8844ca", new Object[]{this, obj})).booleanValue() : b((Intent) obj);
    }

    @Override // com.taobao.android.order.bundle.nav.a
    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue() : !c(intent);
    }

    private boolean c(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa3052b", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null) {
            return false;
        }
        String uri = data.toString();
        if (uri != null && uri.startsWith(ado.URL_SEPARATOR)) {
            data = Uri.parse("http:" + uri);
        }
        if (data != null && data.isHierarchical() && (("http".equals(data.getScheme()) || "https".equals(data.getScheme())) && "true".equals(data.getQueryParameter("hybrid")))) {
            return false;
        }
        if ("trade.taobao.com".equals(data.getHost()) && "/trade/itemlist/list_bought_items.htm".equals(data.getPath()) && ("http".equals(data.getScheme()) || "https".equals(data.getScheme()))) {
            return true;
        }
        if ("taobao.trade.order".equals(data.getHost()) && "/orderlist.htm".equals(data.getPath()) && ("http".equals(data.getScheme()) || "taobao".equals(data.getScheme()) || "https".equals(data.getScheme()))) {
            return true;
        }
        if ("tm.m.taobao.com".equals(data.getHost()) && "/list.htm".equals(data.getPath()) && ("http".equals(data.getScheme()) || "https".equals(data.getScheme()))) {
            return true;
        }
        if ("go".equals(data.getHost()) && "/my_orders".equals(data.getPath()) && ("taobao".equals(data.getScheme()) || "https".equals(data.getScheme()))) {
            return true;
        }
        if ("h5.m.taobao.com".equals(data.getHost()) && "/awp/mtb/olist.htm".equals(data.getPath()) && ("http".equals(data.getScheme()) || "https".equals(data.getScheme()))) {
            return true;
        }
        if ("h5.m.taobao.com".equals(data.getHost()) && "/mlapp/olist.html".equals(data.getPath()) && ("http".equals(data.getScheme()) || "https".equals(data.getScheme()) || "taobao".equals(data.getScheme()))) {
            return true;
        }
        if ("h5.wapa.taobao.com".equals(data.getHost()) && "/mlapp/olist.html".equals(data.getPath()) && ("http".equals(data.getScheme()) || "https".equals(data.getScheme()) || "taobao".equals(data.getScheme()))) {
            return true;
        }
        if ("taobao.com".equals(data.getHost()) && "/order_search_result.htm".equals(data.getPath()) && ("http".equals(data.getScheme()) || "https".equals(data.getScheme()))) {
            z = true;
        }
        if (z) {
            intent.putExtra("isSearch", "true");
        }
        return z;
    }
}
