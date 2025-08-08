package com.taobao.android.interactive;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.flexbox.layoutmanager.adapter.a;
import tb.kge;
import tb.ocp;

/* loaded from: classes5.dex */
public class GuangguangShareNavIntercept implements ocp.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(109165758);
        kge.a(-1899398292);
    }

    @Override // tb.ocp.a
    public boolean intercept(Context context, String str) {
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27456bad", new Object[]{this, context, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && str.contains("backToGuangguang=true") && (b = a.a().b()) != null && b.a() != null && b.b() == 0) {
            Nav.from(context).toUri("https://h5.m.taobao.com/guangguang/index.htm?tabid=home");
        }
        return false;
    }
}
