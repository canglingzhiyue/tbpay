package com.taobao.search.sf.widgets.onesearch;

import android.app.Activity;
import android.app.ActivityOptions;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.munion.taosdk.MunionUrlBuilder;
import com.taobao.search.common.util.aa;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.y;
import com.taobao.search.mmd.datasource.bean.OneSearchBean;
import tb.kge;

/* loaded from: classes8.dex */
public class f implements com.taobao.search.mmd.onesearch.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f19559a;
    private final c b;

    static {
        kge.a(-1429863418);
        kge.a(1212853090);
    }

    public f(Activity activity, c cVar) {
        this.f19559a = activity;
        this.b = cVar;
    }

    @Override // com.taobao.search.mmd.onesearch.e
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String a2 = aa.a(str);
        q.a("lx", "tempUrl=" + str);
        Bundle bundle = new Bundle();
        bundle.putString("shop_id", a2);
        if (!str.contains("shop.m.taobao.com")) {
            str = "http://shop" + str.substring(str.indexOf(".m.taobao.com"));
        }
        String queryParameter = Uri.parse(str).getQueryParameter(com.taobao.alimama.c.E_URL);
        String appendEparamsToTargetUrl = MunionUrlBuilder.appendEparamsToTargetUrl(str, queryParameter, "1", "mm_12852562_1778064_24868134");
        ArrayMap arrayMap = new ArrayMap();
        int indexOf = appendEparamsToTargetUrl.indexOf("&eurl=");
        if (indexOf > 0 && indexOf < appendEparamsToTargetUrl.length()) {
            arrayMap.put("ad_cid", com.taobao.muniontaobaosdk.util.b.a(queryParameter));
            arrayMap.put("url", appendEparamsToTargetUrl.substring(0, indexOf));
        }
        com.taobao.search.mmd.util.e.a("TopSale", (ArrayMap<String, String>) arrayMap);
        String d = d(appendEparamsToTargetUrl);
        Bundle c = c(d);
        Nav withExtras = Nav.from(this.f19559a).withExtras(bundle);
        if (c != null) {
            withExtras.withOptions(c);
        }
        withExtras.toUri(d);
    }

    @Override // com.taobao.search.mmd.onesearch.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.o();
        }
    }

    @Override // com.taobao.search.mmd.onesearch.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.n();
    }

    @Override // com.taobao.search.mmd.onesearch.e
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (str != null && str.trim().length() != 0) {
            int indexOf = str.indexOf("eurl=");
            int indexOf2 = str.indexOf("etype=");
            if (indexOf > 0 && indexOf < str.length() && indexOf2 > 0 && indexOf2 < str.length()) {
                str = MunionUrlBuilder.appendEparamsToTargetUrl(str, "", "", "mm_12852562_1778064_24868134");
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put("ad_cid", com.taobao.muniontaobaosdk.util.b.a(Uri.parse(str).getQueryParameter(com.taobao.alimama.c.E_URL)));
                arrayMap.put("url", str.substring(0, indexOf));
                com.taobao.search.mmd.util.e.a("TopSale", (ArrayMap<String, String>) arrayMap);
            }
        }
        String d = d(str);
        Bundle c = c(d);
        Nav from = Nav.from(this.f19559a);
        if (c != null) {
            from.withOptions(c);
        }
        from.toUri(d);
        q.a("lx", "tempUrl=" + d);
    }

    private Bundle c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d0751678", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || !"true".equals(y.b(str, "closeNavAnimation")) || Build.VERSION.SDK_INT < 23) {
            return null;
        }
        return ActivityOptions.makeCustomAnimation(this.f19559a, 0, 0).toBundle();
    }

    private String d(String str) {
        OneSearchBean u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        c cVar = this.b;
        if (cVar == null || (u = cVar.u()) == null) {
            return str;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("list_param", u.keyword + "_" + u.abtest + "_" + u.rn);
        arrayMap.put("list_type", "starshop");
        return y.a(str, (ArrayMap<String, String>) arrayMap);
    }

    @Override // com.taobao.search.mmd.onesearch.e
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.q();
    }

    @Override // com.taobao.search.mmd.onesearch.e
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.r();
    }

    @Override // com.taobao.search.mmd.onesearch.e
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.s();
    }
}
