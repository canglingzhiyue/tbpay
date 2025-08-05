package com.taobao.message.lab.comfrm.render;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class RenderResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RenderError error;

    static {
        kge.a(1346656634);
    }

    public RenderResult(RenderError renderError) {
        this.error = renderError;
    }

    public RenderResult() {
    }

    public RenderError getError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RenderError) ipChange.ipc$dispatch("19dc30a1", new Object[]{this}) : this.error;
    }

    public boolean hasError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2d4ed19", new Object[]{this})).booleanValue() : this.error != null;
    }
}
