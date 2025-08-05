package com.taobao.android.fluid.remote.collectionpoplayer;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.videocollection.poplayer.INativeCollectionPoplayerService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.b;
import java.util.ArrayList;
import tb.hhy;
import tb.kge;
import tb.sii;
import tb.slk;

/* loaded from: classes5.dex */
public class RemoteCollectionService implements INativeCollectionPoplayerService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b mCollectionManager = new b();
    private FluidContext mFluidContext;

    static {
        kge.a(-1976255023);
        kge.a(-1846805863);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public RemoteCollectionService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.business.videocollection.poplayer.INativeCollectionPoplayerService
    public boolean checkDialogPopup(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e32fe359", new Object[]{this, fluidContext})).booleanValue() : this.mCollectionManager.e(fluidContext);
    }

    @Override // com.taobao.android.fluid.business.videocollection.poplayer.INativeCollectionPoplayerService
    public boolean checkPopupFisrtTime(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b8ee0358", new Object[]{this, fluidContext})).booleanValue() : this.mCollectionManager.f(fluidContext);
    }

    @Override // com.taobao.android.fluid.business.videocollection.poplayer.INativeCollectionPoplayerService
    public void constructNativePoplayer(a aVar, FluidContext fluidContext, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ebfaa5f", new Object[]{this, aVar, fluidContext, context});
        } else {
            this.mCollectionManager.a(aVar, fluidContext, context);
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.poplayer.INativeCollectionPoplayerService
    public void clickCompilationsPop(ArrayList<a> arrayList, FluidContext fluidContext, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c0bd7ec", new Object[]{this, arrayList, fluidContext, context});
        } else {
            this.mCollectionManager.a(arrayList, fluidContext, context);
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.poplayer.INativeCollectionPoplayerService
    public void updateCollectionDialog(FluidContext fluidContext, ArrayList<a> arrayList, slk.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2e6e11", new Object[]{this, fluidContext, arrayList, aVar, new Boolean(z)});
        } else {
            this.mCollectionManager.a(fluidContext, arrayList, aVar, z);
        }
    }

    @Override // com.taobao.android.fluid.business.videocollection.poplayer.INativeCollectionPoplayerService
    public void setVideoResizeForCollectionPopLayer(FluidContext fluidContext, hhy hhyVar, View view, sii siiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2593125", new Object[]{this, fluidContext, hhyVar, view, siiVar});
        } else {
            this.mCollectionManager.a(fluidContext, hhyVar, view, siiVar);
        }
    }
}
