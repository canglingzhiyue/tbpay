package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class fnd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f28071a;
    private long b;
    private String c;
    private String d;
    private int e = 10000;
    private fmv f = fmv.FALSE;
    private final List<fmu> g = new ArrayList();

    static {
        kge.a(-1231970789);
    }

    public fnd a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnd) ipChange.ipc$dispatch("7c6f54f8", new Object[]{this, str});
        }
        this.f28071a = str;
        return this;
    }

    public fnd a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnd) ipChange.ipc$dispatch("daab068e", new Object[]{this, new Long(j)});
        }
        this.b = j;
        return this;
    }

    public fnd b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnd) ipChange.ipc$dispatch("7d1c0097", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public fnd c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnd) ipChange.ipc$dispatch("7dc8ac36", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    public fnd a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnd) ipChange.ipc$dispatch("e661956f", new Object[]{this, new Integer(i)});
        }
        this.e = i;
        return this;
    }

    public fnd a(fmv fmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnd) ipChange.ipc$dispatch("eb4af161", new Object[]{this, fmvVar});
        }
        if (fmvVar != null) {
            this.f = fmvVar;
        }
        return this;
    }

    public fnd a(List<fmu> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnd) ipChange.ipc$dispatch("fa5badf1", new Object[]{this, list});
        }
        if (list != null) {
            this.g.addAll(list);
        }
        return this;
    }

    public fmy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fmy) ipChange.ipc$dispatch("f04aacc", new Object[]{this}) : new fnb(this.f28071a, this.b, this.c, this.d, this.f, this.g, this.e);
    }
}
