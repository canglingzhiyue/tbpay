package com.taobao.message.message_open_api_adapter;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.jsi.standard.d;
import com.alibaba.jsi.standard.js.j;
import com.alibaba.jsi.standard.js.s;
import com.alibaba.jsi.standard.js.w;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.jsi.manager.JSIHandler;
import com.taobao.message.message_open_api.core.CallException;
import com.taobao.message.message_open_api.core.CallResponse;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"com/taobao/message/message_open_api_adapter/OpenAPI4JSI$call$disposable$1", "Lcom/taobao/message/kit/core/IObserver;", "", "onComplete", "", "onError", "e", "", "onNext", "value", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class OpenAPI4JSI$call$disposable$1 implements IObserver<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d $jsiCtx;
    public final /* synthetic */ Ref.ObjectRef $onComplete;
    public final /* synthetic */ Ref.ObjectRef $onFail;
    public final /* synthetic */ Ref.ObjectRef $onNext;

    public OpenAPI4JSI$call$disposable$1(Ref.ObjectRef objectRef, d dVar, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.$onNext = objectRef;
        this.$jsiCtx = dVar;
        this.$onFail = objectRef2;
        this.$onComplete = objectRef3;
    }

    @Override // com.taobao.message.kit.core.IObserver
    public void onNext(final Object value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, value});
            return;
        }
        q.c(value, "value");
        if (((j) this.$onNext.element) == null) {
            return;
        }
        JSIHandler.INSTANCE.getHandler().post(new Runnable() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1$onNext$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                s sVar = new s(JSON.toJSONString(CallResponse.next(value), SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteNonStringKeyAsString));
                TLog.loge(OpenAPI4JSI.TAG, "JSIBridge onNext called");
                try {
                    if (!OpenAPI4JSI$call$disposable$1.this.$jsiCtx.c()) {
                        ((j) OpenAPI4JSI$call$disposable$1.this.$onNext.element).a(OpenAPI4JSI$call$disposable$1.this.$jsiCtx, (w) null, new s[]{sVar});
                        JSIHandler.INSTANCE.checkException(OpenAPI4JSI$call$disposable$1.this.$jsiCtx);
                    } else {
                        ((j) OpenAPI4JSI$call$disposable$1.this.$onNext.element).a();
                    }
                } catch (Throwable th) {
                    try {
                        TLog.loge(OpenAPI4JSI.TAG, Log.getStackTraceString(th));
                    } finally {
                        sVar.a();
                    }
                }
            }
        });
    }

    @Override // com.taobao.message.kit.core.IObserver
    public void onError(Throwable e) {
        String stackTraceString;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, e});
            return;
        }
        q.c(e, "e");
        if (((j) this.$onFail.element) == null) {
            return;
        }
        if (e instanceof CallException) {
            CallException callException = (CallException) e;
            str = callException.errCode;
            stackTraceString = callException.errMsg;
        } else {
            stackTraceString = Log.getStackTraceString(e);
            str = "-1";
        }
        final s sVar = new s(JSON.toJSONString(CallResponse.error(str, stackTraceString)));
        TLog.loge(OpenAPI4JSI.TAG, "JSIBridge onError called: " + sVar);
        JSIHandler.INSTANCE.getHandler().post(new Runnable() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1$onError$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    TLog.loge(OpenAPI4JSI.TAG, "JSIBridge onError posted");
                    if (!OpenAPI4JSI$call$disposable$1.this.$jsiCtx.c()) {
                        j jVar = (j) OpenAPI4JSI$call$disposable$1.this.$onFail.element;
                        if (jVar != null) {
                            jVar.a(OpenAPI4JSI$call$disposable$1.this.$jsiCtx, (w) null, new s[]{sVar});
                        }
                        JSIHandler.INSTANCE.checkException(OpenAPI4JSI$call$disposable$1.this.$jsiCtx);
                    }
                } catch (Throwable th) {
                    try {
                        TLog.loge(OpenAPI4JSI.TAG, Log.getStackTraceString(th));
                        j jVar2 = (j) OpenAPI4JSI$call$disposable$1.this.$onFail.element;
                        if (jVar2 != null) {
                            jVar2.a();
                        }
                        sVar.a();
                    } finally {
                        j jVar3 = (j) OpenAPI4JSI$call$disposable$1.this.$onFail.element;
                        if (jVar3 != null) {
                            jVar3.a();
                        }
                        sVar.a();
                    }
                }
            }
        });
    }

    @Override // com.taobao.message.kit.core.IObserver
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (((j) this.$onComplete.element) == null) {
        } else {
            final s sVar = new s(JSON.toJSONString(CallResponse.complete()));
            TLog.loge(OpenAPI4JSI.TAG, "JSIBridge onComplete called");
            JSIHandler.INSTANCE.getHandler().post(new Runnable() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4JSI$call$disposable$1$onComplete$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (!OpenAPI4JSI$call$disposable$1.this.$jsiCtx.c()) {
                            j jVar = (j) OpenAPI4JSI$call$disposable$1.this.$onComplete.element;
                            if (jVar != null) {
                                jVar.a(OpenAPI4JSI$call$disposable$1.this.$jsiCtx, (w) null, new s[]{sVar});
                            }
                            JSIHandler.INSTANCE.checkException(OpenAPI4JSI$call$disposable$1.this.$jsiCtx);
                        }
                    } catch (Throwable th) {
                        try {
                            TLog.loge(OpenAPI4JSI.TAG, Log.getStackTraceString(th));
                            j jVar2 = (j) OpenAPI4JSI$call$disposable$1.this.$onComplete.element;
                            if (jVar2 != null) {
                                jVar2.a();
                            }
                            sVar.a();
                        } finally {
                            j jVar3 = (j) OpenAPI4JSI$call$disposable$1.this.$onComplete.element;
                            if (jVar3 != null) {
                                jVar3.a();
                            }
                            sVar.a();
                        }
                    }
                }
            });
        }
    }
}
