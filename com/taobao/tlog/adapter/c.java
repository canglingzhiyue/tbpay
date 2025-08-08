package com.taobao.tlog.adapter;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.Map;

/* loaded from: classes.dex */
public class c implements com.taobao.tao.log.statistics.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context b;

    public c(Context context) {
        this.b = context;
    }

    @Override // com.taobao.tao.log.statistics.b
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (com.taobao.tao.log.statistics.d.UT_TLOG_FILE_SIZE.equals(str)) {
                a(map);
            } else if (com.taobao.tao.log.statistics.d.a(str)) {
                b(str, map);
            } else {
                UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str);
                uTCustomHitBuilder.setEventPage("TLOG_STATISTICS");
                uTCustomHitBuilder.setProperty("ts", String.valueOf(System.currentTimeMillis()));
                if (map != null) {
                    uTCustomHitBuilder.setProperties(map);
                }
                UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
                Object[] objArr = new Object[2];
                objArr[0] = str;
                objArr[1] = map == null ? "" : map.toString();
                String.format("tlog_ut: eventName=%s, data=%s", objArr);
                c(str, map);
            }
        }
    }

    private void b(final String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("event=");
            sb.append(str);
            sb.append(";");
            sb.append("ts=");
            sb.append(System.currentTimeMillis());
            sb.append(";");
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                    sb.append(";");
                }
            }
            final String sb2 = sb.toString();
            com.taobao.tao.log.utils.d.a().a(new Runnable() { // from class: com.taobao.tlog.adapter.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AppMonitor.Counter.commit("TLOG_STATISTICS", "TLOG_ERROR", sb2, 1.0d);
                    TLog.loge("TLOG", "TLogDataStatistics", "TLOG_ERROR: event=" + str + ", content=" + sb2);
                }
            });
        } catch (Exception e) {
            Log.e("TLogDataStatistics", "eventToDP2", e);
        }
    }

    private void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ec9e51", new Object[]{this, str, map});
            return;
        }
        try {
            if (!str.startsWith("ut_tlog_file_upload_") && !str.startsWith("ut_tlog_arup_")) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("event=");
            sb.append(str);
            sb.append(";");
            sb.append("ts=");
            sb.append(System.currentTimeMillis());
            sb.append(";");
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                    sb.append(";");
                }
            }
            AppMonitor.Alarm.commitSuccess("TLOG_STATISTICS", "TLOG_UPLOAD", sb.toString());
        } catch (Exception e) {
            Log.e("TLogDataStatistics", "eventToDP2", e);
        }
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append(";");
            }
        }
        Object[] objArr = new Object[1];
        objArr[0] = map != null ? sb.toString() : "";
        Log.e("TLogDataStatistics", String.format("TLog fileSizeEventToDP2: data=%s", objArr));
        AppMonitor.Alarm.commitSuccess("TLOG_STATISTICS", "TLOG_FILE", sb.toString());
    }
}
