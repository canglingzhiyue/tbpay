package com.alibaba.android.aura.datamodel.render;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class AURARenderIO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AURARenderComponent mRenderTree;

    static {
        kge.a(-752707811);
        kge.a(1028243835);
    }

    public AURARenderIO(AURARenderComponent aURARenderComponent) {
        this.mRenderTree = aURARenderComponent;
    }

    public AURARenderComponent getRenderTree() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("5786897c", new Object[]{this}) : this.mRenderTree;
    }
}
