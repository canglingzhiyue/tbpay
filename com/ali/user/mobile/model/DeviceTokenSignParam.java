package com.ali.user.mobile.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.TreeMap;
import tb.kge;

/* loaded from: classes2.dex */
public class DeviceTokenSignParam {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACTIONTYPE = "actionType";
    public static final String KEY_APPKEY = "appKey";
    public static final String KEY_APPVERSION = "appVersion";
    public static final String KEY_AUTOLOGINTOKEN = "autoLoginToken";
    public static final String KEY_HAVANAID = "havanaId";
    public static final String KEY_SDKVERSION = "sdkVersion";
    public static final String KEY_TIMESTAMP = "timestamp";
    private TreeMap<String, String> map = new TreeMap<>();

    static {
        kge.a(-964084421);
    }

    public DeviceTokenSignParam addAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTokenSignParam) ipChange.ipc$dispatch("602ba7da", new Object[]{this, str});
        }
        this.map.put("appKey", str);
        return this;
    }

    public DeviceTokenSignParam addAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTokenSignParam) ipChange.ipc$dispatch("aa12a501", new Object[]{this, str});
        }
        this.map.put("appVersion", str);
        return this;
    }

    public DeviceTokenSignParam addHavanaId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTokenSignParam) ipChange.ipc$dispatch("fb1aaf86", new Object[]{this, str});
        }
        this.map.put("havanaId", str);
        return this;
    }

    public DeviceTokenSignParam addTimestamp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTokenSignParam) ipChange.ipc$dispatch("fadfa0a4", new Object[]{this, str});
        }
        this.map.put("timestamp", str);
        return this;
    }

    public DeviceTokenSignParam addAutoLoginToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTokenSignParam) ipChange.ipc$dispatch("986b4ad9", new Object[]{this, str});
        }
        this.map.put(KEY_AUTOLOGINTOKEN, str);
        return this;
    }

    public DeviceTokenSignParam addSDKVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTokenSignParam) ipChange.ipc$dispatch("c0e03d9a", new Object[]{this, str});
        }
        this.map.put("sdkVersion", str);
        return this;
    }

    public DeviceTokenSignParam addActionType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTokenSignParam) ipChange.ipc$dispatch("d8804188", new Object[]{this, str});
        }
        this.map.put("actionType", str);
        return this;
    }

    public TreeMap<String, String> build() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TreeMap) ipChange.ipc$dispatch("38ae50a8", new Object[]{this}) : this.map;
    }
}
