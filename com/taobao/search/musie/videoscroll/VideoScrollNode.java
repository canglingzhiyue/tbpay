package com.taobao.search.musie.videoscroll;

import android.graphics.Rect;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.j;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.d;
import com.taobao.android.weex_uikit.ui.s;
import com.taobao.android.weex_uikit.widget.scroller.ScrollerRootNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes7.dex */
public class VideoScrollNode extends ScrollerRootNode implements p.b, d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Comparator<UINode> LEFT_COMPARATOR;
    public static final String TAG = "mus-video-scroll";
    public UINode lastPlayingVideo;
    public final Map<String, Map<UINode, p.b>> nativeStateObservers;
    public List<UINode> observingChildren;
    public MUSVideoScroll parentNode;
    public Set<String> registeredEvents;
    public String videoStatus;

    public static /* synthetic */ Object ipc$super(VideoScrollNode videoScrollNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1916285496:
                super.fireNativeEvent((String) objArr[0], (String) objArr[1]);
                return null;
            case -1546257180:
                super.updateLayoutState((s) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -687415253:
                return super.getNativeState((String) objArr[0]);
            case -285278287:
                super.onMount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case -136526582:
                super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case 213310163:
                super.setParentNode((UINode) objArr[0]);
                return null;
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

    static {
        kge.a(-503317305);
        kge.a(-1335587443);
        kge.a(1810451999);
        LEFT_COMPARATOR = new Comparator<UINode>() { // from class: com.taobao.search.musie.videoscroll.VideoScrollNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(UINode uINode, UINode uINode2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, uINode, uINode2})).intValue() : a(uINode, uINode2);
            }

            public int a(UINode uINode, UINode uINode2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("eae81b5b", new Object[]{this, uINode, uINode2})).intValue();
                }
                int i = uINode.getGlobalVisibleRect().left;
                int i2 = uINode2.getGlobalVisibleRect().left;
                if (i != i2) {
                    return i - i2;
                }
                return 0;
            }
        };
    }

    public VideoScrollNode(int i) {
        super(i);
        this.observingChildren = new ArrayList(5);
        this.nativeStateObservers = new HashMap();
        this.registeredEvents = new HashSet();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void setParentNode(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6dad3", new Object[]{this, uINode});
            return;
        }
        super.setParentNode(uINode);
        this.parentNode = (MUSVideoScroll) uINode;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        this.lastPlayingVideo = null;
        for (String str : this.nativeStateObservers.keySet()) {
            if (!this.registeredEvents.contains(str)) {
                this.registeredEvents.add(str);
                super.registerNativeStateListener(str, this);
            }
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.ScrollerRootNode, com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void updateLayoutState(s sVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3d5fce4", new Object[]{this, sVar, new Integer(i), new Integer(i2)});
            return;
        }
        super.updateLayoutState(sVar, i, i2);
        onHorizontalScroll(this.parentNode.getLastScrollX());
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        for (String str : this.registeredEvents) {
            super.unregisterNativeStateListener(str, this);
        }
        this.registeredEvents.clear();
        this.nativeStateObservers.clear();
        this.observingChildren.clear();
        this.videoStatus = null;
        this.lastPlayingVideo = null;
    }

    @Override // com.taobao.android.weex_uikit.ui.d
    public void registerNativeStateListener(String str, UINode uINode, p.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2191683", new Object[]{this, str, uINode, bVar});
        } else if (!j.a()) {
            throw new RuntimeException("please register native state listener in main thread");
        } else {
            Map<UINode, p.b> map = this.nativeStateObservers.get(str);
            if (map == null) {
                map = new HashMap<>();
                this.nativeStateObservers.put(str, map);
            }
            map.put(uINode, bVar);
            if (!this.registeredEvents.contains(str)) {
                super.registerNativeStateListener(str, this);
                this.registeredEvents.add(str);
            }
            if (!StringUtils.equals(str, "videostatus")) {
                return;
            }
            this.observingChildren.add(uINode);
            Collections.sort(this.observingChildren, LEFT_COMPARATOR);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.d
    public void unregisterNativeStateListener(String str, UINode uINode, p.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b6b0a", new Object[]{this, str, uINode, bVar});
        } else if (!j.a()) {
            throw new RuntimeException("please unregister native state listener in main thread");
        } else {
            Map<UINode, p.b> map = this.nativeStateObservers.get(str);
            if (map == null || map.isEmpty()) {
                return;
            }
            map.remove(uINode);
            if (!StringUtils.equals(str, "videostatus")) {
                return;
            }
            this.observingChildren.remove(uINode);
            if (uINode != this.lastPlayingVideo) {
                return;
            }
            this.lastPlayingVideo = null;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode, com.taobao.android.weex_uikit.ui.d
    public void fireNativeEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc7cdc8", new Object[]{this, str, str2});
        } else if (StringUtils.equals(str, "videocallback")) {
            onVideoStateChange(str2);
        } else {
            super.fireNativeEvent(str, str2);
        }
    }

    public void onVideoStateChange(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd87f0f6", new Object[]{this, str});
            return;
        }
        if (StringUtils.equals(str, "finish")) {
            UINode uINode = this.lastPlayingVideo;
            this.lastPlayingVideo = null;
            int y = getNodeInfo().y();
            int size = this.observingChildren.size();
            boolean z = false;
            while (true) {
                if (i >= size) {
                    break;
                }
                UINode uINode2 = this.observingChildren.get(i);
                if (!z) {
                    if (uINode2 == uINode) {
                        z = true;
                    }
                    i++;
                } else if (isTotalVisible(this.parentNode.getLastScrollX(), y, uINode2.getGlobalVisibleRect())) {
                    this.lastPlayingVideo = uINode2;
                }
            }
        }
        notifyVideoPlayStatus(this.lastPlayingVideo, "play");
    }

    @Override // com.taobao.android.weex_uikit.ui.d
    public String getNativeState(String str, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c0b91ed", new Object[]{this, str, uINode});
        }
        if (StringUtils.equals(str, "videostatus")) {
            if (this.videoStatus == null) {
                this.videoStatus = super.getNativeState(str);
                onVideoStatusChanged(this.videoStatus);
            }
            if (this.lastPlayingVideo != null || !isTotalVisible(this.parentNode.getLastScrollX(), getNodeInfo().y(), uINode.getGlobalVisibleRect())) {
                return uINode == this.lastPlayingVideo ? this.videoStatus : "stop";
            }
            if (StringUtils.equals(this.videoStatus, "play")) {
                this.lastPlayingVideo = uINode;
            }
            return this.videoStatus;
        }
        return super.getNativeState(str);
    }

    @Override // com.taobao.android.weex_framework.p.b
    public void onNativeStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63f0e06", new Object[]{this, str, str2});
        } else if (StringUtils.equals(str, "videostatus")) {
            this.videoStatus = str2;
            onVideoStatusChanged(str2);
        } else {
            Map<UINode, p.b> map = this.nativeStateObservers.get(str);
            if (map == null || map.isEmpty()) {
                return;
            }
            for (p.b bVar : map.values()) {
                bVar.onNativeStateChange(str, str2);
            }
        }
    }

    private void onVideoStatusChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657d0bf7", new Object[]{this, str});
            return;
        }
        if (g.a()) {
            g.a(str == null ? "" : str);
        }
        if (StringUtils.equals(str, "play")) {
            onHorizontalScroll(this.parentNode.getLastScrollX());
            return;
        }
        UINode uINode = this.lastPlayingVideo;
        this.lastPlayingVideo = null;
        notifyVideoPlayStatus(uINode, "stop");
    }

    public void notifyVideoPlayStatus(UINode uINode, String str) {
        Map<UINode, p.b> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90aa07d3", new Object[]{this, uINode, str});
        } else if (uINode == null || (map = this.nativeStateObservers.get("videostatus")) == null) {
        } else {
            p.b bVar = map.get(uINode);
            if (bVar != null) {
                bVar.onNativeStateChange("videostatus", str);
            }
            if (!g.a()) {
                return;
            }
            g.a(TAG, "change child index " + indexOf(uINode) + " - " + str);
        }
    }

    public void onHorizontalScroll(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d71fa14c", new Object[]{this, new Integer(i)});
            return;
        }
        int y = getNodeInfo().y();
        UINode uINode = this.lastPlayingVideo;
        if (uINode != null && isTotalVisible(i, y, uINode.getGlobalVisibleRect())) {
            return;
        }
        UINode uINode2 = this.lastPlayingVideo;
        if (uINode2 != null) {
            this.lastPlayingVideo = null;
            notifyVideoPlayStatus(uINode2, "stop");
        }
        int size = this.observingChildren.size();
        while (true) {
            if (i2 >= size) {
                break;
            }
            UINode uINode3 = this.observingChildren.get(i2);
            if (uINode3.isMounted() && isTotalVisible(i, y, uINode3.getGlobalVisibleRect())) {
                this.lastPlayingVideo = uINode3;
                break;
            }
            i2++;
        }
        notifyVideoPlayStatus(this.lastPlayingVideo, "play");
    }

    public boolean isTotalVisible(int i, int i2, Rect rect) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cdf71bbe", new Object[]{this, new Integer(i), new Integer(i2), rect})).booleanValue() : rect.left >= i && rect.right <= i + i2;
    }
}
