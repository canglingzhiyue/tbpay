package com.taobao.tao.log.logger;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogCategory;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLogNative;
import com.taobao.tao.log.utils.d;
import tb.kge;

/* loaded from: classes8.dex */
public class CustomEventLogger extends EventLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "biz")
    public final String biz;
    @JSONField(name = "event")
    public final String event;

    static {
        kge.a(-124939355);
    }

    public static CustomEventLogger builder(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CustomEventLogger) ipChange.ipc$dispatch("fea2c9e2", new Object[]{str, str2}) : new CustomEventLogger(str, str2);
    }

    private CustomEventLogger(String str, String str2) {
        super(8);
        this.biz = str;
        this.event = str2;
    }

    @Override // com.taobao.tao.log.logger.EventLogger, com.taobao.tao.log.logger.a
    public void log() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144be5cb", new Object[]{this});
        } else {
            d.a().b(new Runnable() { // from class: com.taobao.tao.log.logger.-$$Lambda$CustomEventLogger$bPbWNUBOW5GVVotpP2zWRUJuwNs
                {
                    CustomEventLogger.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CustomEventLogger.this.lambda$log$0$CustomEventLogger();
                }
            });
        }
    }

    public /* synthetic */ void lambda$log$0$CustomEventLogger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95eff2ba", new Object[]{this});
        } else {
            TLogNative.writeLog(LogCategory.EventLog, LogLevel.I, EventLogger.TAG, this.biz, toString());
        }
    }
}
