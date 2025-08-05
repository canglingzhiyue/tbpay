package com.alibaba.security.realidentity;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.realidentity.algo.jni.CommonUtilJni;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class r extends t {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String b = "r";

    /* renamed from: a  reason: collision with root package name */
    public final CommonUtilJni f3489a;

    /* loaded from: classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final r f3490a = new r();

        public static /* synthetic */ r a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("8e56e74c", new Object[0]) : f3490a;
        }
    }

    public static r a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("8e56e74c", new Object[0]) : b.a();
    }

    public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!b()) {
        } else {
            this.f3489a.initToken(str);
        }
    }

    public byte[] c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("792658a9", new Object[]{this, str});
        }
        if (b() && !TextUtils.isEmpty(str)) {
            return this.f3489a.makeStrResult(str);
        }
        return null;
    }

    public r() {
        this.f3489a = new CommonUtilJni();
    }

    public byte[] a(byte[] bArr, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("46b9287a", new Object[]{this, bArr, str, str2}) : this.f3489a.makeResult(bArr, str, str2);
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        if (str == null) {
            str = "";
        }
        if (!b()) {
            return;
        }
        this.f3489a.bh(i, str);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : m2.a().b();
    }

    public byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{this, str});
        }
        if (b()) {
            return this.f3489a.genKeyToken(str);
        }
        return null;
    }

    public byte[] a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5c189af1", new Object[]{this, new Boolean(z)});
        }
        if (b()) {
            return this.f3489a.dumpBh(z);
        }
        return null;
    }

    public String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{this, bArr});
        }
        if (b()) {
            return this.f3489a.dp(bArr, bArr.length);
        }
        return null;
    }

    public byte[] a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d5108ff3", new Object[]{this, context, str});
        }
        if (!b()) {
            return null;
        }
        return this.f3489a.genVersionTag(str, g2.f3421a, g2.b);
    }
}
