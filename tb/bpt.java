package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.android.umbrella.link.j;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTUtdid;
import com.taobao.tinct.ITinctOperater;
import com.ut.mini.l;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public final class bpt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        Thread currentThread = Thread.currentThread();
        String name = j.a(currentThread.getName()) ? "default_thread" : currentThread.getName();
        long id = currentThread.getId();
        ThreadGroup threadGroup = currentThread.getThreadGroup();
        String str = "default_group";
        if (threadGroup != null && !j.a(threadGroup.getName())) {
            str = threadGroup.getName();
        }
        return str + "|" + name + "|" + id;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : l.getInstance().getCurrentPageName();
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : String.valueOf(System.currentTimeMillis() - 1546272000433L);
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        try {
            return UTUtdid.instance(null).getValue();
        } catch (Throwable unused) {
            return String.valueOf(SystemClock.currentThreadTimeMillis());
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "empty";
        }
        String tinctInfo = ITinctOperater.getInstance().getTinctInfo(str);
        return StringUtils.isEmpty(tinctInfo) ? "empty" : tinctInfo;
    }

    public static String a(MtopResponse mtopResponse) {
        Map<String, List<String>> headerFields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf8a613", new Object[]{mtopResponse});
        }
        if (mtopResponse == null || (headerFields = mtopResponse.getHeaderFields()) == null) {
            return "";
        }
        String a2 = a(headerFields, "mtop-buytraceid");
        if (j.b(a2)) {
            return a2;
        }
        String a3 = a(headerFields, HttpConstant.EAGLE_EYE_ID_2);
        if (j.b(a3)) {
            return a3;
        }
        String a4 = a(headerFields, "eagleeye-traceid");
        if (j.b(a4)) {
            return a4;
        }
        String a5 = a(headerFields, "EagleEye-TraceId");
        return j.b(a5) ? a5 : "";
    }

    private static String a(Map<String, List<String>> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0668d9", new Object[]{map, str});
        }
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return "";
        }
        String valueOf = String.valueOf(list.get(0));
        return j.b(valueOf) ? valueOf : "";
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : j.a(str) ? "" : str;
    }

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return obj.toString();
        }
        return JSON.toJSONString(obj);
    }
}
