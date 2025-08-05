package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import java.util.List;

/* loaded from: classes6.dex */
public class ish extends isf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONVERTER_NAME = "standard";

    static {
        kge.a(-1555623368);
    }

    public static /* synthetic */ Object ipc$super(ish ishVar, String str, Object... objArr) {
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
        a(result, jSONObject);
        ResultMainInfoBean.parseLayout(result.getMainInfo(), jSONObject);
        b(result, jSONObject);
        c(result, jSONObject);
        d(result, jSONObject);
        b(result, jSONObject, imnVar);
    }

    public <RESULT extends BaseSearchResult> void a(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b150abe0", new Object[]{this, result, jSONObject});
            return;
        }
        ResultMainInfoBean parse = ResultMainInfoBean.parse(jSONObject.getJSONObject("pageInfo"));
        if (parse == null) {
            parse = ResultMainInfoBean.createDefault();
        }
        result.setMainInfo(parse);
    }

    public <RESULT extends BaseSearchResult> void b(RESULT result, JSONObject jSONObject) {
        BaseTypedBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17b92a1", new Object[]{this, result, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("mods");
        if (jSONObject2 == null) {
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("pageInfo");
        for (String str : jSONObject2.keySet()) {
            if (!"listItems".equals(str) && (a2 = result.c().g().a(jSONObject2.getJSONObject(str), result, jSONObject3)) != null) {
                result.addMod(str, a2);
            }
        }
    }

    private <RESULT extends BaseSearchResult> void c(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31a67962", new Object[]{this, result, jSONObject});
        } else {
            result.setTemplates(iub.a(jSONObject.getJSONArray("templates"), result.c()));
        }
    }

    private <RESULT extends BaseSearchResult> void d(RESULT result, JSONObject jSONObject) {
        BaseCellBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d16023", new Object[]{this, result, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("mods");
        if (jSONObject2 == null) {
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("pageInfo");
        JSONArray jSONArray = jSONObject2.getJSONArray("listItems");
        if (jSONArray == null) {
            return;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            if (jSONObject4 != null && (a2 = result.c().f().a(jSONObject4, result, jSONObject3)) != null) {
                result.addCell(a2);
                a2.pagePos = i;
                a2.pageSize = size;
                a2.pageNo = result.getPageNo();
            }
        }
    }

    public <RESULT extends BaseSearchResult> void b(RESULT result, JSONObject jSONObject, imn imnVar) {
        List<TabBean> parseBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86baa807", new Object[]{this, result, jSONObject, imnVar});
            return;
        }
        if (imnVar.c().j().t != null) {
            parseBean = imnVar.c().j().t.a(jSONObject, result);
        } else {
            parseBean = TabBean.parseBean(jSONObject);
        }
        if (parseBean == null || parseBean.size() == 0) {
            parseBean = TabBean.createDefaultTabs();
        }
        result.setTabs(parseBean);
    }
}
