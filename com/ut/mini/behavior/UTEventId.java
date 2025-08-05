package com.ut.mini.behavior;

@Deprecated
/* loaded from: classes9.dex */
public enum UTEventId {
    PAGE(2001),
    EXPOSURE(2201),
    CLICK(2201),
    SCROLL(2601),
    SCENE(2701);
    
    private int eventId;

    UTEventId(int i) {
        this.eventId = i;
    }

    public int getEventId() {
        return this.eventId;
    }
}
