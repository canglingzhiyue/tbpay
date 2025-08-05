package com.alipay.ma.decode;

import android.text.TextUtils;
import com.alipay.ma.MaLogger;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MaSdkConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MA_SDK_FILTER_CONFIG = "masdk_filter_config";

    /* renamed from: a  reason: collision with root package name */
    private static volatile String f5315a;

    public static synchronized boolean isSupportMaSdkConfig() {
        synchronized (MaSdkConfigManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("94545f6e", new Object[0])).booleanValue();
            }
            return !TextUtils.isEmpty(f5315a);
        }
    }

    public static synchronized void refreshConfig(String str) {
        synchronized (MaSdkConfigManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e4b20ce", new Object[]{str});
                return;
            }
            f5315a = str;
            MaDecode.setFilterConfigJ(str);
            MaLogger.d("MaSdkConfigManager", "refreshConfig =" + str);
            String str2 = "refreshConfig =" + str;
        }
    }
}
