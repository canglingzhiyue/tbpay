package com.taobao.taolive.room.service;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class TppParamFeedInfo implements INetDataObject {
    public String accountId;
    public HashMap<String, Object> clientReturnMap;
    public int comment;
    public long enter;
    public String fansLevel;
    public int follow;
    public int followStatus;
    public int like;
    public String liveId;
    public int openComment;
    public int openGoodsList;
    public String recommendBindId;
    public long roomViewCnt;
    public int share;
    public String sjsdItemId;
    public long stay;
    public String timeMovingId;
    public ArrayList<Long> gotoDetail = new ArrayList<>();
    public ArrayList<Long> addCart = new ArrayList<>();

    static {
        kge.a(1608593375);
        kge.a(-540945145);
    }
}
