package com.taobao.android.detail.sdk.model.sku;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class BaseSkuInputComponent extends BaseSkuComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String data;
    public String key;
    public int type;

    /* loaded from: classes4.dex */
    public static class Element implements Serializable {
        public String altImg;
        public String altText;
        public String altTextClickAction;
        public String altTitle;
        public boolean changeable;
        public String clickAltTextUT;
        public String clickTextUT;
        public boolean selected;
        public String subText;
        public String text;
        public String value;

        static {
            kge.a(-1814506817);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1039090567);
    }

    public BaseSkuInputComponent() {
        tpc.a("com.taobao.android.detail.sdk.model.sku.BaseSkuInputComponent");
    }

    public BaseSkuInputComponent parse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSkuInputComponent) ipChange.ipc$dispatch("a5c66744", new Object[]{this});
        }
        int i = this.type;
        if (i == 1) {
            return (BaseSkuInputComponent) JSON.parseObject(this.data, SkuCheckBoxData.class);
        }
        if (i == 2) {
            return (BaseSkuInputComponent) JSON.parseObject(this.data, SkuRadioBoxData.class);
        }
        if (i == 3) {
            return (BaseSkuInputComponent) JSON.parseObject(this.data, SkuTreeData.class);
        }
        return null;
    }
}
