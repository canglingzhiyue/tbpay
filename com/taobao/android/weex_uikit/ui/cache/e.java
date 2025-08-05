package com.taobao.android.weex_uikit.ui.cache;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(514364718);
    }

    public static com.taobao.android.weex_uikit.ui.e a(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_uikit.ui.e) ipChange.ipc$dispatch("daaafe03", new Object[]{uINode});
        }
        if (uINode.getNodeType() != UINodeType.VIEW) {
            return new d(uINode);
        }
        return null;
    }
}
