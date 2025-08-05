package com.taobao.android.remoteso.resolver2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import java.io.File;
import tb.ikq;
import tb.ikw;

/* loaded from: classes.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final j f14838a;
    private final String b;
    private String c;
    private final RSoException d;
    private String e = "default";

    private k(j jVar, String str, String str2, RSoException rSoException) {
        this.f14838a = jVar;
        this.b = str;
        this.c = str2;
        this.d = rSoException;
    }

    public static k a(j jVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("8eb0d763", new Object[]{jVar, str, str2}) : new k(jVar, str, str2, null);
    }

    public static k a(j jVar, String str, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("8c514ab8", new Object[]{jVar, str, rSoException}) : new k(jVar, null, str, rSoException);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f14838a.a();
    }

    public j b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("34fbd0cd", new Object[]{this}) : this.f14838a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.c;
    }

    public RSoException e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RSoException) ipChange.ipc$dispatch("c513e1c9", new Object[]{this}) : this.d;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.e;
    }

    public k b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("8afb6076", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public k a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("976bdc35", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public SoIndexData.SoFileInfo g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("6c23e536", new Object[]{this}) : this.f14838a.e();
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        if (ikw.a((CharSequence) this.b)) {
            throw new RuntimeException("libFullPath is empty, this = " + this);
        }
        return this.b;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        try {
            if (this.d != null || ikw.a((CharSequence) this.b)) {
                return false;
            }
            return new File(this.b).exists();
        } catch (Throwable th) {
            ikq.a("ResolveResult.isSuccess", th);
            return false;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ResolveResult{libName='" + this.f14838a.a() + "', libFullPath='" + this.b + "', resolveFrom='" + this.c + "', exception=" + this.d + ", resolveSource='" + this.e + "'}";
    }
}
