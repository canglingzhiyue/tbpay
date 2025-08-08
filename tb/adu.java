package tb;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.s;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.searchbaseframe.util.t;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.taobao.R;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class adu extends RecyclerView.ViewHolder implements g, ads {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private p f25274a;
    private final View b;
    private final ViewGroup c;
    private int d;
    private adt e;
    private boolean f;
    private Activity g;
    private ViewGroup h;
    private boolean i;

    static {
        kge.a(1873061536);
        kge.a(-311268728);
        kge.a(1449191624);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adu(Activity activity, ViewGroup parent, boolean z) {
        super(LayoutInflater.from(activity).inflate(R.layout.libsf_search_item_muise, parent, false));
        q.c(activity, "activity");
        q.c(parent, "parent");
        this.g = activity;
        this.h = parent;
        this.i = z;
        View findViewById = this.itemView.findViewById(R.id.placeholder_img);
        q.a((Object) findViewById, "itemView.findViewById(R.id.placeholder_img)");
        this.b = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.dynamic_container);
        q.a((Object) findViewById2, "itemView.findViewById(R.id.dynamic_container)");
        this.c = (ViewGroup) findViewById2;
        this.d = -1;
        this.f = true;
        p a2 = com.taobao.android.weex_framework.q.a().a(this.g);
        String a3 = ScreenType.a(f());
        if (!StringUtils.isEmpty(a3)) {
            a2.addInstanceEnv(com.etao.feimagesearch.p.KEY_SCREEN_STYLE, a3);
        }
        a2.registerRenderListener(this);
        this.f25274a = a2;
    }

    @Override // tb.ads
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        p pVar = this.f25274a;
        if (pVar != null) {
            pVar.onActivityStart();
        }
        p pVar2 = this.f25274a;
        if (pVar2 == null) {
            return;
        }
        pVar2.onActivityResume();
    }

    @Override // tb.ads
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        p pVar = this.f25274a;
        if (pVar != null) {
            pVar.onActivityPause();
        }
        p pVar2 = this.f25274a;
        if (pVar2 == null) {
            return;
        }
        pVar2.onActivityStop();
    }

    @Override // tb.ads
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        p pVar = this.f25274a;
        if (pVar != null) {
            pVar.destroy();
        }
        this.f25274a = null;
    }

    public final void a(int i, adt adtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f41230ba", new Object[]{this, new Integer(i), adtVar});
        } else if (adtVar == null) {
        } else {
            if (this.d == i && q.a(this.e, adtVar)) {
                return;
            }
            String str = null;
            if (this.e == null) {
                this.d = i;
                this.e = adtVar;
                View itemView = this.itemView;
                q.a((Object) itemView, "itemView");
                ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
                layoutParams.height = j.a(50.0f);
                View itemView2 = this.itemView;
                q.a((Object) itemView2, "itemView");
                itemView2.setLayoutParams(layoutParams);
                if (!this.f) {
                    return;
                }
                this.f = false;
                this.b.setVisibility(0);
                this.c.setVisibility(8);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "model", (String) adtVar.b());
                jSONObject2.put((JSONObject) "status", (String) adtVar.c());
                jSONObject2.put((JSONObject) "triggerElder", String.valueOf(this.i));
                s.a aVar = s.Companion;
                p pVar = this.f25274a;
                TemplateBean a2 = adtVar.a();
                if (a2 != null) {
                    str = a2.url;
                }
                aVar.a(pVar, str, "https://h5.m.taobao.com/tusou/index.html", jSONObject, null);
                return;
            }
            this.d = i;
            this.e = adtVar;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = jSONObject3;
            jSONObject4.put((JSONObject) "model", (String) adtVar.b());
            jSONObject4.put((JSONObject) "status", (String) adtVar.c());
            p pVar2 = this.f25274a;
            if (pVar2 == null) {
                return;
            }
            pVar2.refresh(jSONObject3, null);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        p pVar = this.f25274a;
        if (pVar == null) {
            return;
        }
        pVar.sendInstanceMessage("disappear", null);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        p pVar = this.f25274a;
        if (pVar == null) {
            return;
        }
        pVar.sendInstanceMessage("appear", null);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        this.f = true;
        if (pVar == null) {
            return;
        }
        int rootHeight = pVar.getRootHeight();
        if (rootHeight > 0) {
            View itemView = this.itemView;
            q.a((Object) itemView, "itemView");
            ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
            layoutParams.height = rootHeight;
            View itemView2 = this.itemView;
            q.a((Object) itemView2, "itemView");
            itemView2.setLayoutParams(layoutParams);
        }
        View renderRoot = pVar.getRenderRoot();
        t.a(renderRoot);
        this.c.addView(renderRoot, new ViewGroup.LayoutParams(-1, -2));
        this.c.setVisibility(0);
        this.b.setVisibility(8);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.c.setVisibility(8);
        this.b.setVisibility(8);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.c.setVisibility(8);
        this.b.setVisibility(8);
    }

    private final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        ScreenType a2 = ScreenType.a(this.g);
        if (a2 == null) {
            return 0;
        }
        return a2.a();
    }
}
