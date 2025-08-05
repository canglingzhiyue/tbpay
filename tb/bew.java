package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* loaded from: classes2.dex */
public class bew {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static bew f25838a;
    private boolean b = false;

    static {
        kge.a(1960487545);
    }

    private bew() {
    }

    public static bew a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bew) ipChange.ipc$dispatch("f02bb0a", new Object[0]);
        }
        if (f25838a == null) {
            f25838a = new bew();
        }
        return f25838a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
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
                UnifyLog.a("iCart", "UniteSkinUtil", "updateSkinState", "isInFestival = " + a2 + ",useNewSkin = " + this.b);
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
