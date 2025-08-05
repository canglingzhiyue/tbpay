package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.i;
import java.util.HashMap;
import java.util.HashSet;
import mtopsdk.mtop.domain.MethodEnum;

/* loaded from: classes7.dex */
public abstract class npq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final HashSet<String> b;

    /* renamed from: a  reason: collision with root package name */
    public nnl f31631a;

    static {
        kge.a(1890841288);
        HashSet<String> hashSet = new HashSet<>();
        b = hashSet;
        hashSet.add("referrer");
        b.add(i.URL_REFERER_ORIGIN);
    }

    public nnl a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nnl) ipChange.ipc$dispatch("f084ff2", new Object[]{this}) : this.f31631a;
    }

    public npq(String str, String str2, boolean z, boolean z2, String str3) {
        this(str, str2, z, z2, false, str3);
    }

    public npq(String str, String str2, boolean z, boolean z2, boolean z3, String str3) {
        this(str, str2, z, z2, z3, str3, null);
    }

    public npq(String str, String str2, boolean z, boolean z2, boolean z3, String str3, MethodEnum methodEnum) {
        this.f31631a = new nnl();
        nnl nnlVar = this.f31631a;
        nnlVar.f31592a = str;
        nnlVar.b = str2;
        nnlVar.c = z;
        nnlVar.d = z2;
        nnlVar.e = z3;
        nnlVar.i = str3;
        nnlVar.k = methodEnum;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (b.contains(str)) {
        } else {
            if (this.f31631a.g == null) {
                this.f31631a.g = new HashMap();
            }
            this.f31631a.g.put(str, str2);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (b.contains(str)) {
        } else {
            if (this.f31631a.h == null) {
                this.f31631a.h = new HashMap();
            }
            this.f31631a.h.put(str, str2);
        }
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        nnl nnlVar = this.f31631a;
        nnlVar.l = str;
        nnlVar.m = Integer.valueOf(i);
    }
}
