package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class dle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f26826a;
    private JSONObject b;
    private dlo c;
    private dlq d;
    private WeakReference<dkt> e;
    private fhu f;

    static {
        kge.a(-1329677593);
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("75941360", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.f26826a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.f26826a = new WeakReference<>(context);
        }
    }

    public dlo b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dlo) ipChange.ipc$dispatch("16b56276", new Object[]{this}) : this.c;
    }

    public void a(dlo dloVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e55eec91", new Object[]{this, dloVar});
        } else {
            this.c = dloVar;
        }
    }

    public dlq c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dlq) ipChange.ipc$dispatch("1e670813", new Object[]{this}) : this.d;
    }

    public void a(dlq dlqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e55fd54f", new Object[]{this, dlqVar});
        } else {
            this.d = dlqVar;
        }
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new JSONObject();
        }
        return this.b;
    }

    public dkt e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkt) ipChange.ipc$dispatch("2dca4f6d", new Object[]{this});
        }
        WeakReference<dkt> weakReference = this.e;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void a(dkt dktVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5531aeb", new Object[]{this, dktVar});
        } else {
            this.e = new WeakReference<>(dktVar);
        }
    }

    public <T> fhu<T> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fhu) ipChange.ipc$dispatch("5bf50d41", new Object[]{this}) : this.f;
    }

    public void a(fhu fhuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e892fa05", new Object[]{this, fhuVar});
        } else {
            this.f = fhuVar;
        }
    }
}
