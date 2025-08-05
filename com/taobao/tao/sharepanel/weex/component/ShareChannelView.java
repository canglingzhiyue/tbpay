package com.taobao.tao.sharepanel.weex.component;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.ComponentCreator;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import tb.kge;
import tb.obj;

/* loaded from: classes8.dex */
public class ShareChannelView extends AbsListComponent implements obj.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2119262111);
        kge.a(915943738);
    }

    @Override // com.taobao.tao.sharepanel.weex.component.AbsListComponent
    public String getComponentKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("529e9f61", new Object[]{this}) : "channels";
    }

    public ShareChannelView(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mDataBinder.a(this);
    }

    /* loaded from: classes8.dex */
    public static class a implements ComponentCreator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1429518343);
            kge.a(1901682895);
        }

        @Override // com.taobao.weex.ui.ComponentCreator
        public WXComponent createInstance(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WXComponent) ipChange.ipc$dispatch("a264c511", new Object[]{this, wXSDKInstance, wXVContainer, basicComponentData}) : new ShareChannelView(wXSDKInstance, wXVContainer, basicComponentData);
        }
    }
}
