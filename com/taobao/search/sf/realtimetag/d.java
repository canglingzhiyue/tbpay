package com.taobao.search.sf.realtimetag;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.util.g;
import com.taobao.search.mmd.util.j;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import tb.iud;
import tb.kge;
import tb.nno;
import tb.noa;
import tb.npj;
import tb.npr;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2104497396);
    }

    public static void a(String str, Map<String, String> map, Activity activity, int i, boolean z, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df03d2b", new Object[]{str, map, activity, new Integer(i), new Boolean(z), bVar});
        } else if (bVar == null) {
        } else {
            bVar.a(map.get("itemId"));
            if (!r.H()) {
                bVar.b(str, map, activity, i);
            } else {
                bVar.a(str, map, activity, i);
            }
            if (!z) {
                return;
            }
            bVar.a(str, map, i);
        }
    }

    public static void a(String str, Map<String, String> map, Activity activity, int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3fafd93", new Object[]{str, map, activity, new Integer(i), bVar});
        } else {
            a(str, map, activity, i, true, bVar);
        }
    }

    public static void a(BaseTypedBean baseTypedBean, Map<String, String> map, Activity activity, int i, com.taobao.android.searchbaseframe.datasource.impl.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97060d0e", new Object[]{baseTypedBean, map, activity, new Integer(i), aVar});
        } else if (baseTypedBean == null || StringUtils.equals(baseTypedBean.cardType, "item") || StringUtils.isEmpty(baseTypedBean.clickTrace)) {
        } else {
            HashMap hashMap = new HashMap();
            a(hashMap, aVar, baseTypedBean, i);
            if (map != null) {
                hashMap.putAll(map);
            }
            new npr.b().a(com.taobao.search.sf.realtimetag.data.a.a(baseTypedBean.clickTrace, map, i)).a().a().a(new iud<nno>() { // from class: com.taobao.search.sf.realtimetag.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iud
                public void a(nno nnoVar) throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f68b91c9", new Object[]{this, nnoVar});
                    } else {
                        k.e("NonItemClickTrace", "send clickTrace success");
                    }
                }
            }, new npj("NonItemClickTrace"));
        }
    }

    public static void a(Map<String, String> map, com.taobao.android.searchbaseframe.datasource.impl.a aVar, BaseTypedBean baseTypedBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb11fcac", new Object[]{map, aVar, baseTypedBean, new Integer(i)});
            return;
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) aVar.getTotalSearchResult();
        map.put("tab", aVar.getTab());
        map.put(aw.PARAM_SEARCH_KEYWORD_RN, baseTypedBean.rn);
        map.put(noa.KEY_EDITION_CODE, g.d());
        map.put("elderHome", String.valueOf(j.INSTANCE.a()));
        map.put(noa.KEY_GRAY_HAIR, String.valueOf(aVar.getParamStr(noa.KEY_SEARCH_ELDER_HOME_OPEN)));
        map.put("index", String.valueOf(i));
        if (baseTypedBean instanceof BaseCellBean) {
            map.put("page", String.valueOf(((BaseCellBean) baseTypedBean).pageNo));
        }
        if (baseSearchResult == null) {
            return;
        }
        map.put("sessionid", baseSearchResult.getMainInfo().rn);
        map.put("jarvis_dynamic_card", String.valueOf(false));
        map.put("max_page", String.valueOf(aVar.getCurrentPage()));
    }
}
