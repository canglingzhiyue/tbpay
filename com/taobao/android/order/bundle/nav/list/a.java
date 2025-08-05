package com.taobao.android.order.bundle.nav.list;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import tb.hyk;
import tb.hyn;
import tb.hyq;
import tb.kge;

/* loaded from: classes.dex */
public class a extends com.taobao.android.order.bundle.nav.a<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f14563a;

    static {
        kge.a(1693194804);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
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
        String j = hyk.j();
        if (TextUtils.isEmpty(j)) {
            return false;
        }
        this.f14563a = j;
        return a(j);
    }

    public boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        c.a(8, intent);
        String g = com.taobao.android.order.bundle.helper.g.g(intent);
        Uri parse = Uri.parse(this.f14563a + "&tabCode=" + g);
        intent.setData(parse);
        String[] strArr = new String[1];
        strArr[0] = parse != null ? parse.toString() : "";
        hyn.a(CoreConstants.NAV_TAG, "DowngradeToListH5Task", strArr);
        hyq.a("DowngradeToListH5Task", "DowngradeToListH5Task", "DowngradeToListH5Task");
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
