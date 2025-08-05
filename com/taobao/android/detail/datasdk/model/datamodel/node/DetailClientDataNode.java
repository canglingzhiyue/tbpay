package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailClientDataNode extends DetailNode {
    private static final String DETAIL_CLIENT_OPT = "detailClientOpt";
    public static final String TAG = "detailClientData";
    public DetailClientOpt detailClientOpt;

    static {
        kge.a(-864789803);
    }

    public DetailClientDataNode() {
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.DetailClientDataNode");
    }

    public DetailClientDataNode(JSONObject jSONObject) {
        super(jSONObject);
        if (jSONObject != null) {
            this.detailClientOpt = new DetailClientOpt(jSONObject.getJSONObject(DETAIL_CLIENT_OPT));
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.DetailClientDataNode");
    }

    /* loaded from: classes4.dex */
    public static class DetailClientOpt extends DetailNode {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String ASYNC_MODULE_PRELOAD = "asyncModulePreload";
        private static final String CROP_DATA = "cropDataAB";
        private static final String DYNAMIC_JSON_DATA = "dynamicJsonData";
        private static final String SKU_LOAD_DELAY_TIME = "skuLoadDelayTime";
        public boolean asyncModulePreload;
        public boolean dynamicJsonData;
        public boolean hitCropData;
        public int skuLoadDelayTime;

        static {
            kge.a(294484392);
        }

        public DetailClientOpt() {
        }

        public DetailClientOpt(JSONObject jSONObject) {
            super(jSONObject);
            if (jSONObject != null) {
                this.hitCropData = jSONObject.getBooleanValue(CROP_DATA);
                this.skuLoadDelayTime = jSONObject.getIntValue(SKU_LOAD_DELAY_TIME);
                this.asyncModulePreload = jSONObject.getBooleanValue(ASYNC_MODULE_PRELOAD);
                this.dynamicJsonData = jSONObject.getBooleanValue(DYNAMIC_JSON_DATA);
            }
        }

        public static DetailClientOpt parse(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DetailClientOpt) ipChange.ipc$dispatch("e9d00dff", new Object[]{jSONObject});
            }
            DetailClientOpt detailClientOpt = new DetailClientOpt();
            if (jSONObject != null) {
                detailClientOpt.hitCropData = jSONObject.getBooleanValue(CROP_DATA);
                detailClientOpt.skuLoadDelayTime = jSONObject.getIntValue(SKU_LOAD_DELAY_TIME);
                detailClientOpt.asyncModulePreload = jSONObject.getBooleanValue(ASYNC_MODULE_PRELOAD);
                detailClientOpt.dynamicJsonData = jSONObject.getBooleanValue(DYNAMIC_JSON_DATA);
            }
            return detailClientOpt;
        }
    }
}
