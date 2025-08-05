package com.etao.feimagesearch.videosearch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.ui.VideoLoadingView;
import com.etao.feimagesearch.util.ah;
import com.etao.feimagesearch.util.s;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSLayout;
import com.taobao.android.searchbaseframe.xsl.page.uikit.XslPageLayout;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.util.HashMap;
import java.util.Map;
import tb.cof;
import tb.com;
import tb.cot;
import tb.kge;

/* loaded from: classes4.dex */
public class VideoResultList extends FrameLayout implements XslPageLayout.a, com.taobao.android.weex_framework.g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "VideoSearch_VideoResultList";
    private b callback;
    private JSONObject delayData;
    private com.taobao.android.weex_framework.p instance;
    private boolean loaded;
    private VideoLoadingView loadingView;
    private a muiseRenderCallback;
    private String pssource;

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(int i, String str, boolean z);
    }

    /* loaded from: classes4.dex */
    public interface b {
        int b(int i);
    }

    static {
        kge.a(-330021413);
        kge.a(-311268728);
        kge.a(-1235809634);
    }

    public static /* synthetic */ Object ipc$super(VideoResultList videoResultList, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public VideoResultList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.callback = null;
        this.muiseRenderCallback = null;
        this.loadingView = new VideoLoadingView(context);
    }

    public void setPssource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02f78f1", new Object[]{this, str});
        } else {
            this.pssource = str;
        }
    }

    public void loadIfNeeded(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e86c7f5", new Object[]{this, new Boolean(z)});
        } else if (this.instance != null) {
        } else {
            this.instance = com.taobao.android.weex_framework.q.a().a(getContext());
            this.instance.setTag(XslMUSComponent.PAGE_SCROLL_LISTENER, this);
            this.instance.registerRenderListener(this);
            addView(this.instance.getRenderRoot());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.etao.feimagesearch.util.g.a(25.0f), com.etao.feimagesearch.util.g.a(25.0f));
            layoutParams.gravity = 17;
            addView(this.loadingView, layoutParams);
            this.loadingView.setVisibility(8);
            String bW = com.etao.feimagesearch.config.b.bW();
            cot.c(TAG, "url = " + bW);
            s.a(this.instance, bW, bW, null, null);
        }
    }

    public boolean contentReachTop() {
        XslMUSLayout xslMUSLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a592f586", new Object[]{this})).booleanValue();
        }
        com.taobao.android.weex_framework.p pVar = this.instance;
        if (pVar != null && (xslMUSLayout = (XslMUSLayout) ah.a(pVar.getRenderRoot(), XslMUSLayout.class)) != null) {
            return xslMUSLayout.isReachTop();
        }
        return false;
    }

    public void setResult(JSONObject jSONObject, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806a9680", new Object[]{this, jSONObject, str, new Boolean(z)});
        } else if (this.instance == null) {
        } else {
            cot.c(TAG, "setResult: useNewSearchResult = " + z);
            JSONObject assembleNewIrpData = z ? assembleNewIrpData(jSONObject, str) : assembleOldVideoData(jSONObject, str);
            if (this.loaded) {
                this.instance.refresh(assembleNewIrpData, null);
            } else {
                this.delayData = assembleNewIrpData;
            }
        }
    }

    private JSONObject assembleNewIrpData(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6d04de30", new Object[]{this, jSONObject, str});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("scene", (Object) "initialItems");
        jSONObject2.put("result", jSONObject.get("data"));
        jSONObject2.put("error", (Object) 0);
        HashMap<String, Object> searchParams = getSearchParams();
        addDefaultParams(searchParams);
        jSONObject2.put("searchParams", (Object) searchParams);
        return jSONObject2;
    }

    private HashMap<String, Object> getSearchParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f1055aee", new Object[]{this});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(com.etao.feimagesearch.model.d.KEY_FROM_OUTER_APP, String.valueOf(false));
        hashMap.put(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, PhotoFrom.Values.VIDEO_SEARCH.getValue());
        hashMap.put("pssource", this.pssource);
        hashMap.put("rainbow", cof.a());
        hashMap.put("musPageVersion", com.etao.feimagesearch.config.b.h());
        hashMap.put("api", com.etao.feimagesearch.config.b.I());
        hashMap.put("version", com.etao.feimagesearch.config.b.J());
        hashMap.put("sversion", com.h());
        try {
            StringBuilder sb = new StringBuilder("use_multi_cat:1;use_pid_summary:1;cat_deleted:1;use_pid_tag:1;extend_count:3;agg:;auction_agg:tag,svid;");
            com.etao.feimagesearch.util.o.a(sb, com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, PhotoFrom.Values.VIDEO_SEARCH.getValue());
            com.etao.feimagesearch.util.o.a(sb, "psfrom", "");
            com.etao.feimagesearch.util.o.a(sb, "pssource", this.pssource);
            hashMap.put("extraParams", sb.toString());
        } catch (Exception unused) {
        }
        hashMap.put("newPhotoSearch", "true");
        if (com.alibaba.ability.localization.b.c()) {
            hashMap.put("foreignImageSearch", "true");
        }
        hashMap.put("appId", com.etao.feimagesearch.config.b.i(this.pssource));
        return hashMap;
    }

    private void addDefaultParams(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf29258", new Object[]{this, map});
        } else if (map == null) {
        } else {
            map.put("vm", "nw");
            map.put("m", "api4etao");
            map.put("n", "40");
        }
    }

    private JSONObject assembleOldVideoData(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ba043aa3", new Object[]{this, jSONObject, str});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("scene", (Object) "initialItems");
        jSONObject2.put("searchResult", jSONObject.get("data"));
        jSONObject2.put("error", (Object) 0);
        HashMap hashMap = new HashMap();
        addDefaultParams(hashMap);
        hashMap.put(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, PhotoFrom.Values.VIDEO_SEARCH.getValue());
        hashMap.put("pssource", this.pssource);
        hashMap.put("rainbow", cof.a());
        hashMap.put("region", str);
        jSONObject2.put("searchParams", (Object) hashMap);
        return jSONObject2;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
            return;
        }
        cot.c(TAG, "onForeground width " + pVar.getRenderRoot().getWidth() + "， height = " + pVar.getRenderRoot().getHeight());
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
            return;
        }
        cot.c(TAG, "onPrepareSuccess width " + pVar.getRenderRoot().getWidth() + "， height = " + pVar.getRenderRoot().getHeight());
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.p pVar = this.instance;
        if (pVar == null) {
            return;
        }
        pVar.destroy();
        this.instance = null;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onRenderSuccess width ");
        sb.append(pVar.getRenderRoot().getWidth());
        sb.append("， height = ");
        sb.append(pVar.getRenderRoot().getHeight());
        sb.append("， parent ");
        if (pVar.getRenderRoot().getParent() == null) {
            z = true;
        }
        sb.append(z);
        sb.append(", visible ");
        sb.append(pVar.getRenderRoot().getVisibility());
        cot.c(TAG, sb.toString());
        this.loaded = true;
        a aVar = this.muiseRenderCallback;
        if (aVar != null) {
            aVar.a();
        }
        JSONObject jSONObject = this.delayData;
        if (jSONObject == null) {
            return;
        }
        pVar.refresh(jSONObject, null);
        this.delayData = null;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        a aVar = this.muiseRenderCallback;
        if (aVar != null) {
            aVar.a(i, str, z);
        }
        cot.b(TAG, "onRenderFailed:  type = " + i + ", errorMsg = " + str);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            return;
        }
        cot.c(TAG, "onRefreshSuccess width = " + pVar.getRenderRoot().getWidth() + "， height = " + pVar.getRenderRoot().getHeight() + ", visible " + pVar.getRenderRoot().getVisibility());
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        cot.b(TAG, "onRefreshFailed type = " + i + ", errorMsg = " + str);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(com.taobao.android.weex_framework.p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        cot.b(TAG, "onJSException type = " + i + ", errorMsg = " + str);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(com.taobao.android.weex_framework.p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        cot.b(TAG, "onFatalException type = " + i + ", errorMsg = " + str);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        } else {
            cot.c(TAG, "onDestroyed");
        }
    }

    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
        } else {
            this.loadingView.setVisibility(0);
        }
    }

    public void hideLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
        } else {
            this.loadingView.setVisibility(8);
        }
    }

    public void fireEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
            return;
        }
        com.taobao.android.weex_framework.p pVar = this.instance;
        if (pVar == null || pVar.isDestroyed()) {
            return;
        }
        this.instance.sendInstanceMessage(str, jSONObject);
    }

    public void setCallback(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26607a44", new Object[]{this, bVar});
        } else {
            this.callback = bVar;
        }
    }

    public boolean isLoaded() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("924426da", new Object[]{this})).booleanValue() : this.loaded;
    }

    public void setMuiseRenderCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15133ca", new Object[]{this, aVar});
        } else {
            this.muiseRenderCallback = aVar;
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.page.uikit.XslPageLayout.a
    public int consumePageScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19c2faf7", new Object[]{this, new Integer(i)})).intValue();
        }
        cot.c(TAG, "consumePageScroll ~ " + i);
        b bVar = this.callback;
        if (bVar == null) {
            return 0;
        }
        return bVar.b(i);
    }

    public View getRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("62a18061", new Object[]{this});
        }
        com.taobao.android.weex_framework.p pVar = this.instance;
        if (pVar != null) {
            return pVar.getRenderRoot();
        }
        return null;
    }
}
