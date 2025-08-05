package com.taobao.android.order.bundle.nav.detail;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ado;
import tb.kge;

/* loaded from: classes6.dex */
public class f extends com.taobao.android.order.bundle.nav.a<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-876987032);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.order.bundle.nav.b
    public /* synthetic */ boolean c(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a8844ca", new Object[]{this, obj})).booleanValue() : b((Intent) obj);
    }

    @Override // com.taobao.android.order.bundle.nav.a
    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue() : !c(intent);
    }

    private boolean c(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa3052b", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null) {
            return false;
        }
        String uri = data.toString();
        if (uri != null && uri.startsWith(ado.URL_SEPARATOR)) {
            data = Uri.parse("http:" + uri);
        }
        return data == null || !data.isHierarchical() || (!"http".equals(data.getScheme()) && !"https".equals(data.getScheme())) || !"true".equals(data.getQueryParameter("hybrid"));
    }
}
