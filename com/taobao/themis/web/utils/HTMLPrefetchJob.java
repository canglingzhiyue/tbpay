package com.taobao.themis.web.utils;

import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.export.network.c;
import android.taobao.windvane.export.network.f;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.utils.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes9.dex */
public final class HTMLPrefetchJob implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final HTMLPrefetchJob INSTANCE;
    private static final String TAG = "HTMLPrefetchJob";

    static {
        kge.a(436587884);
        kge.a(1028243835);
        INSTANCE = new HTMLPrefetchJob();
    }

    private HTMLPrefetchJob() {
    }

    public static final /* synthetic */ boolean access$enableStricterPrefetchMatch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53c91180", new Object[0])).booleanValue() : enableStricterPrefetchMatch();
    }

    public static final /* synthetic */ boolean access$isQueryContains(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a8da3dc", new Object[]{str, str2})).booleanValue() : isQueryContains(str, str2);
    }

    @JvmStatic
    public static final void preloadHTMLResource(String h5Url, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd67e6c1", new Object[]{h5Url, new Boolean(z)});
            return;
        }
        q.d(h5Url, "h5Url");
        TMSLogger.d(TAG, "start preloadHTMLResource tms h5Url: " + h5Url);
        f.a(new Request.a().a(h5Url).b("GET").a(a.INSTANCE).a());
        TMSLogger.d(TAG, "finish preloadHTMLResource: " + System.currentTimeMillis());
    }

    /* loaded from: classes9.dex */
    public static final class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
        @Override // android.taobao.windvane.export.network.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(java.lang.String r10, java.lang.String r11) {
            /*
                Method dump skipped, instructions count: 369
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.web.utils.HTMLPrefetchJob.a.a(java.lang.String, java.lang.String):boolean");
        }
    }

    @JvmStatic
    public static final boolean preloadJSAPI(String h5Url) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3a5003d", new Object[]{h5Url})).booleanValue();
        }
        q.d(h5Url, "h5Url");
        String bt = n.bt();
        if (TextUtils.isEmpty(bt)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : kotlin.text.n.b((CharSequence) bt, new String[]{","}, false, 0, 6, (Object) null)) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList<String> arrayList2 = arrayList;
        if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
            for (String str : arrayList2) {
                if (kotlin.text.n.b((CharSequence) h5Url, (CharSequence) str, false, 2, (Object) null)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return false;
        }
        preloadHTMLResource(h5Url, false);
        return true;
    }

    @JvmStatic
    private static final boolean isQueryContains(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc91c31c", new Object[]{str, str2})).booleanValue();
        }
        if (str == null) {
            return str2 == null;
        } else if (str2 == null) {
            return false;
        } else {
            String str3 = str;
            String str4 = str2;
            return kotlin.text.n.b((CharSequence) str3, (CharSequence) str4, false, 2, (Object) null) || kotlin.text.n.b((CharSequence) str4, (CharSequence) str3, false, 2, (Object) null);
        }
    }

    @JvmStatic
    private static final boolean enableStricterPrefetchMatch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2da6f0c0", new Object[0])).booleanValue() : n.b(i.GROUP_THEMIS_COMMON_CONFIG, "enableStricterPrefetchMatch", (Boolean) true);
    }
}
