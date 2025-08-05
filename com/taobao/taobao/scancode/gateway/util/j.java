package com.taobao.taobao.scancode.gateway.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import java.util.HashMap;
import tb.com;
import tb.css;
import tb.kge;

/* loaded from: classes8.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Nav f21281a;
    private css b;

    static {
        kge.a(-1409364357);
    }

    private j(Context context, css cssVar) {
        this.f21281a = Nav.from(context);
        this.b = cssVar;
    }

    public static j a(Context context, css cssVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("6c0e229f", new Object[]{context, cssVar}) : new j(context, cssVar);
    }

    public j a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("942c3b5a", new Object[]{this});
        }
        this.f21281a.allowEscape();
        return this;
    }

    public j a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("48d0595e", new Object[]{this, bundle});
        }
        this.f21281a.withExtras(bundle);
        return this;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        css cssVar = this.b;
        if (cssVar == null) {
            b(str);
            return this.f21281a.toUri(str);
        }
        HashMap<String, String> a2 = cssVar.a();
        if (a2 != null) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            String str2 = a2.get("spm");
            if (!TextUtils.isEmpty(str2) && Uri.parse(str).getQueryParameter("spm") == null) {
                buildUpon.appendQueryParameter("spm", str2);
            }
            Uri build = buildUpon.build();
            b(build.toString());
            return this.f21281a.toUri(build);
        }
        b(str);
        return this.f21281a.toUri(str);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        Intent intent = new Intent("afc_page_open_broadcast");
        intent.putExtra("pageName", "scan");
        intent.putExtra("pageUrl", str);
        intent.putExtra("openTimestamp", System.currentTimeMillis());
        LocalBroadcastManager.getInstance(com.b()).sendBroadcast(intent);
    }
}
