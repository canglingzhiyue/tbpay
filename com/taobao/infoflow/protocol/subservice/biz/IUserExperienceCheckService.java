package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes7.dex */
public interface IUserExperienceCheckService extends ISubService {
    public static final String SERVICE_NAME = "IUserExperienceCheckService";

    /* loaded from: classes7.dex */
    public enum CheckOccasion {
        EXPOSE,
        CLICK
    }

    void saveGoodsInfo(BaseSectionModel<?> baseSectionModel);

    void startExperienceCheckTask(BaseSectionModel<?> baseSectionModel, CheckOccasion checkOccasion);
}
