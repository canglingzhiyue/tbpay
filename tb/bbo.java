package tb;

import android.content.Context;
import com.alibaba.android.bindingx.core.i;
import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.alibaba.android.bindingx.core.internal.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mto;

/* loaded from: classes2.dex */
public class bbo extends a implements i.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int p;
    private int q;
    private int r;
    private int s;

    private boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i == i2) {
            return true;
        }
        return (i > 0 && i2 > 0) || (i < 0 && i2 < 0);
    }

    public static /* synthetic */ Object ipc$super(bbo bboVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1340024952) {
            super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue());
            return null;
        } else if (hashCode == 1708636289) {
            return new Boolean(super.b((String) objArr[0], (String) objArr[1]));
        } else {
            if (hashCode != 2084203519) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.a((String) objArr[0], ((Number) objArr[1]).doubleValue(), ((Number) objArr[2]).doubleValue(), ((Number) objArr[3]).doubleValue(), ((Number) objArr[4]).doubleValue(), ((Number) objArr[5]).doubleValue(), ((Number) objArr[6]).doubleValue(), (Object[]) objArr[7]);
            return null;
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public bbo(Context context, i iVar, Object... objArr) {
        super(context, iVar, objArr);
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
    }

    @Override // com.alibaba.android.bindingx.core.e
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        i.c d = this.i.d();
        if (d == null) {
            return false;
        }
        d.a(str, this);
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.a, com.alibaba.android.bindingx.core.e
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        i.c d = this.i.d();
        if (d == null) {
            return false;
        }
        d.b(str, this);
        return super.b(str, str2);
    }

    @Override // com.alibaba.android.bindingx.core.i.f
    public void a(float f, float f2) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        int i5 = (int) (f - this.n);
        int i6 = (int) (f2 - this.o);
        this.n = (int) f;
        this.o = (int) f2;
        if (i5 == 0 && i6 == 0) {
            return;
        }
        if (!a(i6, this.s)) {
            this.q = this.o;
            z = true;
        } else {
            z = false;
        }
        if (!a(i5, this.r)) {
            this.p = this.n;
            z = true;
        }
        int i7 = this.n - this.p;
        int i8 = this.o - this.q;
        this.r = i5;
        this.s = i6;
        if (z) {
            i2 = i6;
            i4 = i5;
            i = i8;
            i3 = i7;
            super.a(BindingXConstants.STATE_TURNING, this.n, this.o, i5, i6, i7, i8, new Object[0]);
        } else {
            i = i8;
            i2 = i6;
            i3 = i7;
            i4 = i5;
        }
        super.a(this.n, this.o, i4, i2, i3, i);
    }

    @Override // com.alibaba.android.bindingx.core.i.f
    public void h_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c83dfe", new Object[]{this});
        } else {
            super.a("scrollStart", mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, new Object[0]);
        }
    }

    @Override // com.alibaba.android.bindingx.core.i.f
    public void b(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f625a9", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            super.a("scrollEnd", f, f2, mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT, new Object[0]);
        }
    }
}
