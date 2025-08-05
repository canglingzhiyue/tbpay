package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.widget.a;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.widget.BarrageView;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;
import tb.ieh;

/* loaded from: classes4.dex */
public class iej implements iel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BarrageView f28968a;
    private ieh b;
    private a c;
    private DXTemplateItem d;
    private FrameLayout j;
    private RelativeLayout k;
    private int e = 0;
    private String f = "first";
    private boolean g = false;
    private List<Runnable> h = new ArrayList();
    private boolean i = false;
    private BarrageView.a l = new BarrageView.a() { // from class: tb.iej.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.ttdetail.widget.BarrageView.a
        public View a(Context context, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("83db7d7e", new Object[]{this, context, obj});
            }
            if (iej.a(iej.this) != null && (obj instanceof JSONObject)) {
                return iej.b(iej.this).a(iej.a(iej.this), (JSONObject) obj, new a.InterfaceC0381a() { // from class: tb.iej.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
                    public void a(DXTemplateItem dXTemplateItem, DXResult<DXRootView> dXResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("489f219c", new Object[]{this, dXTemplateItem, dXResult});
                        }
                    }

                    @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
                    public void a(DXTemplateItem dXTemplateItem, s sVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7d32a2d0", new Object[]{this, dXTemplateItem, sVar});
                        }
                    }
                });
            }
            return null;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.BarrageView.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                iej.c(iej.this);
            }
        }
    };

    static {
        kge.a(-653168449);
        kge.a(-957961016);
    }

    public static /* synthetic */ DXTemplateItem a(iej iejVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("315f54b5", new Object[]{iejVar}) : iejVar.d;
    }

    public static /* synthetic */ a b(iej iejVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("12618d77", new Object[]{iejVar}) : iejVar.c;
    }

    public static /* synthetic */ void c(iej iejVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca884a4c", new Object[]{iejVar});
        } else {
            iejVar.d();
        }
    }

    public static /* synthetic */ void d(iej iejVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b90b50cd", new Object[]{iejVar});
        } else {
            iejVar.g();
        }
    }

    public static /* synthetic */ List e(iej iejVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("18103539", new Object[]{iejVar}) : iejVar.h;
    }

    public iej(Context context, DinamicXEngine dinamicXEngine) {
        this.c = new a(context, dinamicXEngine);
        emu.a("com.taobao.android.detail.core.standard.mainscreen.barrage.BarrageFloatingView");
    }

    @Override // tb.iel
    public void a(FrameLayout frameLayout, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabbc065", new Object[]{this, frameLayout, jSONObject});
            return;
        }
        this.j = frameLayout;
        ieh b = iei.b(jSONObject);
        frameLayout.setVisibility(0);
        Context context = frameLayout.getContext();
        BarrageView barrageView = new BarrageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, f.a(context, 72.0f));
        layoutParams.topMargin = f.a(context, 126.0f);
        layoutParams.leftMargin = f.a(context, 8.0f);
        this.k = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(12);
        this.k.addView(barrageView, layoutParams2);
        frameLayout.addView(this.k, layoutParams);
        barrageView.setMaxCount(b.b);
        barrageView.setItemSpace(0);
        barrageView.setAnimatorDuration(300L);
        this.f28968a = barrageView;
        this.b = b;
        this.d = b.c;
        this.e = a(this.e);
        JSONArray jSONArray = b.e;
        int i = this.e;
        if (i == -1) {
            i = 0;
        }
        barrageView.initDatas(jSONArray.subList(i, this.e + 1), this.l);
        if (this.e != -1) {
            d();
        } else {
            e();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = a(this.e + 1);
        if (this.e != -1) {
            Runnable runnable = new Runnable() { // from class: tb.iej.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    iej.d(iej.this);
                    iej.e(iej.this).remove(this);
                }
            };
            this.h.add(runnable);
            this.f28968a.postDelayed(runnable, this.b.f28966a * 1000.0f);
            return;
        }
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.b.f) {
        } else {
            this.i = true;
            this.f28968a.setVisibility(8);
            this.h.remove(this);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.f = str;
        if (this.e != -1 || !this.b.f) {
            return;
        }
        this.i = false;
        this.f28968a.setVisibility(0);
        d();
    }

    private int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i >= this.b.d.size()) {
            i = 0;
        }
        for (int i2 = i; i2 < this.b.d.size(); i2++) {
            ieh.a aVar = this.b.d.get(i2);
            if (this.f.equals(aVar.b) || "all".equals(aVar.b)) {
                return i2;
            }
        }
        for (int i3 = 0; i3 < i; i3++) {
            ieh.a aVar2 = this.b.d.get(i3);
            if (this.f.equals(aVar2.b) || "all".equals(aVar2.b)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // tb.iel
    public void a(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26181c1e", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        if (i != 0) {
            z = false;
        }
        a(z);
    }

    @Override // tb.iel
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c(false);
        }
    }

    @Override // tb.iel
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            c(true);
        }
    }

    @Override // tb.iel
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.i) {
        } else {
            c(!z);
            BarrageView barrageView = this.f28968a;
            if (!z) {
                i = 8;
            }
            barrageView.setVisibility(i);
        }
    }

    @Override // tb.iel
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            a(z ? "second" : "first");
        }
    }

    @Override // tb.iel
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        f();
        FrameLayout frameLayout = this.j;
        if (frameLayout == null) {
            return;
        }
        frameLayout.removeView(this.k);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        for (Runnable runnable : this.h) {
            this.f28968a.removeCallbacks(runnable);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (this.i) {
        } else {
            if (this.g && !z) {
                this.g = false;
                f();
                g();
                return;
            }
            this.g = z;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.g) {
        } else {
            this.f28968a.addData(this.b.e.get(this.e), true);
        }
    }
}
