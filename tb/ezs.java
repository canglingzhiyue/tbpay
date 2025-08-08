package tb;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.app.h;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.d;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.communication.f;
import com.taobao.android.detail.ttdetail.communication.g;
import com.taobao.android.detail.ttdetail.component.module.i;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.lightoff.DXFloatContainer;
import com.taobao.android.detail.ttdetail.utils.be;
import com.taobao.android.detail.ttdetail.utils.br;
import com.taobao.android.detail.ttdetail.utils.k;
import com.taobao.android.detail.ttdetail.utils.l;
import com.taobao.android.detail.ttdetail.utils.m;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.detail.ttdetail.widget.TTViewPager;
import com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class ezs extends h implements f<d, Boolean>, g<com.taobao.android.detail.ttdetail.bizmessage.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private iok A;
    private volatile double B;
    private DragDismissLayout.a C;
    private TTViewPager.e D;
    private View E;
    private boolean F;
    private View G;

    /* renamed from: a  reason: collision with root package name */
    private eyx f27697a;
    private Context b;
    private List<i> c;
    private Rect d;
    private int e;
    private volatile boolean f;
    private volatile boolean g;
    private String h;
    private int i;
    private View j;
    private TTViewPager k;
    private eyu l;
    private View m;
    private View n;
    private TextView o;
    private TextView p;
    private TextView q;
    private View r;
    private View s;
    private DXFloatContainer t;
    private volatile boolean u;
    private int v;
    private c w;
    private a x;
    private b y;
    private boolean z;

    /* loaded from: classes5.dex */
    public interface a {
        Rect a(com.taobao.android.detail.ttdetail.component.module.h hVar);
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(com.taobao.android.detail.ttdetail.component.module.h hVar);
    }

    /* loaded from: classes5.dex */
    public interface c {
        void a(ezs ezsVar, com.taobao.android.detail.ttdetail.component.module.h hVar);

        void b(ezs ezsVar, com.taobao.android.detail.ttdetail.component.module.h hVar);
    }

    static {
        kge.a(2047112708);
        kge.a(-767194759);
        kge.a(1548924286);
    }

    public static /* synthetic */ Object ipc$super(ezs ezsVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1373052399) {
            super.dismiss();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != -340027132) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.show();
            return null;
        }
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29d2d87", new Object[]{this, onDismissListener});
        }
    }

    public static /* synthetic */ double a(ezs ezsVar, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("138177b2", new Object[]{ezsVar, new Double(d)})).doubleValue();
        }
        ezsVar.B = d;
        return d;
    }

    public static /* synthetic */ void a(ezs ezsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7dadfba", new Object[]{ezsVar});
        } else {
            ezsVar.e();
        }
    }

    public static /* synthetic */ void a(ezs ezsVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13817f46", new Object[]{ezsVar, new Float(f)});
        } else {
            ezsVar.a(f);
        }
    }

    public static /* synthetic */ void a(ezs ezsVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13818a89", new Object[]{ezsVar, new Integer(i)});
        } else {
            ezsVar.a(i);
        }
    }

    public static /* synthetic */ boolean a(ezs ezsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1381ca5e", new Object[]{ezsVar, new Boolean(z)})).booleanValue();
        }
        ezsVar.u = z;
        return z;
    }

    public static /* synthetic */ int b(ezs ezsVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f55f541b", new Object[]{ezsVar, new Integer(i)})).intValue();
        }
        ezsVar.v = i;
        return i;
    }

    public static /* synthetic */ eyx b(ezs ezsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("89c0c627", new Object[]{ezsVar}) : ezsVar.f27697a;
    }

    public static /* synthetic */ eyu c(ezs ezsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyu) ipChange.ipc$dispatch("71629c29", new Object[]{ezsVar}) : ezsVar.l;
    }

    public static /* synthetic */ void g(ezs ezsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eed06c0", new Object[]{ezsVar});
        } else {
            ezsVar.c();
        }
    }

    public static /* synthetic */ TextView h(ezs ezsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("5aa542b5", new Object[]{ezsVar}) : ezsVar.q;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public /* synthetic */ boolean receiveMessage(com.taobao.android.detail.ttdetail.bizmessage.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, aVar})).booleanValue() : a(aVar);
    }

    public ezs(Context context, eyx eyxVar, List<i> list, boolean z, String str, Rect rect) {
        super(context, R.style.TTDetail_Dialog_FullScreen);
        this.e = -1;
        this.v = 0;
        this.C = new ezt(this);
        this.D = new TTViewPager.e() { // from class: tb.ezs.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.e
            public void a(int i, int i2, float f, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9d14c40b", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Integer(i3)});
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.e
            public void onPageSelected(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                } else {
                    ezs.a(ezs.this, i);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.e
            public void a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else {
                    ezs.b(ezs.this, i);
                }
            }
        };
        this.b = context;
        this.f27697a = eyxVar;
        this.c = list;
        this.h = str;
        this.i = a(list, str);
        this.d = rect;
        com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(this.b);
        if (a2 != null) {
            this.j = a2.a(this.b, R.layout.tt_detail_lightoff_container, null, true);
        } else {
            this.j = LayoutInflater.from(this.b).inflate(R.layout.tt_detail_lightoff_container, (ViewGroup) null);
        }
        this.z = z;
        this.r = this.j.findViewById(R.id.view_black_bg_holder);
        this.s = this.j.findViewById(R.id.fl_front_content_holder);
        this.t = (DXFloatContainer) this.j.findViewById(R.id.dx_float_container);
        if (this.z) {
            this.A = new iok(eyxVar, this.t);
        }
        this.k = (TTViewPager) this.j.findViewById(R.id.vp_lightoff_main_container);
        if (this.z) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.k.getLayoutParams();
            layoutParams.bottomMargin = gbg.a(this.b, 56.0f);
            this.k.setLayoutParams(layoutParams);
        }
        this.m = this.j.findViewById(R.id.ll_top_action_container);
        this.n = this.j.findViewById(R.id.iv_close);
        this.n.setOnClickListener(new View.OnClickListener() { // from class: tb.ezs.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    ezs.this.dismiss();
                }
            }
        });
        this.E = this.j.findViewById(R.id.ll_find_similar);
        this.E.setOnClickListener(new View.OnClickListener() { // from class: tb.ezs.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    ezs.a(ezs.this);
                }
            }
        });
        this.F = f();
        this.G = this.j.findViewById(R.id.ll_index_container);
        Drawable c2 = br.c();
        if (c2 != null) {
            this.G.setBackground(c2);
        }
        this.o = (TextView) this.j.findViewById(R.id.tv_current_index);
        this.p = (TextView) this.j.findViewById(R.id.tv_total_size);
        this.q = (TextView) this.j.findViewById(R.id.tv_sku_desc);
        Drawable e = br.e();
        if (e != null) {
            this.q.setBackground(e);
        }
        this.o.setText(String.valueOf(this.i + 1));
        this.p.setText(String.valueOf(a(list)));
        String a3 = k.a(list, this.i);
        this.q.setVisibility((this.z || StringUtils.isEmpty(a3)) ? 8 : 0);
        this.q.setText(a3);
        this.l = new eyu();
        this.l.a(list);
        this.k.addOnPageChangeListener(this.D);
        this.k.setAdapter(this.l);
        this.k.setCurrentItem(this.i, false);
        this.k.addOnItemVisibleChangeListener(new TTViewPager.d() { // from class: tb.ezs.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.d
            public void a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else if (ezs.b(ezs.this).a().c()) {
                } else {
                    com.taobao.android.detail.ttdetail.component.module.d b2 = com.taobao.android.detail.ttdetail.utils.a.b(i, ezs.c(ezs.this).a());
                    if (!(b2 instanceof i)) {
                        return;
                    }
                    ((i) b2).b(1);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.d
            public void b(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                } else if (ezs.b(ezs.this).a().c()) {
                } else {
                    com.taobao.android.detail.ttdetail.component.module.d b2 = com.taobao.android.detail.ttdetail.utils.a.b(i, ezs.c(ezs.this).a());
                    if (!(b2 instanceof i)) {
                        return;
                    }
                    ((i) b2).b(2);
                }
            }
        });
        com.taobao.android.detail.ttdetail.communication.c.a((Object) this.b, com.taobao.android.detail.ttdetail.bizmessage.a.class, (g) this);
        com.taobao.android.detail.ttdetail.communication.c.a((Object) this.b, d.class, (f) this);
        ViewCompat.setOnApplyWindowInsetsListener(this.m, new OnApplyWindowInsetsListener() { // from class: tb.ezs.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (WindowInsetsCompat) ipChange.ipc$dispatch("eac8c0", new Object[]{this, view, windowInsetsCompat});
                }
                view.setPadding(0, windowInsetsCompat.getStableInsetTop(), 0, 0);
                return windowInsetsCompat;
            }
        });
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        i iVar = (i) this.l.a(this.k.getCurrentItem());
        if (iVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pssource", com.taobao.android.detail.ttdetail.constant.a.FIND_SIMILAR_SOURCE);
        hashMap.put(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, com.taobao.android.detail.ttdetail.constant.a.FIND_SIMILAR_SOURCE);
        hashMap.put("item_id", this.f27697a.e().a("requestItemId"));
        hashMap.put(com.etao.feimagesearch.model.d.KEY_PIC_URL, l.a(iVar.q()));
        l.a(getContext(), l.a(com.taobao.android.detail.ttdetail.constant.a.FIND_SIMILAR_URL_PREFIX, hashMap));
        m.b(2101, "Page_Detail_Lightoff_FindSimilar", null);
    }

    private void b(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca4996d", new Object[]{this, iVar});
            return;
        }
        int i = 8;
        if (!this.F) {
            this.E.setVisibility(8);
            return;
        }
        boolean b2 = com.taobao.android.detail.ttdetail.utils.a.b((ezc) iVar.getComponentData());
        View view = this.E;
        if (b2) {
            i = 0;
        }
        view.setVisibility(i);
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        Feature feature = (Feature) this.f27697a.a().a(Feature.class);
        if (feature != null) {
            return feature.isLightoffPageFindSimilar();
        }
        return false;
    }

    public void a(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cf8273", new Object[]{this, eyyVar});
            return;
        }
        iok iokVar = this.A;
        if (iokVar == null || eyyVar == null) {
            return;
        }
        iokVar.a(eyyVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        iok iokVar = this.A;
        if (iokVar == null) {
            return;
        }
        iokVar.c();
    }

    public void b(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d65288f4", new Object[]{this, eyyVar});
            return;
        }
        iok iokVar = this.A;
        if (iokVar == null || eyyVar == null) {
            return;
        }
        iokVar.a(eyyVar);
        this.A.d();
    }

    private int a(List<i> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c6e0ed6", new Object[]{this, list, str})).intValue();
        }
        if (list != null && !list.isEmpty() && !StringUtils.isEmpty(str)) {
            for (int i = 0; i < list.size(); i++) {
                if (str.equals(((ezc) list.get(i).getComponentData()).b())) {
                    return i;
                }
            }
        }
        return 0;
    }

    private int a(List<i> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c705294c", new Object[]{this, list})).intValue();
        }
        if (list != null && !list.isEmpty()) {
            return list.size();
        }
        return 0;
    }

    @Override // android.support.v7.app.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(this.j, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (this.v != 0 || this.u) {
        } else {
            iok iokVar = this.A;
            if (iokVar != null) {
                iokVar.a();
            }
            if (b()) {
                return;
            }
            c();
            a(true);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.communication.f
    public Boolean a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("50fdcda", new Object[]{this, dVar}) : Boolean.valueOf(isShowing());
    }

    public boolean a(com.taobao.android.detail.ttdetail.bizmessage.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79fd7b84", new Object[]{this, aVar})).booleanValue();
        }
        dismiss();
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        i iVar = (i) this.l.a(this.k.getCurrentItem());
        a aVar = this.x;
        Rect a2 = aVar != null ? aVar.a(iVar) : null;
        if (a2 == null || a2.isEmpty() || iVar == null) {
            return false;
        }
        iVar.a(a2);
        return iVar.m();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.w == null || !isShowing()) {
        } else {
            this.w.a(this, this.l.a(this.k.getCurrentItem()));
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a((Object) this.b, (g) this);
        com.taobao.android.detail.ttdetail.communication.c.a((Object) this.b, (f) this);
        if (this.w != null && isShowing()) {
            this.w.b(this, this.l.a(this.k.getCurrentItem()));
        }
        Context context = this.b;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (Build.VERSION.SDK_INT >= 17) {
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    super.dismiss();
                }
            } else if (!activity.isFinishing()) {
                super.dismiss();
            }
        } else {
            super.dismiss();
        }
        if (this.f) {
            return;
        }
        this.k.destroy();
        com.taobao.android.detail.ttdetail.utils.a.a(-1, this.l.a());
        this.f = true;
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (y.a(this.b)) {
        } else {
            iok iokVar = this.A;
            if (iokVar != null) {
                iokVar.b();
            }
            d();
            super.show();
            be.a(y.a(this), getWindow(), false);
            be.a(getWindow(), -16777216);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        i iVar = (i) this.l.a(this.i);
        if (iVar == null) {
            return;
        }
        iVar.f();
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        this.r.setAlpha(f);
        this.s.setAlpha(f);
        float f2 = 1.0f;
        if (f <= 0.0f) {
            f2 = 0.0f;
        } else if (f < 1.0f) {
            f2 = (float) Math.pow(f, 9.96d);
        }
        this.t.setAlpha(f2);
    }

    private void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a0ce0e", new Object[]{this, iVar});
        } else if (this.g) {
        } else {
            this.g = true;
            if (StringUtils.equals(this.h, ((ezc) iVar.getComponentData()).b())) {
                iVar.a(this.d);
                iVar.l();
                return;
            }
            a(1.0f);
        }
    }

    private void a(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.k.getWindowToken() == null || (i2 = this.e) == i) {
        } else {
            this.e = i;
            i iVar = (i) this.l.a(this.e);
            if (iVar == null) {
                return;
            }
            iVar.a(this.C);
            com.taobao.android.detail.ttdetail.utils.a.a(this.e, i2, this.l.a());
            a(iVar);
            this.o.setText(String.valueOf(this.e + 1));
            b(iVar);
            final String a2 = k.a(this.c, this.e);
            TextView textView = this.q;
            if (this.z || StringUtils.isEmpty(a2)) {
                i3 = 8;
            }
            textView.setVisibility(i3);
            this.k.post(new Runnable() { // from class: tb.ezs.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ezs.h(ezs.this).setText(a2);
                    }
                }
            });
            iok iokVar = this.A;
            if (iokVar != null) {
                iokVar.a(iVar);
            }
            b bVar = this.y;
            if (bVar == null) {
                return;
            }
            bVar.a(iVar);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!StringUtils.equals(str, com.taobao.android.detail.ttdetail.utils.a.a(this.l.a(this.k.getCurrentItem())))) {
            int count = this.l.getCount();
            for (int i = 0; i < count; i++) {
                if (StringUtils.equals(com.taobao.android.detail.ttdetail.utils.a.a(this.l.a(i)), str) && i != this.k.getCurrentItem()) {
                    this.k.setCurrentItem(i, false);
                    return;
                }
            }
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b76d15d", new Object[]{this, aVar});
        } else {
            this.x = aVar;
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b7745bc", new Object[]{this, bVar});
        } else {
            this.y = bVar;
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b77ba1b", new Object[]{this, cVar});
        } else {
            this.w = cVar;
        }
    }
}
