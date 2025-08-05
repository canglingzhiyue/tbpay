package com.taobao.android.live.plugin.proxy.rank;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import tb.kge;

/* loaded from: classes6.dex */
public class RankProxy extends g<IRankProxy> implements IRankProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RankProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final RankProxy f14124a;

        static {
            kge.a(60561092);
            f14124a = new RankProxy();
        }

        public static /* synthetic */ RankProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RankProxy) ipChange.ipc$dispatch("c733106d", new Object[0]) : f14124a;
        }
    }

    static {
        kge.a(-449552724);
        kge.a(-13083793);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IRankProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.atype.flexalocal.proxy.RankProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "installLiveRankEntrancePlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "打赏/榜单/排位赛";
    }

    public static RankProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RankProxy) ipChange.ipc$dispatch("a3cadc17", new Object[0]) : a.a();
    }

    private RankProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            e.c("[RankProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.rank.IRankProxy
    public Class<? extends BaseFrame> getRankFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("8f509901", new Object[]{this});
        }
        IRankProxy real = getReal();
        Class<? extends BaseFrame> rankFrameClass = real != null ? real.getRankFrameClass() : null;
        e.c("[RankProxy#getRankFrameClass]  value: " + rankFrameClass);
        return rankFrameClass;
    }

    @Override // com.taobao.android.live.plugin.proxy.rank.IRankProxy
    public Class<? extends BaseFrame> getRankEntranceFrameClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("10722b57", new Object[]{this});
        }
        IRankProxy real = getReal();
        Class<? extends BaseFrame> rankEntranceFrameClass = real != null ? real.getRankEntranceFrameClass() : null;
        e.c("[RankProxy#getRankEntranceFrameClass]  value: " + rankEntranceFrameClass);
        return rankEntranceFrameClass;
    }

    @Override // com.taobao.android.live.plugin.proxy.rank.IRankProxy
    public Pair<Long, bn> getRankEntranceDXHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4eabf62f", new Object[]{this});
        }
        IRankProxy real = getReal();
        Pair<Long, bn> rankEntranceDXHandler = real != null ? real.getRankEntranceDXHandler() : null;
        e.c("[RankProxy#getRankEntranceDXHandler]  value: " + rankEntranceDXHandler);
        return rankEntranceDXHandler;
    }
}
