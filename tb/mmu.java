package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class mmu implements mpj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.mpj
    public void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{this, str, str2, objArr});
            return;
        }
        try {
            TLog.loge("apm", str, a(str2, objArr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String a(String str, Object... objArr) {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee72cc1", new Object[]{this, str, objArr});
        }
        if (StringUtils.isEmpty(str) && (objArr == null || objArr.length == 0)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (!StringUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (objArr != null && objArr.length != 0) {
            for (Object obj2 : objArr) {
                if (obj2 != null) {
                    if (obj2 instanceof Map) {
                        obj = a((Map) obj2);
                    } else {
                        obj = obj2.toString();
                    }
                    sb.append("->");
                    sb.append(obj);
                }
            }
        }
        return sb.toString();
    }

    private String a(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map}) : new JSONObject(map).toString();
    }
}
