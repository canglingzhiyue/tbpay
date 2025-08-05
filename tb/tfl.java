package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¨\u0006\b"}, d2 = {"Lcom/taobao/mytaobao/newsetting/dx/general/PickerSwitchUtil;", "", "()V", "data2TimeInterval", "", "data", "Lcom/alibaba/fastjson/JSONObject;", "dataStr", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class tfl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tfl INSTANCE;

    static {
        kge.a(-31149463);
        INSTANCE = new tfl();
    }

    private tfl() {
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str == null) {
            return "0:00-0:00";
        }
        try {
            return a(JSONObject.parseObject(str));
        } catch (Throwable unused) {
            return "0:00-0:00";
        }
    }

    public final String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return "0:00-0:00";
        }
        Integer startHour = jSONObject.getInteger("startHour");
        Integer integer = jSONObject.getInteger("starMinute");
        Integer endHour = jSONObject.getInteger("endHour");
        Integer integer2 = jSONObject.getInteger("endMinute");
        StringBuilder sb = new StringBuilder();
        q.a((Object) startHour, "startHour");
        sb.append(startHour.intValue());
        sb.append(":");
        int a2 = q.a(integer.intValue(), 10);
        String str = integer;
        if (a2 < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(integer);
            str = sb2.toString();
        }
        sb.append(str);
        sb.append("-");
        q.a((Object) endHour, "endHour");
        sb.append(endHour.intValue());
        sb.append(":");
        int a3 = q.a(integer2.intValue(), 10);
        String str2 = integer2;
        if (a3 < 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('0');
            sb3.append(integer2);
            str2 = sb3.toString();
        }
        sb.append(str2);
        String sb4 = sb.toString();
        q.a((Object) sb4, "sb.toString()");
        return sb4;
    }
}
