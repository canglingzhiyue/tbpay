package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.c;
import com.taobao.tao.log.TLog;

/* loaded from: classes.dex */
public class ktu extends kts {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(913974909);
    }

    public static /* synthetic */ Object ipc$super(ktu ktuVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ktu(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // tb.kts
    public Object a(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6bbc6f25", new Object[]{this, str, strArr});
        }
        String a2 = c.a.a("homepage_common", str, "");
        if (TextUtils.isEmpty(a2) || strArr == null || strArr.length <= 0) {
            return a2;
        }
        try {
            return b(a2, strArr);
        } catch (Exception unused) {
            return null;
        }
    }

    private JSONObject b(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("daa707ec", new Object[]{this, str, strArr});
        }
        JSONObject parseObject = JSONObject.parseObject(str);
        JSONObject jSONObject = new JSONObject(a(strArr.length));
        for (String str2 : strArr) {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(str2, (Object) parseObject.getString(str2));
            }
        }
        return jSONObject;
    }

    @Override // tb.kts
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            TLog.loge("HomepageCommonCollector", "Homepage BizParams bind error");
        }
    }
}
