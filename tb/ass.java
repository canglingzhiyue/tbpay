package tb;

import android.support.v7.widget.RecyclerView;
import com.alibaba.android.aura.f;
import com.alibaba.android.ultron.ext.vlayout.extend.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes2.dex */
public class ass implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private f f25573a;
    private RecyclerView b;

    static {
        kge.a(-1445417595);
        kge.a(-1965791828);
    }

    public ass(f fVar, RecyclerView recyclerView) {
        this.f25573a = fVar;
        this.b = recyclerView;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.extend.a
    public boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        f fVar = this.f25573a;
        if (fVar != null && this.b != null) {
            List<atb> b = fVar.b(atb.class);
            if (b.isEmpty()) {
                return true;
            }
            for (atb atbVar : b) {
                z = atbVar.a(this.b);
            }
        }
        return z;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.extend.a
    public boolean b() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        f fVar = this.f25573a;
        if (fVar != null && this.b != null) {
            List<atb> b = fVar.b(atb.class);
            if (b.isEmpty()) {
                return true;
            }
            for (atb atbVar : b) {
                z = atbVar.b(this.b);
            }
        }
        return z;
    }
}
