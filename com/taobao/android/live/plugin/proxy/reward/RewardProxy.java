package com.taobao.android.live.plugin.proxy.reward;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import com.taobao.android.live.plugin.proxy.reward.IRewardProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.kge;

/* loaded from: classes6.dex */
public class RewardProxy extends g<IRewardProxy> implements IRewardProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RewardProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final RewardProxy f14126a;

        static {
            kge.a(996912932);
            f14126a = new RewardProxy();
        }

        public static /* synthetic */ RewardProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RewardProxy) ipChange.ipc$dispatch("a2ec91cd", new Object[0]) : f14126a;
        }
    }

    static {
        kge.a(-1722453428);
        kge.a(-289496023);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IRewardProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.btype.flexaremote.proxy.RewardProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "Reward";
    }

    public RewardProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            e.c("[RewardProxy<init>] error: " + th.getMessage());
        }
    }

    public static RewardProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RewardProxy) ipChange.ipc$dispatch("92027877", new Object[0]) : a.a();
    }

    @Override // com.taobao.android.live.plugin.proxy.reward.IRewardProxy
    public boolean enableTaoLiveReward() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3c4f345", new Object[]{this})).booleanValue();
        }
        IRewardProxy real = getReal();
        if (real != null) {
            z = real.enableTaoLiveReward();
        }
        e.c("[RewardProxy#enableTaoLiveReward]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.reward.IRewardProxy
    public boolean isRewardEnable(TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a690aad", new Object[]{this, tBLiveDataModel, aVar})).booleanValue();
        }
        IRewardProxy real = getReal();
        if (real != null) {
            z = real.isRewardEnable(tBLiveDataModel, aVar);
        }
        e.c("[RewardProxy#isRewardEnable]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.reward.IRewardProxy
    public IRewardProxy.a createRecharge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRewardProxy.a) ipChange.ipc$dispatch("13bda795", new Object[]{this});
        }
        IRewardProxy real = getReal();
        IRewardProxy.a createRecharge = real != null ? real.createRecharge() : null;
        e.c("[RewardProxy#createRecharge]  recharge: " + createRecharge);
        return createRecharge;
    }
}
