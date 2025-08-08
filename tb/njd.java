package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class njd extends njc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EXACT_SIZE_LEVEL = 1;
    public static final int LARGE_SIZE_LEVEL = 4;
    public static final int SMALL_SIZE_LEVEL = 2;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final String g;
    public int h;
    public int i;
    public boolean j;
    private nec q;
    private boolean r;

    static {
        kge.a(-602801875);
    }

    public static /* synthetic */ Object ipc$super(njd njdVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public njd(njc njcVar, String str, int i, boolean z, String str2) {
        this(njcVar, str, i, z, str2, false);
    }

    public njd(njc njcVar, String str, int i, boolean z, String str2, boolean z2) {
        super(njcVar == null ? new njc(false, null, 0, 0) : njcVar);
        this.c = str;
        this.f = i;
        this.e = z;
        this.g = str2;
        this.d = z2;
    }

    public njd a(njc njcVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (njd) ipChange.ipc$dispatch("441d834c", new Object[]{this, njcVar, new Integer(i)}) : a(njcVar, i, this.d);
    }

    public njd a(njc njcVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njd) ipChange.ipc$dispatch("8cd8d3dc", new Object[]{this, njcVar, new Integer(i), new Boolean(z)});
        }
        njd njdVar = new njd(njcVar, this.c, i, this.e, this.g, z);
        njdVar.h = this.h;
        njdVar.i = this.i;
        njdVar.j = this.j;
        return njdVar;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.r || this.k != 1 || (this.e && !this.d) || !this.f31496a || this.m == null;
    }

    public njd b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njd) ipChange.ipc$dispatch("dc8b2f3", new Object[]{this, new Boolean(z)});
        }
        this.r = z;
        return this;
    }

    public static nec a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nec) ipChange.ipc$dispatch("7c72d608", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (str.indexOf(46) == 0) {
            str = str.substring(1);
        }
        try {
            for (nec necVar : neb.ALL_EXTENSION_TYPES) {
                if (necVar != null && necVar.a(str)) {
                    return necVar;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public nec c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nec) ipChange.ipc$dispatch("1e6b77d0", new Object[]{this});
        }
        if (this.q == null) {
            this.q = a(this.g);
        }
        return this.q;
    }

    public void a(nec necVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60749cc", new Object[]{this, necVar});
        } else {
            this.q = necVar;
        }
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            a(false);
            super.finalize();
        } catch (Throwable unused) {
        }
    }
}
