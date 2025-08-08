package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.tab2interact.core.utils.a;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class skq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f33660a;

    static {
        kge.a(991603141);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (f33660a == null) {
            if (sqc.b()) {
                a.b(null, ply.TAG, "是否开启Tab2全局互动，本地强制开启老版互动层");
                f33660a = false;
                return false;
            } else if (!sqc.a()) {
                a.b(null, ply.TAG, "是否开启Tab2全局互动，全屏页新架构未开启");
                f33660a = false;
                return false;
            } else {
                f33660a = Boolean.valueOf(oeb.ah());
                a.b(null, ply.TAG, "是否开启Tab2全局互动，sEnableTab2GlobalInteract=" + f33660a);
            }
        }
        return f33660a.booleanValue();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : !l.d(Globals.getApplication()) && !l.b(Globals.getApplication()) && oeb.a("weitao_switch.enableNativeBrowserBadge", true);
    }

    public static List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("video");
        arrayList.add("newFollow");
        try {
            String a2 = oeb.a("weitao_switch.nativeBrowserBadgeEnableTabIds", "video,newFollow");
            if (a2 == null) {
                return arrayList;
            }
            String[] split = a2.split(",");
            ArrayList arrayList2 = new ArrayList();
            Collections.addAll(arrayList2, split);
            return arrayList2;
        } catch (Throwable th) {
            a.a(null, ply.TAG, "获取开启Native浏览挂角的Tab的ID异常", th);
            return arrayList;
        }
    }

    public static Pair<Integer, Integer> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("71b24734", new Object[0]);
        }
        Pair<Integer, Integer> create = Pair.create(265, 63);
        try {
            String a2 = oeb.a("weitao_switch.browserBadgeProgressBarCenterMargin", "265,63");
            if (a2 == null) {
                return create;
            }
            String[] split = a2.split(",");
            return Pair.create(Integer.valueOf(oec.a((Object) split[0], 265)), Integer.valueOf(oec.a((Object) split[1], 63)));
        } catch (Throwable th) {
            a.a(null, ply.TAG, "获取浏览挂角中环形进度条圆心的顶部、右侧边距异常", th);
            return create;
        }
    }

    public static List<String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("566a3ef4", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(suq.GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM);
        arrayList.add("bubbleDTO");
        arrayList.add("paddingComponent");
        arrayList.add("push");
        arrayList.add("pop");
        arrayList.add("popJson");
        try {
            String a2 = oeb.a("weitao_switch.browserBadgeDelegateShowDataFields", "bottomComponent,bubbleDTO,paddingComponent,push,pop,popJson");
            if (a2 == null) {
                return arrayList;
            }
            String[] split = a2.split(",");
            ArrayList arrayList2 = new ArrayList();
            Collections.addAll(arrayList2, split);
            return arrayList2;
        } catch (Throwable th) {
            a.a(null, ply.TAG, "获取浏览挂角中委托展示的服务端数据字段异常", th);
            return arrayList;
        }
    }

    public static long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[0])).longValue();
        }
        long a2 = oeb.a("weitao_switch.browserBadgeViewDelayHideTime", 200);
        if (a2 < 0) {
            return 200L;
        }
        return a2;
    }

    public static JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[0]);
        }
        JSONObject parseObject = JSONObject.parseObject("{\"去提现\":{\"url\":\"https://img.alicdn.com/imgextra/i1/O1CN01HfQ67w1rOT9Qpsqmc_!!6000000005621-2-tps-172-68.png\",\"width\":\"86\",\"height\":\"34\"},\"去兑换\":{\"url\":\"https://img.alicdn.com/imgextra/i1/O1CN011wYyd0221X5aKnVPH_!!6000000007060-2-tps-172-68.png\",\"width\":\"86\",\"height\":\"34\"},\"现金账户\":{\"url\":\"https://img.alicdn.com/imgextra/i2/O1CN01hmSCxw1KGKnu8EMoT_!!6000000001136-2-tps-172-68.png\",\"width\":\"86\",\"height\":\"34\"}}");
        try {
            JSONObject parseObject2 = JSONObject.parseObject(oeb.a("weitao_switch.browserBadgeBottomAreaTextToPicMapping", "{\"去提现\":{\"url\":\"https://img.alicdn.com/imgextra/i1/O1CN01HfQ67w1rOT9Qpsqmc_!!6000000005621-2-tps-172-68.png\",\"width\":\"86\",\"height\":\"34\"},\"去兑换\":{\"url\":\"https://img.alicdn.com/imgextra/i1/O1CN011wYyd0221X5aKnVPH_!!6000000007060-2-tps-172-68.png\",\"width\":\"86\",\"height\":\"34\"},\"现金账户\":{\"url\":\"https://img.alicdn.com/imgextra/i2/O1CN01hmSCxw1KGKnu8EMoT_!!6000000001136-2-tps-172-68.png\",\"width\":\"86\",\"height\":\"34\"}}"));
            return parseObject2 != null ? parseObject2 : parseObject;
        } catch (Throwable th) {
            a.a(null, ply.TAG, "获取浏览挂角中底部区域文本与图片URL的映射关系异常", th);
            return parseObject;
        }
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : oeb.a("weitao_switch.enableOptimizeBrowserBadgeBottomAreaShowTime", true);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : oeb.a("weitao_switch.enableBrowserBadgeDelayReport", true);
    }

    public static long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de9", new Object[0])).longValue();
        }
        long a2 = oeb.a("weitao_switch.browserBadgeDelayReportTime", 500);
        if (a2 < 0) {
            return 500L;
        }
        return a2;
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]);
        }
        String a2 = oeb.a("weitao_switch.h5LayerWebViewLoadURL", "https://web.m.taobao.com/app/tbvideo/global-interaction-view/global?isGlobal=true");
        return !StringUtils.isEmpty(a2) ? a2 : "https://web.m.taobao.com/app/tbvideo/global-interaction-view/global?isGlobal=true";
    }

    public static JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dde1390", new Object[0]);
        }
        JSONObject parseObject = JSONObject.parseObject("{\"entityId\":\"101635\"}");
        try {
            JSONObject parseObject2 = JSONObject.parseObject(oeb.a("weitao_switch.h5LayerDataRequestBody", "{\"entityId\":\"101635\"}"));
            return parseObject2 != null ? parseObject2 : parseObject;
        } catch (Throwable th) {
            a.a(null, ply.TAG, "获取H5互动层数据的请求body异常", th);
            return parseObject;
        }
    }

    public static List<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87269236", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("video");
        arrayList.add("newFollow");
        try {
            String a2 = oeb.a("weitao_switch.h5LayerInitWebViewTabIds", "video,newFollow");
            if (a2 == null) {
                return arrayList;
            }
            String[] split = a2.split(",");
            ArrayList arrayList2 = new ArrayList();
            Collections.addAll(arrayList2, split);
            return arrayList2;
        } catch (Throwable th) {
            a.a(null, ply.TAG, "获取H5互动层初始化WebView的Tab的ID异常", th);
            return arrayList;
        }
    }

    public static JSONObject k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("352dba92", new Object[0]);
        }
        JSONObject parseObject = JSONObject.parseObject("{\"video\":1000,\"newFollow\":1000}");
        try {
            JSONObject parseObject2 = JSONObject.parseObject(oeb.a("weitao_switch.h5LayerDelayInitTimesOnTabStarted", "{\"video\":1000,\"newFollow\":1000}"));
            return parseObject2 != null ? parseObject2 : parseObject;
        } catch (Throwable th) {
            a.a(null, ply.TAG, "获取H5互动层在Tab可见时延迟初始化的时间异常", th);
            return parseObject;
        }
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : oeb.a("weitao_switch.enableFixH5LayerWhenLogin", true);
    }

    public static List p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f4f19870", new Object[0]);
        }
        try {
            return Arrays.asList(oeb.a("weitao_switch.supportBrowseTaskTypes", "share_help").split(","));
        } catch (Throwable th) {
            a.a(null, ply.TAG, "获得支持的浏览任务类型异常", th);
            return Collections.EMPTY_LIST;
        }
    }

    public static long q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64de46c", new Object[0])).longValue();
        }
        long a2 = oeb.a("weitao_switch.h5TaskTimeoutTime", 15000);
        if (a2 < 0) {
            return 15000L;
        }
        return a2;
    }
}
