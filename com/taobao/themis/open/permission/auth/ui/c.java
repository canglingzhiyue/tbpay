package com.taobao.themis.open.permission.auth.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.tao.remotebusiness.RequestPoolManager;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.open.permission.auth.AuthUtils;
import com.taobao.themis.open.permission.auth.model.DomainItemEntity;
import com.taobao.themis.open.permission.auth.model.ResourceItemEntity;
import com.taobao.themis.open.permission.auth.model.ScopeEntity;
import com.taobao.themis.open.permission.auth.model.ScopeSettingEntity;
import com.taobao.themis.open.permission.auth.ui.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpm;
import tb.qqn;
import tb.qqo;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u00012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\fH\u0016J\b\u0010%\u001a\u00020\u0018H\u0016J\u0018\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016J\b\u0010*\u001a\u00020\u001aH\u0016J \u0010+\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(2\u0006\u0010,\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016J\u0018\u0010-\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u001aH\u0002R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n \b*\u0004\u0018\u00010\u00180\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/taobao/themis/open/permission/auth/ui/AuthSettingRender;", "Lcom/taobao/themis/kernel/runtime/TMSBaseRender;", "Lcom/taobao/themis/open/permission/auth/ui/ScopeAdapter$ScopeClickListener;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "activity", "Landroid/app/Activity;", "kotlin.jvm.PlatformType", "mAdapter", "Lcom/taobao/themis/open/permission/auth/ui/ScopeAdapter;", "mAppId", "", "mAppKey", "mAuthStatusList", "", "Lcom/taobao/themis/open/permission/auth/model/ScopeSettingEntity;", "mNoAuthHintView", "Landroid/widget/TextView;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "getPage", "()Lcom/taobao/themis/kernel/page/ITMSPage;", "rootView", "Landroid/view/View;", "execJSToRender", "", "script", "", "name", "fireEventOld", "event", "params", "Lcom/alibaba/fastjson/JSON;", "getCurrentPageSnapshot", "Landroid/graphics/Bitmap;", "getRenderType", "getView", "onDomainClick", "groupPosition", "", "childPosition", "onPause", "onResourceClick", "domainPosition", "onScopeClick", "render", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/runtime/TMSRenderListener;", "updateAuthStatus", "LoadStatusTask", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c extends qqn implements f.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Activity c;
    private final View d;
    private RecyclerView e;
    private f f;
    private final List<ScopeSettingEntity> g;
    private TextView h;
    private final String i;
    private final String j;
    private final ITMSPage k;

    static {
        kge.a(-1449886599);
        kge.a(-2000031892);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -69967319) {
            super.a((qqo) objArr[0]);
            return null;
        } else if (hashCode != 90991720) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a();
            return null;
        }
    }

    @Override // tb.qqq
    public void a(String event, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8072587d", new Object[]{this, event, json});
        } else {
            q.d(event, "event");
        }
    }

    @Override // tb.qqq
    public void a(String script, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, script, str});
        } else {
            q.d(script, "script");
        }
    }

    @Override // tb.qqq
    public void a(byte[] script, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3ac339", new Object[]{this, script, str});
        } else {
            q.d(script, "script");
        }
    }

    @Override // tb.qqq
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : RequestPoolManager.Type.AUTH;
    }

    @Override // tb.qqq
    public Bitmap di_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("db94d7df", new Object[]{this});
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ITMSPage page) {
        super(page);
        q.d(page, "page");
        this.k = page;
        this.c = this.k.b().o();
        this.d = View.inflate(this.c, R.layout.tms_view_auth_setting, null);
        this.g = new ArrayList();
        this.i = this.f33035a.h();
        this.j = k.o(this.f33035a);
    }

    public static final /* synthetic */ com.taobao.themis.kernel.f a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.kernel.f) ipChange.ipc$dispatch("1b016060", new Object[]{cVar}) : cVar.f33035a;
    }

    public static final /* synthetic */ TextView b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("c571d6ee", new Object[]{cVar}) : cVar.h;
    }

    public static final /* synthetic */ RecyclerView c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("8a2e4c0b", new Object[]{cVar}) : cVar.e;
    }

    public static final /* synthetic */ List d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("dfe8828f", new Object[]{cVar}) : cVar.g;
    }

    public static final /* synthetic */ f e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("262dd7e7", new Object[]{cVar}) : cVar.f;
    }

    @Override // tb.qqn, tb.qqq
    public void a(qqo listener) {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd46229", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        super.a(listener);
        qpm f = this.k.f();
        if (f != null && (titleBar = f.getTitleBar()) != null) {
            titleBar.setTitle(this.c.getString(R.string.tms_scope_setting), "");
        }
        this.e = (RecyclerView) this.d.findViewById(R.id.tms_scope_list);
        this.f = new f(this.g, this);
        RecyclerView recyclerView = this.e;
        q.a(recyclerView);
        recyclerView.setAdapter(this.f);
        RecyclerView recyclerView2 = this.e;
        q.a(recyclerView2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.c));
        if (q.a((Object) k.s(this.f33035a), (Object) com.taobao.android.weex_framework.util.a.ATOM_EXT_black)) {
            RecyclerView recyclerView3 = this.e;
            q.a(recyclerView3);
            ViewGroup.LayoutParams layoutParams = recyclerView3.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = com.taobao.themis.utils.k.a((Context) this.c, 80.0f);
            RecyclerView recyclerView4 = this.e;
            q.a(recyclerView4);
            recyclerView4.setLayoutParams(layoutParams2);
        }
        this.h = (TextView) this.d.findViewById(R.id.tms_no_setting_desc);
        new a(new WeakReference(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ)\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\"\u00020\u0002H\u0014¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0015R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/themis/open/permission/auth/ui/AuthSettingRender$LoadStatusTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/taobao/themis/open/permission/auth/model/ScopeSettingEntity;", "mRenderWeakReference", "Ljava/lang/ref/WeakReference;", "Lcom/taobao/themis/open/permission/auth/ui/AuthSettingRender;", "(Ljava/lang/ref/WeakReference;)V", "doInBackground", "voids", "", "([Ljava/lang/Void;)Ljava/util/List;", "onPostExecute", "", "result", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a extends AsyncTask<Void, Void, List<? extends ScopeSettingEntity>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f22699a;

        static {
            kge.a(1981286856);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List<? extends com.taobao.themis.open.permission.auth.model.ScopeSettingEntity>] */
        @Override // android.os.AsyncTask
        public /* synthetic */ List<? extends ScopeSettingEntity> doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(List<? extends ScopeSettingEntity> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, list});
            } else {
                a((List<ScopeSettingEntity>) list);
            }
        }

        public a(WeakReference<c> mRenderWeakReference) {
            q.d(mRenderWeakReference, "mRenderWeakReference");
            this.f22699a = mRenderWeakReference;
        }

        public List<ScopeSettingEntity> a(Void... voids) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("ed23ac73", new Object[]{this, voids});
            }
            q.d(voids, "voids");
            c cVar = this.f22699a.get();
            if (cVar == null) {
                return null;
            }
            q.b(cVar, "mRenderWeakReference.get() ?: return null");
            AuthUtils authUtils = AuthUtils.INSTANCE;
            com.taobao.themis.kernel.f a2 = c.a(cVar);
            AuthUtils.InvokeType invokeType = AuthUtils.InvokeType.TYPE_ORIGIN;
            String h = c.a(cVar).h();
            q.b(h, "render.mInstance.appId");
            return authUtils.a(a2, invokeType, k.o(c.a(cVar)), h);
        }

        public void a(List<ScopeSettingEntity> list) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                return;
            }
            c cVar = this.f22699a.get();
            if (cVar == null) {
                return;
            }
            q.b(cVar, "mRenderWeakReference.get() ?: return");
            List<ScopeSettingEntity> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            }
            if (z) {
                TextView b = c.b(cVar);
                if (b != null) {
                    b.setVisibility(0);
                }
                RecyclerView c = c.c(cVar);
                if (c == null) {
                    return;
                }
                c.setVisibility(8);
                return;
            }
            c.d(cVar).clear();
            c.d(cVar).addAll(list2);
            f e = c.e(cVar);
            if (e == null) {
                return;
            }
            e.notifyDataSetChanged();
        }
    }

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        AuthUtils authUtils = AuthUtils.INSTANCE;
        com.taobao.themis.kernel.f fVar = this.f33035a;
        AuthUtils.InvokeType invokeType = AuthUtils.InvokeType.TYPE_ORIGIN;
        String mAppId = this.i;
        q.b(mAppId, "mAppId");
        authUtils.a(fVar, invokeType, mAppId, this.j, this.g);
    }

    @Override // tb.qqn, tb.qqq
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        c();
    }

    @Override // tb.qqq
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        View rootView = this.d;
        q.b(rootView, "rootView");
        return rootView;
    }

    @Override // com.taobao.themis.open.permission.auth.ui.f.b
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        List<ScopeEntity> scopes = this.g.get(i).getScopes();
        if (scopes == null) {
            return;
        }
        scopes.get(i2).setStatus(!scopes.get(i2).getStatus());
        scopes.get(i2).setChanged(!scopes.get(i2).isChanged());
        f fVar = this.f;
        if (fVar == null) {
            return;
        }
        fVar.notifyDataSetChanged();
    }

    @Override // com.taobao.themis.open.permission.auth.ui.f.b
    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        List<DomainItemEntity> domainItems = this.g.get(i).getDomainItems();
        if (domainItems == null) {
            return;
        }
        if (domainItems.get(i2).isAuthed()) {
            domainItems.get(i2).setStatus("reject");
        } else {
            domainItems.get(i2).setStatus("accept");
        }
        domainItems.get(i2).setChanged(!domainItems.get(i2).isChanged());
        f fVar = this.f;
        if (fVar == null) {
            return;
        }
        fVar.notifyDataSetChanged();
    }

    @Override // com.taobao.themis.open.permission.auth.ui.f.b
    public void a(int i, int i2, int i3) {
        List<ResourceItemEntity> resourceItems;
        ResourceItemEntity resourceItemEntity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        List<DomainItemEntity> domainItems = this.g.get(i).getDomainItems();
        if (domainItems == null || (resourceItems = domainItems.get(i2).getResourceItems()) == null || (resourceItemEntity = resourceItems.get(i3)) == null) {
            return;
        }
        if (resourceItemEntity.isAuthed()) {
            resourceItemEntity.setStatus("reject");
        } else {
            resourceItemEntity.setStatus("accept");
        }
        resourceItemEntity.setChanged(!domainItems.get(i3).isChanged());
        f fVar = this.f;
        if (fVar == null) {
            return;
        }
        fVar.notifyDataSetChanged();
    }
}
