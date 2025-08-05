package com.taobao.android.goodprice.homepage.service.impl.bizservice;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.ljs;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final List<String> b;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f12713a;
    private final d c = new d();
    private long d;

    static {
        kge.a(1422527793);
        b = Arrays.asList(Constant.KEY_PAGEBACK, "homeTabAppear");
    }

    public b(ljs ljsVar) {
        this.f12713a = ljsVar;
    }

    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        if (c(str)) {
            return this.c.a(this.d, c());
        }
        return null;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!a()) {
        } else {
            this.d = System.currentTimeMillis() - 1000;
        }
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue() : a() && d(str) && !b();
    }

    private boolean a() {
        JSONObject firstScreenExt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        IFirstScreenDataService iFirstScreenDataService = (IFirstScreenDataService) this.f12713a.a(IFirstScreenDataService.class);
        return (iFirstScreenDataService == null || (firstScreenExt = iFirstScreenDataService.getFirstScreenExt()) == null || !firstScreenExt.getBooleanValue("searchBackRefreshEnabled")) ? false : true;
    }

    private boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue() : b.contains(str);
    }

    private boolean b() {
        IContainerDataModel containerData;
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f12713a.a(IContainerDataService.class);
        if (iContainerDataService != null && (containerData = iContainerDataService.getContainerData()) != null && (base = containerData.getBase()) != null) {
            return base.isAbandoned();
        }
        return false;
    }

    private String c() {
        int[] visiblePositionRange;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f12713a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null && (visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange()) != null && visiblePositionRange.length == 2) {
            ArrayList arrayList = new ArrayList();
            for (int i = visiblePositionRange[0]; i < visiblePositionRange[1]; i++) {
                BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i);
                if (findItemDataByPosition != null && findItemDataByPosition.getSectionBizCode().matches("home_[0-9]+_guess_[0-9]+(.*)")) {
                    arrayList.add(findItemDataByPosition.getSectionBizCode());
                }
            }
            if (arrayList.size() > 0 && arrayList.size() <= 4) {
                return (String) arrayList.get(0);
            }
            if (arrayList.size() > 4) {
                return (String) arrayList.get(2);
            }
        }
        return "";
    }
}
