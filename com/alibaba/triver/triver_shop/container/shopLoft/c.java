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
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class c implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f3713a;
    private JSONObject b;
    private b.c c;
    private String d;
    private String e;
    private String f;
    private TUrlImageView g;
    private TextView h;
    private FrameLayout i;
    private View j;
    private String k;
    private String l;
    private String m;
    private boolean n;

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
            } else if (com.alibaba.triver.triver_shop.newShop.ext.b.a(c.a(c.this), c.b(c.this))) {
            } else {
                Map<String, String> uTProperties = c.this.getUTProperties();
                q.a(uTProperties);
                uTProperties.put("spm", "a2141.b91375813.c1638791741528.d1638791741528");
                m.a("Page_Shop_2Fcontentfeed_marketcard", "Page_Shop_2Fcontentfeed_marketcard_click", uTProperties);
                Bundle bundle = new Bundle();
                bundle.putBoolean("triver_close_activity_animation", true);
                Nav.from(c.a(c.this)).withExtras(bundle).withFlags(65536).toUri(c.b(c.this));
            }
        }
    }

    static {
        kge.a(-1187549116);
        kge.a(-563039837);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
        }
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
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
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
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
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

    public static final /* synthetic */ Context a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("60f39800", new Object[]{cVar}) : cVar.f3713a;
    }

    public static final /* synthetic */ String b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("446b7f59", new Object[]{cVar}) : cVar.f;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void initWithData(Context context, JSONObject jSONObject, b.c cVar, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac25571", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        this.f3713a = context;
        this.b = jSONObject;
        this.c = cVar;
        a();
    }

    private final void a() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b();
        Context context = this.f3713a;
        if (context == null) {
            return;
        }
        FrameLayout frameLayout2 = null;
        this.j = LayoutInflater.from(context).inflate(R.layout.view_market_loft_view, (ViewGroup) null);
        View view = this.j;
        this.g = view == null ? null : (TUrlImageView) view.findViewById(R.id.shop_loft_market_image);
        View view2 = this.j;
        this.h = view2 == null ? null : (TextView) view2.findViewById(R.id.shop_loft_market_button_text);
        View view3 = this.j;
        if (view3 != null) {
            frameLayout2 = (FrameLayout) view3.findViewById(R.id.shop_loft_market_button);
        }
        this.i = frameLayout2;
        FrameLayout frameLayout3 = this.i;
        if (frameLayout3 != null) {
            frameLayout3.setOnClickListener(new a());
        }
        if (this.n) {
            TUrlImageView tUrlImageView = this.g;
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(this.e);
            }
        } else {
            TUrlImageView tUrlImageView2 = this.g;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl(this.d);
            }
        }
        TextView textView = this.h;
        if (textView != null) {
            if (StringUtils.isEmpty(this.k)) {
                FrameLayout frameLayout4 = this.i;
                if (frameLayout4 != null) {
                    o.d(frameLayout4);
                }
            } else {
                textView.setText(this.k);
                textView.setTextColor(Color.parseColor(this.l));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(o.a(Float.valueOf(25.0f)));
                gradientDrawable.setColor(Color.parseColor(this.m));
                gradientDrawable.setStroke(o.a(Double.valueOf(1.5d)), Color.parseColor("#37FFFFFF"));
                if (Build.VERSION.SDK_INT >= 16) {
                    textView.setBackground(gradientDrawable);
                } else {
                    textView.setBackgroundDrawable(gradientDrawable);
                }
            }
        }
        if (!this.n || (frameLayout = this.i) == null) {
            return;
        }
        o.e(frameLayout);
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.b;
        String str = null;
        this.d = jSONObject == null ? null : jSONObject.getString("bigImageUrl");
        JSONObject jSONObject2 = this.b;
        this.e = jSONObject2 == null ? null : jSONObject2.getString("smallImageUrl");
        JSONObject jSONObject3 = this.b;
        this.f = jSONObject3 == null ? null : jSONObject3.getString("targetUrl");
        JSONObject jSONObject4 = this.b;
        this.k = jSONObject4 == null ? null : jSONObject4.getString("btnTitle");
        JSONObject jSONObject5 = this.b;
        this.l = jSONObject5 == null ? null : jSONObject5.getString("btnTitleColor");
        JSONObject jSONObject6 = this.b;
        this.m = jSONObject6 == null ? null : jSONObject6.getString("btnColor");
        JSONObject jSONObject7 = this.b;
        if (jSONObject7 != null) {
            str = jSONObject7.getString("inBigCard");
        }
        this.n = q.a((Object) str, (Object) "true");
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
        if (jSONObject3 != null) {
            str = jSONObject3.getString("id");
        }
        hashMap.put("imageid", str);
        hashMap.put("spm-cnt", "a2141.b91375813.0.0");
        hashMap.put("tag", "2FMarket");
        return hashMap;
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
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.j;
    }
}
