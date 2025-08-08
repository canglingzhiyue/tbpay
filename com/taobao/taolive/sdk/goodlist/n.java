package com.taobao.taolive.sdk.goodlist;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.preload.PreloadTaskBroadcastReceiver;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import mtopsdk.common.util.SymbolExpUtil;
import tb.ado;
import tb.fho;
import tb.kge;
import tb.pmd;
import tb.ppv;
import tb.sgq;

/* loaded from: classes8.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Deque<String> f21832a;

    static {
        kge.a(1207576271);
        f21832a = new ArrayDeque();
    }

    public static boolean a(Context context, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f10ee7f", new Object[]{context, liveItem})).booleanValue();
        }
        if (!k()) {
            return false;
        }
        ppv v = pmd.a().v();
        if (v != null && v.d() == 2 && m()) {
            com.taobao.taolive.sdk.utils.q.a("InsidePrefetchUtils", "canGotoInsideItemDetail | low device.");
            return false;
        }
        sgq E = pmd.a().E();
        if (E != null && (E.a(context) || E.b(context))) {
            com.taobao.taolive.sdk.utils.q.a("InsidePrefetchUtils", "canGotoInsideItemDetail | pad or fold device.");
            return false;
        }
        if (liveItem != null && liveItem.itemConfigInfo != null && liveItem.itemConfigInfo.getBooleanValue("insideDetail") && liveItem.itemConfigInfo.getBooleanValue("insideDetail")) {
            String b = b(context, liveItem);
            for (String str : n().split(SymbolExpUtil.SYMBOL_VERTICALBAR)) {
                if (b.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!k() || !d()) {
            return false;
        }
        ppv v = pmd.a().v();
        if (v == null || v.d() != 2 || !m()) {
            return true;
        }
        com.taobao.taolive.sdk.utils.q.a("InsidePrefetchUtils", "canGotoInsideItemDetail | low device.");
        return false;
    }

    public static void a(Context context, String str, String str2, List<String> list, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642db4f9", new Object[]{context, str, str2, list, str3, str4});
        } else if (d(str4)) {
            if (!StringUtils.isEmpty(str) && g().contains(str)) {
                return;
            }
            if ((!StringUtils.isEmpty(str2) && e().contains(str2)) || !c(str3) || list == null || list.isEmpty()) {
                return;
            }
            JSONArray jSONArray = new JSONArray();
            for (String str5 : list) {
                if (!StringUtils.isEmpty(str5) && !f().contains(str5)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("itemId", (Object) str5);
                    jSONArray.add(jSONObject);
                    a(str5);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bizName", (Object) "page_detail");
            jSONObject2.put("sourceFrom", (Object) str3);
            jSONObject2.put("items", (Object) jSONArray);
            Intent intent = new Intent("com.taobao.android.detail.StartPreloadTasks");
            intent.setPackage("com.taobao.taobao");
            intent.putExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS, jSONObject2.toJSONString());
            context.sendBroadcast(intent);
        }
    }

    public static String b(Context context, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c425c806", new Object[]{context, liveItem});
        }
        String lowerCase = a(context).toLowerCase();
        String str = null;
        boolean o = o();
        if (liveItem.extendVal != null && liveItem.extendVal.getBusinessJSON() != null && liveItem.extendVal.getBusinessJSON().getJSONObject("cpsTcpInfo") != null && liveItem.extendVal.getBusinessJSON().getJSONObject("cpsTcpInfo").containsKey(lowerCase) && liveItem.extendVal.getBusinessJSON().getJSONObject("itemBizInfo") != null && o) {
            JSONObject jSONObject = liveItem.extendVal.getBusinessJSON().getJSONObject("itemBizInfo");
            if (d.a() && "secKill".equals(liveItem.extendVal.itemBizType)) {
                str = jSONObject.getString("itemJumpUrl2");
            }
            return StringUtils.isEmpty(str) ? jSONObject.getString("itemJumpUrl") : str;
        }
        String str2 = liveItem.itemUrl;
        if (StringUtils.isEmpty(str2)) {
            str2 = "http://a.m.taobao.com/i" + liveItem.itemId + ".htm";
        }
        if (str2.startsWith(ado.URL_SEPARATOR)) {
            str2 = "http:" + liveItem.itemUrl;
        }
        return str2;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : pmd.a().u() != null ? pmd.a().u().a(context) : "unknow";
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (f21832a.size() >= 30) {
                f21832a.pop();
            }
            if (f21832a.contains(str)) {
                return;
            }
            f21832a.add(str);
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && f21832a.contains(str);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return a(str, b());
        }
        return false;
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return a(str, c());
        }
        return false;
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : pmd.a().d().a("tblive", "itemPrefetchSources", "live,hold");
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : pmd.a().d().a("tblive", "triggerMayClickOpenSources", "open_goodslist,switch_goodslist_tab,scroll_goodslist,open_aggregation,scroll_aggregation,open_search,scroll_search,hold");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableInsideDetailProcessConfig", "true"));
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : pmd.a().d().a("tblive", "itemPrefetchNoLiveIds", "");
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : pmd.a().d().a("tblive", "itemPrefetchNoItemIds", "");
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : pmd.a().d().a("tblive", "itemPrefetchNoEntryLiveSource", "");
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableGoodPrefetch", "true"));
    }

    public static int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[0])).intValue() : Integer.parseInt(pmd.a().d().a("tblive", "triggerMayClickMaxNum", "4"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableItemPrefetch", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", fho.KEY_FEATURE_ENABLE_INSIDE_DETAIL, "true"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enableItemHoldPrefetch", "true"));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "enable_insidedetail_low", "true"));
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[0]) : pmd.a().d().a("tblive", "needReplaceInsideUrls", "h5.m.taobao.com/awp/core/detail.htm");
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : com.taobao.taolive.sdk.utils.l.d(pmd.a().d().a("tblive", "EnableNewCps", "true"));
    }
}
