package com.taobao.search.jarvis.rcmd;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tscheduleprotocol.CustomScheduleProtocol;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import tb.kge;

/* loaded from: classes7.dex */
public class XSLPreloadProtocol implements CustomScheduleProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "XSLPreloadProtocol";

    static {
        kge.a(-854978623);
        kge.a(-723117889);
    }

    @Override // com.taobao.android.tscheduleprotocol.CustomScheduleProtocol
    public void preload(Context context, String str, ScheduleProtocolCallback scheduleProtocolCallback, JSONObject jSONObject, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b43e4cd", new Object[]{this, context, str, scheduleProtocolCallback, jSONObject, objArr});
            return;
        }
        try {
            scheduleProtocolCallback.onPreload(ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_MISS, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
