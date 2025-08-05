package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.zhub.common.factor.model.FactorNextRequest;

/* loaded from: classes3.dex */
public class cjs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FactorNextRequest f26321a = new FactorNextRequest();
    public String b = "";
    public boolean c = false;

    static {
        kge.a(-153745558);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RpcRequest{factorNextRequest = " + this.f26321a.toString() + ", currentTaskName = " + this.b + ", showLoading = " + this.c + '}';
    }
}
