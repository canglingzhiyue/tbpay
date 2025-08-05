package com.alibaba.ariver.integration.embedview;

import android.view.Surface;
import android.webkit.ValueCallback;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class BaseEmbedView implements IEmbedView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a mEmbedViewProxy;
    public App mOuterApp;
    public Page mOuterPage;
    public String mViewId;

    static {
        kge.a(-400459586);
        kge.a(322390309);
    }

    public void onEmbedViewSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6967c1b", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onSurfaceAvailable(Surface surface, int i, int i2, ValueCallback<Integer> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a22c14", new Object[]{this, surface, new Integer(i), new Integer(i2), valueCallback});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public boolean onSurfaceDestroyed(Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab668b42", new Object[]{this, surface})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onSurfaceSizeChanged(Surface surface, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f22df8", new Object[]{this, surface, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void triggerPreSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43893db6", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        try {
            this.mEmbedViewProxy = (a) Class.forName("com.alibaba.ariver.integration.embedview.BaseEmbedViewImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            RVLogger.e("BaseEmbedView", th);
        }
        a aVar = this.mEmbedViewProxy;
        if (aVar == null) {
            RVLogger.e("BaseEmbedView", "get Null BaseEmbedImpl!");
            return;
        }
        try {
            aVar.onCreate(map);
            this.mOuterPage = this.mEmbedViewProxy.getOuterPage();
            if (this.mOuterPage != null) {
                this.mOuterApp = this.mOuterPage.getApp();
            }
            this.mViewId = this.mEmbedViewProxy.getViewId();
        } catch (Throwable th2) {
            RVLogger.e("BaseEmbedView", th2);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
            return;
        }
        a aVar = this.mEmbedViewProxy;
        if (aVar == null) {
            return;
        }
        aVar.onParamChanged(strArr, strArr2);
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void sendEvent(String str, JSONObject jSONObject, IEmbedCallback iEmbedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b74017", new Object[]{this, str, jSONObject, iEmbedCallback});
            return;
        }
        a aVar = this.mEmbedViewProxy;
        if (aVar == null) {
            return;
        }
        aVar.sendEvent(getType(), str, jSONObject, iEmbedCallback);
    }

    public Resource getResource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resource) ipChange.ipc$dispatch("e7aadc39", new Object[]{this, str});
        }
        a aVar = this.mEmbedViewProxy;
        if (aVar == null) {
            return null;
        }
        return aVar.getResource(str);
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mOuterPage = null;
        a aVar = this.mEmbedViewProxy;
        if (aVar == null) {
            return;
        }
        aVar.onDestroy();
    }

    public Page getOuterPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Page) ipChange.ipc$dispatch("dafe6c17", new Object[]{this}) : this.mOuterPage;
    }

    public String getViewId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b88d723", new Object[]{this}) : this.mViewId;
    }
}
