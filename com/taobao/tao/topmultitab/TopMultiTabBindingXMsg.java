package com.taobao.tao.topmultitab;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.o;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.tao.homepage.f;
import tb.kge;

/* loaded from: classes.dex */
public class TopMultiTabBindingXMsg extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject mParamJson = new JSONObject();

    static {
        kge.a(-2057024357);
    }

    public static /* synthetic */ Object ipc$super(TopMultiTabBindingXMsg topMultiTabBindingXMsg, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TopMultiTabBindingXMsg() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_repeat, (Object) String.valueOf(Boolean.FALSE));
        jSONObject.put("resetOnExit", (Object) String.valueOf(Boolean.TRUE));
        jSONObject.put("resetOnCancel", (Object) String.valueOf(Boolean.TRUE));
        jSONObject.put("resetOnFinish", (Object) String.valueOf(Boolean.FALSE));
        this.mParamJson.put("mode", (Object) "scroll");
        this.mParamJson.put("action", (Object) o.SCROLLING);
        this.mParamJson.put("sourceId", (Object) "home_scroll_tab");
        this.mParamJson.put("args", (Object) jSONObject);
        this.mParamJson.put("offsetX", (Object) 0);
        this.mParamJson.put("offsetY", (Object) 1);
        put("type", "BNDX");
        put("params", (Object) this.mParamJson);
    }

    private void setXOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df25b893", new Object[]{this, new Integer(i)});
        } else {
            this.mParamJson.put("offsetX", (Object) Integer.valueOf(i));
        }
    }

    private void setWidgetNode(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d421aa20", new Object[]{this, dXWidgetNode});
        } else {
            this.mParamJson.put("widget", (Object) dXWidgetNode);
        }
    }

    public void postMessage(DXRootView dXRootView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21f0914", new Object[]{this, dXRootView, new Integer(i)});
        } else if (dXRootView == null) {
        } else {
            setXOffset(i);
            setWidgetNode(dXRootView.getExpandWidgetNode());
            this.mParamJson.put("action", (Object) o.SCROLLING);
            f.a().b().a(dXRootView, (Object) this);
        }
    }

    public void postMessageEnd(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c14b051c", new Object[]{this, dXRootView});
        } else if (dXRootView == null) {
        } else {
            setWidgetNode(dXRootView.getExpandWidgetNode());
            this.mParamJson.put("action", (Object) "scroll_end");
            f.a().b().a(dXRootView, (Object) this);
        }
    }
}
