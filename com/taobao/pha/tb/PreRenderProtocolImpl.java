package com.taobao.pha.tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tscheduleprotocol.RenderScheduleProtocol;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import com.taobao.pha.core.p;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class PreRenderProtocolImpl implements RenderScheduleProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1049323049);
        kge.a(1912333540);
    }

    @Override // com.taobao.android.tscheduleprotocol.RenderScheduleProtocol
    public boolean preCreateInstanceWithUrl(Context context, String str, ScheduleProtocolCallback scheduleProtocolCallback, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17ad6e11", new Object[]{this, context, str, scheduleProtocolCallback, map})).booleanValue();
        }
        if (enablePreRender()) {
            return i.a().addPreInitWeb(str, context, scheduleProtocolCallback);
        }
        return false;
    }

    @Override // com.taobao.android.tscheduleprotocol.RenderScheduleProtocol
    public boolean preloadWithUrl(Context context, String str, ScheduleProtocolCallback scheduleProtocolCallback, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a9a9666", new Object[]{this, context, str, scheduleProtocolCallback, map})).booleanValue();
        }
        if (enablePreRender()) {
            return i.a().triggerRender(str, str, context, scheduleProtocolCallback, map);
        }
        return false;
    }

    @Override // com.taobao.android.tscheduleprotocol.RenderScheduleProtocol
    public boolean clearPreloadedInstances() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1648b2e", new Object[]{this})).booleanValue();
        }
        if (enablePreRender()) {
            return i.a().clearAll();
        }
        return false;
    }

    @Override // com.taobao.android.tscheduleprotocol.RenderScheduleProtocol
    public boolean removePreloadedInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cc56ce", new Object[]{this, str})).booleanValue();
        }
        if (enablePreRender()) {
            return i.a().clearByKey(str);
        }
        return false;
    }

    private boolean enablePreRender() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fc614161", new Object[]{this})).booleanValue() : p.c().a("enable_preload", false);
    }
}
