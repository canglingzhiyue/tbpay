package com.taobao.message.message_open_api_adapter;

import android.app.Application;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.CallService;
import com.taobao.message.message_open_api.core.CallResponse;
import com.taobao.message.message_open_api_adapter.Constants;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import tb.alm;
import tb.aln;
import tb.als;
import tb.alt;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/OpenAPI4Uni;", "Lcom/alibaba/ability/base/AbsBaseAbility;", "()V", e.RECORD_EXECUTE, "Lcom/alibaba/ability/result/ExecuteResult;", "api", "", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "params", "", "", "callback", "Lcom/alibaba/ability/callback/AbilityCallback;", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class OpenAPI4Uni extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1086182395);
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, final aln callback) {
        Object linkedHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.c(api, "api");
        q.c(context, "context");
        q.c(params, "params");
        q.c(callback, "callback");
        if (q.a((Object) JarvisConstant.KEY_JARVIS_TRIGGER, (Object) api) && params.containsKey("api")) {
            if (params.containsKey("ext")) {
                linkedHashMap = params.get("ext");
                if (linkedHashMap == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                }
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            Map<String, ? extends Object> c = ai.c((Map) linkedHashMap);
            String i = context.i();
            if (i == null) {
                i = "";
            }
            c.put(Constants.KEY_SUBSCRIBE_TAG, i);
            c.put(Constants.KEY_CHANNEL_TAG, Constants.Modules.API_UNI);
            CallService callService = CallService.INSTANCE;
            alt f = context.f();
            q.a((Object) f, "context.abilityEnv");
            Application f2 = f.f();
            if (f2 == null) {
                Application application = ApplicationUtil.getApplication();
                q.a((Object) application, "ApplicationUtil.getApplication()");
                f2 = application;
            }
            callService.call(f2, String.valueOf(params.get("api")), params.containsKey("data") ? JSON.parseObject(JSON.toJSONString(params.get("data"))) : null, null, c, new IObserver<Object>() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4Uni$execute$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onNext(Object var1) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b8495", new Object[]{this, var1});
                        return;
                    }
                    q.c(var1, "var1");
                    aln.this.a(new ExecutingResult(CallResponse.next2map(var1)));
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable e) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, e});
                        return;
                    }
                    q.c(e, "e");
                    aln.this.a(new ExecutingResult(CallResponse.error2map("-1", e.toString())));
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    } else {
                        aln.this.a(new FinishResult(CallResponse.complete2map()));
                    }
                }
            });
        }
        return new ExecutingResult();
    }
}
