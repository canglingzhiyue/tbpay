package tb;

import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.BaseMode;
import java.util.List;

/* loaded from: classes4.dex */
public class cve {
    static {
        kge.a(-1452873713);
    }

    public static void a(final Context context, final Intent intent, final IDataMessageCallBackService iDataMessageCallBackService) {
        if (context == null) {
            cvy.b("context is null , please check param of parseIntent()");
        } else if (intent == null) {
            cvy.b("intent is null , please check param of parseIntent()");
        } else if (iDataMessageCallBackService == null) {
            cvy.b("callback is null , please check param of parseIntent()");
        } else if (!cwc.c(context)) {
            cvy.b("push is null ,please check system has push");
        } else {
            cwb.a(new Runnable() { // from class: tb.cve.1
                @Override // java.lang.Runnable
                public void run() {
                    List<BaseMode> a2 = cvp.a(context, intent);
                    if (a2 == null) {
                        return;
                    }
                    for (BaseMode baseMode : a2) {
                        if (baseMode != null) {
                            for (cvt cvtVar : cvf.a().c()) {
                                if (cvtVar != null) {
                                    cvtVar.a(context, baseMode, iDataMessageCallBackService);
                                }
                            }
                        }
                    }
                }
            });
        }
    }
}
