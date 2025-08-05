package com.taobao.android.fluid.business.undermode;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.undermode.helper.UnderageTimelimitHelper;
import com.taobao.android.fluid.business.undermode.helper.a;
import com.taobao.android.fluid.business.undermode.helper.b;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import tb.jun;
import tb.kge;
import tb.skt;
import tb.snd;
import tb.spz;

/* loaded from: classes5.dex */
public class UnderageModeService implements IUnderageModeService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UnderageModeService";
    private final FluidContext mFluidContext;
    private final jun mUnderageModeServiceConfig = new jun();

    static {
        kge.a(215381600);
        kge.a(1798545645);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public static /* synthetic */ FluidContext access$000(UnderageModeService underageModeService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("7a91fb3e", new Object[]{underageModeService}) : underageModeService.mFluidContext;
    }

    public static /* synthetic */ jun access$100(UnderageModeService underageModeService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jun) ipChange.ipc$dispatch("b5daf49a", new Object[]{underageModeService}) : underageModeService.mUnderageModeServiceConfig;
    }

    public UnderageModeService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.business.undermode.IUnderageModeService
    public jun getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jun) ipChange.ipc$dispatch("feb8b6c4", new Object[]{this}) : this.mUnderageModeServiceConfig;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(new snd.a() { // from class: com.taobao.android.fluid.business.undermode.UnderageModeService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1512649357) {
                    super.onResume();
                    return null;
                } else if (hashCode == -152376096) {
                    super.cI_();
                    return null;
                } else if (hashCode != 797441118) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onPause();
                    return null;
                }
            }

            @Override // tb.snd.a, tb.snd
            public void onResume() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a5d6cd73", new Object[]{this});
                    return;
                }
                super.onResume();
                if (a.INSTANCE.a(UnderageModeService.access$000(UnderageModeService.this))) {
                    spz.c(UnderageModeService.TAG, "UnderageModeHelper 当前数据对应的青少年模式发生变化，需要刷新");
                    ((IContainerService) UnderageModeService.access$000(UnderageModeService.this).getService(IContainerService.class)).refresh();
                }
                UnderageTimelimitHelper.INSTANCE.a(UnderageModeService.access$000(UnderageModeService.this));
            }

            @Override // tb.snd.a, tb.snd
            public void onPause() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2f87fc5e", new Object[]{this});
                    return;
                }
                super.onPause();
                UnderageTimelimitHelper.INSTANCE.b(UnderageModeService.access$000(UnderageModeService.this));
            }

            @Override // tb.snd.a, tb.snd
            public void cI_() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f6eaece0", new Object[]{this});
                    return;
                }
                super.cI_();
                b.INSTANCE.a();
            }
        });
        ((IDataService) this.mFluidContext.getService(IDataService.class)).addDetailRequestSuccessListener(new skt() { // from class: com.taobao.android.fluid.business.undermode.UnderageModeService.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.skt
            public void onDetailRequestSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91cae82b", new Object[]{this});
                } else {
                    UnderageModeService.access$100(UnderageModeService.this).a(a.INSTANCE.a());
                }
            }
        });
    }
}
