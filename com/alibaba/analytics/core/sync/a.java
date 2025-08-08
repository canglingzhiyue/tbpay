package com.alibaba.analytics.core.sync;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.model.LogField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import tb.aob;
import tb.aoc;
import tb.aor;
import tb.apg;
import tb.apj;
import tb.apm;
import tb.apr;
import tb.apz;
import tb.aqf;
import tb.aqi;
import tb.aqj;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f2096a;
    public static String b;
    private static long c;
    private static boolean d;
    private static Class e;
    private static int f;
    private static final String g;
    private static GZIPOutputStream h;
    private static ByteArrayOutputStream i;
    private static GZIPOutputStream j;
    private static ByteArrayOutputStream k;

    static {
        kge.a(911804394);
        f2096a = null;
        b = null;
        c = 0L;
        d = false;
        e = null;
        f = 0;
        g = String.valueOf((char) 1);
        h = null;
        i = null;
        j = null;
        k = null;
    }

    public static byte[] a(Map<String, String> map, boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("d21ba766", new Object[]{map, new Boolean(z)}) : a(map, 1, z);
    }

    public static byte[] a(Map<String, String> map) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("ee003260", new Object[]{map}) : a(map, 2, false);
    }

    public static byte[] a(Map<String, String> map, int i2, boolean z) throws Exception {
        byte[] a2;
        byte b2;
        byte b3;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("707f438f", new Object[]{map, new Integer(i2), new Boolean(z)});
        }
        if (aob.a().g() || aob.a().d()) {
            a2 = apm.a(b(map));
            b2 = 1;
            b3 = 1;
            i3 = 0;
        } else {
            l.c();
            byte[] c2 = c(map);
            i3 = c2.length;
            boolean f2 = u.a().f();
            apr.b("BizRequest", "isEnableZstd", Boolean.valueOf(f2));
            if (f2) {
                try {
                    u.a().b.write(c2);
                    u.a().b.flush();
                    a2 = u.a().f2116a.toByteArray();
                    u.a().f2116a.reset();
                    if (z && u.a().g() && i2 == 1 && j != null) {
                        j.write(c2);
                        j.flush();
                        byte[] byteArray = k.toByteArray();
                        k.reset();
                        u.a().a(i3, byteArray.length, a2.length);
                    }
                    b2 = 4;
                } catch (Exception unused) {
                    u.a().e();
                    return null;
                }
            } else {
                GZIPOutputStream gZIPOutputStream = h;
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.write(c2);
                    h.flush();
                    a2 = i.toByteArray();
                    i.reset();
                    b2 = 2;
                } else {
                    a2 = apm.a(c2);
                    b2 = 1;
                }
            }
            b3 = 2;
        }
        apr.b("BizRequest", "compress flags", Byte.valueOf(b2), "version", Byte.valueOf(b3));
        if (a2 == null || a2.length >= 16777216) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(b3);
        byteArrayOutputStream.write(apj.c(a2.length));
        byteArrayOutputStream.write(i2);
        byte b4 = (byte) (b2 | 8);
        if (aob.a().B()) {
            b4 = (byte) (b4 | 16);
        }
        byte b5 = (byte) (b4 | 32);
        byteArrayOutputStream.write(b5);
        byteArrayOutputStream.write(0);
        apr.b("BizRequest", "request flags", Byte.valueOf(b5));
        if (aob.a().d()) {
            byteArrayOutputStream.write(0);
        } else {
            String a3 = a(a2, i2);
            if (t.a().d() && i3 > 0 && i3 < 16777216) {
                if (a3 == null || a3.isEmpty()) {
                    a3 = "_ut_len=" + i3;
                } else {
                    a3 = a3 + "&_ut_len=" + i3;
                }
            }
            apr.b("BizRequest", "options", a3);
            if (a3 == null || a3.isEmpty()) {
                byteArrayOutputStream.write(0);
            } else {
                byteArrayOutputStream.write(1);
                byteArrayOutputStream.write(aqi.a(a3.getBytes().length));
                byteArrayOutputStream.write(a3.getBytes());
            }
        }
        byteArrayOutputStream.write(a2);
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e2) {
            apr.b(null, e2, new Object[0]);
        }
        return byteArray2;
    }

    private static byte[] b(Map<String, String> map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("fa9927e1", new Object[]{map});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String a2 = a();
        if (a2 != null && a2.length() > 0) {
            byteArrayOutputStream.write(apj.b(a2.getBytes().length));
            byteArrayOutputStream.write(a2.getBytes());
        } else {
            byteArrayOutputStream.write(apj.b(0));
        }
        if (map != null && map.size() > 0) {
            for (String str : map.keySet()) {
                try {
                    try {
                        byteArrayOutputStream.write(apj.d(Integer.valueOf(str).intValue()));
                        String str2 = map.get(str);
                        if (str2 != null) {
                            byteArrayOutputStream.write(apj.d(str2.getBytes().length));
                            byteArrayOutputStream.write(str2.getBytes());
                        } else {
                            byteArrayOutputStream.write(apj.d(0));
                        }
                    } catch (Exception unused) {
                        apr.d("BizRequest", "EventId NumberFormatException. eventId", str, ",eventLogs", map.get(str));
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return byteArray;
    }

    private static byte[] c(Map<String, String> map) throws Exception {
        String[] split;
        String[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7321d62", new Object[]{map});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(aqi.a(a()));
        if (map != null && map.size() > 0) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            for (String str : map.keySet()) {
                try {
                    try {
                        byteArrayOutputStream.write(aqi.a(Integer.valueOf(str).intValue()));
                        String str2 = map.get(str);
                        if (str2 != null) {
                            for (String str3 : str2.split(g)) {
                                if (!StringUtils.isEmpty(str3) && (a2 = a(str3)) != null && 34 == a2.length) {
                                    for (String str4 : a2) {
                                        byteArrayOutputStream2.write(aqi.b(str4));
                                    }
                                    byteArrayOutputStream2.write(0);
                                }
                            }
                            byteArrayOutputStream.write(aqi.a(byteArrayOutputStream2.size()));
                            byteArrayOutputStream.write(byteArrayOutputStream2.toByteArray());
                            byteArrayOutputStream2.reset();
                        } else {
                            byteArrayOutputStream.write(0);
                        }
                    } catch (Throwable unused) {
                    }
                } catch (Exception unused2) {
                    apr.d("BizRequest", "EventId NumberFormatException. eventId", str, ",eventLogs", map.get(str));
                }
            }
            try {
                byteArrayOutputStream2.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return byteArray;
    }

    public static String a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        String b2 = apg.b();
        Context k2 = aob.a().k();
        String m = aob.a().m();
        String str2 = "";
        if (m == null) {
            m = str2;
        }
        Map<String, String> b3 = aqf.b(k2);
        if (b3 == null || (str = b3.get(LogField.APPVERSION.toString())) == null) {
            str = str2;
        }
        String a2 = apg.a();
        if (a2 == null) {
            a2 = str2;
        }
        if (b3 != null) {
            str2 = b3.get(LogField.UTDID.toString());
        }
        String b4 = aqj.a().b();
        String str3 = aor.a().d() ? "1" : "0";
        StringBuilder sb = new StringBuilder();
        if (aob.a().B() && !com.alibaba.analytics.core.config.c.a()) {
            sb.append("ak=");
            sb.append(b2);
            sb.append("&av=");
            sb.append(m);
            sb.append("&avsys=");
            sb.append(str);
            sb.append("&c=");
            sb.append(a2);
            sb.append("&d=");
            sb.append(str2);
            sb.append("&sv=");
            sb.append(b4);
            sb.append("&ipv6=");
            sb.append(str3);
            sb.append("&dk=");
            sb.append(aob.a().A());
            sb.append("&ao=a");
        } else {
            sb.append("ak=");
            sb.append(b2);
            sb.append("&av=");
            sb.append(m);
            sb.append("&avsys=");
            sb.append(str);
            sb.append("&c=");
            sb.append(a2);
            sb.append("&d=");
            sb.append(str2);
            sb.append("&sv=");
            sb.append(b4);
            sb.append("&ipv6=");
            sb.append(str3);
            sb.append("&ao=a");
        }
        sb.append("&_ut_sample=");
        sb.append(aoc.a().a("ut_sample"));
        sb.append("&_utap_system=");
        sb.append(aoc.a().a("utap_system"));
        sb.append("&_ap_stat=");
        sb.append(aoc.a().a("ap_stat"));
        sb.append("&_ap_alarm=");
        sb.append(aoc.a().a("ap_alarm"));
        sb.append("&_ap_counter=");
        sb.append(aoc.a().a("ap_counter"));
        sb.append("&_ut_bussiness=");
        sb.append(aoc.a().a("ut_bussiness"));
        sb.append("&_ut_realtime=");
        sb.append(aoc.a().a("ut_realtime"));
        if (!aob.a().d()) {
            sb.append("&_sip=");
            sb.append(j.a().d());
            sb.append("&_sipnw=");
            sb.append(j.a().e());
            sb.append("&_fo=");
            sb.append(j.a().f());
        }
        String sb2 = sb.toString();
        apr.d("PostData", "send url :" + sb2);
        return sb2;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (Build.VERSION.SDK_INT < 19) {
        } else {
            c();
            i = new ByteArrayOutputStream();
            try {
                h = new GZIPOutputStream((OutputStream) i, true);
            } catch (Exception unused) {
            }
            k = new ByteArrayOutputStream();
            try {
                j = new GZIPOutputStream((OutputStream) k, true);
            } catch (Exception unused2) {
            }
            u.a().b();
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        a(h);
        a(i);
        a(j);
        a(k);
        u.a().c();
    }

    public static void a(OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f4ac5a", new Object[]{outputStream});
        } else if (outputStream == null) {
        } else {
            try {
                outputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static String[] a(String str) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ad023781", new Object[]{str});
        }
        String[] strArr = new String[34];
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
        strArr[33] = str.substring(i3);
        return strArr;
    }

    public static int a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c196722", new Object[]{bArr})).intValue();
        }
        int i2 = -1;
        if (bArr == null || bArr.length < 12) {
            apr.e("", "recv errCode UNKNOWN_ERROR");
        } else {
            c = bArr.length;
            if (apj.a(bArr, 1, 3) + 8 != bArr.length) {
                apr.e("", "recv len error");
            } else {
                boolean z = 1 == (bArr[5] & 1);
                int a2 = apj.a(bArr, 8, 4);
                int length = bArr.length - 12 >= 0 ? bArr.length - 12 : 0;
                if (length <= 0) {
                    f2096a = null;
                } else if (z) {
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 12, bArr2, 0, length);
                    byte[] b2 = apm.b(bArr2);
                    f2096a = new String(b2, 0, b2.length);
                } else {
                    f2096a = new String(bArr, 12, length);
                }
                i2 = a2;
            }
        }
        if (107 == i2) {
            aob.a().a(true);
        }
        if (109 == i2) {
            aob.a().d(true);
        }
        if (115 == i2) {
            aob.a().c(true);
        }
        if (116 == i2) {
            aob.a().b(true);
        }
        if (105 == i2 || 120 == i2) {
            u.a().d();
        }
        apr.b("", "errCode", Integer.valueOf(i2));
        return i2;
    }

    public static void a(long j2) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j2)});
            return;
        }
        try {
            Context k2 = aob.a().k();
            if (k2 != null) {
                if (!d && e != null) {
                    e = Class.forName("com.taobao.analysis.FlowCenter");
                    d = true;
                }
                if (e != null && (a2 = apz.a(e, "getInstance")) != null) {
                    apr.b("", "sendBytes", Long.valueOf(j2), "mReceivedDataLen", Long.valueOf(c));
                    apz.a(a2, "commitFlow", new Object[]{k2, BHRTaskConfigBase.TYPE_CONFIG_UT, true, BHRTaskConfigBase.TYPE_CONFIG_UT, Long.valueOf(j2), Long.valueOf(c)}, Context.class, String.class, Boolean.TYPE, String.class, Long.TYPE, Long.TYPE);
                }
            }
            c = 0L;
        } catch (Throwable unused) {
            c = 0L;
        }
    }

    private static String a(byte[] bArr, int i2) {
        HashMap<String, String> b2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56f9216c", new Object[]{bArr, new Integer(i2)});
        }
        if (i2 == 2 || !com.alibaba.analytics.core.config.t.a() || (b2 = m.a().b()) == null || b2.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : b2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value == null || value.isEmpty()) {
                value = "";
            }
            if (z) {
                sb.append(key);
                sb.append("=");
                sb.append(value);
                z = false;
            } else {
                sb.append("&");
                sb.append(key);
                sb.append("=");
                sb.append(value);
            }
        }
        return sb.toString();
    }
}
