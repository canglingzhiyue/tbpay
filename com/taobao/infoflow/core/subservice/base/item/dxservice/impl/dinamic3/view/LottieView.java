package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.g;
import com.airbnb.lottie.j;
import com.airbnb.lottie.l;
import com.airbnb.lottie.m;
import com.airbnb.lottie.model.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.utils.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.akn;
import tb.ako;
import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class LottieView extends FrameLayout implements j<Throwable>, l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Map<String, String> FONT_PATH_MAP;
    public static final String TAG = "DXTBIFLottieViewWidgetNode";
    private final HImageView bottomImageView;
    private final LottieAnimationView lottieAnimationView;

    public static /* synthetic */ Object ipc$super(LottieView lottieView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(15605852);
        kge.a(2033362794);
        kge.a(875978254);
        HashMap hashMap = new HashMap();
        FONT_PATH_MAP = hashMap;
        hashMap.put("AlibabaSans-Bold", e.ALI_SANS_TYPEFACE_ASSET_PATH);
    }

    public LottieView(Context context) {
        this(context, null);
    }

    public LottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.lottieAnimationView = new LottieAnimationView(getContext());
        this.lottieAnimationView.setFontAssetDelegate(new a(context));
        this.lottieAnimationView.addLottieOnCompositionLoadedListener(this);
        this.lottieAnimationView.setFailureListener(this);
        this.bottomImageView = new HImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.bottomImageView, layoutParams);
        addView(this.lottieAnimationView, layoutParams);
    }

    public void onRenderView(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aeb0f66", new Object[]{this, bVar});
            return;
        }
        LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView != null && lottieAnimationView.isAnimating()) {
            return;
        }
        ldf.c("DXTBIFLottieViewWidgetNode", "onRenderView");
        try {
            if (this.bottomImageView != null) {
                this.bottomImageView.setScaleType(b.a(bVar));
                this.bottomImageView.setImageUrl(b.b(bVar));
            }
            if (this.lottieAnimationView == null) {
                return;
            }
            this.lottieAnimationView.setScaleType(b.a(bVar));
            this.lottieAnimationView.setProgress((float) b.c(bVar));
            this.lottieAnimationView.setRepeatCount(b.d(bVar));
            this.lottieAnimationView.setAnimationFromUrl(b.e(bVar));
            for (final Map.Entry<String, Object> entry : b.f(bVar).entrySet()) {
                String[] split = entry.getKey().split(",");
                if (split.length != 0 && (entry.getValue() instanceof String)) {
                    this.lottieAnimationView.addValueCallback(new d(split), (d) m.TEXT, (ako<d>) new ako<CharSequence>() { // from class: com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.LottieView.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.CharSequence, java.lang.Object] */
                        @Override // tb.ako
                        public /* synthetic */ CharSequence a(akn<CharSequence> aknVar) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("7a3b42de", new Object[]{this, aknVar}) : b(aknVar);
                        }

                        public CharSequence b(akn<CharSequence> aknVar) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (CharSequence) ipChange2.ipc$dispatch("18601ac5", new Object[]{this, aknVar}) : (String) entry.getValue();
                        }
                    });
                }
            }
        } catch (Throwable th) {
            ldf.a("DXTBIFLottieViewWidgetNode", "onRenderView", th);
        }
    }

    @Override // com.airbnb.lottie.l
    public void onCompositionLoaded(g gVar) {
        int height;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ed5f5e", new Object[]{this, gVar});
            return;
        }
        ldf.c("DXTBIFLottieViewWidgetNode", "onCompositionLoaded");
        if (gVar != null) {
            try {
                Rect d = gVar.d();
                if (d != null) {
                    i = d.width();
                    height = d.height();
                    if (i <= 0 || height <= 0) {
                    }
                    hideBottomImage();
                    start();
                    return;
                }
            } catch (Throwable th) {
                ldf.a("DXTBIFLottieViewWidgetNode", "onCompositionLoaded exception", th);
                return;
            }
        }
        height = 0;
        if (i <= 0) {
        }
    }

    @Override // com.airbnb.lottie.j
    public void onResult(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f750ea72", new Object[]{this, th});
        } else {
            ldf.a("DXTBIFLottieViewWidgetNode", "onResult Throwable", th);
        }
    }

    private void hideBottomImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d053cd5", new Object[]{this});
            return;
        }
        ldf.c("DXTBIFLottieViewWidgetNode", "hideBottomImage");
        HImageView hImageView = this.bottomImageView;
        if (hImageView == null) {
            return;
        }
        hImageView.setVisibility(8);
    }

    private void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.lottieAnimationView.isAnimating()) {
        } else {
            ldf.c("DXTBIFLottieViewWidgetNode", "start");
            try {
                if (this.lottieAnimationView == null || this.lottieAnimationView.isAnimating()) {
                    return;
                }
                this.lottieAnimationView.playAnimation();
            } catch (Throwable th) {
                ldf.a("DXTBIFLottieViewWidgetNode", "start exception", th);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final JSONObject f17362a;
        private final String b;
        private final double c;
        private final String d;
        private final int e;
        private final ImageView.ScaleType f;

        static {
            kge.a(-1660212562);
        }

        public static /* synthetic */ ImageView.ScaleType a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ImageView.ScaleType) ipChange.ipc$dispatch("c400b811", new Object[]{bVar}) : bVar.f;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("391cabc2", new Object[]{bVar}) : bVar.b;
        }

        public static /* synthetic */ double c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ecd20c2b", new Object[]{bVar})).doubleValue() : bVar.c;
        }

        public static /* synthetic */ int d(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bc923fcf", new Object[]{bVar})).intValue() : bVar.e;
        }

        public static /* synthetic */ String e(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a5d38685", new Object[]{bVar}) : bVar.d;
        }

        public static /* synthetic */ JSONObject f(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("fde6a3a", new Object[]{bVar}) : bVar.f17362a;
        }

        public b(JSONObject jSONObject, String str, double d, String str2, int i, ImageView.ScaleType scaleType) {
            this.f17362a = jSONObject == null ? new JSONObject() : jSONObject;
            this.b = str;
            this.c = d;
            this.d = str2;
            this.e = i;
            this.f = scaleType;
        }
    }

    /* loaded from: classes7.dex */
    public static class a extends com.airbnb.lottie.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Context> f17361a;

        static {
            kge.a(1284855105);
        }

        @Override // com.airbnb.lottie.d
        public String b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
            }
            return null;
        }

        public a(Context context) {
            this.f17361a = new WeakReference<>(context);
        }

        @Override // com.airbnb.lottie.d
        public Typeface a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Typeface) ipChange.ipc$dispatch("79ebd1a8", new Object[]{this, str});
            }
            if (this.f17361a == null) {
                return Typeface.SANS_SERIF;
            }
            if (LottieView.FONT_PATH_MAP.containsKey(str)) {
                return Typeface.createFromAsset(this.f17361a.get().getAssets(), LottieView.FONT_PATH_MAP.get(str));
            }
            return Typeface.createFromAsset(this.f17361a.get().getAssets(), e.ALI_SANS_TYPEFACE_ASSET_PATH);
        }
    }
}
