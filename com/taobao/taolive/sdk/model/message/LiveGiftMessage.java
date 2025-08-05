package com.taobao.taolive.sdk.model.message;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveGiftMessage implements INetDataObject {
    public int comboNum;
    public long msgId;
    public long price;
    public long senderId;
    public String senderNick;
    public String taskId;
    public String type;

    static {
        kge.a(260047604);
        kge.a(-540945145);
    }
}
