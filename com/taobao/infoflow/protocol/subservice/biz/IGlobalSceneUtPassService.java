package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes.dex */
public interface IGlobalSceneUtPassService extends ISubService {
    public static final String SERVICE_NAME = "GlobalSceneUtPassService";

    void onClick(BaseSubItemModel baseSubItemModel);
}
