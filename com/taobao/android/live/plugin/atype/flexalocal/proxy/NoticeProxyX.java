package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.notice.NoticeFrame3;
import com.taobao.android.live.plugin.proxy.notice.INoticeProxy;
import tb.kge;

/* loaded from: classes6.dex */
public class NoticeProxyX implements INoticeProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(341149807);
        kge.a(-1071976169);
    }

    @Override // com.taobao.android.live.plugin.proxy.notice.INoticeProxy
    public Class<? extends BaseFrame> getNoticeFrame3Class() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("cea56338", new Object[]{this}) : NoticeFrame3.class;
    }
}
