package com.taobao.infoflow.taobao.subservice.biz.pop.lifecycle;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import java.util.ArrayList;
import tb.kge;
import tb.kyu;

/* loaded from: classes7.dex */
public class g implements IContainerService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private kyu f17506a;

    static {
        kge.a(1076992803);
        kge.a(504102497);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
    public void b(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2729410f", new Object[]{this, iUiRefreshActionModel});
        }
    }

    public g(kyu kyuVar) {
        this.f17506a = kyuVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
    public void a(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4935db30", new Object[]{this, iUiRefreshActionModel});
        } else if (iUiRefreshActionModel == null || !TextUtils.equals(iUiRefreshActionModel.getUiOperationType(), "uiRefresh")) {
        } else {
            boolean isEmpty = TextUtils.isEmpty(iUiRefreshActionModel.getErrorCode());
            boolean equals = TextUtils.equals("remote", iUiRefreshActionModel.getDataSourceType());
            if (!equals || !isEmpty) {
                com.taobao.homepage.pop.utils.c.a("PopOnUiRefreshListener ", "ui refresh error, isRemote=" + equals + ", success=" + isEmpty);
                return;
            }
            IContainerDataModel containerModel = iUiRefreshActionModel.getContainerModel();
            if (containerModel == null) {
                com.taobao.homepage.pop.utils.c.a("PopOnUiRefreshListener ", "ui refresh error, dataModel is null");
                return;
            }
            IContainerInnerDataModel base = containerModel.getBase();
            if (base == null || base.mo1280getPageParams() == null) {
                com.taobao.homepage.pop.utils.c.a("PopOnUiRefreshListener ", "ui refresh error, base is null or pageParams is null");
                return;
            }
            boolean equals2 = TextUtils.equals(iUiRefreshActionModel.getDataChangeType(), "base");
            if (TextUtils.equals("coldStart", iUiRefreshActionModel.getRequestType()) || base.mo1280getPageParams().getPageNum() == 0) {
                z = true;
            }
            if (com.taobao.homepage.pop.utils.c.a() && z) {
                z = !TextUtils.equals(iUiRefreshActionModel.getRequestType(), "scrollNextPage");
            }
            if (equals2 && !z) {
                com.taobao.homepage.pop.utils.c.a("PopOnUiRefreshListener ", "ui refresh error, not firstPage base refresh");
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (equals2 && base.getPopData() != null) {
                arrayList.addAll(base.getPopData());
            }
            IContainerInnerDataModel delta = containerModel.getDelta();
            if (delta != null && delta.getPopData() != null) {
                arrayList.addAll(delta.getPopData());
            }
            this.f17506a.c().a(equals2, iUiRefreshActionModel.getRequestType(), arrayList);
        }
    }
}
