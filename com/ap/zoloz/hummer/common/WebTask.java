package com.ap.zoloz.hummer.common;

import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.rrv;

/* loaded from: classes3.dex */
public class WebTask extends TaskTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String url = "";

    static {
        kge.a(-1706000725);
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.url;
    }

    @Override // com.ap.zoloz.hummer.common.TaskTracker
    public void run(b bVar, final TaskConfig taskConfig, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974ff795", new Object[]{this, bVar, taskConfig, gVar});
            return;
        }
        this.mITaskTrackerCallback = gVar;
        this.mTaskConfig = taskConfig;
        this.isLive = true;
        if (taskConfig == null || bVar == null) {
            return;
        }
        this.mHummerContext = bVar;
        this.mHummerContext.a("currentTaskName", "context", taskConfig.name);
        this.mIAlertManagerCallback = new e() { // from class: com.ap.zoloz.hummer.common.WebTask.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ap.zoloz.hummer.common.e
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                }
            }

            @Override // com.ap.zoloz.hummer.common.e
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (!taskConfig.navigateConfig.containsKey("error")) {
                } else {
                    WebTask.this.mITaskTrackerCallback.a(WebTask.this.mHummerContext, ((Integer) ((Map) taskConfig.navigateConfig.get("error")).get("index")).intValue());
                }
            }
        };
        if (!taskConfig.inputParams.containsKey("url")) {
            this.mHummerContext.a(taskConfig.name, "Z7026");
            this.mHummerContext.b(taskConfig.name, "Z7026");
            a.a().a(this.mIAlertManagerCallback);
            return;
        }
        this.url = (String) this.mHummerContext.a(String.valueOf(((Map) taskConfig.inputParams.get("url")).get("value")));
        if (StringUtil.isNullorEmpty(this.url)) {
            this.mHummerContext.a(taskConfig.name, "Z7020");
            this.mHummerContext.b(taskConfig.name, "Z7020");
            a.a().a(this.mIAlertManagerCallback);
        } else if (i.a().a(this.url)) {
        } else {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("url", this.url);
            i.a().a(hashMap);
        }
    }

    @Override // com.ap.zoloz.hummer.common.TaskTracker
    public void forceQuit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6896bb61", new Object[]{this});
        } else if (!this.isLive) {
        } else {
            BioLog.i("Webtask " + this.mTaskConfig.name + " forceQuit");
            HashMap hashMap = new HashMap();
            hashMap.put("extInfo", "exit " + this.mTaskConfig.name);
            h.a().a(rrv.TECH_SEED, hashMap);
            i.a().b();
            this.isLive = false;
        }
    }

    public void handleResult(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc330421", new Object[]{this, new Integer(i), str});
        } else if (this.mTaskConfig == null || this.mHummerContext == null) {
        } else {
            BioLog.i("endWebTask result = " + i);
            if (i == 0) {
                if (StringUtil.isNullorEmpty(str)) {
                    this.mHummerContext.a(this.mTaskConfig.name, "Z7033");
                    this.mHummerContext.b(this.mTaskConfig.name, "Z7033");
                    a.a().a(this.mIAlertManagerCallback);
                    return;
                }
                i = this.mHummerContext.c(str);
            }
            if (this.mITaskTrackerCallback == null) {
                return;
            }
            this.mITaskTrackerCallback.a(this.mHummerContext, i);
        }
    }
}
