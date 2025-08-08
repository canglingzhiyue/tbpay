package com.taobao.alimama.tkcps;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.threads.BackgroundExecutor;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.util.TaoLog;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CLK1 = "clk1";
    public static final String KEY_TTID = "dynamic_ttid";

    static {
        kge.a(-424565499);
        kge.a(-1140128487);
    }

    public a(String str) {
        TaoLog.Logi("AlimamaSdk", "create taoke cps implement : " + str);
        TaokeBaseUtil.c(str);
    }

    @Override // com.taobao.alimama.tkcps.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.taobao.alimama.tkcps.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        g.a().b();
                    }
                }
            });
        }
    }

    @Override // com.taobao.alimama.tkcps.b
    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : a(str, g.a().a(str));
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (!"flj".equals(str) || str2 == null || StringUtils.isDigitsOnly(str2)) {
            return str2;
        }
        UserTrackLogs.trackAdLog("Munion_tk_cps_param_parse", "error_code=0", "error_msg=flj_value_error", "req_param=" + str2);
        return null;
    }

    @Override // com.taobao.alimama.tkcps.b
    public void b(String str) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        TaoLog.Logd("AlimamaSdk", String.format("parsing tk_cps_param: %s", str));
        if (StringUtils.isEmpty(str) || (a2 = a("flj", str)) == null) {
            return;
        }
        g.a().a("flj", a2);
        BackgroundExecutor.execute(new Runnable() { // from class: com.taobao.alimama.tkcps.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    g.a().c();
                }
            }
        });
    }

    @Override // com.taobao.alimama.tkcps.b
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            TaokeBaseUtil.b(str);
        }
    }

    @Override // com.taobao.alimama.tkcps.b
    public void a(String str, long j, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c709d8e2", new Object[]{this, str, new Long(j), new Long(j2), new Boolean(z)});
        } else if (com.taobao.alimama.utils.c.h()) {
            TaokeBaseUtil.a(str, j, j2, z, (Map<String, String>) null);
        } else {
            TaokeBaseUtil.b(str, j, j2, z, null);
        }
    }

    @Override // com.taobao.alimama.tkcps.b
    public void a(String str, long j, long j2, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9422e263", new Object[]{this, str, new Long(j), new Long(j2), new Boolean(z), map});
            return;
        }
        com.taobao.alimama.utils.e.a("weex_commit_taoke_info", "url=" + str + ",extMap=" + JSON.toJSONString(map));
        TaokeBaseUtil.a(str, j, j2, z, map);
    }

    @Override // com.taobao.alimama.tkcps.b
    public void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{this, str, str2, str3, map});
        } else {
            TaokeBaseUtil.a(str, str2, str3, map);
        }
    }

    @Override // com.taobao.alimama.tkcps.b
    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : TaokeBaseUtil.b();
    }

    @Override // com.taobao.alimama.tkcps.b
    @Deprecated
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            TaokeBaseUtil.a();
        }
    }
}
