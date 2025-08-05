package com.taobao.android.trade.component.display;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.component.data.Component;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends b<Component> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-277246328);
    }

    public a(Context context) {
        super(context);
    }

    @Override // com.taobao.android.trade.component.display.b
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : new View(this.b, null);
    }
}
