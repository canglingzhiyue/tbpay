package com.taobao.infoflow.taobao.subservice.framework.dataservice;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.lli;
import tb.ltk;
import tb.ltl;
import tb.lto;
import tb.lwc;
import tb.lxb;
import tb.lxc;
import tb.lxh;
import tb.lxk;
import tb.opw;

/* loaded from: classes7.dex */
public class DosaContainerDataService implements IContainerDataService<AwesomeGetContainerData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CustomDataService";
    private final boolean enableAi;
    private boolean enableSyncLoadGateway;
    private ltk mContainerProcessProvider;
    private lxb mDataService;
    private final lxh mDosaSourceEnvironmentProvider;
    private ljs mInfoFlowContext;
    private ltl mPageInfoDataModel;
    private c mTrigger;
    private final b mTriggerAgency;

    /* loaded from: classes7.dex */
    public interface b {
        boolean a(c cVar, String str, String[] strArr, JSONObject jSONObject);
    }

    /* loaded from: classes7.dex */
    public interface c {
        boolean a(String str, String[] strArr, JSONObject jSONObject);
    }

    static {
        kge.a(1741640881);
        kge.a(223874879);
    }

    private void initAi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("effd81df", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addRequestCommonBizParamsCreator(IContainerDataService.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9580adaf", new Object[]{this, dVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addTriggerEventListener(IContainerDataService.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f404e7a3", new Object[]{this, eVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeRequestCommonBizParamsCreator(IContainerDataService.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab278d12", new Object[]{this, dVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeTriggerEventListener(IContainerDataService.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f599ce0", new Object[]{this, eVar});
        }
    }

    public static /* synthetic */ boolean access$500(DosaContainerDataService dosaContainerDataService, String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d469e6d9", new Object[]{dosaContainerDataService, str, strArr, jSONObject})).booleanValue() : dosaContainerDataService.customTriggerEvent(str, strArr, jSONObject);
    }

    private DosaContainerDataService(a aVar) {
        this.mDosaSourceEnvironmentProvider = a.a(aVar);
        this.mDataService = a.b(aVar);
        this.mTriggerAgency = a.c(aVar);
        this.enableAi = a.d(aVar);
        this.enableSyncLoadGateway = a.e(aVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        if (this.mDataService == null) {
            if (this.mDosaSourceEnvironmentProvider != null) {
                this.mDataService = new lxc(ljsVar.a().b(), this.mDosaSourceEnvironmentProvider);
            } else if (this.enableSyncLoadGateway) {
                this.mDataService = new lxc(ljsVar.a().b(), new lxk() { // from class: com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.lxk
                    public boolean a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                        }
                        return true;
                    }
                });
            } else {
                this.mDataService = new lxc(ljsVar.a().b());
            }
        }
        if (this.enableAi) {
            initAi();
        }
        this.mPageInfoDataModel = new ltl(this.mDataService);
        this.mContainerProcessProvider = new ltk(ljsVar);
        this.mDataService.a(getContainerType(), this.mContainerProcessProvider);
        this.mDataService.a(getContainerType(), new lto(ljsVar));
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onDestroyService");
        this.mContainerProcessProvider.a();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public AwesomeGetContainerData getContainerData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("7844a110", new Object[]{this});
        }
        ldf.d(TAG, "getContainerData");
        return this.mDataService.a(getContainerType());
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public com.taobao.infoflow.protocol.model.datamodel.response.a getPageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.infoflow.protocol.model.datamodel.response.a) ipChange.ipc$dispatch("45ad4f2b", new Object[]{this});
        }
        ldf.d(TAG, "getPageInfo");
        return this.mPageInfoDataModel;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addRequestListener(IContainerDataService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555c8a7b", new Object[]{this, bVar});
            return;
        }
        ltk ltkVar = this.mContainerProcessProvider;
        if (ltkVar == null) {
            return;
        }
        ltkVar.a(bVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeRequestListener(IContainerDataService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c31e", new Object[]{this, bVar});
            return;
        }
        ltk ltkVar = this.mContainerProcessProvider;
        if (ltkVar == null) {
            return;
        }
        ltkVar.b(bVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addRequestBizParamsCreator(IContainerDataService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("524cee3b", new Object[]{this, cVar});
            return;
        }
        ltk ltkVar = this.mContainerProcessProvider;
        if (ltkVar == null) {
            return;
        }
        ltkVar.a(cVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeRequestBizParamsCreator(IContainerDataService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68dbd3de", new Object[]{this, cVar});
            return;
        }
        ltk ltkVar = this.mContainerProcessProvider;
        if (ltkVar == null) {
            return;
        }
        ltkVar.b(cVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addDataProcessListener(IContainerDataService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc40c06", new Object[]{this, aVar});
            return;
        }
        ltk ltkVar = this.mContainerProcessProvider;
        if (ltkVar == null) {
            return;
        }
        ltkVar.a(aVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeDataProcessListener(IContainerDataService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab953b29", new Object[]{this, aVar});
            return;
        }
        ltk ltkVar = this.mContainerProcessProvider;
        if (ltkVar == null) {
            return;
        }
        ltkVar.b(aVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public boolean triggerEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac5f4481", new Object[]{this, str, jSONObject})).booleanValue();
        }
        ldf.d(TAG, "triggerEvent , event : " + str);
        String[] strArr = {this.mInfoFlowContext.a().a()};
        b bVar = this.mTriggerAgency;
        if (bVar != null) {
            return bVar.a(getTrigger(), str, strArr, jSONObject);
        }
        return this.mDataService.a(str, strArr, jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public boolean triggerEvent(String str, JSONObject jSONObject, lli lliVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f3aea68", new Object[]{this, str, jSONObject, lliVar})).booleanValue() : triggerEvent(str, opw.a(jSONObject, lliVar));
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public BaseSectionModel<?> createBaseSectionModel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseSectionModel) ipChange.ipc$dispatch("f9f699c6", new Object[]{this, jSONObject}) : this.mDataService.a(jSONObject);
    }

    private boolean customTriggerEvent(String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d1a53d9", new Object[]{this, str, strArr, jSONObject})).booleanValue() : this.mDataService.a(str, strArr, jSONObject);
    }

    private lwc getContainerType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lwc) ipChange.ipc$dispatch("f3beb222", new Object[]{this}) : lwc.a(this.mInfoFlowContext.a().a());
    }

    private c getTrigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("9d0af92c", new Object[]{this});
        }
        if (this.mTrigger == null) {
            this.mTrigger = new c() { // from class: com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService.c
                public boolean a(String str, String[] strArr, JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a5a34ce7", new Object[]{this, str, strArr, jSONObject})).booleanValue() : DosaContainerDataService.access$500(DosaContainerDataService.this, str, strArr, jSONObject);
                }
            };
        }
        return this.mTrigger;
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private lxh f17568a;
        private lxb b;
        private final b c;
        private boolean d;
        private boolean e;

        static {
            kge.a(758311560);
        }

        public static /* synthetic */ lxh a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lxh) ipChange.ipc$dispatch("d1513761", new Object[]{aVar}) : aVar.f17568a;
        }

        public static /* synthetic */ lxb b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lxb) ipChange.ipc$dispatch("89ddf706", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ b c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a41218ab", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ boolean d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cadb8bb0", new Object[]{aVar})).booleanValue() : aVar.d;
        }

        public static /* synthetic */ boolean e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b086e831", new Object[]{aVar})).booleanValue() : aVar.e;
        }

        public a(b bVar) {
            this.c = bVar;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("47daeaf", new Object[]{this});
            }
            this.d = true;
            return this;
        }

        public DosaContainerDataService c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DosaContainerDataService) ipChange.ipc$dispatch("d162824a", new Object[]{this}) : new DosaContainerDataService(this);
        }
    }
}
