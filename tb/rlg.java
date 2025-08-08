package tb;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.utils.a;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.d;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rlg implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f33221a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;

    static {
        kge.a(783737154);
        kge.a(1914895581);
        f33221a = 0;
        b = 1;
        c = 2;
        d = 3;
        e = 4;
        f = 5;
        g = 6;
        h = 7;
    }

    @Override // com.tmall.android.dai.d
    public Map<String, String> onTask(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        a.b("ReadInfoTask", "params:" + map);
        String str = map.get(noa.KEY_MODEL_NAME);
        int parseInt = Integer.parseInt(map.get("infoType"));
        HashMap hashMap = new HashMap();
        if (parseInt == f33221a) {
            a(hashMap, rkq.d().g());
        } else if (parseInt == b) {
            a(hashMap, a());
        } else {
            String str2 = "";
            if (parseInt == c) {
                if (StringUtils.isEmpty(str)) {
                    hashMap.put("success", "0");
                } else {
                    com.tmall.android.dai.model.a registeredModel = DAI.getRegisteredModel(str);
                    if (registeredModel != null && registeredModel.e != null) {
                        str2 = registeredModel.e.toString();
                    }
                    a(hashMap, str2);
                }
            } else if (parseInt == d) {
                a(hashMap, "2");
            } else if (parseInt == e) {
                a(hashMap, Build.VERSION.SDK_INT + str2);
            } else if (parseInt == f) {
                UserTrackDO o = rkq.d().o();
                if (o != null) {
                    str2 = o.getSesionId();
                }
                a(hashMap, str2);
            } else if (parseInt == g) {
                a(hashMap, "Android");
            } else if (parseInt == h) {
                a(hashMap, gsh.a());
            }
        }
        return hashMap;
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (rkr.a() == null) {
            return null;
        }
        return rkr.a().getUserId();
    }

    private void a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{this, map, str});
        } else if (StringUtils.isEmpty(str)) {
            map.put("success", "0");
        } else {
            map.put("success", "1");
            map.put("result", str);
        }
    }
}
