package com.taobao.android.weex_ability.windvane;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.e;
import com.taobao.android.weex_framework.p;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.jvb;
import tb.kge;

/* loaded from: classes6.dex */
public class a implements aek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private p f15971a;

    static {
        kge.a(-1596043911);
        kge.a(1845411121);
    }

    @Override // tb.aek
    public ael onEvent(int i, aej aejVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
        }
        if (i == 3013 && objArr != null) {
            try {
                if (this.f15971a != null) {
                    JSONObject jSONObject = new JSONObject();
                    if (objArr.length >= 3) {
                        JSONObject parseObject = JSON.parseObject(objArr[2].toString());
                        for (String str : parseObject.keySet()) {
                            jSONObject.put(str, parseObject.get(str));
                        }
                    }
                    String obj = objArr[1].toString();
                    if ("PerformanceMetric.onLowMemory".equals(obj)) {
                        return null;
                    }
                    WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) ((jvb) this.f15971a).a();
                    if (objArr[1] == null) {
                        obj = "";
                    }
                    weexInstanceImpl.legacyDispatchWindVaneEvent(obj, e.b().a(jSONObject));
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{this, pVar});
        } else {
            this.f15971a = pVar;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f15971a = null;
        }
    }
}
