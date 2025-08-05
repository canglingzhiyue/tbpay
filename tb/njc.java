package tb;

import android.content.res.AssetManager;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;
import com.taobao.tcommon.core.a;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class njc extends njf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31496a;
    public boolean b;

    static {
        kge.a(1088773528);
    }

    private njc(int i, boolean z, byte[] bArr, int i2, InputStream inputStream, int i3, TypedValue typedValue) {
        super(i, bArr, i2, inputStream, i3, typedValue);
        boolean z2 = true;
        if (i == 1) {
            this.f31496a = (!z || bArr == null || bArr.length - i2 < i3) ? false : z2;
        } else {
            this.f31496a = z;
        }
    }

    public njc(njc njcVar) {
        this(njcVar.k, njcVar.f31496a, njcVar.m, njcVar.n, njcVar.o, njcVar.l, njcVar.p);
    }

    public njc(InputStream inputStream, int i, TypedValue typedValue) {
        this(3, true, null, 0, inputStream, i, typedValue);
    }

    public njc(boolean z, byte[] bArr, int i, int i2) {
        this(1, z, bArr, i, null, i2, null);
    }

    public njc(byte[] bArr, int i, int i2) {
        this(1, true, bArr, i, null, i2, null);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.b && this.l > 0) {
            if (this.k == 1) {
                return this.m != null && this.n >= 0 && this.n < this.l;
            } else if (this.o != null) {
                return true;
            }
        }
        return false;
    }

    public synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.b) {
            if (z) {
                niw.c("EncodedData", "has been released when trying to release it[type: %d]", Integer.valueOf(this.k));
            }
        } else {
            if (!z) {
                niw.c("EncodedData", "final release called from finalize[type: %d]", Integer.valueOf(this.k));
            }
            int i = this.k;
            if (i == 1) {
                a a2 = b.h().q().a();
                if (a2 != null) {
                    a2.a(this.m);
                }
            } else if (i == 3 && this.o != null) {
                try {
                    this.o.close();
                } catch (IOException unused) {
                }
            }
            this.b = true;
        }
    }

    @Override // tb.njf, tb.nmq
    public synchronized void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            a(true);
        }
    }

    public static njc a(njf njfVar, njj njjVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njc) ipChange.ipc$dispatch("ce6beb4f", new Object[]{njfVar, njjVar});
        }
        if (njfVar.k == 3) {
            InputStream inputStream = njfVar.o;
            if ((inputStream instanceof FileInputStream) || (inputStream instanceof AssetManager.AssetInputStream)) {
                return new njc(inputStream, njfVar.l, njfVar.p);
            }
            a a2 = b.h().q().a();
            if (njjVar == null) {
                return niv.a(inputStream, a2, new int[]{njfVar.l});
            }
            niv.a(inputStream, a2, njjVar);
            return njjVar.d();
        } else if (njfVar.k == 1) {
            return new njc(njfVar.m, njfVar.n, njfVar.l);
        } else {
            throw new RuntimeException("unrecognized response type: " + njfVar.k);
        }
    }
}
