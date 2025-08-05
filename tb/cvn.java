package tb;

import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.mode.BaseMode;

/* loaded from: classes4.dex */
public class cvn extends cvp {
    static {
        kge.a(968896281);
    }

    @Override // tb.cvq
    public BaseMode a(Context context, int i, Intent intent) {
        if (4105 == i) {
            return a(intent, i);
        }
        return null;
    }

    @Override // tb.cvp
    protected BaseMode a(Intent intent, int i) {
        try {
            cvk cvkVar = new cvk();
            cvkVar.a(Integer.parseInt(cvw.d(intent.getStringExtra("command"))));
            cvkVar.b(Integer.parseInt(cvw.d(intent.getStringExtra("code"))));
            cvkVar.c(cvw.d(intent.getStringExtra("content")));
            cvkVar.a(cvw.d(intent.getStringExtra("appKey")));
            cvkVar.b(cvw.d(intent.getStringExtra("appSecret")));
            cvkVar.d(cvw.d(intent.getStringExtra("appPackage")));
            cvy.a("OnHandleIntent-message:" + cvkVar.toString());
            return cvkVar;
        } catch (Exception e) {
            cvy.a("OnHandleIntent--" + e.getMessage());
            return null;
        }
    }
}
