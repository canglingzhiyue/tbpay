package com.taobao.message.message_open_api_adapter;

import android.content.Context;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.jsi.standard.d;
import com.alibaba.jsi.standard.js.a;
import com.alibaba.jsi.standard.js.j;
import com.alibaba.jsi.standard.js.s;
import com.alibaba.jsi.standard.js.w;
import com.alibaba.jsi.standard.js.y;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.message.kit.jsi.manager.JSIHandler;
import com.taobao.message.message_open_api.CallService;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.message.message_open_api_adapter.Constants;
import com.taobao.tao.log.TLog;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/OpenAPI4JSI;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "mService", "Lcom/taobao/message/message_open_api/ICallService;", "call", "", "ctx", "Landroid/content/Context;", "jsiCtx", "Lcom/alibaba/jsi/standard/JSContext;", "api", "request", "args", "Lcom/alibaba/jsi/standard/js/Arguments;", "count", "", e.RECORD_EXECUTE, "Lcom/alibaba/jsi/standard/js/JSValue;", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class OpenAPI4JSI {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final OpenAPI4JSI INSTANCE;
    public static final String TAG = "cbq@jsi";
    private static ICallService mService;

    static {
        kge.a(-1086193835);
        INSTANCE = new OpenAPI4JSI();
    }

    private OpenAPI4JSI() {
    }

    public final w execute(Context ctx, final d jsiCtx, a args) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("553d4ea9", new Object[]{this, ctx, jsiCtx, args});
        }
        q.c(ctx, "ctx");
        q.c(jsiCtx, "jsiCtx");
        q.c(args, "args");
        int a2 = args.a();
        w a3 = args.a(0);
        if (a3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.jsi.standard.js.JSString");
        }
        s sVar = (s) a3;
        String jsSApi = sVar.p_();
        sVar.a();
        if (!q.a((Object) jsSApi, (Object) "jsc.getVersions")) {
            w a4 = args.a(1);
            if (a4 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.jsi.standard.js.JSString");
            }
            s sVar2 = (s) a4;
            String jSSRequest = sVar2.p_();
            sVar2.a();
            TLog.loge(TAG, "api is " + jsSApi + ", request is " + jSSRequest);
            q.a((Object) jsSApi, "jsSApi");
            q.a((Object) jSSRequest, "jSSRequest");
            call(ctx, jsiCtx, jsSApi, jSSRequest, args, a2);
        } else if (a2 >= 3) {
            w a5 = args.a(2);
            if (a5 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.jsi.standard.js.JSFunction");
            }
            final j jVar = (j) a5;
            TLog.loge(TAG, "api is " + jsSApi);
            JSIHandler.INSTANCE.getHandler().post(new Runnable() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4JSI$execute$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    s sVar3 = new s(JSON.toJSONString(CallService.INSTANCE.getVersions()));
                    TLog.loge(OpenAPI4JSI.TAG, "JSIBridge onNext is " + sVar3.p_());
                    try {
                        if (!d.this.c()) {
                            jVar.a(d.this, (w) null, new s[]{sVar3});
                            JSIHandler.INSTANCE.checkException(d.this);
                        }
                    } catch (Throwable th) {
                        try {
                            TLog.loge(OpenAPI4JSI.TAG, Log.getStackTraceString(th));
                            j jVar2 = jVar;
                            if (jVar2 != null) {
                                jVar2.a();
                            }
                            sVar3.a();
                        } finally {
                            j jVar3 = jVar;
                            if (jVar3 != null) {
                                jVar3.a();
                            }
                            sVar3.a();
                        }
                    }
                }
            });
        }
        return new y();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, com.alibaba.jsi.standard.js.j] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.alibaba.jsi.standard.js.j] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, com.alibaba.jsi.standard.js.j] */
    /* JADX WARN: Type inference failed for: r8v4, types: [T, com.alibaba.jsi.standard.js.j] */
    private final void call(Context context, d dVar, String str, String str2, a aVar, int i) {
        LinkedHashMap linkedHashMap;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject parseObject = JSON.parseObject(str2);
        if (parseObject == null || (jSONObject2 = parseObject.getJSONObject("ext")) == null || (linkedHashMap = jSONObject2.getInnerMap()) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        Map<String, Object> map = linkedHashMap;
        if (parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject3 = jSONObject;
        map.put(Constants.KEY_SUBSCRIBE_TAG, dVar.e());
        map.put(Constants.KEY_CHANNEL_TAG, Constants.Modules.API_WEEX);
        System.currentTimeMillis();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r4 = (j) 0;
        objectRef.element = r4;
        if (i >= 3) {
            w a2 = aVar.a(2);
            if (a2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.jsi.standard.js.JSFunction");
            }
            objectRef.element = (j) a2;
            JSIHandler.INSTANCE.addRecycleValue(dVar.f(), (j) objectRef.element);
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = r4;
        if (i >= 4) {
            w a3 = aVar.a(3);
            if (a3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.jsi.standard.js.JSFunction");
            }
            objectRef2.element = (j) a3;
            JSIHandler.INSTANCE.addRecycleValue(dVar.f(), (j) objectRef2.element);
        }
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = r4;
        if (i >= 5) {
            w a4 = aVar.a(4);
            if (a4 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.jsi.standard.js.JSFunction");
            }
            objectRef3.element = (j) a4;
            JSIHandler.INSTANCE.addRecycleValue(dVar.f(), (j) objectRef3.element);
        }
        if (mService == null) {
            Class<?> cls = Class.forName("com.taobao.message.message_open_api.core.CallManager");
            q.a((Object) cls, "Class.forName(\"com.taoba…en_api.core.CallManager\")");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            if (invoke instanceof ICallService) {
                mService = (ICallService) invoke;
            }
        }
        ICallService iCallService = mService;
        if (iCallService == null) {
            q.a();
        }
        iCallService.call(context, str, jSONObject3, null, map, new OpenAPI4JSI$call$disposable$1(objectRef, dVar, objectRef2, objectRef3));
        t tVar = t.INSTANCE;
    }
}
