package com.taobao.android.weex_ability.page;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.xr.a;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.i;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.dpj;
import tb.dpm;
import tb.jvr;
import tb.jvs;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexFragment extends Fragment implements com.taobao.android.weex_framework.f, com.taobao.android.weex_framework.g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CONFIG_SWITCH_OPEN_INNER = "enable-open-inner";
    public static final String FRAGMENT_TAG = "ali_mus_fragment_tag";
    public static final String KEY_BUNDLE_URL = "bundleUrl";
    public static final String KEY_CONFIG = "config";
    public static final String KEY_INIT_DATA = "initData";
    public static final String KEY_OPTIONS = "options";
    public static final String KEY_WLM_URL = "wlmUrl";
    public static final String MUS_NAVIGATION_ADAPTER = "ali_ms_navigation";
    private static final String TLOG_MODULE = "Weex/WeexFragment/";
    public static final String WEEX_POP_ID = "wx_popId";
    public String bundleUrl;
    public boolean downgrade;
    public com.taobao.android.weex_framework.ui.c gestureStateListener;
    private p instance;
    public View.OnLayoutChangeListener layoutChangeListener;
    private com.taobao.android.weex.config.a mComputeScreenAdapter;
    private boolean mIsPresetViewSize = false;
    public com.taobao.android.weex_ability.xr.a mXRInitializer;
    public Object navigationAdapter;
    private a onDowngradeListener;
    public jvs overscrollListener;
    public boolean renderByUrlCalled;
    public FrameLayout renderContainer;
    public com.taobao.android.weex_framework.g renderListener;
    public int renderViewHeight;
    public int renderViewWidth;
    public jvr reportInfoListener;
    private boolean retainViewAfterViewDestroy;
    public FrameLayout rootContainer;
    private long startTime;
    public boolean viewCreated;
    private String wlmUrl;

    /* loaded from: classes6.dex */
    public interface a {
        void bj_();
    }

    static {
        kge.a(-966330303);
        kge.a(-311268728);
        kge.a(1004757362);
    }

    public static /* synthetic */ Object ipc$super(WeexFragment weexFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    private void reportUnicornRenderTime(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fb3548", new Object[]{this, mUSDKInstance});
        }
    }

    /* loaded from: classes6.dex */
    public static class b implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<WeexFragment> f15961a;
        private final JSONObject b;

        static {
            kge.a(-488700428);
            kge.a(1560838736);
        }

        public b(WeexFragment weexFragment, JSONObject jSONObject) {
            this.f15961a = new WeakReference<>(weexFragment);
            this.b = jSONObject;
        }

        @Override // com.taobao.android.weex_ability.xr.a.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            WeexFragment weexFragment = this.f15961a.get();
            if (weexFragment == null) {
                return;
            }
            weexFragment.doInit(weexFragment.getContext(), this.b);
        }

        @Override // com.taobao.android.weex_ability.xr.a.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            WeexFragment weexFragment = this.f15961a.get();
            if (weexFragment == null) {
                return;
            }
            weexFragment.onRenderFailed(null, 2, "XR initialize failed", true);
        }
    }

    public void fireEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
            return;
        }
        p pVar = this.instance;
        if (pVar == null) {
            return;
        }
        pVar.sendInstanceMessage(str, jSONObject);
    }

    public void dispatchEvent(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f24c7ca", new Object[]{this, new Integer(i), str, jSONObject});
            return;
        }
        p pVar = this.instance;
        if (pVar == null) {
            return;
        }
        pVar.fireEvent(i, str, jSONObject);
    }

    public static String getPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89ca9934", new Object[]{str});
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return Uri.parse(str).getPath();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setRetainViewAfterViewDestroy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4bd8c8", new Object[]{this, new Boolean(z)});
        } else {
            this.retainViewAfterViewDestroy = z;
        }
    }

    public boolean isRetainViewAfterViewDestroy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b66d0e58", new Object[]{this})).booleanValue() : this.retainViewAfterViewDestroy;
    }

    public static WeexFragment newInstance(String str, String str2, Map<String, String> map, JSONObject jSONObject, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexFragment) ipChange.ipc$dispatch("c8142eba", new Object[]{str, str2, map, jSONObject, map2});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle bundle = new Bundle();
        bundle.putString("wlmUrl", str);
        bundle.putString("bundleUrl", str2);
        if (jSONObject != null) {
            bundle.putSerializable("initData", jSONObject);
        }
        if (map2 != null) {
            bundle.putString("options", JSON.toJSONString(map2));
        }
        if (map != null) {
            bundle.putString("config", JSON.toJSONString(map));
        }
        WeexFragment weexFragment = new WeexFragment();
        weexFragment.setArguments(bundle);
        weexFragment.onFragmentConstruct(str, str2, currentTimeMillis);
        return weexFragment;
    }

    public void onFragmentConstruct(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5b41c1", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        this.startTime = j;
        this.wlmUrl = str;
        this.bundleUrl = str2;
    }

    public void setNavigationAdapter(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b1ce3c", new Object[]{this, obj});
            return;
        }
        this.navigationAdapter = obj;
        p pVar = this.instance;
        if (pVar == null) {
            return;
        }
        pVar.setTag("ali_ms_navigation", obj);
    }

    public void setGestureStateListener(com.taobao.android.weex_framework.ui.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db32b70", new Object[]{this, cVar});
            return;
        }
        this.gestureStateListener = cVar;
        p pVar = this.instance;
        if (pVar == null) {
            return;
        }
        pVar.setGestureStateListener(cVar);
    }

    public void setOverScrollListener(jvs jvsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a05f807", new Object[]{this, jvsVar});
            return;
        }
        this.overscrollListener = jvsVar;
        p pVar = this.instance;
        if (pVar == null) {
            return;
        }
        pVar.setWeexScrollListener(jvsVar);
    }

    public void setRenderListener(com.taobao.android.weex_framework.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a175d23", new Object[]{this, gVar});
        } else {
            this.renderListener = gVar;
        }
    }

    public void setComputeScreenAdapter(com.taobao.android.weex.config.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6c7575", new Object[]{this, aVar});
        } else {
            this.mComputeScreenAdapter = aVar;
        }
    }

    public void setReportInfoListener(jvr jvrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7382ac69", new Object[]{this, jvrVar});
        } else {
            this.reportInfoListener = jvrVar;
        }
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        p pVar = this.instance;
        if (pVar == null || !pVar.canGoBack()) {
            return false;
        }
        this.instance.goBack();
        return true;
    }

    public String getOriginalUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd9dbb51", new Object[]{this}) : getArguments().getString("wlmUrl");
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.viewCreated) {
            return this.rootContainer;
        }
        this.viewCreated = true;
        this.renderByUrlCalled = false;
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.fragment_mus_page, viewGroup, false);
        this.rootContainer = frameLayout;
        this.renderContainer = (FrameLayout) frameLayout.findViewById(R.id.render_container);
        this.layoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.taobao.android.weex_ability.page.WeexFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    return;
                }
                if (WeexFragment.this.renderViewWidth == 0 || WeexFragment.this.renderViewHeight == 0) {
                    WeexFragment weexFragment = WeexFragment.this;
                    weexFragment.renderViewWidth = i3 - i;
                    weexFragment.renderViewHeight = i4 - i2;
                    weexFragment.presetViewSize();
                }
                WeexFragment.this.renderContainer.removeOnLayoutChangeListener(WeexFragment.this.layoutChangeListener);
            }
        };
        this.renderContainer.addOnLayoutChangeListener(this.layoutChangeListener);
        try {
            String path = Uri.parse(this.bundleUrl).getPath();
            if (path != null && !path.startsWith("/muise_scan_dev") && !path.startsWith("/muise_dev")) {
                path.startsWith("/muise_scan");
            }
            if (Uri.parse(this.bundleUrl).getQueryParameter("wx_popId") != null) {
                z = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (z) {
            doInit(layoutInflater.getContext(), null);
            this.renderByUrlCalled = true;
            return frameLayout;
        }
        doInit(layoutInflater.getContext(), null);
        this.renderByUrlCalled = true;
        return frameLayout;
    }

    public Map<String, Object> toStringMap(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("15026c6e", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void doInit(android.content.Context r21, com.alibaba.fastjson.JSONObject r22) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_ability.page.WeexFragment.doInit(android.content.Context, com.alibaba.fastjson.JSONObject):void");
    }

    private boolean isInWhiteList(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad500757", new Object[]{this, str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String[] split = str.split(",");
            Uri parse = Uri.parse(str2);
            String str3 = parse.getHost() + parse.getPath();
            for (String str4 : split) {
                if (str4.equals(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        p pVar = this.instance;
        if (pVar == null) {
            return;
        }
        pVar.onActivityResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        p pVar = this.instance;
        if (pVar == null) {
            return;
        }
        pVar.onActivityStart();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        p pVar = this.instance;
        if (pVar == null) {
            return;
        }
        pVar.onActivityPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        p pVar = this.instance;
        if (pVar == null) {
            return;
        }
        pVar.onActivityStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        if (this.retainViewAfterViewDestroy) {
            return;
        }
        realDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        realDestroy();
    }

    private void realDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfb5703", new Object[]{this});
            return;
        }
        p pVar = this.instance;
        if (pVar != null) {
            pVar.destroy();
            this.instance = null;
        }
        FrameLayout frameLayout = this.rootContainer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.rootContainer = null;
        }
        com.taobao.android.weex_ability.xr.a aVar = this.mXRInitializer;
        if (aVar != null) {
            aVar.a();
            this.mXRInitializer = null;
        }
        this.viewCreated = false;
    }

    public p getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("92f1458f", new Object[]{this}) : this.instance;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
        } else {
            super.onAttach(context);
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
            return;
        }
        com.taobao.android.weex_framework.g gVar = this.renderListener;
        if (gVar == null) {
            return;
        }
        gVar.onForeground(pVar);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
            return;
        }
        com.taobao.android.weex_framework.g gVar = this.renderListener;
        if (gVar == null) {
            return;
        }
        gVar.onPrepareSuccess(pVar);
    }

    public void reloadInstance(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69132abb", new Object[]{this, jSONObject});
        } else if (this.renderContainer == null) {
        } else {
            p pVar = this.instance;
            if (pVar != null) {
                pVar.destroy();
                this.instance = null;
            }
            this.renderContainer.removeAllViews();
            doInit(getContext(), jSONObject);
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        com.taobao.android.weex_framework.g gVar = this.renderListener;
        if (gVar == null) {
            return;
        }
        gVar.onRenderSuccess(pVar);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        downgrade();
        com.taobao.android.weex_framework.g gVar = this.renderListener;
        if (gVar != null) {
            gVar.onRenderFailed(pVar, i, str, z);
        }
        String originalUrl = getOriginalUrl();
        if (originalUrl == null) {
            return;
        }
        try {
            Uri parse = Uri.parse(originalUrl);
            if (dpj.a(parse)) {
                originalUrl = parse.buildUpon().clearQuery().toString();
            }
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.a(e);
        }
        dpm.a().b(originalUrl);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            return;
        }
        System.currentTimeMillis();
        com.taobao.android.weex_framework.g gVar = this.renderListener;
        if (gVar == null) {
            return;
        }
        gVar.onRefreshSuccess(pVar);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        com.taobao.android.weex_framework.g gVar = this.renderListener;
        if (gVar == null) {
            return;
        }
        gVar.onRefreshFailed(pVar, i, str, z);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        com.taobao.android.weex_framework.g gVar = this.renderListener;
        if (gVar == null) {
            return;
        }
        gVar.onJSException(pVar, i, str);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        com.taobao.android.weex_framework.g gVar = this.renderListener;
        if (gVar == null) {
            return;
        }
        gVar.onFatalException(pVar, i, str);
    }

    public String getBundleUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dee20482", new Object[]{this}) : this.bundleUrl;
    }

    public String getWlmUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("69d2b00c", new Object[]{this}) : this.wlmUrl;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            return;
        }
        reportUnicornRenderTime(mUSDKInstance);
        com.taobao.android.weex_framework.g gVar = this.renderListener;
        if (gVar == null) {
            return;
        }
        gVar.onDestroyed(mUSDKInstance);
    }

    public void downgrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5467727c", new Object[]{this});
            return;
        }
        p pVar = this.instance;
        if (pVar != null) {
            pVar.destroy();
            this.instance = null;
        }
        FrameLayout frameLayout = this.renderContainer;
        if (frameLayout == null) {
            this.downgrade = true;
            notifyDowngrade();
            return;
        }
        frameLayout.removeAllViews();
        notifyDowngrade();
    }

    private void notifyDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8ae9b3", new Object[]{this});
            return;
        }
        a aVar = this.onDowngradeListener;
        if (aVar == null) {
            return;
        }
        aVar.bj_();
    }

    public i provideSplashScreen(final boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("cc72c282", new Object[]{this, new Boolean(z)}) : new i() { // from class: com.taobao.android.weex_ability.page.WeexFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.ui.i
            public View a(Context context, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("2955c7b6", new Object[]{this, context, bundle});
                }
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                if (!z) {
                    return frameLayout;
                }
                frameLayout.setBackgroundColor(-1);
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

    @Override // com.taobao.android.weex_framework.f
    public void onCreateView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
        } else if (view == null) {
        } else {
            view.setFitsSystemWindows(false);
            this.renderContainer.addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public void presetViewSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fc864c", new Object[]{this});
        } else if (this.renderViewHeight == 0 || this.renderViewWidth == 0 || this.mIsPresetViewSize || this.instance == null || getActivity() == null) {
        } else {
            float a2 = com.taobao.android.weex_framework.util.i.a((Context) getActivity(), this.renderViewWidth);
            float a3 = com.taobao.android.weex_framework.util.i.a((Context) getActivity(), this.renderViewHeight);
            this.instance.addInstanceEnv("containerWidth", String.valueOf(a2));
            this.instance.addInstanceEnv("containerHeight", String.valueOf(a3));
            this.instance.setConstrainedSize(new com.taobao.android.weex_framework.ui.a(this.renderViewWidth, this.renderViewHeight));
            this.mIsPresetViewSize = true;
        }
    }

    public void updateViewPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc2c5b6", new Object[]{this});
            return;
        }
        p pVar = this.instance;
        if (pVar == null) {
            return;
        }
        pVar.updateViewport();
    }

    public void setOnDowngradeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc9a34", new Object[]{this, aVar});
        } else {
            this.onDowngradeListener = aVar;
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
        p pVar = this.instance;
        if (pVar == null) {
            return;
        }
        pVar.onActivityResult(i, i2, intent);
    }
}
