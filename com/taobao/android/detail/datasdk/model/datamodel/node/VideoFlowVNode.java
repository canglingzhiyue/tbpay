package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import tb.emu;
import tb.epw;
import tb.kge;

/* loaded from: classes4.dex */
public class VideoFlowVNode extends DetailNode {
    public String bitmap;

    static {
        kge.a(-1403036420);
    }

    public VideoFlowVNode(JSONObject jSONObject) {
        super(jSONObject);
        this.bitmap = "";
        this.bitmap = epw.a(jSONObject.getString(IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP));
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.VideoFlowVNode");
    }
}
