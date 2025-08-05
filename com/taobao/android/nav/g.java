package com.taobao.android.nav;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.android.nav.Nav;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.ado;
import tb.kge;
import tb.lsk;
import tb.omh;

/* loaded from: classes.dex */
public class g implements Nav.i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<ResolveInfo> b = new ArrayList();

    static {
        kge.a(615866395);
        kge.a(636013929);
    }

    public g() {
        this.b.add(new Nav.EscapeResolveInfo());
    }

    private Intent a(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("f20fa74e", new Object[]{this, intent});
        }
        boolean isDebug = Versions.isDebug();
        String dataString = intent.getDataString();
        if (isDebug) {
            String str2 = "url:" + dataString;
        }
        String scheme = Uri.parse(dataString).getScheme();
        if (isDebug) {
            String str3 = "scheme:" + scheme;
        }
        if (scheme == null) {
            intent.putExtra(com.taobao.browser.utils.i.URL_REFERER_ORIGIN, dataString);
            if (dataString.startsWith(ado.URL_SEPARATOR)) {
                str = "http:" + dataString;
            } else {
                str = com.taobao.search.common.util.k.HTTP_PREFIX + dataString;
            }
            intent.setData(Uri.parse(str));
        } else if (scheme.equals("https")) {
            intent.putExtra(com.taobao.browser.utils.i.URL_REFERER_ORIGIN, dataString);
            TLog.loge("Nav", "URL_REFERER_ORIGIN is: " + dataString);
            String replaceFirst = dataString.replaceFirst("https", "http");
            if (isDebug) {
                String str4 = "url after replaceFirst===" + replaceFirst;
            }
            intent.setData(Uri.parse(replaceFirst));
        } else if (scheme.startsWith(ado.URL_SEPARATOR)) {
            intent.putExtra(com.taobao.browser.utils.i.URL_REFERER_ORIGIN, dataString);
            intent.setData(Uri.parse("http:" + dataString));
        }
        if (isDebug) {
            String str5 = "intent:" + intent;
        }
        return intent;
    }

    @Override // com.taobao.android.nav.Nav.i
    public List<ResolveInfo> a(PackageManager packageManager, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d79afe97", new Object[]{this, packageManager, intent, new Integer(i)});
        }
        a(intent);
        List<ResolveInfo> a2 = a(packageManager, intent, false, i, false);
        if (a2 != null) {
            for (int i2 = 0; i2 < a2.size(); i2++) {
                ResolveInfo resolveInfo = a2.get(i2);
                if (resolveInfo != null) {
                    TLog.loge("Nav", "q: " + resolveInfo);
                }
            }
        }
        return a2;
    }

    @Override // com.taobao.android.nav.Nav.i
    public ResolveInfo a(PackageManager packageManager, Intent intent, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResolveInfo) ipChange.ipc$dispatch("cf731223", new Object[]{this, packageManager, intent, new Integer(i), new Boolean(z)});
        }
        TLog.loge("Nav", "url when resolveActivity is: " + intent.getDataString());
        a(intent);
        ResolveInfo resolveInfo = null;
        if (Build.MANUFACTURER.equalsIgnoreCase("HTC")) {
            return null;
        }
        List<ResolveInfo> a2 = a(packageManager, intent, true, i, z);
        if (z) {
            if (a2 != null && a2.size() > 0) {
                resolveInfo = a2.get(0);
            }
        } else {
            resolveInfo = Nav.optimum(Globals.getApplication(), a2);
        }
        if (resolveInfo != null) {
            TLog.loge("Nav", "r: " + resolveInfo);
        }
        return resolveInfo;
    }

    private boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2aa3052b", new Object[]{this, intent})).booleanValue() : intent.getBooleanExtra("cold_startup_h5", false);
    }

    private boolean d(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53f2e9ac", new Object[]{this, intent})).booleanValue() : intent.getBooleanExtra(com.taobao.android.launcher.bootstrap.tao.ability.b.EXTRA_LINK_HOT_START, false) || intent.getBooleanExtra("hot_startup_h5", false);
    }

    private boolean e(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d42ce2d", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data == null || data.isOpaque() || !"m.taobao.com".equals(data.getHost())) {
            return false;
        }
        String path = data.getPath();
        if (!TextUtils.isEmpty(path)) {
            return path.startsWith("/tbopen/index.htm");
        }
        return false;
    }

    private List<ResolveInfo> a(PackageManager packageManager, Intent intent, boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("42893e95", new Object[]{this, packageManager, intent, new Boolean(z), new Integer(i), new Boolean(z2)});
        }
        if (z) {
            i = 65536;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, i);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            if (!z2 || Build.VERSION.SDK_INT < 30) {
                return null;
            }
            omh.a("queryIntentActivities", "list_empty_but_allowEscape");
            TLog.loge("Nav", "queryIntentActivities", "list_empty_but_allowEscape " + intent);
            return this.b;
        }
        a(queryIntentActivities.iterator(), intent);
        return queryIntentActivities;
    }

    private boolean a(ResolveInfo resolveInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2891eedd", new Object[]{this, resolveInfo})).booleanValue() : "com.taobao.tao.welcome.Welcome".equals(resolveInfo.activityInfo.name) || "com.taobao.tao.welcome.Welcome".equals(resolveInfo.activityInfo.targetActivity);
    }

    private void a(Iterator<ResolveInfo> it, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec3acc6", new Object[]{this, it, intent});
            return;
        }
        while (it.hasNext()) {
            ResolveInfo next = it.next();
            if (next != null && (lsk.BIZ_NAME.equals(next.activityInfo.name) || a(next))) {
                if (a(next)) {
                    boolean e = e(intent);
                    if (!e || !c(intent)) {
                        if (!e || !d(intent)) {
                            if (!"com.taobao.tao.welcome.Welcome".equals(TBMainHost.a().getName())) {
                                it.remove();
                            }
                        }
                    }
                } else if (!Nav.hasWelcome() && !lsk.BIZ_NAME.equals(TBMainHost.a().getName()) && TBMainHost.a().getName() != null) {
                    it.remove();
                }
            }
        }
    }
}
