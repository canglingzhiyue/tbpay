package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.model.viewmodel.main.c;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class eap<T extends c> extends com.taobao.android.detail.core.detail.kit.view.holder.c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String g;
    public int h;
    public DXResult<DXRootView> i;
    public DXTemplateItem j;
    public DinamicTemplate k;
    public ViewGroup.LayoutParams l;
    private boolean m;
    private volatile boolean n;

    static {
        kge.a(1982359590);
    }

    public static /* synthetic */ Object ipc$super(eap eapVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1545161960) {
            super.a(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue());
            return null;
        } else if (hashCode != 2121814399) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.G_();
            return null;
        }
    }

    public abstract boolean a(T t);

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ boolean a(eap eapVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6793708", new Object[]{eapVar})).booleanValue() : eapVar.m;
    }

    public static /* synthetic */ void b(eap eapVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4fc3d85", new Object[]{eapVar});
        } else {
            eapVar.k();
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((eap<T>) ((c) bVar));
        }
    }

    public eap(Context context) {
        super(context);
        this.g = getClass().getSimpleName();
        this.h = 0;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.h == 3;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.b == null) {
        } else {
            i.c(this.g, "hide()");
            if (this.l == null) {
                this.l = this.b.getLayoutParams();
            }
            this.b.setLayoutParams(new AbsListView.LayoutParams(-2, 1));
            this.b.setVisibility(8);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.b == null || this.b.getVisibility() == 0) {
        } else {
            i.c(this.g, "show()");
            ViewGroup.LayoutParams layoutParams = this.l;
            if (layoutParams != null) {
                if (layoutParams instanceof AbsListView.LayoutParams) {
                    this.b.setLayoutParams(this.l);
                } else {
                    this.b.setLayoutParams(new AbsListView.LayoutParams(this.l));
                }
            }
            this.b.setVisibility(0);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        HashMap hashMap = new HashMap();
        if (this.c != 0 && ((c) this.c).d != null) {
            hashMap.put("url", ((c) this.c).d.b);
            hashMap.put("url_v3", ((c) this.c).d.c);
            hashMap.put("version", ((c) this.c).d.d);
        }
        String str = (this.c == 0 || ((c) this.c).d == null) ? "" : ((c) this.c).d.f9766a;
        if (eaz.a(context)) {
            ecg.b(context, ept.SUB_CREATE_VIEW, str, hashMap);
            return b(context, viewGroup);
        }
        ecg.a(context, ept.SUB_CREATE_VIEW, str, hashMap);
        return c(context, viewGroup);
    }

    public void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0ee3d5", new Object[]{this, t});
        } else if (eaz.a(this.f9568a)) {
            d((eap<T>) t);
        } else {
            c((eap<T>) t);
        }
    }

    public void c(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3312af34", new Object[]{this, t});
        } else if (!a((eap<T>) t)) {
            this.b.setVisibility(8);
        } else {
            String str = "";
            if (!TextUtils.isEmpty(((c) this.c).h) && ((((c) this.c).j != null && eni.a(epo.a(), ((c) this.c).h, ((c) this.c).l)) || (((c) this.c).j == null && eni.a(epo.a(), ((c) this.c).h, ((c) this.c).mNodeBundle.a())))) {
                this.h = 3;
                e();
                HashMap hashMap = new HashMap();
                hashMap.put("subfilter", ((c) this.c).h);
                hashMap.put("rootData", ((c) this.c).mNodeBundle != null ? ((c) this.c).mNodeBundle.a() : new JSONObject());
                if (this.c != 0 && ((c) this.c).d != null) {
                    str = ((c) this.c).d.f9766a;
                }
                ecg.a(this.f9568a, "subfilterHit", str, hashMap);
                return;
            }
            try {
                if (this.h == 0) {
                    return;
                }
                HashMap hashMap2 = new HashMap();
                com.taobao.android.dinamic.view.b bVar = null;
                if (t.component != null) {
                    if (t.component.mapping != null) {
                        hashMap2.put("dataMapping", t.component.mapping);
                    }
                    if (this.c != 0 && ((c) this.c).d != null) {
                        ecg.a(this.f9568a, "fillDataToDX", ((c) this.c).d.f9766a, hashMap2);
                    }
                    bVar = ear.a().a(this.b, t.component.mapping, this.c);
                } else if (t.dmComponent != null) {
                    if (t.i != null) {
                        hashMap2.put("dataMapping", t.i);
                    }
                    if (this.c != 0 && ((c) this.c).d != null) {
                        ecg.a(this.f9568a, "fillDataToDX", ((c) this.c).d.f9766a, hashMap2);
                    }
                    bVar = ear.a().a(this.b, t.i, this.c);
                }
                if (bVar != null && !bVar.c()) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("DXError", bVar.b());
                    if (this.c != 0 && ((c) this.c).d != null) {
                        str = ((c) this.c).d.f9766a;
                    }
                    ecg.a(this.f9568a, "afterDXRender", str, "", "", hashMap3);
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("errorMsg", "模板渲染失败");
                    if ((this.f9568a instanceof DetailCoreActivity) && ((DetailCoreActivity) this.f9568a).y() != null && ((DetailCoreActivity) this.f9568a).y().h != null && ((DetailCoreActivity) this.f9568a).y().h.f27459a != null) {
                        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = ((DetailCoreActivity) this.f9568a).y().h.f27459a;
                        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar2 = cVar.f10055a;
                        hashMap4.put("itemId", cVar.i());
                        hashMap4.put("sellerType", String.valueOf(eqb.d(bVar2).shopTypeOriginal));
                        if (cVar.f() != null) {
                            hashMap4.put("bizName", cVar.f().get("aliBizName"));
                        }
                        if (bVar.b() != null) {
                            hashMap4.put("error", bVar.b().b());
                        }
                        hashMap4.put("templateId", cVar.z());
                    }
                    eps.a("Page_Detail", "90044", hashMap4);
                }
                f();
                if (epv.c) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        this.m = true;
                        c();
                        return;
                    }
                    this.n = true;
                    return;
                }
                this.m = true;
                c();
            } catch (Throwable th) {
                i.a(this.g, "dinamic bind data onFailure!!!!", th);
            }
        }
    }

    public void d(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39167a93", new Object[]{this, t});
        } else if (!a((eap<T>) t)) {
            this.b.setVisibility(8);
        } else {
            String str = "";
            if (!TextUtils.isEmpty(((c) this.c).h) && ((((c) this.c).j != null && eni.a(epo.a(), ((c) this.c).h, ((c) this.c).l)) || (((c) this.c).j == null && eni.a(epo.a(), ((c) this.c).h, ((c) this.c).mNodeBundle.a())))) {
                this.h = 3;
                e();
                HashMap hashMap = new HashMap();
                hashMap.put("subfilter", ((c) this.c).h);
                hashMap.put("rootData", ((c) this.c).mNodeBundle != null ? ((c) this.c).mNodeBundle.a() : new JSONObject());
                if (this.c != 0 && ((c) this.c).d != null) {
                    str = ((c) this.c).d.f9766a;
                }
                ecg.b(this.f9568a, "subfilterHit", str, hashMap);
                return;
            }
            try {
                if (this.h == 0) {
                    return;
                }
                if (this.b.getContext() instanceof DetailCoreActivity) {
                    DetailCoreActivity detailCoreActivity = (DetailCoreActivity) this.b.getContext();
                    bd bdVar = detailCoreActivity.d;
                    if (bdVar == null) {
                        return;
                    }
                    JSONObject jSONObject = null;
                    if (((c) this.c).component != null) {
                        jSONObject = ((c) this.c).component.mapping;
                    } else if (((c) this.c).dmComponent != null) {
                        jSONObject = ((c) this.c).i;
                    }
                    JSONObject jSONObject2 = jSONObject;
                    HashMap hashMap2 = new HashMap();
                    if (jSONObject2 != null) {
                        hashMap2.put("dataMapping", jSONObject2.toJSONString());
                    }
                    if (this.c != 0 && ((c) this.c).d != null) {
                        str = ((c) this.c).d.f9766a;
                    }
                    String str2 = str;
                    ecg.b(this.f9568a, "fillDataToDX", str2, hashMap2);
                    DXResult<DXRootView> a2 = bdVar.a(detailCoreActivity, jSONObject2, this.i.f11780a, 0, 0, this.c);
                    if (this.i != null && this.i.f11780a != null) {
                        this.i.f11780a.getDxTemplateItem();
                    }
                    if ((a2 != null && a2.b()) || this.i.f11780a == null) {
                        s a3 = a2.a();
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("DXError", a3);
                        ecg.a(this.f9568a, "afterDXRender", str2, "", "", hashMap3);
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("errorMsg", "模板渲染失败");
                        if ((this.f9568a instanceof DetailCoreActivity) && ((DetailCoreActivity) this.f9568a).y() != null && ((DetailCoreActivity) this.f9568a).y().h != null && ((DetailCoreActivity) this.f9568a).y().h.f27459a != null) {
                            com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = ((DetailCoreActivity) this.f9568a).y().h.f27459a;
                            com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = cVar.f10055a;
                            hashMap4.put("itemId", cVar.i());
                            hashMap4.put("sellerType", String.valueOf(eqb.d(bVar).shopTypeOriginal));
                            if (cVar.f() != null) {
                                hashMap4.put("bizName", cVar.f().get("aliBizName"));
                            }
                            if (this.i.a() != null) {
                                hashMap4.put("error", this.i.a().toString());
                            }
                            hashMap4.put("templateId", cVar.z());
                        }
                        eps.a("Page_Detail", "90044", hashMap4);
                        a((c) this.c, a3);
                        a(this.b);
                        return;
                    }
                    f();
                    this.b.setVisibility(0);
                    if (epv.c) {
                        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                            this.m = true;
                            c();
                            return;
                        }
                        this.n = true;
                        return;
                    }
                    this.m = true;
                    c();
                    return;
                }
                this.b.setVisibility(8);
            } catch (Throwable th) {
                i.a(this.g, "dinamic bind data onFailure!!!!", th);
            }
        }
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.LayoutParams) {
                ViewGroup.LayoutParams layoutParams2 = layoutParams;
                layoutParams2.height = 0;
                view.setLayoutParams(layoutParams2);
            } else if (layoutParams == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
            }
            view.setVisibility(8);
        }
    }

    public void a(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.size() <= 0) {
        } else {
            JSONObject a2 = ((c) this.c).mNodeBundle.a();
            if (((c) this.c).component != null) {
                str = "_" + ((c) this.c).component.key;
            } else if (((c) this.c).dmComponent != null) {
                str = "_" + eoy.a(((c) this.c).dmComponent);
            } else {
                str = "";
            }
            JSONObject jSONObject2 = a2.getJSONObject(str);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            if (((c) this.c).component != null) {
                jSONObject2.put(((c) this.c).component.ruleId, (Object) jSONObject);
                a2.put(str, (Object) jSONObject2);
            } else if (((c) this.c).dmComponent == null) {
            } else {
                jSONObject2.put(eoy.b(((c) this.c).dmComponent), (Object) jSONObject);
                a2.put(str, (Object) jSONObject2);
            }
        }
    }

    private View b(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("739ef400", new Object[]{this, context, viewGroup});
        }
        if (((c) this.c).d != null && !TextUtils.isEmpty(((c) this.c).d.f9766a) && !TextUtils.isEmpty(((c) this.c).d.d)) {
            c.a aVar = ((c) this.c).d;
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f11925a = aVar.f9766a;
            dXTemplateItem.b = Long.parseLong(aVar.d);
            if (!TextUtils.isEmpty(aVar.c)) {
                dXTemplateItem.c = aVar.c;
            } else if (!TextUtils.isEmpty(aVar.b)) {
                dXTemplateItem.c = aVar.b;
            }
            if (context instanceof DetailCoreActivity) {
                bd bdVar = ((DetailCoreActivity) context).d;
                if (bdVar == null) {
                    return a(context);
                }
                this.j = bdVar.a(dXTemplateItem);
                DXTemplateItem dXTemplateItem2 = this.j;
                if (dXTemplateItem2 == null) {
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                    this.h = 0;
                    return frameLayout;
                }
                if (this.i == null || (!TextUtils.isEmpty(dXTemplateItem2.c) && !this.j.c.endsWith(".zip"))) {
                    this.i = bdVar.a(context, viewGroup, this.j);
                }
                DXResult<DXRootView> dXResult = this.i;
                if (dXResult != null && !dXResult.b() && this.i.f11780a != null && this.j != null) {
                    long j = 0;
                    try {
                        j = Long.parseLong(aVar.d);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (!TextUtils.isEmpty(this.j.f11925a) && aVar != null && this.j.f11925a.equals(aVar.f9766a) && this.j.b == j) {
                        this.h = 3;
                    } else {
                        this.h = 2;
                    }
                    return this.i.f11780a;
                }
            }
        }
        return a(context);
    }

    private View a(Context context) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        if (((c) this.c).d != null && TextUtils.isEmpty(((c) this.c).d.b)) {
            i = 3;
        }
        this.h = i;
        return frameLayout;
    }

    private View c(Context context, ViewGroup viewGroup) {
        boolean z;
        IpChange ipChange = $ipChange;
        int i = 2;
        int i2 = 1;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f5e9a8df", new Object[]{this, context, viewGroup});
        }
        if (((c) this.c).d != null && !TextUtils.isEmpty(((c) this.c).d.f9766a) && !TextUtils.isEmpty(((c) this.c).d.d)) {
            c.a aVar = ((c) this.c).d;
            DinamicTemplate dinamicTemplate = new DinamicTemplate();
            dinamicTemplate.name = aVar.f9766a;
            dinamicTemplate.version = aVar.d;
            dinamicTemplate.templateUrl = aVar.b;
            DinamicTemplate d = ear.b().d(dinamicTemplate);
            if (d == null || d.isPreset()) {
                z = false;
            } else {
                try {
                    com.taobao.android.dinamic.view.b a2 = com.taobao.android.detail.core.async.b.a().a(context, viewGroup, d);
                    if (a2 == null) {
                        a2 = ear.a().a(context, viewGroup, d);
                    }
                    if (a2.c()) {
                        if (d.equals(dinamicTemplate)) {
                            i = 3;
                        }
                        this.h = i;
                        this.k = d;
                        return a2.e();
                    }
                } catch (Throwable th) {
                    i.a(this.g, "create dinamic view onFailure!!", th);
                }
                z = true;
            }
            if (z) {
                d = ear.b().g(dinamicTemplate);
            }
            if (d != null && d.isPreset()) {
                try {
                    com.taobao.android.dinamic.view.b a3 = com.taobao.android.detail.core.async.b.a().a(context, viewGroup, d);
                    if (a3 == null) {
                        a3 = ear.a().a(context, viewGroup, d);
                    }
                    if (a3.c()) {
                        if (TextUtils.isEmpty(aVar.b) || z) {
                            i2 = 3;
                        }
                        this.h = i2;
                        this.k = d;
                        return a3.e();
                    }
                } catch (Throwable th2) {
                    i.a(this.g, "create preset dinamic view onFailure!!", th2);
                }
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        if (((c) this.c).d != null && TextUtils.isEmpty(((c) this.c).d.b)) {
            i3 = 3;
        }
        this.h = i3;
        return frameLayout;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.eap$1] */
    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
            return;
        }
        super.G_();
        new AsyncTask<Void, Void, Void>() { // from class: tb.eap.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
            @Override // android.os.AsyncTask
            public /* synthetic */ Void doInBackground(Void[] voidArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            public Void a(Void... voidArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                }
                if (eap.a(eap.this)) {
                    return null;
                }
                eap.this.c();
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [tb.eap$2] */
    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        super.a(z, z2);
        new AsyncTask<Void, Void, Void>() { // from class: tb.eap.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
            @Override // android.os.AsyncTask
            public /* synthetic */ Void doInBackground(Void[] voidArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            public Void a(Void... voidArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                }
                eap.b(eap.this);
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void c() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.n = false;
        if (this.h == 0 || this.b.getVisibility() == 8) {
            return;
        }
        if (((c) this.c).component != null) {
            JSONObject jSONObject2 = ((c) this.c).component.mapping.getJSONObject("track");
            if (jSONObject2 == null || jSONObject2.size() <= 0) {
                return;
            }
            try {
                JSONArray jSONArray = jSONObject2.getJSONArray("onAppear");
                if (jSONArray == null) {
                    return;
                }
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        b((JSONObject) next);
                    }
                }
            } catch (Throwable th) {
                try {
                    b(jSONObject2.getJSONObject("onAppear"));
                } catch (Throwable unused) {
                    i.a(this.g, "exposure", th);
                }
            }
        } else if (((c) this.c).dmComponent == null || (jSONObject = ((c) this.c).i.getJSONObject("track")) == null || jSONObject.size() <= 0) {
        } else {
            try {
                JSONArray jSONArray2 = jSONObject.getJSONArray("onAppear");
                if (jSONArray2 == null) {
                    return;
                }
                Iterator<Object> it2 = jSONArray2.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (next2 instanceof JSONObject) {
                        b((JSONObject) next2);
                    }
                }
            } catch (Throwable th2) {
                try {
                    b(jSONObject.getJSONObject("onAppear"));
                } catch (Throwable unused2) {
                    i.a(this.g, "exposure", th2);
                }
            }
        }
    }

    private void k() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.h == 0 || this.b.getVisibility() == 8) {
        } else {
            if (((c) this.c).component != null) {
                JSONObject jSONObject2 = ((c) this.c).component.mapping.getJSONObject("track");
                if (jSONObject2 == null || jSONObject2.size() <= 0) {
                    return;
                }
                try {
                    JSONArray jSONArray = jSONObject2.getJSONArray("onAppear");
                    if (jSONArray == null) {
                        return;
                    }
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            c((JSONObject) next);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        c(jSONObject2.getJSONObject("onAppear"));
                    } catch (Throwable unused) {
                        i.a(this.g, "exposure", th);
                    }
                }
            } else if (((c) this.c).dmComponent == null || (jSONObject = ((c) this.c).i.getJSONObject("track")) == null || jSONObject.size() <= 0) {
            } else {
                try {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("onAppear");
                    if (jSONArray2 == null) {
                        return;
                    }
                    Iterator<Object> it2 = jSONArray2.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (next2 instanceof JSONObject) {
                            c((JSONObject) next2);
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        c(jSONObject.getJSONObject("onAppear"));
                    } catch (Throwable unused2) {
                        i.a(this.g, "exposure", th2);
                    }
                }
            }
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        Event a2 = ehs.a(this.f9568a, new ActionModel(jSONObject), ((c) this.c).mNodeBundle, null, null);
        if (a2 == null) {
            return;
        }
        f.a(this.f9568a, a2);
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            ActionModel actionModel = new ActionModel(jSONObject);
            if (!"ut_exposure".equals(actionModel.type)) {
                return;
            }
            actionModel.type = "disappear";
            Event a2 = ehs.a(this.f9568a, actionModel, ((c) this.c).mNodeBundle, null, null);
            if (a2 == null) {
                return;
            }
            f.a(this.f9568a, a2);
        }
    }

    private void a(c cVar, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d6a3cb", new Object[]{this, cVar, sVar});
        } else if (sVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(com.taobao.android.purchase.core.b.ACTIVITY_KEY_BIZ_TYPE, sVar.f11919a);
            if (sVar.b != null && !TextUtils.isEmpty(sVar.b.f11925a)) {
                hashMap.put("templateItemName", sVar.b.f11925a);
            } else if (cVar != null && cVar.d != null && !TextUtils.isEmpty(cVar.d.f9766a)) {
                hashMap.put("templateItemName", cVar.d.f9766a);
            }
            List<s.a> list = sVar.c;
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    s.a aVar = list.get(i);
                    if (!TextUtils.isEmpty(aVar.c)) {
                        hashMap.put("featureType_" + i, aVar.c);
                    }
                    if (!TextUtils.isEmpty(aVar.b)) {
                        hashMap.put("serviceId_" + i, aVar.b);
                    }
                    if (!TextUtils.isEmpty(aVar.e)) {
                        hashMap.put("reason_" + i, aVar.e);
                    }
                    hashMap.put("code_" + i, String.valueOf(aVar.d));
                }
            }
            hashMap.put("ultron_key", TStudioHelper.a().a(cVar.dmComponent));
            TStudioHelper.a().d(JSON.toJSONString(hashMap));
            ecg.a(this.f9568a, hashMap);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (!this.n) {
        } else {
            c();
        }
    }

    public View j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this}) : this.b;
    }
}
