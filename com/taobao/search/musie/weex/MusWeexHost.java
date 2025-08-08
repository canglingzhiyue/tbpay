package com.taobao.search.musie.weex;

import android.content.Context;
import android.graphics.Point;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.search.mmd.util.k;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.d;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class MusWeexHost extends FrameLayout implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Point mMeasureResult;
    private String mScriptUrl;
    private UINode mUiNode;
    private WXSDKInstance mWeexInstance;

    static {
        kge.a(-1813224734);
        kge.a(-748561575);
    }

    public static /* synthetic */ Object ipc$super(MusWeexHost musWeexHost, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.weex.d
    public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusWeexHost(Context context) {
        super(context);
        q.c(context, "context");
    }

    public final void mount(UINode uiNode, String str, JSONObject jSONObject, Point measureResult) {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a6eca1", new Object[]{this, uiNode, str, jSONObject, measureResult});
            return;
        }
        q.c(uiNode, "uiNode");
        q.c(measureResult, "measureResult");
        this.mUiNode = uiNode;
        this.mMeasureResult = measureResult;
        String str2 = str;
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        String str3 = null;
        if (StringUtils.equals(this.mScriptUrl, str2) && (wXSDKInstance = this.mWeexInstance) != null) {
            if (wXSDKInstance == null) {
                q.a();
            }
            if (jSONObject != null) {
                str3 = jSONObject.toString();
            }
            wXSDKInstance.h(str3);
            return;
        }
        destroyWeexInstance();
        WXSDKInstance createWeexInstance = createWeexInstance();
        if (jSONObject != null) {
            str3 = jSONObject.toString();
        }
        createWeexInstance.c("", str, null, str3, null);
        this.mWeexInstance = createWeexInstance;
        this.mScriptUrl = str;
    }

    private final WXSDKInstance createWeexInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("351f977", new Object[]{this});
        }
        WXSDKInstance wXSDKInstance = new WXSDKInstance(getContext());
        wXSDKInstance.a((d) this);
        return wXSDKInstance;
    }

    public final void unMount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b27987", new Object[]{this});
        } else {
            destroyWeexInstance();
        }
    }

    private final void destroyWeexInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81687157", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWeexInstance;
        if (wXSDKInstance != null) {
            wXSDKInstance.e();
        }
        this.mScriptUrl = null;
        this.mWeexInstance = null;
        removeAllViews();
    }

    @Override // com.taobao.weex.d
    public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
        } else if (wXSDKInstance == null) {
        } else {
            Point point = this.mMeasureResult;
            if (point != null) {
                point.x = i;
            }
            Point point2 = this.mMeasureResult;
            if (point2 != null) {
                point2.y = i2;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "isRefresh", "true");
            UINode uINode = this.mUiNode;
            if (uINode != null) {
                uINode.fireEvent("loaded", jSONObject);
            }
            wXSDKInstance.am().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
            wXSDKInstance.am().layout(0, 0, i, i2);
            UINode uINode2 = this.mUiNode;
            if (uINode2 == null) {
                return;
            }
            uINode2.notifyEngineRelayout();
        }
    }

    @Override // com.taobao.weex.d
    public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "errorCode", str);
        jSONObject2.put((JSONObject) "message", str2);
        UINode uINode = this.mUiNode;
        if (uINode == null) {
            return;
        }
        uINode.fireEvent("exception", jSONObject);
    }

    @Override // com.taobao.weex.d
    public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
        } else if (wXSDKInstance == null) {
        } else {
            Point point = this.mMeasureResult;
            if (point != null) {
                point.x = i;
            }
            Point point2 = this.mMeasureResult;
            if (point2 != null) {
                point2.y = i2;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "isRefresh", "false");
            UINode uINode = this.mUiNode;
            if (uINode != null) {
                uINode.fireEvent("loaded", jSONObject);
            }
            View am = wXSDKInstance.am();
            k.a(am);
            addView(am);
            wXSDKInstance.am().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
            wXSDKInstance.am().layout(0, 0, i, i2);
            UINode uINode2 = this.mUiNode;
            if (uINode2 == null) {
                return;
            }
            uINode2.notifyEngineRelayout();
        }
    }
}
