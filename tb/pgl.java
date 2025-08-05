package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class pgl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<pgn> f32634a = new ArrayList();

    static {
        kge.a(2130197807);
    }

    public void a(pgo pgoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9929e80", new Object[]{this, pgoVar});
        } else {
            this.f32634a.add(new pgn(pgoVar));
        }
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        for (pgn pgnVar : this.f32634a) {
            pgnVar.a(obj);
        }
    }
}
