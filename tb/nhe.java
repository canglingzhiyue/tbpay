package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.pha.core.p;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public class nhe implements nfd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31465a;
    private static final String[] b;

    static {
        kge.a(1061596850);
        kge.a(752924560);
        f31465a = nhe.class.getSimpleName();
        b = new String[]{"key", "api", "v"};
    }

    @Override // tb.nfd
    public nfh a(JSONObject jSONObject) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfh) ipChange.ipc$dispatch("29045e4e", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return new nhf(-3);
        }
        for (String str : b) {
            if (TextUtils.isEmpty(jSONObject.getString(str))) {
                ngr.b(f31465a, "Parameter \"" + str + "\" not exists.");
                return new nhf(-1);
            }
        }
        return a(b(jSONObject).syncRequest());
    }

    private static nfh a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfh) ipChange.ipc$dispatch("54a13809", new Object[]{mtopResponse});
        }
        if (mtopResponse == null) {
            return new nhf(-2);
        }
        return new nhf(mtopResponse);
    }

    private static MtopRequest a(nhg nhgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("53f579f6", new Object[]{nhgVar});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(nhgVar.f31467a);
        mtopRequest.setVersion(nhgVar.b);
        mtopRequest.setNeedEcode(nhgVar.c);
        mtopRequest.setNeedSession(true);
        if (StringUtils.isNotBlank(nhgVar.l)) {
            mtopRequest.setData(nhgVar.l);
        }
        mtopRequest.dataParams = nhgVar.a();
        return mtopRequest;
    }

    private static MtopBusiness b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("844e1c6d", new Object[]{jSONObject});
        }
        nhg c = c(jSONObject);
        MtopRequest a2 = a(c);
        Mtop instance = Mtop.instance(Mtop.Id.INNER, p.e());
        String str = StringUtils.isBlank(c.e) ? instance.getMtopConfig().ttid : c.e;
        Boolean bool = jSONObject.getBoolean("encode_headers");
        if (bool != null) {
            instance.getMtopConfig().enableHeaderUrlEncode = bool.booleanValue();
        }
        MtopBusiness build = MtopBusiness.build(instance, a2, str);
        try {
            if (!TextUtils.isEmpty(c.g)) {
                build.mo1309setBizId(c.g);
            }
            if (!TextUtils.isEmpty(c.h)) {
                build.mo1310setBizTopic(c.h);
            }
        } catch (Exception unused) {
        }
        build.mo1305reqMethod(c.j ? MethodEnum.POST : MethodEnum.GET);
        build.mo1334useCache();
        if (c.b() != null) {
            build.mo1297headers(c.b());
        }
        String string = jSONObject.getString("userAgent");
        if (StringUtils.isNotBlank(string)) {
            HashMap hashMap = new HashMap();
            hashMap.put("x-ua", string);
            build.mo1297headers((Map<String, String>) hashMap);
        }
        String str2 = c.i;
        if (!StringUtils.isBlank(str2) && ("json".equals(str2) || "originaljson".equals(str2))) {
            build.mo1315setJsonType(JsonTypeEnum.valueOf(str2.toUpperCase()));
        }
        if (c.d > 0) {
            build.mo1335useWua();
        }
        build.mo1335useWua();
        String string2 = jSONObject.getString("online_host");
        String string3 = jSONObject.getString("pre_host");
        String string4 = jSONObject.getString("daily_host");
        String string5 = jSONObject.getString("custom_host");
        if (!TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3) || !TextUtils.isEmpty(string4)) {
            build.mo1314setCustomDomain(string2, string3, string4);
        }
        if (!TextUtils.isEmpty(string5)) {
            build.mo1313setCustomDomain(string5);
        }
        return build;
    }

    private static nhg c(JSONObject jSONObject) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nhg) ipChange.ipc$dispatch("5e45eab3", new Object[]{jSONObject});
        }
        nhg nhgVar = new nhg();
        nhgVar.f31467a = jSONObject.getString("api");
        nhgVar.b = jSONObject.getString("v");
        String string = jSONObject.getString("type");
        if ("GET".equalsIgnoreCase(string) || "POST".equalsIgnoreCase(string)) {
            nhgVar.j = "POST".equalsIgnoreCase(string);
        } else {
            Object obj = jSONObject.get("post");
            if (obj instanceof Boolean) {
                nhgVar.j = ((Boolean) obj).booleanValue();
            } else {
                nhgVar.j = jSONObject.getIntValue("post") != 0;
            }
        }
        String string2 = jSONObject.getString("dataType");
        if (TextUtils.isEmpty(string2)) {
            string2 = "originaljson";
        }
        nhgVar.i = string2;
        if (jSONObject.containsKey("needLogin")) {
            z = jSONObject.getBooleanValue("needLogin");
        } else if (jSONObject.containsKey("loginRequest")) {
            z = jSONObject.getBooleanValue("loginRequest");
        } else {
            z = jSONObject.getIntValue(SessionConstants.ECODE) != 0;
        }
        nhgVar.c = z;
        String str = MtopJSBridge.MtopJSParam.SEC_TYPE;
        if (!jSONObject.containsKey(str)) {
            str = "isSec";
        }
        nhgVar.d = jSONObject.getIntValue(str);
        nhgVar.e = jSONObject.getString("ttid");
        if (jSONObject.containsKey("timeout")) {
            Integer integer = jSONObject.getInteger("timeout");
            if (integer == null) {
                integer = 20000;
            }
            nhgVar.f = integer.intValue();
        } else {
            Integer integer2 = jSONObject.getInteger("timer");
            if (integer2 == null) {
                integer2 = 500;
            }
            nhgVar.f = integer2.intValue();
        }
        String string3 = jSONObject.getString(MtopJSBridge.MtopJSParam.SESSION_OPTION);
        if (TextUtils.isEmpty(string3)) {
            string3 = "AutoLoginAndManualLogin";
        }
        nhgVar.k = string3;
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null) {
            jSONObject2 = jSONObject.getJSONObject("param");
        }
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                nhgVar.a(key, value.toString());
                if (!(value instanceof JSONArray) && !(value instanceof JSONObject)) {
                    jSONObject2.put(key, (Object) value.toString());
                }
            }
            nhgVar.l = jSONObject2.toString();
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(MtopJSBridge.MtopJSParam.EXT_HEADERS);
        if (jSONObject3 != null) {
            for (String str2 : jSONObject3.keySet()) {
                String string4 = jSONObject3.getString(str2);
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(string4)) {
                    nhgVar.b(str2, string4);
                }
            }
        }
        try {
            nhgVar.g = jSONObject.getString("bizId");
            nhgVar.h = jSONObject.getString(MtopModule.KEY_MTOP_BIZ_TOPIC);
        } catch (Exception unused) {
        }
        return nhgVar;
    }
}
