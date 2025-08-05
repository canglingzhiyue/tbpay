package com.taobao.android.purchase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.purchase.aura.a;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.aura.b;
import com.taobao.android.purchase.aura.notification.TBBuyBroadcastReceiver;
import com.taobao.android.purchase.aura.utils.i;
import com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment;
import com.taobao.taobao.R;
import java.util.Map;
import tb.arc;
import tb.ard;
import tb.fke;
import tb.gws;
import tb.idt;
import tb.ijt;
import tb.ivr;
import tb.kge;
import tb.nhm;
import tb.tdh;

/* loaded from: classes6.dex */
public class TBBuyMainFragment extends SupportSecondaryBaseFragment implements a, b, com.taobao.android.purchase.aura.c, gws {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG = "TBBuyMainFragment";
    private FragmentActivity mActivity;
    private long mOnCreateTime;
    private OnScreenChangedListener mOnScreenChangedListener;
    private nhm mRenderDelegate;
    private TBBuyBroadcastReceiver mTBBuyBroadcastReceiver;

    static {
        kge.a(-1751187450);
        kge.a(867410578);
        kge.a(-1316612705);
        kge.a(1009639087);
        kge.a(-20624053);
    }

    public static /* synthetic */ Object ipc$super(TBBuyMainFragment tBBuyMainFragment, String str, Object... objArr) {
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
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.purchase.aura.c
    public String bc_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ccb2657b", new Object[]{this}) : TBBuyPageMode.fullPageMode;
    }

