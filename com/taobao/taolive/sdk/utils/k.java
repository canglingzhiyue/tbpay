package com.taobao.taolive.sdk.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.its;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.riy;

/* loaded from: classes8.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, String> f21967a;
    public static HashMap<String, String> b;
    public static HashMap<String, String> c;

    public static NetRequest a(INetDataObject iNetDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetRequest) ipChange.ipc$dispatch("70d007c7", new Object[]{iNetDataObject});
        }
        NetRequest netRequest = new NetRequest();
        if (iNetDataObject != null) {
            a(netRequest, iNetDataObject);
        }
        return netRequest;
    }

    private static void a(NetRequest netRequest, Object obj) {
        try {
            HashMap hashMap = new HashMap();
            Class<?> cls = obj.getClass();
            HashSet hashSet = new HashSet();
            hashSet.addAll(Arrays.asList(cls.getFields()));
            hashSet.addAll(Arrays.asList(cls.getDeclaredFields()));
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Field field = (Field) it.next();
                String name = field.getName();
                if (!name.contains("$") && !name.equals("serialVersionUID") && !name.equals("ORIGINALJSON")) {
                    boolean z = true;
                    field.setAccessible(true);
                    char c2 = 65535;
                    switch (name.hashCode()) {
                        case -513196083:
                            if (name.equals("NEED_SESSION")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 397645513:
                            if (name.equals("NEED_ECODE")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1069590712:
                            if (name.equals(com.taobao.android.detail.sdk.vmodel.main.c.K_API_VERSION)) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1779423664:
                            if (name.equals(com.taobao.android.detail.sdk.vmodel.main.c.K_API_NAME)) {
                                c2 = 0;
                                break;
                            }
                            break;
                    }
                    if (c2 == 0) {
                        Object obj2 = field.get(obj);
                        if (obj2 != null) {
                            netRequest.setApiName(obj2.toString());
                        }
                    } else if (c2 == 1) {
                        Object obj3 = field.get(obj);
                        if (obj3 != null) {
                            netRequest.setVersion(obj3.toString());
                        }
                    } else if (c2 == 2) {
                        Boolean valueOf = Boolean.valueOf(field.getBoolean(obj));
                        if (valueOf == null || !valueOf.booleanValue()) {
                            z = false;
                        }
                        netRequest.setNeedEcode(z);
                    } else if (c2 == 3) {
                        Boolean valueOf2 = Boolean.valueOf(field.getBoolean(obj));
                        if (valueOf2 == null || !valueOf2.booleanValue()) {
                            z = false;
                        }
                        netRequest.setNeedSession(z);
                    } else {
                        Object obj4 = field.get(obj);
                        if (obj4 != null) {
                            if (obj4 instanceof String) {
                                hashMap.put(name, obj4.toString());
                            } else {
                                hashMap.put(name, JSON.toJSONString(obj4));
                            }
                        }
                    }
                }
            }
            netRequest.dataParams = hashMap;
            netRequest.setData(a(hashMap));
        } catch (Exception e) {
            pnj m = pmd.a().m();
            m.a("mtopsdk.ReflectUtil", "parseParams failed." + e.toString());
        }
    }

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append(riy.BLOCK_START_STR);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    try {
                        sb.append(JSON.toJSONString(key));
                        sb.append(":");
                        sb.append(JSON.toJSONString(value));
                        sb.append(",");
                    } catch (Throwable th) {
                        StringBuilder sb2 = new StringBuilder(64);
                        sb2.append("[convertMapToDataStr] convert key=");
                        sb2.append(key);
                        sb2.append(",value=");
                        sb2.append(value);
                        sb2.append(" to dataStr error.");
                        pnj m = pmd.a().m();
                        m.a("mtopsdk.ReflectUtil", sb2.toString() + th);
                    }
                }
            }
            int length = sb.length();
            if (length > 1) {
                sb.deleteCharAt(length - 1);
            }
        }
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }

    static {
        kge.a(1362410459);
        f21967a = new HashMap<>(128);
        b = new HashMap<>(24);
        HashMap<String, String> hashMap = new HashMap<>(64);
        c = hashMap;
        hashMap.put("FAIL_SYS_API_STOP_SERVICE", "ES10000");
        c.put("FAIL_SYS_SM_ODD_REQUEST", "ES10001");
        c.put("FAIL_SYS_API_NOT_FOUNDED", "ES10002");
        c.put("FAIL_SYS_SESSION_EXPIRED", "ES10003");
        c.put("FAIL_SYS_SYSTEM_BUSY_ERROR", "ES10004");
        c.put("FAIL_SYS_SERVLET_ASYNC_START_FAIL", "ES10005");
        c.put("FAIL_SYS_FLOWLIMIT", "ES10006");
        c.put("FAIL_SYS_API_UNAUTHORIZED", "ES10007");
        c.put("FAIL_SYS_PROTOPARAM_MISSED", "ES10008");
        c.put("FAIL_SYS_PROTOVER_MISSED", "ES10009");
        c.put("FAIL_SYS_REQUEST_EXPIRED", "ES10010");
        c.put("FAIL_SYS_ILEGEL_SIGN", "ES10011");
        c.put("FAIL_SYS_INVALID_HTTP_METHOD", "ES10012");
        c.put("FAIL_SYS_BADARGUMENT_T", "ES10013");
        c.put("FAIL_SYS_UNKNOWN_APP", "ES10014");
        c.put("FAIL_SYS_INTERNAL_FAULT", "ES10015");
        c.put(its.TRAFFIC_LIMIT_STATUS, "ES10016");
        c.put("FAIL_SYS_BIZPARAM_TYPE_ERROR", "ES10017");
        c.put("FAIL_SYS_BIZPARAM_MISSED", "ES10018");
        c.put("FAIL_SYS_TOPAUTHPARAM_MISSED", "ES10019");
        c.put("FAIL_SYS_TOPAUTH_FAILED", "ES10020");
        c.put("FAIL_SYS_TOPAUTH_ACCESSTOKENEXPIRED_ERROR", "ES10021");
        c.put("FAIL_SYS_TOPAUTH_TRAFFICLIMIT_ERROR", "ES10022");
        c.put("FAIL_SYS_TOPUNAUTHAPI_ERROR", "ES10023");
        c.put("FAIL_SYS_TOPAUTH_FAULT", "ES10024");
        c.put("FAIL_SYS_RETMISSED_ERROR", "ES10025");
        c.put("FAIL_SYS_PARAMINVALID_ERROR", "ES10026");
        c.put(ErrorConstant.ERRCODE_SYSTEM_ERROR, "ES10027");
        c.put("FAIL_SYS_UNAUTHORIZED_ENTRANCE", "ES10028");
        c.put("FAIL_SYS_SESSION_ERROR", "ES10029");
        c.put("FAIL_SYS_MT_ODD_REQUEST", "ES10030");
        c.put("FAIL_SYS_EXPIRED_REQUEST", "ES10031");
        c.put("FAIL_SYS_PORTOCOLPARAM_INVALID", "ES10032");
        c.put("FAIL_SYS_INVALID_PROTOCOLVERSION", "ES10033");
        c.put("FAIL_SYS_PARAM_MISSING", "ES10035");
        c.put("FAIL_SYS_PARAM_FORMAT_ERROR", "ES10036");
        c.put("FAIL_SYS_ILLEGAL_ARGUMENT_TTID", "ES10034");
        c.put(ErrorConstant.ERRCODE_FAIL_SYS_ILLEGAL_ACCESS_TOKEN, "ES10037");
        c.put("FAIL_SYS_ACCESS_TOKEN_STOP_SERVICE", "ES10038");
        c.put("FAIL_SYS_ACCESS_TOKEN_INTERNAL_FAULT", "ES10039");
        c.put("FAIL_SYS_ACCESS_TOKEN_TRAFFIC_LIMIT", "ES10040");
        c.put(ErrorConstant.ERRCODE_FAIL_SYS_ACCESS_TOKEN_EXPIRED, "ES10041");
        c.put("FAIL_SYS_ACCESS_TOKEN_PARAM_INVALID", "ES10042");
        c.put("FAIL_SYS_ACCESS_TOKEN_UNKNOWN_ERROR", "ES10043");
        c.put(ErrorConstant.ERRCODE_FAIL_SYS_REQUEST_QUEUED, "ES10044");
        c.put("FAIL_SYS_SERVICE_NOT_EXIST", "ES20000");
        c.put("FAIL_SYS_SERVICE_TIMEOUT", "ES20001");
        c.put("FAIL_SYS_SERVICE_FAULT", "ES20002");
        c.put("FAIL_SYS_HTTP_QUERYIP_ERROR", "ES30000");
        c.put("FAIL_SYS_HTTP_REQUESTSUBMIT_FAILED", "ES30001");
        c.put("FAIL_SYS_HTTP_INVOKE_ERROR", "ES30002");
        c.put("FAIL_SYS_HTTP_RESPONSE_TIMEOUT", "ES30003");
        c.put("FAIL_SYS_HTTP_CONNECT_TIMEOUT", "ES30004");
        c.put("UNKNOWN_FAIL_CODE", "ES40000");
        c.put("FAIL_SYS_HSF_THROWN_EXCEPTION", "ES40001");
        c.put("FAIL_SYS_HTTP_RESULT_FIELDMISSED", "ES40003");
        c.put("FAIL_SYS_SERVICE_INNER_FAULT", "ES40002");
        b.put(ErrorConstant.ERRCODE_NO_NETWORK, "EC10000");
        b.put("ANDROID_SYS_NETWORK_ERROR", "EC10001");
        b.put(ErrorConstant.ERRCODE_JSONDATA_BLANK, "EC30000");
        b.put(ErrorConstant.ERRCODE_JSONDATA_PARSE_ERROR, "EC30001");
        b.put(ErrorConstant.ERRCODE_MTOPSDK_INIT_ERROR, "EC40000");
        b.put(ErrorConstant.ERRCODE_MTOPCONTEXT_INIT_ERROR, "EC40001");
        b.put(ErrorConstant.ERRCODE_GENERATE_MTOP_SIGN_ERROR, ErrorConstant.MAPPING_CODE_GENERATE_MTOP_SIGN_ERROR);
        b.put(ErrorConstant.ERRCODE_NETWORK_REQUEST_CONVERT_ERROR, "EC40003");
        b.put("ANDROID_SYS_API_FLOW_LIMIT_LOCKED", "EC20000");
        b.put(ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK, "EC20001");
        b.put(ErrorConstant.ERRCODE_MTOP_APICALL_ASYNC_TIMEOUT, "EC40004");
        b.put(ErrorConstant.ERRCODE_INIT_MTOP_ISIGN_ERROR, "EC40005");
        b.put(ErrorConstant.ERRCODE_MTOP_MISS_CALL_FACTORY, "EC40006");
        b.put(ErrorConstant.ERRCODE_ANDROID_SYS_LOGIN_FAIL, "EC40007");
        b.put("ANDROID_SYS_LOGIN_CANCEL", "EC40008");
        b.put(ErrorConstant.ERRCODE_ILLEGAL_JSPARAM_ERROR, "EC40009");
        b.put(ErrorConstant.ERRCODE_PARSE_JSPARAM_ERROR, "EC40010");
        b.put(ErrorConstant.ERRCODE_BUILD_PROTOCOL_PARAMS_ERROR, "EC40011");
        f21967a.putAll(c);
        f21967a.putAll(b);
        f21967a.put("SUCCESS", "SUCCESS");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : its.TRAFFIC_LIMIT_STATUS.equals(str) || g(str);
    }

    public static boolean a(NetResponse netResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("734351c7", new Object[]{netResponse})).booleanValue();
        }
        if (netResponse == null) {
            return false;
        }
        return "FAIL_SYS_SESSION_EXPIRED".equals(netResponse.getRetCode()) || ErrorConstant.ERRCODE_ANDROID_SYS_LOGIN_FAIL.equals(netResponse.getRetCode());
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK.equals(str);
    }

    public static boolean b(NetResponse netResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98d75ac8", new Object[]{netResponse})).booleanValue();
        }
        if (netResponse == null) {
            return false;
        }
        String retCode = netResponse.getRetCode();
        return c(retCode) || f(retCode) || e(retCode) || b(retCode) || g(retCode) || d(retCode);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : c.containsKey(str);
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue() : StringUtils.isEmpty(str) || b.containsKey(str);
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue() : "FAIL_SYS_EXPIRED_REQUEST".equals(str) || "FAIL_SYS_REQUEST_EXPIRED".equals(str);
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{str})).booleanValue() : "ANDROID_SYS_NETWORK_ERROR".equals(str) || ErrorConstant.ERRCODE_NO_NETWORK.equals(str);
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{str})).booleanValue() : "ANDROID_SYS_API_FLOW_LIMIT_LOCKED".equals(str);
    }
}
