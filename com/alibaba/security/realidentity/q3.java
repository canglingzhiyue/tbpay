package com.alibaba.security.realidentity;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class q3 extends j3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public p2 o;

    /* loaded from: classes3.dex */
    public class a implements r2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.security.realidentity.r2
        public void a(byte[] bArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2713f1b4", new Object[]{this, bArr, new Integer(i)});
            } else {
                q3.this.a(bArr, i);
            }
        }
    }

    public q3(Context context) {
        super(context);
        try {
            this.o = (p2) Class.forName("com.alibaba.security.videorecorder.CameraVideoRecorderManager").newInstance();
        } catch (Exception e) {
            if (!j.d(context)) {
                return;
            }
            com.alibaba.security.realidentity.a.a(j3.i, "no camera video recorder ability", e);
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.o != null;
    }

    public static /* synthetic */ Object ipc$super(q3 q3Var, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.realidentity.j3
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        p2 p2Var = this.o;
        if (p2Var == null) {
            return;
        }
        p2Var.a(null, z);
    }

    @Override // com.alibaba.security.realidentity.j3
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.security.realidentity.j3
    public boolean b(int i, int i2, int i3, int i4, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98e561b7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str})).booleanValue();
        }
        if (!c()) {
            return false;
        }
        try {
            this.o.a(i, i2, i3, i4, str);
            this.o.a(new a());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.alibaba.security.realidentity.j3
    public void b(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4faf26d0", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        p2 p2Var = this.o;
        if (p2Var == null) {
            return;
        }
        p2Var.a(bArr);
    }
}
