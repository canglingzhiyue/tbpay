package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;

/* loaded from: classes6.dex */
public class hyr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static hyr f28844a;
    private boolean b = false;

    static {
        kge.a(-187422676);
    }

    private hyr() {
    }

    public static hyr a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hyr) ipChange.ipc$dispatch("f05bfbd", new Object[0]);
        }
        if (f28844a == null) {
            f28844a = new hyr();
        }
        return f28844a;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (context == null) {
        } else {
            boolean a2 = FestivalMgr.a().a("global");
            if (a2) {
                this.b = false;
                hyn.a("UniteSkinUtil", "updateSkinState", "isInFestival = " + a2 + ",useNewSkin = " + this.b);
                return;
            }
            JSONObject parseObject = JSONObject.parseObject(a(context, "homePassParams", ""));
            if (parseObject != null && parseObject.containsKey("whiteNavi")) {
                this.b = Boolean.valueOf(parseObject.getString("whiteNavi")).booleanValue();
            } else {
                this.b = false;
            }
        }
    }

    private String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{this, context, str, str2}) : context.getSharedPreferences("homepage_common", 0).getString(str, str2);
    }
}
