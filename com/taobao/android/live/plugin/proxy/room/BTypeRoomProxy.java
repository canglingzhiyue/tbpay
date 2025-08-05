package com.taobao.android.live.plugin.proxy.room;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.alilive.adapter.business.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.kge;

/* loaded from: classes6.dex */
public class BTypeRoomProxy extends g<IBTypeRoomProxy> implements IBTypeRoomProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BTypeRoomProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final BTypeRoomProxy f14127a;

        static {
            kge.a(2014432658);
            f14127a = new BTypeRoomProxy();
        }

        public static /* synthetic */ BTypeRoomProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BTypeRoomProxy) ipChange.ipc$dispatch("73bd71bf", new Object[0]) : f14127a;
        }
    }

    static {
        kge.a(876123038);
        kge.a(125966329);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IBTypeRoomProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.btype.flexaremote.proxy.BTypeRoomProxyX";
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "直播间其它 BType 功能";
    }

    public static BTypeRoomProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BTypeRoomProxy) ipChange.ipc$dispatch("67646055", new Object[0]) : a.a();
    }

    private BTypeRoomProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            e.c("[BTypeRoomProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public Class<? extends BaseFrame> getFrameClassMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3ad7fa99", new Object[]{this, str});
        }
        IBTypeRoomProxy real = getReal();
        Class<? extends BaseFrame> frameClassMap = real != null ? real.getFrameClassMap(str) : null;
        e.c("[BTypeRoomProxy#getFrameClassMap]  clazz: " + frameClassMap);
        return frameClassMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public BaseFrame createConnectionFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("331524f8", new Object[]{this, context, new Boolean(z), tBLiveDataModel, aVar, viewStub});
        }
        IBTypeRoomProxy real = getReal();
        BaseFrame createConnectionFrame = real != null ? real.createConnectionFrame(context, z, tBLiveDataModel, aVar, viewStub) : null;
        e.c("[BTypeRoomProxy#createConnectionFrame]  value: " + createConnectionFrame);
        return createConnectionFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public void adjustBBConnectionVideoSize(Context context, com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bddbb6dd", new Object[]{this, context, aVar, str});
            return;
        }
        IBTypeRoomProxy real = getReal();
        if (real == null) {
            return;
        }
        real.adjustBBConnectionVideoSize(context, aVar, str);
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public BaseFrame createPrivateVipFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("76493afb", new Object[]{this, context, new Boolean(z), tBLiveDataModel, viewStub});
        }
        IBTypeRoomProxy real = getReal();
        BaseFrame createPrivateVipFrame = real != null ? real.createPrivateVipFrame(context, z, tBLiveDataModel, viewStub) : null;
        e.c("[BTypeRoomProxy#createPrivateVipFrame]  value: " + createPrivateVipFrame);
        return createPrivateVipFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public IBTypeRoomProxy.b createTBLiveFollowBusiness(String str, int i, String str2, IBTypeRoomProxy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBTypeRoomProxy.b) ipChange.ipc$dispatch("480ec16e", new Object[]{this, str, new Integer(i), str2, cVar});
        }
        IBTypeRoomProxy real = getReal();
        IBTypeRoomProxy.b createTBLiveFollowBusiness = real != null ? real.createTBLiveFollowBusiness(str, i, str2, cVar) : null;
        e.c("[BTypeRoomProxy#createTBLiveFollowBusiness]  value: " + createTBLiveFollowBusiness);
        return createTBLiveFollowBusiness;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public boolean checkFollowFromCache(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e850874", new Object[]{this, str})).booleanValue();
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            z = real.checkFollowFromCache(str);
        }
        e.c("[BTypeRoomProxy#checkFollowFromCache]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public boolean checkFollowFromCache(String str, IBTypeRoomProxy.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f252905d", new Object[]{this, str, cVar})).booleanValue();
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            z = real.checkFollowFromCache(str, cVar);
        }
        e.c("[BTypeRoomProxy#checkFollowFromCache]  value: " + z);
        return z;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public void updateFollow(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b1ef49", new Object[]{this, str, new Boolean(z)});
            return;
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            real.updateFollow(str, z);
        }
        e.c("[BTypeRoomProxy#updateFollow]");
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public b createTBFollowBusiness(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e90d7368", new Object[]{this, dVar});
        }
        IBTypeRoomProxy real = getReal();
        b createTBFollowBusiness = real != null ? real.createTBFollowBusiness(dVar) : null;
        e.c("[BTypeRoomProxy#createTBFollowBusiness]  value: " + createTBFollowBusiness);
        return createTBFollowBusiness;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public b createTBFollowGuangBusiness(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b20bf7b2", new Object[]{this, dVar});
        }
        IBTypeRoomProxy real = getReal();
        b createTBFollowGuangBusiness = real != null ? real.createTBFollowGuangBusiness(dVar) : null;
        e.c("[BTypeRoomProxy#createTBFollowGuangBusiness]  value: " + createTBFollowGuangBusiness);
        return createTBFollowGuangBusiness;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public IBTypeRoomProxy.AbsFavorCountFrame createFavorCountFrame(Context context, long j, String str, boolean z, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBTypeRoomProxy.AbsFavorCountFrame) ipChange.ipc$dispatch("74b208d3", new Object[]{this, context, new Long(j), str, new Boolean(z), viewStub});
        }
        IBTypeRoomProxy real = getReal();
        IBTypeRoomProxy.AbsFavorCountFrame createFavorCountFrame = real != null ? real.createFavorCountFrame(context, j, str, z, viewStub) : null;
        e.c("[BTypeRoomProxy#createFavorCountFrame]  value: " + createFavorCountFrame);
        return createFavorCountFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public BaseFrame createSubscribeCardFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("40f1c6f0", new Object[]{this, context, new Boolean(z), tBLiveDataModel, view, viewGroup});
        }
        IBTypeRoomProxy real = getReal();
        BaseFrame createSubscribeCardFrame = real != null ? real.createSubscribeCardFrame(context, z, tBLiveDataModel, view, viewGroup) : null;
        e.c("[BTypeRoomProxy#createSubscribeCardFrame]  value: " + createSubscribeCardFrame);
        return createSubscribeCardFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public BaseFrame createRightBackwardTipsFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("5c727ca1", new Object[]{this, context, new Boolean(z), tBLiveDataModel, aVar});
        }
        IBTypeRoomProxy real = getReal();
        BaseFrame createRightBackwardTipsFrame = real != null ? real.createRightBackwardTipsFrame(context, z, tBLiveDataModel, aVar) : null;
        e.c("[BTypeRoomProxy#createRightBackwardTipsFrame]  value: " + createRightBackwardTipsFrame);
        return createRightBackwardTipsFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public void initBTypeOtherFrame(BaseFrame baseFrame, Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38111646", new Object[]{this, baseFrame, context, new Boolean(z), tBLiveDataModel, aVar});
            return;
        }
        IBTypeRoomProxy real = getReal();
        if (real != null) {
            real.initBTypeOtherFrame(baseFrame, context, z, tBLiveDataModel, aVar);
        }
        e.c("[BTypeRoomProxy#initBTypeOtherFrame]");
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public IBTypeRoomProxy.d getNonageServiceX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBTypeRoomProxy.d) ipChange.ipc$dispatch("8cf264a", new Object[]{this});
        }
        IBTypeRoomProxy real = getReal();
        IBTypeRoomProxy.d nonageServiceX = real != null ? real.getNonageServiceX() : null;
        e.c("[BTypeRoomProxy#getNonageServiceX]  value: " + nonageServiceX);
        return nonageServiceX;
    }

    @Override // com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy
    public IBTypeRoomProxy.e getBackwardX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBTypeRoomProxy.e) ipChange.ipc$dispatch("6156da1d", new Object[]{this});
        }
        IBTypeRoomProxy real = getReal();
        IBTypeRoomProxy.e backwardX = real != null ? real.getBackwardX() : null;
        e.c("[BTypeRoomProxy#getBackwardX]  value: " + backwardX);
        return backwardX;
    }
}
