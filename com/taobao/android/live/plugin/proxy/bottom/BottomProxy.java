package com.taobao.android.live.plugin.proxy.bottom;

import android.content.Context;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class BottomProxy extends g<IBottomProxy> implements IBottomProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BottomProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final BottomProxy f14092a;

        static {
            kge.a(-1915888732);
            f14092a = new BottomProxy();
        }

        public static /* synthetic */ BottomProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BottomProxy) ipChange.ipc$dispatch("438a1e4d", new Object[0]) : f14092a;
        }
    }

    static {
        kge.a(-527149620);
        kge.a(385893681);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IBottomProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.atype.flexalocal.proxy.BottomProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this}) : "installLiveBottomPlugin";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "直播间底部区";
    }

    public static BottomProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BottomProxy) ipChange.ipc$dispatch("32a004f7", new Object[0]) : a.a();
    }

    private BottomProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            e.c("[BottomProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public Class<? extends BaseFrame> getFrameClassMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3ad7fa99", new Object[]{this, str});
        }
        IBottomProxy real = getReal();
        Class<? extends BaseFrame> frameClassMap = real != null ? real.getFrameClassMap(str) : null;
        e.c("[BottomProxy#getFrameClassMap]  value: " + frameClassMap);
        return frameClassMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public int getBottomBarLeftDP() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c29ad29f", new Object[]{this})).intValue();
        }
        IBottomProxy real = getReal();
        if (real != null) {
            i = real.getBottomBarLeftDP();
        }
        e.c("[BottomProxy#getBottomBarLeftDP]  value: " + i);
        return i;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public int getBottomBarBottomDP() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffdab543", new Object[]{this})).intValue();
        }
        IBottomProxy real = getReal();
        if (real != null) {
            i = real.getBottomBarBottomDP();
        }
        e.c("[BottomProxy#getBottomBarBottomDP]  value: " + i);
        return i;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public BaseFrame createBottomBarFrame3(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("20cb4468", new Object[]{this, context, aVar, viewStub});
        }
        IBottomProxy real = getReal();
        BaseFrame createBottomBarFrame3 = real != null ? real.createBottomBarFrame3(context, aVar, viewStub) : null;
        e.c("[BottomProxy#createBottomBarFrame3]  value: " + createBottomBarFrame3);
        return createBottomBarFrame3;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public boolean isShareEntryFold() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f4ff7c9", new Object[]{this})).booleanValue();
        }
        IBottomProxy real = getReal();
        if (real != null) {
            z = real.isShareEntryFold();
        }
        e.c("[BottomProxy#isShareEntryFold]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public String getRewardGuideResponseDataActionOpenRewardPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b96a3a66", new Object[]{this});
        }
        IBottomProxy real = getReal();
        String rewardGuideResponseDataActionOpenRewardPanel = real != null ? real.getRewardGuideResponseDataActionOpenRewardPanel() : null;
        e.c("[BottomProxy#getRewardGuideResponseDataActionOpenRewardPanel]  value: " + rewardGuideResponseDataActionOpenRewardPanel);
        return rewardGuideResponseDataActionOpenRewardPanel;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public IBottomProxy.a createShareFission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBottomProxy.a) ipChange.ipc$dispatch("4554686e", new Object[]{this});
        }
        IBottomProxy real = getReal();
        IBottomProxy.a createShareFission = real != null ? real.createShareFission() : null;
        e.c("[BottomProxy#createShareFission]  value: " + createShareFission);
        return createShareFission;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public String getShareFissionLiveShareActionInfoParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81eaf378", new Object[]{this});
        }
        IBottomProxy real = getReal();
        String shareFissionLiveShareActionInfoParams = real != null ? real.getShareFissionLiveShareActionInfoParams() : null;
        e.c("[BottomProxy#getShareFissionLiveShareActionInfoParams]  value: " + shareFissionLiveShareActionInfoParams);
        return shareFissionLiveShareActionInfoParams;
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy
    public Map<String, Integer> getIdMap() {
        Map<String, Integer> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5f99e47", new Object[]{this});
        }
        IBottomProxy real = getReal();
        if (real != null) {
            hashMap = real.getIdMap();
        } else {
            hashMap = new HashMap<>();
        }
        e.c("[BottomProxy#getIdMap]  value: " + hashMap);
        return hashMap;
    }
}
