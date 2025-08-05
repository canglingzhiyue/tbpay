package com.taobao.metrickit.context;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;

/* loaded from: classes7.dex */
public class MetricKitPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_GET_NUMBER_OF_CPUCORES = "getNumberOfCPUCores";
    public static final String ACTION_SET_MEMORY_REPEAT_INTERVAL = "setMemoryRepeatInterval";
    public static final String NAME = "MetricKitPlugin";

    public static /* synthetic */ Object ipc$super(MetricKitPlugin metricKitPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (ACTION_SET_MEMORY_REPEAT_INTERVAL.equals(str)) {
            setMemoryRepeatInterval(str2, wVCallBackContext);
        } else if (ACTION_GET_NUMBER_OF_CPUCORES.equals(str)) {
            getNumberOfCPUCores(str2, wVCallBackContext);
        }
        return false;
    }

    private void setMemoryRepeatInterval(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3fdf1", new Object[]{this, str, wVCallBackContext});
            return;
        }
        long longValue = JSONObject.parseObject(str).getLong(Constants.Name.INTERVAL).longValue();
        if (longValue > 0) {
            c.b(c.CONFIG_MEMORY_REPEAT_INTERVAL, longValue);
            r rVar = new r();
            rVar.a("result", "添加成功，重启/前后台切换后生效～");
            wVCallBackContext.success(rVar);
            return;
        }
        r rVar2 = new r();
        rVar2.a("result", "添加失败，请检查配置！");
        wVCallBackContext.error(rVar2);
    }

    private void getNumberOfCPUCores(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94718350", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        rVar.a("numberOfCPUCores", Integer.valueOf(com.taobao.monitor.performance.cpu.a.a()));
        wVCallBackContext.success(rVar);
    }
}
