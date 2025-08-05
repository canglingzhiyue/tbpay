package com.taobao.trade.common.kit.utils;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import com.taobao.android.n;
import java.util.LinkedHashMap;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class UnifyLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_USE_ANDROID_LOG = "useAndroidLog";

    /* renamed from: a  reason: collision with root package name */
    public static String f22978a;
    public static String b;
    public static String c;
    public static boolean d;
    private static String e;
    private static AliLogInterface f;
    private static LinkedHashMap<String, Object> g;

    /* loaded from: classes9.dex */
    public enum EventType {
        COMMON("common", 0),
        CLICK("click", 1),
        NET("net", 2),
        NET_RESPONSE("net_response", 3),
        ERROR("error", 4);
        
        private int value;

        EventType(String str, int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public interface a {
        void a(String str);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : e;
    }

    public static /* synthetic */ void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            b(str, str2, str3);
        }
    }

    public static /* synthetic */ AliLogInterface b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliLogInterface) ipChange.ipc$dispatch("af68b83c", new Object[0]) : f;
    }

    static {
        kge.a(2004089790);
        f22978a = "[new_ultron]";
        b = "default";
        c = "default";
        e = f22978a + riy.ARRAY_START_STR + c + riy.ARRAY_END_STR;
        f = n.a();
        d = false;
        g = new LinkedHashMap<>();
    }

    private static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
        } else if (g.get(c) == null) {
        } else {
            g.get(c);
        }
    }

    public static void a(final String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
            return;
        }
        if (d) {
            a(b(str, strArr), new a() { // from class: com.taobao.trade.common.kit.utils.UnifyLog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.trade.common.kit.utils.UnifyLog.a
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    Log.e(UnifyLog.a(), str2);
                    UnifyLog.a("error", str, str2);
                }
            });
        }
        if (f == null) {
            return;
        }
        a(b(str, strArr), new a() { // from class: com.taobao.trade.common.kit.utils.UnifyLog.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.trade.common.kit.utils.UnifyLog.a
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    return;
                }
                UnifyLog.b().d(UnifyLog.a(), str2);
                UnifyLog.a("error", str, str2);
            }
        });
    }

    private static void a(String str, a aVar) {
        String substring;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f53a0046", new Object[]{str, aVar});
        } else if (str == null) {
        } else {
            while (i < str.length()) {
                int i2 = i + 25600;
                if (str.length() <= i2) {
                    substring = str.substring(i);
                } else {
                    substring = str.substring(i, i2);
                }
                if (i != 0) {
                    substring = "----- log split -----\n" + substring;
                }
                aVar.a(substring);
                i = i2;
            }
        }
    }

    private static String b(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f351954", new Object[]{str, strArr});
        }
        if (strArr == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(".");
                }
                sb.append(strArr[i]);
                if (strArr.length > 1) {
                    sb.append(" |");
                }
            } else {
                sb.append(" ");
                sb.append(strArr[i]);
            }
        }
        return sb.toString();
    }
}
