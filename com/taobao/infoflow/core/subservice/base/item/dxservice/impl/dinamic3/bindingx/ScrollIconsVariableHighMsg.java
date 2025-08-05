package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.bindingx;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.o;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.weex_framework.util.a;
import tb.kge;

/* loaded from: classes.dex */
public class ScrollIconsVariableHighMsg extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ICON_SCROLL_SOURCE_ID = "icon_ref";
    private JSONObject mParamJson;

    static {
        kge.a(1201978912);
    }

    public static /* synthetic */ Object ipc$super(ScrollIconsVariableHighMsg scrollIconsVariableHighMsg, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ScrollIconsVariableHighMsg() {
        init();
    }

    public void postMessage(DinamicXEngine dinamicXEngine, DXRootView dXRootView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb92f60", new Object[]{this, dinamicXEngine, dXRootView, new Integer(i), new Integer(i2)});
        } else if (dXRootView == null) {
        } else {
            setXOffset(i);
            setOffSetH(i2);
            setWidgetNode(dXRootView.getExpandWidgetNode());
            this.mParamJson.put("action", (Object) o.SCROLLING);
            dinamicXEngine.a(dXRootView, (Object) this);
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mParamJson = new JSONObject();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(a.ATOM_EXT_repeat, (Object) String.valueOf(Boolean.FALSE));
        jSONObject.put("resetOnExit", (Object) String.valueOf(Boolean.TRUE));
        jSONObject.put("resetOnCancel", (Object) String.valueOf(Boolean.TRUE));
        jSONObject.put("resetOnFinish", (Object) String.valueOf(Boolean.FALSE));
        this.mParamJson.put("mode", (Object) "scroll");
        this.mParamJson.put("action", (Object) o.SCROLLING);
        this.mParamJson.put("sourceId", (Object) ICON_SCROLL_SOURCE_ID);
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

    private void setOffSetH(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197683c9", new Object[]{this, new Integer(i)});
        } else {
            this.mParamJson.put("offsetY", (Object) Integer.valueOf(i));
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
}
