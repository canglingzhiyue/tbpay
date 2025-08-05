package com.ali.user.mobile.ability.excutor.base;

import android.app.Activity;
import android.content.DialogInterface;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorParams;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.helper.DialogHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class AlertExecutor extends BaseExecutor<AlertExecutorParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public static class AlertExecutorParams extends ExecutorParams {
        public String leftButtonTitle;
        public String message;
        public String rightButtonTitle;
        public String title;

        static {
            kge.a(1356197740);
        }
    }

    static {
        kge.a(-711731973);
    }

    @Override // com.ali.user.mobile.ability.excutor.BaseExecutor
    public /* bridge */ /* synthetic */ void asyncExecute(ExecutorContext executorContext, AlertExecutorParams alertExecutorParams, DataCallback dataCallback) {
        asyncExecute2(executorContext, alertExecutorParams, (DataCallback<ExecutorResult>) dataCallback);
    }

    /* renamed from: asyncExecute  reason: avoid collision after fix types in other method */
    public void asyncExecute2(final ExecutorContext executorContext, AlertExecutorParams alertExecutorParams, final DataCallback<ExecutorResult> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc54a69e", new Object[]{this, executorContext, alertExecutorParams, dataCallback});
        } else if (executorContext != null && executorContext.context != null && (executorContext.context instanceof Activity) && alertExecutorParams != null) {
            new DialogHelper((Activity) executorContext.context).alert(alertExecutorParams.title, alertExecutorParams.message, alertExecutorParams.rightButtonTitle, new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.ability.excutor.base.AlertExecutor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        AlertExecutor.this.buildResult(1, executorContext, dataCallback);
                    }
                }
            }, alertExecutorParams.leftButtonTitle, new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.ability.excutor.base.AlertExecutor.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        AlertExecutor.this.buildResult(0, executorContext, dataCallback);
                    }
                }
            });
        } else if (dataCallback == null) {
        } else {
            dataCallback.result(ExecutorResult.buildError(executorContext, null, 3002, ""));
        }
    }

    public void buildResult(int i, ExecutorContext executorContext, DataCallback<ExecutorResult> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29721df2", new Object[]{this, new Integer(i), executorContext, dataCallback});
        } else if (dataCallback == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("btnClickIndex", Integer.valueOf(i));
            dataCallback.result(ExecutorResult.buildSuccess(executorContext, hashMap));
        }
    }
}
