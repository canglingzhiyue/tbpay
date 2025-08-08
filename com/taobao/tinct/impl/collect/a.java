package com.taobao.tinct.impl.collect;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class a implements com.taobao.tinct.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_MONITOR_MODULE = "Biz_Change_Tinct";
    public static final String APP_MONITOR_MONITOR_POINT = "tinct_change";
    public static final String TAG = "AppMonitorUploader";

    @Override // com.taobao.tinct.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                Log.e(TAG, "Failed to report change info to appmonitor: " + str);
                return;
            }
            AppMonitor.Alarm.commitSuccess(APP_MONITOR_MODULE, APP_MONITOR_MONITOR_POINT, str);
            String str2 = "Report change info to appmonitor: " + str;
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "Exception when report change info to appmonitor: " + str);
        }
    }
}
