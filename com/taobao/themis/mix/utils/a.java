package com.taobao.themis.mix.utils;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.utils.i;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\bH\u0003J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0003J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0003J\"\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0014H\u0007J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J&\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/taobao/themis/mix/utils/TMSMixPageInfoUtils;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "addPageQueryToUrl", "url", "query", "", "appendUrlParams", "startUrl", "renderUrl", "getAppConfigsByAppInfo", "Lcom/alibaba/fastjson/JSONObject;", "metaInfo", "Lcom/taobao/themis/kernel/metaInfo/TMSMetaInfoWrapper;", "getHomeMixPageInfo", "Lcom/taobao/themis/mix/utils/MixPageInfo;", "originUrl", "pageInfoList", "", "getMixPageInfoList", "getPHAManifestByAppInfo", "getTargetPageInfoByPath", "pageList", "path", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    static {
        kge.a(1473761099);
        INSTANCE = new a();
    }

    private a() {
    }

    @JvmStatic
    public static final JSONObject a(TMSMetaInfoWrapper tMSMetaInfoWrapper) {
        JSONObject m;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("72327cd1", new Object[]{tMSMetaInfoWrapper});
        }
        if (tMSMetaInfoWrapper != null && (m = tMSMetaInfoWrapper.m()) != null && (jSONObject = m.getJSONObject("extConfigs")) != null) {
            return jSONObject.getJSONObject("phaManifest");
        }
        return null;
    }

    @JvmStatic
    public static final List<MixPageInfo> b(TMSMetaInfoWrapper tMSMetaInfoWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("364dbd95", new Object[]{tMSMetaInfoWrapper});
        }
        ArrayList arrayList = new ArrayList();
        JSONObject c = c(tMSMetaInfoWrapper);
        if (c != null) {
            JSONArray pages = c.getJSONArray("pages");
            try {
                q.b(pages, "pages");
                int size = pages.size();
                for (int i = 0; i < size; i++) {
                    MixPageInfo pageItem = (MixPageInfo) JSON.parseObject(pages.getJSONObject(i).toString(), MixPageInfo.class);
                    q.b(pageItem, "pageItem");
                    arrayList.add(pageItem);
                }
            } catch (Exception e) {
                TMSLogger.b("TMSMixPageInfoUtils", "getMixPageInfoList occurs error " + e.getMessage(), e);
            }
        }
        return arrayList;
    }

    @JvmStatic
    public static final MixPageInfo a(String originUrl, List<MixPageInfo> pageInfoList) {
        MixPageInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MixPageInfo) ipChange.ipc$dispatch("9d9aeb02", new Object[]{originUrl, pageInfoList});
        }
        q.d(originUrl, "originUrl");
        q.d(pageInfoList, "pageInfoList");
        Uri b = o.b(originUrl);
        String queryParameter = b != null ? b.getQueryParameter("page") : null;
        Map<String, String> a3 = o.a(queryParameter, true);
        String str = queryParameter;
        if ((str == null || str.length() == 0) && (!pageInfoList.isEmpty())) {
            a2 = pageInfoList.get(0);
        } else {
            String queryParameter2 = o.b(originUrl).getQueryParameter("page");
            if (queryParameter2 == null) {
                queryParameter2 = null;
            }
            a2 = a(pageInfoList, queryParameter2);
        }
        if (a2 != null) {
            a2.setPageUrl(a(originUrl, a2.getPageUrl()));
            String a4 = a(a2.getPageUrl(), a3);
            if (a4 != null) {
                a2.setPageUrl(a4);
            }
        }
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005e A[EDGE_INSN: B:36:0x005e->B:32:0x005e ?: BREAK  , SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.taobao.themis.mix.utils.MixPageInfo a(java.util.List<com.taobao.themis.mix.utils.MixPageInfo> r7, java.lang.String r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.mix.utils.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r7
            r1[r3] = r8
            java.lang.String r7 = "15f204c2"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            com.taobao.themis.mix.utils.MixPageInfo r7 = (com.taobao.themis.mix.utils.MixPageInfo) r7
            return r7
        L18:
            r0 = r8
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L26
            int r0 = r0.length()
            if (r0 != 0) goto L24
            goto L26
        L24:
            r0 = 0
            goto L27
        L26:
            r0 = 1
        L27:
            r1 = 0
            if (r0 == 0) goto L2b
            return r1
        L2b:
            if (r7 == 0) goto L61
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L33:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r7.next()
            r5 = r0
            com.taobao.themis.mix.utils.MixPageInfo r5 = (com.taobao.themis.mix.utils.MixPageInfo) r5
            if (r5 == 0) goto L47
            java.lang.String r6 = r5.getPagePath()
            goto L48
        L47:
            r6 = r1
        L48:
            if (r6 == 0) goto L59
            java.lang.String r5 = r5.getPagePath()
            kotlin.jvm.internal.q.a(r5)
            boolean r5 = kotlin.text.n.b(r8, r5, r4, r2, r1)
            if (r5 == 0) goto L59
            r5 = 1
            goto L5a
        L59:
            r5 = 0
        L5a:
            if (r5 == 0) goto L33
            goto L5e
        L5d:
            r0 = r1
        L5e:
            com.taobao.themis.mix.utils.MixPageInfo r0 = (com.taobao.themis.mix.utils.MixPageInfo) r0
            return r0
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.mix.utils.a.a(java.util.List, java.lang.String):com.taobao.themis.mix.utils.MixPageInfo");
    }

    @JvmStatic
    private static final String a(String str, String str2) {
        Uri b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (n.bw()) {
            Uri b2 = o.b(str);
            q.b(b2, "TMSUrlUtils.parseUrl(startUrl)");
            String a2 = i.INSTANCE.a(str2, b2.getEncodedQuery(), null, p.b("utparamcnt", com.taobao.themis.kernel.i.KEY_AFC_LINK, "isNeedHome"));
            return a2 == null ? "" : a2;
        }
        try {
            b = o.b(str2);
        } catch (Exception e) {
            TMSLogger.b("TMSMixPageInfoUtils", "appendUrlParams occurs error: " + e.getMessage(), e);
        }
        if (b == null) {
            return "";
        }
        Uri.Builder buildUpon = b.buildUpon();
        Map<String, String> allUrlParam = o.a(str);
        JSONArray parseArray = JSONArray.parseArray("['utparamcnt', '_afc_link', 'isNeedHome']");
        q.b(allUrlParam, "allUrlParam");
        for (Map.Entry<String, String> entry : allUrlParam.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (buildUpon != null && key != null && !parseArray.contains(key.toString())) {
                buildUpon = buildUpon.appendQueryParameter(key.toString(), value.toString());
            }
        }
        if (buildUpon != null) {
            String uri = buildUpon.build().toString();
            q.b(uri, "realUriBuilder.build().toString()");
            return uri;
        }
        return "";
    }

    @JvmStatic
    private static final String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        String str2 = str;
        if (!(str2 == null || str2.length() == 0) && map != null) {
            Uri parse = Uri.parse(str);
            Uri.Builder buildUpon = parse != null ? parse.buildUpon() : null;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String str3 = key;
                if (!(str3 == null || str3.length() == 0)) {
                    String str4 = value;
                    if (!(str4 == null || str4.length() == 0) && buildUpon != null) {
                        buildUpon.appendQueryParameter(key, value);
                    }
                }
            }
            if (buildUpon != null) {
                return buildUpon.toString();
            }
        }
        return null;
    }

    @JvmStatic
    private static final JSONObject c(TMSMetaInfoWrapper tMSMetaInfoWrapper) {
        JSONObject m;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fe878e53", new Object[]{tMSMetaInfoWrapper});
        }
        if (tMSMetaInfoWrapper != null && (m = tMSMetaInfoWrapper.m()) != null && (jSONObject = m.getJSONObject("extConfigs")) != null) {
            return jSONObject.getJSONObject("appConfig");
        }
        return null;
    }
}
