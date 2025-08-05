package com.taobao.android.weex_uikit.widget.overlay;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import tb.kge;

/* loaded from: classes6.dex */
public class OverlayRootNode extends UINodeGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MUSOverlay overlay;

    static {
        kge.a(1191087042);
    }

    public static /* synthetic */ Object ipc$super(OverlayRootNode overlayRootNode, String str, Object... objArr) {
        if (str.hashCode() == 56600925) {
            super.onChildrenChanged();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public OverlayRootNode(int i, MUSOverlay mUSOverlay) {
        super(i);
        this.overlay = mUSOverlay;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup
    public void onChildrenChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35fa95d", new Object[]{this});
            return;
        }
        super.onChildrenChanged();
        this.overlay.childrenChanged();
    }

    public MUSOverlay getOverlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSOverlay) ipChange.ipc$dispatch("d265b1bb", new Object[]{this}) : this.overlay;
    }
}
