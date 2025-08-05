package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Stack;

/* loaded from: classes5.dex */
public final class ple {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Stack<plm> f32748a = new Stack<>();

    static {
        kge.a(-1876449716);
    }

    public boolean b() {
        plm pop;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !this.f32748a.empty() && (pop = this.f32748a.pop()) != null && pop.onHandleBackKeyEvent();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f32748a.clear();
        }
    }

    public void a(plm plmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d82b47", new Object[]{this, plmVar});
        } else if (!this.f32748a.remove(plmVar)) {
        } else {
            plmVar.d();
        }
    }

    public void b(plm plmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e85b31c8", new Object[]{this, plmVar});
        } else {
            this.f32748a.push(plmVar);
        }
    }
}
