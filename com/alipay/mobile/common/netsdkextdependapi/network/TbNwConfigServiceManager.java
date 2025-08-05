package com.alipay.mobile.common.netsdkextdependapi.network;

import android.content.Context;
import com.alipay.mobile.common.netsdkextdependapi.configservice.NwConfigServiceAdapter;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TbNwConfigServiceManager extends NwConfigServiceAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f5491a = new HashMap();

    public TbNwConfigServiceManager(Context context) {
        a(context);
        b(context);
        a();
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.configservice.NwConfigServiceAdapter, com.alipay.mobile.common.netsdkextdependapi.configservice.NwConfigService
    public String getConfig(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d74258f7", new Object[]{this, str}) : this.f5491a.get(str);
    }

    private void a(Context context) {
        try {
            Class<?> cls = Class.forName("com.alipay.android.msp.framework.helper.GlobalHelper");
            Method declaredMethod = cls.getDeclaredMethod("getInstance", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(cls, new Object[0]);
            Method declaredMethod2 = cls.getDeclaredMethod("init", Context.class);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(invoke, context);
            LogCatUtil.info("TbNwConfigServiceManager", "initDrm ok");
        } catch (Throwable th) {
            LogCatUtil.error("TbNwConfigServiceManager", "initDrm ex:" + th);
        }
    }

    private void b(Context context) {
        try {
            Class<?> cls = Class.forName("com.alipay.android.msp.framework.assist.MspWalletImpl");
            Object invoke = Class.forName("com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine").getDeclaredMethod("getMspWallet", new Class[0]).invoke(null, new Object[0]);
            if (cls.isInstance(invoke)) {
                Method declaredMethod = cls.getDeclaredMethod("initConfigManger", Context.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(invoke, context);
                LogCatUtil.info("TbNwConfigServiceManager", "initConfigModule ok");
                return;
            }
            LogCatUtil.error("TbNwConfigServiceManager", "initConfigModule fail");
        } catch (Throwable th) {
            LogCatUtil.warn("TbNwConfigServiceManager", "initConfigModule, ex" + th.toString());
        }
    }

    private void a() {
        Class<?> cls;
        Object invoke;
        String str = null;
        try {
            cls = Class.forName("com.alipay.android.msp.framework.assist.MspWalletImpl");
            invoke = Class.forName("com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine").getDeclaredMethod("getMspWallet", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            LogCatUtil.error("TbNwConfigServiceManager", "saveConfig v1, ex" + th.toString());
        }
        if (cls.isInstance(invoke)) {
            Method declaredMethod = cls.getDeclaredMethod("getWalletConfig", String.class);
            declaredMethod.setAccessible(true);
            str = (String) declaredMethod.invoke(invoke, "ant_network_core");
            if (str == null || str.isEmpty()) {
                LogCatUtil.error("TbNwConfigServiceManager", "saveConfig, value empty");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                for (int i = 0; i < jSONObject.names().length(); i++) {
                    String string = jSONObject.names().getString(i);
                    this.f5491a.put(string, jSONObject.optString(string));
                }
                LogCatUtil.info("TbNwConfigServiceManager", "saveConfig ok, map:" + this.f5491a.toString());
                return;
            } catch (Throwable th2) {
                LogCatUtil.warn("TbNwConfigServiceManager", "saveConfig v2 , ex" + th2.toString());
                return;
            }
        }
        LogCatUtil.error("TbNwConfigServiceManager", "saveConfig fail");
    }
}
