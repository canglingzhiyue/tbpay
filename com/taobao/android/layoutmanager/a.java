package com.taobao.android.layoutmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.android.layoutmanager.container.PageRenderIntercept;
import com.taobao.android.layoutmanager.container.f;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.application.common.c;
import com.taobao.ask.ASK_CONST;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.common.util.k;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.container.SheetContainer;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.gvw;
import tb.ilw;
import tb.kge;
import tb.mbn;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ohh;
import tb.ohk;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHORT_VIDEO_PATH = "/app/tb-source-app/video-fullpage/pages/index2";
    public static final String SHORT_VIDEO_TRANSPARENT_PATH = "/video-fullpage/transparent-videolist.html";
    public static final String UGC_URL_REDIRECT = "ugc_url_redirect";
    private static final String c = "{\n  \"rate_detail\": {\n    \"url\": \"https://h5.m.taobao.com/tnode/index.htm?tnode=page_ratedetail%40ugc%3fpangesture%3dpullrightexit%26navbarHide%3dtrue%26immersive%3dtrue\",\n  },\n  \"ask_answerinvite\": {\n    \"url\": \"https://h5.m.taobao.com/ask-everyone/publish.htm?type=answer\"\n  }\n}";
    private static final List<String> d;

    private static String a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{new Boolean(z)}) : z ? "/tnode/multipagetransparency/index.htm" : "/tnode/multipage/index.htm";
    }

    private static boolean c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beadfb21", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        String path = uri.getPath();
        return "h5.m.taobao.com".equals(host) && ("/tnode/index.htm".equals(path) || "/tnode/index.html".equals(path));
    }

    public static boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{uri})).booleanValue() : uri != null && !TextUtils.isEmpty(uri.getQueryParameter("tnode"));
    }

    public static boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        String path = uri.getPath();
        return "h5.m.taobao.com".equals(host) && ("/tnode/index.htm".equals(path) || "/tnode/index.html".equals(path) || "/tnode/transparency/index.htm".equals(path) || "/tnode/multipage/index.htm".equals(path) || "/tnode/multipagetransparency/index.htm".equals(path));
    }

    private static boolean d(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4533b5c0", new Object[]{uri})).booleanValue() : uri != null && c(uri) && uri.toString().contains("type%3Dsheet");
    }

    private static boolean c(Context context, Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e00c95f", new Object[]{context, intent})).booleanValue();
        }
        if (intent != null && (data = intent.getData()) != null) {
            String queryParameter = data.getQueryParameter("tnodepush");
            if (!TextUtils.isEmpty(queryParameter)) {
                ogg.c("TNodeNavProcessor", "handleTNodePush:" + queryParameter);
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().l().a(context, queryParameter, null);
                intent.setData(oec.a(data, (List<String>) Arrays.asList("tnodepush")));
                return true;
            }
        }
        return false;
    }

    private static void a(Intent intent) {
        Uri data;
        Uri a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{intent});
        } else if (intent == null || (data = intent.getData()) == null) {
        } else {
            String uri = data.toString();
            if (!uri.startsWith("https://web.wapa.taobao.com/app/tnode/web/index") && !uri.startsWith("https://web.m.taobao.com/app/tnode/web/index")) {
                return;
            }
            ogg.c("TNodeNavProcessor", "handleTNodeH5Path :" + uri);
            String queryParameter = data.getQueryParameter("tnode");
            if (TextUtils.isEmpty(queryParameter)) {
                return;
            }
            Uri parse = Uri.parse(queryParameter);
            if (parse != null && "page_guangguanghome".equals(parse.getPath())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("tnode");
                a2 = oec.a(oec.a(data, (List<String>) arrayList), "https://h5.m.taobao.com/guangguang/index.htm");
            } else {
                a2 = oec.a(data, "https://h5.m.taobao.com/tnode/index.htm");
            }
            ogg.c("TNodeNavProcessor", "handleTNodeH5Path, newUrl:" + a2);
            intent.setData(a2);
        }
    }

    public static boolean a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{context, intent})).booleanValue();
        }
        try {
            ab.a((Context) Globals.getApplication());
            if (c(context, intent)) {
                return true;
            }
            a(intent);
            if (oeb.bu() && intent.getData() != null && "/app/mtb-guang/showcase/transfer".equals(intent.getData().getPath())) {
                try {
                    b(context, intent);
                    return true;
                } catch (Throwable unused) {
                }
            }
            boolean booleanExtra = intent.getBooleanExtra("tnode_has_parsed", false);
            ogg.b("handleGuangGuangNavUrl:" + booleanExtra + "," + intent.getData());
            PageRenderIntercept.a(intent.getData());
            if (booleanExtra) {
                return true;
            }
            Pair<Uri, Boolean> a2 = a(context, intent.getData(), true, true, true);
            Uri uri = (Uri) a2.first;
            boolean booleanValue = ((Boolean) a2.second).booleanValue();
            if (!booleanValue) {
                if (b(uri)) {
                    b(intent);
                }
                ogg.c("TNodeNavProcessor", "setData to " + uri.toString());
                intent.setData(uri);
            }
            return !booleanValue;
        } catch (Exception unused2) {
            return true;
        }
    }

    private static void a(Context context, Uri uri) {
        Activity b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd717ce7", new Object[]{context, uri});
            return;
        }
        if (context instanceof Activity) {
            b = (Activity) context;
        } else {
            b = c.b();
        }
        if (b == null || b.isFinishing()) {
            return;
        }
        new SheetContainer(b, uri.toString()).show(b);
    }

    public static Pair<Uri, Boolean> a(Context context, Uri uri, boolean z, boolean z2, boolean z3) {
        Uri a2;
        IpChange ipChange = $ipChange;
        boolean z4 = true;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("44311717", new Object[]{context, uri, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        }
        Pair<Uri, Boolean> a3 = a(context, uri, z);
        if (a3 == null) {
            return null;
        }
        if (((Boolean) a3.second).booleanValue()) {
            return a3;
        }
        Uri uri2 = (Uri) a3.first;
        if (d(uri2)) {
            a2 = a(uri2, true, false);
            a(context, a2);
        } else {
            a2 = a(uri2, z2, z3);
            z4 = false;
        }
        return new Pair<>(a2, Boolean.valueOf(z4));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<android.net.Uri, java.lang.Boolean> a(android.content.Context r8, android.net.Uri r9, boolean r10) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.layoutmanager.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L20
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r2] = r9
            r8 = 2
            java.lang.Boolean r9 = new java.lang.Boolean
            r9.<init>(r10)
            r1[r8] = r9
            java.lang.String r8 = "5f4c8bd7"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            android.util.Pair r8 = (android.util.Pair) r8
            return r8
        L20:
            if (r9 != 0) goto L24
            r8 = 0
            return r8
        L24:
            boolean r0 = c(r9)
            if (r0 == 0) goto L35
            boolean r8 = d(r9)
            if (r8 != 0) goto L80
            android.net.Uri r9 = b(r9, r2, r10)
            goto L80
        L35:
            java.lang.String r0 = r9.getHost()
            java.lang.String r1 = r9.getPath()
            java.lang.String r4 = "market.m.taobao.com"
            boolean r5 = r4.equals(r0)
            java.lang.String r6 = "tesi.m.taobao.com"
            java.lang.String r7 = "market.wapa.taobao.com"
            if (r5 != 0) goto L50
            boolean r5 = r7.equals(r0)
            if (r5 == 0) goto L58
        L50:
            java.lang.String r5 = "/app/mtb/personal-homepage/pages/index/index.html"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L87
        L58:
            boolean r5 = r6.equals(r0)
            if (r5 == 0) goto L73
            java.lang.String r5 = "/app/mtb/daren-page-esr/pages/index/index.html"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L73
            boolean r1 = f()
            if (r1 == 0) goto L73
            boolean r1 = g()
            if (r1 == 0) goto L73
            goto L87
        L73:
            boolean r8 = r4.equals(r0)
            if (r8 != 0) goto L82
            boolean r8 = r7.equals(r0)
            if (r8 == 0) goto L80
            goto L82
        L80:
            r2 = 0
            goto Lcd
        L82:
            android.net.Uri r9 = b(r9, r10)
            goto L80
        L87:
            boolean r1 = com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.c.a()
            if (r1 == 0) goto L99
            android.net.Uri r9 = com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.c.b(r9)
            com.taobao.android.nav.Nav r8 = com.taobao.android.nav.Nav.from(r8)
            r8.toUri(r9)
            goto Lcd
        L99:
            boolean r8 = r6.equals(r0)
            if (r8 != 0) goto Lbd
            java.lang.String r8 = "source"
            java.lang.String r8 = r9.getQueryParameter(r8)
            java.lang.String r0 = "taolive"
            boolean r8 = android.text.TextUtils.equals(r8, r0)
            if (r8 != 0) goto Lbd
            java.lang.String r8 = "livesource"
            java.lang.String r8 = r9.getQueryParameter(r8)
            boolean r8 = android.text.TextUtils.equals(r8, r0)
            if (r8 == 0) goto Lbc
            goto Lbd
        Lbc:
            r2 = 0
        Lbd:
            android.net.Uri r8 = c(r9, r2)
            boolean r9 = c(r8)
            if (r9 == 0) goto Lcb
            android.net.Uri r8 = b(r8, r3, r10)
        Lcb:
            r9 = r8
            goto L80
        Lcd:
            if (r2 != 0) goto Le6
            boolean r8 = c(r9)
            if (r8 == 0) goto Lde
            android.util.Pair r8 = com.taobao.tao.flexbox.layoutmanager.container.m.b(r9, r3)
            java.lang.Object r8 = r8.first
            r9 = r8
            android.net.Uri r9 = (android.net.Uri) r9
        Lde:
            android.net.Uri r8 = f(r9)
            android.net.Uri r9 = e(r8)
        Le6:
            android.util.Pair r8 = new android.util.Pair
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            r8.<init>(r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.layoutmanager.a.a(android.content.Context, android.net.Uri, boolean):android.util.Pair");
    }

    private static Uri b(Uri uri, boolean z) {
        Uri uri2 = uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("f4775f4d", new Object[]{uri2, new Boolean(z)});
        }
        String path = uri.getPath();
        if ("/app/tb-source-app/video-fullpage/pages/index2".equals(uri.getPath())) {
            String encodedQuery = uri.getEncodedQuery();
            if ((a(uri2.getQueryParameter("source")) && !"true".equals(uri2.getQueryParameter("fullpagevideofromshare")) && "true".equals(OrangeConfig.getInstance().getConfig("ShortVideo", "enableTransparentVideo", "true"))) && d()) {
                uri2 = Uri.parse(k.HTTPS_PREFIX + "h5.m.taobao.com/video-fullpage/transparent-videolist.html?" + encodedQuery);
                path = uri2.getPath();
            }
        }
        if (!"/app/tb-source-app/video-fullpage/pages/index2".equals(path) && !"/video-fullpage/transparent-videolist.html".equals(path)) {
            return uri2;
        }
        if (z && oeb.a(h(), uri2, null)) {
            String encodedQuery2 = uri2.getEncodedQuery();
            uri2 = Uri.parse(k.HTTPS_PREFIX + "h5.m.taobao.com" + a(uri2.getPath().contains("transparent")) + "?" + encodedQuery2);
        }
        return oec.b(uri2, "tnodefullpage", "true");
    }

    public static Uri a(Uri uri, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d0a98fd6", new Object[]{uri, new Boolean(z), new Boolean(z2)});
        }
        if (uri == null || !a(uri) || !b(uri)) {
            return uri;
        }
        if (z) {
            Pair<Uri, m.b> b = m.b(uri, false);
            m.b bVar = (m.b) b.second;
            uri = f.a((Uri) b.first, bVar.a(), ohk.b(bVar.d));
        }
        IDeviceInfo w = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w();
        if (!z2 || !oeb.aX()) {
            return uri;
        }
        if (oeb.aW() && (w == null || w.f())) {
            return uri;
        }
        String a2 = ohk.a(uri);
        if (TextUtils.isEmpty(a2) || !d.contains(a2)) {
            return uri;
        }
        PreloadDelegate preloadDelegate = new PreloadDelegate(Globals.getApplication(), null, uri.toString(), String.valueOf(System.currentTimeMillis()), null, false, 1, null);
        preloadDelegate.b();
        String a3 = preloadDelegate.a();
        Uri parse = !TextUtils.isEmpty(a3) ? Uri.parse(a3) : null;
        return parse != null ? parse : uri;
    }

    private static Uri e(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("ed7d2392", new Object[]{uri}) : (!c(uri) || !TextUtils.isEmpty(uri.getQueryParameter(ASK_CONST.KEY_TNODE_TIME)) || TextUtils.isEmpty(uri.getQueryParameter("tnode"))) ? uri : oec.b(uri, ASK_CONST.KEY_TNODE_TIME, String.valueOf(System.nanoTime()));
    }

    private static Uri f(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("4ecfc031", new Object[]{uri}) : g(uri) ? oec.b(uri, e.LARGE_SCREEN_STYLE_KEY, "fullscreen") : uri;
    }

    private static Uri b(Uri uri, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("27c780b5", new Object[]{uri, new Boolean(z), new Boolean(z2)});
        }
        if (uri == null) {
            return uri;
        }
        String encodedQuery = uri.getEncodedQuery();
        String queryParameter = uri.getQueryParameter("tnode");
        String queryParameter2 = uri.getQueryParameter("transition");
        String path = uri.getPath();
        if (TextUtils.isEmpty(queryParameter)) {
            return uri;
        }
        Uri parse = Uri.parse(queryParameter);
        boolean z4 = z2 && oeb.a(h(), uri, null);
        if (z && d()) {
            boolean equals = TextUtils.equals(parse.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_PAN_GESTURE), com.taobao.tao.flexbox.layoutmanager.container.a.GESTURE_PULLRIGHTEXIT);
            boolean a2 = oec.a((Object) parse.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_FULLTRANSPARENT), false);
            if (equals || a2 || (z4 && !TextUtils.isEmpty(queryParameter2))) {
                StringBuilder sb = new StringBuilder(k.HTTPS_PREFIX);
                sb.append("h5.m.taobao.com");
                sb.append(z4 ? a(true) : "/tnode/transparency/index.htm");
                sb.append("?");
                sb.append(encodedQuery);
                uri = Uri.parse(sb.toString());
                if (z4 && !z3) {
                    uri = Uri.parse(k.HTTPS_PREFIX + "h5.m.taobao.com" + a(path.contains("transparency")) + "?" + encodedQuery);
                }
                return oec.b(uri, ASK_CONST.KEY_TNODE_TIME, String.valueOf(System.nanoTime()));
            }
        }
        z3 = false;
        if (z4) {
            uri = Uri.parse(k.HTTPS_PREFIX + "h5.m.taobao.com" + a(path.contains("transparency")) + "?" + encodedQuery);
        }
        return oec.b(uri, ASK_CONST.KEY_TNODE_TIME, String.valueOf(System.nanoTime()));
    }

    private static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : !TBRevisionSwitchManager.i().e() && TBRevisionSwitchManager.i().a(ilw.KEY_NEW_CONTENT_ENABLE);
    }

    private static Uri c(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("bd78568e", new Object[]{uri, new Boolean(z)});
        }
        if (!a() || uri == null) {
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        String str = "?navbarHide=true";
        if (!z) {
            str = str + "&pangesture=pullrightexit";
        }
        if (Build.VERSION.SDK_INT >= 21) {
            str = str + "&immersive=true";
        }
        StringBuilder sb = new StringBuilder(k.HTTPS_PREFIX);
        sb.append("h5.m.taobao.com");
        if (d() && !z) {
            sb.append("/tnode/transparency/index.htm");
        } else {
            sb.append("/tnode/index.htm");
        }
        sb.append("?tnode=page_profile");
        sb.append(Uri.encode(str));
        sb.append("&");
        sb.append(encodedQuery);
        return Uri.parse(sb.toString());
    }

    private static void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{intent});
        } else if (!oeb.bn()) {
        } else {
            intent.removeCategory(mbn.BROWSER_ONLY_CATEGORY);
            intent.addCategory("android.intent.category.DEFAULT");
        }
    }

    private static boolean a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (oeb.a("ShortVideo.enableAllVideoSource", true)) {
            return true;
        }
        HashSet hashSet = new HashSet();
        for (String str2 : OrangeConfig.getInstance().getConfig("ShortVideo", "enableTransparentVideoSource", "guangguang,guangguang_follow").split(",")) {
            if (!TextUtils.isEmpty(str2)) {
                hashSet.add(str2);
            }
        }
        return hashSet.contains(str);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enableTNodeProfile", "true").equals("true");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enableNewProfileForSecondPage", "true").equals("true") && a();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enableNewProfileForVideo", "true").equals("true") && a();
    }

    private static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enableNewProfileForLive", "true").equals("true");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : oeb.E();
    }

    private static Context h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("96c352e7", new Object[0]);
        }
        return com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a() != null ? com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a() : ab.a();
    }

    static {
        kge.a(953470790);
        d = Arrays.asList("page_profile", "page_detail");
    }

    private static void b(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e54abc", new Object[]{context, intent});
            return;
        }
        Uri data = intent.getData();
        if (data == null || !data.isHierarchical()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : data.getQueryParameterNames()) {
                jSONObject.put(str, (Object) data.getQueryParameter(str));
            }
        } catch (Throwable unused) {
        }
        String string = jSONObject.getString("target_page");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        Object b = ohh.b(UGC_URL_REDIRECT);
        String str2 = b instanceof String ? (String) b : "";
        String customConfig = OrangeConfig.getInstance().getCustomConfig(UGC_URL_REDIRECT, TextUtils.isEmpty(str2) ? c : str2);
        if (!TextUtils.equals(str2, customConfig)) {
            ohh.b(UGC_URL_REDIRECT, customConfig);
        }
        JSONObject jSONObject2 = JSON.parseObject(customConfig).getJSONObject(string);
        if (jSONObject2 == null || TextUtils.isEmpty(jSONObject2.getString("url"))) {
            return;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("conditions");
        if (jSONObject3 != null) {
            String string2 = jSONObject3.getString("minAppVersion");
            try {
                String str3 = context.getPackageManager().getPackageInfo(Globals.getApplication().getPackageName(), 16384).versionName;
                if (!TextUtils.isEmpty(string2)) {
                    if (!oec.a(str3, string2)) {
                        return;
                    }
                }
            } catch (Throwable unused2) {
            }
            if (jSONObject3.getJSONArray("blackDeviceModels").contains(Build.MODEL)) {
                return;
            }
        }
        String string3 = jSONObject2.getString("url");
        Uri parse = Uri.parse(string3);
        try {
            for (String str4 : parse.getQueryParameterNames()) {
                if (!jSONObject.containsKey(str4)) {
                    jSONObject.put(str4, (Object) parse.getQueryParameter(str4));
                }
            }
        } catch (Throwable unused3) {
        }
        StringBuilder sb = new StringBuilder(parse.toString());
        if (string3.contains("?")) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                sb.append("&");
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue().toString());
            }
        } else {
            sb.append("?");
            for (Map.Entry<String, Object> entry2 : jSONObject.entrySet()) {
                sb.append(entry2.getKey());
                sb.append("=");
                sb.append(entry2.getValue().toString());
                sb.append("&");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        Uri parse2 = Uri.parse(sb.toString());
        if (b(parse2)) {
            b(intent);
        }
        intent.setData(parse2);
    }

    private static boolean g(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8c4e59d", new Object[]{uri})).booleanValue() : gvw.d(uri) || gvw.i(uri) || com.taobao.tao.flexbox.layoutmanager.adapter.a.a().B().b(uri) || TextUtils.equals(uri.getQueryParameter("tnodefullpage"), "true");
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return str.contains("/tnode/multipagetransparency/index.htm") || str.contains("/tnode/transparency/index.htm");
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : TextUtils.equals(str, "/tnode/index.htm") || TextUtils.equals(str, "/tnode/index.html") || TextUtils.equals(str, "/tnode/multipage/index.htm");
    }
}
