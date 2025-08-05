package com.taobao.android.dinamicx.muise;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.q;
import java.util.HashMap;
import java.util.Map;
import tb.fvl;

/* loaded from: classes.dex */
public class a implements fvl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, p> f11914a = new HashMap();

    static {
        MUSEngine.registerModule("DXCoreRef", DXCoreRefModule.class);
        MUSEngine.registerModule("DXCoreRender", DXCoreRenderModule.class);
    }

    @Override // tb.fvl
    public int a(DXRuntimeContext dXRuntimeContext, byte[] bArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cb53853", new Object[]{this, dXRuntimeContext, bArr})).intValue();
        }
        Context m = dXRuntimeContext.m();
        if (m instanceof com.taobao.android.preview.e) {
            com.taobao.android.preview.e eVar = (com.taobao.android.preview.e) m;
            if (!TextUtils.isEmpty(eVar.a())) {
                str = eVar.a();
                Uri parse = Uri.parse(str);
                MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
                Uri build = parse.buildUpon().appendQueryParameter("inspect_breakpt_key", dXRuntimeContext.c().f11925a).build();
                mUSInstanceConfig.c(build.toString());
                mUSInstanceConfig.a(dXRuntimeContext.c().f11925a);
                mUSInstanceConfig.b(true);
                p a2 = q.a().a(dXRuntimeContext.m(), mUSInstanceConfig);
                a2.initWithData(bArr, build);
                this.f11914a.put(Integer.valueOf(a2.getInstanceId()), a2);
                return a2.getInstanceId();
            }
        }
        if (!TextUtils.isEmpty(dXRuntimeContext.c().c)) {
            str = dXRuntimeContext.c().c;
        } else {
            str = "dx://" + dXRuntimeContext.c().f11925a;
        }
        Uri parse2 = Uri.parse(str);
        MUSInstanceConfig mUSInstanceConfig2 = new MUSInstanceConfig();
        Uri build2 = parse2.buildUpon().appendQueryParameter("inspect_breakpt_key", dXRuntimeContext.c().f11925a).build();
        mUSInstanceConfig2.c(build2.toString());
        mUSInstanceConfig2.a(dXRuntimeContext.c().f11925a);
        mUSInstanceConfig2.b(true);
        p a22 = q.a().a(dXRuntimeContext.m(), mUSInstanceConfig2);
        a22.initWithData(bArr, build2);
        this.f11914a.put(Integer.valueOf(a22.getInstanceId()), a22);
        return a22.getInstanceId();
    }

    @Override // tb.fvl
    public void a(int i, DXRuntimeContext dXRuntimeContext, String str, String str2, int i2, f[] fVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86acb68", new Object[]{this, new Integer(i), dXRuntimeContext, str, str2, new Integer(i2), fVarArr});
            return;
        }
        p pVar = this.f11914a.get(Integer.valueOf(i));
        if (pVar == null) {
            return;
        }
        JSONArray a2 = b.a(dXRuntimeContext);
        if (a2 != null && !a2.isEmpty()) {
            pVar.register(a2, "__refs");
        }
        MUSValue[] a3 = a(2, i2, fVarArr);
        a3[0] = MUSValue.ofString(str);
        a3[1] = MUSValue.ofString(str2);
        pVar.setExecuteContext(dXRuntimeContext);
        pVar.execute(a3);
    }

    @Override // tb.fvl
    public void a(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb0bf6eb", new Object[]{this, new Integer(i), str, jSONObject});
            return;
        }
        p pVar = this.f11914a.get(Integer.valueOf(i));
        if (pVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        pVar.dispatchEvent(str, MUSValue.ofJSON(jSONObject));
    }

    @Override // tb.fvl
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        p remove = this.f11914a.remove(Integer.valueOf(i));
        if (remove == null) {
            return;
        }
        remove.destroy();
    }

    @Override // tb.fvl
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (p pVar : this.f11914a.values()) {
            if (pVar != null) {
                pVar.destroy();
            }
        }
        this.f11914a.clear();
    }

    private static MUSValue[] a(int i, int i2, f[] fVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue[]) ipChange.ipc$dispatch("17585315", new Object[]{new Integer(i), new Integer(i2), fVarArr});
        }
        MUSValue[] mUSValueArr = new MUSValue[i2 + i];
        for (int i3 = 0; i3 < i2; i3++) {
            f fVar = fVarArr[i3];
            switch (fVar.e()) {
                case 1:
                case 8:
                case 9:
                    mUSValueArr[i + i3] = MUSValue.ofNill();
                    break;
                case 2:
                    mUSValueArr[i + i3] = MUSValue.ofInt((int) fVar.w());
                    break;
                case 3:
                    mUSValueArr[i + i3] = MUSValue.ofFloat((float) fVar.z());
                    break;
                case 4:
                    mUSValueArr[i + i3] = MUSValue.ofBool(fVar.B());
                    break;
                case 5:
                    mUSValueArr[i + i3] = MUSValue.ofString(fVar.i());
                    break;
                case 6:
                    mUSValueArr[i + i3] = MUSValue.ofJSON(fVar.o());
                    break;
                case 7:
                    mUSValueArr[i + i3] = MUSValue.ofJSON(fVar.r());
                    break;
            }
        }
        return mUSValueArr;
    }
}
