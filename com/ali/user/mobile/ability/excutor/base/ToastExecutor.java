package com.ali.user.mobile.ability.excutor.base;

import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorParams;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.ability.excutor.SupportSync;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.ToastUtil;
import tb.kge;

@SupportSync
/* loaded from: classes2.dex */
public class ToastExecutor extends BaseExecutor<ToastExecutorParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public static class ToastExecutorParams extends ExecutorParams {
        public int duration = 3000;
        public String message;

        static {
            kge.a(498629442);
        }
    }

    static {
        kge.a(1092150982);
    }

    @Override // com.ali.user.mobile.ability.excutor.BaseExecutor
    public ExecutorResult syncExecute(ExecutorContext executorContext, ToastExecutorParams toastExecutorParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorResult) ipChange.ipc$dispatch("7ec00ef0", new Object[]{this, executorContext, toastExecutorParams});
        }
        ToastUtil.showToast(executorContext.context, toastExecutorParams.message, toastExecutorParams.duration);
        return null;
    }
}
