package tb;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.RippleLayout;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.tab2interact.core.utils.e;
import com.taobao.taobao.R;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class ctp extends ctq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f26518a;
    private View b;
    private TextView c;
    private TextView d;
    private TextView e;
    private FrameLayout f;
    private Context g;
    private boolean h;
    private String i;
    private int[] j;
    private final int k;
    private String l;
    private String m;
    private final Typeface n;
    private boolean o;
    private RippleLayout p;

    /* loaded from: classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ctr b = lbt.INSTANCE.b(ctp.b(ctp.this));
            if (b != null) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "isRegionChange", (String) Boolean.valueOf(!ctp.c(ctp.this)));
                jSONObject2.put((JSONObject) "region", ctp.d(ctp.this));
                b.a(jSONObject);
            }
            String str = ctp.c(ctp.this) ? "abbreviationCardClick" : "previewCardClick";
            String[] strArr = new String[6];
            strArr[0] = "title";
            strArr[1] = ctp.e(ctp.this);
            strArr[2] = "price";
            strArr[3] = ctp.f(ctp.this);
            strArr[4] = "boxType";
            strArr[5] = ctp.this.f() == null ? "point" : "preview";
            cox.a("Page_PhotoSearchResult", str, strArr);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ctp.a(ctp.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RippleLayout g = ctp.g(ctp.this);
            if (g == null) {
                return;
            }
            g.startRippleAnim();
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RippleLayout g = ctp.g(ctp.this);
            if (g == null) {
                return;
            }
            g.startRippleAnim();
        }
    }

    static {
        kge.a(66645176);
    }

    public static /* synthetic */ Object ipc$super(ctp ctpVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ctp() {
        super("nt_region_digest");
        Typeface typeface;
        this.k = j.a(32.0f);
        this.i = "";
        this.l = "";
        this.m = "";
        try {
            Application b2 = com.b();
            q.a((Object) b2, "GlobalAdapter.getCtx()");
            typeface = Typeface.createFromAsset(b2.getAssets(), e.ALI_SANS_TYPEFACE_ASSET_PATH);
            q.a((Object) typeface, "Typeface.createFromAsset…2_v1_TaoBao-Bd.ttf\"\n    )");
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
            q.a((Object) typeface, "Typeface.DEFAULT");
        }
        this.n = typeface;
    }

    public static final /* synthetic */ void a(ctp ctpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41b4459", new Object[]{ctpVar});
        } else {
            ctpVar.q();
        }
    }

    public static final /* synthetic */ Context b(ctp ctpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c00e3bd2", new Object[]{ctpVar});
        }
        Context context = ctpVar.g;
        if (context == null) {
            q.b("context");
        }
        return context;
    }

    public static final /* synthetic */ boolean c(ctp ctpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c121515f", new Object[]{ctpVar})).booleanValue() : ctpVar.h;
    }

    public static final /* synthetic */ String d(ctp ctpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d74cd044", new Object[]{ctpVar}) : ctpVar.i;
    }

    public static final /* synthetic */ String e(ctp ctpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d7f97be3", new Object[]{ctpVar}) : ctpVar.l;
    }

    public static final /* synthetic */ String f(ctp ctpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d8a62782", new Object[]{ctpVar}) : ctpVar.m;
    }

    public static final /* synthetic */ RippleLayout g(ctp ctpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RippleLayout) ipChange.ipc$dispatch("e3996460", new Object[]{ctpVar}) : ctpVar.p;
    }

    @Override // tb.ctq
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.o;
    }

    @Override // tb.ctq
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.o = z;
        c().post(new b());
    }

    @Override // tb.ctq
    public int[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[]{this});
        }
        int[] iArr = this.j;
        if (iArr == null) {
            q.b("measureMetrics");
        }
        return iArr;
    }

    @Override // tb.ctq
    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this});
        }
        View view = this.f26518a;
        if (view == null) {
            q.b("rootView");
        }
        return view;
    }

    public void a(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb9ea60", new Object[]{this, context, jSONObject, jSONObject2});
            return;
        }
        q.c(context, "context");
        this.g = context;
        t();
        b(jSONObject);
        c(jSONObject2);
        o();
        p();
        r();
        String str = this.h ? "abbreviationCardExpose" : "previewCardExpose";
        String[] strArr = new String[6];
        strArr[0] = "title";
        strArr[1] = this.l;
        strArr[2] = "price";
        strArr[3] = this.m;
        strArr[4] = "boxType";
        strArr[5] = jSONObject2 == null ? "point" : "preview";
        cox.c("Page_PhotoSearchResult", str, strArr);
    }

    @Override // tb.ctq
    public void a(JSONObject jSONObject) {
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (b2 = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "status")) == null) {
        } else {
            d(b2);
            r();
        }
    }

    @Override // tb.ctq
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        RippleLayout rippleLayout = this.p;
        if (rippleLayout != null) {
            rippleLayout.stopRippleAnim();
        }
        n();
    }

    private final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        this.h = com.taobao.android.searchbaseframe.util.a.a(e(), nom.KEY_IS_FULL, false);
        String a2 = com.taobao.android.searchbaseframe.util.a.a(e(), "region", "");
        q.a((Object) a2, "FastJsonParseUtil.parseS…ing(status, \"region\", \"\")");
        this.i = a2;
    }

    private final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        String str = "";
        String a2 = com.taobao.android.searchbaseframe.util.a.a(f(), "title", str);
        q.a((Object) a2, "FastJsonParseUtil.parseString(data, \"title\", \"\")");
        this.l = a2;
        JSONObject b2 = com.taobao.android.searchbaseframe.util.a.b(f(), nog.PRICE_BLOCK);
        if (b2 != null) {
            str = com.taobao.android.searchbaseframe.util.a.a(b2, nog.PRICE_UNIT, "￥") + com.taobao.android.searchbaseframe.util.a.a(b2, "price", str);
        }
        this.m = str;
    }

    private final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (f() == null) {
            u();
        } else if (this.h) {
            v();
        } else {
            w();
        }
    }

    private final void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
            return;
        }
        JSONObject e = e();
        if (e == null) {
            e = new JSONObject();
        }
        a(e, jSONObject, "isPriceFirst");
    }

    private final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        s();
        q();
    }

    private final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        this.j = x();
        View view = this.f26518a;
        if (view == null) {
            q.b("rootView");
        }
        ViewGroup.MarginLayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            int[] iArr = this.j;
            if (iArr == null) {
                q.b("measureMetrics");
            }
            int i = iArr[0];
            int[] iArr2 = this.j;
            if (iArr2 == null) {
                q.b("measureMetrics");
            }
            layoutParams = new ViewGroup.MarginLayoutParams(i, iArr2[1]);
        }
        int[] iArr3 = this.j;
        if (iArr3 == null) {
            q.b("measureMetrics");
        }
        layoutParams.width = iArr3[0];
        int[] iArr4 = this.j;
        if (iArr4 == null) {
            q.b("measureMetrics");
        }
        layoutParams.height = iArr4[1];
        View view2 = this.f26518a;
        if (view2 == null) {
            q.b("rootView");
        }
        view2.setLayoutParams(layoutParams);
    }

    private final void a(boolean z, boolean z2) {
        GradientDrawable gradientDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z) {
            gradientDrawable = null;
        } else {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(Color.parseColor("#CC000000"));
            gradientDrawable.setCornerRadius(j.b(z2 ? 12.0f : 24.0f));
        }
        View view = this.f26518a;
        if (view == null) {
            q.b("rootView");
        }
        view.setBackground(gradientDrawable);
    }

    private final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        Context context = this.g;
        if (context == null) {
            q.b("context");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.feis_auction_digest_card, (ViewGroup) null, false);
        q.a((Object) inflate, "LayoutInflater.from(cont…digest_card, null, false)");
        this.f26518a = inflate;
        View view = this.f26518a;
        if (view == null) {
            q.b("rootView");
        }
        View findViewById = view.findViewById(R.id.rl_full_digest);
        q.a((Object) findViewById, "rootView.findViewById(R.id.rl_full_digest)");
        this.b = findViewById;
        View view2 = this.f26518a;
        if (view2 == null) {
            q.b("rootView");
        }
        View findViewById2 = view2.findViewById(R.id.tv_full_title);
        q.a((Object) findViewById2, "rootView.findViewById(R.id.tv_full_title)");
        this.c = (TextView) findViewById2;
        View view3 = this.f26518a;
        if (view3 == null) {
            q.b("rootView");
        }
        View findViewById3 = view3.findViewById(R.id.tv_price_hint);
        q.a((Object) findViewById3, "rootView.findViewById(R.id.tv_price_hint)");
        this.d = (TextView) findViewById3;
        View view4 = this.f26518a;
        if (view4 == null) {
            q.b("rootView");
        }
        View findViewById4 = view4.findViewById(R.id.tv_price);
        q.a((Object) findViewById4, "rootView.findViewById(R.id.tv_price)");
        this.e = (TextView) findViewById4;
        TextView textView = this.e;
        if (textView == null) {
            q.b("fullPriceTv");
        }
        textView.setTypeface(this.n);
        View view5 = this.f26518a;
        if (view5 == null) {
            q.b("rootView");
        }
        View findViewById5 = view5.findViewById(R.id.fl_simple_digest);
        q.a((Object) findViewById5, "rootView.findViewById(R.id.fl_simple_digest)");
        this.f = (FrameLayout) findViewById5;
        View view6 = this.f26518a;
        if (view6 == null) {
            q.b("rootView");
        }
        view6.setOnClickListener(new a());
    }

    private final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        a(true, false);
        View view = this.b;
        if (view == null) {
            q.b("fullContainer");
        }
        view.setVisibility(8);
        FrameLayout frameLayout = this.f;
        if (frameLayout == null) {
            q.b("simpleContainer");
        }
        frameLayout.setVisibility(0);
        FrameLayout frameLayout2 = this.f;
        if (frameLayout2 == null) {
            q.b("simpleContainer");
        }
        frameLayout2.removeAllViews();
        int i = this.k;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        FrameLayout frameLayout3 = this.f;
        if (frameLayout3 == null) {
            q.b("simpleContainer");
        }
        frameLayout3.setClipChildren(false);
        RippleLayout rippleLayout = this.p;
        if (rippleLayout != null) {
            rippleLayout.stopRippleAnim();
        }
        this.p = f(true);
        FrameLayout frameLayout4 = this.f;
        if (frameLayout4 == null) {
            q.b("simpleContainer");
        }
        frameLayout4.addView(this.p, layoutParams);
        FrameLayout frameLayout5 = this.f;
        if (frameLayout5 == null) {
            q.b("simpleContainer");
        }
        frameLayout5.post(new c());
    }

    private final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        a(false, true);
        View view = this.b;
        if (view == null) {
            q.b("fullContainer");
        }
        view.setVisibility(0);
        FrameLayout frameLayout = this.f;
        if (frameLayout == null) {
            q.b("simpleContainer");
        }
        frameLayout.setVisibility(8);
        TextView textView = this.c;
        if (textView == null) {
            q.b("fullTitleTv");
        }
        textView.setText(this.l);
        TextView textView2 = this.e;
        if (textView2 == null) {
            q.b("fullPriceTv");
        }
        textView2.setText(this.m);
    }

    private final void w() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        a(false, false);
        View view = this.b;
        if (view == null) {
            q.b("fullContainer");
        }
        view.setVisibility(8);
        FrameLayout frameLayout = this.f;
        if (frameLayout == null) {
            q.b("simpleContainer");
        }
        frameLayout.setVisibility(0);
        FrameLayout frameLayout2 = this.f;
        if (frameLayout2 == null) {
            q.b("simpleContainer");
        }
        frameLayout2.removeAllViews();
        int a2 = j.a(24.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        if (a()) {
            layoutParams.gravity = 8388629;
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, j.a(6.0f), layoutParams.bottomMargin);
        } else {
            layoutParams.gravity = 8388627;
            layoutParams.setMargins(j.a(6.0f), layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
        }
        RippleLayout rippleLayout = this.p;
        if (rippleLayout != null) {
            rippleLayout.stopRippleAnim();
        }
        this.p = f(false);
        FrameLayout frameLayout3 = this.f;
        if (frameLayout3 == null) {
            q.b("simpleContainer");
        }
        frameLayout3.addView(this.p, layoutParams);
        FrameLayout frameLayout4 = this.f;
        if (frameLayout4 == null) {
            q.b("simpleContainer");
        }
        frameLayout4.post(new d());
        boolean a3 = com.taobao.android.searchbaseframe.util.a.a(e(), "isPriceFirst", false);
        Context context = this.g;
        if (context == null) {
            q.b("context");
        }
        TextView textView = new TextView(context);
        textView.setTextSize(14.0f);
        textView.setTypeface(a3 ? this.n : Typeface.DEFAULT);
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        if (a()) {
            layoutParams2.gravity = 8388629;
            layoutParams2.setMargins(j.a(9.0f), layoutParams2.topMargin, j.a(36.0f), layoutParams2.bottomMargin);
        } else {
            layoutParams2.gravity = 8388627;
            layoutParams2.setMargins(j.a(36.0f), layoutParams2.topMargin, j.a(9.0f), layoutParams2.bottomMargin);
        }
        FrameLayout frameLayout5 = this.f;
        if (frameLayout5 == null) {
            q.b("simpleContainer");
        }
        frameLayout5.addView(textView, layoutParams2);
        if (a3) {
            str = this.m;
        } else {
            str = this.l;
        }
        textView.setText(str);
    }

    private final RippleLayout f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RippleLayout) ipChange.ipc$dispatch("67a90438", new Object[]{this, new Boolean(z)});
        }
        int a2 = j.a(z ? 16.0f : 12.0f);
        Context context = this.g;
        if (context == null) {
            q.b("context");
        }
        RippleLayout rippleLayout = new RippleLayout(context, a2, 0, null, 12, null);
        Context context2 = this.g;
        if (context2 == null) {
            q.b("context");
        }
        View view = new View(context2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#FFFFFF"));
        view.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.gravity = 17;
        rippleLayout.addView(view, layoutParams);
        return rippleLayout;
    }

    private final boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("461bb036", new Object[]{this, jSONObject, jSONObject2, str})).booleanValue();
        }
        boolean a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, str, false);
        boolean a3 = com.taobao.android.searchbaseframe.util.a.a(jSONObject2, str, false);
        if (a2 == a3) {
            return false;
        }
        jSONObject.put((JSONObject) str, (String) Boolean.valueOf(a3));
        return true;
    }

    private final int[] x() {
        double ceil;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("cf6097c5", new Object[]{this});
        }
        if (f() == null) {
            int i = this.k;
            float f = (-i) / 2.0f;
            b(f);
            a(f);
            return new int[]{i, i};
        }
        float b2 = j.b(12.0f);
        int[] iArr = new int[2];
        if (this.h) {
            b(0.0f);
            a(0.0f);
            float b3 = j.b(145.0f);
            float b4 = j.b(9.0f);
            TextPaint textPaint = new TextPaint();
            TextView textView = this.c;
            if (textView == null) {
                q.b("fullTitleTv");
            }
            textPaint.setTextSize(textView.getTextSize());
            TextView textView2 = this.c;
            if (textView2 == null) {
                q.b("fullTitleTv");
            }
            textPaint.setTypeface(textView2.getTypeface());
            float measureText = textPaint.measureText(this.l) + b2 + b2;
            float abs = Math.abs(textPaint.getFontMetrics().top) + Math.abs(textPaint.getFontMetrics().bottom);
            float f2 = b4 + abs;
            if (measureText > b3) {
                f2 += abs;
            }
            float a2 = f2 + j.a(5.0f);
            TextView textView3 = this.d;
            if (textView3 == null) {
                q.b("fullPriceHintTv");
            }
            textPaint.setTextSize(textView3.getTextSize());
            TextView textView4 = this.d;
            if (textView4 == null) {
                q.b("fullPriceHintTv");
            }
            textPaint.setTypeface(textView4.getTypeface());
            float measureText2 = textPaint.measureText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18940)) + b2 + j.a(3.0f);
            TextView textView5 = this.e;
            if (textView5 == null) {
                q.b("fullPriceTv");
            }
            textPaint.setTextSize(textView5.getTextSize());
            TextView textView6 = this.e;
            if (textView6 == null) {
                q.b("fullPriceTv");
            }
            textPaint.setTypeface(textView6.getTypeface());
            float measureText3 = measureText2 + textPaint.measureText(this.m) + b2;
            float abs2 = a2 + Math.abs(textPaint.getFontMetrics().top) + Math.abs(textPaint.getFontMetrics().bottom) + j.a(9.0f);
            if (measureText <= b3 && measureText3 <= b3) {
                ceil = Math.ceil(rwf.a(measureText, measureText3));
            } else {
                ceil = Math.ceil(b3);
            }
            iArr[0] = ((int) ceil) + j.a(2.0f);
            iArr[1] = (int) Math.ceil(abs2);
        } else {
            iArr[1] = j.a(29.0f);
            a((-iArr[1]) / 2.0f);
            float b5 = j.b(36.0f);
            b(-j.a(12.0f));
            boolean a3 = com.taobao.android.searchbaseframe.util.a.a(e(), "isPriceFirst", false);
            Context context = this.g;
            if (context == null) {
                q.b("context");
            }
            TextView textView7 = new TextView(context);
            textView7.setTextSize(1, 14.0f);
            textView7.setTypeface(a3 ? this.n : Typeface.DEFAULT);
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTextSize(textView7.getTextSize());
            textPaint2.setTypeface(textView7.getTypeface());
            iArr[0] = (int) Math.ceil(rwf.b(b5 + textPaint2.measureText(a3 ? this.m : this.l) + j.b(9.0f), j.b(165.0f)));
        }
        return iArr;
    }
}
