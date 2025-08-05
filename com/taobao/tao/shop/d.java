package com.taobao.tao.shop;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.activity.LoadingChatActivity;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.tao.shop.fetcher.adapter.b;
import com.taobao.tao.shop.rule.c;
import com.taobao.tao.shop.rule.data.TBUrlRuleResponse;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData;
import com.taobao.tao.shop.track.a;
import com.taobao.utils.Global;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.kge;
import tb.ouu;
import tb.oux;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOP_RULE_PROCESSED = "com.taobao.tao.shop.rule.processed";

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f21070a;
    private static com.taobao.tao.shop.track.e b;
    private static com.taobao.tao.shop.fetcher.c c;
    private c d;
    private Boolean e = null;

    static {
        kge.a(-1794743000);
    }

    public static /* synthetic */ com.taobao.tao.shop.track.e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.shop.track.e) ipChange.ipc$dispatch("fc444c91", new Object[0]) : b;
    }

    public static /* synthetic */ void a(d dVar, TBShopPageType tBShopPageType, String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3582e09", new Object[]{dVar, tBShopPageType, str, str2, bundle});
        } else {
            dVar.a(tBShopPageType, str, str2, bundle);
        }
    }

    public static /* synthetic */ void a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26aef2f8", new Object[]{dVar, str});
        } else {
            dVar.a(str);
        }
    }

    public static /* synthetic */ void a(d dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76a4ec2", new Object[]{dVar, str, str2});
        } else {
            dVar.a(str, str2);
        }
    }

    public static /* synthetic */ void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{str, str2, new Boolean(z)});
        } else {
            b(str, str2, z);
        }
    }

    private d(Context context) {
        b = new com.taobao.tao.shop.track.e();
        c = new com.taobao.tao.shop.fetcher.c(context);
    }

    public static d a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("c3f67066", new Object[]{context});
        }
        if (f21070a == null) {
            synchronized (d.class) {
                if (f21070a == null) {
                    f21070a = new d(context);
                }
            }
        }
        return f21070a;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c0e44f", new Object[]{this, cVar});
        } else {
            this.d = cVar;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c733255", new Object[]{this, aVar});
        } else {
            b.a(aVar);
        }
    }

    private static Uri b(Uri uri) {
        String host;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("c9854db5", new Object[]{uri});
        }
        int i = e.c;
        if (i == 0) {
            return uri;
        }
        if (i == 1) {
            String host2 = uri.getHost();
            if (host2 == null || !host2.contains(".wapa.")) {
                return uri;
            }
            String[] split = host2.split("\\.");
            split[1] = "m";
            StringBuilder sb = new StringBuilder();
            for (String str : split) {
                sb.append(str);
                sb.append(".");
            }
            String sb2 = sb.toString();
            return Uri.parse(uri.toString().replace(uri.getHost(), sb2.substring(0, sb2.length() - 1)));
        } else if (i != 2 || (host = uri.getHost()) == null || !host.contains(".waptest.")) {
            return uri;
        } else {
            String[] split2 = host.split("\\.");
            split2[1] = "m";
            StringBuilder sb3 = new StringBuilder();
            for (String str2 : split2) {
                sb3.append(str2);
                sb3.append(".");
            }
            String sb4 = sb3.toString();
            return Uri.parse(uri.toString().replace(uri.getHost(), sb4.substring(0, sb4.length() - 1)));
        }
    }

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        Uri b2 = b(uri);
        if (d(b2)) {
            ouu.b("matchedUrl url should ignore   ->   return false");
            return null;
        } else if (c(b2)) {
            ouu.b("matchedUrl url isProcessed   ->   return false");
            return null;
        } else {
            com.taobao.tao.shop.fetcher.c cVar = c;
            if (cVar == null) {
                return null;
            }
            MtopTaobaoWirelessShopRouteProcessResponseData a2 = cVar.a(b2.toString());
            if (a2 != null && b.a().n() && a2.isMiniAppRenderStyle()) {
                a2 = null;
            }
            if (a2 == null || TextUtils.isEmpty(a2.getShopTargetUrl())) {
                String str = "shortcut url NOT matched, original url is " + b2.toString();
                Log.e("TBSREngine main-cost", "shortcut url NOT matched");
                AppMonitor.Alarm.commitFail("Shop", ShopConstants.POINT_SHOP_SHORTCUT, ShopConstants.ARG_SHOP_NAV_ONCE, "-1", ShopConstants.ALL_WEEX_MONITOR_ERROR_MSG);
                return null;
            }
            String a3 = f.a(a2.getShopTargetUrl());
            String str2 = "shortcut matched, original url is " + b2.toString() + " matched url is " + a3;
            Log.e("TBSREngine main-cost", "shortcut matched");
            AppMonitor.Alarm.commitSuccess("Shop", ShopConstants.POINT_SHOP_SHORTCUT, ShopConstants.ARG_SHOP_NAV_ONCE);
            b.a(a2, ShopConstants.V_SHOP_RULESET_SHOP);
            return a3;
        }
    }

    public boolean a(String str, String str2, Context context) {
        TBShopPageType tBShopPageType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d63e1d0", new Object[]{this, str, str2, context})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            ouu.b("match()  -   TextUtils.isEmpty(url) || TextUtils.isEmpty(bundleName) ");
            return false;
        }
        ouu.a("originalURL： " + str2);
        try {
            Uri b2 = b(Uri.parse(str2));
            if (d(b2)) {
                ouu.b("url should ignore   ->   return false");
                return false;
            } else if (c(b2)) {
                ouu.b("url isProcessed   ->   return false");
                return false;
            } else {
                TBUrlRuleResponse a2 = com.taobao.tao.shop.rule.f.a().a(str);
                if (a2 == null) {
                    ouu.b("match method return false, shopRuleResponse is null  " + str);
                    return false;
                }
                c.b();
                c.a a3 = com.taobao.tao.shop.rule.c.a(a2.rules, b2);
                if (!a3.f21094a) {
                    if (b2.isOpaque()) {
                        return false;
                    }
                    String queryParameter = b2.getQueryParameter("isShopDomain");
                    boolean l = b.a().l();
                    if (("1".equals(queryParameter) || "true".equals(queryParameter)) && l) {
                        a3.f21094a = true;
                        a3.e = "NEED_PROCESS_NEW";
                        a3.d = ShopConstants.V_SHOP_RULESET_SHOP;
                        ouu.c("not match but contains isShopDomain");
                    } else {
                        ouu.a("TBRuleMatcher.matchRuleSet   ->   return isMatch is false");
                        return false;
                    }
                }
                ouu.a("MatchResult name=" + a3.d + ", handleType=" + a3.e);
                if (oux.a(a3.d) || oux.a(a3.e)) {
                    ouu.b("MatchResult name or handleType is empty  ->  return false");
                    return false;
                }
                String str3 = a3.e;
                char c2 = 65535;
                switch (str3.hashCode()) {
                    case -1785727641:
                        if (str3.equals("NEED_PROCESS_NEW")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case -861730342:
                        if (str3.equals("REDIRECT_NATIVE")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -799562624:
                        if (str3.equals("REDIRECT_H5_TARGET")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 1487264678:
                        if (str3.equals("NEED_PROCESS")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 1488455387:
                        if (str3.equals("REDIRECT_H5_INPUT")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1620195808:
                        if (str3.equals("REDIRECT_H5_TARGET_WITH_PARAMS")) {
                            c2 = 4;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    a(TBShopPageType.SHOP_PAGE_FORCE_H5_BROWSER, str2, str2, (Bundle) null);
                } else if (c2 == 1) {
                    a(TBShopPageType.SHOP_PAGE_FORCE_H5_BROWSER, a3.b, str2, (Bundle) null);
                } else if (c2 == 2) {
                    b(str2, a3.d, currentTimeMillis);
                } else if (c2 == 3) {
                    if (ShopConstants.V_SHOP_RULESET_SEARCH_CATEGORY.equals(a3.d)) {
                        tBShopPageType = TBShopPageType.SHOP_PAGE_CATEGORY;
                    } else if (ShopConstants.V_SHOP_RULESET_SEARCH_SHOP.equals(a3.d)) {
                        tBShopPageType = TBShopPageType.SHOP_PAGE_SEARCH;
                    } else if (ShopConstants.V_SHOP_RULESET_REDIRECT.equals(a3.d)) {
                        tBShopPageType = TBShopPageType.SHOP_PAGE_REDIRECT;
                    } else {
                        a(str2);
                    }
                    a(b2, a3.b, tBShopPageType, str2);
                } else if (c2 == 4) {
                    a(b2, a3.b, TBShopPageType.SHOP_PAGE_REDIRECT, str2);
                } else if (c2 == 5) {
                    a(str2, a3.d, currentTimeMillis);
                } else {
                    ouu.a("TBRuleMatcher.matchRuleSet   ->  result.handleType = default");
                    return false;
                }
                return true;
            }
        } catch (Exception e) {
            ouu.a(e, "Uri.parse : ");
            return false;
        }
    }

    private void a(Uri uri, String str, TBShopPageType tBShopPageType, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fca305c", new Object[]{this, uri, str, tBShopPageType, str2});
            return;
        }
        String a2 = a(uri, str);
        if (TextUtils.isEmpty(a2)) {
            ouu.a("performAssembleUrl()   ->  TextUtils.isEmpty(targetUrl)");
        } else {
            a(tBShopPageType, a2, str2, (Bundle) null);
        }
    }

    private void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{this, str, str2, new Long(j)});
        } else {
            a(str, str2, j, true);
        }
    }

    private void b(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551fcde7", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        ouu.c("perform mtop url : " + str);
        Log.e("tbsr", "perform mtop url : " + str);
        if (ShopConstants.V_SHOP_RULESET_SHOP.equals(str2)) {
            Uri parse = Uri.parse(str);
            boolean equals = "true".equals(com.taobao.tao.shop.rule.util.c.a(com.taobao.tao.shop.rule.util.c.a(parse), ShopConstants.K_JUMP_LOFT));
            String queryParameter = parse.getQueryParameter("shopDirectType");
            if ("new".equals(queryParameter)) {
                if (equals) {
                    String e = com.taobao.tao.shop.rule.util.c.e(str);
                    if (TextUtils.isEmpty(e)) {
                        a(str);
                        return;
                    } else {
                        a(TBShopPageType.SHOP_PAGE_NEW_LOFT, e, str, (Bundle) null);
                        return;
                    }
                }
                a(str);
                return;
            } else if ("old".equals(queryParameter)) {
                if (b.a().i()) {
                    a(str, str2, j, false);
                    return;
                }
                String a2 = a(parse, "http://shop.m.taobao.com/shophomepage/index.htm");
                if (TextUtils.isEmpty(a2)) {
                    a(str);
                    return;
                } else if (equals) {
                    a(TBShopPageType.SHOP_PAGE_OLD_LOFT, a2, str, (Bundle) null);
                    return;
                } else {
                    a(TBShopPageType.SHOP_PAGE_OLD_HOME, a2, str, (Bundle) null);
                    return;
                }
            } else {
                a(str, str2, j, false);
                return;
            }
        }
        a(str, str2, j, false);
    }

    private void a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean contains = str.contains("?");
        if (str.contains("#")) {
            int indexOf = str.indexOf("#");
            if (!contains || indexOf > str.indexOf("?")) {
                str2 = str.substring(indexOf);
                str = str.substring(0, indexOf);
                sb.append(str);
                a(sb, contains);
                sb.append(str2);
                ouu.a("procPersonalShop： " + sb.toString());
                a(TBShopPageType.SHOP_PAGE_PROCESSED_ERROR, sb.toString(), str, (Bundle) null);
            }
        }
        str2 = "";
        sb.append(str);
        a(sb, contains);
        sb.append(str2);
        ouu.a("procPersonalShop： " + sb.toString());
        a(TBShopPageType.SHOP_PAGE_PROCESSED_ERROR, sb.toString(), str, (Bundle) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r16, final java.lang.String r17, final long r18, final boolean r20) {
        /*
            r15 = this;
            r11 = r17
            r12 = r20
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.shop.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L2e
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r15
            r2 = 1
            r1[r2] = r16
            r2 = 2
            r1[r2] = r11
            r2 = 3
            java.lang.Long r3 = new java.lang.Long
            r4 = r18
            r3.<init>(r4)
            r1[r2] = r3
            r2 = 4
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r12)
            r1[r2] = r3
            java.lang.String r2 = "6999330c"
            r0.ipc$dispatch(r2, r1)
            return
        L2e:
            r4 = r18
            boolean r0 = tb.oux.a(r17)
            if (r0 == 0) goto L3a
            r15.a(r16)
            return
        L3a:
            com.taobao.tao.shop.fetcher.adapter.b r0 = com.taobao.tao.shop.fetcher.adapter.b.a()
            boolean r9 = r0.g()
            android.net.Uri r0 = android.net.Uri.parse(r16)
            java.lang.String r1 = "shopUtParamUrl"
            java.lang.String r8 = r0.getQueryParameter(r1)
            if (r9 == 0) goto L90
            if (r8 == 0) goto L8c
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch: java.lang.Throwable -> L83
            r2.clearQuery()     // Catch: java.lang.Throwable -> L83
            java.util.Set r3 = r0.getQueryParameterNames()     // Catch: java.lang.Throwable -> L83
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L83
        L60:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L7a
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L83
            boolean r7 = r1.equals(r6)     // Catch: java.lang.Throwable -> L83
            if (r7 != 0) goto L60
            java.lang.String r7 = r0.getQueryParameter(r6)     // Catch: java.lang.Throwable -> L83
            r2.appendQueryParameter(r6, r7)     // Catch: java.lang.Throwable -> L83
            goto L60
        L7a:
            android.net.Uri r0 = r2.build()     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L83
            goto L8e
        L83:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            tb.ouu.c(r0)
            goto L90
        L8c:
            r0 = r16
        L8e:
            r13 = r0
            goto L92
        L90:
            r13 = r16
        L92:
            if (r12 != 0) goto Laf
            android.app.Application r0 = com.taobao.utils.Global.getApplication()     // Catch: java.lang.Throwable -> La7
            android.support.v4.content.LocalBroadcastManager r0 = android.support.v4.content.LocalBroadcastManager.getInstance(r0)     // Catch: java.lang.Throwable -> La7
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = "SHOP_ROUTE_HIT"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La7
            r0.sendBroadcastSync(r1)     // Catch: java.lang.Throwable -> La7
            goto Laf
        La7:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            tb.ouu.c(r0)
        Laf:
            long r6 = java.lang.System.currentTimeMillis()
            com.taobao.tao.shop.fetcher.c r0 = com.taobao.tao.shop.d.c
            com.taobao.tao.shop.d$1 r14 = new com.taobao.tao.shop.d$1
            r1 = r14
            r2 = r15
            r3 = r17
            r4 = r18
            r10 = r20
            r1.<init>()
            r0.a(r13, r11, r14, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.shop.d.a(java.lang.String, java.lang.String, long, boolean):void");
    }

    private static void b(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552009f7", new Object[]{str, str2, new Boolean(z)});
            return;
        }
        try {
            boolean equals = "true".equals(Uri.parse(str).getQueryParameter("matchAbsolutelyShopRule"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("match3Rules", (Object) Boolean.valueOf(equals));
            jSONObject.put("goToShopFrame", (Object) Boolean.valueOf(z));
            jSONObject.put("routeUrl", (Object) str);
            jSONObject.put("industryShop", (Object) str2);
            jSONObject.put("isNativeFrameWork", (Object) false);
            com.taobao.tao.shop.rule.util.e.a("Shop", "route", jSONObject, new JSONObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beadfb21", new Object[]{uri})).booleanValue();
        }
        Map<String, String> a2 = com.taobao.tao.shop.rule.util.c.a(uri);
        return a2 != null && a2.containsKey(SHOP_RULE_PROCESSED);
    }

    private static boolean d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4533b5c0", new Object[]{uri})).booleanValue();
        }
        Map<String, String> a2 = com.taobao.tao.shop.rule.util.c.a(uri);
        return a2 != null && a2.containsKey("shop_router_ignore") && Boolean.TRUE.toString().equals(a2.get("shop_router_ignore"));
    }

    private void a(StringBuilder sb, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc4da71", new Object[]{this, sb, new Boolean(z)});
        } else if (z) {
            sb.append("&");
            sb.append(SHOP_RULE_PROCESSED);
            sb.append("=true");
        } else {
            sb.append("?");
            sb.append(SHOP_RULE_PROCESSED);
            sb.append("=true");
        }
    }

    private String a(Uri uri, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7e1cdd7", new Object[]{this, uri, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String trim = str.trim();
        Map<String, String> a2 = com.taobao.tao.shop.rule.util.c.a(uri);
        StringBuilder sb = new StringBuilder();
        String uri2 = uri.toString();
        boolean contains = uri2.contains("?");
        boolean contains2 = uri2.contains("#");
        int indexOf = uri2.indexOf("#");
        int indexOf2 = uri2.indexOf("?");
        if (!contains2 || (contains && indexOf <= indexOf2)) {
            str2 = "";
        } else {
            str2 = uri2.substring(indexOf);
            uri2 = uri2.substring(0, indexOf);
        }
        sb.append(uri2);
        a(sb, contains);
        if (a2 != null && !TextUtils.isEmpty(a2.get("shop_id"))) {
            sb.append("&shop_id=");
            sb.append(a2.get("shop_id"));
        }
        sb.append(str2);
        String sb2 = sb.toString();
        boolean contains3 = sb2.contains("?");
        int indexOf3 = sb2.indexOf("?");
        boolean contains4 = sb2.contains("#");
        int indexOf4 = sb2.indexOf("#");
        sb.setLength(0);
        if (contains4 && contains3) {
            indexOf3 = Math.min(indexOf3, indexOf4);
        } else if (contains4) {
            indexOf3 = indexOf4;
        } else if (!contains3) {
            indexOf3 = sb2.length();
        }
        if (trim.contains("?")) {
            sb.append(trim);
            sb.append("&");
            sb.append(sb2.substring(indexOf3 + 1));
        } else {
            sb.append(trim);
            sb.append(sb2.substring(indexOf3));
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.tao.shop.d$2] */
    private void a(TBShopPageType tBShopPageType, final String str, final String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f875660f", new Object[]{this, tBShopPageType, str, str2, bundle});
            return;
        }
        ouu.a("router callback   type=" + tBShopPageType + ",  targetUrl=" + str + ",  originUrl=" + str2);
        if (this.d == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.a(TBShopPageType.SHOP_PAGE_PROCESSED_ERROR, str2, bundle);
            return;
        }
        this.d.a(tBShopPageType, str, bundle);
        this.d = null;
        if (!b() && !com.taobao.tao.shop.rule.util.a.a("shop_render", "compare_actual_url", false)) {
            return;
        }
        new AsyncTask<Void, Void, Void>() { // from class: com.taobao.tao.shop.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
            @Override // android.os.AsyncTask
            public /* synthetic */ Void doInBackground(Void[] voidArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            public Void a(Void... voidArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                }
                d.a(d.this, str2, str);
                return null;
            }
        }.execute(new Void[0]);
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (str != null && str2 != null) {
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("user_id");
                String queryParameter2 = parse.getQueryParameter("item_id");
                String queryParameter3 = parse.getQueryParameter("currentClickTime");
                StringBuilder sb = new StringBuilder("https://market.m.taobao.com/apps/market/shop/weex.html?wh_weex=true&wx_navbar_transparent=true&sellerId=");
                sb.append(queryParameter);
                sb.append("&data_prefetch=true&item_id=");
                sb.append(queryParameter2);
                sb.append("&wx_navbar_hidden=true&");
                sb.append("isShopToPopLayerSDK=true");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    sb.append("&currentClickTime=");
                    sb.append(queryParameter3);
                }
                sb.append("&pre_item_id=");
                sb.append(queryParameter2);
                sb.toString();
                String sb2 = sb.toString();
                String queryParameter4 = Uri.parse(str2).getQueryParameter("shopId");
                HashMap hashMap = new HashMap();
                hashMap.put("sellerId", queryParameter);
                hashMap.put("shopId", queryParameter4);
                hashMap.put("localUrl", sb2);
                hashMap.put(LoadingChatActivity.LOAD_CHAT_KEY, str);
                hashMap.put("actualUrl", str2);
                hashMap.put("uuid", UUID.randomUUID().toString());
                int indexOf = str2.indexOf("&shopId=");
                int indexOf2 = str2.indexOf("&", indexOf + 1);
                if (indexOf > 0 && indexOf2 > 0) {
                    String str3 = str2.substring(0, indexOf) + str2.substring(indexOf2);
                    hashMap.put("actualUrl2", str3);
                    String valueOf = String.valueOf(System.currentTimeMillis() - currentTimeMillis);
                    hashMap.put("cost", valueOf);
                    if (str3.equals(sb2)) {
                        h.a("dataProcess", queryParameter, hashMap);
                        ouu.a("route_local_compare matched. cost " + valueOf + " ms.");
                        return;
                    } else if (b(str3, sb2)) {
                        h.a("dataProcess", queryParameter, hashMap, "-23002", "route_local_compare_not_match");
                        ouu.a("route_local_compare NOT matched but similar. cost " + valueOf + " ms. remote: " + str3 + " local:" + sb2);
                        return;
                    } else {
                        h.a("dataProcess", queryParameter, hashMap, "-23001", "route_local_compare_not_match");
                        ouu.a("route_local_compare NOT matched. cost " + valueOf + " ms. remote: " + str3 + " local:" + sb2);
                        return;
                    }
                }
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                h.a("dataProcess", queryParameter, hashMap, "-23229", "route_local_compare_not_contains_shopId");
            }
        } catch (Throwable unused) {
            h.a("dataProcess", "", null, "-23228", "route_local_compare_exception");
        }
    }

    private boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        Map<String, String> b2 = b(str);
        Map<String, String> b3 = b(str2);
        for (String str3 : b2.keySet()) {
            if (!"pre_item_id".equals(str3) && !"currentClickTime".equals(str3)) {
                String str4 = b2.get(str3);
                String str5 = b3.get(str3);
                if (str4 != null && !str4.equals(str5)) {
                    return false;
                }
                if (str4 == null && str5 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    private Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (str == null || !str.contains("?")) {
            return hashMap;
        }
        int indexOf = str.indexOf("?") + 1;
        do {
            int indexOf2 = str.indexOf(38, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.length();
            }
            int indexOf3 = str.indexOf(61, indexOf);
            if (indexOf3 > indexOf2 || indexOf3 == -1) {
                indexOf3 = indexOf2;
            }
            if (indexOf3 > indexOf) {
                String substring = str.substring(indexOf, indexOf3);
                int i = indexOf3 + 1;
                hashMap.put(Uri.decode(substring), Uri.decode(i <= indexOf2 ? str.substring(i, indexOf2) : ""));
            }
            indexOf = indexOf2 + 1;
        } while (indexOf < str.length());
        return hashMap;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.e;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if ((Global.getApplication().getApplicationInfo().flags & 2) == 0) {
                z = false;
            }
            this.e = Boolean.valueOf(z);
            return this.e.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }
}
