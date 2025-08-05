package com.taobao.android.dinamicx.eventchain;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.kge;

/* loaded from: classes5.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FAILURE = 1;
    public static final int FINISH = 0;
    public static final int INTERRUPT = 2;

    /* renamed from: a  reason: collision with root package name */
    private int f11858a = 0;
    private JSONObject b = null;
    private a c = null;

    static {
        kge.a(971496365);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f11858a;
    }

    public a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e813a9aa", new Object[]{this}) : this.c;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.b;
    }

    public static j a(dkx dkxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("998a0709", new Object[]{dkxVar});
        }
        if (dkxVar == null) {
            return a(e.EVENT_CHAIN_ERROR_ABILITY_EXEC_RESULT_IS_NULL);
        }
        if (dkxVar.a() && (dkxVar instanceof dkw)) {
            dkw dkwVar = (dkw) dkxVar;
            if (dkxVar.b()) {
                return b(dkwVar.c().a(), dkwVar.c().b());
            }
            return a(dkwVar.c().a(), dkwVar.c().b());
        } else if (dkxVar instanceof dla) {
            return a(((dla) dkxVar).c());
        } else {
            if (!(dkxVar instanceof p)) {
                return null;
            }
            if (dkxVar.c() != null) {
                p pVar = (p) dkxVar;
                if (pVar.c().e() != null) {
                    return a(new JSONObject(pVar.c().e()));
                }
            }
            return a(new JSONObject());
        }
    }

    public static j a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("bae0b108", new Object[]{jSONObject});
        }
        j jVar = new j();
        jVar.f11858a = 0;
        jVar.b = jSONObject;
        return jVar;
    }

    public static j a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("3538a48b", new Object[]{new Integer(i), str});
        }
        j jVar = new j();
        jVar.f11858a = 1;
        jVar.c = new a(i, str);
        return jVar;
    }

    public static j a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("c06c2529", new Object[]{eVar});
        }
        j jVar = new j();
        jVar.f11858a = 1;
        jVar.c = new a(eVar.f11851a, eVar.b);
        return jVar;
    }

    public static j b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("82f81c8c", new Object[]{new Integer(i), str});
        }
        j jVar = new j();
        jVar.f11858a = 2;
        jVar.c = new a(i, str);
        return jVar;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f11859a;
        public String b;

        static {
            kge.a(1432010532);
        }

        public a(int i, String str) {
            this.f11859a = i;
            this.b = str;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "DXAtomicEventError{errorCode=" + this.f11859a + ", errorMsg='" + this.b + "'}";
        }
    }
}
