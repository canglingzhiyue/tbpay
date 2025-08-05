package com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload;

import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public final class PrefetchDownloadConfigBean implements Serializable {
    public String enable;
    public Integer size;
    public List<TimeRange> timeRanges;
    public int pbid = 99999;
    public boolean enableOpti = false;
    public float limitDeviceScore = -1.0f;

    /* loaded from: classes8.dex */
    public static final class TimeRange implements Serializable {
        public Long end;
        public Long start;

        static {
            kge.a(-109432248);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-1369370980);
        kge.a(1028243835);
    }
}
