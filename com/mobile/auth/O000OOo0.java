package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.realidentity.u2;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class O000OOo0 {
    private static final Pattern O000000o = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    public static String O000000o() {
        String hostAddress;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                String name = nextElement.getName();
                if (name == null || (!name.contains("wlan") && !name.equals("eth0"))) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (!nextElement2.isLoopbackAddress() && !nextElement2.isLinkLocalAddress() && (hostAddress = nextElement2.getHostAddress()) != null && O000000o.matcher(hostAddress).matches()) {
                            if (stringBuffer.length() > 0) {
                                stringBuffer.append(",");
                            }
                            stringBuffer.append(hostAddress);
                        }
                    }
                }
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static String O000000o(Context context, String str, String str2, String str3, String str4) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("pipl", O000000o());
            hashMap.put("timeStamp", Long.toString(System.currentTimeMillis()));
            hashMap.put("rl", "00000");
            hashMap.put("bussinessType", str3);
            hashMap.put("sdkversion", "SDK-JJ-v3.7.4");
            hashMap.put("networkType", O000OOOo.O00000oo(context));
            hashMap.put("onlineType", O000OOOo.O0000O0o(context));
            hashMap.put(AdvertisementOption.AD_INSTALL_PACKAGE, context.getPackageName());
            return O000000o(str, str2, hashMap, str4);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private static String O000000o(String str, String str2, Map<String, String> map, String str3) {
        try {
            String O000000o2 = O0000Oo0.O000000o(str3, O0000Oo0.O000000o());
            String O000000o3 = O00000o.O000000o(O000000o(map, "&"), str3);
            HashMap hashMap = new HashMap();
            hashMap.put("appId", str);
            hashMap.put(u2.q, "30020");
            hashMap.put("format", "json");
            hashMap.put("paramKey", O000000o2);
            hashMap.put("paramStr", O000000o3);
            hashMap.put("version", "3.0");
            hashMap.put("sign", O00000Oo(hashMap, str2));
            return O000000o(hashMap, "&");
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private static String O000000o(Map<String, String> map, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            if (map != null && !map.isEmpty()) {
                if (TextUtils.isEmpty(str)) {
                    str = "&";
                }
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                    sb.append(str);
                }
                sb = sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private static String O00000Oo(Map<String, String> map, String str) {
        Iterator it;
        try {
            ArrayList arrayList = new ArrayList(map.entrySet());
            Collections.sort(arrayList, new Comparator<Map.Entry<String, String>>() { // from class: com.mobile.auth.O000OOo0.1
                public int O000000o(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
                    try {
                        return entry.getKey().compareTo(entry2.getKey());
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                            return -1;
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                            return -1;
                        }
                    }
                }

                @Override // java.util.Comparator
                public /* synthetic */ int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
                    try {
                        return O000000o(entry, entry2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                            return -1;
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                            return -1;
                        }
                    }
                }
            });
            String str2 = "";
            while (arrayList.iterator().hasNext()) {
                str2 = str2 + ((String) ((Map.Entry) it.next()).getValue());
            }
            return O0000OOo.O00000Oo(O0000OOo.O000000o(str2, str));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }
}
