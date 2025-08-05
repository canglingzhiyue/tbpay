package com.taobao.android.weex_uikit.widget.div;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import com.taobao.android.weex_uikit.ui.b;
import com.taobao.media.MediaConstant;
import tb.kge;

/* loaded from: classes6.dex */
public class Div extends UINodeGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-612044512);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public Div(int i) {
        super(i);
    }

    /* loaded from: classes6.dex */
    public static final class a extends b<Div> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1493923954);
        }

        @Override // com.taobao.android.weex_framework.bridge.a
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }

        @Override // com.taobao.android.weex_framework.ui.l
        public /* synthetic */ INode a(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (INode) ipChange.ipc$dispatch("91d13828", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}) : b(mUSDKInstance, i, mUSProps, mUSProps2);
        }

        public Div b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Div) ipChange.ipc$dispatch("c65a1713", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            Div div = new Div(i);
            div.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                div.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                div.updateAttrs(mUSProps2);
            }
            return div;
        }
    }
}
