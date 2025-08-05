package anet.channel.entity;

import tb.kge;

/* loaded from: classes.dex */
public class Event {
    public int errorCode;
    public String errorDetail;
    public final int eventType;

    static {
        kge.a(-1913892499);
    }

    public Event(int i) {
        this.eventType = i;
    }

    public Event(int i, int i2, String str) {
        this.eventType = i;
        this.errorCode = i2;
        this.errorDetail = str;
    }
}
