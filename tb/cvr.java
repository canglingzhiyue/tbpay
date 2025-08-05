package tb;

import android.content.Context;
import com.heytap.mcssdk.constant.MessageConstant;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.BaseMode;

/* loaded from: classes4.dex */
public class cvr implements cvt {
    static {
        kge.a(1724885147);
        kge.a(-616938851);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(cvk cvkVar, cvf cvfVar) {
        if (cvkVar == null) {
            cvy.b("message is null , please check param of parseCommandMessage(2)");
        } else if (cvfVar == null) {
            cvy.b("pushService is null , please check param of parseCommandMessage(2)");
        } else if (cvfVar.e() == null) {
            cvy.b("pushService.getPushCallback() is null , please check param of parseCommandMessage(2)");
        } else {
            int a2 = cvkVar.a();
            if (a2 == 12287) {
                ICallBackResultService e = cvfVar.e();
                if (e == null) {
                    return;
                }
                e.onError(cvkVar.c(), cvkVar.b());
            } else if (a2 == 12298) {
                cvfVar.e().onSetPushTime(cvkVar.c(), cvkVar.b());
            } else if (a2 == 12306) {
                cvfVar.e().onGetPushStatus(cvkVar.c(), cwc.a(cvkVar.b()));
            } else if (a2 == 12309) {
                cvfVar.e().onGetNotificationStatus(cvkVar.c(), cwc.a(cvkVar.b()));
            } else if (a2 == 12289) {
                if (cvkVar.c() == 0) {
                    cvfVar.a(cvkVar.b());
                }
                cvfVar.e().onRegister(cvkVar.c(), cvkVar.b());
            } else if (a2 == 12290) {
                cvfVar.e().onUnRegister(cvkVar.c());
            } else {
                switch (a2) {
                    case MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_OPEN /* 12316 */:
                    case MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_CLOSE /* 12317 */:
                        ISetAppNotificationCallBackService g = cvfVar.g();
                        if (g == null) {
                            return;
                        }
                        g.onSetAppNotificationSwitch(cvkVar.c());
                        return;
                    case MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_GET /* 12318 */:
                        int i = 0;
                        try {
                            i = Integer.parseInt(cvkVar.b());
                        } catch (Exception unused) {
                        }
                        IGetAppNotificationCallBackService f = cvfVar.f();
                        if (f == null) {
                            return;
                        }
                        f.onGetAppNotificationSwitch(cvkVar.c(), i);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Override // tb.cvt
    public void a(Context context, BaseMode baseMode, IDataMessageCallBackService iDataMessageCallBackService) {
        if (baseMode != null && baseMode.getType() == 4105) {
            final cvk cvkVar = (cvk) baseMode;
            cvy.a("mcssdk-CallBackResultProcessor:" + cvkVar.toString());
            cwb.b(new Runnable() { // from class: tb.cvr.1
                @Override // java.lang.Runnable
                public void run() {
                    cvr.this.a(cvkVar, cvf.a());
                }
            });
        }
    }
}
