package com.taobao.tao.sharepanel.weex.component;

import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.ComponentCreator;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import tb.kge;
import tb.obj;
import tb.oun;

/* loaded from: classes8.dex */
public class ShareFriendView extends AbsListComponent implements obj.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BubbleTipsBean mTips;

    static {
        kge.a(-1974188500);
        kge.a(-1633580285);
    }

    public static /* synthetic */ Object ipc$super(ShareFriendView shareFriendView, String str, Object... objArr) {
        if (str.hashCode() == -868167623) {
            super.initDone();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.sharepanel.weex.component.AbsListComponent
    public String getComponentKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("529e9f61", new Object[]{this}) : SubstituteConstants.KEY_CHANNEL_FRIENDS;
    }

    public ShareFriendView(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mTips = this.mDataBinder.a();
        com.taobao.share.taopassword.constants.a.f19661a = this.customCopy;
        this.mDataBinder.a(this);
    }

    @Override // com.taobao.tao.sharepanel.weex.component.AbsListComponent
    public void initDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc40d039", new Object[]{this});
            return;
        }
        super.initDone();
        oun.a(mo1286getHostView(), this.mTips);
    }

    /* loaded from: classes8.dex */
    public static class a implements ComponentCreator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1688387988);
            kge.a(1901682895);
        }

        @Override // com.taobao.weex.ui.ComponentCreator
        public WXComponent createInstance(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WXComponent) ipChange.ipc$dispatch("a264c511", new Object[]{this, wXSDKInstance, wXVContainer, basicComponentData}) : new ShareFriendView(wXSDKInstance, wXVContainer, basicComponentData);
        }
    }
}
