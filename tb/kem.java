package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.linked.d;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import com.taobao.tao.shop.common.ShopConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class kem {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BACK_GROUND_START_TIME = "backgroundStartTime";
    public static final String BACK_GROUND_WAIT_SECONDS = "backgroundWaitSeconds";
    public static final String TAG = "bootimage.default";

    /* renamed from: a  reason: collision with root package name */
    private static kem f30009a;
    private volatile Map<String, String> b;

    public static /* synthetic */ Map a(kem kemVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a6ec1375", new Object[]{kemVar, map});
        }
        kemVar.b = map;
        return map;
    }

    static {
        kge.a(1349786828);
        f30009a = new kem();
    }

    public static kem a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kem) ipChange.ipc$dispatch("f06d12b", new Object[0]) : f30009a;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : Boolean.valueOf(a(str, Boolean.TRUE.toString())).booleanValue();
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        int i = 3;
        try {
            int parseInt = Integer.parseInt(a("waitTimeOffsetSeconds", Integer.toString(3)));
            if (parseInt > 0) {
                i = parseInt;
            }
            return i;
        } catch (Exception e) {
            kej.a(TAG, "getWaitTimeOffsetMs orange config error.", e);
            return 3;
        }
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
        }
        int i = kel.a().getInt(BACK_GROUND_WAIT_SECONDS, -1);
        kej.a(TAG, "getBackgroundWaitMs waitMs " + i);
        if (i > 0) {
            return i * 1000;
        }
        try {
            long parseInt = Integer.parseInt(a(BACK_GROUND_WAIT_SECONDS, Integer.toString(5)));
            if (parseInt <= 0) {
                parseInt = 5;
            }
            return parseInt * 1000;
        } catch (Exception e) {
            kej.a(TAG, "getBackgroundWaitSeconds orange config error.", e);
            return 5000;
        }
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64076832", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            int b = dVar.b();
            SharedPreferences a2 = kel.a();
            if (a2 == null) {
                kej.a(TAG, "updateBackgroundWaitMs sp null");
            } else if (b <= 0) {
                a2.edit().remove(BACK_GROUND_WAIT_SECONDS).apply();
                kej.a(TAG, "updateBackgroundWaitMs waitMS null remove:" + b);
            } else {
                try {
                    a2.edit().putInt(BACK_GROUND_WAIT_SECONDS, b).apply();
                } catch (Exception e) {
                    kej.a(TAG, "updateBackgroundWaitMs  error.", e);
                }
            }
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        SharedPreferences a2 = kel.a();
        if (a2 == null) {
            kej.a(TAG, "recordHotStartTime sp null");
        } else {
            a2.edit().putLong(BACK_GROUND_START_TIME, System.currentTimeMillis()).apply();
        }
    }

    public long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee7", new Object[]{this})).longValue();
        }
        SharedPreferences a2 = kel.a();
        if (a2 == null) {
            kej.a(TAG, "recordHotStartTime sp null");
            return -1L;
        }
        return a2.getLong(BACK_GROUND_START_TIME, -1L);
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        try {
            int parseInt = Integer.parseInt(a("brandHubTimeout", Integer.toString(1000)));
            if (parseInt > 0) {
                return parseInt;
            }
            return 1000;
        } catch (Exception e) {
            kej.a(TAG, "getLoadTimeout orange config error.", e);
            return 1000;
        }
    }

    public long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue();
        }
        int i = 5;
        try {
            int parseInt = Integer.parseInt(a("loadTimeoutSeconds", Integer.toString(5)));
            if (parseInt > 0) {
                i = parseInt;
            }
            return i * 1000;
        } catch (Exception e) {
            kej.a(TAG, "getLoadTimeout orange config error.", e);
            return 5 * 1000;
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        try {
            int parseInt = Integer.parseInt(a("periodSeconds", Integer.toString(ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)));
            return parseInt <= 0 ? ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT : parseInt;
        } catch (Exception e) {
            kej.a(TAG, "getPeriodSeconds orange config error.", e);
            return ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
        }
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue();
        }
        try {
            return Integer.parseInt(a("fetchServerConfigPeriodSeconds", Integer.toString(600))) * 1000;
        } catch (Exception e) {
            kej.a(TAG, "getLoadTimeout orange config error.", e);
            return 600 * 1000;
        }
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (this.b == null) {
            j();
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs("android_bootimage_client");
        if (configs == null || configs.size() == 0) {
            configs = null;
        }
        if (configs == null) {
            if (this.b == null) {
                kej.a(TAG, "get config faield, need init configs.");
                return str2;
            }
            configs = this.b;
        }
        String str3 = configs.get(str);
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : "true".equalsIgnoreCase(a("useArtisan", "true"));
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : "true".equalsIgnoreCase(a("splashHomeLinkage", "true"));
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        synchronized (f30009a) {
            if (this.b != null) {
                return;
            }
            this.b = new HashMap();
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("android_bootimage_client");
            if (configs == null || configs.size() == 0) {
                configs = null;
            }
            if (configs == null) {
                configs = BootImageDataMgr.a().i();
            }
            if (configs != null) {
                this.b = configs;
            }
            OrangeConfig.getInstance().registerListener(new String[]{"android_bootimage_client"}, new g() { // from class: tb.kem.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.g
                public void onConfigUpdate(String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                    } else if (z) {
                    } else {
                        try {
                            Map<String, String> configs2 = OrangeConfig.getInstance().getConfigs("android_bootimage_client");
                            if (configs2 == null || configs2.size() == 0) {
                                configs2 = null;
                            }
                            if (configs2 != null && configs2.size() != 0) {
                                BootImageDataMgr.a().a(configs2);
                                kem.a(kem.this, configs2);
                            }
                        } catch (Exception e) {
                            kej.a(kem.TAG, "update config error.\n", e);
                        }
                    }
                }
            });
        }
    }
}
