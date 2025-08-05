package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class keq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE_DOWNLOAD_IMAGE_FAIL = "downloadImageFail";
    public static final String CODE_DOWNLOAD_VIDEO_FAIL = "downloadVideoFail";
    public static final String CODE_VIEW_CREATE_FAIL = "viewCreateFail";
    public static final String CRASH_OCCUPIED = "crashOccupied";
    public static final String DOWNLOAD_ERROR = "downloadError";
    public static final String DOWNLOAD_SUCCESS = "downloadSuccess";
    public static final String EXPOSE_ERROR = "exposeError";
    public static final String EXPOSE_SUCCESS = "exposeSuccess";
    public static final String POP_ERROR = "PopError";
    public static final String SPLASH_REQUEST_ERROR = "splashRequestError";
    public static final String SPLASH_REQUEST_SUCCESS = "splashRequestSuccess";
    public static final String UCP_CRASH = "ucpInitCrash";
    public static final String UCP_ERROR = "ucpError";
    public static final String UCP_INIT_ERROR = "ucpInitError";
    public static final String UCP_POP_INDEX_FAIL = "ucpPopIndexFail";
    public static final String UCP_START = "ucpStart";
    public static final int UT_EVENT_ID = 19999;
    public static final String UT_PAGE_NAME = "Page_Home";
    public static final String VIDEO_PLAY_ERROR = "videoPlayError";
    public static final String VIDEO_PLAY_START = "videoPlayStart";
    public static final String VIDEO_PLAY_SUCCESS = "videoPlaySuccess";

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f30017a;

    static {
        kge.a(-841555185);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.f30017a = context.getSharedPreferences("bootImageMonitor", 0);
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        String str8 = str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2562e1a4", new Object[]{this, str, str2, str8, str4, str5, str6});
            return;
        }
        boolean c = kel.c();
        if (TextUtils.equals(str3, EXPOSE_SUCCESS) || TextUtils.equals(str3, EXPOSE_ERROR)) {
            kel.a(str, str2);
        }
        if (c) {
            str7 = str3 + "_Arch";
        } else {
            str7 = str8;
        }
        b(str, str2, str7, str4, str5, str6);
        if (c) {
            str8 = str3 + "_Arch";
        }
        a(str, str2, str8, str4, str5);
    }

    private void b(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8dbf3a5", new Object[]{this, str, str2, str3, str4, str5, str6});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("bizType", str4);
            hashMap.put("code", str5);
            hashMap.put("msg", str6);
            TBS.Ext.commitEvent("Page_Home", 19999, "BootImage_" + str, str2, str3, ket.a("Page_Home", new JSONObject(hashMap)));
        } catch (Throwable th) {
            kej.a("MonitorService", "commitUTMonitor", th);
        }
    }

    private void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("extKey1", str + "_" + str2);
            hashMap.put("extKey2", str3);
            hashMap.put("extKey3", str4);
            hashMap.put("extKey4", str5);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(BindingXConstants.KEY_SCENE_TYPE, (Object) "BootImage");
            jSONObject.put("actionType", (Object) "QPS");
            jSONObject.put("args", (Object) hashMap);
            kej.a("MonitorService", "extKey1: " + str + "_" + str2 + " ,extKey2: " + str3 + " ,extKey3: " + str4 + " ,extKey4: " + str5);
            this.f30017a.edit().putString(String.valueOf(System.currentTimeMillis()), jSONObject.toString()).apply();
        } catch (Throwable th) {
            kej.a("MonitorService", "commitMessiahMonitor", th);
        }
    }

    public List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.addAll(this.f30017a.getAll().values());
        } catch (Throwable th) {
            kej.a("MonitorService", "getBootImageMonitor", th);
        }
        return arrayList;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f30017a.edit().clear().apply();
        }
    }
}
