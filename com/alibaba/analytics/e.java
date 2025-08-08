package com.alibaba.analytics;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.taobao.windvane.runtimepermission.a;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.cex;

@Deprecated
/* loaded from: classes.dex */
public class e implements Nav.f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "InitABTestNav";

    @Override // com.taobao.android.nav.Nav.e
    public boolean a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{this, context, intent})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.nav.Nav.f
    public boolean a(Context context, Nav nav, Intent intent) {
        Variation variation;
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("178742ec", new Object[]{this, context, nav, intent})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            Log.e(TAG, th.toString());
        }
        if (!cex.a().j().o()) {
            return true;
        }
        Uri data = intent.getData();
        if (data != null) {
            String uri = data.toString();
            if (!StringUtils.isEmpty(uri) && (variation = UTABTest.activate(UTABTest.COMPONENT_NAV, uri).getVariation("bucket")) != null) {
                String valueAsString = variation.getValueAsString(null);
                if (!StringUtils.isEmpty(valueAsString) && !StringUtils.equals(uri, valueAsString) && (parse = Uri.parse(valueAsString)) != null) {
                    intent.setData(parse);
                    String queryParameter = parse.getQueryParameter("UTABTEST-LOOPBACK");
                    if (StringUtils.isEmpty(queryParameter)) {
                        nav.allowLoopback();
                    } else if (StringUtils.equals(a.PERMISSION_ALLOW, queryParameter)) {
                        nav.allowLoopback();
                    } else if (StringUtils.equals("disallow", queryParameter)) {
                        nav.disallowLoopback();
                    }
                }
            }
        }
        return true;
    }
}
