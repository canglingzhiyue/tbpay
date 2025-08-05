package com.taobao.search.sf.newsearch.widgets;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.common.util.k;
import com.taobao.search.refactor.g;
import com.taobao.search.refactor.j;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.Map;
import tb.ipq;
import tb.iru;
import tb.ise;
import tb.ium;
import tb.jzc;
import tb.kge;
import tb.noa;
import tb.noz;

/* loaded from: classes8.dex */
public class d extends jzc<iru<j>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ise<ipq, d> WEEX_CELL_CREATOR;

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == -2029970770) {
            super.a((Map) objArr[0], (WeexCellBean) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1254213830);
        WEEX_CELL_CREATOR = new ise<ipq, d>() { // from class: com.taobao.search.sf.newsearch.widgets.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public d a(ipq ipqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("ca29f0c2", new Object[]{this, ipqVar}) : new d(ipqVar.c, ipqVar.e, ipqVar.d, ipqVar.b, ipqVar.f, ipqVar.f29218a);
            }
        };
    }

    public d(Activity activity, iru<j> iruVar, ium iumVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, iruVar, iumVar, listStyle, viewGroup, i);
    }

    @Override // tb.jzc
    public void a(Map<String, Object> map, WeexCellBean weexCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87011aae", new Object[]{this, map, weexCellBean});
            return;
        }
        super.a(map, weexCellBean);
        CommonSearchResult commonSearchResult = (CommonSearchResult) ((j) ((iru) j()).d()).getTotalSearchResult();
        if (commonSearchResult == null || !commonSearchResult.newSearch || weexCellBean.combo == null) {
            return;
        }
        noz nozVar = (noz) weexCellBean.combo;
        map.put(k.a.PARAM_KEY_FIRST_RN, nozVar.a().rn);
        map.put("native", "true");
        map.put(noa.VALUE_BIZ_TYPE_NEW_SEARCH, "true");
        map.put(com.taobao.android.detail.sdk.request.combo.a.K_COMBO_ID, String.valueOf(nozVar.t()));
        map.put("comboStyle", nozVar.n().getValue());
        g O = O();
        int a2 = O.a(nozVar);
        if (((iru) j()).d() == ((iru) j()).c() && a2 >= 0) {
            map.put("tab", nozVar.Q());
        }
        map.put("comboBizType", nozVar.Q());
        map.put(k.a.PARAM_KEY_FIRST_RN, nozVar.a().rn);
        map.put("comboHeaderCount", String.valueOf(nozVar.H().size() + nozVar.I().size()));
        map.put("indexInCombo", String.valueOf(weexCellBean.comboIndex));
        map.put("comboType", weexCellBean.comboType);
        map.put("tabIndex", String.valueOf(a2));
        JSONObject jSONObject = commonSearchResult.pageInfo;
        Map<String, String> map2 = commonSearchResult.getMainInfo().pageTraceArgs;
        String str = commonSearchResult.getMainInfo().pageTraceName;
        if (((iru) j()).d() != ((iru) j()).c()) {
            jSONObject = nozVar.R();
            map2 = nozVar.a().pageTraceArgs;
            str = nozVar.a().pageTraceName;
        }
        if (jSONObject != null) {
            map.put("pageInfo", jSONObject);
        }
        map.put("isJiaGou", String.valueOf(commonSearchResult.isAddCartSupported));
        if (map2 != null) {
            map.put("spm", map2.get("spm-cnt"));
        }
        String k = O.k();
        if (k != null) {
            map.put("show_tabs", k);
        }
        map.put("floor_info", nozVar.Q() + "_" + nozVar.t());
        map.put("pageName", str);
    }

    private g O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("1905e861", new Object[]{this}) : (g) ((iru) j()).e().b("controller");
    }
}
