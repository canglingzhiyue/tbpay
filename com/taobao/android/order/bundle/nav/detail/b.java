package com.taobao.android.order.bundle.nav.detail;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import tb.hxd;
import tb.hyk;
import tb.hyn;
import tb.hyq;
import tb.kge;

/* loaded from: classes.dex */
public class b extends com.taobao.android.order.bundle.nav.a<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f14561a;

    static {
        kge.a(316098985);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.order.bundle.nav.b
    public /* synthetic */ boolean c(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a8844ca", new Object[]{this, obj})).booleanValue() : b((Intent) obj);
    }

    @Override // com.taobao.android.order.bundle.nav.a
    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        if (!hyk.m()) {
            return false;
        }
        String i = hyk.i();
        if (TextUtils.isEmpty(i)) {
            return false;
        }
        this.f14561a = i;
        return a(i);
    }

    public boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        String a2 = hxd.a(intent);
        String b = hxd.b(intent);
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        a.a(7, intent);
        Uri parse = Uri.parse(this.f14561a + "&" + CoreConstants.IN_PARAM_BIZ_ORDER_ID + "=" + a2 + "&" + CoreConstants.IN_PARAM_ARCHIVE + "=" + b);
        intent.setData(parse);
        String[] strArr = new String[1];
        strArr[0] = parse != null ? parse.toString() : "";
        hyn.a(CoreConstants.NAV_TAG, "DowngradeToH5Detail", strArr);
        hyq.a("DowngradeToH5Task", "DowngradeToH5Detail", "DowngradeToH5Detail");
        return true;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "true".equals(Uri.parse(str).getQueryParameter("hybrid"));
    }
}
