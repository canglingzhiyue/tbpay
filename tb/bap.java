package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* loaded from: classes2.dex */
public class bap {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(915616623);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : b();
    }

    private static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : jpx.a() ? "http://taobao.com/jstracker/android/debug/aura.html" : "http://taobao.com/jstracker/android/aura.html";
    }

    public static void a(sda sdaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8084a8", new Object[]{sdaVar});
        } else if (!(sdaVar instanceof b)) {
            if (jpx.a()) {
                throw new IllegalArgumentException("model 必须为BuyMtopModel");
            }
        } else {
            if (jpx.a()) {
                sdaVar.a(1.0f);
            }
            jpr.a(sdaVar);
        }
    }

    public static void a(jpt jptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd6a42a", new Object[]{jptVar});
        } else if (!(jptVar instanceof a)) {
            if (jpx.a()) {
                throw new IllegalArgumentException("model 必须为BuyCustomModel");
            }
        } else {
            if (jpx.a()) {
                jptVar.a(1.0f);
            }
            jpr.a(jptVar);
        }
    }

    /* loaded from: classes2.dex */
    public static class a extends jpt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1541098912);
        }

        private a(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static a b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9e98cce5", new Object[]{str}) : new a("AURA", str, "26900-tracker", bap.a());
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends sda {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1543119785);
        }

        private b(String str, String str2, String str3, String str4, boolean z) {
            super(str, str2, str3, str4, z);
        }

        public static b a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3ebcb275", new Object[]{str, new Boolean(z)}) : new b("AURA", "26900-tracker", bap.a(), str, z);
        }
    }

    public static boolean a(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a82180da", new Object[]{new Double(d)})).booleanValue() : ((double) (new Random().nextInt(101) + 1)) > d;
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e691f0eb", new Object[]{str, str2, str3, str4, str5, str6, map, str7});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", str2);
        hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, str3);
        hashMap.put("code", str5);
        hashMap.put("sampling", str6);
        hashMap.put("collection_url", k.HTTP_PREFIX + str4);
        hashMap.put("name", str);
        hashMap.put("native", "1");
        if (map != null) {
            map.put("c1", JSON.toJSONString(hashMap));
        }
        if (!TextUtils.isEmpty(str7)) {
            hashMap.put("message", a(str7));
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(k.HTTP_PREFIX + str4, 19999, "/jstracker.3", "", "", hashMap).build());
    }

    public static void b(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final Map<String, String> map, final String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf22e30a", new Object[]{str, str2, str3, str4, str5, str6, map, str7});
        } else {
            bbh.a(new Runnable() { // from class: tb.bap.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        bap.a(str, str2, str3, str4, str5, bar.a(str5, str6), map, str7);
                    }
                }
            });
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }
}
