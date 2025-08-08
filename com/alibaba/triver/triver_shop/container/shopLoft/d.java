package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.MediaType;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.taobao.R;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public final class d implements com.alibaba.triver.triver_shop.container.shopLoft.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f3715a;
    private JSONObject b;
    private b.c c;
    private MediaPlayCenter d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private View j;
    private FrameLayout k;
    private ImageView l;
    private FrameLayout m;
    private TextView n;
    private boolean o;

    /* loaded from: classes3.dex */
    public static final class a implements com.taobao.mediaplay.player.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.mediaplay.player.f
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            b.c b = d.b(d.this);
            if (b == null) {
                return;
            }
            b.a("onPause", null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3717a;
        public final /* synthetic */ d b;

        public b(Context context, d dVar) {
            this.f3717a = context;
            this.b = dVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (com.alibaba.triver.triver_shop.newShop.ext.b.a(this.f3717a, d.a(this.b))) {
            } else {
                Map<String, String> uTProperties = this.b.getUTProperties();
                q.a(uTProperties);
                uTProperties.put("spm", "a2141.b91375813.c1638791741528.d1638791741528");
                m.a("Page_Shop_2Fcontentfeed_marketcard", "Page_Shop_2Fcontentfeed_marketcard_click", uTProperties);
                Bundle bundle = new Bundle();
                bundle.putBoolean("triver_close_activity_animation", true);
                Nav.from(this.f3717a).withExtras(bundle).withFlags(65536).toUri(d.a(this.b));
            }
        }
    }

    static {
        kge.a(1569290691);
        kge.a(-563039837);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this}) : "Page_Shop_2Fcontentfeed_marketcard";
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        }
    }

    public static final /* synthetic */ String a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d564a19", new Object[]{dVar}) : dVar.i;
    }

    public static final /* synthetic */ b.c b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.c) ipChange.ipc$dispatch("65c311a8", new Object[]{dVar}) : dVar.c;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void initWithData(Context context, JSONObject jSONObject, b.c cVar, b.a aVar) {
        FrameLayout frameLayout;
        View view;
        FrameLayout frameLayout2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac25571", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        this.f3715a = context;
        this.b = jSONObject;
        this.c = cVar;
        a();
        TextView textView = null;
        this.j = LayoutInflater.from(context).inflate(R.layout.view_market_loft_view, (ViewGroup) null);
        View view2 = this.j;
        this.k = view2 == null ? null : (FrameLayout) view2.findViewById(R.id.shop_loft_market_video_container);
        View view3 = this.j;
        this.l = view3 == null ? null : (ImageView) view3.findViewById(R.id.shop_loft_market_image);
        View view4 = this.j;
        this.m = view4 == null ? null : (FrameLayout) view4.findViewById(R.id.shop_loft_market_button);
        View view5 = this.j;
        if (view5 != null) {
            textView = (TextView) view5.findViewById(R.id.shop_loft_market_button_text);
        }
        this.n = textView;
        FrameLayout frameLayout3 = this.k;
        if (frameLayout3 != null) {
            o.b(frameLayout3);
        }
        ImageView imageView = this.l;
        if (imageView != null) {
            o.d(imageView);
        }
        b();
        MediaPlayCenter mediaPlayCenter = this.d;
        if (mediaPlayCenter != null && (view = mediaPlayCenter.getView()) != null && (frameLayout2 = this.k) != null) {
            frameLayout2.addView(view);
        }
        FrameLayout frameLayout4 = this.m;
        if (frameLayout4 != null) {
            frameLayout4.setOnClickListener(new b(context, this));
        }
        TextView textView2 = this.n;
        if (textView2 != null) {
            if (StringUtils.isEmpty(this.f)) {
                FrameLayout frameLayout5 = this.m;
                if (frameLayout5 != null) {
                    o.d(frameLayout5);
                }
            } else {
                textView2.setText(this.f);
                textView2.setTextColor(Color.parseColor(this.h));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(o.a(Float.valueOf(25.0f)));
                gradientDrawable.setColor(Color.parseColor(this.g));
                gradientDrawable.setStroke(o.a(Double.valueOf(1.5d)), Color.parseColor("#37FFFFFF"));
                if (Build.VERSION.SDK_INT >= 16) {
                    textView2.setBackground(gradientDrawable);
                } else {
                    textView2.setBackgroundDrawable(gradientDrawable);
                }
            }
        }
        if (!this.o || (frameLayout = this.m) == null) {
            return;
        }
        o.e(frameLayout);
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.b;
        String str = null;
        this.e = jSONObject == null ? null : jSONObject.getString("videoUrl");
        JSONObject jSONObject2 = this.b;
        this.f = jSONObject2 == null ? null : jSONObject2.getString("btnTitle");
        JSONObject jSONObject3 = this.b;
        this.g = jSONObject3 == null ? null : jSONObject3.getString("btnColor");
        JSONObject jSONObject4 = this.b;
        this.h = jSONObject4 == null ? null : jSONObject4.getString("btnTitleColor");
        JSONObject jSONObject5 = this.b;
        this.i = jSONObject5 == null ? null : jSONObject5.getString("targetUrl");
        JSONObject jSONObject6 = this.b;
        if (jSONObject6 != null) {
            str = jSONObject6.getString("inBigCard");
        }
        this.o = q.a((Object) str, (Object) "true");
    }

    private final void b() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String str = this.e;
        this.d = new MediaPlayCenter(this.f3715a);
        MediaPlayCenter mediaPlayCenter = this.d;
        q.a(mediaPlayCenter);
        mediaPlayCenter.setMediaUrl(str);
        MediaPlayCenter mediaPlayCenter2 = this.d;
        q.a(mediaPlayCenter2);
        mediaPlayCenter2.setMediaType(MediaType.VIDEO);
        MediaPlayCenter mediaPlayCenter3 = this.d;
        q.a(mediaPlayCenter3);
        mediaPlayCenter3.setConfigGroup("DW");
        MediaPlayCenter mediaPlayCenter4 = this.d;
        q.a(mediaPlayCenter4);
        mediaPlayCenter4.setNeedPlayControlView(false);
        MediaPlayCenter mediaPlayCenter5 = this.d;
        q.a(mediaPlayCenter5);
        mediaPlayCenter5.hideController();
        MediaPlayCenter mediaPlayCenter6 = this.d;
        q.a(mediaPlayCenter6);
        mediaPlayCenter6.setBusinessId("shop_mini_video");
        MediaPlayCenter mediaPlayCenter7 = this.d;
        q.a(mediaPlayCenter7);
        mediaPlayCenter7.setMediaSource("CDNVideo");
        MediaPlayCenter mediaPlayCenter8 = this.d;
        q.a(mediaPlayCenter8);
        mediaPlayCenter8.setPlayerType(3);
        MediaPlayCenter mediaPlayCenter9 = this.d;
        q.a(mediaPlayCenter9);
        mediaPlayCenter9.setScenarioType(0);
        MediaPlayCenter mediaPlayCenter10 = this.d;
        q.a(mediaPlayCenter10);
        mediaPlayCenter10.setVideoLoop(true);
        MediaPlayCenter mediaPlayCenter11 = this.d;
        q.a(mediaPlayCenter11);
        mediaPlayCenter11.setMediaAspectRatio(MediaAspectRatio.DW_FIT_CENTER);
        if (this.o) {
            MediaPlayCenter mediaPlayCenter12 = this.d;
            q.a(mediaPlayCenter12);
            mediaPlayCenter12.setMediaAspectRatio(MediaAspectRatio.DW_CENTER_CROP);
        }
        try {
            Result.a aVar = Result.Companion;
            MediaPlayCenter mediaPlayCenter13 = this.d;
            q.a(mediaPlayCenter13);
            mediaPlayCenter13.setVideoRecycleListener(new a());
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        ceg.Companion.a(Result.m2374exceptionOrNullimpl(m2371constructorimpl));
        MediaPlayCenter mediaPlayCenter14 = this.d;
        q.a(mediaPlayCenter14);
        mediaPlayCenter14.setup();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        Map<String, String> uTProperties = getUTProperties();
        if (uTProperties != null) {
            uTProperties.put("spm", "a2141.b91375813.c1638791681170.d1638791681170");
        }
        m.b("Page_Shop_2Fcontentfeed_marketcard", "Page_Shop_2Fcontentfeed_marketcard_exposure", uTProperties);
        play();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
        } else {
            pause();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.d;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.start();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.d;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.pause();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.d;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.mute(z);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.d;
        if (mediaPlayCenter == null) {
            return;
        }
        q.a(mediaPlayCenter);
        mediaPlayCenter.pause();
        MediaPlayCenter mediaPlayCenter2 = this.d;
        q.a(mediaPlayCenter2);
        mediaPlayCenter2.release();
        MediaPlayCenter mediaPlayCenter3 = this.d;
        q.a(mediaPlayCenter3);
        mediaPlayCenter3.destroy();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.d;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.start();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.d;
        if (mediaPlayCenter == null) {
            return;
        }
        mediaPlayCenter.pause();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.j;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public ShareContent getShareContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        ShareContent shareContent = new ShareContent();
        JSONObject jSONObject = this.b;
        String str = null;
        shareContent.imageUrl = jSONObject == null ? null : jSONObject.getString("shareImage");
        JSONObject jSONObject2 = this.b;
        shareContent.title = jSONObject2 == null ? null : jSONObject2.getString("shareTitle");
        JSONObject jSONObject3 = this.b;
        if (jSONObject3 != null) {
            str = jSONObject3.getString("shareText");
        }
        shareContent.description = str;
        return shareContent;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = this.b;
        String str = null;
        hashMap.put("shop_id", jSONObject == null ? null : jSONObject.getString("shopId"));
        JSONObject jSONObject2 = this.b;
        hashMap.put("seller_id", jSONObject2 == null ? null : jSONObject2.getString("sellerId"));
        JSONObject jSONObject3 = this.b;
        hashMap.put("videoid", jSONObject3 == null ? null : jSONObject3.getString("id"));
        JSONObject jSONObject4 = this.b;
        if (jSONObject4 != null) {
            str = jSONObject4.getString("id");
        }
        hashMap.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_VIDEO_ID, str);
        hashMap.put("spm-cnt", "a2141.b91375813.0.0");
        hashMap.put("tag", "2FMarket");
        return hashMap;
    }
}
