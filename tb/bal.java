package tb;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class bal implements bae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public f f25732a;
    public aqs b;

    static {
        kge.a(-368976239);
        kge.a(-690958592);
    }

    @Override // tb.bae
    public void a(bag bagVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1ec3102", new Object[]{this, bagVar, view});
        } else if (view == null) {
            a("onViewCreated#view is null", "weex2#containerViewError", bagVar.c());
        } else {
            FrameLayout a2 = bagVar.a();
            if (a2 == null) {
                a("onViewCreated#containerLayout is null", "weex2#containerViewError", bagVar.c());
                return;
            }
            a2.removeAllViews();
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            View j = bagVar.j();
            if (j != null) {
                a2.addView(j);
            }
            f fVar = this.f25732a;
            if (fVar != null) {
                for (bak bakVar : fVar.b(bak.class)) {
                    bakVar.a(bagVar, a2, view);
                }
            }
            a2.addView(view);
        }
    }

    @Override // tb.bae
    public void a(bag bagVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15695d0", new Object[]{this, bagVar});
            return;
        }
        f fVar = this.f25732a;
        if (fVar != null) {
            for (bak bakVar : fVar.b(bak.class)) {
                bakVar.a(bagVar);
            }
        }
        b(bagVar);
        c(bagVar);
    }

    private void b(bag bagVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd99c51", new Object[]{this, bagVar});
        } else if (bagVar.b() == null) {
        } else {
            try {
                ((ViewGroup) ((ViewGroup) ((ViewGroup) bagVar.b()).getChildAt(0)).getChildAt(0)).setFocusable(false);
            } catch (Exception e) {
                a(e.getMessage(), "weex2#fixFlutterBug", bagVar.c());
            }
        }
    }

    private void c(bag bagVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5ca2d2", new Object[]{this, bagVar});
        } else if (bagVar.h() == null) {
        } else {
            final RecyclerView recyclerView = (RecyclerView) bagVar.h().get("render_view", RecyclerView.class);
            if (recyclerView == null) {
                a("onRenderSuccess#recyclerView is null", "weex2#containerViewError", bagVar.c());
            } else {
                recyclerView.post(new Runnable() { // from class: tb.bal.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            recyclerView.getAdapter().notifyDataSetChanged();
                        }
                    }
                });
            }
        }
    }

    @Override // tb.bae
    public void a(bag bagVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d948037", new Object[]{this, bagVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        a("onRenderFailed|" + i + "|" + str, "weex2#renderError", bagVar.c());
        f fVar = this.f25732a;
        if (fVar == null) {
            return;
        }
        for (bak bakVar : fVar.b(bak.class)) {
            bakVar.a(bagVar, i, str, z);
        }
    }

    @Override // tb.bae
    public void b(bag bagVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6c3c38", new Object[]{this, bagVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        a("onRenderFailed|" + i + "|" + str, "weex2#renderError", bagVar.c());
    }

    @Override // tb.bae
    public void a(bag bagVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ddb7a3d", new Object[]{this, bagVar, new Integer(i), str});
            return;
        }
        a(i + "|" + str, "weex2#jsError", bagVar.c());
    }

    @Override // tb.bae
    public void b(bag bagVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e60bba1c", new Object[]{this, bagVar, new Integer(i), str});
            return;
        }
        a("onFatalException|" + i + "|" + str, "weex2#renderError", bagVar.c());
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (this.b == null) {
            arc.a().c("Weex2ListenerImpl", "reportError", str);
        } else {
            b bVar = new b(1, "Weex2", str2, str);
            if (!StringUtils.isEmpty(str3)) {
                HashMap hashMap = new HashMap();
                hashMap.put("AuraComponentKey", str3);
                bVar.a(hashMap);
            }
            this.b.a(bVar);
        }
    }
}
