package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.network.domain.Request;
import tb.ryn;

/* loaded from: classes.dex */
public class rzs implements ryn.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f33439a;

    public rzs(Context context) {
        this.f33439a = context;
    }

    @Override // tb.ryn.a
    public ryn a(Request request) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ryn) ipChange.ipc$dispatch("a03c424a", new Object[]{this, request}) : new rzt(request, this.f33439a);
    }
}
