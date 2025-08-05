package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.a;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes3.dex */
public final class cto extends ctn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1447944253);
    }

    public static /* synthetic */ Object ipc$super(cto ctoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ctn
    public void a(Context context, a cardBean, rul<? super ctq, t> successListener, ruw<? super Integer, ? super String, t> failureListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73fbfe", new Object[]{this, context, cardBean, successListener, failureListener});
            return;
        }
        q.c(context, "context");
        q.c(cardBean, "cardBean");
        q.c(successListener, "successListener");
        q.c(failureListener, "failureListener");
        String a2 = cardBean.a();
        if (TextUtils.isEmpty(a2)) {
            failureListener.mo2423invoke(-1, "Invalid Card Type");
        } else if (q.a((Object) a2, (Object) "nt_region_digest")) {
            successListener.mo2421invoke(a(context, cardBean));
        } else if (!q.a((Object) a2, (Object) "nt_scan_code_hint")) {
        } else {
            successListener.mo2421invoke(b(context, cardBean));
        }
    }

    private final ctp a(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ctp) ipChange.ipc$dispatch("b9a0f18c", new Object[]{this, context, aVar});
        }
        ctp ctpVar = new ctp();
        ctpVar.a(context, aVar.c(), aVar.b());
        return ctpVar;
    }

    private final lck b(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lck) ipChange.ipc$dispatch("e8563296", new Object[]{this, context, aVar});
        }
        lck lckVar = new lck();
        lckVar.a(context, aVar.c(), aVar.b());
        return lckVar;
    }
}
