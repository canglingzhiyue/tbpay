package com.alibaba.security.realidentity;

import com.alibaba.security.realidentity.algo.jni.YuvEngineJni;
import com.alibaba.security.realidentity.algo.wrapper.base.JniInvokeException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class s extends t {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String c = "s";

    /* renamed from: a  reason: collision with root package name */
    public long f3509a;
    public YuvEngineJni b;

    /* loaded from: classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final s f3510a = new s();

        public static /* synthetic */ s a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("8e56e76b", new Object[0]) : f3510a;
        }
    }

    public static s a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("8e56e76b", new Object[0]) : b.a();
    }

    public static /* synthetic */ Object ipc$super(s sVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        YuvEngineJni yuvEngineJni = new YuvEngineJni();
        this.b = yuvEngineJni;
        this.f3509a = yuvEngineJni.startYuvEngine();
    }

    public void c(byte[] bArr, byte[] bArr2, int i, int i2) throws JniInvokeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c85c98", new Object[]{this, bArr, bArr2, new Integer(i), new Integer(i2)});
            return;
        }
        a("Nv21ToYv12");
        this.b.Nv21ToYV12(this.f3509a, bArr, bArr2, i, i2);
    }

    public s() {
        this.f3509a = 0L;
    }

    public void a(byte[] bArr, byte[] bArr2, int i, int i2) throws JniInvokeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9fef716", new Object[]{this, bArr, bArr2, new Integer(i), new Integer(i2)});
            return;
        }
        a("Nv21ToI420");
        this.b.Nv21ToI420(this.f3509a, bArr, bArr2, i, i2);
    }

    public void b(byte[] bArr, byte[] bArr2, int i, int i2) throws JniInvokeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee3a9d7", new Object[]{this, bArr, bArr2, new Integer(i), new Integer(i2)});
            return;
        }
        a("Nv21ToNv12");
        this.b.Nv21ToNv12(this.f3509a, bArr, bArr2, i, i2);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            a("stopYuvEngine");
        } catch (JniInvokeException e) {
            com.alibaba.security.realidentity.a.a(c, e);
        }
        this.b.stopYuvEngine(this.f3509a);
        this.b = null;
    }

    private void a(String str) throws JniInvokeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f3509a != 0 && this.b != null) {
        } else {
            throw new JniInvokeException("Exception: Calling " + str + " at wrong time");
        }
    }
}
