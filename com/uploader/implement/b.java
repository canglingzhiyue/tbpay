package com.uploader.implement;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f24066a = false;
    private static volatile boolean b = true;
    private static volatile boolean c = true;
    private static volatile boolean d = false;
    private static volatile int e = -1;
    private static volatile boolean f = false;
    private static volatile Map<String, List<String>> g = new HashMap();
    private static SharedPreferences h;

    public static /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            c(str);
        }
    }

    static {
        try {
            Class.forName("com.taobao.orange.OrangeConfig");
            f24066a = true;
        } catch (Exception unused) {
            f24066a = false;
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!f24066a) {
            a.a(16, "RemoteConfigTool", "no orange sdk");
        } else {
            try {
                OrangeConfig.getInstance().registerListener(new String[]{"aus"}, new g() { // from class: com.uploader.implement.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.orange.g
                    public void onConfigUpdate(String str, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                        } else {
                            b.b(str);
                        }
                    }
                });
            } catch (Exception unused) {
            }
            h = context.getSharedPreferences("uploader_android", 0);
            d = a("quic_enable_switch", false);
            d(c("auth_preset_vip_config", null));
        }
    }

    private static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else if (!"aus".equals(str)) {
        } else {
            try {
                String a2 = a("breakpoint_resume_enable_switch", (String) null);
                if (!StringUtils.isEmpty(a2)) {
                    b = Boolean.valueOf(a2).booleanValue();
                }
            } catch (Exception unused) {
            }
            try {
                String a3 = a("single_task_db_enable_switch", (String) null);
                if (!StringUtils.isEmpty(a3)) {
                    c = Boolean.valueOf(a3).booleanValue();
                }
            } catch (Exception unused2) {
            }
            try {
                String a4 = a("quic_enable_switch", (String) null);
                if (!StringUtils.isEmpty(a4)) {
                    boolean booleanValue = Boolean.valueOf(a4).booleanValue();
                    d = booleanValue;
                    b("quic_enable_switch", booleanValue);
                }
            } catch (Exception unused3) {
            }
            try {
                String a5 = a("quic_cong_control", (String) null);
                if (!StringUtils.isEmpty(a5)) {
                    e = Integer.valueOf(a5).intValue();
                }
            } catch (Exception unused4) {
            }
            try {
                String a6 = a("quic_loss_detect_enable_switch", (String) null);
                if (!StringUtils.isEmpty(a6)) {
                    f = Boolean.valueOf(a6).booleanValue();
                }
            } catch (Exception unused5) {
            }
            try {
                String a7 = a("auth_preset_vip_config", (String) null);
                d(a7);
                b("auth_preset_vip_config", a7);
            } catch (Exception unused6) {
            }
        }
    }

    private static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else if (!StringUtils.isEmpty(str)) {
            try {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                    Collections.shuffle(arrayList);
                    hashMap.put(next, arrayList);
                }
                g = hashMap;
            } catch (Exception unused) {
            }
        }
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (!f24066a) {
            a.a(16, "RemoteConfigTool", "no orange sdk");
            return null;
        }
        try {
            return OrangeConfig.getInstance().getConfig("aus", str, str2);
        } catch (Exception e2) {
            a.a(16, "RemoteConfigTool", "get config failed!", e2);
            return null;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : c;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : d;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue() : e;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : f;
    }

    public static List<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str});
        }
        if (!StringUtils.isEmpty(str)) {
            return g.get(str);
        }
        return null;
    }

    private static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        SharedPreferences sharedPreferences = h;
        return sharedPreferences != null ? sharedPreferences.getBoolean(str, z) : z;
    }

    private static void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{str, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = h;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean(str, z).apply();
    }

    private static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (h == null) {
        } else {
            if (StringUtils.isEmpty(str2)) {
                h.edit().remove(str).apply();
            } else {
                h.edit().putString(str, str2).apply();
            }
        }
    }

    private static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{str, str2});
        }
        SharedPreferences sharedPreferences = h;
        return sharedPreferences != null ? sharedPreferences.getString(str, str2) : str2;
    }
}
