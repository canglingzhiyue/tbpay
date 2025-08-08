package com.taobao.android.weex_uikit.widget.musview;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.q;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.musview.a;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSUrlHost extends ViewGroup implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mContentView;
    private MUSDKInstance mInstance;
    private String mJsUrl;
    private boolean mRendered;
    private a.C0623a mResult;
    private UINode mTargetNode;

    static {
        kge.a(-1179927874);
        kge.a(-311268728);
    }

    public static /* synthetic */ Object ipc$super(MUSUrlHost mUSUrlHost, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
        }
    }

    public MUSUrlHost(Context context) {
        super(context);
        this.mRendered = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        View view = this.mContentView;
        if (view == null) {
            return;
        }
        view.measure(i, i2);
    }

    public void mount(UINode uINode, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, a.C0623a c0623a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("157f8ff", new Object[]{this, uINode, str, str2, jSONObject, jSONObject2, c0623a});
            return;
        }
        this.mResult = c0623a;
        this.mTargetNode = uINode;
        if (StringUtils.isEmpty(str)) {
            com.taobao.android.weex_framework.util.g.d("url mustn't be null");
            return;
        }
        if (!StringUtils.equals(this.mJsUrl, str)) {
            destroyInstance();
        } else {
            MUSDKInstance mUSDKInstance = this.mInstance;
            if (mUSDKInstance != null && !mUSDKInstance.isDestroyed()) {
                this.mInstance.refresh(jSONObject, null);
                this.mRendered = false;
                return;
            }
        }
        this.mInstance = (MUSDKInstance) q.a().a(getContext());
        this.mInstance.registerRenderListener(this);
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                this.mInstance.addInstanceEnv(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        this.mJsUrl = str;
        this.mInstance.getInstanceTags().putAll(uINode.getInstance().getInstanceTags());
        try {
            this.mInstance.initWithURL(Uri.parse(str));
            if (!StringUtils.equals(str, str2)) {
                this.mInstance.getMonitorInfo().a(str2);
                this.mInstance.addInstanceEnv("bundleUrl", str2);
            }
            this.mInstance.render(jSONObject, null);
        } catch (Exception unused) {
        }
        addView(this.mInstance.getRenderRoot(), new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        View view = this.mContentView;
        if (view == null || !this.mRendered || !view.isLayoutRequested()) {
            return;
        }
        View view2 = this.mContentView;
        view2.layout(0, 0, view2.getMeasuredWidth(), this.mContentView.getMeasuredHeight());
    }

    public void unmount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        destroyInstance();
        this.mJsUrl = null;
        this.mTargetNode = null;
    }

    private void destroyInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31293b6", new Object[]{this});
            return;
        }
        MUSDKInstance mUSDKInstance = this.mInstance;
        if (mUSDKInstance == null || mUSDKInstance.isDestroyed()) {
            return;
        }
        this.mInstance.destroy();
        removeAllViews();
        this.mContentView = null;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        UINode uINode = this.mTargetNode;
        if (uINode == null) {
            return;
        }
        uINode.fireEvent("loaded", assembleData(false));
        this.mRendered = true;
        this.mContentView = this.mInstance.getRenderRoot();
        requestLayout();
        invalidate();
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            this.mContentView.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        a.C0623a c0623a = this.mResult;
        if (c0623a != null) {
            c0623a.f16193a = this.mInstance.getRootWidth();
            this.mResult.b = this.mInstance.getRootHeight();
        }
        this.mTargetNode.notifyEngineRelayout();
    }

    private JSONObject assembleData(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("75b7f31", new Object[]{this, new Boolean(z)}) : assembleData(Boolean.valueOf(z), null, null);
    }

    private JSONObject assembleData(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("451eedd7", new Object[]{this, str, str2}) : assembleData(null, str, str2);
    }

    private JSONObject assembleData(Boolean bool, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("390f0a7e", new Object[]{this, bool, str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        if (bool != null) {
            jSONObject.put("isRefresh", (Object) String.valueOf(bool));
        }
        if (str != null && str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", (Object) str);
            jSONObject2.put("msg", (Object) str2);
            jSONObject.put("e", (Object) jSONObject2);
        }
        return jSONObject;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        UINode uINode = this.mTargetNode;
        if (uINode == null) {
            return;
        }
        uINode.fireEvent("failed", assembleData(false, String.valueOf(i), str));
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            return;
        }
        UINode uINode = this.mTargetNode;
        if (uINode == null) {
            return;
        }
        uINode.fireEvent("loaded", assembleData(true));
        this.mRendered = true;
        this.mContentView = this.mInstance.getRenderRoot();
        requestLayout();
        invalidate();
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            this.mContentView.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        a.C0623a c0623a = this.mResult;
        if (c0623a != null) {
            c0623a.f16193a = this.mInstance.getRootWidth();
            this.mResult.b = this.mInstance.getRootHeight();
        }
        this.mTargetNode.notifyEngineRelayout();
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        UINode uINode = this.mTargetNode;
        if (uINode == null) {
            return;
        }
        uINode.fireEvent("failed", assembleData(true, String.valueOf(i), str));
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        UINode uINode = this.mTargetNode;
        if (uINode == null) {
            return;
        }
        uINode.fireEvent("exception", assembleData(String.valueOf(i), str));
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        UINode uINode = this.mTargetNode;
        if (uINode == null) {
            return;
        }
        uINode.fireEvent("failed", assembleData(false, String.valueOf(i), str));
    }
}
