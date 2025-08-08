package mtopsdk.ssrcore.util;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.ConfigStoreManager;
import mtopsdk.common.util.HttpHeaderConstant;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f25041a = new ConcurrentHashMap<>();

    public static void a(Context context, HashMap<String, String> hashMap) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9591153", new Object[]{context, hashMap});
        } else if (context != null && hashMap != null && !hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                String str2 = hashMap.get(str);
                if (!StringUtils.isEmpty(str2)) {
                    for (String str3 : str2.split(",")) {
                        if (StringUtils.isEmpty(a(context, str3))) {
                            a(context, str3, str);
                        }
                    }
                }
            }
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String unitByHost = StrategyCenter.getInstance().getUnitByHost(str);
        return StringUtils.isEmpty(unitByHost) ? "" : unitByHost;
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        String str2 = f25041a.get(str);
        if (StringUtils.isEmpty(str2)) {
            str2 = ConfigStoreManager.getInstance().getConfigItem(context, ConfigStoreManager.SSR_CONFIG_STORE, "SSR_STORE_", str);
            if (!StringUtils.isEmpty(str2)) {
                f25041a.put(str, str2);
            }
        }
        return str2;
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        String str3 = f25041a.get(str);
        if (StringUtils.isEmpty(str2) || StringUtils.equals(str3, str2)) {
            return;
        }
        f25041a.put(str, str2);
        ConfigStoreManager.getInstance().saveConfigItem(context, ConfigStoreManager.SSR_CONFIG_STORE, "SSR_STORE_", str, str2);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        String str2 = "";
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
        if (connStrategyListByHost != null && !connStrategyListByHost.isEmpty()) {
            for (IConnStrategy iConnStrategy : connStrategyListByHost) {
                if (iConnStrategy != null) {
                    String ip = iConnStrategy.getIp();
                    if (!StringUtils.isEmpty(ip)) {
                        str2 = !StringUtils.isEmpty(str2) ? str2 + "," + ip : ip;
                    }
                }
            }
        }
        return str2;
    }

    public static String a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bffaf7b5", new Object[]{hashMap});
        }
        if (hashMap == null) {
            return "";
        }
        if (!hashMap.isEmpty()) {
            try {
            } catch (Throwable unused) {
                return "";
            }
        }
        return mtopsdk.security.util.b.b("tbssr_s9rs1g1x$" + hashMap.get(HttpHeaderConstant.X_APPKEY) + "$" + hashMap.get(HttpHeaderConstant.X_APP_VER) + "$" + hashMap.get(HttpHeaderConstant.X_UTDID) + "$" + hashMap.get(HttpHeaderConstant.X_T) + "$" + hashMap.get(HttpHeaderConstant.X_SERVICE_DOMAIN) + "$" + hashMap.get(HttpHeaderConstant.X_SERVICE_UNIT) + "$" + hashMap.get(HttpHeaderConstant.X_SERVICE_IPS));
    }
}
