package com.taobao.message.kit.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class Span {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int end;
    public int start;
    public String str;

    static {
        kge.a(1316705539);
    }

    public int getStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8070b926", new Object[]{this})).intValue() : this.start;
    }

    public int getEnd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ddee639f", new Object[]{this})).intValue() : this.end;
    }

    public String getStr() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a2117ade", new Object[]{this}) : this.str;
    }

    public Span(String str, int i, int i2) {
        this.start = i;
        this.end = i2;
        this.str = str;
    }
}
