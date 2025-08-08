package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;

/* loaded from: classes6.dex */
public class hzm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private hzi f28853a;
    private hzn b;

    static {
        kge.a(-1761709475);
    }

    public hzk a(Context context, OrderConfigs.BizNameType bizNameType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hzk) ipChange.ipc$dispatch("47cae0c7", new Object[]{this, context, bizNameType, str});
        }
        if (OrderConfigs.BizNameType.ORDER_LIST == bizNameType && ibl.a() && !StringUtils.isEmpty(str) && str.toLowerCase().startsWith("mtop.taobao.order.queryboughtlistv2")) {
            if (this.b == null) {
                this.b = new hzn(context, "nextrpc-TM2");
            }
            return this.b;
        }
        if (this.f28853a == null) {
            this.f28853a = new hzi();
        }
        return this.f28853a;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f28853a != null) {
            this.f28853a = null;
        }
        hzn hznVar = this.b;
        if (hznVar == null) {
            return;
        }
        hznVar.b();
        this.b = null;
    }
}
