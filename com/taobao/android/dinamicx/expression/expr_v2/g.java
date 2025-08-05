package com.taobao.android.dinamicx.expression.expr_v2;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, f> f11870a = new HashMap();

    static {
        kge.a(-1989419984);
    }

    public f a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("2f0764fa", new Object[]{this, str});
        }
        f fVar = this.f11870a.get(str);
        return fVar == null ? f.f() : fVar;
    }

    public void a(String str, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c83f8c8", new Object[]{this, str, fVar});
        } else if (str == null) {
        } else {
            if (fVar == null) {
                this.f11870a.remove(str);
            } else {
                this.f11870a.put(str, fVar);
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXScriptVarObject" + this.f11870a.toString();
    }
}
