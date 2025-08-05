package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.trtc.api.TrtcConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\tJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0016J%\u0010\u001a\u001a\u0004\u0018\u0001H\u001b\"\b\b\u0000\u0010\u001b*\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001e¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u0004\u0018\u00010!J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010#\u001a\u00020\u0012J\u0006\u0010$\u001a\u00020\u0012J\u0006\u0010%\u001a\u00020\u0012J\u0006\u0010&\u001a\u00020\u0012J\u0006\u0010'\u001a\u00020\u0012J\u000e\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0014J\u0006\u0010-\u001a\u00020\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/taobao/themis/container/embed/TMSEmbedContainerHelper;", "Lcom/taobao/themis/container/TMSContainerHelper;", "activity", "Landroid/app/Activity;", "splashContainer", "Landroid/view/ViewGroup;", "renderRootView", "(Landroid/app/Activity;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V", "hasTriggerRender", "", "mPageManager", "Lcom/taobao/themis/container/embed/TMSEmbedPageManager;", "canDowngradeToWeb", "createPageManager", "Lcom/taobao/themis/kernel/page/ITMSPageManager;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "dispatchEvent", "", "eventName", "", "params", "Lcom/alibaba/fastjson/JSON;", "target", "getContainerType", "Lcom/taobao/themis/kernel/TMSContainerType;", "getExtend", "T", "Lcom/taobao/themis/kernel/extension/controller/IControllerExtension;", "clz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/taobao/themis/kernel/extension/controller/IControllerExtension;", "getView", "Landroid/view/View;", "onActivityPause", "onActivityResume", "onActivityStart", "onActivityStop", "onViewAppear", "onViewDisappear", "registerPopExtension", TrtcConstants.TRTC_PARAMS_EXTENSION, "Lcom/taobao/themis/kernel/extension/instance/IPopPageExtension;", "reload", "url", "triggerRender", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class qot extends qos {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private qou f32997a;
    private boolean b;
    private final ViewGroup c;

    static {
        kge.a(1023266166);
    }

    public /* synthetic */ qot(Activity activity, ViewGroup viewGroup, ViewGroup viewGroup2, int i, o oVar) {
        this(activity, (i & 2) != 0 ? null : viewGroup, (i & 4) != 0 ? null : viewGroup2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qot(Activity activity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(activity, viewGroup);
        q.d(activity, "activity");
        this.c = viewGroup2;
    }

    public final void a(swd extension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8da058", new Object[]{this, extension});
            return;
        }
        q.d(extension, "extension");
        f e = e();
        if (e == null) {
            return;
        }
        e.a(extension);
    }

    @Override // tb.trk
    public TMSContainerType j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSContainerType) ipChange.ipc$dispatch("d27e2c5", new Object[]{this}) : TMSContainerType.EMBEDDED;
    }

    @Override // tb.qos
    public qqb a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qqb) ipChange.ipc$dispatch("dd2781b7", new Object[]{this, instance});
        }
        q.d(instance, "instance");
        this.f32997a = new qou(instance, this.c);
        if (this.b) {
            qou qouVar = this.f32997a;
            q.a(qouVar);
            qouVar.e();
        }
        qou qouVar2 = this.f32997a;
        q.a(qouVar2);
        return qouVar2;
    }

    public final void h() {
        ITMSPage c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        qou qouVar = this.f32997a;
        if (qouVar == null || (c = qouVar.c()) == null) {
            return;
        }
        c.p();
    }

    public final void k() {
        ITMSPage c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        qou qouVar = this.f32997a;
        if (qouVar == null || (c = qouVar.c()) == null) {
            return;
        }
        c.j();
    }

    public final void l() {
        ITMSPage c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        qou qouVar = this.f32997a;
        if (qouVar == null || (c = qouVar.c()) == null) {
            return;
        }
        c.i();
    }

    public final void m() {
        ITMSPage c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        qou qouVar = this.f32997a;
        if (qouVar == null || (c = qouVar.c()) == null) {
            return;
        }
        c.q();
    }

    public final void p() {
        ITMSPage c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        f e = e();
        if (e != null) {
            e.a("hasViewAppear", true);
        }
        qou qouVar = this.f32997a;
        if (qouVar == null || (c = qouVar.c()) == null) {
            return;
        }
        c.u();
    }

    public final void q() {
        ITMSPage c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        f e = e();
        if (e != null) {
            e.a("hasViewAppear", false);
        }
        qou qouVar = this.f32997a;
        if (qouVar == null || (c = qouVar.c()) == null) {
            return;
        }
        c.v();
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.b = true;
        qou qouVar = this.f32997a;
        if (qouVar == null) {
            return;
        }
        qouVar.e();
    }

    public final void a(String eventName, JSON json, String str) {
        ITMSPage c;
        t tVar;
        ITMSPage c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88833d07", new Object[]{this, eventName, json, str});
            return;
        }
        q.d(eventName, "eventName");
        if (str != null) {
            qou qouVar = this.f32997a;
            if (qouVar == null || (c2 = qouVar.c()) == null) {
                tVar = null;
            } else {
                c2.a(str, eventName, json);
                tVar = t.INSTANCE;
            }
            if (tVar != null) {
                return;
            }
        }
        qou qouVar2 = this.f32997a;
        if (qouVar2 == null || (c = qouVar2.c()) == null) {
            return;
        }
        c.b(eventName, json);
        t tVar2 = t.INSTANCE;
    }

    public final boolean o() {
        tlf tlfVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        f e = e();
        if (e != null && (tlfVar = (tlf) e.b(tlf.class)) != null) {
            return tlfVar.a();
        }
        return false;
    }

    public final void a(String url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, url});
            return;
        }
        q.d(url, "url");
        f e = e();
        if (e == null) {
            return;
        }
        qqp qqpVar = new qqp();
        qqpVar.f33036a = url;
        t tVar = t.INSTANCE;
        e.a(qqpVar);
    }

    public final <T extends hij> T a(Class<T> clz) {
        qqb b;
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("271b62a8", new Object[]{this, clz});
        }
        q.d(clz, "clz");
        f e = e();
        if (e != null && (t = (T) e.b(clz)) != null) {
            return t;
        }
        f e2 = e();
        ITMSPage c = (e2 == null || (b = e2.b()) == null) ? null : b.c();
        if (c == null) {
            return null;
        }
        return (T) c.a(clz);
    }
}
