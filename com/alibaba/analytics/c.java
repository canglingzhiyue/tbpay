package com.alibaba.analytics;

import android.content.Intent;
import android.net.Uri;
import android.taobao.windvane.runtimepermission.a;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class c implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "ABTestNavProcessor";
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
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        Variation variation;
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                String uri = data.toString();
                if (!TextUtils.isEmpty(uri) && (variation = UTABTest.activate(UTABTest.COMPONENT_NAV, uri).getVariation("bucket")) != null) {
                    String valueAsString = variation.getValueAsString(null);
                    if (!TextUtils.isEmpty(valueAsString) && !TextUtils.equals(uri, valueAsString) && (parse = Uri.parse(valueAsString)) != null) {
                        intent.setData(parse);
                        String queryParameter = parse.getQueryParameter("UTABTEST-LOOPBACK");
                        if (TextUtils.isEmpty(queryParameter)) {
                            dVar.c(false);
                        } else if (TextUtils.equals(a.PERMISSION_ALLOW, queryParameter)) {
                            dVar.c(false);
                        } else if (TextUtils.equals("disallow", queryParameter)) {
                            dVar.c(true);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            Log.e("ABTestNavProcessor", th.toString());
        }
        return true;
    }
}
