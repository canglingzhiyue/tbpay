package com.taobao.message.chatv2.viewcenter;

import com.alibaba.fastjson.JSONObject;
import com.taobao.message.chatv2.viewcenter.config.LayoutInfo;

/* loaded from: classes7.dex */
public interface ITemplateService {

    /* loaded from: classes7.dex */
    public interface ISyncListener {
        void onSync();
    }

    void addSyncListener(ISyncListener iSyncListener);

    LayoutInfo getLayoutInfo(int i, JSONObject jSONObject);

    void removeSyncListener(ISyncListener iSyncListener);
}
