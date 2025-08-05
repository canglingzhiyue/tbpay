package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class pgn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pgo f32636a;

    static {
        kge.a(-1377617611);
    }

    public pgn(pgo pgoVar) {
        this.f32636a = pgoVar;
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        pgo pgoVar = this.f32636a;
        if (pgoVar == null) {
            return;
        }
        pgoVar.a(obj);
    }
}
