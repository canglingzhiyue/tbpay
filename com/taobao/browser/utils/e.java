package com.taobao.browser.utils;

import android.app.Activity;
import android.net.Uri;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserActivity;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.tao.BaseActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, WeakReference<BrowserActivity>> f16845a;
    private static ConcurrentHashMap<String, WeakReference<BaseActivity>> b;

    static {
        kge.a(-49248711);
        f16845a = null;
        b = null;
    }

    public static boolean a(Activity activity, Uri uri) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1485ad1", new Object[]{activity, uri})).booleanValue();
        }
        String uri2 = uri != null ? uri.toString() : null;
        BrowserUtil.a(RPCDataItems.SWITCH_TAG_LOG, "NavtoExBrowser", "exbrowser_all", uri2, null);
        if (uri.isHierarchical() && (("http".equals(uri.getScheme()) || "https".equals(uri.getScheme())) && (queryParameter = uri.getQueryParameter("landscape")) != null && "true".equals(queryParameter.trim()))) {
            BrowserUtil.a(RPCDataItems.SWITCH_TAG_LOG, "NavtoExBrowser", "exbrowser_landscape", uri2, null);
            activity.setRequestedOrientation(0);
        }
        return false;
    }

    public static void a(Activity activity, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c3b1a7", new Object[]{activity, uri, new Boolean(z)});
            return;
        }
        try {
            activity.setRequestedOrientation(0);
        } catch (Exception e) {
            android.taobao.util.k.a("NavHelper", "fail to call toLandscapeBrowser: " + e.getMessage());
        }
    }

    public static boolean a(String str, WeakReference<BrowserActivity> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85dfbbb0", new Object[]{str, weakReference})).booleanValue();
        }
        BrowserUtil.a(RPCDataItems.SWITCH_TAG_LOG, "addUniqueH5", null, str != null ? str : null, null);
        if (f16845a == null) {
            f16845a = new ConcurrentHashMap<>();
        }
        android.taobao.util.k.a("NavHelper", "UniqueH5 add : " + str);
        f16845a.put(str, weakReference);
        return true;
    }

    public static boolean b(String str, WeakReference<BrowserActivity> weakReference) {
        BrowserActivity browserActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3b8560f", new Object[]{str, weakReference})).booleanValue();
        }
        ConcurrentHashMap<String, WeakReference<BrowserActivity>> concurrentHashMap = f16845a;
        if (concurrentHashMap != null && weakReference != null && concurrentHashMap.containsKey(str)) {
            BrowserUtil.a(RPCDataItems.SWITCH_TAG_LOG, "checkClearUniqueH5", null, str != null ? str : null, null);
            WeakReference<BrowserActivity> weakReference2 = f16845a.get(str);
            if (weakReference2 != null && (browserActivity = weakReference2.get()) != null && browserActivity != weakReference.get()) {
                android.taobao.util.k.a("NavHelper", "UniqueH5 clear : " + str);
                browserActivity.finish(AfcLifeCycleCenter.isLauncherStart ^ true);
                f16845a.remove(str);
                return true;
            }
        }
        return false;
    }
}
