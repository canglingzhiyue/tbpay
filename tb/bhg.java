package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bhc;

/* loaded from: classes2.dex */
public class bhg extends bhc<View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final bhc.b f25900a;
    private Class[] b;
    private Object[] c;

    static {
        kge.a(2013802868);
    }

    @Override // tb.bhc
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "view";
    }

    public Class[] g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class[]) ipChange.ipc$dispatch("bf36dff0", new Object[]{this}) : this.b;
    }

    public Object[] h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("dc094990", new Object[]{this}) : this.c;
    }

    @Override // tb.bhc
    public bhc.b<View> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhc.b) ipChange.ipc$dispatch("c2b5f57e", new Object[]{this}) : this.f25900a;
    }
}
