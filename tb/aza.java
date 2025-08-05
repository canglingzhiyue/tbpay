package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.b;
import com.taobao.android.riverlogger.e;
import java.util.HashMap;
import java.util.Map;
import tb.arc;

/* loaded from: classes2.dex */
public class aza implements are {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static aza f25709a;

    static {
        kge.a(-869202721);
        kge.a(-308380327);
    }

    public static aza a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aza) ipChange.ipc$dispatch("f0292d6", new Object[0]);
        }
        if (f25709a == null) {
            f25709a = new aza();
        }
        return f25709a;
    }

    @Override // tb.are
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(RVLLevel.Debug, str, null);
        }
    }

    @Override // tb.are
    public void a(String str, arf arfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207b4e2d", new Object[]{this, str, arfVar});
        } else {
            a(RVLLevel.Debug, str, arfVar);
        }
    }

    @Override // tb.are
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            a(RVLLevel.Error, str, null);
        }
    }

    @Override // tb.are
    public void b(String str, arf arfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3564166e", new Object[]{this, str, arfVar});
        } else {
            a(RVLLevel.Error, str, arfVar);
        }
    }

    @Override // tb.are
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        RVLLevel rVLLevel = RVLLevel.Error;
        arc.a a2 = arc.a.a();
        a(rVLLevel, str2, a2.a("AURA/" + str).b());
    }

    private void a(RVLLevel rVLLevel, String str, arf arfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90021dc", new Object[]{this, rVLLevel, str, arfVar});
            return;
        }
        try {
            if (arfVar == null) {
                e.a(rVLLevel, "MyModule", str);
                return;
            }
            b a2 = e.a(rVLLevel, TextUtils.isEmpty(arfVar.a()) ? "AURA/other" : arfVar.a()).a(RVLLevel.Error);
            String e = arfVar.e("traceId");
            String e2 = arfVar.e("event");
            if (!TextUtils.isEmpty(e)) {
                a2.a(e2, e);
            } else {
                a2.a(e2);
            }
            String e3 = arfVar.e("parentId");
            if (!TextUtils.isEmpty(e3)) {
                a2.b(e3);
            }
            String e4 = arfVar.e("errorCode");
            String e5 = arfVar.e("errorMsg");
            if (!TextUtils.isEmpty(e4) && !TextUtils.isEmpty(e5)) {
                a2.b(e4, e5);
            }
            String e6 = arfVar.e("timestamp");
            if (!TextUtils.isEmpty(e6)) {
                a2.a(Long.parseLong(e6));
            }
            HashMap hashMap = new HashMap(arfVar.b());
            hashMap.put("message", str);
            hashMap.remove(arf.ARG_KEY_DOMAIN);
            hashMap.remove("event");
            hashMap.remove("traceId");
            a2.a((Map<String, ?>) hashMap);
            a2.a();
        } catch (Exception unused) {
        }
    }
}
