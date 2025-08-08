package com.taobao.search.musie.videoscroll;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.scroller.BaseScroller;
import com.taobao.android.weex_uikit.widget.scroller.Scroller;
import com.taobao.android.weex_uikit.widget.scroller.ScrollerRootNode;
import tb.kge;

/* loaded from: classes7.dex */
public class MUSVideoScroll extends Scroller {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_AUTO_PLAY = "autoplay";
    private int lastScrollX;
    private VideoScrollNode scrollNode;

    static {
        kge.a(639759168);
    }

    public static /* synthetic */ Object ipc$super(MUSVideoScroll mUSVideoScroll, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1916285496:
                super.fireNativeEvent((String) objArr[0], (String) objArr[1]);
                return null;
            case -687415253:
                return super.getNativeState((String) objArr[0]);
            case -285278287:
                super.onMount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case -136526582:
                super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case 2146603619:
                return new Boolean(super.onUpdateAttr((UINode) objArr[0], (String) objArr[1], (MUSValue) objArr[2]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public MUSVideoScroll(int i) {
        super(i);
        this.scrollListener = new com.taobao.search.musie.videoscroll.a(this);
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.Scroller
    public ScrollerRootNode getScrollerRootNode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollerRootNode) ipChange.ipc$dispatch("229d20dd", new Object[]{this, new Integer(i)});
        }
        this.scrollNode = m.f() ? new VideoScrollNodeRTL(i) : new VideoScrollNode(i);
        return this.scrollNode;
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.BaseScroller, com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(UINode uINode, String str, MUSValue mUSValue) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff29263", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        if (!StringUtils.equals(str, "autoplay")) {
            return super.onUpdateAttr(uINode, str, mUSValue);
        }
        if (mUSValue != null) {
            try {
            } catch (IllegalStateException unused) {
                setAttribute("autoplay", false);
            }
            if (mUSValue.getBoolValue()) {
                z = true;
                setAttribute("autoplay", Boolean.valueOf(z));
                return true;
            }
        }
        z = false;
        setAttribute("autoplay", Boolean.valueOf(z));
        return true;
    }

    public int getLastScrollX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e1597779", new Object[]{this})).intValue() : this.lastScrollX;
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.BaseScroller, com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        this.lastScrollX = 0;
    }

    public void onRealTimeScroll(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931d4", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (!StringUtils.equals("play", super.getNativeState("videostatus"))) {
            super.fireNativeEvent("videocallback", "start");
            if (g.a()) {
                g.a("fireNativeEvent(Video.VIDEO_CALLBACK, Video.STATUS_START) to require playable status");
            }
        }
        this.lastScrollX = i;
        if (!(view instanceof HorizontalScrollView)) {
            return;
        }
        this.scrollNode.onHorizontalScroll(i);
    }

    private boolean isAutoplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("345106b8", new Object[]{this})).booleanValue();
        }
        Object attribute = getAttribute("autoplay");
        return attribute != null && ((Boolean) attribute).booleanValue();
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.BaseScroller, com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        if (com.taobao.android.weex_uikit.widget.scroller.a.b(this) != 2) {
            g.d("only support scrollDirection:horizontal");
        }
        if (!isAutoplay()) {
            return;
        }
        mUSDKInstance.updateNativeState("videostatus", "play");
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public String getNativeState(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d706e02b", new Object[]{this, str}) : (!StringUtils.equals(str, "videostatus") || !isAutoplay()) ? super.getNativeState(str) : "play";
    }

    /* loaded from: classes7.dex */
    public static class a extends Scroller.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1976699984);
        }

        @Override // com.taobao.android.weex_uikit.widget.scroller.Scroller.a, com.taobao.android.weex_uikit.widget.scroller.BaseScroller.a, com.taobao.android.weex_framework.ui.l
        public /* synthetic */ INode a(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (INode) ipChange.ipc$dispatch("91d13828", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}) : c(mUSDKInstance, i, mUSProps, mUSProps2);
        }

        @Override // com.taobao.android.weex_uikit.widget.scroller.Scroller.a, com.taobao.android.weex_uikit.widget.scroller.BaseScroller.a
        public /* synthetic */ BaseScroller b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BaseScroller) ipChange.ipc$dispatch("151b8166", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}) : c(mUSDKInstance, i, mUSProps, mUSProps2);
        }

        public MUSVideoScroll c(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MUSVideoScroll) ipChange.ipc$dispatch("c2bf1712", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            MUSVideoScroll mUSVideoScroll = new MUSVideoScroll(i);
            mUSVideoScroll.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                mUSVideoScroll.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                mUSVideoScroll.updateAttrs(mUSProps2);
            }
            return mUSVideoScroll;
        }
    }
}
