package com.ali.user.mobile.ability.excutor.base;

import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorParams;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.ability.excutor.SupportSync;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@SupportSync
/* loaded from: classes2.dex */
public class AgreementCheckExecutor extends BaseExecutor<ExecutorParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PARAMS_AGREEMENT_CKECKED_KEY = "agreementChecked";

    static {
        kge.a(197127909);
    }

    @Override // com.ali.user.mobile.ability.excutor.BaseExecutor
    public ExecutorResult syncExecute(ExecutorContext executorContext, ExecutorParams executorParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorResult) ipChange.ipc$dispatch("a0b2e8d1", new Object[]{this, executorContext, executorParams}) : new ExecutorResult("false".equals(executorContext.pageFields.get(PARAMS_AGREEMENT_CKECKED_KEY)), executorContext);
    }
}
