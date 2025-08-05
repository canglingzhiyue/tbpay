package com.taobao.analysis.stat;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import com.taobao.analysis.scene.SceneIdentifier;

@Monitor(module = "networkPrefer", monitorPoint = "BgFlowReportMonitor")
/* loaded from: classes4.dex */
public class BgFlowReportStatistic extends StatObject {
    @Measure
    public int connectCount;
    @Dimension
    public String connectCountList;
    @Measure
    public double flowSize;
    @Measure
    public double flowTime;
    @Dimension
    public String ip;
    @Dimension
    public int timePeriod;
    @Dimension
    public String process = GlobalAppRuntimeInfo.getCurrentProcess();
    @Dimension
    public int deviceLevel = SceneIdentifier.getDeviceLevel();

    public BgFlowReportStatistic(String str, String str2, double d, double d2, int i, int i2) {
        this.flowSize = d;
        this.flowTime = d2;
        this.connectCountList = str;
        this.ip = str2;
        this.timePeriod = i;
        this.connectCount = i2;
    }
}
