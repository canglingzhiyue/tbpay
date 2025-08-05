package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.FansLevelCondition;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class RewardDetailMsg implements INetDataObject {
    public ArrayList<FansLevelCondition> condition;
    public String presentingHierarchy;
    public String scopeId;
    public String subScope;
    public String taskId;

    static {
        kge.a(-263488054);
        kge.a(-540945145);
    }
}
