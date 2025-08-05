package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.a;
import com.taobao.search.common.util.q;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.sf.datasource.CommonSearchResult;

/* loaded from: classes8.dex */
public class nst {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nst INSTANCE;

    static {
        kge.a(-970444724);
        INSTANCE = new nst();
    }

    public void a(MSearchResult mSearchResult, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf8bab2", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        mSearchResult.pageData = jSONObject.getJSONObject("pageData");
        JSONObject b = a.b(jSONObject, "iconStyle");
        if (b != null) {
            mSearchResult.domIcons = nne.a(b);
        } else if (mSearchResult.getMainInfo() != null) {
            mSearchResult.domIcons = nne.b(mSearchResult.getMainInfo().pageName);
        }
        String a2 = nne.a(nne.PAGE_NAME_NX);
        if (a2 == null) {
            a2 = "";
        }
        mSearchResult.nxRawIcon = a2;
        JSONObject b2 = a.b(jSONObject, "negFeedbackActions");
        if (b2 != null) {
            mSearchResult.negFeedbackActions = b2;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("noResultMod");
        if (jSONObject3 != null) {
            nvr nvrVar = new nvr();
            nvrVar.f31791a = jSONObject3.getString("firstTitle");
            nvrVar.b = jSONObject3.getString("secondTitle");
            nvrVar.c = jSONObject3.getString("imageUrl");
            nvrVar.d = jSONObject3.getBooleanValue("showRetry");
            mSearchResult.noResultMod = nvrVar;
        }
        if (!mSearchResult.isNew() || (jSONObject2 = jSONObject.getJSONObject("tabAtmosphere")) == null) {
            return;
        }
        mSearchResult.tabPromotionBean = ntg.a(jSONObject2);
    }

    public void a(CommonSearchResult commonSearchResult, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e020b", new Object[]{this, commonSearchResult, jSONObject});
            return;
        }
        JSONObject b = a.b(jSONObject, "iconStyle");
        if (b != null) {
            commonSearchResult.domIcons = nne.a(b);
        } else if (commonSearchResult.getMainInfo() != null) {
            commonSearchResult.domIcons = nne.b(commonSearchResult.getMainInfo().pageName);
            q.a("CommonResultPreParser", "parseDomBeans: " + commonSearchResult.domIcons);
        }
        String a2 = nne.a(nne.PAGE_NAME_NX);
        if (a2 == null) {
            a2 = "";
        }
        commonSearchResult.nxRawIcon = a2;
        JSONObject b2 = a.b(jSONObject, "negFeedbackActions");
        if (b2 != null) {
            commonSearchResult.negFeedbackActions = b2;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("noResultMod");
        if (jSONObject3 != null) {
            nvr nvrVar = new nvr();
            nvrVar.f31791a = jSONObject3.getString("firstTitle");
            nvrVar.b = jSONObject3.getString("secondTitle");
            nvrVar.c = jSONObject3.getString("imageUrl");
            nvrVar.d = jSONObject3.getBooleanValue("showRetry");
            commonSearchResult.noResultMod = nvrVar;
        }
        if (!commonSearchResult.isNew() || (jSONObject2 = jSONObject.getJSONObject("tabAtmosphere")) == null) {
            return;
        }
        commonSearchResult.tabPromotionBean = ntg.a(jSONObject2);
    }
}
