package tb;

import android.os.SystemClock;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.s;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/taobao/detail/rate/vivid/utils/APMStatUtils;", "", "()V", "APM_RATE_LIST_END_TAG", "", "statEndTime", "", "activity", "Landroid/support/v4/app/FragmentActivity;", "statRateFragmentEndTime", bgp.FRAGMENT, "Landroid/support/v4/app/Fragment;", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class nkv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nkv INSTANCE = new nkv();

    private nkv() {
    }

    public final void a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0514a", new Object[]{this, fragment});
            return;
        }
        q.d(fragment, "fragment");
        s.f18233a.b(fragment).a("rateListRenderEndTime", SystemClock.uptimeMillis());
    }
}
