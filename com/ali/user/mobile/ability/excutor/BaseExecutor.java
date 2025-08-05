package com.ali.user.mobile.ability.excutor;

import com.ali.user.mobile.ability.excutor.ExecutorParams;
import com.ali.user.mobile.callback.DataCallback;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.ParameterizedType;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class BaseExecutor<T extends ExecutorParams> implements Executor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXECUTOR_SUFFIX = "executor";
    public Class<T> eventClazz = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    public boolean supportSync;

    static {
        kge.a(-1705027602);
        kge.a(-690261251);
    }

    public void asyncExecute(ExecutorContext executorContext, T t, DataCallback<ExecutorResult> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("880383d5", new Object[]{this, executorContext, t, dataCallback});
        }
    }

    public ExecutorResult syncExecute(ExecutorContext executorContext, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorResult) ipChange.ipc$dispatch("a0b2e8d1", new Object[]{this, executorContext, t});
        }
        return null;
    }

    public BaseExecutor() {
        this.supportSync = false;
        if (getClass().isAnnotationPresent(SupportSync.class)) {
            this.supportSync = ((SupportSync) getClass().getAnnotation(SupportSync.class)).value();
        }
    }

    @Override // com.ali.user.mobile.ability.excutor.Executor
    public String executorName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0fb33bb", new Object[]{this});
        }
        String lowerCase = getClass().getSimpleName().toLowerCase();
        return lowerCase.endsWith(EXECUTOR_SUFFIX) ? lowerCase.substring(0, lowerCase.length() - 8) : lowerCase;
    }

    @Override // com.ali.user.mobile.ability.excutor.Executor
    public Class paramClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("6595749f", new Object[]{this}) : this.eventClazz;
    }

    @Override // com.ali.user.mobile.ability.excutor.Executor
    public boolean supportSync() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("45ea7e95", new Object[]{this})).booleanValue() : this.supportSync;
    }

    @Override // com.ali.user.mobile.ability.excutor.Executor
    public ExecutorResult execute(final ExecutorContext executorContext, final DataCallback<ExecutorResult> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorResult) ipChange.ipc$dispatch("fb23c5ce", new Object[]{this, executorContext, dataCallback});
        }
        if (executorContext.params != null && !this.eventClazz.isAssignableFrom(executorContext.params.getClass())) {
            return null;
        }
        if (supportSync()) {
            ExecutorResult syncExecute = syncExecute(executorContext, executorContext.params);
            if (syncExecute == null) {
                syncExecute = ExecutorResult.buildSuccess(executorContext);
            }
            if (dataCallback != null) {
                dataCallback.result(syncExecute);
            }
            return syncExecute;
        }
        asyncExecute(executorContext, executorContext.params, new DataCallback<ExecutorResult>() { // from class: com.ali.user.mobile.ability.excutor.BaseExecutor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.DataCallback
            public void result(ExecutorResult executorResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aeab9d99", new Object[]{this, executorResult});
                } else if (dataCallback == null) {
                } else {
                    if (executorResult == null) {
                        executorResult = ExecutorResult.buildSuccess(executorContext);
                    }
                    dataCallback.result(executorResult);
                }
            }
        });
        return null;
    }

    public void callback(DataCallback<ExecutorResult> dataCallback, ExecutorResult executorResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1480f9", new Object[]{this, dataCallback, executorResult});
        } else if (dataCallback == null) {
        } else {
            dataCallback.result(executorResult);
        }
    }
}
