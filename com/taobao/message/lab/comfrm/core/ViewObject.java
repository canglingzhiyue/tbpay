package com.taobao.message.lab.comfrm.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.inner2.Diff;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class ViewObject implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Deprecated
    public Map<String, Object> children;
    public Serializable data;
    public transient Diff diff;
    public int[] indexs;
    public LayoutInfo info;
    public transient boolean isSnapshot;
    public transient boolean isStateLoadSourceReady;
    public transient SharedState sharedState;
    public transient String traceId;
    public String uniqueId;

    static {
        kge.a(1672837634);
        kge.a(1028243835);
    }

    public ViewObject() {
        this.children = new HashMap(4);
    }

    public ViewObject(ViewObject viewObject) {
        this.children = new HashMap(4);
        this.uniqueId = viewObject.uniqueId;
        this.data = viewObject.data;
        this.children = viewObject.children;
        this.info = viewObject.info;
        this.indexs = viewObject.indexs;
        this.traceId = viewObject.traceId;
    }

    public ViewObject(LayoutInfo layoutInfo, Serializable serializable) {
        this.children = new HashMap(4);
        this.info = layoutInfo;
        this.data = serializable;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ViewObject{info=" + this.info + ", data=" + this.data + '}';
    }
}
