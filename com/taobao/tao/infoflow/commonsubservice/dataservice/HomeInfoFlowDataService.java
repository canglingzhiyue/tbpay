package com.taobao.tao.infoflow.commonsubservice.dataservice;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.i;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.base.IItemRenderService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.impl.model.UiRefreshActionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.homepage.d;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.tracelog.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.lar;
import tb.ldf;
import tb.ljd;
import tb.lje;
import tb.ljs;
import tb.lli;
import tb.oje;
import tb.ojf;
import tb.ojg;
import tb.ojh;
import tb.ope;
import tb.opw;
import tb.oqs;
import tb.oqt;
import tb.oqv;
import tb.oqx;
import tb.osn;

/* loaded from: classes.dex */
public class HomeInfoFlowDataService implements IContainerDataService<AwesomeGetContainerData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_REQUEST_TYPE = "requestType";
    private static final String REQUEST_TYPE_ERROR = "unknown";
    private static final String TAG = "HomeInfoFlowDataService";
    private List<IContainerDataService.a> dataProcessListeners;
    private oqs dataProcessUtils;
    private osn dataServiceWindVaneProvider;
    private ljs infoFlowContext;
    private ojf pageInfoDataModel;
    private final String recommendType;
    private List<IContainerDataService.c> requestBizParamsCreators;
    private List<IContainerDataService.d> requestCommonBizParamsCreators;
    private List<IContainerDataService.b> requestListeners;
    private oqt subContainerRequestParams;
    private List<IContainerDataService.e> triggerEventListeners;

    static {
        kge.a(-263078096);
        kge.a(223874879);
    }

    public HomeInfoFlowDataService(String str) {
        this.recommendType = str;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        ldf.d(TAG, "onCreateService");
        this.infoFlowContext = ljsVar;
        String a2 = ljsVar.a().a();
        this.pageInfoDataModel = new ojf();
        this.subContainerRequestParams = new oqx(a2);
        this.dataProcessUtils = new oqv(a2);
        this.dataServiceWindVaneProvider = new oje(ljsVar);
        a.a(this.recommendType, this);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onDestroyService");
        List<IContainerDataService.b> list = this.requestListeners;
        if (list != null) {
            list.clear();
            this.requestListeners = null;
        }
        List<IContainerDataService.a> list2 = this.dataProcessListeners;
        if (list2 != null) {
            list2.clear();
            this.dataProcessListeners = null;
        }
        List<IContainerDataService.c> list3 = this.requestBizParamsCreators;
        if (list3 != null) {
            list3.clear();
            this.requestBizParamsCreators = null;
        }
        a.b(this.recommendType);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public AwesomeGetContainerData getContainerData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("247ef536", new Object[]{this});
        }
        ope a2 = d.a();
        if (a2 != null) {
            return a2.b(this.infoFlowContext.a().a());
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public com.taobao.infoflow.protocol.model.datamodel.response.a getPageInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.infoflow.protocol.model.datamodel.response.a) ipChange.ipc$dispatch("45ad4f2b", new Object[]{this}) : this.pageInfoDataModel;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addRequestListener(IContainerDataService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555c8a7b", new Object[]{this, bVar});
            return;
        }
        if (this.requestListeners == null) {
            this.requestListeners = new CopyOnWriteArrayList();
        }
        this.requestListeners.add(bVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeRequestListener(IContainerDataService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c31e", new Object[]{this, bVar});
            return;
        }
        List<IContainerDataService.b> list = this.requestListeners;
        if (list == null) {
            return;
        }
        list.remove(bVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addRequestBizParamsCreator(IContainerDataService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("524cee3b", new Object[]{this, cVar});
            return;
        }
        if (this.requestBizParamsCreators == null) {
            this.requestBizParamsCreators = new CopyOnWriteArrayList();
        }
        this.requestBizParamsCreators.add(cVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeRequestBizParamsCreator(IContainerDataService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68dbd3de", new Object[]{this, cVar});
            return;
        }
        List<IContainerDataService.c> list = this.requestBizParamsCreators;
        if (list == null) {
            return;
        }
        list.remove(cVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addRequestCommonBizParamsCreator(IContainerDataService.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9580adaf", new Object[]{this, dVar});
            return;
        }
        if (this.requestCommonBizParamsCreators == null) {
            this.requestCommonBizParamsCreators = new CopyOnWriteArrayList();
        }
        this.requestCommonBizParamsCreators.add(dVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeRequestCommonBizParamsCreator(IContainerDataService.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab278d12", new Object[]{this, dVar});
            return;
        }
        List<IContainerDataService.d> list = this.requestCommonBizParamsCreators;
        if (list == null) {
            return;
        }
        list.remove(dVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addDataProcessListener(IContainerDataService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc40c06", new Object[]{this, aVar});
            return;
        }
        if (this.dataProcessListeners == null) {
            this.dataProcessListeners = new CopyOnWriteArrayList();
        }
        this.dataProcessListeners.add(aVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeDataProcessListener(IContainerDataService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab953b29", new Object[]{this, aVar});
            return;
        }
        List<IContainerDataService.a> list = this.dataProcessListeners;
        if (list == null) {
            return;
        }
        list.remove(aVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public boolean triggerEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac5f4481", new Object[]{this, str, jSONObject})).booleanValue();
        }
        List<IContainerDataService.e> list = this.triggerEventListeners;
        if (list != null && list.size() > 0) {
            for (IContainerDataService.e eVar : list) {
                eVar.a(str, jSONObject);
            }
        }
        return ojh.a(str, jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public boolean triggerEvent(String str, JSONObject jSONObject, lli lliVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f3aea68", new Object[]{this, str, jSONObject, lliVar})).booleanValue() : triggerEvent(str, opw.a(jSONObject, lliVar));
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public BaseSectionModel<?> createBaseSectionModel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseSectionModel) ipChange.ipc$dispatch("f9f699c6", new Object[]{this, jSONObject}) : new SectionModel(jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void addTriggerEventListener(IContainerDataService.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f404e7a3", new Object[]{this, eVar});
            return;
        }
        if (this.triggerEventListeners == null) {
            this.triggerEventListeners = new CopyOnWriteArrayList();
        }
        this.triggerEventListeners.add(eVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService
    public void removeTriggerEventListener(IContainerDataService.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f599ce0", new Object[]{this, eVar});
            return;
        }
        List<IContainerDataService.e> list = this.triggerEventListeners;
        if (list == null) {
            return;
        }
        list.remove(eVar);
    }

    public AwesomeGetContainerParams getRequestParams(ope opeVar, JSONObject jSONObject) {
        AwesomeGetContainerParams b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerParams) ipChange.ipc$dispatch("848cbea4", new Object[]{this, opeVar, jSONObject});
        }
        if (this.subContainerRequestParams.a(opeVar, jSONObject) || (b = this.subContainerRequestParams.b(opeVar, jSONObject)) == null) {
            return null;
        }
        lar.e("dataService_getRequestParams");
        lli a2 = opw.a(jSONObject);
        if (a2 == null) {
            a2 = new lje(b.requestType + SystemClock.uptimeMillis());
            opw.a(jSONObject, a2);
        }
        Map<String, String> createBizParams = createBizParams(b.requestType, a2);
        if (b.bizParams != null && createBizParams != null) {
            b.bizParams.putAll(createBizParams);
        }
        lar.f("dataService_getRequestParams");
        return b;
    }

    public Map<String, String> getRequestCommonBizParams(JSONObject jSONObject) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7301f469", new Object[]{this, jSONObject});
        }
        HashMap hashMap = null;
        if (jSONObject == null || (string = jSONObject.getString("requestType")) == null) {
            return null;
        }
        lar.e("dataService_getRequestCommonBizParams");
        lli a2 = opw.a(jSONObject);
        if (a2 == null) {
            a2 = new lje(string + SystemClock.uptimeMillis());
            opw.a(jSONObject, a2);
        }
        List<IContainerDataService.d> list = this.requestCommonBizParamsCreators;
        if (list != null && list.size() > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (IContainerDataService.d dVar : this.requestCommonBizParamsCreators) {
                if (dVar != null) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    Map<String, String> a3 = dVar.a(a2, string);
                    if (a3 != null) {
                        hashMap.putAll(a3);
                    }
                }
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (TextUtils.equals(string, "coldStart")) {
                s.f18233a.d().a("SubCommonBizParams", Long.valueOf(elapsedRealtime2));
            }
        }
        lar.f("dataService_getRequestCommonBizParams");
        return hashMap;
    }

    public void notifyRequestStart(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac267cd", new Object[]{this, jSONObject});
            return;
        }
        lli a2 = opw.a(jSONObject);
        List<IContainerDataService.b> list = this.requestListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        lar.e("dataService_notifyRequestStart");
        String string = jSONObject == null ? "unknown" : jSONObject.getString("requestType");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (IContainerDataService.b bVar : list) {
            bVar.a(a2, string);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (TextUtils.equals(string, "coldStart")) {
            s.f18233a.d().a("RequestStart", Long.valueOf(elapsedRealtime2));
        }
        lar.f("dataService_notifyRequestStart");
    }

    public void notifyRequestSuccess(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2228dc8", new Object[]{this, jSONObject, awesomeGetContainerData});
            return;
        }
        lli a2 = opw.a(jSONObject);
        List<IContainerDataService.b> list = this.requestListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        String string = jSONObject == null ? "unknown" : jSONObject.getString("requestType");
        if (a2 != null && a2.b() != null) {
            a2.b().put("isStreamRequest", (Object) Boolean.valueOf(i.c(string)));
        }
        lar.e("dataService_notifyRequestSuccess");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (IContainerDataService.b bVar : list) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            bVar.a(a2, awesomeGetContainerData, string);
            String[] strArr = new String[i];
            strArr[0] = "notifyRequestSuccess " + bVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + " ms";
            ldf.e(TAG, strArr);
            i = 1;
        }
        long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (TextUtils.equals(string, "coldStart")) {
            s.f18233a.d().a("RequestSuccess", Long.valueOf(elapsedRealtime3));
        }
        ldf.e(TAG, "notifyRequestSuccess 总耗时：" + elapsedRealtime3 + " ms");
        lar.f("dataService_notifyRequestSuccess");
    }

    public void notifyRequestFailure(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ff08b9", new Object[]{this, jSONObject, str, str2});
            return;
        }
        lli a2 = opw.a(jSONObject);
        List<IContainerDataService.b> list = this.requestListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        String string = jSONObject == null ? "unknown" : jSONObject.getString("requestType");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (IContainerDataService.b bVar : list) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            bVar.a(a2, str, str2, string);
            String[] strArr = new String[i];
            strArr[0] = "notifyRequestFailure " + bVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + " ms";
            ldf.e(TAG, strArr);
            i = 1;
        }
        String[] strArr2 = new String[i];
        strArr2[0] = "notifyRequestFailure 总耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms";
        ldf.e(TAG, strArr2);
    }

    public void customDataProcess(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("582a3fc9", new Object[]{this, opeVar, jSONObject});
            return;
        }
        lli a2 = opw.a(jSONObject);
        String string = jSONObject.getString("requestType");
        notifyDataProcessStart(a2, string);
        this.dataProcessUtils.a(opeVar, jSONObject);
        notifyDataOnProcess(a2, opeVar.b(this.infoFlowContext.a().a()), string);
    }

    public void processUiRefresh(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a0185", new Object[]{this, opeVar, jSONObject});
            return;
        }
        lli a2 = opw.a(jSONObject);
        final IContainerService iContainerService = (IContainerService) this.infoFlowContext.a(IContainerService.class);
        if (iContainerService == null) {
            ldf.d(TAG, "containerService is null");
            return;
        }
        final UiRefreshActionModel uiRefreshActionModel = (UiRefreshActionModel) JSON.toJavaObject(jSONObject, UiRefreshActionModel.class);
        final AwesomeGetContainerData b = opeVar.b(this.infoFlowContext.a().a());
        uiRefreshActionModel.containerModel = b;
        final String str = "HomeInfoFlow_uiRefresh_" + jSONObject.getString("requestType");
        if (!TextUtils.equals("scrollToTop", uiRefreshActionModel.getUiOperationType())) {
            ljd.a().b(new Runnable() { // from class: com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    lar.e("dataService_uiRefresh");
                    b.a().a(str, 1);
                    iContainerService.uiRefresh(b, uiRefreshActionModel);
                    b.a().b(str);
                    lar.f("dataService_uiRefresh");
                }
            });
            notifyDataProcessFinish(a2, b, uiRefreshActionModel != null ? uiRefreshActionModel.requestType : null);
        } else if (!ojg.a(this.infoFlowContext, a2)) {
        } else {
            ljd.a().b(new Runnable() { // from class: com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    lar.e("dataService_scrollToTop");
                    b.a().a(str, 1);
                    iContainerService.uiRefresh(b, uiRefreshActionModel);
                    b.a().b(str);
                    lar.f("dataService_scrollToTop");
                }
            });
        }
    }

    public void downloadTemplate(List<SectionModel> list, final IDxItemRenderService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5262357f", new Object[]{this, list, bVar});
            return;
        }
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) this.infoFlowContext.a(IDxItemRenderService.class);
        if (iDxItemRenderService == null) {
            return;
        }
        lar.e("dataService_downloadTemplate");
        iDxItemRenderService.downloadTemplate(list, new IDxItemRenderService.b() { // from class: com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    bVar.a();
                }
            }
        });
        lar.f("dataService_downloadTemplate");
    }

    public void preRenderItem(Context context, SectionModel sectionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34ba7", new Object[]{this, context, sectionModel, new Boolean(z), new Integer(i)});
            return;
        }
        IItemRenderService iItemRenderService = (IItemRenderService) this.infoFlowContext.a(IItemRenderService.class);
        if (iItemRenderService == null) {
            return;
        }
        iItemRenderService.getItemRenderPresenter().preRender(context, sectionModel, z, i);
    }

    public void preLoadTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44b489a7", new Object[]{this});
            return;
        }
        IThemeService iThemeService = (IThemeService) this.infoFlowContext.a(IThemeService.class);
        if (iThemeService == null) {
            return;
        }
        iThemeService.preCreateTheme();
    }

    public osn getDataServiceWindVaneProvider() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osn) ipChange.ipc$dispatch("aa97ede5", new Object[]{this}) : this.dataServiceWindVaneProvider;
    }

    public void notifyFeedsForceExposure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e79812d", new Object[]{this});
            return;
        }
        lar.e("dataService_notifyFeedsForceExposure");
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.infoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.forceExposure();
        }
        lar.f("dataService_notifyFeedsForceExposure");
    }

    private void notifyDataProcessStart(lli lliVar, String str) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc559e", new Object[]{this, lliVar, str});
            return;
        }
        List<IContainerDataService.a> list = this.dataProcessListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        lar.e("dataService_notifyDataProcessStart");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (IContainerDataService.a aVar : list) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            aVar.a(lliVar);
            String[] strArr = new String[i];
            strArr[0] = "notifyDataProcessStart " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + " ms";
            ldf.e(TAG, strArr);
            i = 1;
        }
        long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (TextUtils.equals(str, "coldStart")) {
            s.f18233a.d().a("DataProcessStart", Long.valueOf(elapsedRealtime3));
        }
        ldf.d(TAG, "notifyDataProcessStart 总耗时：" + elapsedRealtime3 + " ms");
        lar.f("dataService_notifyDataProcessStart");
    }

    private void notifyDataOnProcess(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a656fa", new Object[]{this, lliVar, iContainerDataModel, str});
            return;
        }
        List<IContainerDataService.a> list = this.dataProcessListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        lar.e("dataService_notifyDataOnProcess");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (IContainerDataService.a aVar : list) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            aVar.a(lliVar, iContainerDataModel);
            String[] strArr = new String[i];
            strArr[0] = "notifyDataOnProcess " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + " ms";
            ldf.e(TAG, strArr);
            i = 1;
        }
        long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (TextUtils.equals(str, "coldStart")) {
            s.f18233a.d().a("DataOnProcess", Long.valueOf(elapsedRealtime3));
        }
        ldf.d(TAG, "notifyDataOnProcess 总耗时：" + elapsedRealtime3 + " ms");
        lar.f("dataService_notifyDataOnProcess");
    }

    private void notifyDataProcessFinish(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7f1168", new Object[]{this, lliVar, iContainerDataModel, str});
            return;
        }
        List<IContainerDataService.a> list = this.dataProcessListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        lar.e("dataService_notifyDataProcessFinish");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (IContainerDataService.a aVar : list) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            aVar.b(lliVar, iContainerDataModel);
            String[] strArr = new String[i];
            strArr[0] = "notifyDataProcessFinish " + aVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + " ms";
            ldf.e(TAG, strArr);
            i = 1;
        }
        long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (TextUtils.equals(str, "coldStart")) {
            s.f18233a.d().a("DataProcessFinish", Long.valueOf(elapsedRealtime3));
        }
        ldf.d(TAG, "notifyDataProcessFinish 总耗时：" + elapsedRealtime3 + " ms");
        lar.f("dataService_notifyDataProcessFinish");
    }

    private Map<String, String> createBizParams(String str, lli lliVar) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("169f380a", new Object[]{this, str, lliVar});
        }
        List<IContainerDataService.c> list = this.requestBizParamsCreators;
        if (list == null || list.isEmpty()) {
            ldf.d(TAG, "bizParamsCreators is empty");
            return null;
        }
        HashMap hashMap = new HashMap(2);
        lar.e("dataService_createBizParams");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (IContainerDataService.c cVar : list) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Map<String, String> a2 = cVar.a(lliVar, str);
            String[] strArr = new String[i];
            strArr[0] = "createBizParams " + cVar.getClass().getName() + " 耗时：" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + " ms";
            ldf.e(TAG, strArr);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
            i = 1;
        }
        long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (TextUtils.equals(str, "coldStart")) {
            s.f18233a.d().a("SubBizParams", Long.valueOf(elapsedRealtime3));
        }
        ldf.d(TAG, "createBizParams 总耗时：" + elapsedRealtime3 + " ms");
        lar.f("dataService_createBizParams");
        return hashMap;
    }
}
