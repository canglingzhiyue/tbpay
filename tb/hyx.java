package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.widget.AKVerticalGestureHandler;
import com.taobao.android.order.bundle.widget.OffsetBodyWrapper;
import com.taobao.android.order.bundle.widget.e;
import com.taobao.android.order.bundle.widget.recycle.g;
import com.taobao.taobao.R;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class hyx implements OffsetBodyWrapper.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int b;
    private int c;
    private g d;
    private boolean e;
    private OffsetBodyWrapper f;
    private String g;
    private RecyclerView h;
    private e j;
    private float k;
    private float l;

    /* renamed from: a  reason: collision with root package name */
    private final String f28845a = "OrderDetailMapBusiness";
    private boolean i = false;

    static {
        kge.a(1151260026);
        kge.a(-599680065);
    }

    public static /* synthetic */ RecyclerView a(hyx hyxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("360403b3", new Object[]{hyxVar}) : hyxVar.h;
    }

    public static /* synthetic */ int b(hyx hyxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("db709e65", new Object[]{hyxVar})).intValue() : hyxVar.b;
    }

    public static /* synthetic */ OffsetBodyWrapper c(hyx hyxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OffsetBodyWrapper) ipChange.ipc$dispatch("99b9aee6", new Object[]{hyxVar}) : hyxVar.f;
    }

    public static /* synthetic */ g d(hyx hyxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("8f72bb18", new Object[]{hyxVar}) : hyxVar.d;
    }

    public hyx(OffsetBodyWrapper offsetBodyWrapper, RecyclerView recyclerView) {
        this.f = offsetBodyWrapper;
        this.h = recyclerView;
    }

    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a77989e", new Object[]{this, gVar});
        } else {
            this.d = gVar;
        }
    }

    @Override // com.taobao.android.order.bundle.widget.OffsetBodyWrapper.a
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b;
    }

    @Override // com.taobao.android.order.bundle.widget.OffsetBodyWrapper.a
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.c;
    }

    @Override // com.taobao.android.order.bundle.widget.OffsetBodyWrapper.a
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            Context context = null;
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("css") == null ? null : jSONObject.getJSONObject("css").optJSONObject("bodyPitInfo");
                this.e = optJSONObject != null;
                this.k = (!this.e || !optJSONObject.has("normalHeightScale")) ? 0.0f : Float.parseFloat(optJSONObject.getString("normalHeightScale"));
                this.l = (!this.e || !optJSONObject.has("maxHeightScale")) ? 0.0f : Float.parseFloat(optJSONObject.getString("maxHeightScale"));
                this.g = jSONObject.optString("orderDetailType", null);
                float c = gbg.c(this.f.getContext());
                this.c = Math.max((int) (this.k * c), 0);
                this.b = Math.max((int) (c * this.l), 0);
                if (this.k != 0.0f) {
                    agb.f25316a = this.k;
                }
                if (this.d == null || !this.e) {
                    return;
                }
                if (!this.i) {
                    this.h.addOnScrollListener(this.d);
                    this.i = true;
                }
                if (this.j instanceof AKVerticalGestureHandler) {
                    this.f.setGestureHandler((AKVerticalGestureHandler) this.j);
                }
                String optString = jSONObject.optJSONObject("css") == null ? null : jSONObject.getJSONObject("css").optString("backGroundColor");
                if (hyk.d()) {
                    Drawable drawable = this.f.getResources().getDrawable(R.drawable.babel_body_bg);
                    if ((drawable instanceof LayerDrawable) && !StringUtils.isEmpty(optString)) {
                        LayerDrawable layerDrawable = (LayerDrawable) drawable;
                        try {
                            int parseColor = Color.parseColor(optString);
                            ((GradientDrawable) layerDrawable.getDrawable(1)).setColors(new int[]{Color.argb(51, Color.red(parseColor), Color.green(parseColor), Color.blue(parseColor)), parseColor, parseColor});
                        } catch (Exception unused) {
                        }
                    }
                    this.f.setBackground(drawable);
                }
                this.f.post(new Runnable() { // from class: tb.hyx.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        if (hyx.a(hyx.this) != null && hyx.a(hyx.this).getItemAnimator() != null) {
                            hyx.a(hyx.this).getItemAnimator().setChangeDuration(0L);
                            hyx.a(hyx.this).getItemAnimator().setMoveDuration(0L);
                        }
                        hyx.d(hyx.this).a(hyx.b(hyx.this) - ((int) hyx.c(hyx.this).getTranslationY()));
                    }
                });
            } catch (Throwable th) {
                hyn.a("OrderDetailMapBusiness", "shouldShowLogistic_error", th.toString());
                RecyclerView recyclerView = this.h;
                if (recyclerView != null) {
                    context = recyclerView.getContext();
                }
                hyq.c(context, "OrderDetailMapBusiness", "initLogisticsMapBody", "INIT-DETAIL-MAP-ERROR", th.toString(), null);
            }
        }
    }

    @Override // com.taobao.android.order.bundle.widget.OffsetBodyWrapper.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        float c = gbg.c(this.f.getContext());
        this.c = Math.max((int) (this.k * c), 0);
        this.b = Math.max((int) (c * this.l), 0);
        float f = this.k;
        if (f == 0.0f) {
            return;
        }
        agb.f25316a = f;
    }

    @Override // com.taobao.android.order.bundle.widget.OffsetBodyWrapper.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.e && "logistic".equals(this.g);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.e;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e45ee4", new Object[]{this, eVar});
        } else {
            this.j = eVar;
        }
    }
}
