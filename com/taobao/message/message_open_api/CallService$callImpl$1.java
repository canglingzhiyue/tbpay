package com.taobao.message.message_open_api;

import android.content.Context;
import android.os.Handler;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.launcher.init.FeatureInitHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/message/message_open_api/CallService$callImpl$1", "Lcom/taobao/message/kit/threadpool/BaseRunnable;", e.RECORD_EXECUTE, "", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class CallService$callImpl$1 extends BaseRunnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $api;
    public final /* synthetic */ Class $clazz;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ JSONObject $data;
    public final /* synthetic */ Map $ext;
    public final /* synthetic */ Handler $handler;
    public final /* synthetic */ IObserver $observer;
    public final /* synthetic */ Map $options;

    public CallService$callImpl$1(Handler handler, Class cls, Context context, String str, JSONObject jSONObject, Map map, Map map2, IObserver iObserver) {
        this.$handler = handler;
        this.$clazz = cls;
        this.$context = context;
        this.$api = str;
        this.$data = jSONObject;
        this.$options = map;
        this.$ext = map2;
        this.$observer = iObserver;
    }

    @Override // com.taobao.message.kit.threadpool.BaseRunnable
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        FeatureInitHelper.directInit(CallService$callImpl$1$execute$1.INSTANCE);
        this.$handler.post(new Runnable() { // from class: com.taobao.message.message_open_api.CallService$callImpl$1$execute$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                Object invoke = CallService$callImpl$1.this.$clazz.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                if (!(invoke instanceof ICallService)) {
                    CallService$callImpl$1.this.$observer.onError(new RuntimeException("callManager is null"));
                    return;
                }
                ICallService iCallService = (ICallService) invoke;
                CallService.access$setMService$p(CallService.INSTANCE, iCallService);
                iCallService.call(CallService$callImpl$1.this.$context, CallService$callImpl$1.this.$api, CallService$callImpl$1.this.$data, CallService$callImpl$1.this.$options, CallService$callImpl$1.this.$ext, CallService$callImpl$1.this.$observer);
                t tVar = t.INSTANCE;
            }
        });
    }
}
