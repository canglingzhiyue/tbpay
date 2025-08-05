package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.ceg;
import tb.cen;
import tb.eby;
import tb.fxb;
import tb.kge;

/* loaded from: classes3.dex */
public final class ShopLoftGraphicView extends ShopLoftViewNewStyleBaseView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private GraphicViewPager h;
    private b i;
    private a j;
    private ShopLoftGraphicWebView k;
    private JSONArray l;
    private boolean m;
    private boolean n = cen.Companion.t();

    static {
        kge.a(807652026);
    }

    public static /* synthetic */ Object ipc$super(ShopLoftGraphicView shopLoftGraphicView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1430104719:
                super.initWithData((Context) objArr[0], (JSONObject) objArr[1], (b.c) objArr[2], (b.a) objArr[3]);
                return null;
            case 50486379:
                super.didDisappear();
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 1580371323:
                super.didAppear();
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
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

    public static final /* synthetic */ a a(ShopLoftGraphicView shopLoftGraphicView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("88d89671", new Object[]{shopLoftGraphicView}) : shopLoftGraphicView.j;
    }

    public static final /* synthetic */ void b(ShopLoftGraphicView shopLoftGraphicView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758fcd9e", new Object[]{shopLoftGraphicView});
        } else {
            shopLoftGraphicView.w();
        }
    }

    public static final /* synthetic */ JSONArray c(ShopLoftGraphicView shopLoftGraphicView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("a0133b3f", new Object[]{shopLoftGraphicView}) : shopLoftGraphicView.l;
    }

    public static final /* synthetic */ boolean d(ShopLoftGraphicView shopLoftGraphicView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e568a8a4", new Object[]{shopLoftGraphicView})).booleanValue() : shopLoftGraphicView.m;
    }

    public static final /* synthetic */ boolean e(ShopLoftGraphicView shopLoftGraphicView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d551625", new Object[]{shopLoftGraphicView})).booleanValue() : shopLoftGraphicView.n;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, com.alibaba.triver.triver_shop.container.shopLoft.b
    public void initWithData(Context context, JSONObject jSONObject, b.c cVar, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac25571", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        super.initWithData(context, jSONObject, cVar, aVar);
        JSONArray jSONArray = jSONObject == null ? null : jSONObject.getJSONArray("picList");
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        this.l = jSONArray;
        JSONArray jSONArray2 = this.l;
        if (jSONArray2 == null) {
            q.b("picList");
            throw null;
        } else if (jSONArray2.size() == 0) {
            ceg.Companion.b("picList size is 0");
        } else {
            this.m = l.b();
            t();
            q();
        }
    }

    private final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        this.h = new GraphicViewPager(p());
        this.i = new b(this);
        GraphicViewPager graphicViewPager = this.h;
        if (graphicViewPager == null) {
            q.b(OrderConfigs.VIEWPAGER);
            throw null;
        }
        b bVar = this.i;
        if (bVar == null) {
            q.b("picAdapter");
            throw null;
        }
        graphicViewPager.setAdapter(bVar);
        FrameLayout g = g();
        GraphicViewPager graphicViewPager2 = this.h;
        if (graphicViewPager2 == null) {
            q.b(OrderConfigs.VIEWPAGER);
            throw null;
        }
        o.a(g, graphicViewPager2);
        this.j = new a(this);
        FrameLayout g2 = g();
        a aVar = this.j;
        if (aVar != null) {
            g2.addView(aVar.a(), new FrameLayout.LayoutParams(-1, -2, 80));
            FrameLayout g3 = g();
            a aVar2 = this.j;
            if (aVar2 != null) {
                g3.addView(aVar2.b(), new FrameLayout.LayoutParams(o.a((Number) 40), o.a((Number) 24), 8388661));
                a aVar3 = this.j;
                if (aVar3 == null) {
                    q.b("indicatorComponent");
                    throw null;
                }
                o.c(aVar3.b(), d() + o.a((Number) 9));
                a aVar4 = this.j;
                if (aVar4 == null) {
                    q.b("indicatorComponent");
                    throw null;
                }
                o.f(aVar4.b(), o.a((Number) 9));
                ShopLoftGraphicWebView shopLoftGraphicWebView = this.k;
                if (shopLoftGraphicWebView != null) {
                    GraphicViewPager graphicViewPager3 = this.h;
                    if (graphicViewPager3 == null) {
                        q.b(OrderConfigs.VIEWPAGER);
                        throw null;
                    }
                    shopLoftGraphicWebView.setGraphicViewPager(graphicViewPager3);
                }
                GraphicViewPager graphicViewPager4 = this.h;
                if (graphicViewPager4 != null) {
                    graphicViewPager4.addOnPageChangeListener(new c());
                    return;
                } else {
                    q.b(OrderConfigs.VIEWPAGER);
                    throw null;
                }
            }
            q.b("indicatorComponent");
            throw null;
        }
        q.b("indicatorComponent");
        throw null;
    }

    /* loaded from: classes3.dex */
    public static final class c implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        public c() {
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            a a2 = ShopLoftGraphicView.a(ShopLoftGraphicView.this);
            if (a2 != null) {
                a2.a(i);
            } else {
                q.b("indicatorComponent");
                throw null;
            }
        }
    }

    private final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else if (m()) {
        } else {
            v();
        }
    }

    private final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        GraphicViewPager graphicViewPager = this.h;
        if (graphicViewPager == null) {
            return;
        }
        if (graphicViewPager != null) {
            graphicViewPager.postDelayed(new Runnable() { // from class: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftGraphicView.d
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ShopLoftGraphicView.b(ShopLoftGraphicView.this);
                    }
                }
            }, Constants.STARTUP_TIME_LEVEL_1);
        } else {
            q.b(OrderConfigs.VIEWPAGER);
            throw null;
        }
    }

    private final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else if (m()) {
        } else {
            GraphicViewPager graphicViewPager = this.h;
            if (graphicViewPager == null) {
                q.b(OrderConfigs.VIEWPAGER);
                throw null;
            }
            int currentItem = graphicViewPager.getCurrentItem();
            JSONArray jSONArray = this.l;
            if (jSONArray == null) {
                q.b("picList");
                throw null;
            } else if (currentItem >= jSONArray.size() - 1) {
            } else {
                GraphicViewPager graphicViewPager2 = this.h;
                if (graphicViewPager2 == null) {
                    q.b(OrderConfigs.VIEWPAGER);
                    throw null;
                }
                graphicViewPager2.setCurrentItem(currentItem + 1, true);
                v();
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        super.didAppear();
        play();
        u();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        super.didDisappear();
        pause();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        } else {
            super.onActivityResume();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        } else {
            super.onActivityPause();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView
    public ShopWrapWebView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopWrapWebView) ipChange.ipc$dispatch("641fdd50", new Object[]{this});
        }
        if (this.k == null) {
            this.k = new ShopLoftGraphicWebView(p());
            a((ShopWrapWebView) this.k);
        }
        ShopLoftGraphicWebView shopLoftGraphicWebView = this.k;
        q.a(shopLoftGraphicWebView);
        return shopLoftGraphicWebView;
    }

    /* loaded from: classes3.dex */
    public final class b extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopLoftGraphicView f3739a;

        static {
            kge.a(-1854687569);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 50642664) {
                return new Integer(super.getItemPosition(objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
        }

        public b(ShopLoftGraphicView this$0) {
            q.d(this$0, "this$0");
            this.f3739a = this$0;
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            JSONArray c = ShopLoftGraphicView.c(this.f3739a);
            if (c != null) {
                return c.size();
            }
            q.b("picList");
            throw null;
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue() : super.getItemPosition(obj);
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            ShopLoftGraphicView shopLoftGraphicView = this.f3739a;
            PicPagerItemView picPagerItemView = new PicPagerItemView(shopLoftGraphicView, shopLoftGraphicView.p());
            picPagerItemView.init();
            JSONArray c = ShopLoftGraphicView.c(this.f3739a);
            if (c == null) {
                q.b("picList");
                throw null;
            }
            JSONObject jSONObject = c.getJSONObject(i);
            q.b(jSONObject, "picList.getJSONObject(position)");
            picPagerItemView.renderWithData(jSONObject);
            if (viewGroup != null) {
                o.a(viewGroup, picPagerItemView);
            }
            return picPagerItemView;
        }

        @Override // android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            } else if (!(obj instanceof View) || viewGroup == null) {
            } else {
                viewGroup.removeView((View) obj);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class PicPagerItemView extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final ImageView backgroundImageView;
        private final TUrlImageView contentView;
        private final boolean enableRenderEffectBlur;
        private final FrameLayout imageContainer;
        private float imageRatio;
        private final String lowDeviceGuessPicUrl;
        public final /* synthetic */ ShopLoftGraphicView this$0;
        private boolean useSystemBlur;

        /* loaded from: classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ float f3736a;
            public final /* synthetic */ Ref.IntRef b;
            public final /* synthetic */ Ref.ObjectRef<ViewGroup> c;
            public final /* synthetic */ int d;
            public final /* synthetic */ int e;
            public final /* synthetic */ LinearLayout f;
            public final /* synthetic */ float g;
            public final /* synthetic */ int h;
            public final /* synthetic */ Ref.ObjectRef<ViewGroup> i;
            public final /* synthetic */ Ref.BooleanRef j;
            public final /* synthetic */ Ref.ObjectRef<ViewGroup> k;

            public a(float f, Ref.IntRef intRef, Ref.ObjectRef<ViewGroup> objectRef, int i, int i2, LinearLayout linearLayout, float f2, int i3, Ref.ObjectRef<ViewGroup> objectRef2, Ref.BooleanRef booleanRef, Ref.ObjectRef<ViewGroup> objectRef3) {
                this.f3736a = f;
                this.b = intRef;
                this.c = objectRef;
                this.d = i;
                this.e = i2;
                this.f = linearLayout;
                this.g = f2;
                this.h = i3;
                this.i = objectRef2;
                this.j = booleanRef;
                this.k = objectRef3;
            }

            /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x015b  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0161  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x01cf  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 475
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftGraphicView.PicPagerItemView.a.run():void");
            }
        }

        /* loaded from: classes3.dex */
        public static final class b implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ LinearLayout f3737a;
            public final /* synthetic */ JSONObject b;

            public b(LinearLayout linearLayout, JSONObject jSONObject) {
                this.f3737a = linearLayout;
                this.b = jSONObject;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                Context context = this.f3737a.getContext();
                q.b(context, "context");
                l.a(context, com.alibaba.triver.triver_shop.newShop.ext.d.c(this.b, "jumpUrl"));
            }
        }

        static {
            kge.a(-1096330085);
        }

        public static /* synthetic */ Object ipc$super(PicPagerItemView picPagerItemView, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PicPagerItemView(ShopLoftGraphicView this$0, Context context) {
            super(context);
            q.d(this$0, "this$0");
            q.d(context, "context");
            this.this$0 = this$0;
            this.lowDeviceGuessPicUrl = "https://gw.alicdn.com/imgextra/i2/O1CN01xenXqr1O62GkoCtKn_!!6000000001655-2-tps-750-1334.png";
            this.backgroundImageView = new ImageView(context);
            this.contentView = new TUrlImageView(context);
            this.imageContainer = new FrameLayout(context);
            this.imageRatio = 1.7777778f;
        }

        public final void init() {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[]{this});
                return;
            }
            if (Build.VERSION.SDK_INT >= 31 && this.enableRenderEffectBlur) {
                z = true;
            }
            this.useSystemBlur = z;
            o.a(this, this.backgroundImageView);
            this.backgroundImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.contentView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.imageContainer.addView(this.contentView, new FrameLayout.LayoutParams(-1, -2, 17));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
            t tVar = t.INSTANCE;
            addView(this.imageContainer, layoutParams);
        }

        public final void renderWithData(JSONObject data) {
            Integer d;
            Integer d2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92af25c3", new Object[]{this, data});
                return;
            }
            q.d(data, "data");
            String string = data.getString(eby.KEY_PIC_URL);
            if (string == null) {
                ceg.Companion.b("picUrl is null");
                return;
            }
            String string2 = data.getString("height");
            int intValue = (string2 == null || (d = n.d(string2)) == null) ? 0 : d.intValue();
            String string3 = data.getString("width");
            int intValue2 = (string3 == null || (d2 = n.d(string3)) == null) ? 0 : d2.intValue();
            if (intValue != 0 && intValue2 != 0) {
                this.imageRatio = intValue / intValue2;
            }
            Context context = getContext();
            if (context == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            int i = com.alibaba.triver.triver_shop.newShop.ext.b.b((Activity) context).widthPixels;
            int i2 = (int) (i * this.imageRatio);
            o.a(this.contentView, i2);
            this.contentView.setImageUrl(string);
            if (ShopLoftGraphicView.d(this.this$0)) {
                string = this.lowDeviceGuessPicUrl;
            } else {
                String string4 = data.getString("gaussPicUrl");
                if (string4 != null) {
                    string = string4;
                }
            }
            String decideUrl = ImageStrategyDecider.decideUrl(string, 300, 300, null);
            if (Build.VERSION.SDK_INT >= 31 && this.useSystemBlur) {
                com.taobao.phenix.intf.b.h().a(decideUrl).into(this.backgroundImageView);
                if (!ShopLoftGraphicView.d(this.this$0)) {
                    this.backgroundImageView.setRenderEffect(RenderEffect.createBlurEffect(20.0f, 20.0f, Shader.TileMode.DECAL));
                }
            } else {
                com.taobao.phenix.intf.b.h().a(decideUrl).bitmapProcessors(new com.taobao.phenix.compat.effects.b(getContext(), 20)).into(this.backgroundImageView, 2.0f);
                if (ShopLoftGraphicView.e(this.this$0)) {
                    this.backgroundImageView.setScaleX(3.0f);
                    this.backgroundImageView.setScaleY(3.0f);
                }
            }
            addTags(data, i, i2);
        }

        /* JADX WARN: Type inference failed for: r12v3, types: [T, android.widget.FrameLayout] */
        /* JADX WARN: Type inference failed for: r12v4, types: [android.widget.LinearLayout, T] */
        /* JADX WARN: Type inference failed for: r1v32, types: [T, android.widget.FrameLayout] */
        private final void addTags(JSONObject jSONObject, int i, int i2) {
            Ref.BooleanRef booleanRef;
            PicPagerItemView picPagerItemView = this;
            int i3 = i;
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91741bcf", new Object[]{picPagerItemView, jSONObject, new Integer(i3), new Integer(i2)});
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("imageTags");
            if (jSONArray == null) {
                return;
            }
            for (Object obj : jSONArray) {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    float floatValue = jSONObject2.getFloatValue("xPercent");
                    float floatValue2 = jSONObject2.getFloatValue("yPercent");
                    String c = com.alibaba.triver.triver_shop.newShop.ext.d.c(jSONObject2, "tagName");
                    String c2 = com.alibaba.triver.triver_shop.newShop.ext.d.c(jSONObject2, "price");
                    Ref.IntRef intRef = new Ref.IntRef();
                    int i4 = (int) ((i3 * floatValue) / 100);
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    booleanRef2.element = z;
                    FrameLayout frameLayout = picPagerItemView.imageContainer;
                    ?? frameLayout2 = new FrameLayout(frameLayout.getContext());
                    objectRef.element = frameLayout2;
                    View view = (View) frameLayout2;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams2 = null;
                    FrameLayout.LayoutParams layoutParams3 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                    if (layoutParams3 != null) {
                        layoutParams3.width = -2;
                        layoutParams3.height = -2;
                    } else {
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams4.width = -2;
                        layoutParams4.height = -2;
                        t tVar = t.INSTANCE;
                        view.setLayoutParams(layoutParams4);
                    }
                    if (floatValue < 32.0f || (floatValue > 50.0f && floatValue < 68.0f)) {
                        booleanRef2.element = false;
                    }
                    ViewGroup viewGroup = (ViewGroup) frameLayout2;
                    ?? linearLayout = new LinearLayout(viewGroup.getContext());
                    View view2 = (View) linearLayout;
                    ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                    if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                        view2.setLayoutParams(layoutParams5);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        t tVar2 = t.INSTANCE;
                        view2.setLayoutParams(marginLayoutParams);
                    }
                    objectRef3.element = linearLayout;
                    linearLayout.setMinimumWidth(o.d((Number) 120));
                    linearLayout.setBackgroundColor(o.a(3355443, 0.4f));
                    o.a(view2, true, o.d((Number) 12));
                    linearLayout.setPadding(o.d((Number) 12), o.d((Number) 8), o.d((Number) 12), o.d((Number) 8));
                    linearLayout.setOrientation(1);
                    linearLayout.post(new a(floatValue, intRef, objectRef, i4, i, linearLayout, floatValue2, i2, objectRef2, booleanRef2, objectRef3));
                    linearLayout.setOnClickListener(new b(linearLayout, jSONObject2));
                    ViewGroup viewGroup2 = (ViewGroup) linearLayout;
                    TextView textView = new TextView(viewGroup2.getContext());
                    TextView textView2 = textView;
                    ViewGroup.LayoutParams layoutParams6 = textView2.getLayoutParams();
                    if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                        textView2.setLayoutParams(layoutParams6);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                        t tVar3 = t.INSTANCE;
                        textView2.setLayoutParams(marginLayoutParams2);
                    }
                    textView.setText(c);
                    textView.setSingleLine();
                    o.a(textView, o.d((Number) 24));
                    textView.setTextColor(-1);
                    viewGroup2.addView(textView2);
                    t tVar4 = t.INSTANCE;
                    LinearLayout linearLayout2 = new LinearLayout(viewGroup2.getContext());
                    LinearLayout linearLayout3 = linearLayout2;
                    ViewGroup.LayoutParams layoutParams7 = linearLayout3.getLayoutParams();
                    if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
                        linearLayout3.setLayoutParams(layoutParams7);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
                        t tVar5 = t.INSTANCE;
                        linearLayout3.setLayoutParams(marginLayoutParams3);
                    }
                    ViewGroup.LayoutParams layoutParams8 = linearLayout3.getLayoutParams();
                    LinearLayout.LayoutParams layoutParams9 = layoutParams8 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams8 : null;
                    if (layoutParams9 != null) {
                        layoutParams9.width = -1;
                        layoutParams9.topMargin = o.d((Number) 4);
                    } else {
                        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams10.width = -1;
                        layoutParams10.topMargin = o.d((Number) 4);
                        t tVar6 = t.INSTANCE;
                        linearLayout3.setLayoutParams(layoutParams10);
                    }
                    linearLayout2.setGravity(17);
                    LinearLayout linearLayout4 = linearLayout2;
                    TextView textView3 = new TextView(linearLayout4.getContext());
                    TextView textView4 = textView3;
                    ViewGroup.LayoutParams layoutParams11 = textView4.getLayoutParams();
                    if (layoutParams11 instanceof ViewGroup.MarginLayoutParams) {
                        textView4.setLayoutParams(layoutParams11);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
                        t tVar7 = t.INSTANCE;
                        textView4.setLayoutParams(marginLayoutParams4);
                    }
                    textView3.setText("¥ ");
                    textView3.setTranslationY(o.d((Number) 3));
                    o.a(textView3, o.d((Number) 18));
                    textView3.setTextColor(-1);
                    linearLayout4.addView(textView4);
                    t tVar8 = t.INSTANCE;
                    TextView textView5 = new TextView(linearLayout4.getContext());
                    TextView textView6 = textView5;
                    ViewGroup.LayoutParams layoutParams12 = textView6.getLayoutParams();
                    if (layoutParams12 instanceof ViewGroup.MarginLayoutParams) {
                        textView6.setLayoutParams(layoutParams12);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams5 = new ViewGroup.MarginLayoutParams(-2, -2);
                        t tVar9 = t.INSTANCE;
                        textView6.setLayoutParams(marginLayoutParams5);
                    }
                    ViewGroup.LayoutParams layoutParams13 = textView6.getLayoutParams();
                    LinearLayout.LayoutParams layoutParams14 = layoutParams13 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams13 : null;
                    if (layoutParams14 != null) {
                        layoutParams14.width = -1;
                        layoutParams14.weight = 1.0f;
                    } else {
                        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams15.width = -1;
                        layoutParams15.weight = 1.0f;
                        t tVar10 = t.INSTANCE;
                        textView6.setLayoutParams(layoutParams15);
                    }
                    textView5.setText(c2);
                    o.a(textView5, o.d((Number) 24));
                    textView5.setTypeface(Typeface.DEFAULT_BOLD);
                    textView5.setTextColor(-1);
                    linearLayout4.addView(textView6);
                    t tVar11 = t.INSTANCE;
                    TUrlImageView tUrlImageView = new TUrlImageView(linearLayout4.getContext());
                    TUrlImageView tUrlImageView2 = tUrlImageView;
                    ViewGroup.LayoutParams layoutParams16 = tUrlImageView2.getLayoutParams();
                    if (layoutParams16 instanceof ViewGroup.MarginLayoutParams) {
                        tUrlImageView2.setLayoutParams(layoutParams16);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams6 = new ViewGroup.MarginLayoutParams(-2, -2);
                        t tVar12 = t.INSTANCE;
                        tUrlImageView2.setLayoutParams(marginLayoutParams6);
                    }
                    ViewGroup.LayoutParams layoutParams17 = tUrlImageView2.getLayoutParams();
                    LinearLayout.LayoutParams layoutParams18 = layoutParams17 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams17 : null;
                    if (layoutParams18 != null) {
                        layoutParams18.width = o.d((Number) 10);
                        layoutParams18.height = o.d((Number) 17);
                    } else {
                        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams19.width = o.d((Number) 10);
                        layoutParams19.height = o.d((Number) 17);
                        t tVar13 = t.INSTANCE;
                        tUrlImageView2.setLayoutParams(layoutParams19);
                    }
                    tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01JoJxqm1TmF1GqpG9l_!!6000000002424-2-tps-21-34.png");
                    linearLayout4.addView(tUrlImageView2);
                    t tVar14 = t.INSTANCE;
                    viewGroup2.addView(linearLayout3);
                    t tVar15 = t.INSTANCE;
                    viewGroup.addView(view2);
                    t tVar16 = t.INSTANCE;
                    ?? frameLayout3 = new FrameLayout(viewGroup.getContext());
                    objectRef2.element = frameLayout3;
                    View view3 = (View) frameLayout3;
                    ViewGroup.LayoutParams layoutParams20 = view3.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams21 = layoutParams20 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams20 : null;
                    if (layoutParams21 != null) {
                        layoutParams21.gravity = 16;
                    } else {
                        FrameLayout.LayoutParams layoutParams22 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams22.gravity = 16;
                        t tVar17 = t.INSTANCE;
                        view3.setLayoutParams(layoutParams22);
                    }
                    ViewGroup viewGroup3 = (ViewGroup) frameLayout3;
                    View view4 = new View(frameLayout3.getContext());
                    ViewGroup.LayoutParams layoutParams23 = view4.getLayoutParams();
                    if (layoutParams23 instanceof ViewGroup.MarginLayoutParams) {
                        view4.setLayoutParams(layoutParams23);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams7 = new ViewGroup.MarginLayoutParams(-2, -2);
                        t tVar18 = t.INSTANCE;
                        view4.setLayoutParams(marginLayoutParams7);
                    }
                    ViewGroup.LayoutParams layoutParams24 = view4.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams25 = layoutParams24 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams24 : null;
                    if (layoutParams25 != null) {
                        booleanRef = booleanRef2;
                        layoutParams25.width = -1;
                        layoutParams25.height = o.d((Number) 1);
                        layoutParams25.gravity = 16;
                        if (booleanRef.element) {
                            layoutParams25.rightMargin = o.d((Number) 13);
                        } else {
                            layoutParams25.leftMargin = o.d((Number) 13);
                        }
                    } else {
                        FrameLayout.LayoutParams layoutParams26 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams26.width = -1;
                        layoutParams26.height = o.d((Number) 1);
                        layoutParams26.gravity = 16;
                        booleanRef = booleanRef2;
                        if (booleanRef.element) {
                            layoutParams26.rightMargin = o.d((Number) 13);
                        } else {
                            layoutParams26.leftMargin = o.d((Number) 13);
                        }
                        t tVar19 = t.INSTANCE;
                        view4.setLayoutParams(layoutParams26);
                    }
                    view4.setBackgroundColor(-1);
                    viewGroup3.addView(view4);
                    t tVar20 = t.INSTANCE;
                    FrameLayout frameLayout4 = new FrameLayout(viewGroup3.getContext());
                    FrameLayout frameLayout5 = frameLayout4;
                    ViewGroup.LayoutParams layoutParams27 = frameLayout5.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams28 = layoutParams27 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams27 : null;
                    if (layoutParams28 == null) {
                        FrameLayout.LayoutParams layoutParams29 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams29.gravity = 16 | (booleanRef.element ? 5 : 3);
                        t tVar21 = t.INSTANCE;
                        frameLayout5.setLayoutParams(layoutParams29);
                    } else {
                        layoutParams28.gravity = 16 | (booleanRef.element ? 5 : 3);
                    }
                    FrameLayout frameLayout6 = frameLayout4;
                    View view5 = new View(frameLayout4.getContext());
                    ViewGroup.LayoutParams layoutParams30 = view5.getLayoutParams();
                    if (layoutParams30 instanceof ViewGroup.MarginLayoutParams) {
                        view5.setLayoutParams(layoutParams30);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams8 = new ViewGroup.MarginLayoutParams(-2, -2);
                        t tVar22 = t.INSTANCE;
                        view5.setLayoutParams(marginLayoutParams8);
                    }
                    o.a(view5, true, o.d((Number) 13));
                    ViewGroup.LayoutParams layoutParams31 = view5.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams32 = layoutParams31 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams31 : null;
                    if (layoutParams32 != null) {
                        layoutParams32.width = o.d((Number) 26);
                        layoutParams32.height = o.d((Number) 26);
                    } else {
                        FrameLayout.LayoutParams layoutParams33 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams33.width = o.d((Number) 26);
                        layoutParams33.height = o.d((Number) 26);
                        t tVar23 = t.INSTANCE;
                        view5.setLayoutParams(layoutParams33);
                    }
                    view5.setBackgroundColor(o.a(0, 0.2f));
                    frameLayout6.addView(view5);
                    t tVar24 = t.INSTANCE;
                    View view6 = new View(frameLayout4.getContext());
                    ViewGroup.LayoutParams layoutParams34 = view6.getLayoutParams();
                    if (layoutParams34 instanceof ViewGroup.MarginLayoutParams) {
                        view6.setLayoutParams(layoutParams34);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams9 = new ViewGroup.MarginLayoutParams(-2, -2);
                        t tVar25 = t.INSTANCE;
                        view6.setLayoutParams(marginLayoutParams9);
                    }
                    o.a(view6, true, o.d((Number) 7));
                    ViewGroup.LayoutParams layoutParams35 = view6.getLayoutParams();
                    if (layoutParams35 instanceof FrameLayout.LayoutParams) {
                        layoutParams2 = (FrameLayout.LayoutParams) layoutParams35;
                    }
                    FrameLayout.LayoutParams layoutParams36 = layoutParams2;
                    if (layoutParams36 != null) {
                        layoutParams36.width = o.d((Number) 14);
                        layoutParams36.height = o.d((Number) 14);
                        layoutParams36.gravity = 17;
                    } else {
                        FrameLayout.LayoutParams layoutParams37 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams37.width = o.d((Number) 14);
                        layoutParams37.height = o.d((Number) 14);
                        layoutParams37.gravity = 17;
                        t tVar26 = t.INSTANCE;
                        view6.setLayoutParams(layoutParams37);
                    }
                    view6.setBackgroundColor(-1);
                    frameLayout6.addView(view6);
                    t tVar27 = t.INSTANCE;
                    viewGroup3.addView(frameLayout5);
                    t tVar28 = t.INSTANCE;
                    viewGroup.addView(view3);
                    t tVar29 = t.INSTANCE;
                    frameLayout.addView(view);
                    t tVar30 = t.INSTANCE;
                    z = true;
                }
                picPagerItemView = this;
                i3 = i;
            }
            t tVar31 = t.INSTANCE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class GraphicViewPager extends ViewPager {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean alreadyDetect;
        private float startX;
        private float startY;
        private double swipeThreshold;

        static {
            kge.a(1162089184);
        }

        public static /* synthetic */ Object ipc$super(GraphicViewPager graphicViewPager, String str, Object... objArr) {
            if (str.hashCode() == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GraphicViewPager(Context context) {
            super(context);
            q.d(context, "context");
            this.swipeThreshold = ViewConfiguration.get(context).getScaledTouchSlop() * 1.5d;
        }

        public final double getSwipeThreshold() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f169c3c", new Object[]{this})).doubleValue() : this.swipeThreshold;
        }

        public final void setSwipeThreshold(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2020d24", new Object[]{this, new Double(d)});
            } else {
                this.swipeThreshold = d;
            }
        }

        public final boolean getAlreadyDetect() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f13b2770", new Object[]{this})).booleanValue() : this.alreadyDetect;
        }

        public final void setAlreadyDetect(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd55faf4", new Object[]{this, new Boolean(z)});
            } else {
                this.alreadyDetect = z;
            }
        }

        public final float getStartX() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ff8f9a3", new Object[]{this})).floatValue() : this.startX;
        }

        public final void setStartX(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58c17e1", new Object[]{this, new Float(f)});
            } else {
                this.startX = f;
            }
        }

        public final float getStartY() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("90071124", new Object[]{this})).floatValue() : this.startY;
        }

        public final void setStartY(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("740f080", new Object[]{this, new Float(f)});
            } else {
                this.startY = f;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            if (motionEvent == null) {
                return false;
            }
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.startX = 0.0f;
                this.startY = 0.0f;
                this.alreadyDetect = false;
                RecyclerView findRecyclerView = findRecyclerView();
                if (findRecyclerView != null) {
                    findRecyclerView.requestDisallowInterceptTouchEvent(false);
                }
            }
            if (motionEvent.getAction() == 0) {
                this.startX = motionEvent.getX();
                this.startY = motionEvent.getY();
                RecyclerView findRecyclerView2 = findRecyclerView();
                if (findRecyclerView2 != null) {
                    findRecyclerView2.requestDisallowInterceptTouchEvent(true);
                }
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
            if (motionEvent.getAction() == 2 && !this.alreadyDetect) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float abs = Math.abs(this.startX - x);
                float abs2 = Math.abs(this.startY - y);
                double d = 2;
                if (((float) Math.sqrt(((float) Math.pow(abs, d)) + ((float) Math.pow(abs2, d)))) >= this.swipeThreshold) {
                    if (abs2 <= abs) {
                        RecyclerView findRecyclerView3 = findRecyclerView();
                        if (findRecyclerView3 != null) {
                            findRecyclerView3.requestDisallowInterceptTouchEvent(true);
                        }
                    } else {
                        RecyclerView findRecyclerView4 = findRecyclerView();
                        if (findRecyclerView4 != null) {
                            findRecyclerView4.requestDisallowInterceptTouchEvent(false);
                        }
                    }
                    this.alreadyDetect = true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        private final RecyclerView findRecyclerView() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("c84ffe60", new Object[]{this}) : o.l(this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShopLoftGraphicWebView extends ShopWrapWebView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private GraphicViewPager graphicViewPager;

        static {
            kge.a(-60423454);
        }

        public static /* synthetic */ Object ipc$super(ShopLoftGraphicWebView shopLoftGraphicWebView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -1253202540) {
                if (hashCode != 143825882) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            }
            return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShopLoftGraphicWebView(Context context) {
            super(context);
            q.d(context, "context");
        }

        public final GraphicViewPager getGraphicViewPager() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (GraphicViewPager) ipChange.ipc$dispatch("62103964", new Object[]{this}) : this.graphicViewPager;
        }

        public final void setGraphicViewPager(GraphicViewPager graphicViewPager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2e6bda2", new Object[]{this, graphicViewPager});
            } else {
                this.graphicViewPager = graphicViewPager;
            }
        }

        @Override // com.alibaba.triver.triver_shop.web.ShopBaseWebView, android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
        public boolean coreDispatchTouchEvent(MotionEvent event) {
            RecyclerView l;
            RecyclerView l2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, event})).booleanValue();
            }
            q.d(event, "event");
            if (o.a(event) && (l2 = o.l(this)) != null) {
                l2.requestDisallowInterceptTouchEvent(true);
            }
            if ((o.b(event) || o.c(event)) && (l = o.l(this)) != null) {
                l.requestDisallowInterceptTouchEvent(false);
            }
            return super.coreDispatchTouchEvent(event);
        }

        @Override // com.alibaba.triver.triver_shop.web.ShopBaseWebView, android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
        public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            RecyclerView l;
            RecyclerView l2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
            }
            if ((i3 == 0 && i < 0) || (i3 == i5 && i > 0)) {
                return false;
            }
            if (i4 == 0 && i2 <= 0 && (l2 = o.l(this)) != null) {
                l2.requestDisallowInterceptTouchEvent(false);
            }
            if (i4 == i6 && i2 > 0 && (l = o.l(this)) != null) {
                l.requestDisallowInterceptTouchEvent(false);
            }
            return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
    }

    /* loaded from: classes3.dex */
    public final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopLoftGraphicView f3738a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private int f;
        private final LinearLayout g;
        private final TextView h;
        private final ArrayList<View> i;
        private int j;

        static {
            kge.a(1762136568);
        }

        public a(ShopLoftGraphicView this$0) {
            q.d(this$0, "this$0");
            this.f3738a = this$0;
            this.b = o.a(Double.valueOf(2.5d));
            this.c = o.a(Double.valueOf(1.5d));
            this.d = Color.parseColor("#4cFFFFFF");
            this.e = Color.parseColor("#ffffff");
            JSONArray c = ShopLoftGraphicView.c(this.f3738a);
            if (c == null) {
                q.b("picList");
                throw null;
            }
            this.f = c.size();
            LinearLayout linearLayout = new LinearLayout(this.f3738a.p());
            linearLayout.setClickable(false);
            t tVar = t.INSTANCE;
            this.g = linearLayout;
            TextView textView = new TextView(this.f3738a.p());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(o.a((Number) 12));
            gradientDrawable.setColor(Color.parseColor("#2a242424"));
            o.a(textView, gradientDrawable);
            textView.setTextColor(Color.parseColor("#f9f9f9"));
            textView.setTextSize(1, 13.5f);
            textView.setGravity(17);
            t tVar2 = t.INSTANCE;
            this.h = textView;
            this.i = new ArrayList<>();
            int i = this.f;
            if (i > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, this.c, 1.0f);
                    View view = new View(this.g.getContext());
                    view.setLayoutParams(layoutParams);
                    o.e(view, this.b);
                    o.f(view, this.b);
                    view.setClickable(false);
                    if (i2 == 0) {
                        view.setBackgroundColor(this.e);
                    } else {
                        view.setBackgroundColor(this.d);
                    }
                    this.i.add(view);
                    this.g.addView(view);
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            if (this.f == 1) {
                o.e(this.g);
            }
            a(0);
        }

        public final LinearLayout a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("660331bf", new Object[]{this}) : this.g;
        }

        public final TextView b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("f7e0415d", new Object[]{this}) : this.h;
        }

        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            Iterator<View> it = this.i.iterator();
            while (it.hasNext()) {
                it.next().setBackgroundColor(this.d);
            }
            if (i >= this.i.size()) {
                return;
            }
            this.i.get(i).setBackgroundColor(this.e);
            this.j = i;
            c();
        }

        private final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (this.i.size() == 1) {
                o.e(this.h);
            } else {
                o.b(this.h);
                StringBuilder sb = new StringBuilder();
                sb.append(this.j + 1);
                sb.append(fxb.DIR);
                sb.append(this.f);
                this.h.setText(sb.toString());
            }
        }
    }
}
