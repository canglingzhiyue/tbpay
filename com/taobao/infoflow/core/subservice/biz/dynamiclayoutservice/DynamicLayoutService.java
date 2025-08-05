package com.taobao.infoflow.core.subservice.biz.dynamiclayoutservice;

import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IDynamicLayoutService;
import com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.lcx;
import tb.lcz;
import tb.ldf;
import tb.ldj;
import tb.ljs;
import tb.lli;
import tb.sdl;

/* loaded from: classes7.dex */
public class DynamicLayoutService implements IDynamicLayoutService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DynamicLayoutService";
    private IContainerDataService.a mDataProcessListener;
    private IContainerDataService<?> mDataService;
    private boolean mDynamicLayoutEnable;
    private boolean mFixedSwitchEnable;
    private IFoldDeviceAndPadService mFoldDeviceAndPadService;
    private boolean mGlobalDynamicLayoutEnable;
    private boolean mInitialized;
    private boolean mIsAdaptHudScreen;
    private IContainerDataService.c mRequestBizParamsCreator;
    private IContainerDataService.b mRequestListener;
    private final String KEY_DYNAMIC_LAYOUT_ENABLE = "dynamicLayoutEnable";
    private final String KEY_SUPPORT_DYNAMIC_LAYOUT = "supportDynamicLayout";
    private final String KEY_GLOBAL_DYNAMIC_LAYOUT_ENABLE = "fullDynamicLayoutEnable";
    private final String ORANGE_KEY_ENABLE_FIXED_DYNAMIC_LAYOUT_SWITCH = "enableFixedDynamicLayoutSwitch";

    static {
        kge.a(1794636905);
        kge.a(1729093654);
    }

    public static /* synthetic */ boolean access$000(DynamicLayoutService dynamicLayoutService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("20a3dda5", new Object[]{dynamicLayoutService})).booleanValue() : dynamicLayoutService.mDynamicLayoutEnable;
    }

    public static /* synthetic */ boolean access$002(DynamicLayoutService dynamicLayoutService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5e81359", new Object[]{dynamicLayoutService, new Boolean(z)})).booleanValue();
        }
        dynamicLayoutService.mDynamicLayoutEnable = z;
        return z;
    }

    public static /* synthetic */ boolean access$100(DynamicLayoutService dynamicLayoutService, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a19b7c7f", new Object[]{dynamicLayoutService, iContainerDataModel})).booleanValue() : dynamicLayoutService.isDynamicLayoutEnable(iContainerDataModel);
    }

    public static /* synthetic */ boolean access$202(DynamicLayoutService dynamicLayoutService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("523d24db", new Object[]{dynamicLayoutService, new Boolean(z)})).booleanValue();
        }
        dynamicLayoutService.mFixedSwitchEnable = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(DynamicLayoutService dynamicLayoutService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c8766f02", new Object[]{dynamicLayoutService})).booleanValue() : dynamicLayoutService.mIsAdaptHudScreen;
    }

    public static /* synthetic */ boolean access$302(DynamicLayoutService dynamicLayoutService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1867ad9c", new Object[]{dynamicLayoutService, new Boolean(z)})).booleanValue();
        }
        dynamicLayoutService.mIsAdaptHudScreen = z;
        return z;
    }

    public static /* synthetic */ boolean access$400(DynamicLayoutService dynamicLayoutService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("674a21", new Object[]{dynamicLayoutService})).booleanValue() : dynamicLayoutService.isAdaptHudScreen();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        this.mFoldDeviceAndPadService = (IFoldDeviceAndPadService) ljsVar.a(IFoldDeviceAndPadService.class);
        this.mFixedSwitchEnable = ldj.a("enableFixedDynamicLayoutSwitch", true);
        addRequestListener();
        addRequestBizParamsCreator();
        addDataProcessListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        removeRequestListener();
        removeRequestBizParamsCreator();
        removeDataProcessListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDynamicLayoutService
    public boolean dynamicLayoutEnable() {
        IContainerDataService<?> iContainerDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3531e1b7", new Object[]{this})).booleanValue();
        }
        if (this.mFixedSwitchEnable) {
            return true;
        }
        if (!this.mInitialized && (iContainerDataService = this.mDataService) != null) {
            this.mDynamicLayoutEnable = isDynamicLayoutEnable(iContainerDataService.getContainerData());
            this.mIsAdaptHudScreen = isAdaptHudScreen();
            this.mGlobalDynamicLayoutEnable = lcx.a("fullDynamicLayoutEnable");
            ldf.d("DynamicLayoutService", "动态布局开关状态：dynamicLayoutEnable：" + this.mDynamicLayoutEnable + ", isAdaptHudScreen: " + this.mIsAdaptHudScreen + ", globalDynamicLayoutEnable: " + this.mGlobalDynamicLayoutEnable);
            this.mInitialized = true;
            if (lcz.b() && (this.mDynamicLayoutEnable || this.mIsAdaptHudScreen || this.mGlobalDynamicLayoutEnable)) {
                Toast.makeText(lcz.a(), "命中信息流动态布局容器", 0).show();
            }
        }
        return this.mDynamicLayoutEnable || this.mIsAdaptHudScreen || this.mGlobalDynamicLayoutEnable;
    }

    private boolean isDynamicLayoutEnable(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6dd476", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null || (base = iContainerDataModel.getBase()) == null) {
            return false;
        }
        JSONObject ext = base.getExt();
        if (ext != null) {
            try {
                if (ext.getBooleanValue("dynamicLayoutEnable")) {
                    this.mDynamicLayoutEnable = z;
                    return z;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        z = false;
        this.mDynamicLayoutEnable = z;
        return z;
    }

    private boolean isAdaptHudScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11522a16", new Object[]{this})).booleanValue();
        }
        IFoldDeviceAndPadService iFoldDeviceAndPadService = this.mFoldDeviceAndPadService;
        if (iFoldDeviceAndPadService != null) {
            return iFoldDeviceAndPadService.isAdaptHudScreen();
        }
        return false;
    }

    private void addRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dffd909", new Object[]{this});
        } else if (this.mDataService == null) {
        } else {
            this.mRequestListener = createRequestListener();
            this.mDataService.addRequestListener(this.mRequestListener);
        }
    }

    private IContainerDataService.b createRequestListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("88e46762", new Object[]{this}) : new IContainerDataService.b() { // from class: com.taobao.infoflow.core.subservice.biz.dynamiclayoutservice.DynamicLayoutService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
                IContainerInnerDataModel<?> base;
                IPageDataModel mo1280getPageParams;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                } else if (iContainerDataModel == null || (base = iContainerDataModel.getBase()) == null || (mo1280getPageParams = base.mo1280getPageParams()) == null || mo1280getPageParams.getPageNum() != 0) {
                } else {
                    sdl.a();
                    DynamicLayoutService dynamicLayoutService = DynamicLayoutService.this;
                    DynamicLayoutService.access$002(dynamicLayoutService, DynamicLayoutService.access$100(dynamicLayoutService, iContainerDataModel));
                    DynamicLayoutService.access$202(DynamicLayoutService.this, ldj.a("enableFixedDynamicLayoutSwitch", true));
                    ldf.d("DynamicLayoutService", "第0页请求: dynamicLayoutEnable: " + DynamicLayoutService.access$000(DynamicLayoutService.this));
                }
            }
        };
    }

    private void removeRequestListener() {
        IContainerDataService.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34f11046", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mDataService;
        if (iContainerDataService == null || (bVar = this.mRequestListener) == null) {
            return;
        }
        iContainerDataService.removeRequestListener(bVar);
    }

    private void addRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcc53448", new Object[]{this});
        } else if (this.mDataService == null) {
        } else {
            this.mRequestBizParamsCreator = createRequestBizParamsCreator();
            this.mDataService.addRequestBizParamsCreator(this.mRequestBizParamsCreator);
        }
    }

    private IContainerDataService.c createRequestBizParamsCreator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.c) ipChange.ipc$dispatch("70453300", new Object[]{this}) : new IContainerDataService.c() { // from class: com.taobao.infoflow.core.subservice.biz.dynamiclayoutservice.DynamicLayoutService.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
            public Map<String, String> a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("add74dce", new Object[]{this, lliVar, str});
                }
                HashMap hashMap = new HashMap(1);
                hashMap.put("supportDynamicLayout", Boolean.TRUE.toString());
                return hashMap;
            }
        };
    }

    private void removeRequestBizParamsCreator() {
        IContainerDataService.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6addde85", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mDataService;
        if (iContainerDataService == null || (cVar = this.mRequestBizParamsCreator) == null) {
            return;
        }
        iContainerDataService.removeRequestBizParamsCreator(cVar);
    }

    private void addDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a4215f", new Object[]{this});
        } else if (this.mDataService == null) {
        } else {
            this.mDataProcessListener = new IContainerDataService.a() { // from class: com.taobao.infoflow.core.subservice.biz.dynamiclayoutservice.DynamicLayoutService.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
                public void a(lli lliVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                    }
                }

                @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
                public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                    }
                }

                @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
                public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                        return;
                    }
                    DynamicLayoutService dynamicLayoutService = DynamicLayoutService.this;
                    DynamicLayoutService.access$302(dynamicLayoutService, DynamicLayoutService.access$400(dynamicLayoutService));
                    ldf.d("DynamicLayoutService", "onProcess: mIsAdaptHudScreen: " + DynamicLayoutService.access$300(DynamicLayoutService.this));
                }
            };
            this.mDataService.addDataProcessListener(this.mDataProcessListener);
        }
    }

    private void removeDataProcessListener() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17d721c", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mDataService;
        if (iContainerDataService == null || (aVar = this.mDataProcessListener) == null) {
            return;
        }
        iContainerDataService.removeDataProcessListener(aVar);
    }
}
