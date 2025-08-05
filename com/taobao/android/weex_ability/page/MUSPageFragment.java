package com.taobao.android.weex_ability.page;

import android.content.Context;
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
import com.taobao.android.weex_ability.page.b;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.q;
import com.taobao.android.weex_framework.r;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.dpj;
import tb.dpm;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSPageFragment extends Fragment implements com.taobao.android.weex_framework.g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FRAGMENT_TAG = "ali_mus_fragment_tag";
    private static final String KEY_BUNDLE_URL = "bundleUrl";
    private static final String KEY_INIT_DATA = "initData";
    private static final String KEY_OPTIONS = "options";
    private static final String KEY_WLM_URL = "wlmUrl";
    public static final String MUS_NAVIGATION_ADAPTER = "ali_ms_navigation";
    private String bundleUrl;
    private boolean downgrade;
    private p instance;
    private b navigationAdapter;
    private b.a onBackPressedListener = null;
    private a onDowngradeListener;
    private boolean renderByUrlCalled;
    private FrameLayout renderContainer;
    private com.taobao.android.weex_framework.g renderListener;
    private boolean retainViewAfterViewDestroy;
    private FrameLayout rootContainer;
    private long startTime;
    private boolean viewCreated;
    private String wlmUrl;

    /* loaded from: classes6.dex */
    public interface a {
        void b();
    }

    static {
        kge.a(-761924454);
        kge.a(-311268728);
    }

    public static /* synthetic */ Object ipc$super(MUSPageFragment mUSPageFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    public static MUSPageFragment newInstance(String str, String str2, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSPageFragment) ipChange.ipc$dispatch("69ef97c6", new Object[]{str, str2, jSONObject, map});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle bundle = new Bundle();
        bundle.putString("wlmUrl", str);
        bundle.putString("bundleUrl", str2);
        if (jSONObject != null) {
            bundle.putSerializable("initData", jSONObject);
        }
        if (map != null) {
            bundle.putString("options", JSON.toJSONString(map));
        }
        MUSPageFragment mUSPageFragment = new MUSPageFragment();
        mUSPageFragment.setArguments(bundle);
        mUSPageFragment.onFragmentConstruct(str, str2, currentTimeMillis);
        return mUSPageFragment;
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

    public void setNavigationAdapter(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6176151d", new Object[]{this, bVar});
            return;
        }
        this.navigationAdapter = bVar;
        p pVar = this.instance;
        if (pVar == null) {
            return;
        }
        pVar.setTag("ali_ms_navigation", bVar);
    }

    public void setBackPressedListener(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cc23ff4", new Object[]{this, aVar});
        } else {
            this.onBackPressedListener = aVar;
        }
    }

    public void setRenderListener(com.taobao.android.weex_framework.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a175d23", new Object[]{this, gVar});
        } else {
            this.renderListener = gVar;
        }
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        b.a aVar = this.onBackPressedListener;
        if (aVar == null) {
            return false;
        }
        aVar.a(0);
        return true;
    }

    public String getOriginalUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd9dbb51", new Object[]{this}) : getArguments().getString("wlmUrl");
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
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
        try {
            String path = Uri.parse(this.bundleUrl).getPath();
            if (path != null && !path.startsWith("/muise_scan_dev") && !path.startsWith("/muise_dev")) {
                path.startsWith("/muise_scan");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        doInit(layoutInflater.getContext(), null);
        this.renderByUrlCalled = true;
        return frameLayout;
    }

    private Map<String, Object> toStringMap(JSONObject jSONObject) {
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

    private void doInit(Context context, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d6e8ea", new Object[]{this, context, jSONObject});
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null || this.renderContainer == null || this.downgrade) {
            return;
        }
        String string = arguments.getString("wlmUrl");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        String string2 = arguments.getString("bundleUrl");
        Map<String, Object> map = null;
        try {
            str = getConfigUrl(string2);
        } catch (Throwable unused) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            string = (!parse.isHierarchical() || TextUtils.isEmpty(parse.getQueryParameter("_mus_tpl"))) ? str : parse.getQueryParameter("_mus_tpl");
        } else {
            str = string2;
        }
        p a2 = q.a().a(context);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("url", (Object) string);
        jSONObject2.put("bundleUrl", (Object) str);
        a2.addInstanceEnv("instanceInfo", jSONObject2.toJSONString());
        String string3 = arguments.getString("options");
        if (string3 != null) {
            try {
                map = toStringMap(JSON.parseObject(string3));
            } catch (Exception e) {
                com.taobao.android.weex_framework.util.g.a(e);
            }
        }
        if (jSONObject == null) {
            Serializable serializable = arguments.getSerializable("initData");
            if (serializable instanceof JSONObject) {
                jSONObject = (JSONObject) serializable;
            } else if (serializable != null && (serializable instanceof Map)) {
                jSONObject = new JSONObject((Map) serializable);
            }
        }
        a2.renderByUrl(string, str, jSONObject, map);
        this.renderByUrlCalled = true;
        a2.registerRenderListener(this);
        b bVar = this.navigationAdapter;
        if (bVar != null) {
            a2.setTag("ali_ms_navigation", bVar);
        }
        this.instance = a2;
        p pVar = this.instance;
        if (pVar == null) {
            return;
        }
        pVar.getRenderRoot().setFitsSystemWindows(false);
        this.renderContainer.addView(this.instance.getRenderRoot(), new ViewGroup.LayoutParams(-1, -1));
    }

    private String getConfigUrl(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b921d638", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !"true".equals(l.a().s().a("weex_v2_config", "enable", "false"))) {
            return null;
        }
        String a2 = l.a().s().a("weex_v2_config", "url_map", "");
        if (!TextUtils.isEmpty(a2)) {
            Uri parse = Uri.parse(str);
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            String uri = clearQuery.build().toString();
            HashSet<String> hashSet = parse.isHierarchical() ? new HashSet(parse.getQueryParameterNames()) : null;
            JSONObject parseObject = JSON.parseObject(a2);
            Set<String> keySet = parseObject.keySet();
            if (keySet != null) {
                for (String str2 : keySet) {
                    if (uri.contains(str2)) {
                        String string = parseObject.getString(str2);
                        if (string.endsWith(".wlm")) {
                            if (hashSet != null && hashSet.contains("_mus_tpl")) {
                                hashSet.remove("_mus_tpl");
                            }
                            clearQuery.appendQueryParameter("_mus_tpl", string);
                            if (hashSet != null) {
                                for (String str3 : hashSet) {
                                    clearQuery.appendQueryParameter(str3, parse.getQueryParameter(str3));
                                }
                            }
                            return clearQuery.build().toString();
                        }
                        Uri.Builder builder = new Uri.Builder();
                        builder.scheme(parse.getScheme()).encodedAuthority(string);
                        if (hashSet != null) {
                            for (String str4 : hashSet) {
                                if ("wh_weex".equals(str4)) {
                                    builder.appendQueryParameter(str4, "true");
                                    z = true;
                                } else if (!"_mus_tpl".equals(str4)) {
                                    builder.appendQueryParameter(str4, parse.getQueryParameter(str4));
                                }
                            }
                            if (!z) {
                                builder.appendQueryParameter("wh_weex", "true");
                            }
                        }
                        return builder.build().toString();
                    }
                }
            }
        }
        return null;
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
        this.viewCreated = false;
    }

    public p getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("92f1458f", new Object[]{this}) : this.instance;
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
        f.a(this.bundleUrl, str);
        downgrade();
        com.taobao.android.weex_framework.g gVar = this.renderListener;
        if (gVar != null) {
            gVar.onRenderFailed(pVar, i, str, z);
        }
        removeCacheOnFail();
    }

    private void removeCacheOnFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713877a2", new Object[]{this});
            return;
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
        reportPerformance(System.currentTimeMillis() - this.startTime);
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
        f.a(this.bundleUrl, str);
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
        f.a(this.bundleUrl, str);
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
        f.a(this.bundleUrl, str);
        if (i == 0) {
            removeCacheOnFail();
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

    private void reportPerformance(long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a372c241", new Object[]{this, new Long(j)});
        } else if (this.bundleUrl == null || getInstance() == null) {
        } else {
            double performance = getInstance().getPerformance(1);
            try {
                str = Uri.parse(this.bundleUrl).getPath();
            } catch (Exception e) {
                e.printStackTrace();
                str = "";
            }
            f.a(j, performance, str);
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            return;
        }
        com.taobao.android.weex_framework.g gVar = this.renderListener;
        if (gVar == null) {
            return;
        }
        gVar.onDestroyed(mUSDKInstance);
    }

    public void downgrade() {
        r rVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5467727c", new Object[]{this});
            return;
        }
        p pVar = this.instance;
        if (pVar != null) {
            rVar = pVar.getMonitorInfo();
            this.instance.destroy();
            this.instance = null;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            rVar = new r(this.bundleUrl, this.wlmUrl);
        }
        MUSAppMonitor.c(rVar);
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
        aVar.b();
    }

    public void setOnDowngradeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8653b67", new Object[]{this, aVar});
        } else {
            this.onDowngradeListener = aVar;
        }
    }
}
