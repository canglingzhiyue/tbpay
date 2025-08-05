package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class mpm implements mpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile mpm f31190a;
    private final List<mpl> b = new ArrayList();

    private mpm() {
    }

    public static mpm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpm) ipChange.ipc$dispatch("f07e334", new Object[0]);
        }
        if (f31190a == null) {
            synchronized (mpm.class) {
                if (f31190a == null) {
                    f31190a = new mpm();
                }
            }
        }
        return f31190a;
    }

    public mpm a(mpl mplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpm) ipChange.ipc$dispatch("b7094aad", new Object[]{this, mplVar});
        }
        if (mplVar != null) {
            this.b.add(mplVar);
        }
        return this;
    }

    public boolean a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20fa47d9", new Object[]{this, cls})).booleanValue();
        }
        if (cls != null) {
            Iterator<mpl> it = this.b.iterator();
            while (it.hasNext()) {
                mpl next = it.next();
                if (next != null && next.getClass() == cls) {
                    it.remove();
                }
            }
        }
        return false;
    }

    @Override // tb.mpl
    public void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        for (mpl mplVar : this.b) {
            if (mplVar != null) {
                mplVar.a(str, str2, z);
            }
        }
    }
}
