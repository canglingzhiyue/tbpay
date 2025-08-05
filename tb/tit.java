package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public abstract class tit<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public tiu f34136a;
    public tiq b;

    static {
        kge.a(-1223849941);
    }

    public abstract String a();

    public abstract void a(T t);

    public final void a(tiq tiqVar, tiw<T> tiwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a4eb4a", new Object[]{this, tiqVar, tiwVar});
        } else if (tiwVar == null) {
            stv.a("BaseEvent", "execute: param is null, name=" + a());
        } else {
            this.f34136a = tiwVar.b();
            this.b = tiqVar;
            stv.a("BaseEvent", "start onExecute: " + a() + ", data=" + tiwVar.a());
            a((tit<T>) tiwVar.a());
        }
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        tiu tiuVar = this.f34136a;
        if (tiuVar == null) {
            return;
        }
        tiuVar.a(jSONObject);
    }

    public final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        tiu tiuVar = this.f34136a;
        if (tiuVar == null) {
            return;
        }
        tiuVar.a(str, str2);
    }
}
