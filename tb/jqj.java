package tb;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.taobao.taobao.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class jqj extends ctc<jkj, com.etao.feimagesearch.model.b, CaptureManager> implements jqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f29706a;
    private FrameLayout f;
    private TextView g;
    private final ViewGroup h;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.etao.feimagesearch.mnn.autodetect.b b;

        public a(com.etao.feimagesearch.mnn.autodetect.b bVar) {
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TextView a2 = jqj.a(jqj.this);
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.b() + '\n');
            sb.append(this.b.c() + '\n');
            sb.append("costTime: " + this.b.d() + '\n');
            sb.append("clientCostTime: " + this.b.e() + '\n');
            sb.append("isInValid: " + this.b.n() + '\n');
            sb.append("code: " + this.b.i() + '\n');
            sb.append("tipId: " + this.b.j() + '\n');
            a2.setText(sb.toString());
            jqj.b(jqj.this).removeAllViews();
            List<RectF> f = this.b.f();
            List<RectF> list = f;
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            if (z) {
                return;
            }
            int width = jqj.b(jqj.this).getWidth();
            int height = jqj.b(jqj.this).getHeight();
            int size = f.size();
            for (int i = 0; i < size; i++) {
                RectF rectF = f.get(i);
                if (rectF != null) {
                    float f2 = width;
                    float f3 = height;
                    RectF rectF2 = new RectF(rectF.left * f2, rectF.top * f3, rectF.right * f2, rectF.bottom * f3);
                    FrameLayout b = jqj.b(jqj.this);
                    TextView textView = new TextView(jqj.c(jqj.this));
                    textView.setTextColor(Color.parseColor("#FFFFFF"));
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setStroke(3, Color.parseColor("#FF8903"));
                    textView.setBackground(gradientDrawable);
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("index:");
                    sb3.append(i);
                    sb3.append("; label:");
                    List<Integer> h = this.b.h();
                    Double d = null;
                    sb3.append(h != null ? h.get(i) : null);
                    sb3.append("; score:");
                    List<Double> g = this.b.g();
                    if (g != null) {
                        d = g.get(i);
                    }
                    sb3.append(d);
                    sb2.append(sb3.toString());
                    textView.setText(sb2.toString());
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height());
                    layoutParams.setMargins((int) rectF2.left, (int) rectF2.top, 0, 0);
                    b.addView(textView, layoutParams);
                }
            }
            RectF m = this.b.m();
            if (m == null) {
                return;
            }
            float f4 = width;
            float f5 = height;
            RectF rectF3 = new RectF(m.left * f4, m.top * f5, m.right * f4, m.bottom * f5);
            FrameLayout b2 = jqj.b(jqj.this);
            TextView textView2 = new TextView(jqj.c(jqj.this));
            textView2.setTextColor(Color.parseColor("#FFFFFF"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setStroke(3, Color.parseColor("#00FF00"));
            textView2.setBackground(gradientDrawable2);
            textView2.setText("result_info");
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF3.width(), (int) rectF3.height());
            layoutParams2.setMargins((int) rectF3.left, (int) rectF3.top, 0, 0);
            b2.addView(textView2, layoutParams2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public b(boolean z) {
            this.b = z;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            View d = jqj.d(jqj.this);
            if (!this.b) {
                i = 8;
            }
            d.setVisibility(i);
        }
    }

    static {
        kge.a(839490934);
        kge.a(-334029073);
    }

    public static /* synthetic */ Object ipc$super(jqj jqjVar, String str, Object... objArr) {
        if (str.hashCode() == 92838762) {
            super.c();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ TextView a(jqj jqjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("e9458969", new Object[]{jqjVar});
        }
        TextView textView = jqjVar.g;
        if (textView == null) {
            q.b("infoTv");
        }
        return textView;
    }

    public static final /* synthetic */ FrameLayout b(jqj jqjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("9f1c78a3", new Object[]{jqjVar});
        }
        FrameLayout frameLayout = jqjVar.f;
        if (frameLayout == null) {
            q.b("regionContainer");
        }
        return frameLayout;
    }

    public static final /* synthetic */ Activity c(jqj jqjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("bbde2e11", new Object[]{jqjVar}) : jqjVar.d;
    }

    public static final /* synthetic */ View d(jqj jqjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bb1aedba", new Object[]{jqjVar});
        }
        View view = jqjVar.f29706a;
        if (view == null) {
            q.b("rootView");
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [tb.jkj, tb.ctb] */
    @Override // tb.ctc
    public /* synthetic */ jkj b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctb) ipChange.ipc$dispatch("16b50a8c", new Object[]{this}) : a();
    }

    public final ViewGroup g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("315764e7", new Object[]{this}) : this.h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqj(Activity activity, cte<com.etao.feimagesearch.model.b, CaptureManager> parent, ViewGroup parentContainer) {
        super(activity, parent);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(parentContainer, "parentContainer");
        this.h = parentContainer;
        ad.c("CaptureDebugView_initViews", new ac() { // from class: tb.jqj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                jqj.this.g().setVisibility(0);
                jqj.this.g().addView(jqj.d(jqj.this));
            }
        });
    }

    @Override // tb.ctc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        View inflate = LayoutInflater.from(s()).inflate(R.layout.feis_smart_debug, (ViewGroup) null, false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f29706a = (ViewGroup) inflate;
        View view = this.f29706a;
        if (view == null) {
            q.b("rootView");
        }
        View findViewById = view.findViewById(R.id.fl_region_container);
        q.a((Object) findViewById, "rootView.findViewById(R.id.fl_region_container)");
        this.f = (FrameLayout) findViewById;
        View view2 = this.f29706a;
        if (view2 == null) {
            q.b("rootView");
        }
        View findViewById2 = view2.findViewById(R.id.tv_debug);
        q.a((Object) findViewById2, "rootView.findViewById(R.id.tv_debug)");
        this.g = (TextView) findViewById2;
        CaptureManager manager = j();
        q.a((Object) manager, "manager");
        manager.a(this);
    }

    public jkj a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jkj) ipChange.ipc$dispatch("f0672f5", new Object[]{this}) : new jkj();
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            ad.c("optionDebugStatus", new b(z));
        }
    }

    @Override // tb.jqt
    public void a(com.etao.feimagesearch.mnn.autodetect.b output) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("618b5163", new Object[]{this, output});
            return;
        }
        q.c(output, "output");
        this.d.runOnUiThread(new a(output));
    }
}
