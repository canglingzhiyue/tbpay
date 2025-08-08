package com.taobao.browser.jsbridge;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.taobao.windvane.jsbridge.c;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.browser.utils.i;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes6.dex */
public class DynamicJsbridgeService extends Service implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DynamicJsbridgeService";

    static {
        kge.a(415192647);
        kge.a(-1332442189);
    }

    public static /* synthetic */ Object ipc$super(DynamicJsbridgeService dynamicJsbridgeService, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // android.taobao.windvane.jsbridge.c
    public Class<? extends e> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        BrowserUtil.a(TAG, "getBridgeClass", str, null, null);
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals("TBDeviceInfo")) {
            return TBUrlCacheAndDevice.class;
        }
        if (str.equals("TBBase")) {
            return WVTBBase.class;
        }
        if (str.equals("TBURLCache")) {
            return TBUrlCacheAndDevice.class;
        }
        if (str.equals("Base")) {
            return WVWindow.class;
        }
        if (str.equals("WVUICityList")) {
            return WVUICityList.class;
        }
        if (str.equals("WVNative")) {
            return TBNative.class;
        }
        if (!str.contains(q.a().f1672a)) {
            return null;
        }
        return getPluginClass(str);
    }

    private Class<? extends e> getPluginClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("57078ecd", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("#");
        if (split.length < 2) {
            return null;
        }
        String str2 = split[1];
        if (StringUtils.isEmpty(str2)) {
            return null;
        }
        String config = OrangeConfig.getInstance().getConfig(i.KEY_ORANGE_GROUP_WVAPI_BROWSER, str2, "");
        if (StringUtils.isEmpty(config)) {
            return null;
        }
        try {
            return Class.forName(config);
        } catch (Throwable unused) {
            Log.e(TAG, "getPluginClass fail:" + str + ", " + config);
            return null;
        }
    }
}
