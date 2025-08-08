package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.net.NetError;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.net.e;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.util.g;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.d;
import com.taobao.search.sf.widgets.list.floatbar.c;
import com.taobao.taolive.room.utils.aw;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.util.ErrorConstant;
import tb.itt;

/* loaded from: classes8.dex */
public class nsq extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Set<String> c;
    private nsn d;
    private boolean e;

    public static /* synthetic */ Object ipc$super(nsq nsqVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -295964400) {
            super.a((nsq) ((BaseSearchResult) objArr[0]));
            return null;
        } else if (hashCode == 1576018983) {
            super.a((nsq) ((MetaResult) objArr[0]), (JSONObject) objArr[1]);
            return null;
        } else if (hashCode != 2081511898) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.b((Map) objArr[0], (a.C0571a) objArr[1]);
        }
    }

    @Override // tb.isk
    public /* bridge */ /* synthetic */ boolean a(SearchResult searchResult, e eVar, Map map) {
        return a((CommonSearchResult) searchResult, eVar, (Map<String, String>) map);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.b, tb.isk
    public /* synthetic */ com.taobao.android.searchbaseframe.net.d c(Map map, a.C0571a c0571a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.net.d) ipChange.ipc$dispatch("da2d6cbd", new Object[]{this, map, c0571a}) : b(map, c0571a);
    }

    static {
        kge.a(1537486565);
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add("FAIL_SYS_USER_VALIDATE");
        c.add("FAIL_SYS_SESSION_EXPIRED");
        c.add("FAIL_SYS_SM_ODD_REQUEST");
        c.add(ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK);
    }

    public nsq(imn imnVar) {
        this(imnVar, null);
    }

    public nsq(imn imnVar, ioy ioyVar) {
        super(imnVar, ioyVar);
    }

    public void a(nsn nsnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d192ef", new Object[]{this, nsnVar});
        } else {
            this.d = nsnVar;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.android.meta.data.f, com.taobao.android.searchbaseframe.datasource.impl.b
    public void a(CommonSearchResult commonSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e020b", new Object[]{this, commonSearchResult, jSONObject});
            return;
        }
        commonSearchResult.carriedData = b();
        super.a((nsq) commonSearchResult, jSONObject);
        c(commonSearchResult, jSONObject);
    }

    public JSONArray b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("505e5935", new Object[]{this});
        }
        nsn nsnVar = this.d;
        if (nsnVar != null) {
            return nsnVar.aC_();
        }
        return null;
    }

    public void c(CommonSearchResult commonSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730fb849", new Object[]{this, commonSearchResult, jSONObject});
            return;
        }
        commonSearchResult.isAddCartSupported = jSONObject.getBooleanValue("isJiaGou");
        try {
            commonSearchResult.poplayerUrl = jSONObject.getString("poplayerUrl");
        } catch (Exception unused) {
            q.b("MainSearchResultAdapter", "parse poplayer error");
        }
        try {
            if (!this.e || !commonSearchResult.newSearch) {
                z = false;
            }
            commonSearchResult.floatBarBean = c.a(jSONObject, z, commonSearchResult);
        } catch (Exception unused2) {
            q.b("MainSearchResultAdapter", "parse floatbar error");
        }
    }

    @Override // com.taobao.search.sf.datasource.d, com.taobao.android.meta.data.f
    public itt.a a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itt.a) ipChange.ipc$dispatch("bea4bbe3", new Object[]{this, map}) : new itt.a(nnd.a(map), "1.0", "wsearch");
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.b
    public itt b(Map<String, String> map, a.C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itt) ipChange.ipc$dispatch("7c1159da", new Object[]{this, map, c0571a});
        }
        itt b = super.b(map, c0571a);
        itt.b bVar = (itt.b) b.d;
        if (bVar != null) {
            if (StringUtils.equals(((itt.a) b.b).f29314a, nnd.WSEARCH_TPP_API_NAME_VALUE)) {
                bVar.c = MethodEnum.POST;
            }
            if (StringUtils.equals((String) ((Map) b.c).remove(noa.KEY_XS_FORCE_LOGIN), "true")) {
                bVar.b = true;
            }
            if (r.af()) {
                String str = (String) ((Map) b.c).get("tab");
                if (StringUtils.isEmpty(str) || "all".equals(str)) {
                    bVar.d = true;
                }
            }
            bVar.f = h(map);
        }
        return b;
    }

    public static String h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b3b88aa", new Object[]{map});
        }
        if (StringUtils.equals(map.get("m"), noa.VALUE_MODULE_INSHOP)) {
            return "inshop-srp";
        }
        String str = map.get("tab");
        if (StringUtils.isEmpty(str)) {
            str = "all";
        }
        if ("true".equals(map.get(noa.KEY_GOOD_PRICE))) {
            return "goodPrice-" + str;
        }
        return "main-" + str;
    }

    public boolean a(CommonSearchResult commonSearchResult, e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdc8ada", new Object[]{this, commonSearchResult, eVar, map})).booleanValue();
        }
        if (!eVar.b() || eVar.c() == null) {
            return false;
        }
        a(eVar.c());
        if (!r.aQ()) {
            k.d("[requestFallback]", "orange开关控制不开启兜底", new Object[0]);
            return false;
        } else if (!StringUtils.equals(g.b(), "CN")) {
            return false;
        } else {
            String mtopCode = eVar.c().getMtopCode();
            if (StringUtils.equals(mtopCode, "SUCCESS")) {
                return false;
            }
            if (c(mtopCode)) {
                k.d("[requestFallback]", "错误码:%s 不开启兜底", mtopCode);
                return false;
            } else if (!c(map)) {
                k.d("[requestFallback]", "非主搜不开启兜底", new Object[0]);
                return false;
            } else if (d(map)) {
                k.d("[requestFallback]", "频道页不开启兜底", new Object[0]);
                return false;
            } else if (!e(map)) {
                k.d("[requestFallback]", "非主tab不开启兜底", new Object[0]);
                return false;
            } else if (f(map)) {
                k.d("[requestFallback]", "携带筛选参数不开启兜底", new Object[0]);
                return false;
            } else if (!g(map)) {
                return true;
            } else {
                k.d("[requestFallback]", "携带关闭参数不开启兜底", new Object[0]);
                return false;
            }
        }
    }

    private boolean c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2985bedf", new Object[]{this, map})).booleanValue() : StringUtils.isEmpty(map.get("m"));
    }

    private boolean d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1127953e", new Object[]{this, map})).booleanValue() : !StringUtils.isEmpty(map.get("channelSrp"));
    }

    private boolean e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8c96b9d", new Object[]{this, map})).booleanValue();
        }
        String str = map.get("tab");
        return StringUtils.isEmpty(str) || StringUtils.equals(str, "all");
    }

    private boolean f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e06b41fc", new Object[]{this, map})).booleanValue();
        }
        if (!StringUtils.isEmpty(map.get(noa.KEY_AUCTION_TAG)) || !StringUtils.isEmpty(map.get(noa.KEY_FILTER_TAG)) || !StringUtils.isEmpty(map.get("service"))) {
            return true;
        }
        String aS = r.aS();
        if (StringUtils.isEmpty(aS)) {
            return false;
        }
        for (String str : aS.split("/")) {
            if (!StringUtils.isEmpty(map.get(str))) {
                return true;
            }
        }
        return false;
    }

    private boolean g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c80d185b", new Object[]{this, map})).booleanValue() : StringUtils.equals(map.get("ignoreReveal"), "true");
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        if (c.contains(str)) {
            return true;
        }
        String aR = r.aR();
        if (!StringUtils.isEmpty(aR)) {
            return aR.contains(str);
        }
        return false;
    }

    @Override // tb.isk
    public void a(e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a901d53", new Object[]{this, eVar, map});
            return;
        }
        String b = b(eVar, map);
        if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("status", "success");
            hashMap.put("fallbackArgs", b);
            this.b.d(hashMap);
        }
        k.d("[requestFallback]", "兜底成功", new Object[0]);
        AppMonitor.Alarm.commitSuccess("tbsearch", "request_fallback", b);
    }

    @Override // tb.isk
    public void a(e eVar, ResultError resultError, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44e57e2f", new Object[]{this, eVar, resultError, map});
            return;
        }
        String b = b(eVar, map);
        String b2 = b(resultError);
        if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("status", "failure");
            hashMap.put("fallbackArgs", b);
            hashMap.put("errCode", String.valueOf(resultError.getErrorCode()));
            hashMap.put("errMsg", b2);
            this.b.d(hashMap);
        }
        a(resultError);
        k.d("[requestFallback]", "兜底失败", new Object[0]);
        AppMonitor.Alarm.commitFail("tbsearch", "request_fallback", b, String.valueOf(resultError.getErrorCode()), b2);
    }

    private void a(NetError netError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f84b9ce", new Object[]{this, netError});
            return;
        }
        Throwable exception = netError.getException();
        if (exception == null) {
            return;
        }
        AppMonitor.Alarm.commitFail("tbsearch", "request_fall_reason", a(exception), String.valueOf(netError.getCode()), exception.getClass().getSimpleName());
    }

    private void a(ResultError resultError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bac00c", new Object[]{this, resultError});
        } else {
            AppMonitor.Alarm.commitFail("tbsearch", "fallback_fall_reason", a(resultError.getException()), String.valueOf(resultError.getErrorCode()), resultError.getErrorMsg());
        }
    }

    private String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{this, th});
        }
        if (th == null) {
            return "no exception";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private String b(e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99bca9ee", new Object[]{this, eVar, map});
        }
        if (eVar.c() == null) {
            return "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("retCode", eVar.c().getMtopCode());
        hashMap.put("appId", map.get("appId"));
        hashMap.put("page", map.get("page"));
        hashMap.put("sversion", noa.SERVER_VERSION_VALUE);
        String str = map.get(noa.KEY_GOOD_PRICE);
        if (StringUtils.isEmpty(str)) {
            str = "false";
        }
        hashMap.put(noa.KEY_GOOD_PRICE, str);
        hashMap.put("q", map.get("q"));
        return JSON.toJSONString(hashMap);
    }

    private String b(ResultError resultError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("389ec733", new Object[]{this, resultError});
        }
        StringBuilder sb = new StringBuilder();
        String errorMsg = resultError.getErrorMsg();
        if (!StringUtils.isEmpty(errorMsg)) {
            sb.append(errorMsg);
        }
        sb.append("|");
        Throwable exception = resultError.getException();
        if (exception != null && !StringUtils.isEmpty(exception.getMessage())) {
            sb.append(exception.getMessage());
        }
        sb.append("|");
        if (exception != null && exception.getStackTrace().length > 0) {
            sb.append(exception.getStackTrace()[0].toString());
        }
        return sb.toString();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.b
    public void a(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4cbd85", new Object[]{this, commonSearchResult});
            return;
        }
        super.a((nsq) commonSearchResult);
        if (this.b == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, commonSearchResult.getMainInfo().rn);
        hashMap.put("tabs", commonSearchResult.tabParseTraceDigest == null ? "" : commonSearchResult.tabParseTraceDigest.f29197a);
        hashMap.put("templates", commonSearchResult.templatesParseTraceDigest == null ? "" : commonSearchResult.templatesParseTraceDigest.f29197a);
        hashMap.put("topBar", commonSearchResult.topBarParseTraceDigest == null ? "" : commonSearchResult.topBarParseTraceDigest.f29197a);
        hashMap.put("itemsArray", commonSearchResult.itemsArrayTraceDigest == null ? "" : commonSearchResult.itemsArrayTraceDigest.f29197a);
        if (commonSearchResult.layoutParseTraceDigestMap != null && !commonSearchResult.layoutParseTraceDigestMap.isEmpty()) {
            for (Map.Entry<String, ioz> entry : commonSearchResult.layoutParseTraceDigestMap.entrySet()) {
                String key = entry.getKey();
                if (!StringUtils.isEmpty(key)) {
                    ioz value = entry.getValue();
                    hashMap.put(key, value == null ? "" : value.f29197a);
                }
            }
        }
        this.b.f(hashMap);
    }
}
