package com.taobao.search.refactor;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.r;
import com.taobao.search.mmd.datasource.bean.SearchBarBean;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import tb.ioz;
import tb.iub;
import tb.kge;
import tb.noa;
import tb.nom;
import tb.nsk;
import tb.nth;
import tb.ntz;
import tb.ssm;

/* loaded from: classes7.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1926995318);
    }

    public static final /* synthetic */ void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
        } else {
            b(str, th);
        }
    }

    public static final void a(MSearchResult result, JSONObject data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf8bab2", new Object[]{result, data});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        kotlin.jvm.internal.q.c(data, "data");
        result.templatesParseTraceDigest = new ioz();
        Map<String, TemplateBean> a2 = iub.a(data.getJSONArray("templates"), result.templatesParseTraceDigest, result.c());
        if (a2 == null) {
            return;
        }
        if (result.getTemplates() == null) {
            result.setTemplates(a2);
            return;
        }
        Map<String, TemplateBean> templates = result.getTemplates();
        if (templates == null) {
            kotlin.jvm.internal.q.a();
        }
        templates.putAll(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7 A[Catch: Throwable -> 0x0223, TryCatch #0 {Throwable -> 0x0223, blocks: (B:7:0x0035, B:10:0x0043, B:13:0x0053, B:16:0x0067, B:18:0x00b9, B:23:0x00d3, B:25:0x00e7, B:26:0x00ea, B:28:0x00f8, B:30:0x00fe, B:31:0x0101, B:33:0x0122, B:32:0x010d), top: B:38:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8 A[Catch: Throwable -> 0x0223, TryCatch #0 {Throwable -> 0x0223, blocks: (B:7:0x0035, B:10:0x0043, B:13:0x0053, B:16:0x0067, B:18:0x00b9, B:23:0x00d3, B:25:0x00e7, B:26:0x00ea, B:28:0x00f8, B:30:0x00fe, B:31:0x0101, B:33:0x0122, B:32:0x010d), top: B:38:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d A[Catch: Throwable -> 0x0223, TryCatch #0 {Throwable -> 0x0223, blocks: (B:7:0x0035, B:10:0x0043, B:13:0x0053, B:16:0x0067, B:18:0x00b9, B:23:0x00d3, B:25:0x00e7, B:26:0x00ea, B:28:0x00f8, B:30:0x00fe, B:31:0x0101, B:33:0x0122, B:32:0x010d), top: B:38:0x0035 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.taobao.search.refactor.MSearchResult r19, com.alibaba.fastjson.JSONObject r20) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.refactor.i.b(com.taobao.search.refactor.MSearchResult, com.alibaba.fastjson.JSONObject):void");
    }

    public static final void a(MSearchResult result, JSONObject dataObject, boolean z) {
        String boxSearchUrl;
        boolean z2;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c11f4e62", new Object[]{result, dataObject, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        kotlin.jvm.internal.q.c(dataObject, "dataObject");
        try {
            if (z) {
                boxSearchUrl = dataObject.getString(nsk.KEY_GUIDE_SEARCH_URL);
                if (StringUtils.isEmpty(boxSearchUrl)) {
                    boxSearchUrl = dataObject.getString(nom.KEY_BOX_SEARCH);
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (StringUtils.isEmpty(boxSearchUrl)) {
                    return;
                }
                if (z2) {
                    if (StringUtils.isEmpty(dataObject.getString(nsk.KEY_GUIDE_SEARCH_URL))) {
                        z3 = false;
                    }
                    result.guideSearch = z3;
                }
            } else {
                boxSearchUrl = dataObject.getString(nom.KEY_BOX_SEARCH);
                if (StringUtils.isEmpty(boxSearchUrl)) {
                    return;
                }
                z2 = false;
            }
            if (dataObject.getBooleanValue("isTaoCommand")) {
                kotlin.jvm.internal.q.a((Object) boxSearchUrl, "boxSearchUrl");
                a(boxSearchUrl);
            }
            dataObject.remove(nom.KEY_BOX_SEARCH);
            if (boxSearchUrl == null) {
                kotlin.jvm.internal.q.a();
            }
            Map<String, String> a2 = r.a(boxSearchUrl);
            kotlin.jvm.internal.q.a((Object) a2, "SearchUrlUtil.getParamsFromUrl(boxSearchUrl!!)");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "tItemType", nom.TYPE_NAME);
            jSONObject.put((JSONObject) "url", boxSearchUrl);
            JSONObject jSONObject2 = new JSONObject();
            nsk.a(jSONObject2, nom.KEY_IMMERSE_STYLE, a2.get(nom.KEY_X_IMMERSE_STYLE));
            nsk.a(jSONObject2, nom.KEY_NAVI_STYLE, a2.get(nom.KEY_X_NAVI_STYLE));
            nsk.a(jSONObject2, "redirect", a2.get(nom.KEY_X_REDIRECT));
            nsk.a(jSONObject2, nom.KEY_HIDE_NAVIBAR, a2.get(nom.KEY_X_HIDE_NAVIBAR));
            nsk.a(jSONObject2, nom.KEY_SIZE_RATION, a2.get(nom.KEY_X_RATION));
            nsk.a(jSONObject2, nom.KEY_DISABLE_HEADER_SCROLL, a2.get(nom.KEY_DISABLE_HEADER_SCROLL));
            nsk.a(jSONObject2, "tabTextNormalColor", a2.get("_xsearchTabTextNormalColor"));
            nsk.a(jSONObject2, "tabTextSelectedColor", a2.get("_xsearchTabTextSelectedColor"));
            if (z2) {
                jSONObject2.put((JSONObject) "bizType", noa.VALUE_BIZ_TYPE_NEW_SEARCH);
            } else if (dataObject.getBooleanValue(nom.KEY_IS_FULL)) {
                jSONObject2.put((JSONObject) "bizType", noa.VALUE_BIZ_TYPE_QD);
            } else {
                jSONObject2.put((JSONObject) "bizType", noa.VALUE_BIZ_TYPE_ONESEARCH);
                int intValue = dataObject.getIntValue("height") - com.taobao.android.searchbaseframe.util.g.b(a2.get(nom.KEY_X_CUT_HEIGHT), 0);
                jSONObject2.put((JSONObject) "width", dataObject.getString("width"));
                jSONObject2.put((JSONObject) "height", String.valueOf(intValue));
            }
            jSONObject.put((JSONObject) "style", (String) jSONObject2);
            dataObject.put((JSONObject) "sceneHeader", (String) jSONObject);
        } catch (Throwable th) {
            b(noa.VALUE_BIZ_TYPE_ONESEARCH, th);
        }
    }

    private static final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        Intent intent = new Intent("afc_page_open_broadcast");
        intent.putExtra("pageName", "share");
        intent.putExtra("pageUrl", str);
        intent.putExtra("openTimestamp", System.currentTimeMillis());
        LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
    }

    public static final void c(MSearchResult result, JSONObject data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9df8670", new Object[]{result, data});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        kotlin.jvm.internal.q.c(data, "data");
        JSONObject jSONObject = data.getJSONObject(ssm.UI_MODULE_SEARCH_BAR);
        if (jSONObject != null) {
            result.setSearchBarInfo(SearchBarBean.fromJson(jSONObject));
        } else {
            result.setSearchBarInfo(SearchBarBean.createDefault());
        }
    }

    public static final void d(MSearchResult result, JSONObject data) {
        String mergeForBts;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d2ec4f", new Object[]{result, data});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        kotlin.jvm.internal.q.c(data, "data");
        try {
            JSONObject b = com.taobao.android.searchbaseframe.util.a.b(data, "pageInfo");
            result.pageInfo = b;
            Object clone = b != null ? b.clone() : null;
            if (!(clone instanceof JSONObject)) {
                clone = null;
            }
            result.copyPageInfo = (JSONObject) clone;
            if (b == null) {
                return;
            }
            String mergeForBts2 = b.getString("for_bts");
            if (StringUtils.isEmpty(mergeForBts2)) {
                mergeForBts = nth.a();
            } else {
                kotlin.jvm.internal.q.a((Object) mergeForBts2, "mergeForBts");
                if (!kotlin.text.n.c(mergeForBts2, ";", false, 2, (Object) null)) {
                    mergeForBts2 = mergeForBts2 + ";";
                }
                mergeForBts = mergeForBts2 + nth.a();
            }
            b.put((JSONObject) "for_bts", mergeForBts);
            if (!com.taobao.search.common.util.r.aP()) {
                return;
            }
            ntz ntzVar = ntz.INSTANCE;
            kotlin.jvm.internal.q.a((Object) mergeForBts, "mergeForBts");
            ntzVar.a(mergeForBts);
            ntz.INSTANCE.b(mergeForBts);
        } catch (Throwable th) {
            b("pageInfo", th);
        }
    }

    private static final void b(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1040462", new Object[]{str, th});
            return;
        }
        AppMonitor.Counter.commit("tbsearch", "parseError", str, 1.0d);
        PrintWriter printWriter = new PrintWriter(new StringWriter());
        th.printStackTrace(printWriter);
        TLog.loge("search", "dataParse", str + " parse error:" + printWriter);
    }
}
