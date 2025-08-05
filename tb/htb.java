package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.alibaba.android.patronus.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes6.dex */
public class htb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f28770a = false;

    public static /* synthetic */ void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else {
            b(application);
        }
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else if (!a()) {
        } else {
            c(application);
            if ("true".equals(kgo.a(application, "MemKeeper", 0).getString("runAfterOrange", "false"))) {
                return;
            }
            b(application);
        }
    }

    private static void b(Application application) {
        String string;
        String str = "0.7";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{application});
        } else if (f28770a) {
        } else {
            f28770a = true;
            SharedPreferences a2 = kgo.a(application, "MemKeeper", 0);
            try {
                String string2 = a2.getString("NEED_MEM_KEEP", "true");
                int i = 26;
                String string3 = a2.getString("MIN_SDK", String.valueOf(26));
                int i2 = 30;
                String string4 = a2.getString("MAX_SDK", String.valueOf(30));
                String string5 = a2.getString("periodOfShrink", str);
                boolean equals = "true".equals(string2);
                float f = 0.7f;
                if (string3 == null) {
                    string3 = AgooConstants.REPORT_DUPLICATE_FAIL;
                }
                try {
                    i = Integer.parseInt(string3);
                    if (string4 == null) {
                        string4 = "31";
                    }
                    i2 = Integer.parseInt(string4);
                    if (string5 != null) {
                        str = string5;
                    }
                    f = Float.parseFloat(str);
                } catch (Exception unused) {
                    Log.e("MemKeeper", "exception");
                }
                if (equals && Build.VERSION.SDK_INT >= i && Build.VERSION.SDK_INT <= i2) {
                    b.a aVar = new b.a();
                    if (f > 0.5f && f <= 1.0f) {
                        try {
                            aVar.c = f;
                        } catch (Exception unused2) {
                            Log.e("MemKeeper", "exception");
                        }
                    }
                    if (com.alibaba.android.patronus.b.a(application, aVar) != 0 || (string = a2.getString("SHRINK_SIZE", String.valueOf(524288))) == null) {
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(string);
                        if (parseInt < 524288) {
                            parseInt = 524288;
                        }
                        com.alibaba.android.patronus.b.a(parseInt);
                    } catch (Exception unused3) {
                        Log.e("MemKeeper", "exception");
                    }
                }
            } catch (Exception e) {
                Log.e("MemKeeper", e.toString());
            }
        }
    }

    private static void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771ec6b5", new Object[]{application});
            return;
        }
        OrangeConfig.getInstance().getConfigs("MemKeeper");
        OrangeConfig.getInstance().registerListener(new String[]{"MemKeeper"}, new b(application), true);
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 23 && Build.VERSION.SDK_INT <= 31 && !Process.is64Bit();
    }

    /* loaded from: classes6.dex */
    public static class b implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Application f28771a;

        public b(Application application) {
            this.f28771a = application;
        }

        @Override // com.taobao.orange.d
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("MemKeeper");
            if (configs == null || configs.size() <= 0) {
                return;
            }
            a(configs);
        }

        private void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            SharedPreferences.Editor edit = kgo.a(this.f28771a, "MemKeeper", 0).edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    edit.putString(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    Log.e("MemKeeper", e.toString());
                }
            }
            edit.commit();
            htb.a(this.f28771a);
        }
    }
}
