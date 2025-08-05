package com.taobao.tbreachflow.shortcuts.bean;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes9.dex */
public class ContentMapVO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ShortcutsVO shortcuts;

    public ShortcutsVO getShortcuts() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShortcutsVO) ipChange.ipc$dispatch("5f589717", new Object[]{this}) : this.shortcuts;
    }

    public void setShortcuts(ShortcutsVO shortcutsVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bc7f37", new Object[]{this, shortcutsVO});
        } else {
            this.shortcuts = shortcutsVO;
        }
    }
}
