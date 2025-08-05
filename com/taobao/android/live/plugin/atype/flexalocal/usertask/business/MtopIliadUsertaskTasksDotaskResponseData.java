package com.taobao.android.live.plugin.atype.flexalocal.usertask.business;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.MtopIliadUsertaskTasksEntryResponseData;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class MtopIliadUsertaskTasksDotaskResponseData implements INetDataObject {
    public JSONObject asset;
    public int countdownTime;
    public long deliveryId;
    public JSONObject deltaPoint;
    public MtopIliadUsertaskTasksEntryResponseData.EntryConfig entryConfig;
    public String jumpData;
    public String jumpType;
    public JSONObject newAtmosphere;
    public UserTaskProcess process;
    public JSONObject rewards;
    public Map<String, String> utParams;

    static {
        kge.a(485638036);
        kge.a(-540945145);
    }
}
