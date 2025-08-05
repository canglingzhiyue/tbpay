package com.taobao.infoflow.protocol.subservice.framework;

import android.view.ViewGroup;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.lkq;

/* loaded from: classes.dex */
public interface IContainerService<V extends ViewGroup> extends ISubService, lkq<V> {
    public static final String SERVICE_NAME = "ContainerService";

    /* loaded from: classes.dex */
    public interface a {
        void a(IUiRefreshActionModel iUiRefreshActionModel);

        void b(IUiRefreshActionModel iUiRefreshActionModel);
    }

    void addUiRefreshListener(a aVar);

    void removeUiRefreshListener(a aVar);

    void uiRefresh(IContainerDataModel iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel);
}
