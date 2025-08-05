package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.speed.a;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.tao.Globals;

/* loaded from: classes8.dex */
public class oqq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-257447535);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            oqc.a().a(Globals.getApplication(), oqc.j(), true);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            oqc.a().i();
        }
    }

    public static void a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d6c9b8", new Object[]{tBLocationDTO});
        } else if (tBLocationDTO == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("location", (Object) tBLocationDTO);
            a.a().a(new kxl(tBLocationDTO));
            oqc.a().c(jSONObject);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(oqn.KEY_PREVIEW_PARAM, (Object) str);
            oqc.a().d(jSONObject);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            oqc.a().f();
        }
    }
}
