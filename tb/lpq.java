package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lpq extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long HOMEPAGETOAST = 3106862338272018014L;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.common.view.a f30801a;

    static {
        kge.a(1491390496);
    }

    public static /* synthetic */ Object ipc$super(lpq lpqVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (TextUtils.isEmpty(dlhVar.c("content"))) {
            ldf.d("HomepageToastAbility", "tip is null");
            return new dla();
        }
        Context a2 = dleVar.a();
        if (a2 == null) {
            Toast.makeText(a2, dlhVar.c("content"), 1).show();
            return new dla();
        }
        a(a2, dlhVar).a();
        return new dla();
    }

    private com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.common.view.a a(Context context, dlh dlhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.common.view.a) ipChange.ipc$dispatch("97899e40", new Object[]{this, context, dlhVar});
        }
        if (this.f30801a == null) {
            this.f30801a = new com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.common.view.a(context, dlhVar);
        }
        return this.f30801a;
    }

    /* loaded from: classes.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1682540279);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public lpq a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lpq) ipChange.ipc$dispatch("16bdb9f5", new Object[]{this, obj}) : new lpq();
        }
    }
}
