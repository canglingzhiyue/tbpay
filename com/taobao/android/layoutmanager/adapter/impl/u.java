package com.taobao.android.layoutmanager.adapter.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.kge;

/* loaded from: classes5.dex */
public class u implements com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1763058949);
        kge.a(725332858);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.m
    public void a(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a729a6a", new Object[]{this, context, str, bundle});
            return;
        }
        Nav from = Nav.from(context);
        if (bundle != null) {
            from.withExtras(bundle);
        }
        from.toUri(str);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.m
    public void a(Context context, String str, Bundle bundle, Bundle bundle2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0694e2a", new Object[]{this, context, str, bundle, bundle2});
            return;
        }
        Nav from = Nav.from(context);
        if (bundle != null) {
            from.withExtras(bundle);
        }
        if (bundle2 != null) {
            from.withOptions(bundle2);
        }
        from.toUri(str);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.m
    public void a(Context context, String str, String str2, Bundle bundle, Bundle bundle2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371d778f", new Object[]{this, context, str, str2, bundle, bundle2, new Integer(i)});
            return;
        }
        Nav from = Nav.from(context);
        if (bundle != null) {
            from.withExtras(bundle);
        }
        if (bundle2 != null) {
            from.withOptions(bundle2);
        }
        from.withFlags(i);
        if ((context instanceof Activity) && n.b(context)) {
            from.withClassName(context.getPackageName(), "com.taobao.tao.welcome.Welcome");
        } else {
            from.withClassName(context.getPackageName(), str);
        }
        from.toUri(str2);
    }
}
