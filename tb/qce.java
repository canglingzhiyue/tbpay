package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.request.base.a;

/* loaded from: classes8.dex */
public class qce extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String d;
    private String e;
    private int f;

    static {
        kge.a(1211680787);
    }

    public qce(String str, String str2, int i) {
        this.e = str;
        this.d = str2;
        this.f = i;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.d;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.e;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.f;
    }
}
