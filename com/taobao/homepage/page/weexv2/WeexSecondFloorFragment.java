package com.taobao.homepage.page.weexv2;

import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.h;
import com.taobao.android.weex_framework.ui.i;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;
import tb.lbo;
import tb.lbq;
import tb.mjx;
import tb.oiy;

/* loaded from: classes7.dex */
public class WeexSecondFloorFragment extends WeexFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BACKGROUND_COLOR = "backgroundColor";
    private static final String DEFAULT_BG_IMG = "defaultBgImgUrl";
    private static final String KEY_BUNDLE_URL = "bundleUrl";
    private static final String KEY_WLM_URL = "wlmUrl";
    private static final String TAG = "WeexSecondFloorFragment";
    private int mBackgroundColor;
    private String mDefaultBgImgUrl;

    public static /* synthetic */ Object ipc$super(WeexSecondFloorFragment weexSecondFloorFragment, String str, Object... objArr) {
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

    public static /* synthetic */ int access$000(WeexSecondFloorFragment weexSecondFloorFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("28220d76", new Object[]{weexSecondFloorFragment})).intValue() : weexSecondFloorFragment.mBackgroundColor;
    }

    public static /* synthetic */ String access$100(WeexSecondFloorFragment weexSecondFloorFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f3937e", new Object[]{weexSecondFloorFragment}) : weexSecondFloorFragment.mDefaultBgImgUrl;
    }

    static {
        kge.a(1333734983);
        MUSEngine.registerModule(WeexSecondModule.NAME, WeexSecondModule.class);
    }

    public static WeexSecondFloorFragment newInstance(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexSecondFloorFragment) ipChange.ipc$dispatch("708572d3", new Object[]{str, str2, str3, new Integer(i)});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle bundle = new Bundle();
        bundle.putString("wlmUrl", str);
        bundle.putString("bundleUrl", str2);
        bundle.putString(DEFAULT_BG_IMG, str3);
        bundle.putInt("backgroundColor", i);
        WeexSecondFloorFragment weexSecondFloorFragment = new WeexSecondFloorFragment();
        weexSecondFloorFragment.setArguments(bundle);
        weexSecondFloorFragment.onFragmentConstruct(str, str2, currentTimeMillis);
        return weexSecondFloorFragment;
    }

    @Override // com.taobao.android.weex_ability.page.WeexFragment
    public i provideSplashScreen(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("cc72c282", new Object[]{this, new Boolean(z)}) : new i() { // from class: com.taobao.homepage.page.weexv2.WeexSecondFloorFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.ui.i
            public View a(Context context, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("2955c7b6", new Object[]{this, context, bundle});
                }
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundColor(WeexSecondFloorFragment.access$000(WeexSecondFloorFragment.this));
                TUrlImageView tUrlImageView = new TUrlImageView(context);
                tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                tUrlImageView.setBackgroundColor(WeexSecondFloorFragment.access$000(WeexSecondFloorFragment.this));
                tUrlImageView.setImageUrl(WeexSecondFloorFragment.access$100(WeexSecondFloorFragment.this));
                frameLayout.addView(tUrlImageView, new ViewGroup.LayoutParams(-1, -1));
                return frameLayout;
            }

            @Override // com.taobao.android.weex_framework.ui.i
            public void a(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("39112e6", new Object[]{this, runnable});
                } else {
                    runnable.run();
                }
            }
        };
    }

    public void convertToSurfaceView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda19b0b", new Object[]{this});
            return;
        }
        p weexSecondFloorFragment = getInstance();
        if (weexSecondFloorFragment == null) {
            e.e(TAG, "getInstance() == null");
            return;
        }
        h renderComponent = weexSecondFloorFragment.getRenderComponent();
        if (renderComponent == null) {
            return;
        }
        renderComponent.l();
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            e.e(TAG, "bundle == null");
            return;
        }
        int i = arguments.getInt("backgroundColor");
        if (i != 0) {
            this.mBackgroundColor = i;
        }
        String string = arguments.getString(DEFAULT_BG_IMG);
        if (StringUtils.isEmpty(string)) {
            return;
        }
        this.mDefaultBgImgUrl = string;
    }

    @Override // com.taobao.android.weex_ability.page.WeexFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        mjx pullDownUpManager = getPullDownUpManager();
        if (pullDownUpManager == null) {
            return;
        }
        pullDownUpManager.d();
        e.e(TAG, "onDestroy backHome");
    }

    private mjx getPullDownUpManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mjx) ipChange.ipc$dispatch("8b501ecf", new Object[]{this});
        }
        lbq b = oiy.a().b();
        if (b == null) {
            e.e(TAG, "pageProvider == null");
            return null;
        }
        lbo homePageManager = b.getHomePageManager();
        if (homePageManager == null) {
            e.e(TAG, "homePageManager == null");
            return null;
        }
        return homePageManager.i();
    }
}
