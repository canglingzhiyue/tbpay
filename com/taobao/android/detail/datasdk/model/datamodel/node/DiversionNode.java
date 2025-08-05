package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DiversionNode extends DetailNode {
    public static final String TAG = "diversion";
    public DetailTopSearchNode mSearchData;

    static {
        kge.a(-141372536);
    }

    public DiversionNode() {
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.DiversionNode");
    }

    public DiversionNode(JSONObject jSONObject) {
        super(jSONObject);
        if (jSONObject == null) {
            return;
        }
        this.mSearchData = new DetailTopSearchNode(jSONObject.getJSONObject("detailTopSearch"));
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.DiversionNode");
    }

    /* loaded from: classes4.dex */
    public static class DetailTopSearchNode implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String mUrl;
        private String mUtParams;

        static {
            kge.a(857127666);
            kge.a(1028243835);
        }

        public DetailTopSearchNode(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.mUrl = jSONObject.getString("url");
                this.mUtParams = jSONObject.getString("utParams");
            }
        }

        public String getUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.mUrl;
        }

        public String getUtParams() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e3001b5e", new Object[]{this}) : this.mUtParams;
        }
    }
}
