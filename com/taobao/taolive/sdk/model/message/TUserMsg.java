package com.taobao.taolive.sdk.model.message;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes8.dex */
public class TUserMsg implements Serializable {
    public Object data;
    public int type;

    static {
        kge.a(-1104176647);
        kge.a(1028243835);
    }

    public TUserMsg() {
    }

    public TUserMsg(UserMessageType userMessageType) {
        this.type = userMessageType.getType();
    }

    public TUserMsg(UserMessageType userMessageType, Object obj) {
        this.type = userMessageType.getType();
        this.data = obj;
    }
}
