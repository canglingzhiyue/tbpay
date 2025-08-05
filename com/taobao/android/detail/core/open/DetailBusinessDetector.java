package com.taobao.android.detail.core.open;

import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;

/* loaded from: classes4.dex */
public interface DetailBusinessDetector {

    /* loaded from: classes4.dex */
    public enum DetectResult {
        yes_native,
        yes_h5,
        no
    }

    DetectResult detect(String str, DetailCoreActivity detailCoreActivity);

    boolean detect(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, DetailCoreActivity detailCoreActivity);

    boolean isDefaultDetailApi();

    void reCustomizeDetail(g gVar, DetailCoreActivity detailCoreActivity);
}
