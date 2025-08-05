package com.taobao.taolive.sdk.monitor.bean;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.monitor.a;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveAPMBean implements INetDataObject {
    public PerformanceData dataDelay1s;
    public PerformanceData dataDelay5s;
    public PerformanceData endPerformanceData;
    public HashMap<String, String> extParams;
    public boolean isColdStart;
    public boolean isEnd;
    public boolean isWholeSession;
    public a.InterfaceC0908a monitorListener;
    public String originSessionId;
    public float refreshRate;
    public List<SceneData> sceneDataList;
    public long startSessionTime;
    public PerformanceData totalPerformanceData;

    /* loaded from: classes8.dex */
    public static class PerformanceData implements INetDataObject {
        public long allFrameNums;
        public long costTime;
        public String cpu;
        public long currentTime;
        public long f0_t1;
        public long fps = -1;
        public long frameNums100_150;
        public long frameNums100_300;
        public long frameNums150_300;
        public long frameNums300_500;
        public long frameNums500_700;
        public long frameNumsNormal_100;
        public long freezeFrameNums;
        public long ft1_t2;
        public long ft2_x;
        public long hitchTotal;
        public String memory;
        public long seriousFrames;
        public long startTime;
        public long stuckFrames;

        static {
            kge.a(-1949121161);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class SceneData implements INetDataObject {
        public PerformanceData performanceData;
        public String scenePoint;

        static {
            kge.a(221733267);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(-1940152255);
        kge.a(-540945145);
    }
}
