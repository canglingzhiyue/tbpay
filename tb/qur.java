package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.g;
import com.airbnb.lottie.l;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.muise.f;
import com.taobao.monitor.procedure.v;
import com.taobao.taobao.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class qur extends nph {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final HashMap<String, String> b;
    private static final HashMap<String, String> c;

    /* loaded from: classes7.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class c implements l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f33064a;

        public c(LottieAnimationView lottieAnimationView) {
            this.f33064a = lottieAnimationView;
        }

        @Override // com.airbnb.lottie.l
        public final void onCompositionLoaded(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90ed5f5e", new Object[]{this, gVar});
            } else {
                this.f33064a.playAnimation();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(qur qurVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-1391284856);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-177958336);
        Companion = new a(null);
        b = new HashMap<>();
        c = new HashMap<>();
        b.put("all", "https://g.alicdn.com/eva-assets/8580d21abfc7548e84e1b205693bef0a/0.0.1/tmp/07c485e/07c485e.json");
        c.put("all", "https://g.alicdn.com/eva-assets/8e60b10f9a885c178c34d26c1c9fdbdd/0.0.1/tmp/6aa42e7/6aa42e7.json");
        b.put("live", "https://g.alicdn.com/eva-assets/76b59e1aba5b289c96a5afacf982bcec/0.0.1/tmp/7da68bc/7da68bc.json");
        c.put("live", "https://g.alicdn.com/eva-assets/6d5403bb789609d3f1404c24ef68be72/0.0.1/tmp/f7a0555/f7a0555.json");
        b.put("shop", "https://g.alicdn.com/eva-assets/8ad7bbf31586541caefd1426f0580920/0.0.1/tmp/3a89e48/3a89e48.json");
        c.put("shop", "https://g.alicdn.com/eva-assets/9af6bbd3fd859127424cae4fecc0393f/0.0.1/tmp/a18dc57/a18dc57.json");
        b.put("tbexperience", "https://g.alicdn.com/eva-assets/957822826ed1033557321a20d97c8321/0.0.1/tmp/62ec4d1/62ec4d1.json");
        c.put("tbexperience", "https://g.alicdn.com/eva-assets/a6ffde41881944ba5f731e51de2171f1/0.0.1/tmp/53bef61/53bef61.json");
    }

    @Override // tb.nph
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        View view = LayoutInflater.from(g().getContext()).inflate(R.layout.sf_tbsearch_ms_skeleton_loading, (ViewGroup) g(), false);
        view.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
        view.setOnClickListener(b.INSTANCE);
        g().addView(view);
        d();
        Activity mActivity = this.f;
        q.a((Object) mActivity, "mActivity");
        q.a((Object) view, "view");
        npg.a((Context) mActivity, view);
        LottieAnimationView lottieView = (LottieAnimationView) view.findViewById(R.id.lottie_view);
        q.a((Object) lottieView, "lottieView");
        lottieView.setScaleType(ImageView.ScaleType.FIT_XY);
        lottieView.setImageAssetsFolder("");
        lottieView.addLottieOnCompositionLoadedListener(new c(lottieView));
        lottieView.setAnimationFromUrl(f());
    }

    private final String f() {
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        Activity activity = this.f;
        if (!(activity instanceof f)) {
            activity = null;
        }
        f fVar = (f) activity;
        if (fVar != null && fVar.g()) {
            hashMap = c;
        } else {
            hashMap = b;
        }
        String str = hashMap.get(q().a().getTab());
        if (StringUtils.isEmpty(str)) {
            str = hashMap.get("all");
        }
        if (str == null) {
            q.a();
        }
        return str;
    }
}
