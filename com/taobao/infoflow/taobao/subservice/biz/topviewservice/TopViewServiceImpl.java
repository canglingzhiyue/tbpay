package com.taobao.infoflow.taobao.subservice.biz.topviewservice;

import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.a;
import com.taobao.bootimage.linked.h;
import com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.keq;
import tb.kge;
import tb.ldf;
import tb.ldg;
import tb.ljs;
import tb.lli;
import tb.lsd;
import tb.lsk;
import tb.lss;

/* loaded from: classes.dex */
public class TopViewServiceImpl implements ITopViewService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ljs mInfoFlowContext;
    private lss mTopViewResponder;
    private a pageBizCallback;
    private final List<ITopViewService.a> mTopViewShowListeners = new CopyOnWriteArrayList();
    private final IContainerDataService.a mDataProcessListener = new IContainerDataService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.topviewservice.TopViewServiceImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void a(lli lliVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
            } else if (TopViewServiceImpl.access$000(TopViewServiceImpl.this) == null) {
            } else {
                ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopViewServiceImpl#onFinish-> 更新闪屏数据");
                TopViewServiceImpl.access$000(TopViewServiceImpl.this).a(iContainerDataModel);
                TopViewServiceImpl.access$100(TopViewServiceImpl.this);
            }
        }
    };

    static {
        kge.a(-548518438);
        kge.a(-607806073);
    }

    public static /* synthetic */ lss access$000(TopViewServiceImpl topViewServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lss) ipChange.ipc$dispatch("812a162a", new Object[]{topViewServiceImpl}) : topViewServiceImpl.mTopViewResponder;
    }

    public static /* synthetic */ void access$100(TopViewServiceImpl topViewServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99ac26f", new Object[]{topViewServiceImpl});
        } else {
            topViewServiceImpl.commitBootImageMonitor();
        }
    }

    public static /* synthetic */ List access$200(TopViewServiceImpl topViewServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("36c83bb9", new Object[]{topViewServiceImpl}) : topViewServiceImpl.mTopViewShowListeners;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopViewServiceImpl#onCreateService-> TopViewService服务创建");
        this.mInfoFlowContext = ljsVar;
        this.mTopViewResponder = new lsd(ljsVar);
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        iContainerDataService.addDataProcessListener(this.mDataProcessListener);
        this.pageBizCallback = createPageBizCallback();
        lss lssVar = this.mTopViewResponder;
        if (lssVar == null) {
            return;
        }
        lssVar.a(this.pageBizCallback);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "TopViewServiceImpl#onDestroyService-> TopViewService服务销毁");
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        iContainerDataService.removeDataProcessListener(this.mDataProcessListener);
        lss lssVar = this.mTopViewResponder;
        if (lssVar != null) {
            lssVar.b(this.pageBizCallback);
            this.mTopViewResponder.b();
        }
        this.mTopViewShowListeners.clear();
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService
    public boolean expendTopViewRecord() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e64c398", new Object[]{this})).booleanValue();
        }
        lss lssVar = this.mTopViewResponder;
        if (lssVar == null) {
            return false;
        }
        return lssVar.a();
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService
    public JSONObject getSubTabSearchBarData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        lss lssVar = this.mTopViewResponder;
        if (lssVar == null) {
            return null;
        }
        return lssVar.c();
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService
    public void addTopViewShowListener(ITopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0385c", new Object[]{this, aVar});
        } else {
            this.mTopViewShowListeners.add(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService
    public void removeTopViewShowListener(ITopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77dde5d9", new Object[]{this, aVar});
        } else {
            this.mTopViewShowListeners.remove(aVar);
        }
    }

    private a createPageBizCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a2e18e01", new Object[]{this}) : new a() { // from class: com.taobao.infoflow.taobao.subservice.biz.topviewservice.TopViewServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.bootimage.linked.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                ldf.d(lsk.SPLASH_BUSINESS_TAG, "createPageBizCallback->onShowing");
                for (ITopViewService.a aVar : TopViewServiceImpl.access$200(TopViewServiceImpl.this)) {
                    aVar.a(str);
                }
            }

            @Override // com.taobao.bootimage.linked.a
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                ldf.d(lsk.SPLASH_BUSINESS_TAG, "createPageBizCallback->onClose");
                for (ITopViewService.a aVar : TopViewServiceImpl.access$200(TopViewServiceImpl.this)) {
                    aVar.b();
                }
            }
        };
    }

    private void commitBootImageMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661a236f", new Object[]{this});
        } else {
            com.taobao.gateway.dispatch.a.b().f(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.topviewservice.TopViewServiceImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        keq h = h.a(lsk.BIZ_NAME).h();
                        List<String> a2 = h.a();
                        if (a2 != null && !a2.isEmpty()) {
                            for (String str : a2) {
                                JSONObject parseObject = JSONObject.parseObject(str);
                                ldf.d(lsk.SPLASH_BUSINESS_TAG, "commitBootImageMonitor -> commit");
                                ldg.b(parseObject.getString("actionType"), parseObject.getString(BindingXConstants.KEY_SCENE_TYPE), (Map) JSONObject.parseObject(parseObject.getJSONObject("args").toJSONString(), new TypeReference<Map<String, Object>>() { // from class: com.taobao.infoflow.taobao.subservice.biz.topviewservice.TopViewServiceImpl.3.1
                                }, new Feature[0]));
                            }
                            ldf.d(lsk.SPLASH_BUSINESS_TAG, "commitBootImageMonitor -> clear");
                            h.b();
                            return;
                        }
                        ldf.d(lsk.SPLASH_BUSINESS_TAG, "commitBootImageMonitor bootImageMonitorList -> isEmpty");
                    } catch (Throwable th) {
                        ldf.a(lsk.SPLASH_BUSINESS_TAG, "commitBootImageMonitor -> error", th);
                    }
                }
            });
        }
    }
}
