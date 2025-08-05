package com.alipay.mobile.common.utils.config.fmk;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.apache.http.ParseException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ConfigureOperationImpl implements ConfigureOperation {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f5708a = Collections.emptyMap();

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public int getIntValue(ConfigureItem configureItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac12b7e8", new Object[]{this, configureItem})).intValue() : getIntValue(configureItem, configureItem.getIntValue());
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public int getIntValue(ConfigureItem configureItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d644b9a1", new Object[]{this, configureItem, new Integer(i)})).intValue();
        }
        String str = this.f5708a.get(configureItem.getConfigName());
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public long getLongValue(ConfigureItem configureItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d30fabe2", new Object[]{this, configureItem})).longValue() : getLongValue(configureItem, configureItem.getLongValue());
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public long getLongValue(ConfigureItem configureItem, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ee6488a", new Object[]{this, configureItem, new Long(j)})).longValue();
        }
        String str = this.f5708a.get(configureItem.getConfigName());
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public double getDoubleValue(ConfigureItem configureItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d7405271", new Object[]{this, configureItem})).doubleValue() : getDoubleValue(configureItem, configureItem.getDoubleValue());
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public double getDoubleValue(ConfigureItem configureItem, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10ca5e09", new Object[]{this, configureItem, new Double(d)})).doubleValue();
        }
        String str = this.f5708a.get(configureItem.getConfigName());
        if (TextUtils.isEmpty(str)) {
            return d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public String getStringValue(ConfigureItem configureItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59f5cc3d", new Object[]{this, configureItem}) : getStringValue(configureItem, configureItem.getStringValue());
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public List<String> getStringValueList(ConfigureItem configureItem, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("84abc818", new Object[]{this, configureItem, str}) : getStringValueList(configureItem, configureItem.getStringValue(), str);
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public List<String> getStringValueList(ConfigureItem configureItem, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f14f1ece", new Object[]{this, configureItem, str, str2});
        }
        String stringValue = getStringValue(configureItem, str);
        if (TextUtils.isEmpty(stringValue)) {
            return Collections.emptyList();
        }
        return a(stringValue, str2);
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public String getStringValue(ConfigureItem configureItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32fa6273", new Object[]{this, configureItem, str});
        }
        String str2 = this.f5708a.get(configureItem.getConfigName());
        return !TextUtils.isEmpty(str2) ? str2 : str;
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public boolean updateFromMapAndSave(Context context, Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1a84c7", new Object[]{this, context, map, str, str2})).booleanValue();
        }
        if (map != null) {
            try {
                if (map.isEmpty() || !a(map)) {
                    return false;
                }
                NwSharedSwitchUtil.refreshSharedSwitch(context, str, str2, new JSONObject(this.f5708a).toString());
                return true;
            } catch (Exception e) {
                LogCatUtil.error("Conf_ConfigureOperation", e);
            }
        }
        return false;
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public boolean partialUpdateFromMapAndSave(Context context, Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4937cde8", new Object[]{this, context, map, str, str2})).booleanValue();
        }
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    String sharedSwitch = NwSharedSwitchUtil.getSharedSwitch(context, str, str2);
                    LogCatUtil.verbose("Conf_ConfigureOperation", "Before PartialUpdate:" + sharedSwitch);
                    Map<String, String> hashMap = new HashMap<>();
                    if (!TextUtils.isEmpty(sharedSwitch)) {
                        hashMap = parseObject(sharedSwitch);
                    }
                    hashMap.putAll(map);
                    if (!a(hashMap) || this.f5708a.isEmpty()) {
                        return false;
                    }
                    String jSONObject = new JSONObject(hashMap).toString();
                    LogCatUtil.verbose("Conf_ConfigureOperation", "After Partial Merge:" + jSONObject);
                    NwSharedSwitchUtil.refreshSharedSwitch(context, str, str2, jSONObject);
                    return true;
                }
            } catch (Exception e) {
                LogCatUtil.error("Conf_ConfigureOperation", e);
            }
        }
        return false;
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public boolean updateFromJsonStrAndSave(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48094505", new Object[]{this, context, str, str2, str3})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                LogCatUtil.warn("Conf_ConfigureOperation", "json value is empty!!");
                return false;
            }
            Map<String, String> mergeMapsharedSwitch = NwSharedSwitchUtil.mergeMapsharedSwitch(context, str2, str3, parseObject(str));
            if (!a(mergeMapsharedSwitch) || this.f5708a.isEmpty()) {
                return false;
            }
            NwSharedSwitchUtil.refreshSharedSwitch(context, str2, str3, new JSONObject(mergeMapsharedSwitch).toString());
            return true;
        } catch (Throwable th) {
            LogCatUtil.error("Conf_ConfigureOperation", th);
            return false;
        }
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public boolean updateFromSharedPref(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbdf607e", new Object[]{this, context, str, str2})).booleanValue();
        }
        try {
            String sharedSwitch = NwSharedSwitchUtil.getSharedSwitch(context, str, str2);
            if (TextUtils.isEmpty(sharedSwitch)) {
                LogCatUtil.info("Conf_ConfigureOperation", "No config at sharedPref. sharedPrefName=[" + str + "] sharedPerf=[" + str2 + "] !");
                return false;
            }
            return a(parseObject(sharedSwitch));
        } catch (Exception e) {
            LogCatUtil.error("Conf_ConfigureOperation", e);
            return false;
        }
    }

    private boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue() : mergeConfig(map);
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public boolean isLoadedConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6488ddfc", new Object[]{this})).booleanValue() : !this.f5708a.isEmpty();
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public boolean equalsString(ConfigureItem configureItem, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aefd130b", new Object[]{this, configureItem, str})).booleanValue() : TextUtils.equals(getStringValue(configureItem), str);
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public boolean equalsLong(ConfigureItem configureItem, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43af50d6", new Object[]{this, configureItem, new Long(j)})).booleanValue() : getLongValue(configureItem) == j;
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public boolean equalsInt(ConfigureItem configureItem, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("731ea72a", new Object[]{this, configureItem, new Integer(i)})).booleanValue() : getIntValue(configureItem) == i;
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public void setValue(ConfigureItem configureItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a85eba8", new Object[]{this, configureItem, str});
            return;
        }
        configureItem.setValue(str);
        if (this.f5708a == Collections.emptyMap()) {
            this.f5708a = new HashMap();
        }
        this.f5708a.remove(configureItem.getConfigName());
        this.f5708a.put(configureItem.getConfigName(), str);
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public boolean mergeConfig(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e82e2448", new Object[]{this, map})).booleanValue();
        }
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    if (this.f5708a == Collections.emptyMap()) {
                        this.f5708a = new HashMap(2);
                    }
                    this.f5708a.putAll(map);
                    return true;
                }
            } catch (Throwable th) {
                LogCatUtil.error("Conf_ConfigureOperation", "update. Parse spdy config exception.  pTmpMap=" + map, th);
                this.f5708a = Collections.emptyMap();
                return false;
            }
        }
        LogCatUtil.info("Conf_ConfigureOperation", "configMap is empty!");
        return false;
    }

    @Override // com.alipay.mobile.common.utils.config.fmk.ConfigureOperation
    public void clearConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3936cf6", new Object[]{this});
            return;
        }
        try {
            this.f5708a.clear();
        } catch (Throwable th) {
            LogCatUtil.warn("Conf_ConfigureOperation", "mConfigMap.clear() exception : " + th.toString());
        }
    }

    private List<String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c4a1d4b", new Object[]{this, str, str2});
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
                while (stringTokenizer.hasMoreElements()) {
                    arrayList.add(String.valueOf(stringTokenizer.nextElement()));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            LogCatUtil.warn("Conf_ConfigureOperation", "string2List exception : " + th.toString());
            return Collections.emptyList();
        }
    }

    public Map<String, String> parseObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df5091d8", new Object[]{this, str});
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap hashMap = new HashMap(jSONObject.length());
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        } catch (Throwable th) {
            ParseException parseException = new ParseException(str);
            parseException.initCause(th);
            throw parseException;
        }
    }

    public String getStringValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f60d845", new Object[]{this, str});
        }
        String str2 = this.f5708a.get(str);
        return !TextUtils.isEmpty(str2) ? str2 : "";
    }

    public Map<String, String> getAllConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("302012c9", new Object[]{this}) : Collections.unmodifiableMap(this.f5708a);
    }
}
