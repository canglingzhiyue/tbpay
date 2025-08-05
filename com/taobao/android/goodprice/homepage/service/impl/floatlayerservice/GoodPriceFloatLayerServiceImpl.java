package com.taobao.android.goodprice.homepage.service.impl.floatlayerservice;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.goodprice.homepage.service.protocol.IGoodPriceFloatLayerService;
import tb.kge;
import tb.ljs;
import tb.lkq;

/* loaded from: classes5.dex */
public class GoodPriceFloatLayerServiceImpl implements IGoodPriceFloatLayerService<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(419614349);
        kge.a(1672341227);
    }

    @Override // tb.lkq
    public void addOnContainerListener(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3597dd", new Object[]{this, aVar});
        }
    }

    @Override // tb.lkq
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // tb.lkq
    public void removeOnContainerListener(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8982e05a", new Object[]{this, aVar});
        }
    }

    @Override // tb.lkq
    /* renamed from: createContainer  reason: collision with other method in class */
    public FrameLayout mo1092createContainer(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("3756b2fd", new Object[]{this, context}) : new FrameLayout(context);
    }
}
