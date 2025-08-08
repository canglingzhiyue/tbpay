package com.taobao.android.fluid.business.containerframe;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.containerframe.frames.a;
import com.taobao.android.fluid.business.containerframe.frames.d;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.datamodel.AlbumData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import tb.kge;
import tb.snd;

/* loaded from: classes5.dex */
public class ContainerFrameService implements IContainerFrameService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mAlbumDetailFrame;
    private final FluidContext mFluidContext;
    private d mGoodsListFrame;

    static {
        kge.a(-1619080451);
        kge.a(-99112468);
    }

    @Override // com.taobao.android.fluid.business.containerframe.IContainerFrameService
    public void hideCommentFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aaf937", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public static /* synthetic */ d access$000(ContainerFrameService containerFrameService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("a4df8b13", new Object[]{containerFrameService}) : containerFrameService.mGoodsListFrame;
    }

    public static /* synthetic */ d access$002(ContainerFrameService containerFrameService, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("574d8f79", new Object[]{containerFrameService, dVar});
        }
        containerFrameService.mGoodsListFrame = dVar;
        return dVar;
    }

    public static /* synthetic */ a access$100(ContainerFrameService containerFrameService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a6f2e9b7", new Object[]{containerFrameService}) : containerFrameService.mAlbumDetailFrame;
    }

    public static /* synthetic */ a access$102(ContainerFrameService containerFrameService, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("df1b4c9e", new Object[]{containerFrameService, aVar});
        }
        containerFrameService.mAlbumDetailFrame = aVar;
        return aVar;
    }

    public ContainerFrameService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.business.containerframe.IContainerFrameService
    public void handleAlbumDetail(AlbumData albumData, com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65acf5d7", new Object[]{this, albumData, aVar});
        } else if (aVar == null || albumData == null || StringUtils.isEmpty(albumData.type) || (a2 = aVar.a()) == null) {
        } else {
            if (this.mAlbumDetailFrame == null) {
                this.mAlbumDetailFrame = new com.taobao.android.fluid.business.containerframe.frames.a(this.mFluidContext);
                this.mAlbumDetailFrame.a(((IContainerService) this.mFluidContext.getService(IContainerService.class)).getAlbumDetailStub());
            }
            this.mAlbumDetailFrame.a(albumData, a2);
        }
    }

    @Override // com.taobao.android.fluid.business.containerframe.IContainerFrameService
    public boolean isAlbumDetailFrameShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a3d0a59", new Object[]{this})).booleanValue();
        }
        com.taobao.android.fluid.business.containerframe.frames.a aVar = this.mAlbumDetailFrame;
        return aVar != null && aVar.e();
    }

    @Override // com.taobao.android.fluid.business.containerframe.IContainerFrameService
    public boolean isGoodListShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12426e4b", new Object[]{this})).booleanValue();
        }
        d dVar = this.mGoodsListFrame;
        return dVar != null && dVar.e();
    }

    @Override // com.taobao.android.fluid.business.containerframe.IContainerFrameService
    public void onGoodsClick(a.c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe9781f", new Object[]{this, cVar, str});
            return;
        }
        if (this.mGoodsListFrame == null) {
            this.mGoodsListFrame = new d(this.mFluidContext);
            this.mGoodsListFrame.a(((IContainerService) this.mFluidContext.getService(IContainerService.class)).getGoodListStub());
        }
        this.mGoodsListFrame.a(str);
        this.mGoodsListFrame.a(cVar);
        this.mGoodsListFrame.h();
    }

    @Override // com.taobao.android.fluid.business.containerframe.IContainerFrameService
    public void popCommentFrame(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40adf4a7", new Object[]{this, cVar});
        } else {
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d.a(((ICardService) this.mFluidContext.getService(ICardService.class)).getActiveCard(), "tmp_check_exist_commentclick", (String) null, (String) null, (String) null, (String) null);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        } else {
            ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(new snd.a() { // from class: com.taobao.android.fluid.business.containerframe.ContainerFrameService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.snd.a, tb.snd
                public void cI_() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f6eaece0", new Object[]{this});
                        return;
                    }
                    if (ContainerFrameService.access$000(ContainerFrameService.this) != null) {
                        ContainerFrameService.access$000(ContainerFrameService.this).f();
                        ContainerFrameService.access$002(ContainerFrameService.this, null);
                    }
                    if (ContainerFrameService.access$100(ContainerFrameService.this) == null) {
                        return;
                    }
                    ContainerFrameService.access$100(ContainerFrameService.this).f();
                    ContainerFrameService.access$102(ContainerFrameService.this, null);
                }
            });
        }
    }
}
