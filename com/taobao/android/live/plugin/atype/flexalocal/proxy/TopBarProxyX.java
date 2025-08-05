package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.TopBarFrame3;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfo.AnchorInfoFrame;
import com.taobao.android.live.plugin.proxy.topbar.ITopBarProxy;
import tb.kge;

/* loaded from: classes6.dex */
public class TopBarProxyX implements ITopBarProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1160027243);
        kge.a(-295681237);
    }

    @Override // com.taobao.android.live.plugin.proxy.topbar.ITopBarProxy
    public Class<? extends BaseFrame> getTopBarFrame3Class() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("481e3ed2", new Object[]{this}) : TopBarFrame3.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.topbar.ITopBarProxy
    public Class<? extends BaseFrame> getAnchorInfoFrameClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("b082e318", new Object[]{this}) : AnchorInfoFrame.class;
    }
}
