package com.taobao.taolive.room.business.fanslevel;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class GetFansLevelDetailData implements INetDataObject {
    public String audienceExp;
    public String audienceLevel;
    public String briefUrl;
    public String detailUrl;
    public String expNeeded4NextLevel;
    public ArrayList<FanLevelConfigData> levels;
    public ArrayList<String> rewards;
    public String scopeId;
    public String subScopeId;
    public String weexUrl;

    static {
        kge.a(314930371);
        kge.a(-540945145);
    }
}
