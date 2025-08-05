package com.alibaba.analytics.core.logbuilder;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.analytics.AnalyticsImp;
import com.alibaba.analytics.core.config.m;
import com.alibaba.analytics.core.config.v;
import com.alibaba.analytics.core.logbuilder.GoogleAdvertisingIdClient;
import com.alibaba.analytics.core.model.LogField;
import com.alibaba.analytics.core.model.UTMCLogFields;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.anz;
import tb.aob;
import tb.aoi;
import tb.aoj;
import tb.apg;
import tb.apr;
import tb.aqc;
import tb.aqf;
import tb.aqj;
import tb.kge;
import tb.rqd;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-446441532);
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : aqc.e(str) ? "-" : str;
    }

    private static void a(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb874e12", new Object[]{str, map, map2});
        } else if (map.containsKey(str) || map2.get(str) == null) {
        } else {
            map.put(str, map2.get(str));
        }
    }

    private static void a(Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0efabc8", new Object[]{map, map2});
            return;
        }
        map.put(LogField.BRAND.toString(), map2.get(LogField.BRAND.toString()));
        map.put(LogField.DEVICE_MODEL.toString(), map2.get(LogField.DEVICE_MODEL.toString()));
        map.put(LogField.RESOLUTION.toString(), map2.get(LogField.RESOLUTION.toString()));
        map.put(LogField.OS.toString(), map2.get(LogField.OS.toString()));
        map.put(LogField.OSVERSION.toString(), map2.get(LogField.OSVERSION.toString()));
        map.put(LogField.UTDID.toString(), map2.get(LogField.UTDID.toString()));
        a(LogField.IMEI.toString(), map, map2);
        a(LogField.IMSI.toString(), map, map2);
        a(LogField.APPVERSION.toString(), map, map2);
        a(UTMCLogFields.DEVICE_ID.toString(), map, map2);
        a(LogField.LANGUAGE.toString(), map, map2);
        a(LogField.ACCESS.toString(), map, map2);
        a(LogField.ACCESS_SUBTYPE.toString(), map, map2);
        a(LogField.CARRIER.toString(), map, map2);
    }

    public static String a(Map<String, String> map) {
        String str;
        String str2;
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map != null && map.size() > 0) {
            Context k = aob.a().k();
            if (k == null && AnalyticsImp.getApplication() != null) {
                k = AnalyticsImp.getApplication().getApplicationContext();
            }
            if (k == null) {
                return null;
            }
            aoj b = aoi.b(k);
            if (b != null) {
                str2 = b.a();
                str = b.b();
            } else {
                str = null;
                str2 = null;
            }
            if (str2 != null && str != null && map.get(LogField.IMEI.toString()) == null && map.get(LogField.IMSI.toString()) == null) {
                map.put(LogField.IMEI.toString(), str2);
                map.put(LogField.IMSI.toString(), str);
            }
            if (!aqc.e(aob.a().t())) {
                map.put(LogField.USERNICK.toString(), aob.a().t());
            }
            if (!aqc.e(aob.a().p())) {
                map.put(LogField.LL_USERNICK.toString(), aob.a().p());
            }
            if (!aqc.e(aob.a().u())) {
                map.put(LogField.USERID.toString(), aob.a().u());
            }
            if (!aqc.e(aob.a().q())) {
                map.put(LogField.LL_USERID.toString(), aob.a().q());
            }
            if (!map.containsKey(LogField.SDKVERSION.toString())) {
                map.put(LogField.SDKVERSION.toString(), aqj.a().b());
            }
            if (!map.containsKey(LogField.APPKEY.toString())) {
                map.put(LogField.APPKEY.toString(), aob.a().l());
            }
            if (!aqc.e(aob.a().s())) {
                map.put(LogField.CHANNEL.toString(), aob.a().s());
            }
            if (!aqc.e(aob.a().m())) {
                map.put(LogField.APPVERSION.toString(), aob.a().m());
            }
            if (map.containsKey(LogField.RECORD_TIMESTAMP.toString())) {
                map.put(LogField.RECORD_TIMESTAMP.toString(), "" + g.a().a(map.get(LogField.RECORD_TIMESTAMP.toString())));
            } else {
                map.put(LogField.RECORD_TIMESTAMP.toString(), "" + g.a().c());
            }
            if (!map.containsKey(LogField.START_SESSION_TIMESTAMP.toString())) {
                map.put(LogField.START_SESSION_TIMESTAMP.toString(), "" + f.a().b());
            }
            if (!map.containsKey(LogField.SDKTYPE.toString())) {
                map.put(LogField.SDKTYPE.toString(), anz.a());
            }
            map.put(LogField.RESERVE5.toString(), e.a(k));
            Map<String, String> b2 = aqf.b(k);
            if (b2 != null) {
                a(map, b2);
                if (map.containsKey(UTMCLogFields.ALIYUN_PLATFORM_FLAG.toString())) {
                    map.put(LogField.OS.toString(), "y");
                }
                String str3 = map.get(LogField.RESERVES.toString());
                if (!aqc.e(str3)) {
                    sb = new StringBuilder(str3);
                } else {
                    sb = new StringBuilder(200);
                }
                if (NetworkUtil.i(k)) {
                    if (sb.length() > 0) {
                        sb.append(",_spt5g=1");
                    } else {
                        sb.append("_spt5g=1");
                    }
                } else if (sb.length() > 0) {
                    sb.append(",_spt5g=0");
                } else {
                    sb.append("_spt5g=0");
                }
                GoogleAdvertisingIdClient.a a2 = GoogleAdvertisingIdClient.a();
                if (a2 != null) {
                    if (a2.b()) {
                        if (sb.length() > 0) {
                            sb.append(",_glat=1");
                        } else {
                            sb.append("_glat=1");
                        }
                    } else {
                        if (sb.length() > 0) {
                            sb.append(",_glat=0");
                        } else {
                            sb.append("_glat=0");
                        }
                        String a3 = a2.a();
                        if (!TextUtils.isEmpty(a3)) {
                            if (sb.length() > 0) {
                                sb.append(",gps_adid=");
                                sb.append(a3);
                            } else {
                                sb.append("gps_adid=");
                                sb.append(a3);
                            }
                        }
                    }
                }
                String str4 = map.get(UTMCLogFields.DEVICE_ID.toString());
                if (str4 != null) {
                    if (sb.length() > 0) {
                        sb.append(",_did=");
                        sb.append(str4);
                    } else {
                        sb.append("_did=");
                        sb.append(str4);
                    }
                    map.remove(UTMCLogFields.DEVICE_ID.toString());
                }
                String a4 = c.a(k);
                if (a4 != null) {
                    if (map.containsKey(LogField.UTDID.toString()) && a4.equals(map.get(LogField.UTDID.toString()))) {
                        a4 = "utdid";
                    }
                    if (sb.length() > 0) {
                        sb.append(",_umid=");
                        sb.append(a4);
                    } else {
                        sb.append("_umid=");
                        sb.append(a4);
                    }
                }
                if (aob.a().J()) {
                    String K = aob.a().K();
                    if (!TextUtils.isEmpty(K)) {
                        if (sb.length() > 0) {
                            sb.append(",_buildid=");
                            sb.append(K);
                        } else {
                            sb.append("_buildid=");
                            sb.append(K);
                        }
                    }
                }
                String str5 = "1";
                if (sb.length() > 0) {
                    sb.append(",_timeAdjust=");
                    sb.append(g.a().d() ? str5 : "0");
                } else {
                    sb.append("_timeAdjust=");
                    sb.append(g.a().d() ? str5 : "0");
                }
                String str6 = map.get(LogField.APPKEY.toString());
                String l = aob.a().l();
                if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(l) && !l.equalsIgnoreCase(str6)) {
                    if (sb.length() > 0) {
                        sb.append(",_mak=");
                        sb.append(l);
                    } else {
                        sb.append("_mak=");
                        sb.append(l);
                    }
                }
                if (rqd.bGetPhoneType) {
                    if (!aqf.c(aob.a().k())) {
                        str5 = "0";
                    }
                    if (sb.length() > 0) {
                        sb.append(",_pad=");
                        sb.append(str5);
                    } else {
                        sb.append("_pad=");
                        sb.append(str5);
                    }
                }
                String d = apg.d(k);
                apr.a("LogAssemble", "channel2", d);
                if (!TextUtils.isEmpty(d)) {
                    if (sb.length() > 0) {
                        sb.append(",_channel2=");
                        sb.append(d);
                    } else {
                        sb.append("_channel2=");
                        sb.append(d);
                    }
                }
                String w = aob.a().w();
                if (!aqc.e(w)) {
                    if (sb.length() > 0) {
                        sb.append(",_openid=");
                        sb.append(w);
                    } else {
                        sb.append("_openid=");
                        sb.append(w);
                    }
                }
                String str7 = map.get("UTPVID_T");
                if (!TextUtils.isEmpty(str7)) {
                    if (sb.length() > 0) {
                        sb.append(",_t=");
                        sb.append(str7);
                    } else {
                        sb.append("_t=");
                        sb.append(str7);
                    }
                    map.remove("UTPVID_T");
                }
                String v = aob.a().v();
                if (!TextUtils.isEmpty(v)) {
                    if (sb.length() > 0) {
                        sb.append(",_ut_site=");
                        sb.append(v);
                    } else {
                        sb.append("_ut_site=");
                        sb.append(v);
                    }
                }
                String r = aob.a().r();
                if (!TextUtils.isEmpty(r)) {
                    if (sb.length() > 0) {
                        sb.append(",_ut_lsite=");
                        sb.append(r);
                    } else {
                        sb.append("_ut_lsite=");
                        sb.append(r);
                    }
                }
                Map<String, String> z = aob.a().z();
                if (z != null && z.size() > 0) {
                    String b3 = aqc.b(z);
                    if (!aqc.e(b3)) {
                        if (sb.length() > 0) {
                            sb.append(",");
                            sb.append(b3);
                        } else {
                            sb.append(b3);
                        }
                    }
                }
                map.put(LogField.RESERVES.toString(), sb.toString());
                c(map);
                return b(map);
            }
        }
        return null;
    }

    private static void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{map});
            return;
        }
        try {
            List<String> a2 = m.a().a(map.get(LogField.EVENTID.toString()));
            if (a2 == null) {
                return;
            }
            for (String str : a2) {
                map.remove(str);
            }
        } catch (Exception unused) {
        }
    }

    public static String b(Map<String, String> map) {
        boolean z;
        String sb;
        LogField logField;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{map});
        }
        Map<String, String> a2 = a.a(map);
        a(a2, LogField.ARG1.toString());
        a(a2, LogField.ARG2.toString());
        a(a2, LogField.ARG3.toString());
        StringBuilder sb2 = new StringBuilder();
        LogField[] values = LogField.values();
        int length = values.length;
        int i = 0;
        while (true) {
            String str = null;
            if (i >= length || (logField = values[i]) == LogField.ARGS) {
                break;
            }
            if (a2.containsKey(logField.toString())) {
                str = aqc.a((Object) a2.get(logField.toString()));
                a2.remove(logField.toString());
            }
            sb2.append(b(str));
            sb2.append("||");
            i++;
        }
        StringBuilder sb3 = new StringBuilder();
        if (a2.containsKey(anz.UT_GLOBAL_ARGS)) {
            sb3.append(a2.remove(anz.UT_GLOBAL_ARGS));
            z = false;
        } else {
            z = true;
        }
        String remove = a2.remove(anz.UT_TMP_ARGS);
        if (a2.containsKey(LogField.ARGS.toString())) {
            String a3 = aqc.a((Object) a2.get(LogField.ARGS.toString()));
            if (z) {
                sb3.append(b(a3));
            } else {
                sb3.append(",");
                sb3.append(b(a3));
            }
            a2.remove(LogField.ARGS.toString());
            z = false;
        }
        for (String str2 : a2.keySet()) {
            String a4 = a2.containsKey(str2) ? aqc.a((Object) a2.get(str2)) : null;
            if (z) {
                if ("StackTrace".equals(str2)) {
                    sb3.append("StackTrace=====>");
                    sb3.append(a4);
                } else {
                    sb3.append(b(str2));
                    sb3.append("=");
                    sb3.append(a4);
                }
                z = false;
            } else if ("StackTrace".equals(str2)) {
                sb3.append(",");
                sb3.append("StackTrace=====>");
                sb3.append(a4);
            } else {
                sb3.append(",");
                sb3.append(b(str2));
                sb3.append("=");
                sb3.append(a4);
            }
        }
        if (!aqc.e(remove)) {
            if (z) {
                sb3.append(anz.UT_TMP_ARGS_SPLIT);
                sb3.append(",");
                sb3.append(remove);
            } else {
                sb3.append(",");
                sb3.append(anz.UT_TMP_ARGS_SPLIT);
                sb3.append(",");
                sb3.append(remove);
            }
        }
        int length2 = sb3.length();
        if (length2 <= 0) {
            sb = "-";
        } else if (length2 > 40960) {
            String str3 = map.get(LogField.EVENTID.toString());
            if (c(str3)) {
                if (length2 > 409600) {
                    apr.e("LogAssemble", "truncLog field", LogField.ARGS.toString(), com.taobao.android.weex_framework.util.a.ATOM_length, Integer.valueOf(length2));
                    sb = sb3.substring(0, 409600);
                } else {
                    sb = sb3.toString();
                }
            } else if (!d(str3)) {
                int b = v.a().b();
                if (length2 > b) {
                    apr.e("LogAssemble", "truncLog maxLen", Integer.valueOf(b), "field", LogField.ARGS.toString(), com.taobao.android.weex_framework.util.a.ATOM_length, Integer.valueOf(length2));
                    sb = sb3.substring(0, b);
                } else {
                    sb = sb3.toString();
                }
            } else if (length2 > 245760) {
                apr.e("LogAssemble", "truncLog field", LogField.ARGS.toString(), com.taobao.android.weex_framework.util.a.ATOM_length, Integer.valueOf(length2));
                sb = sb3.substring(0, 245760);
            } else {
                sb = sb3.toString();
            }
        } else {
            sb = sb3.toString();
        }
        sb2.append(sb);
        return sb2.toString();
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : "65501".equalsIgnoreCase(str) || "65502".equalsIgnoreCase(str) || "65503".equalsIgnoreCase(str);
    }

    private static boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue() : "19998".equalsIgnoreCase(str);
    }

    public static Map<String, String> a(String str) {
        LogField[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        if (aqc.e(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String[] a2 = a(str, 34);
        if (a2 != null && a2.length > 0) {
            int i = 0;
            for (LogField logField : LogField.values()) {
                if (i < a2.length && a2[i] != null) {
                    hashMap.put(logField.toString(), a2[i]);
                }
                i++;
            }
        }
        return hashMap;
    }

    private static String[] a(String str, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("c152bea0", new Object[]{str, new Integer(i)});
        }
        String[] strArr = new String[i];
        int i3 = 0;
        while (true) {
            if (i2 >= strArr.length - 1) {
                break;
            }
            int indexOf = str.indexOf("||", i3);
            if (indexOf == -1) {
                strArr[i2] = str.substring(i3);
                break;
            }
            strArr[i2] = str.substring(i3, indexOf);
            i3 = indexOf + 2;
            i2++;
        }
        strArr[i - 1] = str.substring(i3);
        return strArr;
    }

    private static boolean a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7b3ceab", new Object[]{map, str})).booleanValue();
        }
        String str2 = map.get(str);
        if (TextUtils.isEmpty(str2) || str2.length() <= 40960) {
            return false;
        }
        apr.e("LogAssemble truncLog", "field", str, com.taobao.android.weex_framework.util.a.ATOM_length, Integer.valueOf(str2.length()));
        map.put(str, str2.substring(0, 40960));
        return true;
    }
}
