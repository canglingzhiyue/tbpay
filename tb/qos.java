package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.s;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.entity.InstanceStartParams;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.solution.b;
import com.taobao.themis.kernel.utils.a;
import com.taobao.themis.kernel.utils.d;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.utils.o;
import com.uc.webview.export.media.MessageID;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0010H$J\b\u0010,\u001a\u0004\u0018\u00010\u0010J\u001a\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001c\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u001e2\b\u00105\u001a\u0004\u0018\u00010\u0018H\u0016J\"\u00106\u001a\u0002032\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u000203H\u0016J\u001a\u0010=\u001a\u0002032\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001c\u0010>\u001a\u00020$2\u0006\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u000101H\u0002J\u001a\u0010?\u001a\u0002032\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/0AR\u001a\u0010\u0007\u001a\u00020\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006B"}, d2 = {"Lcom/taobao/themis/container/TMSContainerHelper;", "Lcom/taobao/themis/container/IContainerHelper;", "mActivity", "Landroid/app/Activity;", "mSplashViewContainer", "Landroid/view/ViewGroup;", "(Landroid/app/Activity;Landroid/view/ViewGroup;)V", "disableActivityFinish", "", "getDisableActivityFinish", "()Z", "setDisableActivityFinish", "(Z)V", "getMActivity", "()Landroid/app/Activity;", "mInstance", "Lcom/taobao/themis/kernel/TMSInstance;", "getMInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "setMInstance", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "mLaunchListener", "Lcom/taobao/themis/kernel/TMSInstance$ILaunchListener;", "mRenderListener", "Lcom/taobao/themis/kernel/TMSInstance$IRenderListener;", "getMRenderListener", "()Lcom/taobao/themis/kernel/TMSInstance$IRenderListener;", "setMRenderListener", "(Lcom/taobao/themis/kernel/TMSInstance$IRenderListener;)V", "mSolutionType", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "getMSolutionType", "()Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "setMSolutionType", "(Lcom/taobao/themis/kernel/solution/TMSSolutionType;)V", "mStartParams", "Lcom/taobao/themis/kernel/entity/InstanceStartParams;", "getMStartParams", "()Lcom/taobao/themis/kernel/entity/InstanceStartParams;", "setMStartParams", "(Lcom/taobao/themis/kernel/entity/InstanceStartParams;)V", "createPageManager", "Lcom/taobao/themis/kernel/page/ITMSPageManager;", "instance", "getTMSInstance", "init", "url", "", "extraData", "Lcom/alibaba/fastjson/JSONObject;", "launch", "", "solutionType", "renderListener", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", MessageID.onDestroy, "reload", "setupParams", "updateMonitorPoint", "monitorData", "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class qos implements trk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private f f32996a;
    private f.a b;
    private InstanceStartParams c;
    private final Activity e;
    private final ViewGroup f;
    private TMSSolutionType g;
    private f.c h;
    private boolean i;

    static {
        kge.a(1876178329);
        kge.a(-1276322966);
    }

    public abstract qqb a(f fVar);

    public qos(Activity mActivity, ViewGroup viewGroup) {
        q.d(mActivity, "mActivity");
        this.e = mActivity;
        this.f = viewGroup;
    }

    public final Activity d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("26eeb89d", new Object[]{this}) : this.e;
    }

    public final f e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("739469af", new Object[]{this}) : this.f32996a;
    }

    public final TMSSolutionType s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSSolutionType) ipChange.ipc$dispatch("aa831478", new Object[]{this}) : this.g;
    }

    public final f.c t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.c) ipChange.ipc$dispatch("74fceda1", new Object[]{this}) : this.h;
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : this.i;
    }

    private final InstanceStartParams b(String str, JSONObject jSONObject) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstanceStartParams) ipChange.ipc$dispatch("f23bfbcb", new Object[]{this, str, jSONObject});
        }
        Uri uri = o.b(str);
        Bundle bundle = new Bundle();
        q.b(uri, "uri");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        q.b(queryParameterNames, "uri.queryParameterNames");
        for (String str2 : queryParameterNames) {
            if ((!q.a((Object) str2, (Object) "query")) && (queryParameter = uri.getQueryParameter(str2)) != null) {
                bundle.putString(str2, queryParameter);
            }
        }
        Bundle bundle2 = new Bundle();
        String queryStr = uri.getQueryParameter("query");
        if (queryStr != null) {
            q.b(queryStr, "queryStr");
            for (String str3 : n.b((CharSequence) queryStr, new String[]{"&"}, false, 0, 6, (Object) null)) {
                List b = n.b((CharSequence) str3, new String[]{"="}, false, 0, 6, (Object) null);
                if (b.size() >= 2) {
                    bundle2.putString((String) b.get(0), (String) b.get(1));
                }
            }
        }
        if (jSONObject != null) {
            return new InstanceStartParams(str, bundle, bundle2, jSONObject);
        }
        return new InstanceStartParams(str, bundle, bundle2);
    }

    @Override // tb.trk
    public f a(String url, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("29326bdd", new Object[]{this, url, jSONObject});
        }
        q.d(url, "url");
        d.a("TMSContainerHelper#init#setupParams", (Pair) null, (Pair) null, 6, (Object) null);
        InstanceStartParams b = b(url, jSONObject);
        this.c = b;
        d.a("TMSContainerHelper#init#setupParams");
        f a2 = teh.a(this.e, b, j());
        this.f32996a = a2;
        a2.a((Class<Class>) qos.class, (Class) this);
        return a2;
    }

    @Override // tb.trk
    public void a(TMSSolutionType tMSSolutionType, f.c cVar) {
        tei D;
        thk a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ae3a8c", new Object[]{this, tMSSolutionType, cVar});
            return;
        }
        f fVar = this.f32996a;
        if (fVar == null) {
            return;
        }
        this.g = tMSSolutionType;
        this.h = cVar;
        d dVar = d.INSTANCE;
        fVar.a(a(fVar));
        fVar.a(cVar);
        Activity activity = null;
        d.a("TMSContainerHelper#launch#createSolution", (Pair) null, (Pair) null, 6, (Object) null);
        TMSBaseSolution a3 = b.a(fVar, tMSSolutionType);
        if (a3 == null) {
            return;
        }
        q.b(a3, "TMSSolutionFactory.creat…, solutionType) ?: return");
        d.a("TMSContainerHelper#launch#createSolution");
        d dVar2 = d.INSTANCE;
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            a3.createSplashView(viewGroup);
        }
        fVar.a(a3);
        ISplashView splashView = a3.getSplashView();
        if (splashView != null) {
            splashView.a();
        }
        this.b = a3.getLaunchListener();
        f.a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
        f fVar2 = this.f32996a;
        if (fVar2 != null) {
            fVar2.a(this.b);
        }
        f fVar3 = this.f32996a;
        if (fVar3 != null && (a2 = a.a(fVar3)) != null) {
            a2.a("pageCreateEnd");
        }
        f fVar4 = this.f32996a;
        if (fVar4 == null || (D = fVar4.D()) == null) {
            return;
        }
        f fVar5 = this.f32996a;
        if (fVar5 != null) {
            activity = fVar5.o();
        }
        D.a("getUseHomeFragmentAB", t.e(activity).a());
    }

    public final f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("52d36a33", new Object[]{this}) : this.f32996a;
    }

    public final void a(Map<String, String> monitorData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, monitorData});
            return;
        }
        q.d(monitorData, "monitorData");
        f fVar = this.f32996a;
        if (fVar == null) {
            return;
        }
        if (monitorData.containsKey("containerStart")) {
            fVar.k().a("containerStart", String.valueOf(monitorData.get("containerStart")));
            thk a2 = a.a(fVar);
            if (a2 != null) {
                a2.a("containerStart", String.valueOf(monitorData.get("containerStart")));
            }
            s sVar = s.f18233a;
            q.b(sVar, "ProcedureManagerProxy.PROXY");
            sVar.d().a("TMS_appStart", com.taobao.themis.utils.f.c(String.valueOf(monitorData.get("containerStart"))));
        }
        if (monitorData.containsKey("recycledActivity")) {
            fVar.k().b("recycledActivity", String.valueOf(monitorData.get("recycledActivity")));
        }
        if (!monitorData.containsKey("containerOnCreate")) {
            return;
        }
        fVar.k().a("containerOnCreate", String.valueOf(monitorData.get("containerOnCreate")));
        thk a3 = a.a(fVar);
        if (a3 != null) {
            a3.a("containerOnCreate", String.valueOf(monitorData.get("containerOnCreate")));
        }
        s sVar2 = s.f18233a;
        q.b(sVar2, "ProcedureManagerProxy.PROXY");
        sVar2.d().a("containerOnCreate", com.taobao.themis.utils.f.c(String.valueOf(monitorData.get("containerOnCreate"))));
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        f fVar = this.f32996a;
        if (fVar == null) {
            return;
        }
        fVar.r();
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        f fVar = this.f32996a;
        if (fVar == null) {
            return;
        }
        fVar.a(i, i2, intent);
    }

    public void c(String url, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a262bc", new Object[]{this, url, jSONObject});
            return;
        }
        q.d(url, "url");
        this.i = true;
        f fVar = this.f32996a;
        if (fVar != null) {
            fVar.r();
        }
        this.i = false;
        a(url, jSONObject);
        a(this.g, this.h);
    }
}
