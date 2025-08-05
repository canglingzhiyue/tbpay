package com.alibaba.ariver.app.api.ui.tabbar.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class TabBarItemColorModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField

    /* renamed from: a  reason: collision with root package name */
    private String f2896a;
    @JSONField
    private String b;

    static {
        kge.a(-1158187719);
    }

    public String getIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e32456a", new Object[]{this}) : this.f2896a;
    }

    public void setIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c95a84c", new Object[]{this, str});
        } else {
            this.f2896a = str;
        }
    }

    public String getActiveIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("515984", new Object[]{this}) : this.b;
    }

    public void setActiveIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c35e72", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }
}
