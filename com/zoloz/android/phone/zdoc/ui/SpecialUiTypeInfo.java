package com.zoloz.android.phone.zdoc.ui;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class SpecialUiTypeInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "layout")
    private String layout;
    @JSONField(name = "name")
    private String name;
    @JSONField(name = "textResId")
    private String testResId;

    static {
        kge.a(1406006607);
        kge.a(1028243835);
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public String getLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc2f24d9", new Object[]{this}) : this.layout;
    }

    public void setLayout(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695f63bd", new Object[]{this, str});
        } else {
            this.layout = str;
        }
    }

    public String getTestResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e12aeb26", new Object[]{this}) : this.testResId;
    }

    public void setTestResId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6703578", new Object[]{this, str});
        } else {
            this.testResId = str;
        }
    }
}
