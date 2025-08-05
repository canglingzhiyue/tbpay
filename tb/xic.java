package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.fv;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\b\u001a\u00020\tH\u0016J$\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J$\u0010\u0018\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\rH\u0002J\b\u0010\u001a\u001a\u00020\rH\u0002J\b\u0010\u001b\u001a\u00020\rH\u0002J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/alibaba/android/icart/core/view/status/defaultHandler/MegaLoadingHandler;", "Lcom/alibaba/android/icart/core/view/status/ILoading;", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "delayHideRunnable", "Ljava/lang/Runnable;", "delayShowRunnable", "isShowing", "", "megaLoading", "Lcom/taobao/android/abilityidl/abilitynative/MegaLoading;", "doHideLoading", "", "doShowLoading", "context", "Landroid/app/Activity;", "hideLoadingDelay", "onFinishLoading", "presenter", "Lcom/alibaba/android/icart/core/ICartPresenter;", "Landroid/content/Context;", "type", "", "onShowLoading", "removeDelayHideTask", "removeDelayShowTask", "removeDelayTasks", "showLoadingDelay", "delayMills", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class xic implements bfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f34301a = "MegaLoadingHandler";
    private qem b;
    private boolean c;
    private Runnable d;
    private Runnable e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/alibaba/android/icart/core/view/status/defaultHandler/MegaLoadingHandler$doHideLoading$1", "Lcom/taobao/android/abilityidl/callback/IMegaAbilityCallback;", "onError", "", "result", "Lcom/alibaba/ability/result/ErrorResult;", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a implements jzb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.jzb, tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            q.d(result, "result");
            String a2 = xic.a(xic.this);
            bed.a(a2, "hideLoading failed, " + result.b());
            xic.a(xic.this, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/alibaba/android/icart/core/view/status/defaultHandler/MegaLoadingHandler$doShowLoading$1", "Lcom/taobao/android/abilityidl/callback/IMegaAbilityCallback;", "onError", "", "result", "Lcom/alibaba/ability/result/ErrorResult;", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class b implements jzb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.jzb, tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            q.d(result, "result");
            String a2 = xic.a(xic.this);
            bed.a(a2, "showLoading failed, " + result.b());
            xic.a(xic.this, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/alibaba/android/icart/core/view/status/defaultHandler/MegaLoadingHandler$hideLoadingDelay$runnable$1", "Ljava/lang/Runnable;", "run", "", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xic.b(xic.this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/alibaba/android/icart/core/view/status/defaultHandler/MegaLoadingHandler$showLoadingDelay$runnable$1", "Ljava/lang/Runnable;", "run", "", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;

        public d(Activity activity) {
            this.b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xic.a(xic.this, this.b);
            }
        }
    }

    static {
        kge.a(-1049037302);
        kge.a(1909590991);
    }

    public static final /* synthetic */ String a(xic xicVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7fd4e35a", new Object[]{xicVar}) : xicVar.f34301a;
    }

    public static final /* synthetic */ void a(xic xicVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41bfacd8", new Object[]{xicVar, activity});
        } else {
            xicVar.a(activity);
        }
    }

    public static final /* synthetic */ void a(xic xicVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b4558e", new Object[]{xicVar, new Boolean(z)});
        } else {
            xicVar.c = z;
        }
    }

    public static final /* synthetic */ void b(xic xicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d32487", new Object[]{xicVar});
        } else {
            xicVar.c();
        }
    }

    @Override // tb.bfe
    public void a(bbz bbzVar, Context context, int i) {
        bcb n;
        DataBizContext o;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f750d719", new Object[]{this, bbzVar, context, new Integer(i)});
        } else if (!(context instanceof Activity)) {
        } else {
            if (this.b == null) {
                this.b = qem.a();
            }
            Activity activity = (Activity) context;
            if (bbzVar != null && (n = bbzVar.n()) != null && (o = n.o()) != null) {
                i2 = o.z();
            }
            a(activity, i2);
            b();
        }
    }

    private final void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{this, activity, new Integer(i)});
            return;
        }
        String str = this.f34301a;
        jqg.b(str, "showLoadingDelay," + i);
        d();
        d dVar = new d(activity);
        this.d = dVar;
        jqh.a(dVar, i);
    }

    private final void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        jqg.b(this.f34301a, "doShowLoading");
        this.c = true;
        qem qemVar = this.b;
        if (qemVar != null) {
            qemVar.a(activity, new fv(), new b());
            return;
        }
        xic xicVar = this;
        bed.a(xicVar.f34301a, "showLoading failed, megaLoading is null");
        xicVar.c = false;
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        jqg.b(this.f34301a, "hideLoadingDelay");
        f();
        c cVar = new c();
        this.e = cVar;
        jqh.a(cVar, 30000L);
    }

    @Override // tb.bfe
    public void b(bbz bbzVar, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c051ce5a", new Object[]{this, bbzVar, context, new Integer(i)});
            return;
        }
        jqg.b(this.f34301a, "onFinishLoading");
        d();
        c();
    }

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        jqg.b(this.f34301a, "doHideLoading");
        this.c = false;
        qem qemVar = this.b;
        if (qemVar == null) {
            return;
        }
        qemVar.a(new a());
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        e();
        f();
        jqg.b(this.f34301a, "removeDelayTasks");
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d == null) {
        } else {
            jqg.b(this.f34301a, "removeDelayShowTask");
            jqh.c(this.d);
            this.d = null;
        }
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.e == null) {
        } else {
            jqg.b(this.f34301a, "removeDelayHideTask");
            jqh.c(this.e);
            this.e = null;
        }
    }

    @Override // tb.bfe
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
    }
}
