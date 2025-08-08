package com.taobao.oversea.homepage.litetao.service.biz.search;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.b;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.oversea.discovery.business.data.SearchSuggest;
import com.taobao.oversea.discovery.business.model.a;
import com.taobao.oversea.discovery.business.mtop.c;
import com.taobao.tao.Globals;
import com.taobao.tao.infoflow.multitab.e;
import java.util.Map;
import tb.bhc;
import tb.bhd;
import tb.iqr;
import tb.ldf;
import tb.ljs;
import tb.lkb;
import tb.lkh;
import tb.lli;
import tb.nde;

/* loaded from: classes7.dex */
public class TaoTeSearchServiceImpl implements ITaoTeSearchService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ljs mInfoFlowContext;
    private final String TAG = TaoTeSearchServiceImpl.class.getSimpleName();
    private final IContainerDataService.a dataProcessListener = new IContainerDataService.a() { // from class: com.taobao.oversea.homepage.litetao.service.biz.search.TaoTeSearchServiceImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            TaoTeSearchServiceImpl.this = this;
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void a(lli lliVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
            } else {
                ldf.d(TaoTeSearchServiceImpl.access$000(TaoTeSearchServiceImpl.this), "dataProcess onStart");
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                return;
            }
            ldf.d(TaoTeSearchServiceImpl.access$000(TaoTeSearchServiceImpl.this), "dataProcess onProcess");
            TaoTeSearchServiceImpl.this.dataProcess(iContainerDataModel);
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
            } else {
                ldf.d(TaoTeSearchServiceImpl.access$000(TaoTeSearchServiceImpl.this), "dataProcess onFinish");
            }
        }
    };
    private final c<SearchSuggest> apiCallBack = new c<SearchSuggest>() { // from class: com.taobao.oversea.homepage.litetao.service.biz.search.TaoTeSearchServiceImpl.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.oversea.discovery.business.mtop.c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            }
        }

        {
            TaoTeSearchServiceImpl.this = this;
        }

        @Override // com.taobao.oversea.discovery.business.mtop.c
        public void a(SearchSuggest searchSuggest) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee883bf7", new Object[]{this, searchSuggest});
            } else if (searchSuggest.result == null || searchSuggest.result.searchText == null) {
            } else {
                TaoTeSearchServiceImpl.access$100(TaoTeSearchServiceImpl.this, searchSuggest.result.searchText);
            }
        }
    };

    public static /* synthetic */ String access$000(TaoTeSearchServiceImpl taoTeSearchServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d9c24a0c", new Object[]{taoTeSearchServiceImpl}) : taoTeSearchServiceImpl.TAG;
    }

    public static /* synthetic */ void access$100(TaoTeSearchServiceImpl taoTeSearchServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2caefabd", new Object[]{taoTeSearchServiceImpl, str});
        } else {
            taoTeSearchServiceImpl.updateSearchText(str);
        }
    }

    public static /* synthetic */ void access$200(TaoTeSearchServiceImpl taoTeSearchServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa287a52", new Object[]{taoTeSearchServiceImpl});
        } else {
            taoTeSearchServiceImpl.requestTaoteSearchSuggest();
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
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d(this.TAG, "containerDataService is null");
        } else {
            iContainerDataService.addDataProcessListener(this.dataProcessListener);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        iContainerDataService.removeDataProcessListener(this.dataProcessListener);
    }

    public void dataProcess(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b9344f", new Object[]{this, iContainerDataModel});
            return;
        }
        updateUtParam();
        if (iContainerDataModel.getBase().mo1280getPageParams().getPageNum() != 0) {
            return;
        }
        requestSearchText();
    }

    @Override // com.taobao.oversea.homepage.litetao.service.biz.search.ITaoTeSearchService
    public JSONObject getSearchData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c3242d0f", new Object[]{this});
        }
        if (countryIsMatched()) {
            return splicingSearchUrl(a.g);
        }
        requestSearchText();
        return null;
    }

    private JSONObject getLastSubTabSearchBarData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("607bd35b", new Object[]{this});
        }
        lkb a2 = nde.a(this.mInfoFlowContext);
        if (a2 == null) {
            ldf.d(this.TAG, "naviBarCallback == null");
            return null;
        }
        return a2.c();
    }

    private JSONObject splicingSearchUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6ecbc59f", new Object[]{this, str});
        }
        try {
            JSONObject lastSubTabSearchBarData = getLastSubTabSearchBarData();
            JSONObject jSONObject = lastSubTabSearchBarData.getJSONObject("subSection").getJSONObject("searchBox").getJSONObject("subSection");
            if (jSONObject == null) {
                return null;
            }
            nde.a(str, jSONObject.getJSONObject("0").getJSONObject("item").getJSONObject("0"));
            a.g = str;
            return lastSubTabSearchBarData;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private void updateSearchText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3148af", new Object[]{this, str});
            return;
        }
        a.g = str;
        final lkb a2 = nde.a(this.mInfoFlowContext);
        if (a2 == null) {
            ldf.d(this.TAG, "naviBarCallback == null");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.oversea.homepage.litetao.service.biz.search.-$$Lambda$TaoTeSearchServiceImpl$3sOXwwmLU7Wbz5ekoCh65d-EUk0
                @Override // java.lang.Runnable
                public final void run() {
                    TaoTeSearchServiceImpl.lambda$updateSearchText$3(lkb.this);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$updateSearchText$3(lkb lkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b43208fe", new Object[]{lkbVar});
        } else {
            lkbVar.d();
        }
    }

    private boolean countryIsMatched() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9718d42f", new Object[]{this})).booleanValue();
        }
        try {
            str = getLastSubTabSearchBarData().getJSONObject("args").getString("site");
        } catch (Throwable unused) {
            str = "";
        }
        return StringUtils.equals(str, b.b(Globals.getApplication()).editionCode);
    }

    private void requestSearchText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85baa56b", new Object[]{this});
            return;
        }
        try {
            String string = getLastSubTabSearchBarData().getJSONObject("subSection").getJSONObject("searchBox").getJSONObject("item").getJSONObject("0").getJSONObject(e.KEY_SMART_CONTENT).getString("channelSrp");
            if (!StringUtils.isEmpty(string)) {
                a.f = string;
            }
            if (iqr.a()) {
                requestTaoteSearchSuggest();
            } else {
                requestInstallFeature();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void requestTaoteSearchSuggest() {
        try {
            Class<?> cls = Class.forName("com.taobao.oversea.homepage.litetao.service.biz.search.TaoteRequest");
            cls.getDeclaredMethod("requestTaoteSearchSuggest", Context.class, Class.class, c.class).invoke(cls, Globals.getApplication(), SearchSuggest.class, this.apiCallBack);
        } catch (Exception e) {
            Log.e("qiaoyang", "requestTaoteSearchSuggest 失败");
            e.printStackTrace();
        }
    }

    private void requestInstallFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0de0d1", new Object[]{this});
        } else {
            h.a(Globals.getApplication()).a(j.a().a(bhd.a(Globals.getApplication(), "com.taobao.oversea.discovery.TmgDiscoveryRemoteFragment").a(new bhc.b<Fragment>() { // from class: com.taobao.oversea.homepage.litetao.service.biz.search.TaoTeSearchServiceImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bhc.b
                public void a(String str, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                    }
                }

                {
                    TaoTeSearchServiceImpl.this = this;
                }

                @Override // tb.bhc.b
                public void a(Fragment fragment, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("80cf6b4a", new Object[]{this, fragment, bundle});
                    } else {
                        TaoTeSearchServiceImpl.access$200(TaoTeSearchServiceImpl.this);
                    }
                }
            }).a()).a());
        }
    }

    public void updateUtParam() {
        JSONObject currentPageParams;
        IHostService iHostService;
        lkh d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b4ea2c", new Object[]{this});
            return;
        }
        try {
            com.taobao.infoflow.protocol.model.datamodel.response.a pageInfo = ((IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class)).getPageInfo();
            if (pageInfo == null || (currentPageParams = pageInfo.getCurrentPageParams()) == null || (iHostService = (IHostService) this.mInfoFlowContext.a(IHostService.class)) == null || (d = iHostService.getInvokeCallback().d()) == null) {
                return;
            }
            d.a((Map) JSONObject.parseObject(currentPageParams.toJSONString(), new TypeReference<Map<String, String>>() { // from class: com.taobao.oversea.homepage.litetao.service.biz.search.TaoTeSearchServiceImpl.4
                {
                    TaoTeSearchServiceImpl.this = this;
                }
            }, new Feature[0]));
        } catch (Throwable unused) {
        }
    }
}
