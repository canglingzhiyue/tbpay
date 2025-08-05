package com.taobao.android.detail.sdk.structure;

import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.vmodel.main.MainViewModel;
import java.util.List;
import tb.exa;
import tb.exb;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class e extends c<MainViewModel> {
    public com.taobao.android.detail.sdk.model.node.a b;
    public exa c;
    public exb d;

    static {
        kge.a(-1661518210);
    }

    public e(NodeBundle nodeBundle, List<MainViewModel> list, exa exaVar, exb exbVar) {
        super(list);
        this.b = new com.taobao.android.detail.sdk.model.node.a(nodeBundle);
        this.c = exaVar;
        this.d = exbVar;
        tpc.a("com.taobao.android.detail.sdk.structure.MainStructure");
    }
}
