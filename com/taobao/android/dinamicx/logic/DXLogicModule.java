package com.taobao.android.dinamicx.logic;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.u;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.util.k;
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
import tb.gfl;
import tb.gfq;
import tb.ggk;

/* loaded from: classes5.dex */
public class DXLogicModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final alu mAdapter;

    public static /* synthetic */ Object ipc$super(DXLogicModule dXLogicModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(DXLogicModule dXLogicModule, als alsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a86b20", new Object[]{dXLogicModule, alsVar});
        } else {
            dXLogicModule.buildAbilityContext(alsVar);
        }
    }

    public static /* synthetic */ alu access$100(DXLogicModule dXLogicModule) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (alu) ipChange.ipc$dispatch("ba111005", new Object[]{dXLogicModule}) : dXLogicModule.mAdapter;
    }

    public static /* synthetic */ JSONObject access$200(DXLogicModule dXLogicModule, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("624bb480", new Object[]{dXLogicModule, str}) : dXLogicModule.createExceptionObject(str);
    }

    public DXLogicModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        alr alrVar = new alr(StringUtils.isEmpty(mUSDKInstance.getOriginURLString()) ? mUSDKInstance.getOriginURLString() : "default", "DX");
        this.mAdapter = new alu(alrVar);
        alrVar.a(mUSDKInstance.getContext().a());
    }

    @MUSMethod(uiThread = true)
    public void asyncCall(final String str, final String str2, MUSValue mUSValue, final com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad80759", new Object[]{this, str, str2, mUSValue, bVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (mUSValue != null) {
            try {
                if (mUSValue.getType() == 8) {
                    jSONObject = JSON.parseObject(mUSValue.getJSONStringValue());
                }
            } catch (Exception e) {
                com.taobao.android.dinamicx.exception.a.b(e);
                if (bVar == null) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", (Object) "result");
                jSONObject2.put("statusCode", (Object) 199);
                jSONObject2.put("msg", (Object) e.getMessage());
                bVar.b(jSONObject2);
                return;
            }
        }
        alq alqVar = new alq();
        buildAbilityContext(alqVar);
        this.mAdapter.b(str, str2, alqVar, jSONObject, new alo() { // from class: com.taobao.android.dinamicx.logic.DXLogicModule.1
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
    }

    @MUSMethod(uiThread = false)
    public JSONObject syncCall(final String str, final String str2, MUSValue mUSValue, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("74e1d318", new Object[]{this, str, str2, mUSValue, bVar});
        }
        JSONObject jSONObject = new JSONObject();
        if (mUSValue != null) {
            try {
                if (mUSValue.getType() == 8) {
                    jSONObject = JSON.parseObject(mUSValue.getJSONStringValue());
                }
            } catch (Exception e) {
                com.taobao.android.dinamicx.exception.a.b(e);
            }
        }
        final JSONObject jSONObject2 = jSONObject;
        final JSONObject[] jSONObjectArr = {new JSONObject()};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.dinamicx.logic.DXLogicModule.2
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
                    DXLogicModule.access$000(DXLogicModule.this, alqVar);
                    ExecuteResult a2 = DXLogicModule.access$100(DXLogicModule.this).a(str, str2, alqVar, jSONObject2, new alo() { // from class: com.taobao.android.dinamicx.logic.DXLogicModule.2.1
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
                    jSONObjectArr[0] = DXLogicModule.access$200(DXLogicModule.this, th.getMessage());
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(Constants.STARTUP_TIME_LEVEL_1, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            createExceptionObject(e2.getMessage());
        }
        return jSONObjectArr[0];
    }

    @MUSMethod(uiThread = true)
    public void setStateFromNativeSync(String str, Object obj, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d24f4b0f", new Object[]{this, str, obj, bVar});
        } else {
            setState(str, obj);
        }
    }

    @MUSMethod(uiThread = false)
    public void setStateFromNativeAsync(String str, Object obj, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c00010", new Object[]{this, str, obj, bVar});
        } else {
            setState(str, obj);
        }
    }

    @MUSMethod(uiThread = false)
    public void logNative(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba4796", new Object[]{this, str, str2});
        } else {
            fuw.d(str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[LOOP:0: B:18:0x003f->B:20:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[Catch: DXExprFunctionError -> 0x0080, TryCatch #0 {DXExprFunctionError -> 0x0080, blocks: (B:21:0x004f, B:23:0x0072, B:25:0x0077), top: B:31:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[Catch: DXExprFunctionError -> 0x0080, TRY_LEAVE, TryCatch #0 {DXExprFunctionError -> 0x0080, blocks: (B:21:0x004f, B:23:0x0072, B:25:0x0077), top: B:31:0x004f }] */
    @com.taobao.android.weex_framework.ui.MUSMethod(uiThread = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.weex_framework.MUSValue evaluateExprWithNameAndArgs(java.lang.String r11, java.lang.Object r12) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx.logic.DXLogicModule.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r10
            r2 = 1
            r1[r2] = r11
            r11 = 2
            r1[r11] = r12
            java.lang.String r11 = "f60b2281"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            com.taobao.android.weex_framework.MUSValue r11 = (com.taobao.android.weex_framework.MUSValue) r11
            return r11
        L1b:
            com.taobao.android.dinamicx.DXRuntimeContext r0 = r10.getDXRuntimeContext()
            boolean r1 = r0 instanceof com.taobao.android.dinamicx.DXRuntimeContext
            if (r1 == 0) goto L84
            boolean r1 = r12 instanceof java.lang.String
            if (r1 == 0) goto L34
            java.lang.String r12 = (java.lang.String) r12
            int r1 = r12.length()
            if (r1 <= 0) goto L34
            com.alibaba.fastjson.JSONArray r12 = com.alibaba.fastjson.JSON.parseArray(r12)
            goto L35
        L34:
            r12 = 0
        L35:
            if (r12 != 0) goto L39
            r1 = 0
            goto L3d
        L39:
            int r1 = r12.size()
        L3d:
            tb.gfx[] r8 = new tb.gfx[r1]
        L3f:
            int r1 = r8.length
            if (r2 >= r1) goto L4f
            java.lang.Object r1 = r12.get(r2)
            tb.gfx r1 = tb.gfx.b(r1)
            r8[r2] = r1
            int r2 = r2 + 1
            goto L3f
        L4f:
            r12 = r0
            com.taobao.android.dinamicx.DXRuntimeContext r12 = (com.taobao.android.dinamicx.DXRuntimeContext) r12     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L80
            com.taobao.android.dinamicx.r r12 = r12.C()     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L80
            com.taobao.android.dinamicx.DinamicXEngine r12 = r12.b()     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L80
            tb.ggz r3 = r12.x()     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L80
            r4 = r0
            com.taobao.android.dinamicx.DXRuntimeContext r4 = (com.taobao.android.dinamicx.DXRuntimeContext) r4     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L80
            tb.gfx r6 = tb.gfx.e()     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L80
            int r7 = r8.length     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L80
            r9 = 0
            r5 = r11
            tb.gfx r11 = r3.a(r4, r5, r6, r7, r8, r9)     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L80
            boolean r12 = r11.h()     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L80
            if (r12 == 0) goto L77
            com.taobao.android.weex_framework.MUSValue r11 = com.taobao.android.weex_framework.MUSValue.ofNill()     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L80
            return r11
        L77:
            java.lang.Object r11 = r11.K()     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L80
            com.taobao.android.weex_framework.MUSValue r11 = com.taobao.android.weex_framework.util.k.b(r11)     // Catch: com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError -> L80
            return r11
        L80:
            r11 = move-exception
            com.taobao.android.dinamicx.exception.a.b(r11)
        L84:
            com.taobao.android.weex_framework.MUSValue r11 = com.taobao.android.weex_framework.MUSValue.ofNill()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.logic.DXLogicModule.evaluateExprWithNameAndArgs(java.lang.String, java.lang.Object):com.taobao.android.weex_framework.MUSValue");
    }

    @MUSMethod(uiThread = false)
    public MUSValue getVariableByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("fe8bdbe", new Object[]{this, str});
        }
        try {
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext instanceof DXRuntimeContext) {
                if (Objects.equals(str, "runtimeContext")) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", (Object) dXRuntimeContext.e());
                    return k.b(jSONObject);
                }
                return convert(u.g().d().a(dXRuntimeContext, str));
            }
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
        }
        return MUSValue.ofNill();
    }

    private void buildAbilityContext(als alsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cfa1802", new Object[]{this, alsVar});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (!(dXRuntimeContext instanceof DXRuntimeContext)) {
            return;
        }
        l lVar = new l();
        DXRuntimeContext dXRuntimeContext2 = dXRuntimeContext;
        lVar.a(dXRuntimeContext2.m());
        lVar.a(dXRuntimeContext2.v());
        lVar.a(dXRuntimeContext2.C().b().l());
        lVar.a(dXRuntimeContext2.s());
        lVar.a(dXRuntimeContext2.d());
        alsVar.a(lVar);
        alr alrVar = new alr(dXRuntimeContext2.A(), "DX");
        alrVar.a(dXRuntimeContext2.m());
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

    private void setState(String str, Object obj) {
        gfl dxv4Properties;
        gfq gfqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c480d27c", new Object[]{this, str, obj});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (!(dXRuntimeContext instanceof DXRuntimeContext) || (dxv4Properties = dXRuntimeContext.d().getDxv4Properties()) == null || dxv4Properties.k() == null || (gfqVar = dxv4Properties.k().get(str)) == null) {
            return;
        }
        gfqVar.a(obj);
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

    private DXRuntimeContext getDXRuntimeContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("a960eebf", new Object[]{this});
        }
        Object executeContext = getInstance().getExecuteContext();
        if (!(executeContext instanceof Map)) {
            return null;
        }
        Object obj = ((Map) executeContext).get("runtimeContext");
        if (!(obj instanceof DXRuntimeContext)) {
            return null;
        }
        return (DXRuntimeContext) obj;
    }
}
