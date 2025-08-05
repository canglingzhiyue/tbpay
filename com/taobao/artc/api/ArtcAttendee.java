package com.taobao.artc.api;

import tb.kge;

/* loaded from: classes6.dex */
public class ArtcAttendee {
    public boolean audio;
    public String uid;
    public boolean video;

    static {
        kge.a(-929562453);
    }

    public ArtcAttendee(String str, boolean z, boolean z2) {
        this.uid = str;
        this.video = z;
        this.audio = z2;
    }
}
