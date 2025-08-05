package com.taobao.android.dinamicx.logic;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicEngine;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.q;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import tb.fuw;
import tb.gfx;
import tb.ghb;

/* loaded from: classes.dex */
public class b implements ghb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f11886a = a.a();
    private AtomicLong b = new AtomicLong();
    private AtomicLong c = new AtomicLong();
    private Map<String, WeakReference<Object>> d = new ConcurrentHashMap();
    private String e = "";
    private String f = "";

    static {
        MUSEngine.registerModule("dxBridge", DXLogicModule.class);
        MUSEngine.registerModule("DXJSBridge", DXJSLogicModuleV4.class);
    }

    @Override // tb.ghb
    public void a(int i, DXRuntimeContext dXRuntimeContext, List<Pair<String, byte[]>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d0d0bd", new Object[]{this, new Integer(i), dXRuntimeContext, list});
        } else if (list != null) {
            try {
                if (!list.isEmpty() && dXRuntimeContext.m() != null) {
                    Context applicationContext = dXRuntimeContext.m().getApplicationContext();
                    DXTemplateItem c = dXRuntimeContext.c();
                    if (TextUtils.isEmpty(this.f)) {
                        this.f = dXRuntimeContext.A();
                    }
                    if (TextUtils.isEmpty(this.e)) {
                        this.e = a.b;
                        if (dXRuntimeContext.C() != null) {
                            DinamicXEngine b = dXRuntimeContext.C().b();
                            if (b != null) {
                                this.e = b.b().b() + "";
                            }
                            this.f11886a.a(this.f, this.e, b);
                        }
                    }
                    if (c == null) {
                        return;
                    }
                    Uri parse = Uri.parse(!TextUtils.isEmpty(c.c) ? c.c : "dx://" + c.f11925a);
                    MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
                    Uri build = parse.buildUpon().appendQueryParameter("inspect_breakpt_key", dXRuntimeContext.c().f11925a).build();
                    mUSInstanceConfig.c(build.toString());
                    mUSInstanceConfig.a(dXRuntimeContext.c().f11925a);
                    mUSInstanceConfig.b(true);
                    MUSDKInstance mUSDKInstance = (MUSDKInstance) q.a().a(applicationContext, mUSInstanceConfig);
                    mUSDKInstance.initWithData((byte[]) list.get(list.size() - 1).second, build);
                    if (list.size() > 1) {
                        for (int i2 = 0; i2 < list.size() - 1; i2++) {
                            Pair<String, byte[]> pair = list.get(i2);
                            mUSDKInstance.executeScript((byte[]) pair.second, (String) pair.first);
                        }
                    }
                    mUSDKInstance.addInstanceEnv(a.f11884a, this.e);
                    mUSDKInstance.execute(null);
                    this.f11886a.a(this.f, i, mUSDKInstance);
                }
            } catch (Exception e) {
                com.taobao.android.dinamicx.exception.a.b(e);
            }
        }
    }

    @Override // tb.ghb
    public void a(int i, DXRuntimeContext dXRuntimeContext, String str, String str2, int i2, gfx[] gfxVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a599129", new Object[]{this, new Integer(i), dXRuntimeContext, str, str2, new Integer(i2), gfxVarArr});
            return;
        }
        try {
            MUSDKInstance a2 = this.f11886a.a(this.f, i);
            if (a2 == null) {
                return;
            }
            gfx[] gfxVarArr2 = new gfx[3];
            JSONObject jSONObject = new JSONObject();
            String str3 = "event_" + this.b.incrementAndGet();
            jSONObject.put("_event", (Object) "event");
            jSONObject.put("identifier", (Object) str3);
            JSONObject jSONObject2 = null;
            DXEvent dXEvent = (gfxVarArr == null || gfxVarArr.length <= 0 || gfxVarArr[0].f()) ? null : (DXEvent) gfxVarArr[0].j();
            if (dXEvent != null && dXEvent.getArgs() != null && !dXEvent.getArgs().isEmpty()) {
                jSONObject2 = new JSONObject();
                for (Map.Entry<String, f> entry : dXEvent.getArgs().entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        jSONObject2.put(entry.getKey(), entry.getValue().D());
                    }
                }
            }
            jSONObject.put("data", (Object) jSONObject2);
            this.d.put(str3, new WeakReference<>(dXEvent));
            gfx a3 = gfx.a((Map<String, Object>) jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            String str4 = "ctx_" + this.c.incrementAndGet();
            jSONObject3.put("identifier", (Object) str4);
            jSONObject3.put("subData", dXRuntimeContext.f() == null ? new JSONObject() : dXRuntimeContext.f());
            jSONObject3.put("data", (Object) (dXRuntimeContext.e() == null ? new JSONObject() : dXRuntimeContext.e()));
            jSONObject3.put("state_id", (Object) Long.valueOf(this.b.get()));
            this.d.put(str4, new WeakReference<>(dXRuntimeContext));
            gfx a4 = gfx.a((Map<String, Object>) jSONObject3);
            this.d.put("runtimeContext", new WeakReference<>(dXRuntimeContext));
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("dx_event", (Object) jSONObject);
            jSONObject4.put(DXNativeLogicEngine.TAG_DXRUNTINECONTEXT, (Object) jSONObject3);
            gfx a5 = gfx.a((Map<String, Object>) jSONObject4);
            gfxVarArr2[0] = a3;
            gfxVarArr2[1] = a5;
            gfxVarArr2[2] = a4;
            MUSValue[] a6 = a(gfxVarArr2.length, gfxVarArr2);
            a6[0] = MUSValue.ofString(str);
            a6[1] = MUSValue.ofString(str2);
            a2.setExecuteContext(this.d);
            a2.execute(a6);
            b();
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Iterator<Map.Entry<String, WeakReference<Object>>> it = this.d.entrySet().iterator();
        if (it == null) {
            return;
        }
        while (it.hasNext()) {
            Map.Entry<String, WeakReference<Object>> next = it.next();
            if (next.getValue() == null || next.getValue().get() == null) {
                it.remove();
                fuw.d("LogicEngineImpl", "iterator.remove()");
            }
        }
    }

    @Override // tb.ghb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f11886a.a(this.f, this.e);
        }
    }

    @Override // tb.ghb
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        MUSDKInstance a2 = this.f11886a.a(this.f, i);
        return a2 != null && !a2.isDestroyed();
    }

    private static MUSValue[] a(int i, gfx[] gfxVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue[]) ipChange.ipc$dispatch("1a24a223", new Object[]{new Integer(i), gfxVarArr});
        }
        MUSValue[] mUSValueArr = new MUSValue[i + 2];
        for (int i2 = 0; i2 < i; i2++) {
            gfx gfxVar = gfxVarArr[i2];
            int d = gfxVar.d();
            switch (d) {
                case 1:
                case 8:
                case 9:
                    mUSValueArr[i2 + 2] = MUSValue.ofNill();
                    break;
                case 2:
                    mUSValueArr[i2 + 2] = MUSValue.ofInt(gfxVar.w());
                    break;
                case 3:
                    mUSValueArr[i2 + 2] = MUSValue.ofFloat((float) gfxVar.A());
                    break;
                case 4:
                    mUSValueArr[i2 + 2] = MUSValue.ofBool(gfxVar.E());
                    break;
                case 5:
                    mUSValueArr[i2 + 2] = MUSValue.ofString(gfxVar.i());
                    break;
                case 6:
                    mUSValueArr[i2 + 2] = MUSValue.ofJSON(gfxVar.o());
                    break;
                case 7:
                    mUSValueArr[i2 + 2] = MUSValue.ofJSON(gfxVar.r());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + d);
            }
        }
        return mUSValueArr;
    }
}
