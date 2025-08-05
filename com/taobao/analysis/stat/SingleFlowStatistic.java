package com.taobao.analysis.stat;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;

@Monitor(module = "networkPrefer", monitorPoint = "flow")
/* loaded from: classes.dex */
public class SingleFlowStatistic extends StatObject {
    @Dimension
    public String f_activityname;
    @Dimension
    public String f_biz;
    @Measure
    public long f_downstream;
    @Dimension
    public boolean f_isbackground;
    @Dimension
    public String f_protocoltype;
    @Dimension
    public String f_refer;
    @Dimension
    public String f_req_identifier;
    @Measure
    public long f_upstream;
    @Dimension
    public String f_webpageurl;

    public SingleFlowStatistic(String str, String str2, boolean z, String str3, String str4, String str5, String str6, long j, long j2) {
        this.f_refer = str;
        this.f_biz = str2;
        this.f_isbackground = z;
        this.f_protocoltype = str3;
        this.f_req_identifier = str4;
        this.f_activityname = str5;
        this.f_webpageurl = str6;
        this.f_upstream = j;
        this.f_downstream = j2;
    }
}
