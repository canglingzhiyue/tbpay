package com.taobao.infoflow.core.subservice.biz.outlinkservice.impl.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class OutLinkModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "OutLinkModel";
    private String area;
    private JSONObject args;
    private String biz;
    private String index;

    static {
        kge.a(859012730);
        kge.a(1028243835);
    }

    public String getArea() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("160cc5d6", new Object[]{this}) : this.area;
    }

    public void setArea(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400b3560", new Object[]{this, str});
        } else {
            this.area = str;
        }
    }

    public String getBiz() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ea033d3c", new Object[]{this}) : this.biz;
    }

    public void setArgs(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9679c24a", new Object[]{this, jSONObject});
        } else {
            this.args = jSONObject;
        }
    }

    public void setIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e39821", new Object[]{this, str});
        } else {
            this.index = str;
        }
    }

    public void setBiz(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f14d22", new Object[]{this, str});
        } else {
            this.biz = str;
        }
    }

    public JSONObject getArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this}) : this.args;
    }

    public int getOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c7531f83", new Object[]{this})).intValue() : parseOffset(this.index);
    }

    private int parseOffset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b973932a", new Object[]{this, str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            ldf.d(TAG, "解析偏移量出错，偏移量是 " + str);
            return 0;
        }
    }
}
