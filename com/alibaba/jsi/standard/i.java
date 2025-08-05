package com.alibaba.jsi.standard;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.OutputStream;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
public final class i extends OutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f3134a = "";
    private final Object[] b = new Object[1];

    static {
        kge.a(694539811);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
        } else {
            a(String.format(Locale.US, "%c", Integer.valueOf(i)));
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10cfa82d", new Object[]{this, bArr});
        } else {
            a(new String(bArr));
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        } else {
            a(new String(bArr, i, i2));
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (!"\n".equals(str)) {
            this.f3134a += str;
            z = this.f3134a.endsWith("\n");
        }
        if (!z) {
            return;
        }
        Object[] objArr = this.b;
        objArr[0] = this.f3134a;
        if (0 == JNIBridge.nativeCommand(12L, 6L, objArr)) {
            g.c(this.f3134a);
        }
        this.f3134a = "";
    }
}
