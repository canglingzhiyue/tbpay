package com.taobao.pha.tb;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserActivity;
import com.taobao.browser.exbrowser.BrowserUpperActivity;
import com.taobao.pha.core.PHAContainerType;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.manifest.ManifestProperty;
import com.taobao.pha.core.p;
import com.taobao.pha.tb.tabcontainer.TabFrameActivity;
import tb.kge;
import tb.nfc;
import tb.ngr;
import tb.ngu;

/* loaded from: classes7.dex */
public class H5NavProcess implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "H5NavProcess";
    private static final String URL_WHITELIST = "path_switch_url_whitelist";

    static {
        kge.a(1576342753);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : TAG;
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static boolean enableH5Entrance(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dab66de", new Object[]{uri})).booleanValue();
        }
        com.taobao.pha.core.h c = p.c();
        if (!ngu.f()) {
            return false;
        }
        String uri2 = uri.toString();
        String a2 = c.a(URL_WHITELIST);
        if (StringUtils.isEmpty(a2)) {
            a2 = "";
        }
        if (a2.equals("*")) {
            return true;
        }
        if (!StringUtils.isEmpty(a2)) {
            for (String str : a2.split(",")) {
                if (uri2.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        Uri data;
        ComponentName component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null || (component = intent.getComponent()) == null) {
            return true;
        }
        String className = component.getClassName();
        if (!(BrowserActivity.class.getName().equals(className) || BrowserUpperActivity.class.getName().equals(className)) || !enableH5Entrance(data) || intent.getBooleanExtra("pha_dwongrade", false)) {
            return true;
        }
        String str = intent.getPackage();
        if (str == null) {
            ngr.b(TAG, "intent.getPackage is null");
            return true;
        }
        intent.setComponent(new ComponentName(str, TabFrameActivity.class.getName()));
        long uptimeMillis = SystemClock.uptimeMillis();
        Uri build = data.buildUpon().appendQueryParameter("pha_manifest", ManifestProperty.PHAManifest.H5URL).build();
        String uri = build.toString();
        int a2 = com.taobao.pha.core.manifest.e.a().a(build);
        AppController appController = new AppController(uri, PHAContainerType.GENERIC, a2);
        long L = appController.L();
        appController.P().a(0, intent.getLongExtra("NAV_TO_URL_START_TIME", -1L));
        intent.putExtra("manifest_uri_hashcode", a2);
        intent.putExtra("pha_timestamp", uptimeMillis);
        intent.putExtra("pha_enable_manifest", true);
        intent.putExtra("pha_enable_manifest_preset", true);
        intent.putExtra("pha_is_h5_url", true);
        intent.addCategory("com.taobao.intent.category.pha");
        intent.putExtra(nfc.PHA_MONITOR_DIMENSION_MANIFEST_URL, uri);
        intent.putExtra("AppControllerInstanceId", L);
        return true;
    }
}
