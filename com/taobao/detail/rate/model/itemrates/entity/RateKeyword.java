package com.taobao.detail.rate.model.itemrates.entity;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class RateKeyword implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RATE_TYPE_NEGATIVE = 1;
    public static final int RATE_TYPE_POSITIVE = 0;
    @JSONField(name = "labelId")
    public String attribute;
    public String attributeId;
    public String count;
    public String level;
    public JSONArray subImprList;
    @JSONField(name = "title")
    public String word;
    public int type = 0;
    public int status = 1;
    private int rateType = 100;

    public JSONArray getSubImprList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("3ec8d09", new Object[]{this}) : this.subImprList;
    }

    public void setSubImprList(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3728931", new Object[]{this, jSONArray});
        } else {
            this.subImprList = jSONArray;
        }
    }

    public String getLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("33eab9eb", new Object[]{this}) : this.level;
    }

    public void setLevel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6451953", new Object[]{this, str});
        } else {
            this.level = str;
        }
    }

    public String getAttributeId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("934fa9f8", new Object[]{this}) : this.attributeId;
    }

    public void setAttributeId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee5cc3e6", new Object[]{this, str});
        } else {
            this.attributeId = str;
        }
    }

    public String getWord() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d644af79", new Object[]{this}) : this.word;
    }

    public void setWord(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d0801d", new Object[]{this, str});
        } else {
            this.word = str;
        }
    }

    public String getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("21147940", new Object[]{this}) : this.count;
    }

    public void setCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae53449e", new Object[]{this, str});
        } else {
            this.count = str;
        }
    }

    public String getAttribute() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("510a9ed3", new Object[]{this}) : this.attribute;
    }

    public void setAttribute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5286f76b", new Object[]{this, str});
        } else {
            this.attribute = str;
        }
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.type;
    }

    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.type = i;
        }
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue() : this.status;
    }

    public void setStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384790e8", new Object[]{this, new Integer(i)});
        } else {
            this.status = i;
        }
    }

    public int getRateType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("44754a2a", new Object[]{this})).intValue() : this.rateType;
    }

    public void setRateType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0ad620", new Object[]{this, new Integer(i)});
        } else {
            this.rateType = i;
        }
    }

    /* renamed from: clone */
    public RateKeyword m1060clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RateKeyword) ipChange.ipc$dispatch("9aff653f", new Object[]{this});
        }
        try {
            return (RateKeyword) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
