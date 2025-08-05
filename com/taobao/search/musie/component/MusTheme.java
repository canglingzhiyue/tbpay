package com.taobao.search.musie.component;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.android.tbtheme.kit.g;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import tb.kge;

/* loaded from: classes7.dex */
public final class MusTheme extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2013689996);
    }

    public MusTheme(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.VIEW;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public Object createMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2275846d", new Object[]{this, context});
        }
        ThemeFrameLayout a2 = j.a().a(context, new g("search", 0));
        return a2 == null ? new View(context) : a2;
    }
}
