package com.taobao.taolive.adapterimpl.nav;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.sdk.adapter.nav.INavInterceptor;
import tb.kge;
import tb.pnw;

/* loaded from: classes8.dex */
public class c implements pnw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private INavInterceptor f21396a = null;

    static {
        kge.a(-1392765087);
        kge.a(-1789415616);
    }

    @Override // tb.pnw
    public void a(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a729a6a", new Object[]{this, context, str, bundle});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            str = a(str, "fromLiveRoom=1");
        }
        INavInterceptor iNavInterceptor = this.f21396a;
        if (iNavInterceptor != null && iNavInterceptor.a(context, str, bundle, 0, 0)) {
            return;
        }
        Nav.from(context).withExtras(bundle).toUri(str);
    }

    @Override // tb.pnw
    public void a(Context context, String str, Bundle bundle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e125d9", new Object[]{this, context, str, bundle, new Integer(i)});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            str = a(str, "fromLiveRoom=1");
        }
        INavInterceptor iNavInterceptor = this.f21396a;
        if (iNavInterceptor != null && iNavInterceptor.a(context, str, bundle, i, 0)) {
            return;
        }
        Nav.from(context).withFlags(i).withExtras(bundle).toUri(str);
    }

    @Override // tb.pnw
    public void a(INavInterceptor iNavInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0cbf841", new Object[]{this, iNavInterceptor});
        } else {
            this.f21396a = iNavInterceptor;
        }
    }

    @Override // tb.pnw
    public void b(INavInterceptor iNavInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6600142", new Object[]{this, iNavInterceptor});
        } else {
            this.f21396a = null;
        }
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        int indexOf = str.indexOf("?");
        int length = str.length();
        if (indexOf < 0) {
            return str + "?" + str2;
        } else if (length - 1 == indexOf) {
            return str + str2;
        } else {
            return str + "&" + str2;
        }
    }
}
