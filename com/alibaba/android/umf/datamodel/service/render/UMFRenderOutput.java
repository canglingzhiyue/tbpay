package com.alibaba.android.umf.datamodel.service.render;

import android.view.View;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UMFRenderOutput extends UMFBaseIO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, View> mViews;

    static {
        kge.a(914707672);
    }

    public Map<String, View> getViews() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ea59a134", new Object[]{this}) : this.mViews;
    }

    public void setViews(Map<String, View> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("868f572", new Object[]{this, map});
        } else {
            this.mViews = map;
        }
    }
}
