package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.sdk.utils.c;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class VideoFlowVNode extends DetailNode {
    public String bitmap;

    static {
        kge.a(-1638803658);
    }

    public VideoFlowVNode(JSONObject jSONObject) {
        super(jSONObject);
        this.bitmap = "";
        this.bitmap = c.a(jSONObject.getString(IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP));
        tpc.a("com.taobao.android.detail.sdk.model.node.VideoFlowVNode");
    }
}
