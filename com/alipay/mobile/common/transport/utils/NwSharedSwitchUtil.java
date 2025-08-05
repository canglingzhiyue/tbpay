package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.config.db.NetworkConfigDAO;
import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import org.json.JSONObject;
import tb.riy;

/* loaded from: classes3.dex */
public class NwSharedSwitchUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_NET_SWITCH_ONE = "netsdk_normal_switch";
    public static final String KEY_NET_SWITCH_TWO = "android_network_core";
    public static final String KEY_READ_CONFIG_FROM_DB = "readConfigFromDB";
    public static final String SHARED_FILE = "sdkSharedSwitch.xml";
    public static final String SHARED_FILE_NAME = "sdkSharedSwitch";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5631a = false;
    public static SwitchChangedObserble switchChangedObserble;

    /* loaded from: classes3.dex */
    public static class SwitchChangedObserble extends Observable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(SwitchChangedObserble switchChangedObserble, String str, Object... objArr) {
            if (str.hashCode() == -310743881) {
                super.notifyObservers(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // java.util.Observable
        public void notifyObservers(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed7a6cb7", new Object[]{this, obj});
                return;
            }
            setChanged();
            super.notifyObservers(obj);
        }
    }

    public static /* synthetic */ void access$100(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d320d1cd", new Object[]{map});
        } else {
            a(map);
        }
    }

    public static /* synthetic */ void access$200(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e87ea8d", new Object[]{str, str2});
        } else {
            b(str, str2);
        }
    }

    public static /* synthetic */ SwitchChangedObserble access$300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SwitchChangedObserble) ipChange.ipc$dispatch("9b1a02b", new Object[0]) : a();
    }

    public static final void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            regSwitchChangedListener();
        }
    }

    public static synchronized String getSharedSwitch(Context context, String str) {
        synchronized (NwSharedSwitchUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b06a69c4", new Object[]{context, str});
            }
            String configFromDB = getConfigFromDB(str);
            if (!TextUtils.isEmpty(configFromDB)) {
                return configFromDB;
            }
            return context.getSharedPreferences(SHARED_FILE_NAME, 4).getString(str, null);
        }
    }

    public static void refreshSharedSwitch(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee2394b", new Object[]{context, str, str2, str3});
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(str, 4).edit();
            edit.putString(str2, str3);
            if (edit.commit()) {
                LogCatUtil.info("NwSharedSwitchUtil", "refreshSharedSwitch commit success!");
            } else {
                LogCatUtil.info("NwSharedSwitchUtil", "refreshSharedSwitch commit fail!");
            }
        } catch (Exception e) {
            LogCatUtil.error("NwSharedSwitchUtil", "refreshSharedSwitch, sharedPrefName=[" + str + "], key=[" + str2 + "], value=[" + str3 + riy.ARRAY_END_STR, e);
        }
        NetworkConfigDAO.getInstance().saveOrUpdateConfig(str2, str3);
    }

    public static synchronized Map<String, String> mergeMapsharedSwitch(Context context, String str, String str2, Map<String, String> map) {
        String optString;
        synchronized (NwSharedSwitchUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("198d8aa2", new Object[]{context, str, str2, map});
            }
            String sharedSwitch = getSharedSwitch(context, str, str2);
            if (TextUtils.isEmpty(sharedSwitch)) {
                return map;
            }
            JSONObject jSONObject = new JSONObject(sharedSwitch);
            if (jSONObject.length() <= 0) {
                return map;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && (optString = jSONObject.optString(next)) != null && !map.containsKey(next)) {
                    map.put(next, optString);
                }
            }
            return map;
        }
    }

    public static synchronized String getSharedSwitch(Context context, String str, String str2) {
        synchronized (NwSharedSwitchUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("473b4c3a", new Object[]{context, str, str2});
            }
            String configFromDB = getConfigFromDB(str2);
            if (!TextUtils.isEmpty(configFromDB)) {
                return configFromDB;
            }
            String string = context.getSharedPreferences(str, 4).getString(str2, null);
            if (!TextUtils.isEmpty(string)) {
                LogCatUtil.info("NwSharedSwitchUtil", "getSharedSwitch.  Get config from sp. key:" + str2);
                return string;
            }
            return a(str, str2);
        }
    }

    public static String getConfigFromDB(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91f7682f", new Object[]{str});
        }
        if (!isReadConfigFromDB()) {
            return "";
        }
        String config = NetworkConfigDAO.getInstance().getConfig(str);
        if (MiscUtils.isEmpty(config)) {
            return "";
        }
        LogCatUtil.info("NwSharedSwitchUtil", "getSharedSwitch.  Get config from db. key:" + str);
        return config;
    }

    private static String a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.SWITCH_FROM_ORIGINAL);
            LogCatUtil.debug("NwSharedSwitchUtil", "switch from original value=[" + stringValue + riy.ARRAY_END_STR);
            if (!MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), stringValue)) {
                LogCatUtil.debug("NwSharedSwitchUtil", "switch from original value=[" + stringValue + "],not hit");
                return "";
            } else if (MiscUtils.isOtherProcess(TransportEnvUtil.getContext())) {
                LogCatUtil.debug("NwSharedSwitchUtil", "it's not main process,return");
                return "";
            } else {
                LogCatUtil.debug("NwSharedSwitchUtil", "getSharedSwitch,value is null,try get from original");
                final String switchFromOriginal = ExtTransportOffice.getInstance().getSwitchFromOriginal(str2);
                if (!TextUtils.isEmpty(switchFromOriginal)) {
                    LogCatUtil.debug("NwSharedSwitchUtil", "load config from original");
                    NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            NwSharedSwitchUtil.refreshSharedSwitch(TransportEnvUtil.getContext(), str, str2, switchFromOriginal);
                            NwSharedSwitchUtil.notifySwitchUpdate();
                        }
                    });
                }
                return switchFromOriginal;
            }
        } catch (Throwable th) {
            LogCatUtil.error("NwSharedSwitchUtil", "getSwitchExt exception", th);
            return "";
        }
    }

    public static final void addSwitchChangedListener(Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ff635d3", new Object[]{observer});
        } else {
            a().addObserver(observer);
        }
    }

    private static SwitchChangedObserble a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SwitchChangedObserble) ipChange.ipc$dispatch("3a57b3d9", new Object[0]);
        }
        if (switchChangedObserble == null) {
            switchChangedObserble = new SwitchChangedObserble();
        }
        return switchChangedObserble;
    }

    public static void notifySwitchUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c17c8d", new Object[0]);
        } else {
            a().notifyObservers();
        }
    }

    public static synchronized void removeSwitch(final Context context) {
        synchronized (NwSharedSwitchUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80ea0349", new Object[]{context});
                return;
            }
            try {
                NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        SharedPreferences.Editor edit = context.getSharedPreferences(NwSharedSwitchUtil.SHARED_FILE_NAME, 4).edit();
                        edit.remove(NwSharedSwitchUtil.KEY_NET_SWITCH_ONE);
                        edit.remove(NwSharedSwitchUtil.KEY_NET_SWITCH_TWO);
                        LogCatUtil.info("NwSharedSwitchUtil", edit.commit() ? "removeSwitch commit success!" : "removeSwitch commit fail!");
                        NetworkConfigDAO.getInstance().deleteConfig(NwSharedSwitchUtil.KEY_NET_SWITCH_ONE);
                        NetworkConfigDAO.getInstance().deleteConfig(NwSharedSwitchUtil.KEY_NET_SWITCH_TWO);
                    }
                });
            } catch (Exception e) {
                LogCatUtil.error("NwSharedSwitchUtil", "removeSwitch exception", e);
            }
        }
    }

    public static void regSwitchChangedListener() {
        if (f5631a) {
            return;
        }
        f5631a = true;
        try {
            Class<?> cls = Class.forName("com.alipay.mobile.common.utils.SharedSwitchUtil", true, NwSharedSwitchUtil.class.getClassLoader());
            cls.getMethod("addSwitchChangedListener", Observer.class).invoke(cls, new ProxySharedSwitchChangedListener());
            LogCatUtil.info("NwSharedSwitchUtil", "regSwitchChangedListener success.");
        } catch (Throwable th) {
            LogCatUtil.warn("NwSharedSwitchUtil", "regSwitchChangedListener fail, exception = " + th.toString());
        }
    }

    /* loaded from: classes3.dex */
    public static class ProxySharedSwitchChangedListener implements Observer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private ProxySharedSwitchChangedListener() {
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
            } else if (obj == null || !(obj instanceof Map)) {
                LogCatUtil.error("NwSharedSwitchUtil", "data is null or not a map type");
            } else {
                Map map = (Map) obj;
                String str = (String) map.get(NwSharedSwitchUtil.KEY_NET_SWITCH_ONE);
                String str2 = (String) map.get(NwSharedSwitchUtil.KEY_NET_SWITCH_TWO);
                JSONObject convertJSONObject = JSONUtil.convertJSONObject(str2);
                JSONObject convertJSONObject2 = JSONUtil.convertJSONObject(str);
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                SwitchMonitorLogUtil.putSwitchId(convertJSONObject, linkedHashMap, TransportConfigureItem.SWITCH_TAG_LOG1.getConfigName());
                SwitchMonitorLogUtil.putSwitchId(convertJSONObject2, linkedHashMap, TransportConfigureItem.SWITCH_TAG_LOG2.getConfigName());
                NwSharedSwitchUtil.access$100(linkedHashMap);
                NwSharedSwitchUtil.access$200(str, str2);
                NwSharedSwitchUtil.processSwitchOfSwitch(convertJSONObject2);
                NwSharedSwitchUtil.access$300().notifyObservers(map);
            }
        }
    }

    public static final boolean isReadConfigFromDB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28ebbd15", new Object[0])).booleanValue();
        }
        boolean z = true;
        String config = NetworkConfigDAO.getInstance().getConfig(KEY_READ_CONFIG_FROM_DB);
        if (MiscUtils.isEmpty(config)) {
            return true;
        }
        try {
            z = Boolean.parseBoolean(config);
            LogCatUtil.info("NwSharedSwitchUtil", "isReadConfigFromDB.  Get config result is " + z);
            return z;
        } catch (Throwable th) {
            NumberFormatException numberFormatException = new NumberFormatException("parseBoolean error. value:" + config);
            numberFormatException.initCause(th);
            MonitorErrorLogHelper.log("NwSharedSwitchUtil", numberFormatException);
            return z;
        }
    }

    public static final void putSwitchSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69bc392", new Object[]{str});
        } else {
            NetworkConfigDAO.getInstance().saveOrUpdateConfig("keySwitchSrc", str);
        }
    }

    public static final String getSwitchSrc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e72b67df", new Object[0]);
        }
        try {
            String config = NetworkConfigDAO.getInstance().getConfig("keySwitchSrc");
            return !MiscUtils.isEmpty(config) ? config : "unknow";
        } catch (Throwable th) {
            LogCatUtil.error("NwSharedSwitchUtil", "getSwitchSrc error", th);
            return "unknow";
        }
    }

    public static final void setReadConfigFromDBIfNoExist() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c3fc3e", new Object[0]);
        } else if (!MiscUtils.isEmpty(NetworkConfigDAO.getInstance().getConfig(KEY_READ_CONFIG_FROM_DB))) {
        } else {
            NetworkConfigDAO.getInstance().saveOrUpdateConfig(KEY_READ_CONFIG_FROM_DB, "true");
            LogCatUtil.info("NwSharedSwitchUtil", "Enter setReadConfigFromDB()");
        }
    }

    private static final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        if (!MiscUtils.isEmpty(str)) {
            NetworkConfigDAO.getInstance().saveOrUpdateConfig(KEY_NET_SWITCH_ONE, str);
            z = true;
        }
        if (!MiscUtils.isEmpty(str2)) {
            NetworkConfigDAO.getInstance().saveOrUpdateConfig(KEY_NET_SWITCH_TWO, str2);
            z = true;
        }
        if (!z) {
            return;
        }
        putSwitchSrc("rpc");
    }

    private static final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else if (map.isEmpty()) {
        } else {
            SwitchMonitorLogUtil.monitorLog(TransportEnvUtil.getContext(), SwitchMonitorLogUtil.SUB_TYPE_RECV, map, "rpc");
        }
    }

    public static void processSwitchOfSwitch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0cabbc9", new Object[]{jSONObject});
        } else if (jSONObject == null) {
        } else {
            processSwitchOfSwitch(jSONObject.optString(TransportConfigureItem.DB_STORAGE_SWITCH.getConfigName()));
        }
    }

    public static void processSwitchOfSwitch(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5711d39f", new Object[]{str});
        } else if (MiscUtils.isEmpty(str)) {
        } else {
            if (!TextUtils.equals(str, "-1")) {
                z = MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), str);
            }
            NetworkConfigDAO.getInstance().saveOrUpdateConfig(KEY_READ_CONFIG_FROM_DB, String.valueOf(z));
            LogCatUtil.info("NwSharedSwitchUtil", "processSwitchOfSwitch. grayscaleUtdid readConfigFromDB:" + z);
        }
    }
}
