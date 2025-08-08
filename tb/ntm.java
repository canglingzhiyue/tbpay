package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.r;
import com.taobao.search.common.util.k;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.util.g;
import com.taobao.search.mmd.util.j;
import com.taobao.search.rainbow.a;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;
import com.taobao.tao.Globals;
import com.taobao.taolive.room.utils.aw;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.ut.mini.l;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class ntm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(966166052);
    }

    public static void a(BaseCellBean baseCellBean, AuctionBaseBean auctionBaseBean, JSONObject jSONObject, c cVar, int i, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfeac3fc", new Object[]{baseCellBean, auctionBaseBean, jSONObject, cVar, new Integer(i), map, map2});
        } else if (auctionBaseBean != null && !baseCellBean.isExposed) {
            if (auctionBaseBean.isP4p) {
                a(auctionBaseBean);
            }
            String currentPageName = l.getInstance().getCurrentPageName();
            HashMap hashMap = new HashMap();
            hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, auctionBaseBean.rn);
            hashMap.put("item_id", auctionBaseBean.itemId);
            hashMap.put("business", a(cVar));
            hashMap.put("page", String.valueOf(auctionBaseBean.page));
            hashMap.put("query", cVar.getKeyword());
            hashMap.put(aw.PARAM_SEARCH_KEYWORD_POS, i + "");
            CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
            if (commonSearchResult != null) {
                hashMap.put("sessionid", commonSearchResult.getMainInfo().rn);
                if (commonSearchResult.getMainInfo().pageTraceArgs != null) {
                    String str = commonSearchResult.getMainInfo().pageTraceArgs.get("spm-cnt");
                    if (!StringUtils.isEmpty(str)) {
                        String replace = str.replace(".0.0", "");
                        hashMap.put("spm", replace + ".itemlist." + i);
                    }
                }
            }
            if (!StringUtils.isEmpty(auctionBaseBean.videoId)) {
                hashMap.put(b.PROPERTY_VIDEO_ID, auctionBaseBean.videoId);
            }
            BaseCellBean baseCellBean2 = auctionBaseBean.mOutterBean;
            if (baseCellBean2 != null) {
                hashMap.put("pagePos", String.valueOf(baseCellBean2.pagePos));
                hashMap.put("pageSize", String.valueOf(baseCellBean2.pageSize));
            }
            Map<String, String> map3 = auctionBaseBean.utLogMap;
            if (map3 != null) {
                if (map2 != null) {
                    map3.putAll(map2);
                }
                if (commonSearchResult != null) {
                    map3.put(k.a.PARAM_KEY_FIRST_RN, commonSearchResult.getMainInfo().rn);
                }
                map3.put("index", String.valueOf(i));
                map3.put("rainbow", a.c());
                map3.put(noa.KEY_EDITION_CODE, g.d());
                map3.put("elderHome", String.valueOf(j.INSTANCE.a()));
                map3.put(noa.KEY_GRAY_HAIR, String.valueOf("true".equals(cVar.getParamValue(noa.KEY_SEARCH_ELDER_HOME_OPEN))));
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!StringUtils.equals(key, "pageName") && !StringUtils.equals(key, "spm") && !StringUtils.isEmpty(key) && value != null) {
                            map3.put(key, value.toString());
                        }
                    }
                }
                hashMap.put("utLogMap", r.c(JSON.toJSONString(map3)));
            }
            if (cVar.getUIListStyle() == ListStyle.LIST) {
                hashMap.put("style", "list");
                hashMap.put("longPicture", String.valueOf(false));
            } else {
                hashMap.put("style", "waterfall");
                hashMap.put("longPicture", String.valueOf(!StringUtils.isEmpty(auctionBaseBean.wfPicUrl)));
            }
            if (auctionBaseBean.trace != null && !auctionBaseBean.trace.isEmpty()) {
                for (String str2 : auctionBaseBean.trace.keySet()) {
                    hashMap.put(str2, auctionBaseBean.trace.get(str2));
                }
            }
            String str3 = "Page_CouponUseSrp".equalsIgnoreCase(currentPageName) ? "Page_CouponUseSrp_Button-ItemExposure" : "Search-ItemExposure";
            if (map != null) {
                hashMap.putAll(map);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(currentPageName, 2201, str3, "", "", hashMap).build());
            baseCellBean.isExposed = true;
        }
    }

    public static String a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d06a5e08", new Object[]{cVar}) : cVar == null ? "all" : noa.VALUE_TAB_TMALL.equals(cVar.getTab()) ? noa.VALUE_TAB_TMALL : cVar.z() ? "inshop" : "all";
    }

    public static void a(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe470c9", new Object[]{auctionBaseBean});
        } else if (!com.taobao.search.common.util.r.ae() || StringUtils.isEmpty(auctionBaseBean.ifsUrl) || StringUtils.isEmpty(auctionBaseBean.p4pPid)) {
        } else {
            AlimamaAdvertising.instance().buildIfsExposure(Globals.getApplication(), auctionBaseBean.ifsUrl).withArgNamespace("KGB").withArgPid(auctionBaseBean.p4pPid).commit();
        }
    }
}
