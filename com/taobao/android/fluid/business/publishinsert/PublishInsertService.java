package com.taobao.android.fluid.business.publishinsert;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import tb.kge;
import tb.psw;
import tb.shm;

/* loaded from: classes5.dex */
public class PublishInsertService implements IPublishInsertService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ICardService mCardService;
    private final FluidContext mFluidContext;
    private ILifecycleService mLifecycleService;
    private boolean mPublishIInsertEnable;
    private PublishInsertHelper mPublishInsertHelper;

    static {
        kge.a(894283179);
        kge.a(447146488);
    }

    public static /* synthetic */ FluidContext access$000(PublishInsertService publishInsertService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("c5f7654d", new Object[]{publishInsertService}) : publishInsertService.mFluidContext;
    }

    public PublishInsertService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.business.publishinsert.IPublishInsertService
    public boolean isPublishIInsertEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("28dd24ab", new Object[]{this})).booleanValue() : this.mPublishIInsertEnable;
    }

    @Override // com.taobao.android.fluid.business.publishinsert.IPublishInsertService
    public void setPublishIInsertEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d4382d5", new Object[]{this, new Boolean(z)});
        } else {
            this.mPublishIInsertEnable = z;
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mLifecycleService = (ILifecycleService) this.mFluidContext.getService(ILifecycleService.class);
        this.mCardService = (ICardService) this.mFluidContext.getService(ICardService.class);
        this.mPublishInsertHelper = new PublishInsertHelper(this.mFluidContext);
        this.mLifecycleService.addPageLifecycleListener(this.mPublishInsertHelper);
        this.mCardService.addCardLifecycleListener(new shm.a() { // from class: com.taobao.android.fluid.business.publishinsert.PublishInsertService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -1961121033) {
                    super.onAppear((psw) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // tb.shm.a, tb.shm
            public void onAppear(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
                    return;
                }
                super.onAppear(pswVar);
                PublishInsertHelper.a(PublishInsertService.access$000(PublishInsertService.this), pswVar.E());
            }
        });
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.mLifecycleService.removePageLifecycleListener(this.mPublishInsertHelper);
        }
    }
}
