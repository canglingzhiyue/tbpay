package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.helper.c;
import java.util.Map;

/* loaded from: classes6.dex */
public class ict extends dsw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f28911a;

    static {
        kge.a(1501929390);
    }

    @Override // tb.dsw
    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this});
        }
        return null;
    }

    public ict(Activity activity) {
        super(activity);
        this.f28911a = activity;
    }

    @Override // tb.dsw
    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : c.f(this.f28911a);
    }
}
