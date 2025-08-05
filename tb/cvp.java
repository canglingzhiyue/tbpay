package tb;

import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.mode.BaseMode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class cvp implements cvq {
    static {
        kge.a(-233984370);
        kge.a(1325284759);
    }

    public static List<BaseMode> a(Context context, Intent intent) {
        BaseMode a2;
        if (intent == null) {
            return null;
        }
        int i = 4096;
        try {
            i = Integer.parseInt(cvw.d(intent.getStringExtra("type")));
        } catch (Exception e) {
            cvy.b("MessageParser--getMessageByIntent--Exception:" + e.getMessage());
        }
        cvy.a("MessageParser--getMessageByIntent--type:" + i);
        ArrayList arrayList = new ArrayList();
        for (cvq cvqVar : cvf.a().b()) {
            if (cvqVar != null && (a2 = cvqVar.a(context, i, intent)) != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    protected abstract BaseMode a(Intent intent, int i);
}
