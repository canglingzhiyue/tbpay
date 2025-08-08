package com.taobao.search.searchdoor.searchbar.data;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class SearchBarHintADBean {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final String KEY_CLICK_MODULE = "activationPageSearchButton";
    private static final String KEY_CLICK_PARAMS = "advClickTracking";
    private static final String KEY_CLICK_URL_PARAMS = "targetUrlParam";
    private static final String KEY_EXPOSURE_MODULE = "activationPageSearchbox";
    private static final String KEY_EXPOSURE_PARAMS = "advEventTracking";
    private static final String KEY_REQUEST_PARAMS = "requestParams";
    private String clickParams;
    private Map<String, String> clickUrlParams;
    private String exposureParams;
    private Map<String, String> requestParams;

    static {
        kge.a(1802534761);
        Companion = new a(null);
    }

    @JvmStatic
    private static final String getAssignParamFromAssignModule(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d2781f98", new Object[]{str, str2, jSONObject}) : a.a(Companion, str, str2, jSONObject);
    }

    @JvmStatic
    public static final SearchBarHintADBean parseADInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchBarHintADBean) ipChange.ipc$dispatch("f2e377cd", new Object[]{jSONObject}) : Companion.a(jSONObject);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-478479503);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ String a(a aVar, String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ddbd73f7", new Object[]{aVar, str, str2, jSONObject}) : aVar.a(str, str2, jSONObject);
        }

        @JvmStatic
        public final SearchBarHintADBean a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return (SearchBarHintADBean) ipChange.ipc$dispatch("d3eb7970", new Object[]{this, jSONObject});
            }
            if (jSONObject != null && !jSONObject.isEmpty()) {
                SearchBarHintADBean searchBarHintADBean = new SearchBarHintADBean();
                a aVar = this;
                String a2 = aVar.a(SearchBarHintADBean.KEY_EXPOSURE_MODULE, SearchBarHintADBean.KEY_EXPOSURE_PARAMS, jSONObject);
                if (!StringUtils.isEmpty(a2)) {
                    searchBarHintADBean.setExposureParams(a2);
                    z = true;
                }
                String a3 = aVar.a(SearchBarHintADBean.KEY_CLICK_MODULE, SearchBarHintADBean.KEY_CLICK_PARAMS, jSONObject);
                if (!StringUtils.isEmpty(a3)) {
                    searchBarHintADBean.setClickParams(a3);
                    z = true;
                }
                JSONObject b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, SearchBarHintADBean.KEY_CLICK_MODULE);
                if (b != null && (!b.isEmpty())) {
                    JSONObject b2 = com.taobao.android.searchbaseframe.util.a.b(b, SearchBarHintADBean.KEY_CLICK_URL_PARAMS);
                    if (b2 != null && (!b2.isEmpty())) {
                        searchBarHintADBean.setClickUrlParams(com.taobao.android.searchbaseframe.util.a.a(b2));
                        if (searchBarHintADBean.getClickUrlParams() != null) {
                            Map<String, String> clickUrlParams = searchBarHintADBean.getClickUrlParams();
                            if (clickUrlParams == null) {
                                q.a();
                            }
                            if (!clickUrlParams.isEmpty()) {
                                z = true;
                            }
                        }
                    }
                    JSONObject b3 = com.taobao.android.searchbaseframe.util.a.b(b, "requestParams");
                    if (b3 != null && (!b3.isEmpty())) {
                        searchBarHintADBean.setRequestParams(com.taobao.android.searchbaseframe.util.a.a(b3));
                        if (searchBarHintADBean.getRequestParams() != null) {
                            Map<String, String> requestParams = searchBarHintADBean.getRequestParams();
                            if (requestParams == null) {
                                q.a();
                            }
                            if (!requestParams.isEmpty()) {
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    return searchBarHintADBean;
                }
            }
            return null;
        }

        @JvmStatic
        private final String a(String str, String str2, JSONObject jSONObject) {
            JSONObject b;
            JSONObject b2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f687ae2c", new Object[]{this, str, str2, jSONObject});
            }
            JSONObject b3 = com.taobao.android.searchbaseframe.util.a.b(jSONObject, str);
            return (b3 == null || b3.isEmpty() || (b = com.taobao.android.searchbaseframe.util.a.b(b3, "clickParam")) == null || b.isEmpty() || (b2 = com.taobao.android.searchbaseframe.util.a.b(b, "args")) == null || b2.isEmpty()) ? "" : com.taobao.android.searchbaseframe.util.a.a(b2, str2, "");
        }
    }

    public final String getExposureParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df820c76", new Object[]{this}) : this.exposureParams;
    }

    public final void setExposureParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218ba3c0", new Object[]{this, str});
        } else {
            this.exposureParams = str;
        }
    }

    public final String getClickParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96ad2e01", new Object[]{this}) : this.clickParams;
    }

    public final void setClickParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56afc0fd", new Object[]{this, str});
        } else {
            this.clickParams = str;
        }
    }

    public final Map<String, String> getClickUrlParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c33d77df", new Object[]{this}) : this.clickUrlParams;
    }

    public final void setClickUrlParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29cf8f", new Object[]{this, map});
        } else {
            this.clickUrlParams = map;
        }
    }

    public final Map<String, String> getRequestParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ce7e99fb", new Object[]{this}) : this.requestParams;
    }

    public final void setRequestParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3f498b", new Object[]{this, map});
        } else {
            this.requestParams = map;
        }
    }
}
