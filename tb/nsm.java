package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.a;
import com.taobao.android.searchbaseframe.datasource.IPager;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.common.util.r;
import com.taobao.search.jarvis.c;
import com.taobao.search.refactor.e;
import com.taobao.search.refactor.j;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.crosstips.CrossTipsBean;
import com.taobao.search.sf.widgets.list.listcell.crosstips.b;
import java.util.Map;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class nsm extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1696376562);
    }

    public static /* synthetic */ Object ipc$super(nsm nsmVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1838387127) {
            super.doNewSearch((a) objArr[0], ((Boolean) objArr[1]).booleanValue(), (JSONObject) objArr[2], (Map) objArr[3]);
            return null;
        } else if (hashCode != 696631003) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c((Map) objArr[0]);
            return null;
        }
    }

    @Override // com.taobao.search.sf.datasource.c
    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.search.refactor.j, com.taobao.android.searchbaseframe.datasource.a
    public void buildSearchParamsWithConfig(Map<String, String> map, a.C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc63fd85", new Object[]{this, map, c0571a});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsm(boolean z, imn core, ioy ioyVar) {
        super(z, core, ioyVar);
        q.c(core, "core");
    }

    @Override // com.taobao.android.meta.data.b
    public /* synthetic */ void doNewSearch(e eVar, boolean z, JSONObject jSONObject, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926c7049", new Object[]{this, eVar, new Boolean(z), jSONObject, map});
        } else {
            a(eVar, z, jSONObject, map);
        }
    }

    @Override // tb.nsp, com.taobao.search.sf.datasource.c
    public com.taobao.android.searchbaseframe.util.e<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.util.e) ipChange.ipc$dispatch("3af765d3", new Object[]{this}) : new com.taobao.android.searchbaseframe.util.e<>("inshopSearch", "inshopSearchClickFeedBack");
    }

    @Override // com.taobao.search.sf.datasource.c
    public void e(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c96b99", new Object[]{this, map});
            return;
        }
        if (map == null) {
            q.a();
        }
        String paramValue = getParamValue("sellerId");
        if (paramValue == null) {
            q.a();
        }
        map.put("sellerId", paramValue);
        String paramValue2 = getParamValue("shopId");
        if (paramValue2 == null) {
            q.a();
        }
        map.put("shopId", paramValue2);
    }

    public void a(e eVar, boolean z, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b4153e", new Object[]{this, eVar, new Boolean(z), jSONObject, map});
            return;
        }
        postEvent(new b.a(false));
        super.doNewSearch(eVar, z, jSONObject, map);
    }

    @Override // tb.nsp
    public void aB_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812c8a05", new Object[]{this});
        } else {
            c.a(this, "InshopSearch");
        }
    }

    @Override // com.taobao.search.sf.datasource.c
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!r.t()) {
            com.taobao.android.jarviswe.a a2 = com.taobao.android.jarviswe.a.a();
            q.a((Object) a2, "JarvisEngine.getInstance()");
            if (a2.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.search.sf.datasource.c
    public void a(boolean z, boolean z2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c128219d", new Object[]{this, new Boolean(z), new Boolean(z2), map});
            return;
        }
        if (map == null) {
            q.a();
        }
        if (TextUtils.isEmpty(map.get("pvFeature"))) {
            AppMonitor.Alarm.commitFail("JarvisWE", "pvFeature_inshop", "", "", "");
        } else {
            AppMonitor.Alarm.commitSuccess("JarvisWE", "pvFeature_inshop");
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public boolean hasNextPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39d52367", new Object[]{this})).booleanValue() : !getPager().serverFinished();
    }

    @Override // tb.nsp, com.taobao.search.sf.datasource.c
    public void c(Map<String, String> params) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, params});
            return;
        }
        q.c(params, "params");
        super.c(params);
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        ResultMainInfoBean mainInfo = commonSearchResult != null ? commonSearchResult.getMainInfo() : null;
        if (mainInfo == null || mainInfo.totalResult <= 0) {
            i = Integer.MAX_VALUE;
        } else {
            int i2 = mainInfo.totalResult;
            int i3 = mainInfo.pageSize;
            if (i2 % i3 > 0) {
                i = (i2 / i3) + 1;
            } else {
                i = i2 / i3;
            }
        }
        IPager pager = getPager();
        q.a((Object) pager, "pager");
        if (pager.getCurrentPage() < i) {
            return;
        }
        params.put("inshopRouter", "inshop_cross");
        IPager pager2 = getPager();
        q.a((Object) pager2, "pager");
        params.put(rrv.PAGE_NUMBER, String.valueOf((pager2.getCurrentPage() - i) + 1));
        CommonSearchResult commonSearchResult2 = (CommonSearchResult) getLastSearchResult();
        if (commonSearchResult2 == null || (str = commonSearchResult2.crossShopRecPvUuid) == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            params.put("pvUuid", str);
        }
        com.taobao.search.sf.realtimetag.b realTimeTagManager = K();
        q.a((Object) realTimeTagManager, "realTimeTagManager");
        String j = realTimeTagManager.j();
        q.a((Object) j, "realTimeTagManager.clickedItemsParam");
        params.put("clickItemIds", j);
        params.put("exposedItemIds", N());
    }

    private final String N() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b40a0b6b", new Object[]{this});
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null) {
            return "";
        }
        q.a((Object) commonSearchResult, "totalSearchResult ?: return \"\"");
        StringBuilder sb = new StringBuilder();
        int min = Math.min(commonSearchResult.getCellsCount(), 15);
        for (int i = 0; i < min; i++) {
            BaseCellBean cell = commonSearchResult.getCell(i);
            if (cell instanceof CrossTipsBean) {
                break;
            }
            String str = cell.itemId;
            if (!(!q.a((Object) cell.cardType, (Object) "item")) && !TextUtils.isEmpty(str)) {
                sb.append(str);
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            z = true;
        }
        if (z) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        q.a((Object) sb2, "exposeIdsBuilder.toString()");
        return sb2;
    }
}
