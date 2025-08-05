package com.taobao.android.fluid.framework.device;

import android.app.Activity;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.device.wifi.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.media.IMediaService;
import tb.akt;
import tb.hni;
import tb.kge;
import tb.obx;
import tb.psw;
import tb.shm;
import tb.ske;
import tb.smn;
import tb.smr;
import tb.sms;
import tb.spz;

/* loaded from: classes5.dex */
public class DeviceService implements IDeviceService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "IDeviceService";
    private static final String TAG = "DeviceService";
    private boolean isScreenChanged;
    private IContainerService mContainerService;
    private IDataService mDataService;
    private final smn mDeviceListenerManager;
    private float mDeviceScore = 0.0f;
    private final FluidContext mFluidContext;
    private ILifecycleService mLifecycleService;
    private int mScreenChangeType;
    private OnScreenChangedListener mTBAutoScreenChangedListener;

    static {
        kge.a(2030087439);
        kge.a(1858768390);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public static /* synthetic */ FluidContext access$000(DeviceService deviceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("7b3115ad", new Object[]{deviceService}) : deviceService.mFluidContext;
    }

    public static /* synthetic */ int access$100(DeviceService deviceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb03bd8d", new Object[]{deviceService})).intValue() : deviceService.mScreenChangeType;
    }

    public static /* synthetic */ int access$102(DeviceService deviceService, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c93711e", new Object[]{deviceService, new Integer(i)})).intValue();
        }
        deviceService.mScreenChangeType = i;
        return i;
    }

    public static /* synthetic */ boolean access$202(DeviceService deviceService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da532901", new Object[]{deviceService, new Boolean(z)})).booleanValue();
        }
        deviceService.isScreenChanged = z;
        return z;
    }

    public static /* synthetic */ smn access$300(DeviceService deviceService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (smn) ipChange.ipc$dispatch("81184b5a", new Object[]{deviceService}) : deviceService.mDeviceListenerManager;
    }

    public DeviceService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mDeviceListenerManager = new smn(fluidContext);
    }

    @Override // tb.smq
    public void addDeviceRotateListener(smr smrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16215c05", new Object[]{this, smrVar});
        } else {
            this.mDeviceListenerManager.addDeviceRotateListener(smrVar);
        }
    }

    @Override // tb.smq
    public void addDeviceRotateListener(smr.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120f66e8", new Object[]{this, aVar});
        } else {
            this.mDeviceListenerManager.addDeviceRotateListener(aVar);
        }
    }

    public void addOnScreenChangedListener(OnScreenChangedListener onScreenChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("effcfd4d", new Object[]{this, onScreenChangedListener});
        } else {
            this.mDeviceListenerManager.addOnScreenChangedListener(onScreenChangedListener);
        }
    }

    public void removeDeviceRotateListener(smr.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("416b2e0b", new Object[]{this, aVar});
        } else {
            this.mDeviceListenerManager.removeDeviceRotateListener(aVar);
        }
    }

    public void removeDeviceRotateListener(smr smrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16fa8fe8", new Object[]{this, smrVar});
        } else {
            this.mDeviceListenerManager.removeDeviceRotateListener(smrVar);
        }
    }

    public void removeOnScreenChangedListener(OnScreenChangedListener onScreenChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b87bf30", new Object[]{this, onScreenChangedListener});
        } else {
            this.mDeviceListenerManager.removeOnScreenChangedListener(onScreenChangedListener);
        }
    }

    @Override // com.taobao.android.fluid.framework.device.IDeviceService
    public float getDeviceScore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e89be1d", new Object[]{this})).floatValue();
        }
        this.mDeviceScore = akt.b();
        float f = this.mDeviceScore;
        if (f < 0.0f) {
            return -1.0f;
        }
        return f;
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            addScreenChangedListener();
        }
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        FluidContext fluidContext = this.mFluidContext;
        sms.a(fluidContext, ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaDetail());
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        spz.c(TAG, "onPause");
        sms.a(this.mFluidContext);
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        } else {
            removeScreenChangedListener();
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
        if (this.mLifecycleService == null) {
            FluidException.throwServiceNotFoundException(this.mFluidContext, ILifecycleService.class);
            return;
        }
        this.mContainerService = (IContainerService) this.mFluidContext.getService(IContainerService.class);
        if (this.mContainerService == null) {
            FluidException.throwServiceNotFoundException(this.mFluidContext, IContainerService.class);
            return;
        }
        this.mLifecycleService.addPageLifecycleListener(this);
        observeContainerSizeChanged();
        new a(this.mFluidContext);
        this.mDataService = (IDataService) this.mFluidContext.getService(IDataService.class);
        IMediaService iMediaService = (IMediaService) this.mFluidContext.getService(IMediaService.class);
        if (iMediaService != null) {
            iMediaService.addVideoPlayerListener(new hni.a() { // from class: com.taobao.android.fluid.framework.device.DeviceService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == 140701577) {
                        super.onVideoStart((psw) objArr[0]);
                        return null;
                    } else if (hashCode == 1698052051) {
                        super.onVideoPlay((psw) objArr[0]);
                        return null;
                    } else if (hashCode != 1995211607) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onVideoPause((psw) objArr[0], ((Boolean) objArr[1]).booleanValue());
                        return null;
                    }
                }

                @Override // tb.hni.a, tb.hni
                public void onVideoPause(psw pswVar, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("76ec8357", new Object[]{this, pswVar, new Boolean(z)});
                        return;
                    }
                    super.onVideoPause(pswVar, z);
                    spz.c(DeviceService.TAG, "onVideoPause");
                    sms.a(DeviceService.access$000(DeviceService.this));
                }

                @Override // tb.hni.a, tb.hni
                public void onVideoStart(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("862ef89", new Object[]{this, pswVar});
                        return;
                    }
                    super.onVideoStart(pswVar);
                    if (pswVar == null || !pswVar.H()) {
                        return;
                    }
                    sms.a(DeviceService.access$000(DeviceService.this), pswVar.D());
                }

                @Override // tb.hni.a, tb.hni
                public void onVideoPlay(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("653637d3", new Object[]{this, pswVar});
                        return;
                    }
                    super.onVideoPlay(pswVar);
                    if (pswVar == null || !pswVar.H()) {
                        return;
                    }
                    sms.a(DeviceService.access$000(DeviceService.this), pswVar.D());
                }
            });
        }
        ICardService iCardService = (ICardService) this.mFluidContext.getService(ICardService.class);
        if (iCardService == null) {
            return;
        }
        iCardService.addCardLifecycleListener(new shm.a() { // from class: com.taobao.android.fluid.framework.device.DeviceService.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -893732120) {
                    super.onActive((psw) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // tb.shm.a, tb.shm
            public void onActive(psw pswVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cababae8", new Object[]{this, pswVar});
                    return;
                }
                super.onActive(pswVar);
                if (pswVar == null) {
                    return;
                }
                sms.a(DeviceService.access$000(DeviceService.this), pswVar.D());
            }
        });
    }

    private void addScreenChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a2be62", new Object[]{this});
        } else if (this.mTBAutoScreenChangedListener != null) {
        } else {
            this.mTBAutoScreenChangedListener = new OnScreenChangedListener() { // from class: com.taobao.android.fluid.framework.device.DeviceService.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                    OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
                }

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public void onScreenChanged(int i, Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                        return;
                    }
                    spz.c(DeviceService.TAG, "onScreenChanged, changeType: " + i + ",mScreenChangeType:" + DeviceService.access$100(DeviceService.this));
                    if (DeviceService.access$100(DeviceService.this) == i) {
                        return;
                    }
                    DeviceService.access$102(DeviceService.this, i);
                    DeviceService.access$202(DeviceService.this, true);
                    DeviceService.access$300(DeviceService.this).onScreenChanged(i, configuration);
                }
            };
            h.a().c(this.mTBAutoScreenChangedListener);
        }
    }

    private void observeContainerSizeChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64d8f4f5", new Object[]{this});
        } else {
            this.mContainerService.addSizedChangeListener(new ske() { // from class: com.taobao.android.fluid.framework.device.DeviceService.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ske
                public void a(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                    } else {
                        DeviceService.this.setTabletDeviceRotate();
                    }
                }
            });
        }
    }

    private void removeScreenChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36ad3df", new Object[]{this});
        } else if (this.mTBAutoScreenChangedListener == null) {
        } else {
            h.a().d(this.mTBAutoScreenChangedListener);
            this.mTBAutoScreenChangedListener = null;
        }
    }

    public void setTabletDeviceRotate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593fcce0", new Object[]{this});
        } else if (!this.isScreenChanged) {
        } else {
            if (obx.g()) {
                this.mDeviceListenerManager.a();
            } else {
                this.mDeviceListenerManager.b();
            }
        }
    }
}
