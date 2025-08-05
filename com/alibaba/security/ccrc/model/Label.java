package com.alibaba.security.ccrc.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Label {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String name;
    public final String value;

    public Label(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this}) : this.value;
    }
}
