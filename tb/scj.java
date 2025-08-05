package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.network.domain.Request;
import tb.ryn;

/* loaded from: classes9.dex */
public class scj implements ryn.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ExecutorService f33472a;

    static {
        kge.a(1439750443);
        kge.a(-427978878);
    }

    public scj(Context context, ExecutorService executorService) {
        this.f33472a = executorService;
        try {
            sci.a(context);
        } catch (Exception e) {
            TBSdkLog.e("qmtopsdk.DefaultCallFactory", "call CookieManager.setup error.", e);
        }
    }

    @Override // tb.ryn.a
    public ryn a(Request request) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ryn) ipChange.ipc$dispatch("a03c424a", new Object[]{this, request}) : new sck(request, this.f33472a);
    }
}
