package com.taobao.taolive.sdk.playcontrol.observe;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes8.dex */
public class RoomPlayerEvent implements Serializable {
    public int errCode;
    public String eventName;
    public long time;
    public JSONObject userAction;

    static {
        kge.a(120746364);
        kge.a(1028243835);
    }

    public RoomPlayerEvent(String str, long j) {
        this.eventName = str;
        this.time = j;
    }
}
