package com.tmall.android.dai.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.walle.bridge.CppApiBridge;
import tb.kge;

/* loaded from: classes9.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_THREAD_POOL_COUNT = "thread_count";
    public static final String DAI_ORANGE_SWITCH = "daiOrangeSwitch";
    public static final int THREAD_COUNT_MAX = 5;
    public static final int THREAD_COUNT_MIN = 1;

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f23688a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean i = false;
    private boolean e = true;
    private int f = 2;
    private volatile boolean g = false;
    private boolean h = false;

    static {
        kge.a(1097525304);
    }

    public static /* synthetic */ void a(d dVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc963ec0", new Object[]{dVar, context});
        } else {
            dVar.c(context);
        }
    }

    private d() {
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("706de508", new Object[0]);
        }
        if (f23688a == null) {
            synchronized (d.class) {
                if (f23688a == null) {
                    f23688a = new d();
                }
            }
        }
        return f23688a;
    }

    public void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.g) {
        } else {
            try {
                OrangeConfig.getInstance().registerListener(new String[]{"EdgeComputingIsEnabled"}, new com.taobao.orange.f() { // from class: com.tmall.android.dai.internal.config.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.orange.f
                    public void onConfigUpdate(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d0b193b", new Object[]{this, str});
                        } else {
                            d.a(d.this, context);
                        }
                    }
                });
                b(context);
                this.g = true;
            } catch (Throwable unused) {
            }
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.h;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(DAI_ORANGE_SWITCH, 0);
        this.c = sharedPreferences.getBoolean("isEnabled", true);
        this.i = sharedPreferences.getBoolean("lowDeviceDowngradeAll", false);
        this.e = sharedPreferences.getBoolean("initRefactorRollback", true);
        this.f = sharedPreferences.getInt(CONFIG_THREAD_POOL_COUNT, 2);
        this.b = sharedPreferences.getBoolean("enableRuntime32", true);
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        this.c = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "isEnabled", "true"));
        this.i = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "lowDeviceDowngradeAll", "false"));
        this.e = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "initRefactorRollback", "true"));
        this.f = Integer.parseInt(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", CONFIG_THREAD_POOL_COUNT, "2"));
        this.b = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "enableRuntime32", "true"));
        this.h = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "isStreamProcessingEnabled", "false"));
        this.d = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "configManagerDegrade", "false"));
        SharedPreferences.Editor edit = context.getSharedPreferences(DAI_ORANGE_SWITCH, 0).edit();
        edit.putBoolean("isEnabled", this.c);
        edit.putBoolean("lowDeviceDowngradeAll", this.i);
        edit.putBoolean("initRefactorRollback", this.e);
        edit.putInt(CONFIG_THREAD_POOL_COUNT, this.f);
        edit.putBoolean("enableRuntime32", this.b);
        edit.putBoolean("isStreamProcessingEnabled", this.h);
        edit.putBoolean("configManagerDegrade", this.h);
        edit.apply();
        if (!this.d) {
            return;
        }
        CppApiBridge.a().a("onConfigDegrade", null);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.c;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : l() && this.i;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        int i = this.f;
        if (i <= 0) {
            return 1;
        }
        if (i <= 5) {
            return i;
        }
        return 5;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        if (j()) {
            return 0;
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "highCount", "2"));
        } catch (Throwable unused) {
            return 1;
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        if (j()) {
            return 0;
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "lowCount", "1"));
        } catch (Throwable unused) {
            return 1;
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.b;
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        String a2 = com.tmall.android.dai.internal.util.c.a();
        return !StringUtils.isEmpty(a2) && "low".equalsIgnoreCase(a2);
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        if (!l()) {
            return false;
        }
        String config = OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "lowDeviceClosed", "true");
        if (StringUtils.isEmpty(config)) {
            return false;
        }
        try {
            if (!Boolean.valueOf(config).booleanValue()) {
                if (!k()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            com.taobao.mrt.utils.a.b("OrangeSwitchManager", "parse lowDeviceClosed config failed", th);
            return false;
        }
    }
}
