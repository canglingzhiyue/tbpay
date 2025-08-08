package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultLayoutInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.mmd.datasource.bean.SearchBarBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class nsj extends isf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONVERTER_NAME = "commonApi";

    static {
        kge.a(776068578);
    }

    public static /* synthetic */ Object ipc$super(nsj nsjVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.isf
    public <RESULT extends BaseSearchResult> void a(RESULT result, JSONObject jSONObject, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3e1246", new Object[]{this, result, jSONObject, imnVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("nxData");
        d(result, jSONObject2);
        if (result instanceof CommonSearchResult) {
            nst.INSTANCE.a((CommonSearchResult) result, jSONObject);
        }
        e(result, jSONObject2);
        f(result, jSONObject);
        g(result, jSONObject2);
        c(result, jSONObject2);
        b(result, jSONObject2);
        a(result, jSONObject2);
    }

    private <RESULT extends BaseSearchResult> void a(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b150abe0", new Object[]{this, result, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("extMods");
        if (jSONObject2 == null) {
            return;
        }
        for (String str : jSONObject2.keySet()) {
            if (!StringUtils.isEmpty(str)) {
                String string = jSONObject2.getString(str);
                if (!StringUtils.isEmpty(string)) {
                    result.addExtMod(str, string);
                }
            }
        }
    }

    private <RESULT extends BaseSearchResult> void b(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17b92a1", new Object[]{this, result, jSONObject});
            return;
        }
        ArrayList<TabBean> parseBean = TabBean.parseBean(jSONObject);
        if (parseBean == null || parseBean.size() == 0) {
            parseBean = TabBean.createDefaultTabs();
        }
        result.setTabs(parseBean);
    }

    private <RESULT extends BaseSearchResult> void c(RESULT result, JSONObject jSONObject) {
        SearchBarBean searchBarBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31a67962", new Object[]{this, result, jSONObject});
        } else if (!(result instanceof CommonSearchResult)) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject(ssm.UI_MODULE_SEARCH_BAR);
            if (jSONObject2 == null) {
                searchBarBean = SearchBarBean.createDefault();
            } else {
                SearchBarBean searchBarBean2 = new SearchBarBean();
                searchBarBean2.type = jSONObject2.getString("searchType");
                searchBarBean2.text = jSONObject2.getString("text");
                searchBarBean = searchBarBean2;
            }
            ((CommonSearchResult) result).setSearchBarInfo(searchBarBean);
        }
    }

    private <RESULT extends BaseSearchResult> void d(RESULT result, JSONObject jSONObject) {
        ResultMainInfoBean resultMainInfoBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d16023", new Object[]{this, result, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("pageInfo");
        if (jSONObject2 == null) {
            resultMainInfoBean = ResultMainInfoBean.createDefault();
        } else {
            ResultMainInfoBean resultMainInfoBean2 = new ResultMainInfoBean();
            ResultMainInfoBean.parseBaseInfo(resultMainInfoBean2, jSONObject2);
            resultMainInfoBean = resultMainInfoBean2;
        }
        result.setMainInfo(resultMainInfoBean);
    }

    private <RESULT extends BaseSearchResult> void e(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1fc46e4", new Object[]{this, result, jSONObject});
            return;
        }
        ResultLayoutInfoBean resultLayoutInfoBean = new ResultLayoutInfoBean();
        a((nsj) result, resultLayoutInfoBean.foldHeaders, jSONObject.getJSONArray("foldHeader"));
        a((nsj) result, resultLayoutInfoBean.halfStickyHeaders, jSONObject.getJSONArray("halfStickyHeader"));
        a((nsj) result, resultLayoutInfoBean.stickyHeaders, jSONObject.getJSONArray("stickyHeader"));
        a((nsj) result, resultLayoutInfoBean.listHeaders, jSONObject.getJSONArray("listHeader"));
        result.getMainInfo().layoutInfo = resultLayoutInfoBean;
    }

    private <RESULT extends BaseSearchResult> void a(RESULT result, List<String> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a03f329", new Object[]{this, result, list, jSONArray});
        } else if (jSONArray == null) {
            k.e("CommonApiConverter", "fillLayoutArray:layoutArray is null");
        } else {
            for (int i = 0; i < jSONArray.size(); i++) {
                BaseTypedBean a2 = result.c().g().a(jSONArray.getJSONObject(i), result, null);
                if (a2 == null) {
                    k.a("CommonApiConverter", "fillLayoutArray: no parser");
                } else {
                    list.add(a2.type);
                    result.addMod(a2.type, a2);
                }
            }
        }
    }

    private <RESULT extends BaseSearchResult> void f(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2272da5", new Object[]{this, result, jSONObject});
        } else {
            result.setTemplates(iub.a(jSONObject.getJSONArray("templates"), result.c()));
        }
    }

    private <RESULT extends BaseSearchResult> void g(RESULT result, JSONObject jSONObject) {
        BaseCellBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32521466", new Object[]{this, result, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("listItems");
        if (jSONArray == null) {
            return;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null && (a2 = result.c().f().a(jSONObject2, result, null)) != null) {
                result.addCell(a2);
            }
        }
    }
}
