package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import org.webrtc.Logging;
import tb.kge;

/* loaded from: classes9.dex */
public class JNILogging {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Loggable loggable;

    static {
        kge.a(787963505);
    }

    public JNILogging(Loggable loggable) {
        this.loggable = loggable;
    }

    public void logToInjectable(String str, Integer num, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713971a6", new Object[]{this, str, num, str2});
        } else {
            this.loggable.onLogMessage(str, Logging.Severity.values()[num.intValue()], str2);
        }
    }
}
