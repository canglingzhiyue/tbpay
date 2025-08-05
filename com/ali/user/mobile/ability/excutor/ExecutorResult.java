package com.ali.user.mobile.ability.excutor;

import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class ExecutorResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> bizInfo;
    public int code;
    public ExecutorContext context;
    public String msg;
    public boolean success;

    static {
        kge.a(1715025274);
    }

    public ExecutorResult(boolean z, ExecutorContext executorContext) {
        this.success = z;
        this.context = executorContext;
    }

    public static ExecutorResult buildSuccess(ExecutorContext executorContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorResult) ipChange.ipc$dispatch("cf6fbd98", new Object[]{executorContext}) : buildSuccess(executorContext, null);
    }

    public static ExecutorResult buildSuccess(ExecutorContext executorContext, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorResult) ipChange.ipc$dispatch("a105fbb9", new Object[]{executorContext, map});
        }
        ExecutorResult executorResult = new ExecutorResult(true, executorContext);
        executorResult.bizInfo = map;
        return executorResult;
    }

    public static ExecutorResult buildError(ExecutorContext executorContext, Map<String, Object> map, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorResult) ipChange.ipc$dispatch("82dfb4b5", new Object[]{executorContext, map, new Integer(i), str});
        }
        ExecutorResult executorResult = new ExecutorResult(false, executorContext);
        executorResult.bizInfo = map;
        executorResult.code = i;
        executorResult.msg = str;
        return executorResult;
    }

    public static ExecutorResult buildParamError(ExecutorContext executorContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorResult) ipChange.ipc$dispatch("a986a06c", new Object[]{executorContext}) : buildError(executorContext, null, 3002, ResourceUtil.getInvalidParam());
    }

    public static ExecutorResult buildCancelError(ExecutorContext executorContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorResult) ipChange.ipc$dispatch("d84017c3", new Object[]{executorContext}) : buildError(executorContext, null, 3007, null);
    }

    public static ExecutorResult buildEmptyResultError(ExecutorContext executorContext, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorResult) ipChange.ipc$dispatch("39bc1545", new Object[]{executorContext, str}) : buildError(executorContext, null, 3, str);
    }
}
