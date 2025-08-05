package tb;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.k;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.nav.Nav;
import com.taobao.appbundle.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0016\u001a\u00020\u0004¨\u0006\u0017"}, d2 = {"Lcom/taobao/android/tucaoba/util/UrlUtils;", "", "()V", "getBaseUrl", "", "getModuleName", "goToOriginTucaobaH5", "", "context", "Landroid/content/Context;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "goToTucaobaEntryActivity", "isGoH5Direct", "", "isNetworkConnected", "isTucaobaFeatureLoaded", "parseStringToJsonObject", "Lcom/alibaba/fastjson/JSONObject;", "jsonString", "splitStringByQuestionMark", "Lkotlin/Pair;", "str", "tucaoba-android_debug"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class sfj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final sfj INSTANCE;

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "https://market.m.taobao.com/app/motu/tucaoba-web/web/index.html";
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "tucaoba-android";
    }

    static {
        kge.a(-1022273796);
        INSTANCE = new sfj();
    }

    private sfj() {
    }

    public final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        q.d(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (Build.VERSION.SDK_INT >= 23) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return false;
            }
            q.b(activeNetwork, "connectivityManager.activeNetwork ?: return false");
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                return false;
            }
            q.b(networkCapabilities, "connectivityManager.getN…(network) ?: return false");
            return networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        q.b(activeNetworkInfo, "connectivityManager.acti…tworkInfo ?: return false");
        return activeNetworkInfo.isConnected();
    }

    public final JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{this, str});
        }
        try {
            return JSONObject.parseObject(str, Feature.OrderedField);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final Pair<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("84aeb21b", new Object[]{this, str});
        }
        q.d(str, "str");
        if (!n.b((CharSequence) str, (CharSequence) "?", false, 2, (Object) null)) {
            return new Pair<>(str, "");
        }
        return new Pair<>(n.a(str, "?", (String) null, 2, (Object) null), n.b(str, "?", (String) null, 2, (Object) null));
    }

    public final boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        q.d(intent, "intent");
        Uri data = intent.getData();
        String str = null;
        String encodedFragment = data != null ? data.getEncodedFragment() : null;
        if (!(encodedFragment == null || encodedFragment.length() == 0)) {
            Uri data2 = intent.getData();
            if (data2 != null) {
                str = data2.getEncodedFragment();
            }
            if (!q.a((Object) a(String.valueOf(str)).getFirst(), (Object) "/")) {
                return true;
            }
        }
        return false;
    }

    public final void a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{this, context, intent});
            return;
        }
        q.d(context, "context");
        q.d(intent, "intent");
        String a2 = a();
        Uri data = intent.getData();
        String str = null;
        String encodedQuery = data != null ? data.getEncodedQuery() : null;
        if (encodedQuery == null || encodedQuery.length() == 0) {
            z = true;
        }
        if (!z) {
            Uri data2 = intent.getData();
            a2 = a2 + riy.CONDITION_IF + String.valueOf(data2 != null ? data2.getEncodedQuery() : null);
        }
        Uri data3 = intent.getData();
        if (data3 != null) {
            str = data3.getEncodedFragment();
        }
        String valueOf = String.valueOf(str);
        if (!q.a((Object) valueOf, (Object) "")) {
            a2 = a2 + '#' + valueOf;
        }
        Nav.from(context).toUri(Uri.parse(a2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        if ((!kotlin.jvm.internal.q.a((java.lang.Object) (r9.getData() != null ? r2.getEncodedFragment() : null), (java.lang.Object) "")) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.sfj.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            r1[r3] = r8
            r8 = 2
            r1[r8] = r9
            java.lang.String r8 = "23e54abc"
            r0.ipc$dispatch(r8, r1)
            return
        L18:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.d(r8, r0)
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.q.d(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "com.taobao.android.tucaoba.ondemand"
            r0.append(r1)
            java.lang.String r1 = ".EntryActivity"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.net.Uri r1 = r9.getData()
            r4 = 0
            if (r1 == 0) goto L41
            java.lang.String r1 = r1.getEncodedFragment()
            goto L42
        L41:
            r1 = r4
        L42:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            kotlin.Pair r1 = r7.a(r1)
            java.lang.Object r1 = r1.getSecond()
            java.lang.String r1 = (java.lang.String) r1
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r6 = r8.getPackageName()
            android.content.Intent r0 = r5.setClassName(r6, r0)
            android.net.Uri r5 = r9.getData()
            if (r5 == 0) goto L68
            java.lang.String r5 = r5.getEncodedQuery()
            goto L69
        L68:
            r5 = r4
        L69:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L73
            int r5 = r5.length()
            if (r5 != 0) goto L74
        L73:
            r2 = 1
        L74:
            if (r2 == 0) goto L8c
            android.net.Uri r2 = r9.getData()
            if (r2 == 0) goto L81
            java.lang.String r2 = r2.getEncodedFragment()
            goto L82
        L81:
            r2 = r4
        L82:
            java.lang.String r5 = ""
            boolean r2 = kotlin.jvm.internal.q.a(r2, r5)
            r2 = r2 ^ r3
            if (r2 == 0) goto L8c
            goto L9a
        L8c:
            android.net.Uri r9 = r9.getData()
            if (r9 == 0) goto L96
            java.lang.String r4 = r9.getEncodedQuery()
        L96:
            java.lang.String r1 = java.lang.String.valueOf(r4)
        L9a:
            java.lang.String r9 = "urlParams"
            r0.putExtra(r9, r1)
            r8.startActivity(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sfj.b(android.content.Context, android.content.Intent):void");
    }

    public final boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        q.d(context, "context");
        k.a().a(context, false, "tucaobafeature");
        if (b.a().c("tucaobafeature") == null) {
            return true;
        }
        g c = c.Companion.a().c();
        if (c == null) {
            return false;
        }
        if (c.a().contains("tucaobafeature")) {
            return true;
        }
        if (!c.a().contains("tucaobafeature")) {
            c.a(Arrays.asList("tucaobafeature"));
        }
        return false;
    }
}
