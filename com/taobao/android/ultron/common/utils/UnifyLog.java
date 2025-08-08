package com.taobao.android.ultron.common.utils;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.ability.impl.log.LogAbility;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import com.taobao.android.n;
import java.util.LinkedHashMap;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class UnifyLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_USE_ANDROID_LOG = "useAndroidLog";

    /* renamed from: a  reason: collision with root package name */
    public static String f15731a;
    public static String b;
    public static String c;
    public static boolean d;
    private static String e;
    private static AliLogInterface f;
    private static LinkedHashMap<String, Object> g;

    /* loaded from: classes6.dex */
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
    /* loaded from: classes6.dex */
    public interface b {
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
        kge.a(52067163);
        f15731a = "[new_ultron]";
        b = "default";
        c = "default";
        e = f15731a + riy.ARRAY_START_STR + c + riy.ARRAY_END_STR;
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

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (str.startsWith(riy.ARRAY_START_STR)) {
                str = str.replace(riy.ARRAY_START_STR, "");
            }
            if (str.endsWith(riy.ARRAY_END_STR)) {
                str = str.replace(riy.ARRAY_END_STR, "");
            }
            c = str;
            e = f15731a + riy.ARRAY_START_STR + c + riy.ARRAY_END_STR;
        }
    }

    public static void a(final String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
            return;
        }
        if (d) {
            a(e(str, strArr), new b() { // from class: com.taobao.android.ultron.common.utils.UnifyLog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ultron.common.utils.UnifyLog.b
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    } else {
                        UnifyLog.a();
                    }
                }
            });
        }
        if (f == null) {
            return;
        }
        a(e(str, strArr), new b() { // from class: com.taobao.android.ultron.common.utils.UnifyLog.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.ultron.common.utils.UnifyLog.b
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    return;
                }
                UnifyLog.b().c(UnifyLog.a(), str2);
                UnifyLog.a(LogAbility.API_WARN, str, str2);
            }
        });
    }

    public static void b(final String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ae8ccc", new Object[]{str, strArr});
            return;
        }
        if (d) {
            a(e(str, strArr), new b() { // from class: com.taobao.android.ultron.common.utils.UnifyLog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ultron.common.utils.UnifyLog.b
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    } else {
                        UnifyLog.a();
                    }
                }
            });
        }
        if (f == null) {
            return;
        }
        a(e(str, strArr), new b() { // from class: com.taobao.android.ultron.common.utils.UnifyLog.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.ultron.common.utils.UnifyLog.b
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    return;
                }
                UnifyLog.b().a(UnifyLog.a(), str2);
                UnifyLog.a("debug", str, str2);
            }
        });
    }

    public static void c(final String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df13c1eb", new Object[]{str, strArr});
            return;
        }
        if (d) {
            a(e(str, strArr), new b() { // from class: com.taobao.android.ultron.common.utils.UnifyLog.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ultron.common.utils.UnifyLog.b
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    } else {
                        UnifyLog.a();
                    }
                }
            });
        }
        if (f == null) {
            return;
        }
        a(e(str, strArr), new b() { // from class: com.taobao.android.ultron.common.utils.UnifyLog.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.ultron.common.utils.UnifyLog.b
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    return;
                }
                UnifyLog.b().b(UnifyLog.a(), str2);
                UnifyLog.a("info", str, str2);
            }
        });
    }

    public static void d(final String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e678f70a", new Object[]{str, strArr});
            return;
        }
        if (d) {
            a(e(str, strArr), new b() { // from class: com.taobao.android.ultron.common.utils.UnifyLog.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ultron.common.utils.UnifyLog.b
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
        a(e(str, strArr), new b() { // from class: com.taobao.android.ultron.common.utils.UnifyLog.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.ultron.common.utils.UnifyLog.b
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

    private static void a(String str, b bVar) {
        String substring;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfaae616", new Object[]{str, bVar});
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
                bVar.a(substring);
                i = i2;
            }
        }
    }

    private static String e(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1567f97", new Object[]{str, strArr});
        }
        if (strArr == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                if (!StringUtils.isEmpty(str)) {
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

    public static void a(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50031319", new Object[]{str, str2, str3, strArr});
        } else {
            a(str, str2, str3, "0", "", EventType.COMMON, strArr);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9888885", new Object[]{str, str2, str3, str4, str5, strArr});
        } else {
            a(str, str2, str3, str4, str5, EventType.COMMON, strArr);
        }
    }

    public static void a(final String str, final String str2, final String str3, final String str4, final String str5, final EventType eventType, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f5a63", new Object[]{str, str2, str3, str4, str5, eventType, strArr});
            return;
        }
        try {
            if (d) {
                a(e(str2, strArr), new b() { // from class: com.taobao.android.ultron.common.utils.UnifyLog.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.ultron.common.utils.UnifyLog.b
                    public void a(String str6) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str6});
                            return;
                        }
                        Log.e(UnifyLog.a(), str6);
                        UnifyLog.a("error", str2, str6);
                    }
                });
            }
            if (f == null) {
                return;
            }
            a(e("", strArr), new b() { // from class: com.taobao.android.ultron.common.utils.UnifyLog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ultron.common.utils.UnifyLog.b
                public void a(String str6) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str6});
                        return;
                    }
                    UnifyLog.b().a("", "", UnifyLog.f15731a + riy.ARRAY_START_STR + str + riy.ARRAY_END_STR, str2, 0L, str3, str4, str5, eventType.getValue(), "", str6);
                    UnifyLog.a("error", str2, str6);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
