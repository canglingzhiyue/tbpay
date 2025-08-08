package com.taobao.search.musie.pager;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.div.Div;
import tb.kge;

/* loaded from: classes7.dex */
public final class TbSlideItem extends Div implements p.b, com.taobao.android.weex_uikit.ui.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private p.b callback;
    private boolean canPlay;
    private UINode videoNode;

    static {
        kge.a(1931998926);
        kge.a(1810451999);
        kge.a(-1335587443);
    }

    public static /* synthetic */ Object ipc$super(TbSlideItem tbSlideItem, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1916285496:
                super.fireNativeEvent((String) objArr[0], (String) objArr[1]);
                return null;
            case -687415253:
                return super.getNativeState((String) objArr[0]);
            case 356529068:
                super.unregisterNativeStateListener((String) objArr[0], (p.b) objArr[1]);
                return null;
            case 1658152979:
                super.registerNativeStateListener((String) objArr[0], (p.b) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.weex_framework.p.b
    public void onNativeStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63f0e06", new Object[]{this, str, str2});
        }
    }

    public TbSlideItem(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.d
    public void registerNativeStateListener(String str, UINode uINode, p.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2191683", new Object[]{this, str, uINode, bVar});
        } else if (StringUtils.equals(str, "videostatus")) {
            this.videoNode = uINode;
            this.callback = bVar;
        } else {
            super.registerNativeStateListener(str, bVar);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.d
    public void unregisterNativeStateListener(String str, UINode uINode, p.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b6b0a", new Object[]{this, str, uINode, bVar});
        } else if (StringUtils.equals(str, "videostatus")) {
            this.videoNode = null;
            this.callback = null;
        } else {
            super.unregisterNativeStateListener(str, bVar);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.d
    public String getNativeState(String str, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c0b91ed", new Object[]{this, str, uINode});
        }
        if (!StringUtils.equals(str, "videostatus")) {
            return super.getNativeState(str);
        }
        return this.canPlay ? "play" : "stop";
    }

    public final void setCanPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d90c0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.canPlay = z;
        notifyVideoPlayStatus(this.videoNode, z ? "play" : "stop");
    }

    private final void notifyVideoPlayStatus(UINode uINode, String str) {
        p.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90aa07d3", new Object[]{this, uINode, str});
        } else if (uINode == null || (bVar = this.callback) == null) {
        } else {
            bVar.onNativeStateChange("videostatus", str);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode, com.taobao.android.weex_uikit.ui.d
    public void fireNativeEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc7cdc8", new Object[]{this, str, str2});
        } else if (StringUtils.equals(str, "videocallback")) {
            if (!StringUtils.equals(str2, "finish")) {
                return;
            }
            UINode parentNode = getParentNode();
            if (!(parentNode instanceof TbSlideDelegateNode)) {
                parentNode = null;
            }
            TbSlideDelegateNode tbSlideDelegateNode = (TbSlideDelegateNode) parentNode;
            if (tbSlideDelegateNode == null) {
                return;
            }
            tbSlideDelegateNode.playNextVideo(this);
        } else {
            super.fireNativeEvent(str, str2);
        }
    }

    public final boolean hasVideoChild() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c423aa6", new Object[]{this})).booleanValue() : this.videoNode != null;
    }

    public final boolean canPlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d7069af", new Object[]{this})).booleanValue() : this.canPlay;
    }
}
