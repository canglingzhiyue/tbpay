package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.disk.c;

/* loaded from: classes.dex */
public class nih implements nid<c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f31479a;
    private c b;

    static {
        kge.a(-1088953205);
        kge.a(-1709620101);
    }

    public nid<c> a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nid) ipChange.ipc$dispatch("295626d0", new Object[]{this, cVar});
        }
        this.b = cVar;
        return this;
    }

    public c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("32b268b3", new Object[]{this});
        }
        if (this.f31479a) {
            return this.b;
        }
        this.f31479a = true;
        c cVar = this.b;
        if (cVar != null) {
            cVar.a();
        }
        return this.b;
    }
}
