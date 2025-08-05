package com.taobao.tao;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.ado;
import tb.kge;
import tb.mbn;

/* loaded from: classes.dex */
public class NavHyBridPreProcessor implements Nav.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(866283086);
        kge.a(-234059470);
    }

    @Override // com.taobao.android.nav.Nav.h
    public boolean beforeNavTo(Intent intent) {
        String queryParameter;
        String uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null && (uri = data.toString()) != null && uri.startsWith(ado.URL_SEPARATOR)) {
            data = Uri.parse("http:" + uri);
        }
        if (data != null && data.isHierarchical() && (("http".equals(data.getScheme()) || "https".equals(data.getScheme())) && (queryParameter = data.getQueryParameter("hybrid")) != null && "true".equals(queryParameter))) {
            intent.addCategory(mbn.BROWSER_ONLY_CATEGORY);
        }
        return true;
    }
}
