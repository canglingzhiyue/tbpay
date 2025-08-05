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
public class HideLoadingExecutor extends BaseExecutor<ExecutorParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-369292743);
    }

    @Override // com.ali.user.mobile.ability.excutor.BaseExecutor
    public ExecutorResult syncExecute(ExecutorContext executorContext, ExecutorParams executorParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorResult) ipChange.ipc$dispatch("a0b2e8d1", new Object[]{this, executorContext, executorParams});
        }
        if (executorContext == null || executorContext.context == null || !(executorContext.context instanceof BaseActivity)) {
            return ExecutorResult.buildError(executorContext, null, 3002, "");
        }
        ((BaseActivity) executorContext.context).dismissProgressDialog();
        return ExecutorResult.buildSuccess(executorContext);
    }
}
