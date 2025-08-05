package com.ali.user.mobile.ability.excutor.base;

import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorParams;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.ability.excutor.SupportSync;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@SupportSync
/* loaded from: classes2.dex */
public class ShowLoadingExecutor extends BaseExecutor<LoadingExecutorParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public static class LoadingExecutorParams extends ExecutorParams {
        static {
            kge.a(-2131276945);
        }
    }

    static {
        kge.a(1330347806);
    }

    @Override // com.ali.user.mobile.ability.excutor.BaseExecutor
    public ExecutorResult syncExecute(ExecutorContext executorContext, LoadingExecutorParams loadingExecutorParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorResult) ipChange.ipc$dispatch("2e7e005d", new Object[]{this, executorContext, loadingExecutorParams});
        }
        if (executorContext == null || executorContext.context == null || !(executorContext.context instanceof BaseActivity)) {
            return ExecutorResult.buildError(executorContext, null, 3002, "");
        }
        ((BaseActivity) executorContext.context).showProgress("");
        return ExecutorResult.buildSuccess(executorContext);
    }
}
