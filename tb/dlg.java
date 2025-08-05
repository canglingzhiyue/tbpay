package tb;

import android.os.SystemClock;
import com.alibaba.ability.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.f;
import tb.dle;

/* loaded from: classes4.dex */
public abstract class dlg<T extends dle> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALLBACK_FAILURE = "failure";
    public static final String CALLBACK_SUCCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    private f f26827a;

    static {
        kge.a(-790503169);
    }

    public abstract dkx a(dlh dlhVar, T t, dll dllVar);

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public dkx a(JSONObject jSONObject, T t, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a2dbf5ee", new Object[]{this, jSONObject, t, dllVar});
        }
        if (jSONObject == null) {
            dkw dkwVar = new dkw(new dkv(10002, "NULL"), true);
            dmn.a(t, (dlh) null, dkwVar);
            return dkwVar;
        }
        return b(new dlh(jSONObject), t, dllVar);
    }

    public dkx b(final dlh dlhVar, final T t, final dll dllVar) {
        dkx dkyVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("909aaddd", new Object[]{this, dlhVar, t, dllVar});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final dll dllVar2 = new dll() { // from class: tb.dlg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dll
            public void callback(String str, dkx dkxVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("398d9b15", new Object[]{this, str, dkxVar});
                    return;
                }
                dll dllVar3 = dllVar;
                if (dllVar3 != null) {
                    dllVar3.callback(str, dkxVar);
                }
                if (!(dkxVar instanceof dkw)) {
                    return;
                }
                dmn.a(t, dlhVar, (dkw) dkxVar);
            }
        };
        if (dmo.a(dlhVar != null ? dlhVar.d() : null, "isMainThread", true) && a()) {
            z = true;
        }
        if (z) {
            dkyVar = a(dlhVar, (dlh) t, dllVar2);
            if (dkyVar instanceof dkw) {
                dmn.a(t, dlhVar, (dkw) dkyVar);
            }
        } else {
            e.c(new Runnable() { // from class: tb.dlg.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    final dkx a2 = dlg.this.a(dlhVar, (dlh) t, dllVar2);
                    if (a2 == null || (a2 instanceof dky)) {
                        return;
                    }
                    e.a(new Runnable() { // from class: tb.dlg.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                dllVar2.callback("_onResult", a2);
                            }
                        }
                    }, 0L);
                }
            });
            dkyVar = new dky();
        }
        dmn.a(t, dlhVar, SystemClock.elapsedRealtime() - elapsedRealtime);
        return dkyVar;
    }

    public dkw a(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkw) ipChange.ipc$dispatch("1e545a07", new Object[]{this, new Integer(i), str, new Boolean(z)}) : new dkw(new dkv(i, str), z);
    }

    public f b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("e0be668", new Object[]{this}) : this.f26827a;
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4f8483", new Object[]{this, fVar});
        } else {
            this.f26827a = fVar;
        }
    }
}
