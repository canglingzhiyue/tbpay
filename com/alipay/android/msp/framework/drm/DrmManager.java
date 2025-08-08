package com.alipay.android.msp.framework.drm;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.NumUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.android.ultron.datamodel.imp.DMComponent;

/* loaded from: classes3.dex */
public class DrmManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile DrmManager ge;
    private String gb;
    private final EnvStatus gc;
    private int gd;
    private volatile JSONObject gf = null;
    private JSONObject mMspSwitch;

    public static /* synthetic */ JSONObject access$202(DrmManager drmManager, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f88e4e95", new Object[]{drmManager, jSONObject});
        }
        drmManager.gf = jSONObject;
        return jSONObject;
    }

    private DrmManager(Context context) {
        this.gc = new EnvStatus(context);
        try {
            this.mMspSwitch = JSON.parseObject(PrefUtils.getString("cashier_drm_switch", "msp_switch_content", "{}"));
            this.gb = PrefUtils.getString("cashier_drm_switch", "msp_switch_version", "");
            this.gd = PrefUtils.getInt("cashier_drm_switch", "utdid_factor", -1).intValue();
            ConfigServiceBridge.a(this);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static DrmManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrmManager) ipChange.ipc$dispatch("3e57d1c", new Object[]{context});
        }
        if (ge == null) {
            synchronized (DrmManager.class) {
                if (ge == null) {
                    ge = new DrmManager(context.getApplicationContext());
                }
            }
        }
        return ge;
    }

    public synchronized boolean isDegrade(String str, boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eef9c235", new Object[]{this, str, new Boolean(z), context})).booleanValue();
        }
        return a(str, z, context);
    }

    public synchronized boolean isGray(String str, boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1409f76", new Object[]{this, str, new Boolean(z), context})).booleanValue();
        }
        return a(str, z, context);
    }

    public synchronized void onUpdate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b55528c1", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("msp_switch");
            if (StringUtils.isEmpty(string)) {
                return;
            }
            JSONObject parseObject = JSON.parseObject(string);
            JSONObject jSONObject2 = parseObject.getJSONObject("content");
            String string2 = parseObject.getString(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION);
            if (!StringUtils.isEmpty(string2)) {
                onUpdate(jSONObject2, string2);
            }
        }
    }

    public synchronized void onUpdate(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1994044b", new Object[]{this, jSONObject, str});
            return;
        }
        this.mMspSwitch = jSONObject;
        if (this.mMspSwitch == null) {
            this.mMspSwitch = new JSONObject();
        }
        this.gb = str;
        PrefUtils.putString("cashier_drm_switch", "msp_switch_content", this.mMspSwitch.toString());
        PrefUtils.putString("cashier_drm_switch", "msp_switch_version", str);
        LogUtil.record(1, "Drm", "DrmManager", "onUpdate content" + this.mMspSwitch.toString());
        this.gc.update();
        ConfigServiceBridge.a(this);
    }

    public synchronized String getVersion() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        if (!this.gc.a()) {
            str = StringUtils.isEmpty(this.gb) ? FactoryType.TYPE_INVALID : this.gb;
        } else {
            this.gc.update();
            this.mMspSwitch = new JSONObject();
            this.gb = "";
            PrefUtils.remove("cashier_drm_switch", "msp_switch_content");
            PrefUtils.remove("cashier_drm_switch", "msp_switch_version");
            LogUtil.record(1, "Drm", "DrmManager", DMComponent.RESET);
            str = FactoryType.TYPE_INVALID;
        }
        LogUtil.record(1, "Drm", "DrmManager", "getVersion:".concat(String.valueOf(str)));
        return str;
    }

    private boolean a(String str, boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7967812a", new Object[]{this, str, new Boolean(z), context})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            try {
                String r = r(str);
                if (r != null) {
                    z = procGraySwitchWithRate(context, Integer.parseInt(r.trim()));
                }
            } catch (Throwable th) {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, ErrorCode.DRM_PARSE_EX, "");
                LogUtil.printExceptionStackTrace(th);
            }
            ConfigChangeMonitor.getInstance().hitKey(str, Boolean.valueOf(z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" -> ");
        sb.append(z ? "命中" : "未命中");
        LogUtil.i("DrmManager", "innerIsDegrade", sb.toString());
        return z;
    }

    public JSONObject getDrmValueFromKey(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1fd7de9e", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String r = r(str);
        ConfigChangeMonitor.getInstance().hitKey(str, r);
        try {
            return JSON.parseObject(r);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }

    public String getRawDrmValueFromKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4daa017e", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String r = r(str);
        ConfigChangeMonitor.getInstance().hitKey(str, r);
        return r;
    }

    public boolean procGraySwitchWithRate(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59139019", new Object[]{this, context, new Integer(i)})).booleanValue();
        }
        int i2 = -1;
        if (this.gd == -1) {
            if (GlobalHelper.getInstance().getContext() == null) {
                GlobalHelper.getInstance().init(context);
            }
            String utdid = GlobalHelper.getInstance().getUtdid(context);
            if (!StringUtils.isEmpty(utdid)) {
                String replaceAll = utdid.replaceAll("=", "");
                if (replaceAll.length() >= 5) {
                    replaceAll = replaceAll.substring(0, 5);
                }
                i2 = (int) (NumUtil.c64to10(replaceAll) % 10000);
                if (i2 < 0) {
                    i2 = -i2;
                }
            } else {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, ErrorCode.DRM_CALC_EX, "");
            }
            this.gd = i2;
            PrefUtils.putInt("cashier_drm_switch", "utdid_factor", Integer.valueOf(this.gd));
        }
        return this.gd < i;
    }

    private synchronized String r(String str) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2f0517d", new Object[]{this, str});
        }
        if (this.gf != null) {
            a2 = ConfigServiceBridge.a(str);
            if (a2 == null) {
                a2 = this.gf.getString(str);
                LogUtil.i("DrmManager", "innerGetValueForKey", "from configFirst " + str + "=" + a2);
            }
        } else if (this.mMspSwitch != null && this.mMspSwitch.containsKey(str)) {
            a2 = this.mMspSwitch.getString(str);
            LogUtil.i("DrmManager", "innerGetValueForKey", "from mspSwitch " + str + "=" + a2);
        } else {
            a2 = ConfigServiceBridge.a(str);
        }
        return a2;
    }

    /* loaded from: classes3.dex */
    public static final class ConfigServiceBridge {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private ConfigServiceBridge() {
        }

        public static /* synthetic */ String a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : b(str);
        }

        private static String b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
            }
            if (!StringUtils.isEmpty(str)) {
                return PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_".concat(String.valueOf(str)));
            }
            return null;
        }

        public static /* synthetic */ void a(DrmManager drmManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1881670e", new Object[]{drmManager});
                return;
            }
            String b = b(DrmKey.DEGRADE_DRM_CONFIG_DEGRADE);
            LogUtil.d("DrmManager", "ConfigServiceBridge.syncToDrm", "configFirstStr=".concat(String.valueOf(b)));
            JSONObject jSONObject = null;
            if (b != null) {
                try {
                    jSONObject = JSON.parseObject(b);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace("DrmManager", "ConfigServiceBridge.syncToDrm 解析失败", th);
                }
            }
            if (jSONObject == null || !"true".equals(jSONObject.getString("needDegrade"))) {
                return;
            }
            DrmManager.access$202(drmManager, jSONObject);
        }
    }
}
