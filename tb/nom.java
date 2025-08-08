package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.util.a;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.datasource.bean.SFOnesearchBean;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class nom extends isi<SFOnesearchBean, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BG_COLOR = "backgroundColor";
    public static final String KEY_BIZ_TYPE = "bizType";
    public static final String KEY_BOX_SEARCH = "boxSearch";
    public static final String KEY_DISABLE_HEADER_SCROLL = "disableHeaderScroll";
    public static final String KEY_HEIGHT = "height";
    public static final String KEY_HIDE_NAVIBAR = "hideNavibar";
    public static final String KEY_IMMERSE_STYLE = "immersedStyle";
    public static final String KEY_IS_FULL = "isFull";
    public static final String KEY_NAVI_STYLE = "naviStyle";
    public static final String KEY_REDIRECT = "redirect";
    public static final String KEY_SIZE_RATION = "sizeRation";
    public static final String KEY_STYLE = "style";
    public static final String KEY_URL = "url";
    public static final String KEY_WIDTH = "width";
    public static final String KEY_X_CUT_HEIGHT = "_xsearchImmersedCutHeight";
    public static final String KEY_X_HIDE_NAVIBAR = "_xsearchHideNavibar";
    public static final String KEY_X_IMMERSE_STYLE = "_xsearchImmersedStyle";
    public static final String KEY_X_NAVI_STYLE = "_xsearchImmersedNaviStyle";
    public static final String KEY_X_RATION = "_xsearchSizeRation";
    public static final String KEY_X_REDIRECT = "_xsearchRedirect";
    public static final String TYPE_NAME = "nt_onesearch";
    public static final String VALUE_YES = "YES";

    static {
        kge.a(-32524075);
    }

    public static /* synthetic */ Object ipc$super(nom nomVar, String str, Object... objArr) {
        if (str.hashCode() == 32169431) {
            super.a((JSONObject) objArr[0], (JSONObject) ((BaseTypedBean) objArr[1]), (BaseTypedBean) ((BaseSearchResult) objArr[2]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : TYPE_NAME;
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public SFOnesearchBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SFOnesearchBean) ipChange.ipc$dispatch("48e8dec2", new Object[]{this}) : new SFOnesearchBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<SFOnesearchBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : SFOnesearchBean.class;
    }

    public void a(JSONObject jSONObject, SFOnesearchBean sFOnesearchBean) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c90e2", new Object[]{this, jSONObject, sFOnesearchBean});
            return;
        }
        sFOnesearchBean.url = jSONObject.getString("url");
        if (StringUtils.isEmpty(sFOnesearchBean.url) && (b = a.b(jSONObject, "info")) != null) {
            sFOnesearchBean.url = b.getString("url");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("style");
        if (jSONObject2 != null) {
            sFOnesearchBean.width = jSONObject2.getIntValue("width");
            sFOnesearchBean.height = jSONObject2.getIntValue("height");
            sFOnesearchBean.hideNavibar = StringUtils.equals(VALUE_YES, jSONObject2.getString(KEY_HIDE_NAVIBAR));
            sFOnesearchBean.bizType = jSONObject2.getString("bizType");
            sFOnesearchBean.backgroundColor = jSONObject2.getString("backgroundColor");
            if (!StringUtils.equals(sFOnesearchBean.bizType, noa.VALUE_BIZ_TYPE_QD) && !StringUtils.equals(sFOnesearchBean.bizType, noa.VALUE_BIZ_TYPE_NEW_SEARCH)) {
                z = false;
            }
            sFOnesearchBean.isFull = z;
            sFOnesearchBean.isNewSearch = StringUtils.equals(sFOnesearchBean.bizType, noa.VALUE_BIZ_TYPE_NEW_SEARCH);
            sFOnesearchBean.disableHeaderScroll = StringUtils.equals("true", jSONObject2.getString(KEY_DISABLE_HEADER_SCROLL));
            sFOnesearchBean.sizeRation = jSONObject2.getString(KEY_SIZE_RATION);
            sFOnesearchBean.redirect = StringUtils.equals(VALUE_YES, jSONObject2.getString("redirect"));
        }
        sFOnesearchBean.nextPageTraceMap = a(jSONObject);
        JSONObject b2 = a.b(jSONObject, "trace");
        if (b2 != null) {
            sFOnesearchBean.expArg1 = b2.getString("expArg1");
            sFOnesearchBean.utLogMap = b2.getString("utLogMap");
        }
        sFOnesearchBean.model = jSONObject;
    }

    @Override // tb.isi, com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject jSONObject, SFOnesearchBean sFOnesearchBean, CommonSearchResult commonSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5b78ff", new Object[]{this, jSONObject, sFOnesearchBean, commonSearchResult});
            return;
        }
        super.a(jSONObject, (JSONObject) sFOnesearchBean, (SFOnesearchBean) commonSearchResult);
        a(jSONObject, sFOnesearchBean);
        commonSearchResult.setOnesearch(sFOnesearchBean);
        if (!r.co() || !sFOnesearchBean.redirect || !(commonSearchResult instanceof MSearchResult)) {
            return;
        }
        MSearchResult mSearchResult = (MSearchResult) commonSearchResult;
        mSearchResult.setRedirectMode(true);
        mSearchResult.setRedirectUrl(sFOnesearchBean.url);
    }

    private static Map<String, String> a(JSONObject jSONObject) {
        Set<String> keySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{jSONObject});
        }
        if (jSONObject == null || (keySet = jSONObject.keySet()) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : keySet) {
            hashMap.put(str, jSONObject.getString(str));
        }
        return hashMap;
    }
}
