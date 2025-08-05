package com.taobao.detail.rate.v2;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.litecreator.util.ap;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.litecreator.util.u;
import com.taobao.ask.ASK_CONST;
import com.taobao.detail.rate.RateDisplayApplication;
import com.taobao.detail.rate.v2.PreviewItemV2;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.ui.component.WXBasicComponentType;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.fxb;
import tb.mxf;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0012\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010%\u001a\u00020\u0018H\u0016J\b\u0010&\u001a\u00020\u0018H\u0016J\b\u0010'\u001a\u00020\u0018H\u0016J\u000e\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/taobao/detail/rate/v2/RateViewPagerFragmentV2;", "Landroid/support/v4/app/DialogFragment;", "Lcom/taobao/detail/rate/v2/RateViewPerformanceTrackerV2$TrackerHolder;", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "adapter", "Lcom/taobao/detail/rate/v2/CommonPageAdapterV2;", "commentIcon", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", WXBasicComponentType.INDICATOR, "Landroid/widget/TextView;", "likeIcon", "perfTracker", "Lcom/taobao/detail/rate/v2/RateViewPerformanceTrackerV2;", "rootView", "Landroid/view/ViewGroup;", "skuInfo", "userComment", "userNick", "viewPagerContainer", "Landroid/support/v4/view/ViewPager;", "getTracker", "initData", "", mxf.initView, "initViewPager", ASK_CONST.KEY_IS_IMMERSIVE, "", i.b.MEASURE_ONCREATE, "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", MessageID.onDestroy, "onResume", "onStart", "updateCurrItem", "position", "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class RateViewPagerFragmentV2 extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG = "RateViewPagerFragmentV2";
    private com.taobao.detail.rate.v2.a adapter;
    private TUrlImageView commentIcon;
    private TextView indicator;
    private TUrlImageView likeIcon;
    private f perfTracker;
    private ViewGroup rootView;
    private TextView skuInfo;
    private TextView userComment;
    private TextView userNick;
    private ViewPager viewPagerContainer;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RateViewPagerFragmentV2.this.dismiss();
            }
        }
    }

    private final void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
        }
    }

    public static /* synthetic */ Object ipc$super(RateViewPagerFragmentV2 rateViewPagerFragmentV2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        u.b(this.TAG, "onCreate.start");
        super.onCreate(bundle);
        this.perfTracker = new f();
        f fVar = this.perfTracker;
        if (fVar != null) {
            fVar.a(getArguments());
        }
        setStyle(1, R.style.Animation_AppCompat_Dialog);
        f fVar2 = this.perfTracker;
        if (fVar2 != null) {
            fVar2.a();
        }
        u.b(this.TAG, "onCreate.end");
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, inflater, viewGroup, bundle});
        }
        q.d(inflater, "inflater");
        u.b(this.TAG, "onCreateView.start");
        this.rootView = (ViewGroup) inflater.inflate(R.layout.rate_picpreview_pager_layout_v2, viewGroup, false);
        ViewGroup viewGroup2 = this.rootView;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundColor(-16777216);
        }
        initData();
        initView();
        u.b(this.TAG, "onCreateView.end");
        return this.rootView;
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        f fVar = this.perfTracker;
        if (fVar == null) {
            return;
        }
        fVar.b();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        Dialog dialog = getDialog();
        q.b(dialog, "dialog");
        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.dimAmount = 0.2f;
        }
        if (attributes != null) {
            attributes.width = -1;
        }
        if (attributes != null) {
            attributes.height = -1;
        }
        if (window != null) {
            window.setAttributes(attributes);
        }
        if (window != null) {
            window.setNavigationBarColor(-16777216);
        }
        if (window != null) {
            window.clearFlags(67108864);
        }
        if (window != null) {
            window.setStatusBarColor(0);
        }
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(1280);
    }

    private final void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.rootView;
        View view = null;
        ViewStub viewStub = (ViewStub) (viewGroup != null ? viewGroup.findViewById(R.id.view_stub_header_view_v2) : null);
        View inflate = viewStub != null ? viewStub.inflate() : null;
        ViewGroup viewGroup2 = this.rootView;
        ViewStub viewStub2 = (ViewStub) (viewGroup2 != null ? viewGroup2.findViewById(R.id.view_stub_right_view_v2) : null);
        View inflate2 = viewStub2 != null ? viewStub2.inflate() : null;
        ViewGroup viewGroup3 = this.rootView;
        ViewStub viewStub3 = (ViewStub) (viewGroup3 != null ? viewGroup3.findViewById(R.id.view_stub_footer_view_v2) : null);
        View inflate3 = viewStub3 != null ? viewStub3.inflate() : null;
        if (inflate2 != null) {
            inflate2.setVisibility(8);
        }
        int d = isImmersive() ? ap.d((Context) getActivity()) : 0;
        int e = ap.e(getActivity());
        if (inflate != null) {
            inflate.setPadding(0, d, 0, 0);
        }
        if (inflate3 != null) {
            inflate3.setPadding(0, 0, 0, e);
        }
        ViewGroup viewGroup4 = this.rootView;
        this.indicator = (TextView) (viewGroup4 != null ? viewGroup4.findViewById(R.id.rate_indicator_textView) : null);
        ViewGroup viewGroup5 = this.rootView;
        this.likeIcon = (TUrlImageView) (viewGroup5 != null ? viewGroup5.findViewById(R.id.rate_like_icon) : null);
        ViewGroup viewGroup6 = this.rootView;
        this.commentIcon = (TUrlImageView) (viewGroup6 != null ? viewGroup6.findViewById(R.id.rate_comment_icon) : null);
        ViewGroup viewGroup7 = this.rootView;
        this.userNick = (TextView) (viewGroup7 != null ? viewGroup7.findViewById(R.id.tv_user_nick) : null);
        ViewGroup viewGroup8 = this.rootView;
        this.skuInfo = (TextView) (viewGroup8 != null ? viewGroup8.findViewById(R.id.tv_sku) : null);
        ViewGroup viewGroup9 = this.rootView;
        this.userComment = (TextView) (viewGroup9 != null ? viewGroup9.findViewById(R.id.tv_comment) : null);
        ViewGroup viewGroup10 = this.rootView;
        if (viewGroup10 != null) {
            view = viewGroup10.findViewById(R.id.rate_back);
        }
        if (view != null) {
            view.setOnClickListener(new a());
        }
        TUrlImageView tUrlImageView = this.likeIcon;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01wSqHIT24f2aw1VtsP_!!6000000007417-2-tps-128-128.png");
        }
        TUrlImageView tUrlImageView2 = this.commentIcon;
        if (tUrlImageView2 != null) {
            tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01u1VjDv1wnjBIAxDCp_!!6000000006353-2-tps-128-128.png");
        }
        initViewPager();
    }

    private final void initViewPager() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77226e75", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        View view = null;
        JSONObject jSONObject = RateDisplayApplication.previewDataMap.get(arguments != null ? arguments.getString("tagId") : null);
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null && (jSONArray = jSONObject.getJSONArray("list")) != null) {
            for (Object obj : jSONArray) {
                if (!(obj instanceof JSON)) {
                    obj = null;
                }
                Object javaObject = JSON.toJavaObject((JSON) obj, PreviewItemV2.class);
                q.b(javaObject, "JSON.toJavaObject(it as?…reviewItemV2::class.java)");
                arrayList.add(javaObject);
            }
        }
        int a2 = m.a(jSONObject, "index", 0);
        this.adapter = new com.taobao.detail.rate.v2.a(getActivity());
        com.taobao.detail.rate.v2.a aVar = this.adapter;
        if (aVar != null) {
            aVar.a(arrayList);
        }
        com.taobao.detail.rate.v2.a aVar2 = this.adapter;
        if (aVar2 != null) {
            aVar2.a(this.perfTracker);
        }
        com.taobao.detail.rate.v2.a aVar3 = this.adapter;
        if (aVar3 != null) {
            aVar3.a(a2);
        }
        ViewGroup viewGroup = this.rootView;
        if (viewGroup != null) {
            view = viewGroup.findViewById(R.id.rate_pic_pager);
        }
        this.viewPagerContainer = (ViewPager) view;
        ViewPager viewPager = this.viewPagerContainer;
        if (viewPager != null) {
            viewPager.setAdapter(this.adapter);
        }
        ViewPager viewPager2 = this.viewPagerContainer;
        if (viewPager2 != null) {
            viewPager2.addOnPageChangeListener(new b());
        }
        ViewPager viewPager3 = this.viewPagerContainer;
        if (viewPager3 != null) {
            viewPager3.setCurrentItem(a2);
        }
        updateCurrItem(a2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/taobao/detail/rate/v2/RateViewPagerFragmentV2$initViewPager$1", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class b implements ViewPager.OnPageChangeListener {
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

        public b() {
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            } else {
                RateViewPagerFragmentV2.this.updateCurrItem(i);
            }
        }
    }

    public final void updateCurrItem(int i) {
        PreviewItemV2.UserInfo userInfo;
        PreviewItemV2.UserInfo userInfo2;
        List<PreviewItemV2> a2;
        List<PreviewItemV2> a3;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9426fce", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.detail.rate.v2.a aVar = this.adapter;
        int size = (aVar == null || (a3 = aVar.a()) == null) ? 0 : a3.size();
        if (i < 0 || i >= size) {
            return;
        }
        com.taobao.detail.rate.v2.a aVar2 = this.adapter;
        String str = null;
        PreviewItemV2 previewItemV2 = (aVar2 == null || (a2 = aVar2.a()) == null) ? null : a2.get(i);
        TextView textView = this.userNick;
        if (textView != null) {
            textView.setText((previewItemV2 == null || (userInfo2 = previewItemV2.getUserInfo()) == null) ? null : userInfo2.getNick());
        }
        TextView textView2 = this.skuInfo;
        if (textView2 != null) {
            textView2.setText(String.valueOf(previewItemV2 != null ? previewItemV2.getSkuMap() : null));
        }
        TextView textView3 = this.userComment;
        if (textView3 != null) {
            textView3.setText(previewItemV2 != null ? previewItemV2.getContent() : null);
        }
        TextView textView4 = this.userNick;
        if (textView4 != null) {
            String nick = (previewItemV2 == null || (userInfo = previewItemV2.getUserInfo()) == null) ? null : userInfo.getNick();
            textView4.setVisibility(nick == null || nick.length() == 0 ? 8 : 0);
        }
        TextView textView5 = this.skuInfo;
        if (textView5 != null) {
            Map<String, String> skuMap = previewItemV2 != null ? previewItemV2.getSkuMap() : null;
            textView5.setVisibility(skuMap == null || skuMap.isEmpty() ? 8 : 0);
        }
        TextView textView6 = this.userComment;
        if (textView6 != null) {
            if (previewItemV2 != null) {
                str = previewItemV2.getContent();
            }
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                i2 = 8;
            }
            textView6.setVisibility(i2);
        }
        TextView textView7 = this.indicator;
        if (textView7 == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i + 1);
        sb.append(fxb.DIR);
        sb.append(size);
        textView7.setText(sb.toString());
    }

    public final boolean isImmersive() {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            View decorView = window.getDecorView();
            q.b(decorView, "window.decorView");
            if ((decorView.getSystemUiVisibility() & 1024) == 1024) {
                View decorView2 = window.getDecorView();
                q.b(decorView2, "window.decorView");
                if ((decorView2.getSystemUiVisibility() & 256) == 256) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    public f getTracker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("daf65fc3", new Object[]{this}) : this.perfTracker;
    }
}
