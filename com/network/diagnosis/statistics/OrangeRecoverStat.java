package com.network.diagnosis.statistics;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;

@Monitor(module = "npm", monitorPoint = "orange_recover")
/* loaded from: classes4.dex */
public class OrangeRecoverStat extends StatObject {
    @Dimension
    public int ret;
    @Dimension
    public int statusCode;
    @Measure
    public long totalTime;
}
