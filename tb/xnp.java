package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.ba;

/* loaded from: classes7.dex */
public class xnp extends ba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private tiq f34406a;

    static {
        kge.a(-1348733739);
    }

    public xnp(tiq tiqVar) {
        this.f34406a = tiqVar;
    }

    public tiq a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tiq) ipChange.ipc$dispatch("f0af802", new Object[]{this}) : this.f34406a;
    }
}
