package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.zhub.common.factor.model.FactorNextResponse;

/* loaded from: classes3.dex */
public class cjt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FactorNextResponse f26322a = new FactorNextResponse();
    public String b = "";
    public String c = "";

    static {
        kge.a(-418211130);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RpcResponse{factorNextResponse = " + this.f26322a.toString() + ", exception = " + this.b + '}';
    }
}
