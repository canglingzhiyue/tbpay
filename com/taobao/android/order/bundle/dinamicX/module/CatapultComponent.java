package com.taobao.android.order.bundle.dinamicX.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class CatapultComponent implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String businessGroup;
    public JSONObject data;
    public JSONObject extraData;
    private String md5;
    private int pageHeight;
    private String scm;
    private String url;

    static {
        kge.a(-1154435313);
        kge.a(1028243835);
    }

    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this}) : this.data;
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else {
            this.data = jSONObject;
        }
    }

    public JSONObject getExtraData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("fcd272cb", new Object[]{this}) : this.extraData;
    }

    public void setExtraData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f706a0b1", new Object[]{this, jSONObject});
        } else {
            this.extraData = jSONObject;
        }
    }

    public String getBusinessGroup() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a936fb0", new Object[]{this}) : this.businessGroup;
    }

    public void setBusinessGroup(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7a682e", new Object[]{this, str});
        } else {
            this.businessGroup = str;
        }
    }

    public String getScm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1429a872", new Object[]{this}) : this.scm;
    }

    public void setScm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9848ac", new Object[]{this, str});
        } else {
            this.scm = str;
        }
    }

    public int getPageHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c58e8f06", new Object[]{this})).intValue() : this.pageHeight;
    }

    public void setPageHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231a5fc4", new Object[]{this, new Integer(i)});
        } else {
            this.pageHeight = i;
        }
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.url;
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    public String getMd5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91115b1", new Object[]{this}) : this.md5;
    }

    public void setMd5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e834d", new Object[]{this, str});
        } else {
            this.md5 = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CatapultComponent{businessGroup=" + this.businessGroup + ", scm=" + this.scm + ", pageHeight=" + this.pageHeight + ", url='" + this.url + "', md5='" + this.md5 + ", extraData='" + this.extraData + "', data='" + this.data + '}';
    }
}
