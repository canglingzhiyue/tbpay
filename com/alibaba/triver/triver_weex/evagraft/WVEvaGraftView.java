package com.alibaba.triver.triver_weex.evagraft;

import android.content.Context;
import android.taobao.windvane.embed.BaseEmbedView;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes3.dex */
public class WVEvaGraftView extends BaseEmbedView implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RenderContainer mRenderContainer;
    private WXSDKInstance mInstance = null;
    private String mUrl = "https://market.m.taobao.com/app/taskhub/graftview-mission-cd/home?wh_weex=true";

    static {
        kge.a(-1665939274);
        kge.a(1028243835);
    }

    public static /* synthetic */ Object ipc$super(WVEvaGraftView wVEvaGraftView, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35692924", new Object[]{this}) : "evagraftview";
    }

    private void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
        } else if (this.params == null || this.params.mObjectParam == null || this.params.mObjectParam.get("debugUrl") == null) {
        } else {
            this.mUrl = this.params.mObjectParam.get("debugUrl").toString();
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        initParams();
        this.mRenderContainer = new RenderContainer(context);
        this.mRenderContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mInstance = new WXSDKInstance(context);
        this.mInstance.a(this.mRenderContainer);
        this.mInstance.c(true);
        HashMap hashMap = new HashMap();
        hashMap.put("bundleUrl", this.mUrl);
        this.mInstance.c("EvaGraftView", this.mUrl, hashMap, "", WXRenderStrategy.APPEND_ASYNC);
        return this.mRenderContainer;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
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
        wXSDKInstance.e();
    }
}
