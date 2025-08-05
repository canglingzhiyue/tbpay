package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.mtop.d;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes5.dex */
public class sls {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2028862285);
    }

    public static String a(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        if (i != -2) {
            if (i == -1) {
                str = "此内容已被删除";
            } else if (i != 1) {
                switch (i) {
                    case -1003:
                    case -1002:
                    case -1001:
                    case -1000:
                        break;
                    default:
                        str = "该内容不符合互联网安全规范";
                        break;
                }
            }
            spz.a("RequestUtils", "getErrorMessage status=" + i + " ;message=" + str);
            return str;
        }
        str = "由于作者设置，原分享内容暂时没有权限查看哦";
        spz.a("RequestUtils", "getErrorMessage status=" + i + " ;message=" + str);
        return str;
    }

    public static d<Pair<a, MediaMixContentDetail>> a(String str, Pair<a, MediaMixContentDetail> pair) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("39550fd3", new Object[]{str, pair}) : d.f12462a.a(str, pair);
    }

    public static d<Pair<a, MediaMixContentDetail>> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("168aace7", new Object[]{str, str2});
        }
        d a2 = d.b.a(str, null);
        a2.a(str2);
        return a2;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : "ANDROID_SYS_NETWORK_ERROR".equals(str) || ErrorConstant.ERRCODE_NO_NETWORK.equals(str);
    }
}
