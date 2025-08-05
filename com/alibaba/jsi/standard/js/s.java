package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class s extends l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String c;

    static {
        kge.a(-1747783426);
    }

    @Override // com.alibaba.jsi.standard.js.w
    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public s(String str) {
        super(null, 0L);
        this.c = str;
    }

    public String p_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("189e7c6a", new Object[]{this}) : this.c;
    }

    @Override // com.alibaba.jsi.standard.js.w
    public String a_(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cb92a9ee", new Object[]{this, dVar}) : this.c;
    }

    @Override // com.alibaba.jsi.standard.js.w
    public w b(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (w) ipChange.ipc$dispatch("8d90a414", new Object[]{this, dVar}) : new s(this.c);
    }
}
