package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.RippleLayout;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.taobao.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class lck extends ctq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f30470a;
    private int[] b;
    private FrameLayout c;
    private Map<String, String> d;
    private String e;
    private RippleLayout f;

    /* loaded from: classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public a(Context context) {
            this.b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ctr b = lbt.INSTANCE.b(this.b);
            if (b != null) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "isScanRegion", (String) true);
                jSONObject2.put((JSONObject) "region", lck.a(lck.this));
                b.a(jSONObject);
            }
            coy.a("Page_PhotoSearchResult", "codeDotClick", lck.b(lck.this));
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
                lck.c(lck.this).startRippleAnim();
            }
        }
    }

    static {
        kge.a(1753450272);
    }

    @Override // tb.ctq
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        }
    }

    public lck() {
        super("nt_scan_code_hint");
        this.f30470a = j.a(44.0f);
    }

    public static final /* synthetic */ String a(lck lckVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4327009c", new Object[]{lckVar}) : lckVar.e;
    }

    public static final /* synthetic */ Map b(lck lckVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f2e5f87a", new Object[]{lckVar}) : lckVar.d;
    }

    public static final /* synthetic */ RippleLayout c(lck lckVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RippleLayout) ipChange.ipc$dispatch("2fe3a859", new Object[]{lckVar});
        }
        RippleLayout rippleLayout = lckVar.f;
        if (rippleLayout == null) {
            q.b("rippleAnimLayout");
        }
        return rippleLayout;
    }

    @Override // tb.ctq
    public int[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[]{this});
        }
        int[] iArr = this.b;
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
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            q.b("rootView");
        }
        return frameLayout;
    }

    public void a(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb9ea60", new Object[]{this, context, jSONObject, jSONObject2});
            return;
        }
        q.c(context, "context");
        b(jSONObject);
        c(jSONObject2);
        this.c = new FrameLayout(context);
        int a2 = j.a(29.0f);
        this.f = new RippleLayout(context, a2, 0, null, 12, null);
        int i = this.f30470a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            q.b("rootView");
        }
        RippleLayout rippleLayout = this.f;
        if (rippleLayout == null) {
            q.b("rippleAnimLayout");
        }
        frameLayout.addView(rippleLayout, layoutParams);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.feis_ic_black_arrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int a3 = j.a(8.0f);
        imageView.setPadding(a3, a3, a3, a3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#FFFFFF"));
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a2, a2);
        layoutParams2.gravity = 17;
        FrameLayout frameLayout2 = this.c;
        if (frameLayout2 == null) {
            q.b("rootView");
        }
        frameLayout2.addView(imageView, layoutParams2);
        FrameLayout frameLayout3 = this.c;
        if (frameLayout3 == null) {
            q.b("rootView");
        }
        frameLayout3.setOnClickListener(new a(context));
        int i2 = this.f30470a;
        this.b = new int[]{i2, i2};
        FrameLayout frameLayout4 = this.c;
        if (frameLayout4 == null) {
            q.b("rootView");
        }
        ViewGroup.MarginLayoutParams layoutParams3 = frameLayout4.getLayoutParams();
        if (layoutParams3 == null) {
            int i3 = this.f30470a;
            layoutParams3 = new ViewGroup.MarginLayoutParams(i3, i3);
        }
        FrameLayout frameLayout5 = this.c;
        if (frameLayout5 == null) {
            q.b("rootView");
        }
        frameLayout5.setLayoutParams(layoutParams3);
        b((-this.f30470a) / 2.0f);
        a((-this.f30470a) / 2.0f);
        this.e = com.taobao.android.searchbaseframe.util.a.a(jSONObject2, "region", "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String a4 = com.taobao.android.searchbaseframe.util.a.a(jSONObject2, "tfskey", "");
        q.a((Object) a4, "FastJsonParseUtil.parseString(data, \"tfskey\", \"\")");
        linkedHashMap.put("tfskey", a4);
        String a5 = com.taobao.android.searchbaseframe.util.a.a(jSONObject2, "imgSize", "unknown_unknown");
        q.a((Object) a5, "FastJsonParseUtil.parseS…Size\", \"unknown_unknown\")");
        linkedHashMap.put("imgSize", a5);
        String str = this.e;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("region", str);
        String a6 = com.taobao.android.searchbaseframe.util.a.a(jSONObject2, "type", "");
        q.a((Object) a6, "FastJsonParseUtil.parseString(data, \"type\", \"\")");
        linkedHashMap.put("type", a6);
        String a7 = com.taobao.android.searchbaseframe.util.a.a(jSONObject2, "content", "");
        q.a((Object) a7, "FastJsonParseUtil.parseString(data, \"content\", \"\")");
        linkedHashMap.put("content", a7);
        coy.b("Page_PhotoSearchResult", "codeDotExpose", linkedHashMap);
        this.d = linkedHashMap;
        FrameLayout frameLayout6 = this.c;
        if (frameLayout6 == null) {
            q.b("rootView");
        }
        frameLayout6.post(new b());
    }

    @Override // tb.ctq
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        RippleLayout rippleLayout = this.f;
        if (rippleLayout == null) {
            q.b("rippleAnimLayout");
        }
        rippleLayout.stopRippleAnim();
        n();
    }
}
