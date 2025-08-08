package com.taobao.pha.tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.taobao.windvane.export.network.Request;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.protocol.b;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.pha.core.PHAContainerType;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.p;
import com.taobao.pha.tb.tabcontainer.TabFrameActivity;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.taobao.impl.TMS;
import tb.kge;
import tb.nfc;
import tb.ngr;
import tb.tlv;
import tb.tlx;

/* loaded from: classes.dex */
public final class e implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.pha.core.h f18815a = p.c();

    static {
        kge.a(-667822768);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "PHANavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{this, uri})).booleanValue() : this.f18815a.c() && !this.f18815a.a(uri);
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent == null) {
            Log.e("PHANavProcessor", "intent is null");
            return true;
        }
        Uri data = intent.getData();
        if (data == null) {
            ngr.a("PHANavProcessor", "uri is null");
            return true;
        }
        Context a2 = dVar.a();
        if (a2 == null) {
            return true;
        }
        try {
            z = tlx.INSTANCE.a(new tlv(data.toString(), data, a2));
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            TMSLogger.d("PHANavProcessor", "切流到 TMS WEB_SINGLE_PAGE");
            TMS.startApp(intent, dVar, TMSSolutionType.WEB_SINGLE_PAGE);
            return true;
        } else if (!p.d()) {
            Log.e("PHANavProcessor", "pha has not been initialized yet");
            return true;
        } else if (!data.isHierarchical()) {
            ngr.a("PHANavProcessor", "url isn't hierarchical");
            return true;
        } else if (p.c().t() && !c(data)) {
            ngr.b("PHANavProcessor", "Invalid manifest uri ");
            return true;
        } else {
            boolean equals = "true".equals(data.getQueryParameter(b.PROTOCOL_BIZ_CODE_PHA));
            boolean z2 = data.getQueryParameter("pha_manifest") != null;
            if (!equals && !z2) {
                ngr.a("PHANavProcessor", "it's not pha url: " + data);
                return true;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!a(data)) {
                ngr.a("PHANavProcessor", "disable by pha " + data);
                return true;
            }
            try {
                if (com.taobao.browser.nav.d.a(intent, dVar, data)) {
                    if (BrowserUtil.b(dVar.a())) {
                        Toast.makeText(dVar.a(), "PHA下线，切流至Themis Web 单页", 1).show();
                    }
                    ngr.a("PHANavProcessor", "switch to themis " + data);
                    return true;
                }
            } catch (Throwable th) {
                android.taobao.util.k.a("PHANavProcessor", "Exception when switchToThemis: " + th.getMessage());
            }
            ngr.a("PHANavProcessor", "pha start to load");
            if (StringUtils.equals(data.getQueryParameter("x-preload"), "true")) {
                android.taobao.windvane.export.network.f.a(new Request.a().a(data.toString()).b("GET").a());
                ngr.a("PHANavProcessor", "pha x-preload start " + (SystemClock.uptimeMillis() - uptimeMillis));
            }
            if (equals) {
                int a3 = com.taobao.pha.core.manifest.e.a().a(data);
                ngr.c("PHANavProcessor", "pha manifest start to load");
                intent.putExtra("AppControllerInstanceId", new AppController(data.toString(), PHAContainerType.GENERIC, a3).L());
            }
            intent.addCategory("com.taobao.intent.category.pha");
            intent.putExtra(nfc.PHA_MONITOR_DIMENSION_MANIFEST_URL, data.toString());
            intent.putExtra("pha_timestamp", uptimeMillis);
            long uptimeMillis2 = SystemClock.uptimeMillis();
            intent.putExtra("pha_nav_process_end", uptimeMillis2);
            if (p.c().a("enable_no_modify_uri_schema", false) && dVar != null && dVar.a() != null) {
                intent.setClass(dVar.a(), TabFrameActivity.class);
            } else {
                intent.setData(data.buildUpon().scheme("phatab").build());
            }
            ngr.a("PHANavProcessor", "pha nav finished " + (uptimeMillis2 - uptimeMillis));
            return true;
        }
    }

    private static boolean c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beadfb21", new Object[]{uri})).booleanValue();
        }
        if (uri != null) {
            return android.taobao.windvane.config.p.a(uri.toString());
        }
        return false;
    }
}
