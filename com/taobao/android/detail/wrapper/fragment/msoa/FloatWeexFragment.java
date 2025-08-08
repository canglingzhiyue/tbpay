package com.taobao.android.detail.wrapper.fragment.msoa;

import android.os.Build;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.fragment.FloatFragment;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.wrapper.fragment.weex.module.WXAppInfoModule;
import com.taobao.taobao.R;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXException;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.d;
import java.util.HashMap;
import tb.ecu;
import tb.emu;
import tb.epo;
import tb.kge;
import tb.ljl;

/* loaded from: classes5.dex */
public class FloatWeexFragment extends FloatFragment implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUNDLE_PARAMS = "bundle_params";
    public static final String BUNDLE_URL = "bundle_url";
    private static final String TAG = "FloatWeexFragment";
    private View contentView;
    private TextView errorView;
    private FrameLayout flWeex;
    private WXSDKInstance mInstance;
    private String mParams;
    private String mUrl;
    private View progressBar;
    private boolean weexViewAdd;

    public static /* synthetic */ Object ipc$super(FloatWeexFragment floatWeexFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != -641568046) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment
    public void queryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b8c419", new Object[]{this});
        }
    }

    public static /* synthetic */ RelativeLayout access$000(FloatWeexFragment floatWeexFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("70708b8c", new Object[]{floatWeexFragment}) : floatWeexFragment.rlPanel;
    }

    public static /* synthetic */ String access$100(FloatWeexFragment floatWeexFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fa09b565", new Object[]{floatWeexFragment}) : floatWeexFragment.mUrl;
    }

    public static /* synthetic */ String access$200(FloatWeexFragment floatWeexFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c0343e26", new Object[]{floatWeexFragment}) : floatWeexFragment.mParams;
    }

    public static /* synthetic */ WXSDKInstance access$300(FloatWeexFragment floatWeexFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKInstance) ipChange.ipc$dispatch("d58005f7", new Object[]{floatWeexFragment}) : floatWeexFragment.mInstance;
    }

    static {
        kge.a(-1527057298);
        kge.a(-748561575);
        try {
            WXSDKEngine.registerModule("MSOAFoundation", WXAppInfoModule.class);
        } catch (WXException e) {
            i.a(TAG, "WXSDKEngine.registerModule : ", e);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        emu.a("com.taobao.android.detail.wrapper.fragment.msoa.FloatWeexFragment");
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        this.contentView = View.inflate(getActivity(), R.layout.x_detail_float_weex_fragment, null);
        this.rlPanel = (RelativeLayout) this.contentView.findViewById(R.id.rl_panel);
        this.flWeex = (FrameLayout) this.contentView.findViewById(R.id.detail_fl_weex);
        this.llContainer = this.contentView.findViewById(R.id.ll_container);
        this.progressBar = this.contentView.findViewById(R.id.detail_weex_progress);
        this.errorView = (TextView) this.contentView.findViewById(R.id.detail_weex_tip);
        return this.contentView;
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

    private static boolean isSupportSmartBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("314db8fa", new Object[0])).booleanValue() : Build.class.getMethod("hasSmartBar", new Class[0]) != null;
    }

    @Override // com.taobao.weex.d
    public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            return;
        }
        FrameLayout frameLayout = this.flWeex;
        if (frameLayout != null) {
            frameLayout.addView(view);
            this.weexViewAdd = true;
        }
        i.b(TAG, "onViewCreated");
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        } else {
            refreshContent();
        }
    }

    public void refreshContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed7c22a5", new Object[]{this});
            return;
        }
        this.llContainer.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.fragment.msoa.FloatWeexFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    FloatWeexFragment.this.disappear();
                }
            }
        });
        alphaDown(this.llContainer);
        moveUp();
        if (ecu.z && !WXEnvironment.isCPUSupport()) {
            i.a(TAG, "WXEnvironment.isSupport() == false");
            return;
        }
        this.mInstance = new WXSDKInstance(getActivity());
        this.mInstance.a(this);
        Bundle arguments = getArguments();
        if (arguments == null || StringUtils.isEmpty(arguments.getString("bundle_url"))) {
            return;
        }
        this.mUrl = arguments.getString("bundle_url");
        this.mParams = arguments.getString(BUNDLE_PARAMS);
        final HashMap hashMap = new HashMap();
        this.contentView.post(new Runnable() { // from class: com.taobao.android.detail.wrapper.fragment.msoa.FloatWeexFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int height = FloatWeexFragment.access$000(FloatWeexFragment.this).getHeight();
                WXAppInfoModule.floatWeexFragmentHeight = height;
                if ("-1".equals(FloatWeexFragment.access$100(FloatWeexFragment.this))) {
                    return;
                }
                FloatWeexFragment.access$300(FloatWeexFragment.this).a(FloatWeexFragment.TAG, FloatWeexFragment.access$100(FloatWeexFragment.this), hashMap, FloatWeexFragment.access$200(FloatWeexFragment.this), epo.b, height, WXRenderStrategy.APPEND_ASYNC);
            }
        });
        this.progressBar.setVisibility(0);
    }

    @Override // com.taobao.weex.d
    public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            return;
        }
        this.progressBar.setVisibility(8);
        this.errorView.setVisibility(8);
        i.b(TAG, ljl.RENDER_SUCCESS_TIME);
    }

    @Override // com.taobao.weex.d
    public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            return;
        }
        this.progressBar.setVisibility(8);
        this.errorView.setVisibility(8);
        i.b(TAG, "onRefreshSuccess");
    }

    @Override // com.taobao.weex.d
    public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            return;
        }
        this.progressBar.setVisibility(8);
        if (!this.weexViewAdd) {
            this.errorView.setText(b.a(R.string.x_detail_app_load_failed));
            this.errorView.setVisibility(0);
        }
        i.a(TAG, "onException");
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        WXSDKInstance wXSDKInstance = this.mInstance;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.onActivityDestroy();
    }
}
