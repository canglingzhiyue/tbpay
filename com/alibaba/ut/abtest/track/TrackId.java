package com.alibaba.ut.abtest.track;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class TrackId {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String abTrackId;

    static {
        kge.a(-1570328267);
    }

    public String getAbTrackId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("efc748aa", new Object[]{this}) : this.abTrackId;
    }

    public void setAbTrackId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5f8874", new Object[]{this, str});
        } else {
            this.abTrackId = str;
        }
    }
}
