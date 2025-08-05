package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes5.dex */
public class fhw implements j<fhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f27962a;

    static {
        kge.a(746295442);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(fhv fhvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, fhvVar}) : a(fhvVar);
    }

    public fhw(Context context) {
        this.f27962a = context;
    }

    public i a(fhv fhvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("c583ab4b", new Object[]{this, fhvVar});
        }
        if (fhvVar == null || this.f27962a == null) {
            return i.FAILURE;
        }
        String str = fhvVar.f27961a;
        if (TextUtils.isEmpty(str)) {
            return i.FAILURE;
        }
        Nav.from(this.f27962a).toUri(str);
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
