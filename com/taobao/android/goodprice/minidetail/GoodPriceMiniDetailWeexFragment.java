package com.taobao.android.goodprice.minidetail;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.f;
import com.taobao.browser.utils.i;
import com.taobao.monitor.procedure.v;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.TBMainBaseFragment;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class GoodPriceMiniDetailWeexFragment extends TBMainBaseFragment implements ISupportFragment, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.android.goodprice.minidetail.GoodPriceMiniDetailWeexFragment.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!"popGoodPricePage".equals(intent.getAction())) {
            } else {
                GoodPriceMiniDetailWeexFragment.this.onBackPressedSupport();
            }
        }
    };
    private TBErrorView errorView;
    private a goodPriceWeexInstance;
    private FrameLayout mWeexContainer;
    private String originUrl;
    private String realUrl;
    private ImageView skeletonImg;

    static {
        kge.a(1272552084);
        kge.a(1028243835);
        kge.a(-691403570);
    }

    public static /* synthetic */ Object ipc$super(GoodPriceMiniDetailWeexFragment goodPriceMiniDetailWeexFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1542694236:
                super.onSupportInvisible();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126882532:
                return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 1950489833:
                super.onSupportVisible();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this}) : "GoodPriceMiniDetailWeexFragment";
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        }
    }

    public static /* synthetic */ void access$000(GoodPriceMiniDetailWeexFragment goodPriceMiniDetailWeexFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e61e16", new Object[]{goodPriceMiniDetailWeexFragment});
        } else {
            goodPriceMiniDetailWeexFragment.handWeexRenderError();
        }
    }

    public static /* synthetic */ FrameLayout access$100(GoodPriceMiniDetailWeexFragment goodPriceMiniDetailWeexFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("28d0b3c4", new Object[]{goodPriceMiniDetailWeexFragment}) : goodPriceMiniDetailWeexFragment.mWeexContainer;
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        registerAppMonitor();
        AppMonitor.Stat.begin(getUTPageName(), "monitor-point-render-weex2-view", "measureRenderWeex2CostTime");
        super.onCreate(bundle);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("popGoodPricePage");
        LocalBroadcastManager.getInstance(getContext()).registerReceiver(this.broadcastReceiver, intentFilter);
        MUSEngine.registerModule("goodPriceModule", GoodPriceModule.class);
    }

    private static void registerAppMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b816583", new Object[0]);
            return;
        }
        MeasureSet create = MeasureSet.create();
        create.addMeasure("measureRenderWeex2CostTime");
        AppMonitor.register("GoodPriceMiniDetailWeexFragment", "monitor-point-render-weex2-view", create);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.goodprice_minidetail_container_layout, viewGroup, false);
        this.mWeexContainer = (FrameLayout) inflate.findViewById(R.id.mini_detail_container);
        this.skeletonImg = (ImageView) inflate.findViewById(R.id.good_price_minidetail_skeleton_img);
        this.errorView = (TBErrorView) inflate.findViewById(R.id.mini_detail_error_bg_layout);
        if (getArguments() != null) {
            Parcelable parcelable = getArguments().getParcelable("originActivityIntent");
            if (parcelable instanceof Intent) {
                Intent intent = (Intent) parcelable;
                this.realUrl = intent.getStringExtra("weexBundleUrl");
                if (TextUtils.isEmpty(this.realUrl)) {
                    this.originUrl = intent.getStringExtra(i.URL_REFERER_ORIGIN);
                }
            }
        }
        if (NetworkUtil.a(getContext())) {
            this.goodPriceWeexInstance = new a(new b() { // from class: com.taobao.android.goodprice.minidetail.GoodPriceMiniDetailWeexFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.goodprice.minidetail.b
                public void a(int i, String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fd351acf", new Object[]{this, new Integer(i), str, new Boolean(z)});
                        return;
                    }
                    GoodPriceMiniDetailWeexFragment.access$000(GoodPriceMiniDetailWeexFragment.this);
                    AppMonitor.Alarm.commitFail("GoodPriceMiniDetailWeexFragment", "module-render-weex-view", "-102", str + ",isFatal =" + z);
                }
            });
            if (!TextUtils.isEmpty(this.realUrl)) {
                this.goodPriceWeexInstance.a(getContext(), this.realUrl, new f() { // from class: com.taobao.android.goodprice.minidetail.GoodPriceMiniDetailWeexFragment.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.f
                    public void onCreateView(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                        } else if (view == null) {
                            GoodPriceMiniDetailWeexFragment.access$000(GoodPriceMiniDetailWeexFragment.this);
                            AppMonitor.Alarm.commitFail("GoodPriceMiniDetailWeexFragment", "module-render-weex-view", "-101", "weexView is null");
                        } else {
                            GoodPriceMiniDetailWeexFragment.access$100(GoodPriceMiniDetailWeexFragment.this).removeAllViews();
                            GoodPriceMiniDetailWeexFragment.access$100(GoodPriceMiniDetailWeexFragment.this).addView(view);
                            GoodPriceMiniDetailWeexFragment.access$100(GoodPriceMiniDetailWeexFragment.this).setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
                            AppMonitor.Stat.end("GoodPriceMiniDetailWeexFragment", "monitor-point-render-weex2-view", "measureRenderWeex2CostTime");
                            AppMonitor.Alarm.commitSuccess("GoodPriceMiniDetailWeexFragment", "module-render-weex-view");
                        }
                    }
                });
            } else {
                handWeexRenderError();
                AppMonitor.Alarm.commitFail("GoodPriceMiniDetailWeexFragment", "module-render-weex-view", "-100", "realUrl is null");
            }
        } else {
            handWeexRenderError();
            AppMonitor.Alarm.commitFail("GoodPriceMiniDetailWeexFragment", "module-render-weex-view", "-103", "is not connect internet");
        }
        return inflate;
    }

    private void showErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15716ad7", new Object[]{this});
            return;
        }
        ImageView imageView = this.skeletonImg;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TBErrorView tBErrorView = this.errorView;
        if (tBErrorView != null) {
            tBErrorView.setVisibility(0);
            this.errorView.setSubTitle("返回重试一下吧~");
            this.errorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "返回", new View.OnClickListener() { // from class: com.taobao.android.goodprice.minidetail.GoodPriceMiniDetailWeexFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        GoodPriceMiniDetailWeexFragment.this.onBackPressedSupport();
                    }
                }
            });
        }
        AppMonitor.Counter.commit("GoodPriceMiniDetailWeexFragment", "monitor-point-show-error-view", "show error view", 1.0d);
    }

    private void handWeexRenderError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780a4a69", new Object[]{this});
        } else if (navToDetailPage()) {
        } else {
            showErrorView();
        }
    }

    private boolean navToDetailPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f88b51a9", new Object[]{this})).booleanValue();
        }
        String str = TextUtils.isEmpty(this.realUrl) ? this.originUrl : this.realUrl;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("\\?");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return false;
        }
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() { // from class: com.taobao.android.goodprice.minidetail.GoodPriceMiniDetailWeexFragment.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                GoodPriceMiniDetailWeexFragment.this.onBackPressedSupport();
                handler.removeCallbacksAndMessages(null);
            }
        });
        Nav.from(getContext().getApplicationContext()).toUri("https://item.taobao.com/item.htm?" + split[1]);
        return true;
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : GoodPriceMiniDetailWeexFragment.class.getName();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        a aVar = this.goodPriceWeexInstance;
        if (aVar != null) {
            aVar.a();
        }
        if (this.broadcastReceiver == null) {
            return;
        }
        LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.broadcastReceiver);
        this.broadcastReceiver = null;
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74421ce9", new Object[]{this});
            return;
        }
        super.onSupportVisible();
        a aVar = this.goodPriceWeexInstance;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportInvisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40c5aa4", new Object[]{this});
            return;
        }
        super.onSupportInvisible();
        a aVar = this.goodPriceWeexInstance;
        if (aVar == null) {
            return;
        }
        aVar.c();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public boolean onBackPressedSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6048655e", new Object[]{this})).booleanValue();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return true;
    }
}
