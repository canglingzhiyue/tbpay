package com.taobao.message.lab.comfrm.inner2;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class SplitPart<T, INDEX> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private T data;
    private INDEX index;
    private String type;

    static {
        kge.a(-61481236);
    }

    public SplitPart() {
    }

    public SplitPart(String str, T t, INDEX index) {
        this.type = str;
        this.data = t;
        this.index = index;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
    }

    public T getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("4ca84d6b", new Object[]{this}) : this.data;
    }

    public INDEX getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INDEX) ipChange.ipc$dispatch("77774bef", new Object[]{this}) : this.index;
    }
}
