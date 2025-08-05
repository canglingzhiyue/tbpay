package com.taobao.falco;

import anet.channel.statist.Dimension;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import tb.nkd;

@Monitor(module = nkd.MONITOR_MODULE, monitorPoint = "Screenshot")
/* loaded from: classes7.dex */
public class FalcoScreenshotStatistic extends StatObject {
    @Dimension
    public String clickFalcoId;
    @Dimension
    public String localTime;
    @Dimension
    public String pageName;
    @Dimension
    public String pageUrl;
    @Dimension
    public String uid;
    @Dimension
    public String userInfo;
}
