package com.taobao.search.musie.videoscroll;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import tb.kge;

/* loaded from: classes7.dex */
public class VideoScrollNodeRTL extends VideoScrollNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-594921437);
    }

    public VideoScrollNodeRTL(int i) {
        super(i);
    }

    @Override // com.taobao.search.musie.videoscroll.VideoScrollNode
    public void onHorizontalScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d71fa14c", new Object[]{this, new Integer(i)});
            return;
        }
        int y = getNodeInfo().y();
        if (this.lastPlayingVideo != null && isTotalVisible(i, y, this.lastPlayingVideo.getGlobalVisibleRect())) {
            return;
        }
        if (this.lastPlayingVideo != null) {
            UINode uINode = this.lastPlayingVideo;
            this.lastPlayingVideo = null;
            notifyVideoPlayStatus(uINode, "stop");
        }
        int size = this.observingChildren.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            UINode uINode2 = this.observingChildren.get(size);
            if (uINode2.isMounted() && isTotalVisible(i, y, uINode2.getGlobalVisibleRect())) {
                this.lastPlayingVideo = uINode2;
                break;
            }
            size--;
        }
        notifyVideoPlayStatus(this.lastPlayingVideo, "play");
    }

    @Override // com.taobao.search.musie.videoscroll.VideoScrollNode
    public void onVideoStateChange(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd87f0f6", new Object[]{this, str});
            return;
        }
        if (TextUtils.equals(str, "finish")) {
            UINode uINode = this.lastPlayingVideo;
            this.lastPlayingVideo = null;
            int y = getNodeInfo().y();
            int size = this.observingChildren.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                UINode uINode2 = this.observingChildren.get(size);
                if (!z) {
                    if (uINode2 == uINode) {
                        z = true;
                    }
                    size--;
                } else if (isTotalVisible(this.parentNode.getLastScrollX(), y, uINode2.getGlobalVisibleRect())) {
                    this.lastPlayingVideo = uINode2;
                }
            }
        }
        notifyVideoPlayStatus(this.lastPlayingVideo, "play");
    }
}
