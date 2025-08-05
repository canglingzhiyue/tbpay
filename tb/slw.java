package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import tb.spy;

/* loaded from: classes5.dex */
public class slw extends spy.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final g.c f33711a;

    static {
        kge.a(1382842220);
    }

    public static /* synthetic */ Object ipc$super(slw slwVar, String str, Object... objArr) {
        if (str.hashCode() == -162361891) {
            return new Boolean(super.a((spx) objArr[0], objArr[1]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public slw(g.c cVar) {
        this.f33711a = cVar;
    }

    @Override // tb.spy.a
    public boolean a(spx spxVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6528ddd", new Object[]{this, spxVar, obj})).booleanValue();
        }
        boolean a2 = super.a(spxVar, obj);
        if (a2 && this.f33711a.c != null) {
            this.f33711a.c.a(this.f33711a, obj);
        }
        return a2;
    }
}
