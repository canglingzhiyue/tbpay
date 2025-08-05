package com.taobao.browser;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tscheduleprotocol.RenderScheduleProtocol;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class PreRenderProtocolImpl implements RenderScheduleProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1069254537);
        kge.a(1912333540);
    }

    @Override // com.taobao.android.tscheduleprotocol.RenderScheduleProtocol
    public boolean preCreateInstanceWithUrl(Context context, String str, ScheduleProtocolCallback scheduleProtocolCallback, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("17ad6e11", new Object[]{this, context, str, scheduleProtocolCallback, map})).booleanValue() : g.a().addPreInitWeb(str, context, scheduleProtocolCallback);
    }

    @Override // com.taobao.android.tscheduleprotocol.RenderScheduleProtocol
    public boolean preloadWithUrl(Context context, String str, ScheduleProtocolCallback scheduleProtocolCallback, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a9a9666", new Object[]{this, context, str, scheduleProtocolCallback, map})).booleanValue() : g.a().triggerRender(str, str, context, scheduleProtocolCallback, map);
    }

    @Override // com.taobao.android.tscheduleprotocol.RenderScheduleProtocol
    public boolean clearPreloadedInstances() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e1648b2e", new Object[]{this})).booleanValue() : g.a().clearAll();
    }

    @Override // com.taobao.android.tscheduleprotocol.RenderScheduleProtocol
    public boolean removePreloadedInstance(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0cc56ce", new Object[]{this, str})).booleanValue() : g.a().clearByKey(str);
    }
}
