package com.alipay.birdnest.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alipay.android.app.template.JSPluginManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import tb.ieb;
import tb.ied;

/* loaded from: classes3.dex */
public abstract class InvokeThreadPoolTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public final ExecutorService f5270a;

    /* loaded from: classes3.dex */
    public static final class HandlerInstanceHolder {

        /* renamed from: a */
        public static final Handler f5271a = new Handler(Looper.getMainLooper()) { // from class: com.alipay.birdnest.util.InvokeThreadPoolTask.HandlerInstanceHolder.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                String valueOf;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                } else if (message.what != 16) {
                } else {
                    TaskResult taskResult = (TaskResult) message.obj;
                    InvokeThreadPoolTask invokeThreadPoolTask = taskResult.f5272a;
                    Object obj = taskResult.b;
                    FBDocument.AnonymousClass16 anonymousClass16 = (FBDocument.AnonymousClass16) invokeThreadPoolTask;
                    FBDocument.this.W.remove(taskResult);
                    if (FBDocument.this.mCore == 0 || anonymousClass16.b != FBDocument.this.mCore) {
                        return;
                    }
                    FBDocument fBDocument = FBDocument.this;
                    if (fBDocument.k0 == null || fBDocument.k == null || anonymousClass16.f == 0 || obj == FBDocument.NO_RESULT) {
                        return;
                    }
                    if (obj == null) {
                        valueOf = "{}";
                    } else {
                        try {
                            valueOf = String.valueOf(obj);
                        } catch (Throwable th) {
                            FBLogger.e("FBDocument", th);
                            return;
                        }
                    }
                    if (!FBDocument.this.a() || !ieb.b()) {
                        FBDocument.a(FBDocument.this, anonymousClass16.f, valueOf, FBDocument.g);
                    } else {
                        FBDocument.nativeCallJsMethodWithJson(FBDocument.this.mCore, anonymousClass16.f, valueOf);
                    }
                }
            }
        };
    }

    /* loaded from: classes3.dex */
    public static class TaskResult {

        /* renamed from: a */
        public InvokeThreadPoolTask f5272a;
        public Object b;
    }

    public InvokeThreadPoolTask(ExecutorService executorService) {
        this.f5270a = executorService;
    }

    public static /* synthetic */ void lambda$9DJVMgb11fcQPR_WdrqZuZhjy0w(InvokeThreadPoolTask invokeThreadPoolTask, TaskResult taskResult) {
        invokeThreadPoolTask.a(taskResult);
    }

    public TaskResult a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskResult) ipChange.ipc$dispatch("681cb00", new Object[]{this});
        }
        final TaskResult taskResult = new TaskResult();
        this.f5270a.execute(new Runnable() { // from class: com.alipay.birdnest.util.-$$Lambda$InvokeThreadPoolTask$9DJVMgb11fcQPR_WdrqZuZhjy0w
            {
                InvokeThreadPoolTask.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InvokeThreadPoolTask.lambda$9DJVMgb11fcQPR_WdrqZuZhjy0w(InvokeThreadPoolTask.this, taskResult);
            }
        });
        return taskResult;
    }

    public void a(TaskResult taskResult) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf10eefa", new Object[]{this, taskResult});
            return;
        }
        FBDocument.AnonymousClass16 anonymousClass16 = (FBDocument.AnonymousClass16) this;
        if (FBDocument.this.mCore == 0 || anonymousClass16.b != FBDocument.this.mCore) {
            obj = null;
        } else {
            if (anonymousClass16.c) {
                String[] a2 = ied.a(anonymousClass16.d);
                if (JSPluginManager.INVOKE_NS_FB.equals(a2[0]) && FBDocument.this.a(a2[1], anonymousClass16.e, anonymousClass16.f)) {
                    obj = FBDocument.NO_RESULT;
                }
            } else if (FBDocument.this.a(anonymousClass16.d, anonymousClass16.e, anonymousClass16.f)) {
                obj = FBDocument.NO_RESULT;
            }
            try {
                JSPluginManager instanse = JSPluginManager.getInstanse();
                FBDocument fBDocument = FBDocument.this;
                obj = instanse.performInvoke(fBDocument.k, anonymousClass16.d, anonymousClass16.e, fBDocument, anonymousClass16.f, anonymousClass16.c);
            } catch (Throwable th) {
                FBLogger.e("FBDocument", th);
                obj = new JSONObject();
            }
        }
        taskResult.b = obj;
        taskResult.f5272a = this;
        Handler handler = HandlerInstanceHolder.f5271a;
        handler.sendMessage(handler.obtainMessage(16, taskResult));
    }
}
