package com.taobao.mediaplay.model;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class TBLiveMSGInfo implements Serializable {
    public int bizCode;
    public byte[] data;
    public String from;
    public String messageId;
    public boolean needAck;
    public int priority;
    public int qosLevel;
    public boolean sendFullTags;
    public String[] tags;
    public long timestamp;
    public String to;
    public String topic;
    public int type = -1;
    public String userId;

    static {
        kge.a(-117165883);
        kge.a(1028243835);
    }
}
