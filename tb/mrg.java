package tb;

import android.text.TextUtils;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class mrg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHECK_FLOAT_PERMISSION = "checkFloatPermission";
    public static final String CHECK_GP_MARKET = "checkGPMarket";
    public static final String GLOBAL_POP_INTERVAL_DAY = "globalPopIntervalDay";
    public static final String NEW_STRATEGY_ENABLE = "isNewUpdateStrategyEnable";
    public static final String NEW_STRATEGY_FORBID_MTL_POP_ENABLE = "isNewUpdateForbidMTLPopEnable";
    public static final String PRE_DOWNLOAD_WINDOW_DAY = "preDownloadWindowDay";
    public static final String UPDATE_DATA_VALID_INTERVAL = "promoteUpdateValidInterval";
    public static final String USE_ARCH = "useArch";
    public static final String USE_MD5 = "downloadUseMD5";
    public static final String WIFI_PRE_DOWNLOAD = "isWifiPreDownloadEnable";

    /* renamed from: a */
    private final AtomicBoolean f31217a = new AtomicBoolean(false);

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final mrg f31218a;

        static {
            kge.a(-1584958838);
            f31218a = new mrg();
        }

        public static /* synthetic */ mrg a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (mrg) ipChange.ipc$dispatch("f07e9fc", new Object[0]) : f31218a;
        }
    }

    static {
        kge.a(445650871);
    }

    /* renamed from: lambda$rcTPTtUJf-tOZWkjGONku1jnoro */
    public static /* synthetic */ void m2469lambda$rcTPTtUJftOZWkjGONku1jnoro(mrg mrgVar, String str, Map map) {
        mrgVar.a(str, map);
    }

    public static mrg a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mrg) ipChange.ipc$dispatch("f07e9fc", new Object[0]) : a.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f31217a.getAndSet(true)) {
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"update_manager"}, new d() { // from class: tb.-$$Lambda$mrg$rcTPTtUJf-tOZWkjGONku1jnoro
                @Override // com.taobao.orange.d
                public final void onConfigUpdate(String str, Map map) {
                    mrg.m2469lambda$rcTPTtUJftOZWkjGONku1jnoro(mrg.this, str, map);
                }
            }, true);
        }
    }

    public /* synthetic */ void a(String str, Map map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        try {
            a(WIFI_PRE_DOWNLOAD, true);
            a(USE_MD5, false);
            a(NEW_STRATEGY_ENABLE, true);
            a(NEW_STRATEGY_FORBID_MTL_POP_ENABLE, true);
            a(GLOBAL_POP_INTERVAL_DAY, 3L);
            a(PRE_DOWNLOAD_WINDOW_DAY, 3L);
            a(USE_ARCH, true);
            a(UPDATE_DATA_VALID_INTERVAL, 86400L);
            a(CHECK_FLOAT_PERMISSION, true);
            a(CHECK_GP_MARKET, true);
            if (map != null && map.containsKey("configVersion")) {
                str2 = (String) map.get("configVersion");
                if (!TextUtils.isEmpty(str2)) {
                    c.b("configUpdate", "", "configGroup=update_managerconfigVersion=" + str2);
                }
            }
            str2 = "";
            c.b("configUpdate", "", "configGroup=update_managerconfigVersion=" + str2);
        } catch (Throwable th) {
            c.a("UpdaterOrangeListener.onConfigUpdate error", th);
        }
    }

    private void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("update_manager", str, "");
            if (!TextUtils.isEmpty(config)) {
                mre.a().a(str, Boolean.parseBoolean(config));
            } else {
                mre.a().a(str, z);
            }
        } catch (Throwable th) {
            c.a("UpdaterOrangeListener.updateBoolean.error.orangeKey=" + str, th);
        }
    }

    private void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("update_manager", str, "");
            if (!TextUtils.isEmpty(config)) {
                mre.a().a(str, Long.parseLong(config));
            } else {
                mre.a().a(str, j);
            }
        } catch (Throwable th) {
            c.a("UpdaterOrangeListener.updateLong.error.orangeKey=" + str, th);
        }
    }
}
