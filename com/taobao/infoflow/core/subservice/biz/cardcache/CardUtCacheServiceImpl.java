package com.taobao.infoflow.core.subservice.biz.cardcache;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardUtCacheService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.List;
import tb.kge;
import tb.ljs;
import tb.lli;
import tb.qnl;
import tb.tdk;

/* loaded from: classes7.dex */
public class CardUtCacheServiceImpl implements ICardUtCacheService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ljs mInfoFlowContext;
    private IContainerDataService.b mRequestListener;

    static {
        kge.a(-1783019963);
        kge.a(-1641794388);
    }

    public static /* synthetic */ void access$000(CardUtCacheServiceImpl cardUtCacheServiceImpl, lli lliVar, IContainerDataModel iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea11151d", new Object[]{cardUtCacheServiceImpl, lliVar, iContainerDataModel, str});
        } else {
            cardUtCacheServiceImpl.checkAndAddCacheKey(lliVar, iContainerDataModel, str);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        if (!qnl.h()) {
            return;
        }
        initRegisterDataListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            unRegisterDataListener();
        }
    }

    private void initRegisterDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5909f8", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        this.mRequestListener = createRequestListener();
        iContainerDataService.addRequestListener(this.mRequestListener);
    }

    private void unRegisterDataListener() {
        IContainerDataService.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e881", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null && (bVar = this.mRequestListener) != null) {
            iContainerDataService.removeRequestListener(bVar);
        }
        tdk.a();
    }

    private IContainerDataService.b createRequestListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("88e46762", new Object[]{this}) : new IContainerDataService.b() { // from class: com.taobao.infoflow.core.subservice.biz.cardcache.CardUtCacheServiceImpl.1
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
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                } else if (iContainerDataModel == null || iContainerDataModel.getBase() == null) {
                } else {
                    CardUtCacheServiceImpl.access$000(CardUtCacheServiceImpl.this, lliVar, iContainerDataModel, str);
                }
            }
        };
    }

    private void checkAndAddCacheKey(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
        IContainerInnerDataModel<?> base;
        List<?> sections;
        JSONObject args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a446d168", new Object[]{this, lliVar, iContainerDataModel, str});
        } else if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null && (sections = base.getSections()) != null && sections.size() != 0) {
            if (lliVar != null && lliVar.b() != null && lliVar.b().getBooleanValue("isStreamRequest")) {
                return;
            }
            for (int i = 0; i < sections.size(); i++) {
                Object obj = sections.get(i);
                if ((obj instanceof BaseSectionModel) && (args = ((BaseSectionModel) obj).getArgs()) != null && args.getString(tdk.CACHE_KEY) == null) {
                    args.put(tdk.CACHE_KEY, (Object) Long.valueOf(System.nanoTime()));
                }
            }
        }
    }
}
