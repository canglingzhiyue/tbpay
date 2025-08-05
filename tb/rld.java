package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ReflectUtil;

/* loaded from: classes9.dex */
public class rld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2062048093);
    }

    public static Map<String, String> a(String str, String str2, int i, Map<String, String> map, int i2) {
        MethodEnum a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2449dc9a", new Object[]{str, str2, new Integer(i), map, new Integer(i2)});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setNeedEcode(false);
        mtopRequest.setNeedSession(true);
        mtopRequest.setData(ReflectUtil.convertMapToDataStr(map));
        HashMap hashMap = new HashMap();
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1312setConnectionTimeoutMilliSecond(i);
        build.mo1326setSocketTimeoutMilliSecond(i);
        String a3 = a(map, "__customDomain__");
        if (!TextUtils.isEmpty(a3)) {
            build.mo1313setCustomDomain(a3);
        }
        String a4 = a(map, "__requestMethod__");
        if (!TextUtils.isEmpty(a4) && (a2 = a(a4)) != null) {
            build.mo1305reqMethod(a2);
        }
        if (i2 == 1) {
            build.mo1305reqMethod(MethodEnum.POST);
        }
        MtopResponse syncRequest = build.syncRequest();
        if ("SUCCESS".equalsIgnoreCase(syncRequest.getRetCode())) {
            hashMap.put("success", "1");
            String str3 = null;
            if (syncRequest.getBytedata() != null) {
                try {
                    str3 = new String(syncRequest.getBytedata(), "UTF-8");
                } catch (Exception unused) {
                }
            }
            hashMap.put("result", str3);
        } else {
            hashMap.put("success", "0");
            if (syncRequest != null) {
                hashMap.put("errorCode", syncRequest.getRetCode() + "");
                hashMap.put("errorMsg", syncRequest.getRetMsg() + "");
            }
            hashMap.put("result", "");
        }
        return hashMap;
    }

    private static String a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0668d9", new Object[]{map, str});
        }
        if (map != null && str != null) {
            return map.remove(str);
        }
        return null;
    }

    private static MethodEnum a(String str) {
        MethodEnum[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MethodEnum) ipChange.ipc$dispatch("d2f06ef0", new Object[]{str});
        }
        for (MethodEnum methodEnum : MethodEnum.values()) {
            if (methodEnum.getMethod().equalsIgnoreCase(str)) {
                return methodEnum;
            }
        }
        return null;
    }
}
