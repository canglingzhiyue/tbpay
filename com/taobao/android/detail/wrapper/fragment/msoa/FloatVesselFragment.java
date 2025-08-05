package com.taobao.android.detail.wrapper.fragment.msoa;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.fragment.FloatFragment;
import com.taobao.android.detail.core.detail.kit.utils.c;
import com.taobao.android.detail.core.detail.kit.view.widget.RoundRelativeLayout;
import com.taobao.android.detail.core.open.g;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.VesselViewFragment;
import com.taobao.vessel.a;
import com.taobao.vessel.base.VesselBaseView;
import com.taobao.vessel.base.a;
import com.taobao.vessel.utils.VesselType;
import com.taobao.vessel.utils.b;
import com.taobao.vessel.weex.VesselWeexView;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import java.util.Map;
import tb.ecu;
import tb.emu;
import tb.epj;
import tb.fgl;
import tb.fin;
import tb.kge;
import tb.rgu;
import tb.rgv;
import tb.rgw;
import tb.rgz;

/* loaded from: classes5.dex */
public class FloatVesselFragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String FLOAT_DIALOG_NAME_SPACE = null;
    private static final String KEY_FULL_SCREEN_MODE = "full_screen_mode";
    private static final String POP_WEIGHT_LEVEL = "weight_level";
    private static final String POP_WEIGHT_LEVEL_HIGH = "high";
    private static final String POP_WEIGHT_LEVEL_MEDIUM = "medium";
    private static final String POP_WEIGHT_LEVEL_SHORT = "short";
    public static final String TAG;
    public static final String VESSEL_METHOD_MAP_KEY = "method";
    public static final String VESSEL_METHOD_NAME_ADDRESS_CHANGED = "addressChanged";
    public static final String VESSEL_METHOD_NAME_CLOSE_PAGE = "close_page";
    public static final String VESSEL_METHOD_NAME_GET_NODE_BUNDLE = "get_detail_data";
    private FrameLayout flWeex;
    private String mAddressId;
    private View mContentView;
    public VesselBaseView.a mEventCallback;
    public boolean mIsShowloading;
    private rgz mNavigatorBarSetter;
    private rgu mOnLoadListener;
    private rgv mScrollViewListener;
    private g mSdk;
    @Deprecated
    public View mTabbar;
    @Deprecated
    public View mToolbar;
    private LinearLayout mTopLayout;
    public String mVesselData;
    public Object mVesselParams;
    public VesselType mVesselType;
    public rgw mViewCallback;
    private View rootView;
    public VesselView mVesselView = null;
    public String mUri = null;
    public String mDowngradeUrl = null;
    public boolean mDowngradeEnable = true;
    private String mEventKey = "";
    private boolean fullScreenMode = false;

    public static /* synthetic */ Object ipc$super(FloatVesselFragment floatVesselFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2089880052:
                super.onDismiss((DialogInterface) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment
    public void queryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b8c419", new Object[]{this});
        }
    }

    public static /* synthetic */ void access$000(FloatVesselFragment floatVesselFragment, Map map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be8dda44", new Object[]{floatVesselFragment, map, aVar});
        } else {
            floatVesselFragment.onVesselViewCallBackInvoked(map, aVar);
        }
    }

    public static /* synthetic */ String access$100(FloatVesselFragment floatVesselFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a5830f1a", new Object[]{floatVesselFragment}) : floatVesselFragment.mEventKey;
    }

    static {
        kge.a(1266787939);
        TAG = VesselView.class.getSimpleName();
        FLOAT_DIALOG_NAME_SPACE = "floatCommonWeexDialog";
    }

    public FloatVesselFragment() {
        emu.a("com.taobao.android.detail.wrapper.fragment.msoa.FloatVesselFragment");
    }

    public void setEventKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea25738", new Object[]{this, str});
        } else {
            this.mEventKey = str;
        }
    }

    public static FloatVesselFragment newInstance(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatVesselFragment) ipChange.ipc$dispatch("a65bf926", new Object[]{new Boolean(z)});
        }
        FloatVesselFragment floatVesselFragment = new FloatVesselFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(KEY_FULL_SCREEN_MODE, z);
        floatVesselFragment.setArguments(bundle);
        return floatVesselFragment;
    }

    public static VesselViewFragment newInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselViewFragment) ipChange.ipc$dispatch("2db75a18", new Object[0]) : new VesselViewFragment();
    }

    public static VesselViewFragment newInstance(a.C1011a c1011a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselViewFragment) ipChange.ipc$dispatch("852b74e7", new Object[]{c1011a});
        }
        VesselViewFragment vesselViewFragment = new VesselViewFragment();
        com.taobao.vessel.a.a().a(c1011a);
        return vesselViewFragment;
    }

    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else {
            loadUrl(str, null);
        }
    }

    public void loadUrl(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60501d6", new Object[]{this, str, obj});
        } else {
            loadUrl(null, str, obj);
        }
    }

    public void loadUrl(VesselType vesselType, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55ed11", new Object[]{this, vesselType, str, obj});
            return;
        }
        this.mVesselType = vesselType;
        if (this.mVesselType == null) {
            this.mVesselType = b.a(str);
        }
        this.mUri = str;
        this.mVesselParams = obj;
        VesselView vesselView = this.mVesselView;
        if (vesselView != null) {
            vesselView.loadUrl(vesselType, str, obj);
        }
        this.mViewCallback = new rgw() { // from class: com.taobao.android.detail.wrapper.fragment.msoa.FloatVesselFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgw
            public void a(Map<String, Object> map, com.taobao.vessel.base.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
                } else {
                    FloatVesselFragment.access$000(FloatVesselFragment.this, map, aVar);
                }
            }
        };
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        super.onDismiss(dialogInterface);
        if (this.mSdk == null) {
            return;
        }
        this.mSdk.a("detail_floatweex_instance", new JSONObject() { // from class: com.taobao.android.detail.wrapper.fragment.msoa.FloatVesselFragment.2
            {
                put(fin.EVENT_KEY, (Object) FloatVesselFragment.access$100(FloatVesselFragment.this));
                put("state", "onDismiss");
            }
        });
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        this.mSdk = n.a(context);
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        try {
            Bundle arguments = getArguments();
            if (arguments == null) {
                return;
            }
            this.fullScreenMode = arguments.getBoolean(KEY_FULL_SCREEN_MODE, false);
        } catch (Throwable th) {
            i.a(TAG, "onCreate#getBoolean", th);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        this.rootView = View.inflate(getActivity(), R.layout.x_detail_float_vessel_fragment, null);
        this.llContainer = this.rootView.findViewById(R.id.ll_container);
        if (isShowByStdPop()) {
            this.llContainer.setBackgroundColor(-1);
            this.llContainer.setPadding(0, c.b(getContext()), 0, 0);
        }
        this.rlPanel = (RelativeLayout) this.rootView.findViewById(R.id.rl_panel);
        this.flWeex = (FrameLayout) this.rootView.findViewById(R.id.detail_fl_weex);
        this.mTopLayout = (LinearLayout) this.rootView.findViewById(R.id.tm_detail_background);
        try {
            if (this.fullScreenMode && Build.VERSION.SDK_INT >= 16) {
                this.llContainer.setBackground(null);
                this.rlPanel.setBackground(null);
            }
        } catch (Throwable th) {
            i.a(TAG, "onCreateView setBackground", th);
        }
        if (!this.fullScreenMode) {
            setWeight(this.mVesselParams);
        } else {
            this.mTopLayout.setVisibility(8);
            if (this.rlPanel instanceof RoundRelativeLayout) {
                ((RoundRelativeLayout) this.rlPanel).setRadius(0.0f);
            }
        }
        if (this.mToolbar == null && this.mTabbar == null) {
            if (this.mVesselView == null) {
                this.mVesselView = new VesselView(getActivity());
            }
            this.mContentView = this.mVesselView;
        } else {
            addBar(layoutInflater);
        }
        registerListener();
        if (this.mVesselType == null) {
            this.mVesselType = VesselType.Weex;
        }
        try {
            if (!TextUtils.isEmpty(this.mUri)) {
                this.mVesselView.loadUrl(this.mVesselType, this.mUri, this.mVesselParams);
            } else {
                this.mVesselView.loadData(this.mVesselType, this.mVesselData);
            }
            if (s.a()) {
                View childProxyView = this.mVesselView.getChildProxyView();
                if (childProxyView instanceof VesselWeexView) {
                    ((VesselWeexView) childProxyView).setAutoResize(true);
                }
            }
        } catch (Throwable unused) {
            epj.f().navigateTo(getContext(), this.mUri, null);
        }
        this.flWeex.addView(this.mContentView);
        return this.rootView;
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        this.llContainer.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.fragment.msoa.FloatVesselFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else {
                    FloatVesselFragment.this.disappear();
                }
            }
        });
        if (!this.fullScreenMode) {
            alphaDown(this.llContainer);
            moveUp();
        }
        if (!ecu.z || WXEnvironment.isCPUSupport()) {
            return;
        }
        i.a(TAG, "WXEnvironment.isSupport() == false");
    }

    private void setWeight(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ef1e29d", new Object[]{this, obj});
        } else if (obj == null) {
        } else {
            try {
                float weight = getWeight(JSONObject.parseObject(String.valueOf(obj)).getString(POP_WEIGHT_LEVEL));
                if (weight == 0.0f) {
                    return;
                }
                setLayoutWeight(this.rlPanel, weight);
                setLayoutWeight(this.mTopLayout, 1.0f - weight);
            } catch (Exception unused) {
            }
        }
    }

    private float getWeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a189b96f", new Object[]{this, str})).floatValue();
        }
        if (isShowByStdPop()) {
            return 1.0f;
        }
        if ("high".equals(str)) {
            return 0.8f;
        }
        if ("medium".equals(str)) {
            return 0.6f;
        }
        return POP_WEIGHT_LEVEL_SHORT.equals(str) ? 0.4f : 0.0f;
    }

    private void setLayoutWeight(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37b5e7f9", new Object[]{this, view, new Float(f)});
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = f;
        view.setLayoutParams(layoutParams);
    }

    private void registerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
            return;
        }
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        rgu rguVar = this.mOnLoadListener;
        if (rguVar != null) {
            vesselView.setOnLoadListener(rguVar);
        }
        rgw rgwVar = this.mViewCallback;
        if (rgwVar != null) {
            this.mVesselView.setVesselViewCallback(rgwVar);
        }
        rgv rgvVar = this.mScrollViewListener;
        if (rgvVar != null) {
            this.mVesselView.setOnScrollViewListener(rgvVar);
        }
        VesselBaseView.a aVar = this.mEventCallback;
        if (aVar != null) {
            this.mVesselView.setEventCallback(aVar);
        }
        this.mVesselView.setShowLoading(this.mIsShowloading);
        this.mVesselView.setDowngradeEnable(this.mDowngradeEnable);
        this.mVesselView.setDowngradeUrl(this.mDowngradeUrl);
    }

    private void removeAllListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76bf7c9", new Object[]{this});
            return;
        }
        this.mOnLoadListener = null;
        this.mViewCallback = null;
        this.mScrollViewListener = null;
        this.mEventCallback = null;
    }

    @Deprecated
    public void addBar(LayoutInflater layoutInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86957189", new Object[]{this, layoutInflater});
            return;
        }
        TLog.logd(TAG, "addBar");
        this.mContentView = layoutInflater.inflate(R.layout.vessel_panel, (ViewGroup) null);
        if (this.mToolbar != null) {
            ((ViewGroup) this.mContentView.findViewById(R.id.top_frame)).addView(this.mToolbar, new FrameLayout.LayoutParams(-1, -2));
        }
        if (this.mTabbar != null) {
            ((ViewGroup) this.mContentView.findViewById(R.id.bottom_frame)).addView(this.mTabbar, new FrameLayout.LayoutParams(-1, -2));
        }
        this.mVesselView = (VesselView) this.mContentView.findViewById(R.id.vesselview);
    }

    public void setDowngradeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac267fcd", new Object[]{this, str});
            return;
        }
        this.mDowngradeUrl = str;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.setDowngradeUrl(str);
    }

    public void loadData(VesselType vesselType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7900d8bc", new Object[]{this, vesselType, str});
        } else {
            loadData(vesselType, str, null);
        }
    }

    public void loadData(VesselType vesselType, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a4f349", new Object[]{this, vesselType, str, map});
            return;
        }
        this.mVesselType = vesselType;
        this.mVesselData = str;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.loadData(vesselType, str, map);
    }

    private void onVesselViewCallBackInvoked(Map<String, Object> map, com.taobao.vessel.base.a aVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f39a197", new Object[]{this, map, aVar});
        } else if (map == null || !map.containsKey("method")) {
        } else {
            Object obj2 = map.get("method");
            if (!(obj2 instanceof String)) {
                return;
            }
            String str = (String) obj2;
            if ("close_page".equals(str)) {
                alphaUp(this.llContainer);
                moveDown();
            } else if ("addressChanged".equals(str)) {
                if (!(this.context instanceof DetailActivity) || (obj = map.get("addressId")) == null || obj.equals(this.mAddressId)) {
                    return;
                }
                this.mAddressId = obj.toString();
            }
            if (!"get_detail_data".equals(str) || aVar == null) {
                return;
            }
            FragmentActivity activity = getActivity();
            if (!(activity instanceof DetailActivity)) {
                return;
            }
            aVar.invoke(((DetailActivity) activity).y().t.f10055a.a());
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.onStart();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (this.mNavigatorBarSetter == null) {
            this.mNavigatorBarSetter = new rgz(getActivity());
        }
        WXSDKEngine.setActivityNavBarSetter(this.mNavigatorBarSetter);
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.onResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.onPause();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        VesselView vesselView = this.mVesselView;
        if (vesselView != null) {
            vesselView.setVisibility(8);
            this.mVesselView.removeAllViews();
            this.mVesselView.onDestroy();
        }
        if (!(this.context instanceof DetailActivity)) {
            return;
        }
        DetailActivity detailActivity = (DetailActivity) this.context;
        String str = this.mAddressId;
        if (str == null || str.equals(detailActivity.aj()) || detailActivity.b == null || detailActivity.b.i() == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction(com.taobao.android.detail.ttdetail.constant.a.SKU_ACTION_UPDATE_DATA);
        intent.putExtra("addressId", this.mAddressId);
        intent.putExtra("skuToken", detailActivity.ae());
        intent.putExtra(fgl.ORIGINALITEMID, detailActivity.b.i().i());
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.context).sendBroadcast(intent);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        removeAllListeners();
        com.taobao.vessel.a.a().d();
        if (WXSDKEngine.getActivityNavBarSetter() != null && (WXSDKEngine.getActivityNavBarSetter() instanceof rgz)) {
            WXSDKEngine.setActivityNavBarSetter(null);
        }
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.onDestroy();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        TLog.logd(TAG, "onSaveInstanceState");
    }

    public VesselView getVesselView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VesselView) ipChange.ipc$dispatch("f7a8d76c", new Object[]{this}) : this.mVesselView;
    }

    public void setOnLoadListener(rgu rguVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc27ad2", new Object[]{this, rguVar});
            return;
        }
        this.mOnLoadListener = rguVar;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.setOnLoadListener(rguVar);
    }

    public void setScrollViewListener(rgv rgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acaad5e", new Object[]{this, rgvVar});
            return;
        }
        this.mScrollViewListener = rgvVar;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.setOnScrollViewListener(this.mScrollViewListener);
    }

    public void setVesselCallback(rgw rgwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb693df2", new Object[]{this, rgwVar});
            return;
        }
        this.mViewCallback = rgwVar;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.setVesselViewCallback(this.mViewCallback);
    }

    public void setEventCallback(VesselBaseView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2d5a7c", new Object[]{this, aVar});
            return;
        }
        this.mEventCallback = aVar;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.setEventCallback(aVar);
    }

    public void setIsLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7f6abd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsShowloading = z;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.setShowLoading(z);
    }

    public void setDowngradeEable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("493a6de1", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mDowngradeEnable = z;
        VesselView vesselView = this.mVesselView;
        if (vesselView == null) {
            return;
        }
        vesselView.setDowngradeEnable(this.mDowngradeEnable);
    }

    @Deprecated
    public void setToolbar(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942a6c12", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.mToolbar = view;
        }
    }

    @Deprecated
    public void setTabbar(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d0058b", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.mTabbar = view;
        }
    }

    public void disappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c72aaa", new Object[]{this});
            return;
        }
        alphaUp(this.llContainer);
        moveDown();
    }
}
