package tb;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.u;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.utils.ax;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.taobao.R;
import java.util.List;

/* loaded from: classes4.dex */
public class onp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f32215a;
    private eyx b;
    private View c;
    private RecyclerView e;
    private ono f;
    private com.taobao.android.detail.ttdetail.component.module.d g;
    private pif h;
    private u i;
    private c j;
    private b k;
    private String[] l = {"BybtEvaluation", "TeMaiEvaluation", "DetailCommentDefault", "commentSectionV3", "detail3Comment"};
    private a m;
    private volatile boolean n;
    private volatile int o;
    private d p;

    /* loaded from: classes4.dex */
    public interface b {
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(int i, int i2);
    }

    /* loaded from: classes4.dex */
    public interface d {
    }

    static {
        kge.a(-1776934075);
    }

    public static /* synthetic */ int a(onp onpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f840deba", new Object[]{onpVar})).intValue() : onpVar.o;
    }

    public static /* synthetic */ int a(onp onpVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fdb6d0f", new Object[]{onpVar, new Integer(i)})).intValue();
        }
        onpVar.o = i;
        return i;
    }

    public static /* synthetic */ boolean a(onp onpVar, com.taobao.android.detail.ttdetail.component.module.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c95a96f8", new Object[]{onpVar, dVar})).booleanValue() : onpVar.a(dVar);
    }

    public static /* synthetic */ String b(onp onpVar, com.taobao.android.detail.ttdetail.component.module.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ac9611ad", new Object[]{onpVar, dVar}) : onpVar.b(dVar);
    }

    public static /* synthetic */ boolean b(onp onpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6c3e54c", new Object[]{onpVar})).booleanValue() : onpVar.n;
    }

    public static /* synthetic */ void c(onp onpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d546ebc9", new Object[]{onpVar});
        } else {
            onpVar.i();
        }
    }

    public static /* synthetic */ b d(onp onpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5ac873ad", new Object[]{onpVar}) : onpVar.k;
    }

    public static /* synthetic */ ono e(onp onpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ono) ipChange.ipc$dispatch("76c712eb", new Object[]{onpVar}) : onpVar.f;
    }

    public static /* synthetic */ d f(onp onpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("67d3e929", new Object[]{onpVar}) : onpVar.p;
    }

    public static /* synthetic */ c g(onp onpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ee59a3a9", new Object[]{onpVar}) : onpVar.j;
    }

    public onp(Context context, eyx eyxVar) {
        this.f32215a = context;
        this.b = eyxVar;
        a(context, eyxVar);
        this.f = new ono(context, eyxVar);
    }

    private void a(Context context, eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e48e0c", new Object[]{this, context, eyxVar});
            return;
        }
        com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(context);
        if (a2 != null) {
            this.c = a2.a(context, R.layout.tt_detail_main_screen_container, null, true);
        } else {
            this.c = LayoutInflater.from(context).inflate(R.layout.tt_detail_main_screen_container, (ViewGroup) null);
        }
        this.e = (RecyclerView) this.c.findViewById(R.id.rv_main_screen_container);
        this.e.setHasFixedSize(true);
        a(this.e);
    }

    private void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        try {
            recyclerView.getItemAnimator().setAddDuration(0L);
            recyclerView.getItemAnimator().setChangeDuration(0L);
            recyclerView.getItemAnimator().setMoveDuration(0L);
            recyclerView.getItemAnimator().setRemoveDuration(0L);
            ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        } catch (Throwable unused) {
        }
    }

    public <C extends com.taobao.android.detail.ttdetail.component.module.d> C a(String str) {
        qpk h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("dfbaff7d", new Object[]{this, str});
        }
        pif pifVar = this.h;
        if (pifVar != null && (h = pifVar.h()) != null) {
            return (C) h.a(str);
        }
        return null;
    }

    public <C extends com.taobao.android.detail.ttdetail.component.module.d> C b(String str) {
        qpk h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("e0897dfe", new Object[]{this, str});
        }
        pif pifVar = this.h;
        if (pifVar != null && (h = pifVar.h()) != null) {
            return (C) h.a(str, this.b.d());
        }
        return null;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5a29e8", new Object[]{this, cVar});
        } else {
            this.j = cVar;
        }
    }

    private boolean a(com.taobao.android.detail.ttdetail.component.module.d dVar) {
        String o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b69e8837", new Object[]{this, dVar})).booleanValue();
        }
        if (dVar != null && (o = dVar.getComponentData().o()) != null) {
            for (String str : this.l) {
                if (o.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private String b(com.taobao.android.detail.ttdetail.component.module.d dVar) {
        JSONObject d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c5af74e", new Object[]{this, dVar});
        }
        if (dVar != null && (d2 = dVar.getComponentData().d()) != null) {
            return d2.getString("bizId");
        }
        return null;
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        int itemCount = this.f.getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            if (!TextUtils.isEmpty(str) && TextUtils.equals(str, b(this.f.a(i2)))) {
                RecyclerView.LayoutManager layoutManager = this.e.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i2, i);
                    return;
                }
            }
        }
    }

    public int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{this, str})).intValue();
        }
        int childCount = this.e.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.e.getChildAt(i);
            com.taobao.android.detail.ttdetail.component.module.d a2 = this.f.a(this.e.getChildAdapterPosition(childAt));
            if (!TextUtils.isEmpty(str) && TextUtils.equals(str, b(a2))) {
                return childAt.getTop();
            }
        }
        return -1;
    }

    /* loaded from: classes4.dex */
    public final class a extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private u d;
        private int b = 0;
        private int c = 0;
        private volatile boolean e = true;

        static {
            kge.a(-476483829);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 806944192) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(u uVar) {
            this.d = uVar;
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            onp onpVar = onp.this;
            onp.a(onpVar, onp.a(onpVar) + i2);
            if (onp.a(onp.this) > 100 && !onp.b(onp.this)) {
                onp.c(onp.this);
            }
            if (onp.d(onp.this) != null) {
                int childCount = recyclerView.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = recyclerView.getChildAt(i3);
                    if (onp.a(onp.this, onp.e(onp.this).a(recyclerView.getChildAdapterPosition(childAt)))) {
                        onp.d(onp.this);
                        childAt.getTop();
                        break;
                    }
                    i3++;
                }
            }
            if (onp.f(onp.this) != null) {
                int childCount2 = recyclerView.getChildCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= childCount2) {
                        break;
                    }
                    View childAt2 = recyclerView.getChildAt(i4);
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt2);
                    onp onpVar2 = onp.this;
                    if (!TextUtils.isEmpty(onp.b(onpVar2, onp.e(onpVar2).a(childAdapterPosition)))) {
                        onp.f(onp.this);
                        childAt2.getTop();
                        break;
                    }
                    i4++;
                }
            }
            u uVar = this.d;
            if (uVar == null) {
                return;
            }
            View componentView = uVar.getComponentView(null);
            if (onp.g(onp.this) != null) {
                int i5 = this.c;
                int i6 = this.b;
                View findContainingItemView = recyclerView.findContainingItemView(componentView);
                if (findContainingItemView != null) {
                    this.c = findContainingItemView.getMeasuredHeight();
                    this.b = findContainingItemView.getTop();
                } else if (ax.a(recyclerView) > 0) {
                    this.b = -this.c;
                }
                if (i5 != this.c || i6 != this.b) {
                    onp.g(onp.this).a(this.c, this.b);
                }
            }
            if (componentView.getWindowToken() == null) {
                if (!this.e) {
                    return;
                }
                this.d.a(false);
                this.e = false;
            } else if (this.e) {
            } else {
                this.d.b(false);
                this.e = true;
            }
        }
    }

    private void i() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        Context context = this.f32215a;
        if (!(context instanceof Activity) || (findViewById = ((Activity) context).findViewById(R.id.cl_image_holder_container)) == null) {
            return;
        }
        findViewById.setVisibility(8);
        this.n = true;
    }

    private ViewGroup g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("315764e7", new Object[]{this});
        }
        Context context = this.f32215a;
        if (!(context instanceof Activity)) {
            return null;
        }
        return (ViewGroup) ((Activity) context).findViewById(R.id.fl_tt_detail_mini_video_container);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        pif pifVar = (pif) this.b.a().a(pie.PARSER_ID);
        if (this.h == pifVar) {
            return;
        }
        this.h = pifVar;
        if (this.h == null) {
            return;
        }
        this.g = com.taobao.android.detail.ttdetail.utils.d.a(pifVar.h(), this.b.d());
        List<com.taobao.android.detail.ttdetail.component.module.d> b2 = com.taobao.android.detail.ttdetail.utils.d.b(this.h.h(), this.b.d());
        if (b2 == null || b2.isEmpty()) {
            i.a("MainScreenCore", "onDataUpdate DataUtils.extractMainScreenData() return empty");
            return;
        }
        qms<eze> e = pifVar.h().e();
        if (e != null) {
            this.i = (u) e.a(this.b.d());
            u uVar = this.i;
            if (uVar != null) {
                if (this.m == null) {
                    this.m = new a(uVar);
                    this.e.addOnScrollListener(this.m);
                }
                ViewGroup g = g();
                this.i.a(g);
                this.i.b(g);
            }
        }
        a();
        this.f.a(b2);
        this.f.notifyDataSetChanged();
        if (this.e.getAdapter() != null) {
            return;
        }
        this.e.setLayoutManager(new pbi(this.f32215a));
        this.e.setAdapter(this.f);
    }

    private void a() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Context context = this.f32215a;
        if (!(context instanceof Activity) || (findViewById = ((Activity) context).findViewById(R.id.tt_detail_top_container)) == null) {
            return;
        }
        Feature feature = (Feature) this.b.a().a(Feature.class);
        if (feature != null && feature.isIndustryDynamicLayout()) {
            findViewById.setBackgroundColor(-986896);
        } else if (feature != null && feature.isDetail3()) {
            findViewById.setBackgroundColor(-1);
        } else {
            findViewById.setBackgroundColor(-986896);
        }
    }

    public com.taobao.android.detail.ttdetail.component.module.d h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.ttdetail.component.module.d) ipChange.ipc$dispatch("d86bb47a", new Object[]{this});
        }
        try {
            return this.f.a().remove(0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.c;
    }

    public RecyclerView d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("3eeee379", new Object[]{this}) : this.e;
    }

    public com.taobao.android.detail.ttdetail.component.module.d e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.component.module.d) ipChange.ipc$dispatch("a64a4e37", new Object[]{this}) : this.g;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f.b();
        com.taobao.android.detail.ttdetail.utils.a.a(-1, this.f.a());
    }
}
