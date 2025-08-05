package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.a;
import com.taobao.tao.navigation.e;
import com.taobao.tao.navigation.k;
import com.taobao.tao.navigation.model.NavigationStatus;

/* loaded from: classes6.dex */
public class eso implements e.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.tao.navigation.e.f
    public void a(NavigationStatus.a aVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe9cdd3", new Object[]{this, aVar});
        } else if (aVar.d == null) {
            TLog.loge(a.a(), "NavigationStatusDispatcher", "notify error trackInfo is null");
        } else {
            try {
                JSONObject jSONObject = (JSONObject) JSONObject.parse(aVar.d);
                esv.a(aVar.f20814a, jSONObject);
                String str2 = null;
                if (jSONObject != null) {
                    str2 = jSONObject.getString("materialSubType");
                    str = jSONObject.getString("augeTrackInfo");
                } else {
                    str = null;
                }
                efv.a().a(aVar.b, aVar.c, aVar.f20814a);
                if (aVar.f20814a == 13) {
                    k.b(aVar.b, aVar.c, str2, str);
                }
                TLog.loge(a.a(), "NavigationStatusDispatcher", "notifyUcp status:" + aVar.f20814a + " trackInfo:" + aVar.d);
            } catch (Throwable th) {
                omr.a("NavigationStatusDispatcher", th + "onStatusChanged error");
                TLog.loge(a.a(), "NavigationStatusDispatcher", "notifyUcp error:" + th + " trackInfo:" + aVar.d);
            }
        }
    }
}
