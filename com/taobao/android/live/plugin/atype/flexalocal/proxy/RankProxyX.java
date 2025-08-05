package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.live.plugin.atype.flexalocal.rank.RankEntranceFrame;
import com.taobao.android.live.plugin.atype.flexalocal.rank.RankFrame;
import com.taobao.android.live.plugin.atype.flexalocal.rank.b;
import com.taobao.android.live.plugin.proxy.rank.IRankProxy;
import tb.kge;

/* loaded from: classes6.dex */
public class RankProxyX implements IRankProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-510951933);
        kge.a(-13083793);
    }

    @Override // com.taobao.android.live.plugin.proxy.rank.IRankProxy
    public Class<? extends BaseFrame> getRankFrameClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("8f509901", new Object[]{this}) : RankFrame.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.rank.IRankProxy
    public Class<? extends BaseFrame> getRankEntranceFrameClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("10722b57", new Object[]{this}) : RankEntranceFrame.class;
    }

    @Override // com.taobao.android.live.plugin.proxy.rank.IRankProxy
    public Pair<Long, bn> getRankEntranceDXHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("4eabf62f", new Object[]{this}) : Pair.create(Long.valueOf((long) b.DX_EVENT_RANKENTRANCETAP), new b());
    }
}
