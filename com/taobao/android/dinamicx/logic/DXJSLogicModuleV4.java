package com.taobao.android.dinamicx.logic;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.u;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicEngine;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.util.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.alo;
import tb.alq;
import tb.alr;
import tb.als;
import tb.alt;
import tb.alu;
import tb.fuw;
import tb.fux;
import tb.fxe;
import tb.gfl;
import tb.gfq;
import tb.ggk;

/* loaded from: classes5.dex */
public class DXJSLogicModuleV4 extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final alu mAdapter;
    private Map<Integer, List<WeakReference<gfq>>> needRefreshStateProtocolMap;

    public static /* synthetic */ Object ipc$super(DXJSLogicModuleV4 dXJSLogicModuleV4, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ DXRuntimeContext access$000(DXJSLogicModuleV4 dXJSLogicModuleV4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRuntimeContext) ipChange.ipc$dispatch("e969381a", new Object[]{dXJSLogicModuleV4, jSONObject}) : dXJSLogicModuleV4.getDXRuntimeContextFromEnvArgs(jSONObject);
    }

    public static /* synthetic */ void access$100(DXJSLogicModuleV4 dXJSLogicModuleV4, als alsVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a30dfdb", new Object[]{dXJSLogicModuleV4, alsVar, dXRuntimeContext});
        } else {
            dXJSLogicModuleV4.buildAbilityContext(alsVar, dXRuntimeContext);
        }
    }

    public static /* synthetic */ alu access$200(DXJSLogicModuleV4 dXJSLogicModuleV4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (alu) ipChange.ipc$dispatch("308ba77b", new Object[]{dXJSLogicModuleV4}) : dXJSLogicModuleV4.mAdapter;
    }

    public static /* synthetic */ JSONObject access$300(DXJSLogicModuleV4 dXJSLogicModuleV4, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("81bfa7ca", new Object[]{dXJSLogicModuleV4, str}) : dXJSLogicModuleV4.createExceptionObject(str);
    }

    public DXJSLogicModuleV4(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        this.needRefreshStateProtocolMap = new HashMap();
        alr alrVar = new alr(StringUtils.isEmpty(mUSDKInstance.getOriginURLString()) ? mUSDKInstance.getOriginURLString() : "default", "DX");
        this.mAdapter = new alu(alrVar);
        alrVar.a(mUSDKInstance.getContext().a());
    }

    @MUSMethod(uiThread = true)
    public void asyncCall(final String str, final String str2, JSONObject jSONObject, JSONObject jSONObject2, final com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f8bec6c", new Object[]{this, str, str2, jSONObject, jSONObject2, bVar});
            return;
        }
        try {
            alq alqVar = new alq();
            buildAbilityContext(alqVar, getDXRuntimeContextFromEnvArgs(jSONObject2));
            this.mAdapter.b(str, str2, alqVar, jSONObject, new alo() { // from class: com.taobao.android.dinamicx.logic.DXJSLogicModuleV4.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.alo
                public void onCallback(ExecuteResult executeResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                    } else if (bVar == null) {
                    } else {
                        JSONObject jSONObject3 = new JSONObject(executeResult.c());
                        if (DinamicXEngine.j()) {
                            fuw.d("mega", str + ":" + str2 + " callback " + jSONObject3.toJSONString());
                        }
                        bVar.b(jSONObject3);
                    }
                }
            });
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
            if (bVar == null) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", (Object) "result");
            jSONObject3.put("statusCode", (Object) 199);
            jSONObject3.put("msg", (Object) e.getMessage());
            bVar.b(jSONObject3);
        }
    }

    @MUSMethod(uiThread = false)
    public Object syncCall(final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6e6fdbfe", new Object[]{this, str, str2, jSONObject, jSONObject2});
        }
        final JSONObject[] jSONObjectArr = {new JSONObject()};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.logic.DXJSLogicModuleV4.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    alq alqVar = new alq();
                    DXJSLogicModuleV4.access$100(DXJSLogicModuleV4.this, alqVar, DXJSLogicModuleV4.access$000(DXJSLogicModuleV4.this, jSONObject2));
                    ExecuteResult a2 = DXJSLogicModuleV4.access$200(DXJSLogicModuleV4.this).a(str, str2, alqVar, jSONObject, new alo() { // from class: com.taobao.android.dinamicx.logic.DXJSLogicModuleV4.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.alo
                        public void onCallback(ExecuteResult executeResult) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                            }
                        }
                    });
                    if (a2 != null) {
                        jSONObjectArr[0] = new JSONObject(a2.c());
                    }
                } catch (Throwable th) {
                    jSONObjectArr[0] = DXJSLogicModuleV4.access$300(DXJSLogicModuleV4.this, th.getMessage());
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(Constants.STARTUP_TIME_LEVEL_1, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            createExceptionObject(e.getMessage());
        }
        return jSONObjectArr[0];
    }

    @MUSMethod(uiThread = true)
    public void setState(String str, Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e472a7f4", new Object[]{this, str, obj, jSONObject});
            return;
        }
        try {
            if (obj instanceof String) {
                obj = JSON.parse((String) obj);
            }
        } catch (JSONException e) {
            com.taobao.android.dinamicx.exception.a.b(e);
        }
        _setState(str, obj, jSONObject);
    }

    @MUSMethod(uiThread = false)
    public void onExceptionCaught(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29950fd", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String jSONString = jSONObject.toJSONString();
            if (!DinamicXEngine.j()) {
                return;
            }
            fuw.b(jSONString);
            throw new RuntimeException(jSONString);
        }
    }

    @MUSMethod(uiThread = false)
    public void log(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1175515f", new Object[]{this, str, str2});
        } else {
            fuw.d(str, str2);
        }
    }

    @MUSMethod(uiThread = true)
    public void markReactActionEnd(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b45db09", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            List<WeakReference<gfq>> list = this.needRefreshStateProtocolMap.get(Integer.valueOf(i));
            this.needRefreshStateProtocolMap.remove(Integer.valueOf(i));
            if (list != null) {
                for (WeakReference<gfq> weakReference : list) {
                    gfq gfqVar = weakReference.get();
                    if (gfqVar != null) {
                        gfqVar.e();
                    }
                }
            }
        } catch (Exception unused) {
        } finally {
            this.needRefreshStateProtocolMap.remove(Integer.valueOf(i));
        }
    }

    @MUSMethod(uiThread = true)
    public void markReactActionBegin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ca051fb", new Object[]{this, new Integer(i)});
        } else {
            this.needRefreshStateProtocolMap.put(Integer.valueOf(i), new ArrayList());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045 A[LOOP:0: B:18:0x0042->B:20:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: DXExprFunctionError -> 0x0090, TryCatch #0 {DXExprFunctionError -> 0x0090, blocks: (B:21:0x0052, B:23:0x0082, B:25:0x0087), top: B:31:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[Catch: DXExprFunctionError -> 0x0090, TRY_LEAVE, TryCatch #0 {DXExprFunctionError -> 0x0090, blocks: (B:21:0x0052, B:23:0x0082, B:25:0x0087), top: B:31:0x0052 }] */
    @com.taobao.android.weex_framework.ui.MUSMethod(uiThread = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.weex_framework.MUSValue evaluateExprWithNameAndArgs(java.lang.String r11, java.lang.Object r12, com.alibaba.fastjson.JSONObject r13) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx.logic.DXJSLogicModuleV4.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1e
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r10
            r2 = 1
            r1[r2] = r11
            r11 = 2
            r1[r11] = r12
            r11 = 3
            r1[r11] = r13
            java.lang.String r11 = "5f7c1d55"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            com.taobao.android.weex_framework.MUSValue r11 = (com.taobao.android.weex_framework.MUSValue) r11
            return r11
        L1e:
            com.taobao.android.dinamicx.DXRuntimeContext r0 = r10.getDXRuntimeContextFromEnvArgs(r13)
            boolean r1 = r0 instanceof com.taobao.android.dinamicx.DXRuntimeContext
            if (r1 == 0) goto L94
            boolean r1 = r12 instanceof java.lang.String
            if (r1 == 0) goto L37
            java.lang.String r12 = (java.lang.String) r12
            int r1 = r12.length()
            if (r1 <= 0) goto L37
            com.alibaba.fastjson.JSONArray r12 = com.alibaba.fastjson.JSON.parseArray(r12)
            goto L38
        L37:
            r12 = 0
        L38:
            if (r12 != 0) goto L3c
            r1 = 0
            goto L40
        L3c:
            int r1 = r12.size()
        L40:
            tb.gfx[] r8 = new tb.gfx[r1]
        L42:
            int r1 = r8.length
            if (r2 >= r1) goto L52
            java.lang.Object r1 = r12.get(r2)
            tb.gfx r1 = tb.gfx.b(r1)
            r8[r2] = r1
            int r2 = r2 + 1
            goto L42
        L52:
            com.taobao.android.dinamicx.expression.event.DXEvent r12 = r10.getDXEventFormEnvArgs(r13)     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            java.util.HashMap r9 = new java.util.HashMap     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            r9.<init>()     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            java.lang.String r13 = "extra_params_event"
            r9.put(r13, r12)     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            r12 = r0
            com.taobao.android.dinamicx.DXRuntimeContext r12 = (com.taobao.android.dinamicx.DXRuntimeContext) r12     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            com.taobao.android.dinamicx.r r12 = r12.C()     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            com.taobao.android.dinamicx.DinamicXEngine r12 = r12.b()     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            tb.ggz r3 = r12.x()     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            r4 = r0
            com.taobao.android.dinamicx.DXRuntimeContext r4 = (com.taobao.android.dinamicx.DXRuntimeContext) r4     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            tb.gfx r6 = tb.gfx.e()     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            int r7 = r8.length     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            r5 = r11
            tb.gfx r11 = r3.a(r4, r5, r6, r7, r8, r9)     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            boolean r12 = r11.h()     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            if (r12 == 0) goto L87
            com.taobao.android.weex_framework.MUSValue r11 = com.taobao.android.weex_framework.MUSValue.ofNill()     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            return r11
        L87:
            java.lang.Object r11 = r11.K()     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            com.taobao.android.weex_framework.MUSValue r11 = com.taobao.android.weex_framework.util.k.b(r11)     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L90
            return r11
        L90:
            r11 = move-exception
            com.taobao.android.dinamicx.exception.a.b(r11)
        L94:
            com.taobao.android.weex_framework.MUSValue r11 = com.taobao.android.weex_framework.MUSValue.ofNill()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.logic.DXJSLogicModuleV4.evaluateExprWithNameAndArgs(java.lang.String, java.lang.Object, com.alibaba.fastjson.JSONObject):com.taobao.android.weex_framework.MUSValue");
    }

    @MUSMethod(uiThread = false)
    public MUSValue getVariableByName(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("818f9db8", new Object[]{this, str, jSONObject});
        }
        try {
            DXRuntimeContext dXRuntimeContextFromEnvArgs = getDXRuntimeContextFromEnvArgs(jSONObject);
            if (dXRuntimeContextFromEnvArgs instanceof DXRuntimeContext) {
                if (Objects.equals(str, "runtimeContext")) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("data", (Object) dXRuntimeContextFromEnvArgs.e());
                    return k.b(jSONObject2);
                }
                return convert(u.g().d().a(dXRuntimeContextFromEnvArgs, str));
            }
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
        }
        return MUSValue.ofNill();
    }

    private void buildAbilityContext(als alsVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("845243f3", new Object[]{this, alsVar, dXRuntimeContext});
            return;
        }
        if (dXRuntimeContext == null) {
            dXRuntimeContext = (DXRuntimeContext) getInstance().getExecuteContext();
        }
        if (!(dXRuntimeContext instanceof DXRuntimeContext)) {
            return;
        }
        l lVar = new l();
        lVar.a(dXRuntimeContext.m());
        lVar.a(dXRuntimeContext.v());
        lVar.a(dXRuntimeContext.C().b().l());
        lVar.a(dXRuntimeContext.s());
        lVar.a(dXRuntimeContext.d());
        alsVar.a(lVar);
        alr alrVar = new alr(dXRuntimeContext.A(), "DX");
        alrVar.a(dXRuntimeContext.m());
        alsVar.a((alt) alrVar);
    }

    private JSONObject createExceptionObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("46c33803", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "result");
        jSONObject.put("statusCode", (Object) 199);
        jSONObject.put("msg", (Object) str);
        return jSONObject;
    }

    private void _setState(String str, Object obj, JSONObject jSONObject) {
        gfl dxv4Properties;
        gfq gfqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38490975", new Object[]{this, str, obj, jSONObject});
            return;
        }
        DXRuntimeContext dXRuntimeContextFromEnvArgs = getDXRuntimeContextFromEnvArgs(jSONObject);
        if (!(dXRuntimeContextFromEnvArgs instanceof DXRuntimeContext) || (dxv4Properties = dXRuntimeContextFromEnvArgs.d().getDxv4Properties()) == null || dxv4Properties.k() == null || (gfqVar = dxv4Properties.k().get(str)) == null) {
            return;
        }
        try {
            int intValue = jSONObject.getJSONObject("params").getJSONObject(DXNativeLogicEngine.TAG_DXRUNTINECONTEXT).getIntValue("state_id");
            if (!this.needRefreshStateProtocolMap.containsKey(Integer.valueOf(intValue))) {
                gfqVar.a(obj);
                return;
            }
            addStateProtocolNode(intValue, gfqVar);
            gfqVar.a(obj, false);
        } catch (Exception unused) {
            gfqVar.a(obj);
        }
    }

    private void addStateProtocolNode(int i, gfq gfqVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd313010", new Object[]{this, new Integer(i), gfqVar});
            return;
        }
        List<WeakReference<gfq>> list = this.needRefreshStateProtocolMap.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
            this.needRefreshStateProtocolMap.put(Integer.valueOf(i), list);
        }
        Iterator<WeakReference<gfq>> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().get() == gfqVar) {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            return;
        }
        list.add(new WeakReference<>(gfqVar));
    }

    private static MUSValue convert(ggk ggkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("6aa6f964", new Object[]{ggkVar});
        }
        if (ggkVar == null) {
            return MUSValue.ofNill();
        }
        short d = ggkVar.d();
        if (d == 0) {
            return MUSValue.ofNill();
        }
        if (d == 1 || d == 2) {
            return MUSValue.ofInt(ggkVar.h().e());
        }
        if (d == 3) {
            return MUSValue.ofFloat(ggkVar.h().c());
        }
        if (d == 4) {
            return MUSValue.ofString(ggkVar.h().f().toString());
        }
        if (d == 8 || d == 9) {
            return MUSValue.ofJSON(ggkVar.h().f() == null ? null : ggkVar.h().f());
        } else if (d == 15) {
            return MUSValue.ofBool(ggkVar.h().a());
        } else {
            return MUSValue.ofNill();
        }
    }

    private DXRuntimeContext getDXRuntimeContextFromEnvArgs(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("173224fd", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return (DXRuntimeContext) ((WeakReference) ((Map) getInstance().getExecuteContext()).get(jSONObject.getJSONObject("params").getJSONObject(DXNativeLogicEngine.TAG_DXRUNTINECONTEXT).getString("identifier"))).get();
        } catch (Exception unused) {
            fux.b(" getDXRuntimeContextFromEnvArgs return null");
            return null;
        }
    }

    private DXEvent getDXEventFormEnvArgs(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEvent) ipChange.ipc$dispatch("c11b9685", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return (DXEvent) ((WeakReference) ((Map) getInstance().getExecuteContext()).get(jSONObject.getJSONObject("params").getJSONObject("dx_event").getString("identifier"))).get();
        } catch (Exception unused) {
            fux.b(" getDXEventFormEnvArgs return null");
            return null;
        }
    }
}
