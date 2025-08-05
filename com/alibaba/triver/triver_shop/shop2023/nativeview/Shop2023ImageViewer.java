package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.MiniVideoLoftView;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.fxb;
import tb.kge;

/* loaded from: classes3.dex */
public final class Shop2023ImageViewer extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View curItemView;
    private int firstIndex;
    private ViewGroup root;
    private com.alibaba.triver.triver_shop.newShop.data.d shopData;
    private TextView tvPage;
    private ViewPager viewPager;
    private int curIndex = -1;
    private List<a> urlList = new ArrayList();

    /* loaded from: classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                Shop2023ImageViewer.this.dismiss();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ViewGroup access$getRoot$p = Shop2023ImageViewer.access$getRoot$p(Shop2023ImageViewer.this);
            if (access$getRoot$p == null) {
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            access$getRoot$p.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    static {
        kge.a(-839410665);
    }

    public static /* synthetic */ Object ipc$super(Shop2023ImageViewer shop2023ImageViewer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 2089880052) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDismiss((DialogInterface) objArr[0]);
            return null;
        }
    }

    public static final /* synthetic */ int access$getCurIndex$p(Shop2023ImageViewer shop2023ImageViewer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d205af26", new Object[]{shop2023ImageViewer})).intValue() : shop2023ImageViewer.curIndex;
    }

    public static final /* synthetic */ View access$getCurItemView$p(Shop2023ImageViewer shop2023ImageViewer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("865a88cf", new Object[]{shop2023ImageViewer}) : shop2023ImageViewer.curItemView;
    }

    public static final /* synthetic */ ViewGroup access$getRoot$p(Shop2023ImageViewer shop2023ImageViewer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("2ce73a12", new Object[]{shop2023ImageViewer}) : shop2023ImageViewer.root;
    }

    public static final /* synthetic */ TextView access$getTvPage$p(Shop2023ImageViewer shop2023ImageViewer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("620c9aa6", new Object[]{shop2023ImageViewer}) : shop2023ImageViewer.tvPage;
    }

    public static final /* synthetic */ List access$getUrlList$p(Shop2023ImageViewer shop2023ImageViewer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7748bc05", new Object[]{shop2023ImageViewer}) : shop2023ImageViewer.urlList;
    }

    public static final /* synthetic */ void access$setCurIndex$p(Shop2023ImageViewer shop2023ImageViewer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaefa4", new Object[]{shop2023ImageViewer, new Integer(i)});
        } else {
            shop2023ImageViewer.curIndex = i;
        }
    }

    public static final /* synthetic */ void access$setCurItemView$p(Shop2023ImageViewer shop2023ImageViewer, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3c44f1", new Object[]{shop2023ImageViewer, view});
        } else {
            shop2023ImageViewer.curItemView = view;
        }
    }

    public static final /* synthetic */ void access$utNativeShopExpose(Shop2023ImageViewer shop2023ImageViewer, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3478923", new Object[]{shop2023ImageViewer, str, str2});
        } else {
            shop2023ImageViewer.utNativeShopExpose(str, str2);
        }
    }

    public final Shop2023ImageViewer setShopData(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shop2023ImageViewer) ipChange.ipc$dispatch("3032dfd6", new Object[]{this, dVar});
        }
        this.shopData = dVar;
        return this;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f4077a;
        private final String b;

        static {
            kge.a(-820666258);
        }

        public a(String type, String url) {
            q.d(type, "type");
            q.d(url, "url");
            this.f4077a = type;
            this.b = url;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f4077a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        parseData();
        initView();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new e());
        ofFloat.start();
        ViewGroup viewGroup2 = this.root;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(0.0f);
        }
        return this.root;
    }

    private final void parseData() {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be2ab04", new Object[]{this});
            return;
        }
        JSONObject parseObject = JSON.parseObject(getArguments().getString("data"));
        if (parseObject != null && (jSONObject2 = parseObject.getJSONObject("browserData")) != null) {
            i = jSONObject2.getIntValue("activeIndex");
        }
        this.firstIndex = i;
        if (parseObject != null && (jSONObject = parseObject.getJSONObject("browserData")) != null && (jSONArray = jSONObject.getJSONArray("contentList")) != null) {
            for (Object obj : jSONArray) {
                if (obj != null) {
                    JSONObject jSONObject3 = (JSONObject) obj;
                    String type = jSONObject3.getString("type");
                    List<a> list = this.urlList;
                    q.b(type, "type");
                    String string = jSONObject3.getString("url");
                    q.b(string, "item.getString(\"url\")");
                    list.add(new a(type, string));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
            }
        }
        a aVar = this.urlList.get(this.firstIndex);
        utNativeShopClick(aVar.a(), aVar.b());
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.ShopFullScreenDialogTheme);
    }

    public final void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(-16777216);
        FrameLayout frameLayout2 = frameLayout;
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            frameLayout2.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = -1;
            t tVar = t.INSTANCE;
            frameLayout2.setLayoutParams(marginLayoutParams2);
        }
        FrameLayout frameLayout3 = frameLayout;
        this.root = frameLayout3;
        ViewPager viewPager = new ViewPager(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams2 = viewPager.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            viewPager.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar2 = t.INSTANCE;
            viewPager.setLayoutParams(marginLayoutParams3);
        }
        ViewPager viewPager2 = viewPager;
        this.viewPager = viewPager2;
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.setAdapter(new b(this));
        frameLayout3.addView(viewPager);
        TUrlImageView tUrlImageView = new TUrlImageView(frameLayout3.getContext());
        TUrlImageView tUrlImageView2 = tUrlImageView;
        ViewGroup.LayoutParams layoutParams3 = tUrlImageView2.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView2.setLayoutParams(layoutParams3);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar3 = t.INSTANCE;
            tUrlImageView2.setLayoutParams(marginLayoutParams4);
        }
        ViewGroup.LayoutParams layoutParams4 = tUrlImageView2.getLayoutParams();
        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams5.width = o.d((Number) 66);
            marginLayoutParams5.height = o.d((Number) 66);
            Context context = tUrlImageView.getContext();
            q.b(context, "context");
            marginLayoutParams5.topMargin = o.a(context);
            tUrlImageView2.setLayoutParams(layoutParams4);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams6 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams6.width = o.d((Number) 66);
            marginLayoutParams6.height = o.d((Number) 66);
            Context context2 = tUrlImageView.getContext();
            q.b(context2, "context");
            marginLayoutParams6.topMargin = o.a(context2);
            t tVar4 = t.INSTANCE;
            tUrlImageView2.setLayoutParams(marginLayoutParams6);
        }
        int d2 = o.d((Number) 6);
        tUrlImageView.setPadding(d2, d2, d2, d2);
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01veFzJg1GGYWcBCdcm_!!6000000000595-2-tps-108-108.png");
        tUrlImageView.setOnClickListener(new c());
        frameLayout3.addView(tUrlImageView2);
        TextView textView = new TextView(frameLayout3.getContext());
        TextView textView2 = textView;
        ViewGroup.LayoutParams layoutParams5 = textView2.getLayoutParams();
        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
            textView2.setLayoutParams(layoutParams5);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams7 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar5 = t.INSTANCE;
            textView2.setLayoutParams(marginLayoutParams7);
        }
        this.tvPage = textView;
        ViewGroup.LayoutParams layoutParams6 = textView2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams7 = layoutParams6 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams6 : null;
        if (layoutParams7 != null) {
            layoutParams7.gravity = 5;
            layoutParams7.topMargin = o.d(Integer.valueOf((int) SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR));
            layoutParams7.rightMargin = o.d((Number) 24);
        } else {
            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams8.gravity = 5;
            layoutParams8.topMargin = o.d(Integer.valueOf((int) SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR));
            layoutParams8.rightMargin = o.d((Number) 24);
            t tVar6 = t.INSTANCE;
            textView2.setLayoutParams(layoutParams8);
        }
        textView.setTextColor(-1);
        o.a(textView, o.d((Number) 26));
        StringBuilder sb = new StringBuilder();
        sb.append(this.firstIndex + 1);
        sb.append(fxb.DIR);
        sb.append(this.urlList.size());
        textView.setText(sb.toString());
        frameLayout3.addView(textView2);
        ViewPager viewPager3 = this.viewPager;
        if (viewPager3 != null) {
            viewPager3.addOnPageChangeListener(new d());
        }
        ViewPager viewPager4 = this.viewPager;
        if (viewPager4 == null) {
            return;
        }
        viewPager4.setCurrentItem(this.firstIndex);
    }

    /* loaded from: classes3.dex */
    public static final class d implements ViewPager.OnPageChangeListener {
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

        public d() {
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            TextView access$getTvPage$p = Shop2023ImageViewer.access$getTvPage$p(Shop2023ImageViewer.this);
            if (access$getTvPage$p == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i + 1);
            sb.append(fxb.DIR);
            sb.append(Shop2023ImageViewer.access$getUrlList$p(Shop2023ImageViewer.this).size());
            access$getTvPage$p.setText(sb.toString());
        }
    }

    /* loaded from: classes3.dex */
    public final class b extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Shop2023ImageViewer f4078a;

        static {
            kge.a(-307402858);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -2093417530) {
                super.setPrimaryItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public b(Shop2023ImageViewer this$0) {
            q.d(this$0, "this$0");
            this.f4078a = this$0;
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : Shop2023ImageViewer.access$getUrlList$p(this.f4078a).size();
        }

        @Override // android.support.v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : q.a(view, obj);
        }

        @Override // android.support.v4.view.PagerAdapter
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            super.setPrimaryItem(viewGroup, i, obj);
            if (Shop2023ImageViewer.access$getCurIndex$p(this.f4078a) == i) {
                return;
            }
            View access$getCurItemView$p = Shop2023ImageViewer.access$getCurItemView$p(this.f4078a);
            Object obj2 = null;
            if ((access$getCurItemView$p == null ? null : access$getCurItemView$p.getTag()) instanceof MiniVideoLoftView) {
                View access$getCurItemView$p2 = Shop2023ImageViewer.access$getCurItemView$p(this.f4078a);
                Object tag = access$getCurItemView$p2 == null ? null : access$getCurItemView$p2.getTag();
                if (tag == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.MiniVideoLoftView");
                }
                ((MiniVideoLoftView) tag).pause();
            }
            Shop2023ImageViewer.access$setCurIndex$p(this.f4078a, i);
            Shop2023ImageViewer.access$setCurItemView$p(this.f4078a, obj instanceof View ? (View) obj : null);
            View access$getCurItemView$p3 = Shop2023ImageViewer.access$getCurItemView$p(this.f4078a);
            if ((access$getCurItemView$p3 == null ? null : access$getCurItemView$p3.getTag()) instanceof MiniVideoLoftView) {
                View access$getCurItemView$p4 = Shop2023ImageViewer.access$getCurItemView$p(this.f4078a);
                if (access$getCurItemView$p4 != null) {
                    obj2 = access$getCurItemView$p4.getTag();
                }
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.MiniVideoLoftView");
                }
                ((MiniVideoLoftView) obj2).play();
            }
            a aVar = (a) Shop2023ImageViewer.access$getUrlList$p(this.f4078a).get(i);
            Shop2023ImageViewer.access$utNativeShopExpose(this.f4078a, aVar.a(), aVar.b());
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup container, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, container, new Integer(i)});
            }
            q.d(container, "container");
            Shop2023ImageViewer shop2023ImageViewer = this.f4078a;
            Context context = container.getContext();
            q.b(context, "container.context");
            ItemView itemView = new ItemView(shop2023ImageViewer, context, (a) Shop2023ImageViewer.access$getUrlList$p(this.f4078a).get(i));
            ItemView itemView2 = itemView;
            ViewGroup.LayoutParams layoutParams = itemView2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
                itemView2.setLayoutParams(layoutParams);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams2.width = -1;
                marginLayoutParams2.height = -1;
                t tVar = t.INSTANCE;
                itemView2.setLayoutParams(marginLayoutParams2);
            }
            container.addView(itemView2);
            return itemView;
        }

        @Override // android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup container, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, container, new Integer(i), obj});
                return;
            }
            q.d(container, "container");
            if (obj != null) {
                View view = (View) obj;
                container.removeView(view);
                if (!(view.getTag() instanceof MiniVideoLoftView)) {
                    return;
                }
                Object tag = view.getTag();
                if (tag == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.MiniVideoLoftView");
                }
                ((MiniVideoLoftView) tag).onDestroyed();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* loaded from: classes3.dex */
    public final class ItemView extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ImageView ivImage;
        private TUrlImageView ivPlay;
        private ProgressBar progressBar;
        public final /* synthetic */ Shop2023ImageViewer this$0;

        /* loaded from: classes3.dex */
        public static final class a implements b.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.alibaba.triver.triver_shop.container.shopLoft.b.c
            public void a(String str, JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
                } else if (q.a((Object) str, (Object) "onPause")) {
                    TUrlImageView access$getIvPlay$p = ItemView.access$getIvPlay$p(ItemView.this);
                    if (access$getIvPlay$p != null) {
                        o.b(access$getIvPlay$p);
                    } else {
                        q.b("ivPlay");
                        throw null;
                    }
                } else if (!q.a((Object) str, (Object) "onPlay")) {
                } else {
                    TUrlImageView access$getIvPlay$p2 = ItemView.access$getIvPlay$p(ItemView.this);
                    if (access$getIvPlay$p2 == null) {
                        q.b("ivPlay");
                        throw null;
                    }
                    o.d(access$getIvPlay$p2);
                    ProgressBar access$getProgressBar$p = ItemView.access$getProgressBar$p(ItemView.this);
                    if (access$getProgressBar$p != null) {
                        o.d(access$getProgressBar$p);
                    } else {
                        q.b("progressBar");
                        throw null;
                    }
                }
            }
        }

        /* loaded from: classes3.dex */
        public static final class b implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MiniVideoLoftView f4075a;

            public b(MiniVideoLoftView miniVideoLoftView) {
                this.f4075a = miniVideoLoftView;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    this.f4075a.pause();
                }
            }
        }

        /* loaded from: classes3.dex */
        public static final class c implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MiniVideoLoftView f4076a;

            public c(MiniVideoLoftView miniVideoLoftView) {
                this.f4076a = miniVideoLoftView;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    this.f4076a.play();
                }
            }
        }

        static {
            kge.a(-820283803);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemView(Shop2023ImageViewer this$0, Context context, a info) {
            super(context);
            q.d(this$0, "this$0");
            q.d(context, "context");
            q.d(info, "info");
            this.this$0 = this$0;
            ItemView itemView = this;
            String b2 = info.b();
            if (q.a((Object) info.a(), (Object) "image")) {
                ItemView itemView2 = itemView;
                ShopGestureImageView shopGestureImageView = new ShopGestureImageView(context);
                ViewGroup.LayoutParams layoutParams = shopGestureImageView.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    shopGestureImageView.setLayoutParams(layoutParams);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    t tVar = t.INSTANCE;
                    shopGestureImageView.setLayoutParams(marginLayoutParams);
                }
                ShopGestureImageView shopGestureImageView2 = shopGestureImageView;
                ShopGestureImageView shopGestureImageView3 = shopGestureImageView2;
                itemView.setIvImage(shopGestureImageView3);
                ShopGestureImageView shopGestureImageView4 = shopGestureImageView2;
                ViewGroup.LayoutParams layoutParams2 = shopGestureImageView4.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.width = -1;
                    marginLayoutParams2.height = -1;
                    shopGestureImageView4.setLayoutParams(layoutParams2);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams3.width = -1;
                    marginLayoutParams3.height = -1;
                    t tVar2 = t.INSTANCE;
                    shopGestureImageView4.setLayoutParams(marginLayoutParams3);
                }
                o.a(shopGestureImageView3, b2);
                itemView2.addView(shopGestureImageView);
                return;
            }
            itemView.addPlayer(itemView, b2);
        }

        public static final /* synthetic */ TUrlImageView access$getIvPlay$p(ItemView itemView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("48d8680a", new Object[]{itemView}) : itemView.ivPlay;
        }

        public static final /* synthetic */ ProgressBar access$getProgressBar$p(ItemView itemView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ProgressBar) ipChange.ipc$dispatch("613aabd1", new Object[]{itemView}) : itemView.progressBar;
        }

        public final ImageView getIvImage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageView) ipChange.ipc$dispatch("fe9d57f1", new Object[]{this});
            }
            ImageView imageView = this.ivImage;
            if (imageView != null) {
                return imageView;
            }
            q.b("ivImage");
            throw null;
        }

        public final void setIvImage(ImageView imageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("655b09ed", new Object[]{this, imageView});
                return;
            }
            q.d(imageView, "<set-?>");
            this.ivImage = imageView;
        }

        private final void addPlayer(ItemView itemView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("227f28fd", new Object[]{this, itemView, str});
                return;
            }
            MiniVideoLoftView miniVideoLoftView = new MiniVideoLoftView();
            miniVideoLoftView.setAspectRatio(MediaAspectRatio.DW_FIT_CENTER);
            FrameLayout.LayoutParams layoutParams = null;
            miniVideoLoftView.initWithData(itemView.getContext(), com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("videoUrl", str)), new a(), null);
            ItemView itemView2 = itemView;
            View view = miniVideoLoftView.getView();
            q.a(view);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                view.setLayoutParams(layoutParams2);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                t tVar = t.INSTANCE;
                view.setLayoutParams(marginLayoutParams);
            }
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.width = -1;
                layoutParams4.height = -2;
                layoutParams4.gravity = 17;
            } else {
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.width = -1;
                layoutParams5.height = -2;
                layoutParams5.gravity = 17;
                t tVar2 = t.INSTANCE;
                view.setLayoutParams(layoutParams5);
            }
            view.setOnClickListener(new b(miniVideoLoftView));
            itemView2.addView(view);
            TUrlImageView tUrlImageView = new TUrlImageView(itemView2.getContext());
            TUrlImageView tUrlImageView2 = tUrlImageView;
            ViewGroup.LayoutParams layoutParams6 = tUrlImageView2.getLayoutParams();
            if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                tUrlImageView2.setLayoutParams(layoutParams6);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                t tVar3 = t.INSTANCE;
                tUrlImageView2.setLayoutParams(marginLayoutParams2);
            }
            this.ivPlay = tUrlImageView;
            o.d(tUrlImageView2);
            ViewGroup.LayoutParams layoutParams7 = tUrlImageView2.getLayoutParams();
            FrameLayout.LayoutParams layoutParams8 = layoutParams7 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams7 : null;
            if (layoutParams8 != null) {
                layoutParams8.width = o.d((Number) 100);
                layoutParams8.height = o.d((Number) 100);
                layoutParams8.gravity = 17;
            } else {
                FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams9.width = o.d((Number) 100);
                layoutParams9.height = o.d((Number) 100);
                layoutParams9.gravity = 17;
                t tVar4 = t.INSTANCE;
                tUrlImageView2.setLayoutParams(layoutParams9);
            }
            tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01uhGFKU1RNOH8xQCj6_!!6000000002099-2-tps-400-400.png");
            tUrlImageView.setOnClickListener(new c(miniVideoLoftView));
            itemView2.addView(tUrlImageView2);
            ProgressBar progressBar = new ProgressBar(itemView.getContext());
            ViewGroup.LayoutParams layoutParams10 = progressBar.getLayoutParams();
            if (layoutParams10 instanceof ViewGroup.MarginLayoutParams) {
                progressBar.setLayoutParams(layoutParams10);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
                t tVar5 = t.INSTANCE;
                progressBar.setLayoutParams(marginLayoutParams3);
            }
            ProgressBar progressBar2 = progressBar;
            this.progressBar = progressBar2;
            ProgressBar progressBar3 = progressBar2;
            ViewGroup.LayoutParams layoutParams11 = progressBar3.getLayoutParams();
            if (layoutParams11 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams11;
            }
            if (layoutParams != null) {
                layoutParams.width = o.d((Number) 50);
                layoutParams.height = o.d((Number) 50);
                layoutParams.gravity = 17;
            } else {
                FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams12.width = o.d((Number) 50);
                layoutParams12.height = o.d((Number) 50);
                layoutParams12.gravity = 17;
                t tVar6 = t.INSTANCE;
                progressBar3.setLayoutParams(layoutParams12);
            }
            progressBar2.setIndeterminateTintList(ColorStateList.valueOf(-5592406));
            itemView2.addView(progressBar);
            itemView.setTag(miniVideoLoftView);
            miniVideoLoftView.mute(false);
            miniVideoLoftView.prepareToFirstFrame();
        }
    }

    public final void show(Context context, String data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa33c00e", new Object[]{this, context, data});
            return;
        }
        q.d(context, "context");
        q.d(data, "data");
        Bundle bundle = new Bundle();
        bundle.putString("data", data);
        setArguments(bundle);
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null) {
            return;
        }
        show(fragmentActivity.getSupportFragmentManager(), "");
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        super.onDismiss(dialogInterface);
        View view = this.curItemView;
        Object obj = null;
        if (!((view == null ? null : view.getTag()) instanceof MiniVideoLoftView)) {
            return;
        }
        View view2 = this.curItemView;
        if (view2 != null) {
            obj = view2.getTag();
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.MiniVideoLoftView");
        }
        ((MiniVideoLoftView) obj).onDestroyed();
    }

    private final void utNativeShopClick(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3566b57", new Object[]{this, str, str2});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.m.a(ShopConstants.PAGE_SHOP, "Page_Shop_Os_Heidengye_click", getUtParams(str, str2));
        }
    }

    private final void utNativeShopExpose(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f82cab", new Object[]{this, str, str2});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.m.b(ShopConstants.PAGE_SHOP, "Page_Shop_Os_Heidengye_exp", getUtParams(str, str2));
        }
    }

    private final HashMap<String, String> getUtParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("6b54a579", new Object[]{this, str, str2});
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.shopData;
        if (dVar != null) {
            HashMap<String, String> J = dVar.J();
            HashMap<String, String> hashMap = J;
            hashMap.put("shop_id", dVar.T());
            hashMap.put("seller_id", dVar.U());
            hashMap.put("btn_type", str);
            hashMap.put("return", str2);
            return J;
        }
        return new HashMap<>();
    }
}
