package com.taobao.android.weex_uikit.ui;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlay;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static final String A = "a";
    public static final String CELL = "cell";
    public static final String DIV = "div";
    public static final String IMAGE = "image";
    public static final String IMG = "img";
    public static final String INPUT = "input";
    public static final String MUS_VIEW = "mus-view";
    public static final String OVERLAY = "mus-overlay";
    public static final String P = "p";
    public static final String RICH_TEXT = "richtext";
    public static final String SCROLLER = "mus-scroll";
    public static final String SLIDE = "mus-slide";
    public static final String SPAN = "span";
    public static final String TEXT = "text";
    public static final String VIDEO = "mus-video";
    public static final String WATERFALL = "waterfall";

    static {
        kge.a(-1848154654);
    }

    /* loaded from: classes6.dex */
    public static class a implements com.taobao.android.weex_framework.ui.l<MUSOverlay> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-384438050);
            kge.a(43206167);
        }

        /* JADX WARN: Type inference failed for: r4v7, types: [com.taobao.android.weex_uikit.widget.overlay.MUSOverlay, com.taobao.android.weex_framework.ui.INode] */
        @Override // com.taobao.android.weex_framework.ui.l
        public /* synthetic */ MUSOverlay a(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (INode) ipChange.ipc$dispatch("91d13828", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}) : b(mUSDKInstance, i, mUSProps, mUSProps2);
        }

        public MUSOverlay b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MUSOverlay) ipChange.ipc$dispatch("2a6b6c2c", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}) : new MUSOverlay(i, mUSDKInstance);
        }
    }
}
