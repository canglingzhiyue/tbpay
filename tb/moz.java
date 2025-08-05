package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.trace.b;
import java.util.Map;
import tb.moq;

/* loaded from: classes.dex */
public class moz implements b.a, moq.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private mpa f31180a = null;
    private int b = 0;
    private int c = 0;
    private final mpb d = new mpb();

    @Override // com.taobao.monitor.impl.trace.b.a
    public void a(Activity activity, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf57d99", new Object[]{this, activity, map, new Long(j)});
            return;
        }
        Object obj = map.get("outLink");
        if (this.b == 0) {
            if (obj != null) {
                z = true;
            }
            this.f31180a = a(z, j);
            mpa mpaVar = this.f31180a;
            if (mpaVar != null) {
                mpaVar.a(this);
            }
        } else if (d.H && this.c == 0 && this.f31180a == null) {
            this.f31180a = this.d.a(mpa.HOT, j);
            mpa mpaVar2 = this.f31180a;
            if (mpaVar2 != null) {
                mpaVar2.a(this);
            }
        }
        mpa mpaVar3 = this.f31180a;
        if (mpaVar3 != null) {
            mpaVar3.a(activity, map, j);
        }
        this.b++;
    }

    @Override // com.taobao.monitor.impl.trace.b.a
    public void a(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb084a", new Object[]{this, activity, new Long(j)});
            return;
        }
        this.c++;
        if (this.c == 1 && this.f31180a == null) {
            this.f31180a = this.d.a(mpa.HOT, j);
            mpa mpaVar = this.f31180a;
            if (mpaVar != null) {
                mpaVar.a(this);
            }
        }
        mpa mpaVar2 = this.f31180a;
        if (mpaVar2 == null) {
            return;
        }
        mpaVar2.a(activity, j);
    }

    @Override // com.taobao.monitor.impl.trace.b.a
    public void b(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8c0fa9", new Object[]{this, activity, new Long(j)});
            return;
        }
        mpa mpaVar = this.f31180a;
        if (mpaVar != null) {
            mpaVar.b(activity, j);
        }
        if (!"com.taobao.tao.welcome.Welcome".equals(com.taobao.monitor.impl.util.d.a((Object) activity))) {
            return;
        }
        mnd.d = true;
    }

    @Override // com.taobao.monitor.impl.trace.b.a
    public void c(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5d1708", new Object[]{this, activity, new Long(j)});
            return;
        }
        mpa mpaVar = this.f31180a;
        if (mpaVar == null) {
            return;
        }
        mpaVar.c(activity, j);
    }

    @Override // com.taobao.monitor.impl.trace.b.a
    public void d(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2e1e67", new Object[]{this, activity, new Long(j)});
            return;
        }
        this.c--;
        mpa mpaVar = this.f31180a;
        if (mpaVar == null) {
            return;
        }
        mpaVar.d(activity, j);
    }

    @Override // com.taobao.monitor.impl.trace.b.a
    public void e(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dff25c6", new Object[]{this, activity, new Long(j)});
            return;
        }
        mpa mpaVar = this.f31180a;
        if (mpaVar != null) {
            mpaVar.e(activity, j);
        }
        this.b--;
        if (this.b != 0) {
            return;
        }
        jzs jzsVar = new jzs();
        mpa.f31181a = mpa.WARM;
        mpa.b = true;
        jzsVar.a(mpa.WARM);
        mpa.c = "activityKilled";
    }

    private mpa a(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpa) ipChange.ipc$dispatch("d21e5f50", new Object[]{this, new Boolean(z), new Long(j)});
        }
        if (z) {
            return this.d.a(null, j);
        }
        return this.d.a(j);
    }

    @Override // tb.moq.a
    public void a(moq moqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e5b969", new Object[]{this, moqVar});
        } else {
            this.f31180a = null;
        }
    }
}
