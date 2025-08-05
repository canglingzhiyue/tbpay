package com.taobao.android.dxng.bridge;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.r;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicEngine;
import com.taobao.android.weex_framework.adapter.e;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.alo;
import tb.alq;
import tb.alr;
import tb.als;
import tb.alt;
import tb.alu;
import tb.fuw;
import tb.gfl;
import tb.gfq;
import tb.gfx;
import tb.ggh;
import tb.ggk;
import tb.ggu;
import tb.gha;
import tb.ghe;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bJ\u001c\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004J\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0003J \u0010 \u001a\u0004\u0018\u00010!2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\"H\u0002J \u0010#\u001a\u0004\u0018\u00010\u00162\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\"H\u0002J%\u0010$\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\"H\u0002¢\u0006\u0002\u0010%J \u0010&\u001a\u0004\u0018\u00010\u00112\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0004J\u001a\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u0011H\u0002J\u001c\u0010)\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004J\u001c\u0010*\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004J\u001c\u0010+\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004J\u001e\u0010,\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\"J\u001c\u0010-\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004J\u001e\u0010.\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004R&\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/taobao/android/dxng/bridge/DXNativeLogicBridge;", "Ljava/io/Serializable;", "()V", "needRefreshStateProtocolMap", "", "", "", "Ljava/lang/ref/WeakReference;", "Lcom/taobao/android/dxv4common/model/responsive/IDXStateProtocol;", "addStateProtocolNode", "", "key", "idxStateProtocol", "asyncCallMegaAbility", "", "params", "", "", "buildAbilityContext", "iAbilityContext", "Lcom/alibaba/ability/env/IAbilityContext;", "runtimeContext", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "convert", "value", "Lcom/taobao/android/dxv4common/model/variable/DXVariableInfo;", "doRefresh", "node", "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "evaluateExprWithNameAndArgs", "getAbilityHubAdapter", "Lcom/alibaba/ability/hub/AbilityHubAdapter;", "getDXEventFromParams", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "", "getDXRuntimeCtxFromParams", "getStateId", "(Ljava/util/Map;)Ljava/lang/Integer;", gha.CONST_FUNC_GET_VAR, e.RECORD_INVOKE_CALLBACK, "callbackWrapper", "log", "markReactActionBegin", "markReactActionEnd", "onExceptionCaught", com.taobao.android.weex_framework.util.a.ATOM_EXT_setState, "syncCallMegaAbility", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class DXNativeLogicBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<Integer, List<WeakReference<gfq>>> needRefreshStateProtocolMap = new LinkedHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/android/dxng/bridge/DXNativeLogicBridge$asyncCallMegaAbility$1", "Lcom/alibaba/ability/callback/IOnCallbackListener;", "onCallback", "", "executeResult", "Lcom/alibaba/ability/result/ExecuteResult;", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class a implements alo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Object b;

        public a(Object obj) {
            this.b = obj;
        }

        @Override // tb.alo
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            q.d(executeResult, "executeResult");
            if (this.b == null) {
                return;
            }
            DXNativeLogicBridge.access$invokeCallback(DXNativeLogicBridge.this, this.b, new JSONObject(executeResult.c()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ DXRuntimeContext b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ JSONObject e;
        public final /* synthetic */ JSONObject[] f;
        public final /* synthetic */ CountDownLatch g;
        public final /* synthetic */ alu h;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/android/dxng/bridge/DXNativeLogicBridge$syncCallMegaAbility$1$executeResult$1", "Lcom/alibaba/ability/callback/IOnCallbackListener;", "onCallback", "", "ignored", "Lcom/alibaba/ability/result/ExecuteResult;", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
        /* loaded from: classes5.dex */
        public static final class a implements alo {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult ignored) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f183ed74", new Object[]{this, ignored});
                } else {
                    q.d(ignored, "ignored");
                }
            }
        }

        public b(DXRuntimeContext dXRuntimeContext, alu aluVar, String str, String str2, JSONObject jSONObject, JSONObject[] jSONObjectArr, CountDownLatch countDownLatch) {
            this.b = dXRuntimeContext;
            this.h = aluVar;
            this.c = str;
            this.d = str2;
            this.e = jSONObject;
            this.f = jSONObjectArr;
            this.g = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                alq alqVar = new alq();
                DXNativeLogicBridge dXNativeLogicBridge = DXNativeLogicBridge.this;
                DXRuntimeContext dXRuntimeContext = this.b;
                q.a(dXRuntimeContext);
                DXNativeLogicBridge.access$buildAbilityContext(dXNativeLogicBridge, alqVar, dXRuntimeContext);
                ExecuteResult a2 = this.h.a(this.c, this.d, alqVar, this.e, new a());
                q.b(a2, "mAdapter.syncCall(abilit…                       })");
                if (a2 != null) {
                    this.f[0] = new JSONObject(a2.c());
                }
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    this.g.countDown();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/android/dxng/bridge/DXNativeLogicBridge$syncCallMegaAbility$executeResult$1", "Lcom/alibaba/ability/callback/IOnCallbackListener;", "onCallback", "", "ignored", "Lcom/alibaba/ability/result/ExecuteResult;", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class c implements alo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.alo
        public void onCallback(ExecuteResult ignored) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, ignored});
            } else {
                q.d(ignored, "ignored");
            }
        }
    }

    public final void doRefresh(DXWidgetNode node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c05bfb8", new Object[]{this, node});
        } else {
            q.d(node, "node");
        }
    }

    public static final /* synthetic */ void access$buildAbilityContext(DXNativeLogicBridge dXNativeLogicBridge, als alsVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5d2c3d", new Object[]{dXNativeLogicBridge, alsVar, dXRuntimeContext});
        } else {
            dXNativeLogicBridge.buildAbilityContext(alsVar, dXRuntimeContext);
        }
    }

    public static final /* synthetic */ void access$invokeCallback(DXNativeLogicBridge dXNativeLogicBridge, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee5109e6", new Object[]{dXNativeLogicBridge, obj, obj2});
        } else {
            dXNativeLogicBridge.invokeCallback(obj, obj2);
        }
    }

    public final void log(Map<String, Object> params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feca465a", new Object[]{this, params});
            return;
        }
        q.d(params, "params");
        Object obj = params.get("tag");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        Object obj2 = params.get("content");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        if (TextUtils.isEmpty(str)) {
            fuw.a(str2);
        } else {
            fuw.a(str, str2);
        }
    }

    public final void asyncCallMegaAbility(Map<String, Object> params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5804260", new Object[]{this, params});
            return;
        }
        q.d(params, "params");
        DXRuntimeContext dXRuntimeCtxFromParams = getDXRuntimeCtxFromParams(params);
        alu abilityHubAdapter = getAbilityHubAdapter(dXRuntimeCtxFromParams);
        if (abilityHubAdapter == null) {
            return;
        }
        Object obj = params.get("name");
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        String str = (String) obj;
        Object obj2 = params.get("api");
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        String str2 = (String) obj2;
        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(params.get("params")));
        Object obj3 = params.get("callback");
        try {
            if (dXRuntimeCtxFromParams == null) {
                if (DinamicXEngine.j()) {
                    throw new RuntimeException(" asyncCallMegaAbility runtimeContext == null ");
                }
                return;
            }
            alq alqVar = new alq();
            buildAbilityContext(alqVar, dXRuntimeCtxFromParams);
            abilityHubAdapter.b(str, str2, alqVar, parseObject, new a(obj3));
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
            if (obj3 == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "type", "result");
            jSONObject2.put((JSONObject) "statusCode", (String) 199);
            jSONObject2.put((JSONObject) "msg", e.getMessage());
            invokeCallback(obj3, jSONObject);
        }
    }

    private final void invokeCallback(Object obj, Object obj2) {
        Method method = obj.getClass().getMethod("onCallback", Map.class);
        q.b(method, "callbackWrapper.javaClas…llback\", Map::class.java)");
        method.invoke(obj, obj2);
    }

    public final Object evaluateExprWithNameAndArgs(Map<String, Object> params) {
        gfx[] gfxVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6e255de9", new Object[]{this, params});
        }
        q.d(params, "params");
        if (params.get("passParams") == null) {
            return null;
        }
        DXRuntimeContext dXRuntimeCtxFromParams = getDXRuntimeCtxFromParams(params);
        if (dXRuntimeCtxFromParams == null) {
            if (DinamicXEngine.j()) {
                throw new RuntimeException(" evaluateExprWithNameAndArgs runtimeContext == null ");
            }
            return null;
        }
        Object obj = params.get("argsObj");
        Object obj2 = params.get("exprName");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str = (String) obj2;
        if (obj instanceof Collection) {
            Iterable<Object> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(p.a(iterable, 10));
            for (Object obj3 : iterable) {
                arrayList.add(gfx.b(obj3));
            }
            Object[] array = arrayList.toArray(new gfx[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            gfxVarArr = (gfx[]) array;
        } else {
            gfxVarArr = new gfx[0];
        }
        gfx[] gfxVarArr2 = gfxVarArr;
        try {
            DXEvent dXEventFromParams = getDXEventFromParams(params);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(ghe.EXTRA_PARAMS_EVENT, dXEventFromParams);
            if (dXRuntimeCtxFromParams.C() != null) {
                r C = dXRuntimeCtxFromParams.C();
                q.b(C, "dxRuntimeContext.engineContext");
                if (C.b() != null) {
                    r C2 = dXRuntimeCtxFromParams.C();
                    q.b(C2, "dxRuntimeContext.engineContext");
                    DinamicXEngine b2 = C2.b();
                    q.b(b2, "dxRuntimeContext.engineContext.engine");
                    if (b2.x() != null) {
                        r C3 = dXRuntimeCtxFromParams.C();
                        q.b(C3, "dxRuntimeContext.engineContext");
                        DinamicXEngine b3 = C3.b();
                        q.b(b3, "dxRuntimeContext.engineContext.engine");
                        gfx ret = b3.x().a(dXRuntimeCtxFromParams, str, gfx.e(), gfxVarArr2.length, gfxVarArr2, linkedHashMap);
                        q.b(ret, "ret");
                        if (!ret.h()) {
                            return ret.K();
                        }
                        return null;
                    }
                }
            }
            return null;
        } catch (DXExprFunctionError e) {
            com.taobao.android.dinamicx.exception.a.b(e);
            return null;
        }
    }

    public final void setState(Map<String, Object> params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ca5a6f", new Object[]{this, params});
            return;
        }
        q.d(params, "params");
        Integer stateId = getStateId(params);
        int intValue = stateId != null ? stateId.intValue() : -1;
        DXRuntimeContext dXRuntimeCtxFromParams = getDXRuntimeCtxFromParams(params);
        Object obj = params.get("key");
        Object obj2 = params.get("value");
        if (!(dXRuntimeCtxFromParams instanceof DXRuntimeContext)) {
            return;
        }
        DXWidgetNode d = dXRuntimeCtxFromParams.d();
        q.b(d, "dxRuntimeContext.widgetNode");
        gfl dxv4Properties = d.getDxv4Properties();
        if (dxv4Properties == null || dxv4Properties.k() == null) {
            return;
        }
        Map<String, gfq> k = dxv4Properties.k();
        q.b(k, "properties.stateMap");
        gfq gfqVar = k.get(obj);
        if (gfqVar == null) {
            return;
        }
        if (!this.needRefreshStateProtocolMap.containsKey(Integer.valueOf(intValue))) {
            gfqVar.a(obj2);
            return;
        }
        gfqVar.a(obj2, false);
        addStateProtocolNode(intValue, gfqVar);
    }

    public final Object getVariableByName(Map<String, Object> map) {
        Map<String, ggk> variableNameMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("79edfae8", new Object[]{this, map});
        }
        ggk ggkVar = null;
        if (map == null) {
            if (DinamicXEngine.j()) {
                throw new RuntimeException(" DXNativeLogicBridge  getVariableByName params can not be null");
            }
            return null;
        }
        Object obj = map.get("varName");
        DXRuntimeContext dXRuntimeCtxFromParams = getDXRuntimeCtxFromParams(map);
        if (dXRuntimeCtxFromParams == null) {
            if (DinamicXEngine.j()) {
                throw new RuntimeException(" getVariableByName runtimeContext == null ");
            }
            return null;
        }
        DXWidgetNode d = dXRuntimeCtxFromParams.d();
        if (d != null && (variableNameMap = d.getVariableNameMap()) != null) {
            if (q.a((Object) "runtimeContext", obj)) {
                ggkVar = new ggh(dXRuntimeCtxFromParams);
            } else {
                ggkVar = variableNameMap.get(obj);
            }
        }
        return convert(ggkVar);
    }

    private final Object convert(ggk ggkVar) {
        short d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e08b0b53", new Object[]{this, ggkVar});
        }
        if (ggkVar == null || (d = ggkVar.d()) == 0) {
            return null;
        }
        if (d == 1 || d == 2) {
            ggu h = ggkVar.h();
            q.b(h, "value.variableResult");
            return Integer.valueOf(h.e());
        } else if (d == 3) {
            ggu h2 = ggkVar.h();
            q.b(h2, "value.variableResult");
            return Double.valueOf(h2.c());
        } else if (d == 4) {
            ggu h3 = ggkVar.h();
            q.b(h3, "value.variableResult");
            return h3.f().toString();
        } else if (d == 8 || d == 9) {
            ggu h4 = ggkVar.h();
            q.b(h4, "value.variableResult");
            if (h4.f() == null) {
                return null;
            }
            ggu h5 = ggkVar.h();
            q.b(h5, "value.variableResult");
            return h5.f();
        } else if (d == 15) {
            ggu h6 = ggkVar.h();
            q.b(h6, "value.variableResult");
            return Boolean.valueOf(h6.a());
        } else if (!DinamicXEngine.j()) {
            return null;
        } else {
            throw new RuntimeException(" unknow type: " + ((int) d));
        }
    }

    public final void onExceptionCaught(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fdb4ad2", new Object[]{this, map});
        } else if (!DinamicXEngine.j()) {
        } else {
            String jSONString = JSON.toJSONString(map);
            fuw.d("DXNativeLogicBridge", jSONString);
            throw new RuntimeException(jSONString);
        }
    }

    public final Object syncCallMegaAbility(Map<String, Object> params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e627a53", new Object[]{this, params});
        }
        q.d(params, "params");
        DXRuntimeContext dXRuntimeCtxFromParams = getDXRuntimeCtxFromParams(params);
        alu abilityHubAdapter = getAbilityHubAdapter(dXRuntimeCtxFromParams);
        if (abilityHubAdapter == null) {
            return null;
        }
        Object obj = params.get("name");
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        String str = (String) obj;
        Object obj2 = params.get("api");
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        String str2 = (String) obj2;
        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(params.get("params")));
        JSONObject[] jSONObjectArr = {new JSONObject()};
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        q.b(mainLooper, "Looper.getMainLooper()");
        if (q.a(currentThread, mainLooper.getThread())) {
            try {
                alq alqVar = new alq();
                q.a(dXRuntimeCtxFromParams);
                buildAbilityContext(alqVar, dXRuntimeCtxFromParams);
                ExecuteResult a2 = abilityHubAdapter.a(str, str2, alqVar, parseObject, new c());
                q.b(a2, "mAdapter.syncCall(abilit…{}\n                    })");
                if (a2 != null) {
                    jSONObjectArr[0] = new JSONObject(a2.c());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            new Handler(Looper.getMainLooper()).post(new b(dXRuntimeCtxFromParams, abilityHubAdapter, str, str2, parseObject, jSONObjectArr, countDownLatch));
            try {
                countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return jSONObjectArr[0];
    }

    private final alu getAbilityHubAdapter(DXRuntimeContext dXRuntimeContext) {
        DinamicXEngine D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (alu) ipChange.ipc$dispatch("ce9ed676", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext != null && (D = dXRuntimeContext.D()) != null) {
            return D.P();
        }
        return null;
    }

    private final DXRuntimeContext getDXRuntimeCtxFromParams(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("8f248212", new Object[]{this, map});
        }
        Map map2 = (Map) map.get("passParams");
        Object obj = map2 != null ? map2.get("params") : null;
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map3 = (Map) obj;
        Object obj2 = map3 != null ? map3.get(DXNativeLogicEngine.TAG_DXRUNTINECONTEXT) : null;
        if (!(obj2 instanceof DXRuntimeContext)) {
            obj2 = null;
        }
        return (DXRuntimeContext) obj2;
    }

    private final DXEvent getDXEventFromParams(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEvent) ipChange.ipc$dispatch("912012fa", new Object[]{this, map});
        }
        Map map2 = (Map) map.get("passParams");
        Object obj = map2 != null ? map2.get("params") : null;
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map3 = (Map) obj;
        Object obj2 = map3 != null ? map3.get("dx_event") : null;
        if (!(obj2 instanceof DXEvent)) {
            obj2 = null;
        }
        return (DXEvent) obj2;
    }

    private final Integer getStateId(Map<String, ? extends Object> map) {
        Object obj;
        String obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("d960002f", new Object[]{this, map});
        }
        try {
            Map map2 = (Map) map.get("passParams");
            Object obj3 = map2 != null ? map2.get("params") : null;
            if (!(obj3 instanceof Map)) {
                obj3 = null;
            }
            Map map3 = (Map) obj3;
            if (map3 != null && (obj = map3.get("state_id")) != null && (obj2 = obj.toString()) != null) {
                return Integer.valueOf(Integer.parseInt(obj2));
            }
            return null;
        } catch (Exception unused) {
            return -1;
        }
    }

    private final void buildAbilityContext(als alsVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("845243f3", new Object[]{this, alsVar, dXRuntimeContext});
        } else if (!(dXRuntimeContext instanceof DXRuntimeContext)) {
        } else {
            l lVar = new l();
            lVar.a(dXRuntimeContext.m());
            lVar.a(dXRuntimeContext.v());
            r C = dXRuntimeContext.C();
            q.b(C, "runtimeContext.engineContext");
            DinamicXEngine b2 = C.b();
            q.b(b2, "runtimeContext.engineContext.engine");
            lVar.a(b2.l());
            lVar.a(dXRuntimeContext.s());
            lVar.a(dXRuntimeContext.d());
            alsVar.a(lVar);
            alr alrVar = new alr(dXRuntimeContext.A(), "DX");
            alrVar.a(dXRuntimeContext.m());
            alsVar.a((alt) alrVar);
        }
    }

    public final void markReactActionEnd(Map<String, Object> params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f525c10b", new Object[]{this, params});
            return;
        }
        q.d(params, "params");
        Integer stateId = getStateId(params);
        int intValue = stateId != null ? stateId.intValue() : -1;
        try {
            List<WeakReference<gfq>> list = this.needRefreshStateProtocolMap.get(Integer.valueOf(intValue));
            this.needRefreshStateProtocolMap.remove(Integer.valueOf(intValue));
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    gfq gfqVar = (gfq) ((WeakReference) it.next()).get();
                    if (gfqVar != null) {
                        gfqVar.e();
                    }
                }
            }
        } catch (Exception unused) {
        } finally {
            this.needRefreshStateProtocolMap.remove(Integer.valueOf(intValue));
        }
    }

    public final void markReactActionBegin(Map<String, Object> params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b564287d", new Object[]{this, params});
            return;
        }
        q.d(params, "params");
        Integer stateId = getStateId(params);
        this.needRefreshStateProtocolMap.put(Integer.valueOf(stateId != null ? stateId.intValue() : -1), new ArrayList());
    }

    public final boolean addStateProtocolNode(int i, gfq idxStateProtocol) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd313014", new Object[]{this, new Integer(i), idxStateProtocol})).booleanValue();
        }
        q.d(idxStateProtocol, "idxStateProtocol");
        if (this.needRefreshStateProtocolMap.get(Integer.valueOf(i)) == null) {
            this.needRefreshStateProtocolMap.put(Integer.valueOf(i), new ArrayList());
        }
        List<WeakReference<gfq>> list = this.needRefreshStateProtocolMap.get(Integer.valueOf(i));
        q.a(list);
        List<WeakReference<gfq>> list2 = list;
        Iterator<WeakReference<gfq>> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            } else if (q.a(it.next().get(), idxStateProtocol)) {
                break;
            }
        }
        if (z) {
            list2.add(new WeakReference<>(idxStateProtocol));
        }
        return true;
    }
}
