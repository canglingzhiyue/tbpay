package com.taobao.android.searchbaseframe.business.srp;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ira;
import tb.irb;
import tb.ird;
import tb.ire;
import tb.irp;
import tb.ise;
import tb.ito;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static final ise<Void, ira> TAB_PRESENTER_CREATOR;
    public static final ise<Void, ? extends ire> TAB_VIEW_CREATOR;
    public ise<Void, ? extends ire> b = TAB_VIEW_CREATOR;
    public ise<Void, ? extends ird> d = TAB_PRESENTER_CREATOR;
    public ise<irp, ? extends ito> g;

    static {
        kge.a(308271838);
        TAB_VIEW_CREATOR = new ise<Void, ire>() { // from class: com.taobao.android.searchbaseframe.business.srp.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public ire a(Void r4) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ire) ipChange.ipc$dispatch("2284483b", new Object[]{this, r4}) : new irb();
            }
        };
        TAB_PRESENTER_CREATOR = new ise<Void, ira>() { // from class: com.taobao.android.searchbaseframe.business.srp.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public ira a(Void r4) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ira) ipChange.ipc$dispatch("228447bf", new Object[]{this, r4}) : new ira();
            }
        };
    }
}
