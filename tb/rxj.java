package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SDKUtils;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.security.util.c;

/* loaded from: classes.dex */
public class rxj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static rxj f33404a;

    public static rxj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rxj) ipChange.ipc$dispatch("f0a46ba", new Object[0]);
        }
        if (f33404a == null) {
            synchronized (rxj.class) {
                if (f33404a == null) {
                    f33404a = new rxj();
                }
            }
        }
        return f33404a;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "updateIndividualApiLockIntervalMap called");
        }
        Map<String, String> individualApiLockIntervalMap = SwitchConfig.getInstance().getIndividualApiLockIntervalMap();
        if (!individualApiLockIntervalMap.isEmpty()) {
            individualApiLockIntervalMap.clear();
        }
        if (StringUtils.isBlank(RemoteConfig.getInstance().individualApiLockInterval)) {
            return;
        }
        try {
            Map map = (Map) JSON.parseObject(RemoteConfig.getInstance().individualApiLockInterval, new TypeReference<Map<String, String>>() { // from class: tb.rxj.1
            }, new Feature[0]);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (StringUtils.isNotBlank((String) entry.getKey())) {
                        individualApiLockIntervalMap.put(((String) entry.getKey()).toLowerCase(Locale.US), entry.getValue());
                    }
                }
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateIndividualApiLockIntervalMap] deSerialize intervalStr error.---" + th.toString());
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateIndividualApiLockIntervalMap]parse and update individual ApiLock Interval Map succeed");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateSwitchToPostApiConfig] called");
        }
        if (!StringUtils.isNotBlank(RemoteConfig.getInstance().allowSwitchToPostApiList)) {
            return;
        }
        try {
            List parseArray = JSON.parseArray(RemoteConfig.getInstance().allowSwitchToPostApiList, String.class);
            if (parseArray != null) {
                SwitchConfig.getInstance().allowSwitchToPostApiSet = new HashSet(parseArray);
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateSwitchToPostApiConfig]parse and update allowSwitchPostApiList error.", th);
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateSwitchToPostApiConfig]parse and update allowSwitchPostApiList succeed");
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updatePrefetchExpiredTimeApiConfig] called");
        }
        if (!StringUtils.isNotBlank(RemoteConfig.getInstance().allowCustomPrefetchExpiredTimeApiList)) {
            return;
        }
        try {
            List parseArray = JSON.parseArray(RemoteConfig.getInstance().allowCustomPrefetchExpiredTimeApiList, String.class);
            if (parseArray != null) {
                SwitchConfig.getInstance().allowCustomPrefetchExpireTimeApiSet = new HashSet(parseArray);
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updatePrefetchExpiredTimeApiConfig]parse and update allowCustomPrefetchExpiredTimeApiList error.", th);
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updatePrefetchExpiredTimeApiConfig]parse and update allowCustomPrefetchExpiredTimeApiList succeed");
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateAllowPageUrlCutApiConfig] called");
        }
        if (!StringUtils.isNotBlank(RemoteConfig.getInstance().allowPageUrlCutApiList)) {
            return;
        }
        try {
            List parseArray = JSON.parseArray(RemoteConfig.getInstance().allowPageUrlCutApiList, String.class);
            if (parseArray != null) {
                SwitchConfig.getInstance().allowPageUrlCutApiSet = new HashSet(parseArray);
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateAllowPageUrlCutApiConfig]parse and update allowPageUrlCutApiList error.", th);
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateAllowPageUrlCutApiConfig]parse and update allowPageUrlCutApiList succeed");
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateAllowRefererCutApiConfig] called");
        }
        if (!StringUtils.isNotBlank(RemoteConfig.getInstance().allowRefererCutApiList)) {
            return;
        }
        try {
            List parseArray = JSON.parseArray(RemoteConfig.getInstance().allowRefererCutApiList, String.class);
            if (parseArray != null) {
                SwitchConfig.getInstance().allowRefererCutApiSet = new HashSet(parseArray);
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateAllowRefererCutApiConfig]parse and update allowRefererCutApiList error.", th);
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateAllowRefererCutApiConfig]parse and update allowRefererCutApiList succeed");
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateJsBridgeTimeoutApiConfig] called");
        }
        if (!StringUtils.isNotBlank(RemoteConfig.getInstance().jsBridgeTimeoutApiList)) {
            return;
        }
        try {
            List parseArray = JSON.parseArray(RemoteConfig.getInstance().jsBridgeTimeoutApiList, String.class);
            if (parseArray != null) {
                SwitchConfig.getInstance().jsBridgeTimeoutApiSet = new HashSet(parseArray);
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateJsBridgeTimeoutApiConfig]parse and update jsBridgeTimeoutApiList error.", th);
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateJsBridgeTimeoutApiConfig]parse and update signDegradedApiList succeed");
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateDegradeApiCacheList]updateDegradeApiCacheList called");
        }
        if (StringUtils.isNotBlank(RemoteConfig.getInstance().degradeApiCacheList)) {
            try {
                List parseArray = JSON.parseArray(RemoteConfig.getInstance().degradeApiCacheList, String.class);
                if (parseArray != null) {
                    SwitchConfig.getInstance().degradeApiCacheSet = new HashSet(parseArray);
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateDegradeApiCacheList]parse and update degradeApiCacheList error.", th);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateDegradeApiCacheList]parse and update degradeApiCacheList succeed");
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateRemoveCacheBlockList]updateRemoveCacheBlockList called");
        }
        if (!StringUtils.isNotBlank(RemoteConfig.getInstance().removeCacheBlockList)) {
            return;
        }
        try {
            List parseArray2 = JSON.parseArray(RemoteConfig.getInstance().removeCacheBlockList, String.class);
            if (parseArray2 == null) {
                return;
            }
            for (int i = 0; i < parseArray2.size(); i++) {
                String str = (String) parseArray2.get(i);
                boolean removeCacheBlock = SDKUtils.removeCacheBlock(str);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateRemoveCacheBlockList]removeCacheBlock result=" + removeCacheBlock + ",blockName=" + str);
                }
            }
        } catch (Throwable th2) {
            TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateRemoveCacheBlockList]parse and update removeCacheBlockList error.", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateDegradeBizErrorMappingApiList]updateDegradeBizErrorMappingApiList called");
        }
        if (StringUtils.isNotBlank(RemoteConfig.getInstance().degradeBizErrorMappingApiList)) {
            try {
                List parseArray = JSON.parseArray(RemoteConfig.getInstance().degradeBizErrorMappingApiList, String.class);
                if (parseArray != null) {
                    SwitchConfig.getInstance().degradeBizErrorMappingApiSet = new HashSet(parseArray);
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateDegradeBizErrorMappingApiList]parse and update degradeBizErrorMappingApiList error.", th);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateDegradeBizErrorMappingApiList]parse and update degradeBizErrorMappingApiList succeed");
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateErrorMappingMsgMap]updateErrorMappingMsgMap called");
        }
        if (!StringUtils.isNotBlank(RemoteConfig.getInstance().errorMappingMsg)) {
            return;
        }
        try {
            Map map = (Map) JSON.parseObject(RemoteConfig.getInstance().errorMappingMsg, new TypeReference<Map<String, String>>() { // from class: tb.rxj.2
            }, new Feature[0]);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (StringUtils.isNotBlank((String) entry.getKey()) && StringUtils.isNotBlank((String) entry.getValue())) {
                        SwitchConfig.errorMappingMsgMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        } catch (Throwable th2) {
            TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateErrorMappingMsgMap]update ErrorMappingMsgMap error.", th2);
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateErrorMappingMsgMap]parse and update ErrorMappingMsgMap succeed.remoteErrorMappingMsgMap=");
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateSupportZstdApiConfig] called");
        }
        if (!StringUtils.isNotBlank(RemoteConfig.getInstance().supportZstdApiList)) {
            return;
        }
        try {
            List parseArray = JSON.parseArray(RemoteConfig.getInstance().supportZstdApiList, String.class);
            if (parseArray != null) {
                SwitchConfig.getInstance().supportZstdApiSet = new HashSet(parseArray);
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateSupportZstdApiConfig]parse and update supportZstdtApiList error.", th);
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateSupportZstdApiConfig]parse and update supportZstdtApiList succeed");
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateCookieDisableApiConfig] called");
        }
        if (!StringUtils.isNotBlank(RemoteConfig.getInstance().cookieDisableApiList)) {
            return;
        }
        try {
            List parseArray = JSON.parseArray(RemoteConfig.getInstance().cookieDisableApiList, String.class);
            if (parseArray != null) {
                SwitchConfig.getInstance().cookieDisableApiSet = new HashSet(parseArray);
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.SwitchConfigManager", "[updateCookieDisableApiConfig]parse and update cookieDisableApiList error.", th);
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i("mtopsdk.SwitchConfigManager", "[updateCookieDisableApiConfig]parse and update cookieDisableApiList succeed");
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateSignDegradedApiConfig] called");
        }
        c.a();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.SwitchConfigManager", "[updateSignDegradedApiConfig2] called");
        }
        c.b();
    }
}
