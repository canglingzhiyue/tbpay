package com.taobao.unit.center.templatesync;

import com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel;

/* loaded from: classes9.dex */
public interface ILayoutSyncService {
    void checkSync();

    UnitCenterLayoutInfoModel getLayoutInfoModel(String str, String str2);

    void setUnitCenterLayoutInfoModel(UnitCenterLayoutInfoModel unitCenterLayoutInfoModel);
}
