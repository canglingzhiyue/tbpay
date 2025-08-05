package com.taobao.analysis.stat;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

@Monitor(module = "networkPrefer", monitorPoint = "dayflow")
/* loaded from: classes.dex */
public class DayFlowStatistic extends StatObject {
    private static final String DEFAULT_DAYFLOW_REFER = "total";
    private static Comparator<Map.Entry<String, Long>> comparator = new Comparator<Map.Entry<String, Long>>() { // from class: com.taobao.analysis.stat.DayFlowStatistic.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public /* synthetic */ int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, entry, entry2})).intValue() : a(entry, entry2);
        }

        public int a(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f17356bb", new Object[]{this, entry, entry2})).intValue();
            }
            int compareTo = entry.getValue().compareTo(entry2.getValue());
            if (compareTo == 0) {
                return 1;
            }
            return compareTo;
        }
    };
    @Dimension
    public String date;
    @Dimension
    public String f_domain_flow;
    @Measure
    public long f_downstream_2g;
    @Measure
    public long f_downstream_3g;
    @Measure
    public long f_downstream_4g;
    @Measure
    public long f_downstream_5g;
    @Measure
    public long f_downstream_unknow;
    @Measure
    public long f_downstream_wifi;
    @Measure
    public long f_flow_bg;
    @Measure
    public long f_flow_fg;
    @Dimension
    public String f_refer = DEFAULT_DAYFLOW_REFER;
    @Dimension
    public String f_refer_flow;
    @Measure
    public long f_upstream_2g;
    @Measure
    public long f_upstream_3g;
    @Measure
    public long f_upstream_4g;
    @Measure
    public long f_upstream_5g;
    @Measure
    public long f_upstream_unknow;
    @Measure
    public long f_upstream_wifi;
    @Dimension
    public int hour;

    public DayFlowStatistic(long[] jArr, long j, long j2, Map<String, Long> map, Map<String, Long> map2) {
        if (jArr.length >= 12) {
            this.f_upstream_unknow = jArr[0];
            this.f_downstream_unknow = jArr[1];
            this.f_upstream_wifi = jArr[2];
            this.f_downstream_wifi = jArr[3];
            this.f_upstream_2g = jArr[4];
            this.f_downstream_2g = jArr[5];
            this.f_upstream_3g = jArr[6];
            this.f_downstream_3g = jArr[7];
            this.f_upstream_4g = jArr[8];
            this.f_downstream_4g = jArr[9];
            this.f_upstream_5g = jArr[10];
            this.f_downstream_5g = jArr[11];
        }
        this.f_flow_fg = j;
        this.f_flow_bg = j2;
        this.f_refer_flow = new JSONObject(map).toString();
        try {
            if (map2.size() <= 12) {
                this.f_domain_flow = new JSONObject(map2).toString();
                return;
            }
            TreeSet treeSet = new TreeSet(comparator);
            treeSet.addAll(map2.entrySet());
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < 12 && !treeSet.isEmpty(); i++) {
                Map.Entry entry = (Map.Entry) treeSet.pollLast();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            this.f_domain_flow = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }
}
