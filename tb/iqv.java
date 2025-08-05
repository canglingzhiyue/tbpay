package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import com.taobao.tao.messagekit.core.utils.MsgLog;

/* loaded from: classes8.dex */
public class iqv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile iqv f29238a;
    private SharedPreferences b;
    private final int d = 128;
    private final boolean e = true;
    private final int f = 1;
    private boolean c = false;

    static {
        kge.a(-635599175);
    }

    public static /* synthetic */ SharedPreferences a(iqv iqvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("c4f70a1e", new Object[]{iqvVar}) : iqvVar.b;
    }

    public static iqv a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iqv) ipChange.ipc$dispatch("f061690", new Object[0]);
        }
        if (f29238a == null) {
            synchronized (iqv.class) {
                if (f29238a == null) {
                    f29238a = new iqv();
                }
            }
        }
        return f29238a;
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        this.b = application.getSharedPreferences("powermsg_config", 0);
        this.c = this.b.getBoolean("pm_thread_opt_switch", false);
        OrangeConfig.getInstance().registerListener(new String[]{"powermsg"}, new g() { // from class: tb.iqv.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.g
            public void onConfigUpdate(String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                    return;
                }
                try {
                    String config = OrangeConfig.getInstance().getConfig("powermsg", "pm_thread_opt_switch", null);
                    if (!TextUtils.isEmpty(config)) {
                        iqv.a(iqv.this).edit().putBoolean("pm_thread_opt_switch", Boolean.parseBoolean(config)).apply();
                    } else {
                        iqv.a(iqv.this).edit().remove("pm_thread_opt_switch").apply();
                    }
                } catch (Exception e) {
                    MsgLog.c("CustomRxJavaConfig", "config from orange error: " + e);
                }
            }
        });
        MsgLog.c("CustomRxJavaConfig", "thread opt switch is: " + this.c);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return this.c ? Math.min(availableProcessors, 4) : availableProcessors;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        return 128;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        return 1;
    }
}
