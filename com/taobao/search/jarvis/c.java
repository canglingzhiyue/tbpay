package com.taobao.search.jarvis;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.h;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.taolive.room.utils.aw;
import com.ut.mini.UTAnalytics;
import com.ut.mini.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.ntm;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1285805639);
    }

    public static void a(String str, String str2, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a8ae625", new Object[]{str, str2, map, obj});
        } else if (StringUtils.isEmpty(str) || obj == null || r.r()) {
        } else {
            k.d("SearchUserBehavior", str + " enter, args:%s", map);
            h.a(str, str2, obj, a(map));
        }
    }

    public static void b(String str, String str2, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94fbdf44", new Object[]{str, str2, map, obj});
        } else if (StringUtils.isEmpty(str) || obj == null || r.r()) {
        } else {
            k.d("SearchUserBehavior", str + " leave, args:%s", map);
            h.b(str, str2, obj, a(map));
        }
    }

    public static void a(AuctionBaseBean auctionBaseBean, int i, com.taobao.search.sf.datasource.c cVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a22dac", new Object[]{auctionBaseBean, new Integer(i), cVar, view});
        } else if (r.r()) {
        } else {
            a(l.getInstance().getCurrentPageName(), auctionBaseBean, i, cVar, view);
        }
    }

    public static void a(String str, AuctionBaseBean auctionBaseBean, int i, com.taobao.search.sf.datasource.c cVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b8abf6", new Object[]{str, auctionBaseBean, new Integer(i), cVar, view});
        } else if (auctionBaseBean == null || auctionBaseBean.itemAppearTracked || r.r()) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, auctionBaseBean.rn);
            hashMap.put(aw.PARAM_PVID, auctionBaseBean.rn);
            hashMap.put("item_id", auctionBaseBean.itemId);
            hashMap.put("page", String.valueOf(auctionBaseBean.page));
            hashMap.put(aw.PARAM_SEARCH_KEYWORD_POS, String.valueOf(i));
            hashMap.put("business", ntm.a(cVar));
            hashMap.put("utLogMap", JSON.toJSONString(auctionBaseBean.utLogMap));
            if (cVar != null) {
                hashMap.put("q", cVar.getKeyword());
                CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
                if (commonSearchResult != null) {
                    hashMap.put("sessionid", commonSearchResult.getMainInfo().rn);
                    if (commonSearchResult.getMainInfo().pageTraceArgs != null) {
                        String str2 = commonSearchResult.getMainInfo().pageTraceArgs.get("spm-cnt");
                        if (!StringUtils.isEmpty(str2)) {
                            String replace = str2.replace(".0.0", "");
                            hashMap.put("spm", replace + ".itemlist." + i);
                        }
                    }
                }
            }
            BaseCellBean baseCellBean = auctionBaseBean.mOutterBean;
            if (baseCellBean != null) {
                hashMap.put("pagePos", String.valueOf(baseCellBean.pagePos));
                hashMap.put("pageSize", String.valueOf(baseCellBean.pageSize));
            }
            a(str, auctionBaseBean.itemId, (Map<String, Object>) hashMap, view);
            auctionBaseBean.itemAppearTracked = true;
        }
    }

    public static void a(String str, String str2, Map<String, Object> map, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d568ba9", new Object[]{str, str2, map, view});
        } else if (StringUtils.isEmpty(str) || view == null || r.r()) {
        } else {
            h.a(str, "Search-ItemExposure", str2, view, a(map));
            com.taobao.android.jarviswe.a.a().a(str, "expose", map, null);
        }
    }

    public static void a(AuctionBaseBean auctionBaseBean, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7359969", new Object[]{auctionBaseBean, view});
        } else if (r.r()) {
        } else {
            a(l.getInstance().getCurrentPageName(), auctionBaseBean, view);
        }
    }

    public static void a(String str, AuctionBaseBean auctionBaseBean, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68da74b3", new Object[]{str, auctionBaseBean, view});
        } else if (auctionBaseBean == null || auctionBaseBean.itemDisappearTracked || r.r() || StringUtils.isEmpty(str) || view == null) {
        } else {
            h.b(str, "Search-ItemExposure", auctionBaseBean.itemId, view, a(new HashMap()));
            auctionBaseBean.itemDisappearTracked = true;
        }
    }

    public static void a(com.taobao.search.sf.datasource.c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a1ed62", new Object[]{cVar, str});
        } else if (cVar == null || r.r()) {
        } else {
            CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
            CommonSearchResult commonSearchResult2 = (CommonSearchResult) cVar.getLastSearchResult();
            if (commonSearchResult == null || commonSearchResult2 == null || !commonSearchResult2.isSuccess()) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, commonSearchResult2.getMainInfo().rn);
            hashMap.put("page", Integer.valueOf(commonSearchResult2.getMainInfo().page));
            hashMap.put("search_sessionid", commonSearchResult.getMainInfo().rn);
            hashMap.put("page_size", String.valueOf(commonSearchResult2.getCellsCount()));
            hashMap.put("query", commonSearchResult.getMainInfo().keyword);
            if (StringUtils.isEmpty(str)) {
                str = l.getInstance().getCurrentPageName();
            }
            a(str, commonSearchResult2.getMainInfo().rn, hashMap);
        }
    }

    public static void a(com.taobao.search.sf.datasource.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141ef998", new Object[]{cVar});
        } else {
            a(cVar, (String) null);
        }
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || r.r()) {
        } else {
            k.e("SearchUserBehavior", "request,id:" + str2);
            h.c(str, "Search-Request", str2, a(map));
        }
    }

    public static void a(AuctionBaseBean auctionBaseBean, String str, Context context, int i, Map<String, Object> map) {
        Map<String, String> pageProperties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac69bcf7", new Object[]{auctionBaseBean, str, context, new Integer(i), map});
        } else if (auctionBaseBean == null || r.r()) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(aw.PARAM_PVID, auctionBaseBean.rn);
            hashMap.put("index", String.valueOf(i));
            hashMap.put("utLogMap", JSON.toJSONString(auctionBaseBean.utLogMap));
            hashMap.put("keyword", str);
            if (auctionBaseBean.mOutterBean != null) {
                hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, auctionBaseBean.mOutterBean.rn);
            }
            if (context != null && (pageProperties = UTAnalytics.getInstance().getDefaultTracker().getPageProperties(context)) != null && !pageProperties.isEmpty()) {
                String str2 = pageProperties.get("spm-url");
                if (!StringUtils.isEmpty(str2)) {
                    hashMap.put("spm-url", str2);
                }
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            h.a(l.getInstance().getCurrentPageName(), "Search-ItemClick", "", auctionBaseBean.itemId, a(hashMap));
        }
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else {
            h.a(l.getInstance().getCurrentPageName(), com.taobao.search.musie.k.ACTION_LIST_SCROLL, 0, i, new String[0]);
        }
    }

    public static void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
        } else {
            h.b(l.getInstance().getCurrentPageName(), com.taobao.search.musie.k.ACTION_LIST_SCROLL, 0, i, new String[0]);
        }
    }

    public static String[] a(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ab7e78ac", new Object[]{map});
        }
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!StringUtils.isEmpty(str) && obj != null) {
                    arrayList.add(str + "=" + obj);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
