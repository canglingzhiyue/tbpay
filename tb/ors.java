package tb;

import android.os.Messenger;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.trigger.f;
import com.taobao.desktop.channel.desktoplinktask.widgetservice.d;

/* loaded from: classes7.dex */
public class ors {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-800110609);
    }

    public void a(String str, String str2, JSONObject jSONObject, Messenger messenger, ppi ppiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21127ca2", new Object[]{this, str, str2, jSONObject, messenger, ppiVar});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            f fVar = new f(3);
            fVar.b = str;
            fVar.c = str2;
            fVar.d = jSONObject;
            fVar.f = ppiVar;
            fVar.e = messenger;
            kgz.b("FloatWindowTrigger.triggerActiveTask.triggerEventId=%s.bizCode=%s.", str, str2);
            new orm().a(fVar);
        }
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        boolean a2 = d.a().a(str);
        kgz.b("FloatWindowTrigger.checkWindowStatus.bizCode=%s.isWindowOn=%s", str, Boolean.valueOf(a2));
        return a2 ? 1 : 0;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        d.a().b(str);
        kgz.b("FloatWindowTrigger.close.bizCode=%s", str);
    }
}
