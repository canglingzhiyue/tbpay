package com.taobao.pha.tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.tschedule.protocol.b;
import com.taobao.pha.core.tabcontainer.a;
import java.util.Set;
import tb.kge;
import tb.mbn;
import tb.ngr;
import tb.ngu;

/* loaded from: classes.dex */
public class l implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f18831a;

    static {
        kge.a(338182635);
        kge.a(-454351374);
        f18831a = l.class.getSimpleName();
    }

    @Override // com.taobao.pha.core.tabcontainer.a
    public boolean a(Uri uri, Context context, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("553f51e8", new Object[]{this, uri, context, bool})).booleanValue();
        }
        if (context == null) {
            ngr.b(f18831a, "Downgrade Context is null.");
            return false;
        } else if (uri == null || !uri.isHierarchical()) {
            ngr.b(f18831a, "Downgrade Uri is null or it is not Hierarchical.");
            return false;
        } else {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Uri.Builder clearQuery = uri.buildUpon().scheme("https").clearQuery();
            for (String str : queryParameterNames) {
                if (!"wh_hckj".equals(str) && (!b.PROTOCOL_BIZ_CODE_PHA.equals(str) || !"true".equals(uri.getQueryParameter(str)))) {
                    clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
                }
            }
            Nav from = Nav.from(context);
            Bundle bundle = new Bundle();
            if (ngu.f()) {
                bundle.putBoolean("pha_dwongrade", true);
                from.withExtras(bundle);
                from.withCategory(mbn.BROWSER_ONLY_CATEGORY);
            }
            Uri build = clearQuery.build();
            if (!from.skipPreprocess().withCategory(mbn.BROWSER_ONLY_CATEGORY).disableTransition().disallowLoopback().toUri(build)) {
                String str2 = f18831a;
                ngr.c(str2, "jump to page: " + uri);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                intent.setFlags(65536);
                context.startActivity(intent);
            } else {
                String str3 = f18831a;
                ngr.b(str3, "downgrade success:" + build.toString());
            }
            return true;
        }
    }
}
