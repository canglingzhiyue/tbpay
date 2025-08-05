package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class mti {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile mti b;
    private static boolean c;
    private static Context d;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f31242a = new HashMap();
    private AtomicBoolean e = new AtomicBoolean(false);

    public static /* synthetic */ Map a(mti mtiVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("121b20c4", new Object[]{mtiVar, map});
        }
        mtiVar.f31242a = map;
        return map;
    }

    public static /* synthetic */ Context c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c833dc62", new Object[0]) : d;
    }

    static {
        try {
            Class.forName("com.taobao.orange.OrangeConfig");
            c = true;
        } catch (Exception unused) {
            c = false;
        }
    }

    public static mti a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mti) ipChange.ipc$dispatch("f07f1bc", new Object[0]);
        }
        if (b == null) {
            synchronized (mti.class) {
                if (b == null) {
                    b = new mti();
                }
            }
        }
        return b;
    }

    private mti() {
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!this.e.compareAndSet(false, true)) {
        } else {
            d = context;
            if (context == null) {
                d = b();
            }
            if (!c || d == null) {
                return;
            }
            OrangeConfig.getInstance().registerListener(new String[]{"mtop_ssr_adapter"}, new d() { // from class: tb.mti.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
                    String str2 = "SsrOrange === registerListener === nameSpace为：" + str + " === 获取到的configs: " + configs;
                    mti.a(mti.this, configs);
                    mtl.a(mti.c()).a("mtop_ssr_adapter", configs);
                }
            }, false);
            OrangeConfig.getInstance().getConfigs("mtop_ssr_adapter");
        }
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (!c) {
            return "";
        }
        Map<String, String> map = this.f31242a;
        if (map == null || map.size() == 0) {
            this.f31242a = mtl.a(d).a("mtop_ssr_adapter");
        }
        Map<String, String> map2 = this.f31242a;
        if (map2 == null || map2.size() == 0) {
            return str2;
        }
        String str3 = this.f31242a.get(str);
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public static Context b() {
        Context context = d;
        if (context != null) {
            return context;
        }
        synchronized (mti.class) {
            if (d != null) {
                return d;
            }
            try {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
                d = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return d;
        }
    }
}
