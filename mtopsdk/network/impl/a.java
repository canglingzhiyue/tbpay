package mtopsdk.network.impl;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.network.domain.Request;
import tb.kge;
import tb.ryn;

/* loaded from: classes.dex */
public class a implements ryn.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f25011a;

    static {
        kge.a(1032520494);
        kge.a(-427978878);
    }

    public a(Context context) {
        this.f25011a = context;
    }

    @Override // tb.ryn.a
    public ryn a(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ryn) ipChange.ipc$dispatch("a03c424a", new Object[]{this, request});
        }
        if (request.w) {
            return new c(request, this.f25011a);
        }
        return new b(request, this.f25011a);
    }
}
