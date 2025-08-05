package com.taobao.infoflow.taobao.subservice.biz.pagebackItemClickService;

import android.text.TextUtils;
import android.view.View;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IPageBackItemClickService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.ljs;
import tb.lli;

/* loaded from: classes7.dex */
public class PageBackItemClickServiceImpl implements IPageBackItemClickService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY = "clickRequestParams";
    private String mClickRequestParams = null;
    private IContainerDataService mContainerDataService;
    private IDxItemClickService mDxItemClickService;
    private IDxItemClickService.a mOnDxItemClickListener;
    private IContainerDataService.d mRequestCommonBizParamsCreator;

    static {
        kge.a(599220762);
        kge.a(1932524512);
    }

    public static /* synthetic */ String access$000(PageBackItemClickServiceImpl pageBackItemClickServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe1193d0", new Object[]{pageBackItemClickServiceImpl}) : pageBackItemClickServiceImpl.mClickRequestParams;
    }

    public static /* synthetic */ String access$002(PageBackItemClickServiceImpl pageBackItemClickServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b54f4948", new Object[]{pageBackItemClickServiceImpl, str});
        }
        pageBackItemClickServiceImpl.mClickRequestParams = str;
        return str;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (this.mContainerDataService != null) {
            this.mRequestCommonBizParamsCreator = new IContainerDataService.d() { // from class: com.taobao.infoflow.taobao.subservice.biz.pagebackItemClickService.PageBackItemClickServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.d
                public Map<String, String> a(lli lliVar, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("add74dce", new Object[]{this, lliVar, str});
                    }
                    if (!Constant.KEY_PAGEBACK.equals(str) || TextUtils.isEmpty(PageBackItemClickServiceImpl.access$000(PageBackItemClickServiceImpl.this))) {
                        return null;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(PageBackItemClickServiceImpl.KEY, PageBackItemClickServiceImpl.access$000(PageBackItemClickServiceImpl.this));
                    PageBackItemClickServiceImpl.access$002(PageBackItemClickServiceImpl.this, null);
                    return hashMap;
                }
            };
            this.mContainerDataService.addRequestCommonBizParamsCreator(this.mRequestCommonBizParamsCreator);
        }
        this.mDxItemClickService = (IDxItemClickService) ljsVar.a(IDxItemClickService.class);
        if (this.mDxItemClickService == null) {
            return;
        }
        this.mOnDxItemClickListener = new IDxItemClickService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.pagebackItemClickService.PageBackItemClickServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.a
            public void a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b6a38c", new Object[]{this, baseSectionModel, baseSubItemModel, view});
                } else if (baseSubItemModel == null || baseSubItemModel.getExt() == null || !baseSubItemModel.getExt().containsKey(PageBackItemClickServiceImpl.KEY)) {
                    PageBackItemClickServiceImpl.access$002(PageBackItemClickServiceImpl.this, null);
                } else {
                    PageBackItemClickServiceImpl.access$002(PageBackItemClickServiceImpl.this, baseSubItemModel.getExt().getString(PageBackItemClickServiceImpl.KEY));
                }
            }
        };
        this.mDxItemClickService.addDxItemClickListener(this.mOnDxItemClickListener);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IContainerDataService.d dVar;
        IDxItemClickService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = this.mDxItemClickService;
        if (iDxItemClickService != null && (aVar = this.mOnDxItemClickListener) != null) {
            iDxItemClickService.removeDxItemClickListener(aVar);
            this.mOnDxItemClickListener = null;
        }
        IContainerDataService iContainerDataService = this.mContainerDataService;
        if (iContainerDataService != null && (dVar = this.mRequestCommonBizParamsCreator) != null) {
            iContainerDataService.removeRequestCommonBizParamsCreator(dVar);
            this.mRequestCommonBizParamsCreator = null;
        }
        if (this.mClickRequestParams == null) {
            return;
        }
        this.mClickRequestParams = null;
    }
}
