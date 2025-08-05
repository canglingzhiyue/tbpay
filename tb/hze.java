package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import tb.hzr;

/* loaded from: classes6.dex */
public class hze extends hzp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(971377311);
    }

    public static /* synthetic */ Object ipc$super(hze hzeVar, String str, Object... objArr) {
        if (str.hashCode() == -1642240928) {
            super.a((Context) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hze(OrderConfigs orderConfigs) {
        this.b = orderConfigs;
    }

    @Override // tb.hzp, tb.hzc
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        super.a(context);
        a(hzr.ULTRONSEARCHTABCLICKV2, new hzr.a(this));
    }

    @Override // tb.hzp
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (this.b == null || this.b.d() == null) {
        } else {
            this.b.d().a(jSONObject);
        }
    }

    @Override // tb.hzp
    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else {
            d().a(127);
        }
    }
}