    @Override // com.taobao.android.purchase.aura.b
    public String getRenderContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1507e0c4", new Object[]{this}) : "native";
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "TBBuyMainFragment";
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public boolean onBackPressedSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6048655e", new Object[]{this})).booleanValue();
        }
        return false;
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

    public static /* synthetic */ nhm access$000(TBBuyMainFragment tBBuyMainFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nhm) ipChange.ipc$dispatch("ac46208f", new Object[]{tBBuyMainFragment}) : tBBuyMainFragment.mRenderDelegate;
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        fke.f28008a = false;
        this.mActivity = getActivity();
        this.mOnCreateTime = System.currentTimeMillis();
        AliBuyPerfSwitcher.updatePerfSwitch("enableFragmentPerf", true);
        this.mRenderDelegate = idt.e();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public void lazyInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cba252b", new Object[]{this});
            return;
        }
        this.mTBBuyBroadcastReceiver = new TBBuyBroadcastReceiver(this.mActivity, TBBuyPageMode.fullPageMode);
        this.mTBBuyBroadcastReceiver.a();
        if (i.a((Context) this.mActivity)) {
            arc.a().a("当前进入大屏模式");
            initScreenChangedListener(this.mActivity);
        }
        initEvent(this.mActivity);
        nhm nhmVar = this.mRenderDelegate;
        if (nhmVar != null) {
            nhmVar.a((Activity) this.mActivity);
        }
        nhm nhmVar2 = this.mRenderDelegate;
        if (nhmVar2 == null) {
            return;
        }
        nhmVar2.h();
        this.mRenderDelegate.i();
        this.mRenderDelegate.f();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        if (z) {
            TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
            translateAnimation.setDuration(300L);
            return translateAnimation;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation2.setDuration(300L);
        return translateAnimation2;
    }

    private void initScreenChangedListener(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b699b0", new Object[]{this, fragmentActivity});
            return;
        }
        this.mOnScreenChangedListener = new OnScreenChangedListener() { // from class: com.taobao.android.purchase.TBBuyMainFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public void onScreenChanged(int i, Configuration configuration) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                } else {
                    TBBuyMainFragment.access$000(TBBuyMainFragment.this).refreshPage(false);
                }
            }
        };
        com.taobao.android.autosize.h.a().c(this.mOnScreenChangedListener);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (AliBuyPerfSwitcher.enablePreloadView()) {
            return ijt.b(this.mActivity, R.layout.activity_purchase_v2);
        }
        return layoutInflater.inflate(R.layout.activity_purchase_v2, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        Intent b = fke.b(this.mActivity);
        if (b != null) {
            b.putExtra("NEW_BUY_ON_CREATE_TIME", this.mOnCreateTime);
        } else {
            tdh.b("EMPTY_INTENT_FORM_(onViewCreated)", "intent is empty");
        }
        nhm nhmVar = this.mRenderDelegate;
        if (nhmVar != null) {
            FragmentActivity fragmentActivity = this.mActivity;
            nhmVar.a(fragmentActivity, (ViewGroup) fragmentActivity.findViewById(R.id.purchase_container));
        }
        multilingualInFragment();
    }

    private void multilingualInFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6150b4d", new Object[]{this});
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            boolean c = com.alibaba.ability.localization.b.c();
            ard a2 = arc.a();
            a2.a("Localization.isI18nEdition() = " + c);
            if (!c) {
                return;
            }
            ivr.a((TextView) activity.findViewById(R.id.title), (ImageView) activity.findViewById(R.id.btn_back));
            ivr.a(this.mActivity);
            arc.a().a("当前环境进入多语言，执行下单页Title改动和黑名单操作");
            return;
        }
        arc.a().b("TBBuyMainFragment设置多语言UI没拿到Activity");
    }

    private void initEvent(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c61fc383", new Object[]{this, activity});
            return;
        }
        View findViewById = activity.findViewById(R.id.btn_back);
        if (findViewById == null) {
            arc.a().b("找不到id为R.id.btn_back的View", arc.a.a().b("TBBuyMainFragment").b());
        } else {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.purchase.TBBuyMainFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        fke.a(activity);
                    }
                }
            });
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        nhm nhmVar = this.mRenderDelegate;
        if (nhmVar == null) {
            return;
        }
        nhmVar.a(this.mActivity, i, i2, intent);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        nhm nhmVar = this.mRenderDelegate;
        if (nhmVar != null) {
            nhmVar.a(this.mActivity);
        }
        tdh.a();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment, com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        nhm nhmVar = this.mRenderDelegate;
        if (nhmVar != null) {
            nhmVar.b(this.mActivity);
        }
        TBBuyBroadcastReceiver tBBuyBroadcastReceiver = this.mTBBuyBroadcastReceiver;
        if (tBBuyBroadcastReceiver != null) {
            tBBuyBroadcastReceiver.b();
        }
        if (this.mOnScreenChangedListener == null) {
            return;
        }
        com.taobao.android.autosize.h.a().d(this.mOnScreenChangedListener);
    }

    @Override // com.taobao.android.purchase.aura.a
    public void dataUpdate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
            return;
        }
        nhm nhmVar = this.mRenderDelegate;
        if (nhmVar == null) {
            return;
        }
        nhmVar.dataUpdate(jSONObject);
    }

    @Override // com.taobao.android.purchase.aura.b
    public void refreshPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee313163", new Object[]{this, new Boolean(z)});
            return;
        }
        nhm nhmVar = this.mRenderDelegate;
        if (nhmVar == null) {
            return;
        }
        nhmVar.refreshPage(z);
    }

    @Override // com.taobao.android.purchase.aura.b
    public void invokeEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
            return;
        }
        nhm nhmVar = this.mRenderDelegate;
        if (nhmVar == null) {
            return;
        }
        nhmVar.invokeEvent(str, jSONObject);
    }

    @Override // com.taobao.android.purchase.aura.c
    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : com.taobao.android.purchase.aura.utils.b.b(this.mActivity.getIntent());
    }

    @Override // tb.gws
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            finish();
        }
    }

    @Override // tb.gws
    public Intent getContainerIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("dd388005", new Object[]{this});
        }
        Object obj = getArguments().get("originActivityIntent");
        if (!(obj instanceof Intent)) {
            return null;
        }
        return (Intent) obj;
    }
}
