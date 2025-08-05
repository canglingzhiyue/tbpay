package com.taobao.android.live.plugin.proxy.notice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import tb.kge;

/* loaded from: classes6.dex */
public class Notice4Proxy extends g<INotice4Proxy> implements INotice4Proxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Notice4Proxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final Notice4Proxy f14118a;

        static {
            kge.a(1331476788);
            f14118a = new Notice4Proxy();
        }

        public static /* synthetic */ Notice4Proxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Notice4Proxy) ipChange.ipc$dispatch("aa023ee1", new Object[0]) : f14118a;
        }
    }

    static {
        kge.a(628398652);
        kge.a(295542001);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : INotice4Proxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.btype.flexaremote.proxy.Notice4ProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "installLiveNotice4Plugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "直播公告4";
    }

    public static Notice4Proxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notice4Proxy) ipChange.ipc$dispatch("9da92d77", new Object[0]) : a.a();
    }

    private Notice4Proxy() {
        try {
            initBType();
        } catch (Throwable th) {
            e.c("[Notice4Proxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.notice.INotice4Proxy
    public Class<? extends BaseFrame> getNoticeFrame4Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("d07eb657", new Object[]{this});
        }
        INotice4Proxy real = getReal();
        Class<? extends BaseFrame> noticeFrame4Class = real != null ? real.getNoticeFrame4Class() : null;
        e.c("[Notice4Proxy#getNoticeFrame4Class]  value: " + noticeFrame4Class);
        return noticeFrame4Class;
    }
}
