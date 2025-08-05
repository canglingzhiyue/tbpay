package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class bp extends j implements bi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-898986370);
        kge.a(33300609);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode queryWidgetNodeByUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("ffaa925b", new Object[]{this, str});
        }
        if (getFlattenNode() != null) {
            return getFlattenNode().a(str);
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    @Deprecated
    public DXWidgetNode queryWTByUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("45e63272", new Object[]{this, str});
        }
        if (getFlattenNode() != null) {
            return getFlattenNode().b(str);
        }
        return null;
    }
}
