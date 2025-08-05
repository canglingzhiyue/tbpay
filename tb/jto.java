package tb;

import android.content.Context;
import android.content.Intent;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "tbwaitpay.impl.aspect.error.downgrade")
/* loaded from: classes6.dex */
public final class jto extends jtn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROADCAST_ACTION_ORDER_LIST_NEED_REFRESH = "orderListNeedRefreshAction";

    static {
        kge.a(803837843);
    }

    public static /* synthetic */ Object ipc$super(jto jtoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.jtn
    public void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
        } else {
            a(str);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(b().e(), str);
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        Intent intent = new Intent("orderListNeedRefreshAction");
        intent.putExtra("reason", str);
        intent.putExtra("from", "Page_WaitpayDetail");
        context.sendBroadcast(intent);
    }
}
