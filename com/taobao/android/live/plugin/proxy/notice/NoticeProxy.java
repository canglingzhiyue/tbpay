package com.taobao.android.live.plugin.proxy.notice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import tb.kge;

/* loaded from: classes6.dex */
public class NoticeProxy extends g<INoticeProxy> implements INoticeProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NoticeProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final NoticeProxy f14119a;

        static {
            kge.a(1946394372);
            f14119a = new NoticeProxy();
        }

        public static /* synthetic */ NoticeProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (NoticeProxy) ipChange.ipc$dispatch("68ade9ad", new Object[0]) : f14119a;
        }
    }

    static {
        kge.a(739876460);
        kge.a(-1071976169);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : INoticeProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.atype.flexalocal.proxy.NoticeProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "installLiveNoticePlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "直播公告";
    }

    public static NoticeProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NoticeProxy) ipChange.ipc$dispatch("57c3d057", new Object[0]) : a.a();
    }

    private NoticeProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            e.c("[NoticeProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.notice.INoticeProxy
    public Class<? extends BaseFrame> getNoticeFrame3Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("cea56338", new Object[]{this});
        }
        INoticeProxy real = getReal();
        Class<? extends BaseFrame> noticeFrame3Class = real != null ? real.getNoticeFrame3Class() : null;
        e.c("[NoticeProxy#getNoticeFrame3Class]  value: " + noticeFrame3Class);
        return noticeFrame3Class;
    }
}
