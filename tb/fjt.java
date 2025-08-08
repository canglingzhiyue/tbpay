package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.d;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* loaded from: classes.dex */
public class fjt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_APM = "new_detail分阶段";
    public static final String TAG_DATA = "new_detail数据请求";
    public static final String TAG_EXCEPTION = "new_detail异常";
    public static final String TAG_FAST_ANIM = "new_detail无极缩放";
    public static final String TAG_GESTURE = "new_detail手势";
    public static final String TAG_HALF_SCREEN = "new_detail非全屏";
    public static final String TAG_IGNORE_ERROR = "new_detail忽略异常";
    public static final String TAG_INSIDE_DETAIL = "new_detail半屏详情";
    public static final String TAG_MAIN_PIC = "new_detail主图";
    public static final String TAG_MEDIA_CONTROLLER = "new_detail媒体控制";
    public static final String TAG_NAV = "NewDetaiInnerlNavProcessor";
    public static final String TAG_REARRANGE = "new_detail重排";
    public static final String TAG_REFRESH_DATA = "new_detail刷新数据";
    public static final String TAG_RENDER = "new_detail渲染";
    public static final String TAG_RIGHT_NAV_RECYCLER_LAYER = "new_detail导航栏";
    public static final String TAG_SCROLL_PAGE_OFF = "new_detail滚动";
    public static final String TAG_SECOND_PAGE = "new_detail水平滑动";
    public static final String TAG_SECTION = "new_detail性能分析";
    public static final String TAG_SET_SCROLL_ENABLE = "new_detail滚动控制";
    public static final String TAG_TIP = "new_detail提示";
    public static final String TAG_UNKNOWN_ERROR = "new_detail未知异常";
    public static final String TAG_UT = "new_detail埋点排查";
    public static final String TAG_VIDEO_ZOOM = "new_detail画幅";
    public static final String TAG_WINDVANE = "new_detail windvane排查";

    static {
        kge.a(1595247119);
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else if (!fjk.a()) {
        } else {
            Log.e(str, str2);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            TLog.loge(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586f5b98", new Object[]{str, str2, th});
        } else {
            TLog.loge(str, str2, th);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else {
            TLog.loge(str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            TLog.logd(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else if (StringUtils.isEmpty(str2) && th == null) {
        } else {
            TLog.loge(str, str2, th);
        }
    }

    public static String a(String str, JSONObject jSONObject, fmd fmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51af60ef", new Object[]{str, jSONObject, fmdVar});
        }
        if (str == null) {
            str = "";
        }
        if (jSONObject == null || fmdVar == null) {
            return str;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(d.KEY_SCROLL_ENABLE, jSONObject.getString(d.KEY_SCROLL_ENABLE));
        com.taobao.android.detail2.core.framework.data.model.d d = fmdVar.d();
        if (d != null) {
            hashMap.put("nid", d.k);
        }
        if (d instanceof fhi) {
            hashMap.put("weexUrl", ((fhi) d).m());
        }
        return str.concat("&commonMessage：").concat(hashMap.toString());
    }
}
