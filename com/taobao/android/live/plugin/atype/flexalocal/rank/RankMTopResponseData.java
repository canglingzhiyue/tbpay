package com.taobao.android.live.plugin.atype.flexalocal.rank;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class RankMTopResponseData implements INetDataObject {
    public RankUserEntity curUser;
    public JSONObject jumpInfo;
    public String jumpUrl;
    public String rankType;
    public List<RankUserEntity> rankUsers;
    public long totalCount;

    static {
        kge.a(-1540897642);
        kge.a(-540945145);
    }
}
