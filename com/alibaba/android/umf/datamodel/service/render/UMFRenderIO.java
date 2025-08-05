package com.alibaba.android.umf.datamodel.service.render;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.b;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class UMFRenderIO extends UMFBaseIO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final b mDirtyMap;
    private final List<AURARenderComponent> mRenderTreeList;

    static {
        kge.a(581028957);
    }

    @Deprecated
    public UMFRenderIO(List<AURARenderComponent> list, b bVar) {
        this.mRenderTreeList = list;
        this.mDirtyMap = bVar;
    }

    @Deprecated
    public List<AURARenderComponent> getRenderTreeList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("835dabd8", new Object[]{this});
        }
        List<AURARenderComponent> list = this.mRenderTreeList;
        return list == null ? new ArrayList() : list;
    }

    @Deprecated
    public b getDirtyMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("b8715794", new Object[]{this}) : this.mDirtyMap;
    }
}
