package com.alibaba.android.aura.datamodel;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class Topic<T extends Serializable> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final T data;
    private final String name;

    static {
        kge.a(-621889196);
        kge.a(1028243835);
    }

    public Topic(String str, T t) {
        this.name = str;
        this.data = t;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public T getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("9c7e95a3", new Object[]{this}) : this.data;
    }
}
