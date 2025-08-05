package android.taobao.util;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APICONNECT_TAG = "TaoSdk.ApiRequest";
    public static final String ENDCASE_TAG = "TaoSdk.EndUT";
    public static final String ETAOLOCAL_TAG = "EtaoLocal";
    public static final String ETAO_APIURL_TAG = "etao_apiurl";
    public static final String ETAO_TAG = "Etao";
    public static final String IMGPOOL_COMPRESSION_RATIO_TAG = "Image_Compression";
    public static final String IMGPOOL_TAG = "TaoSdk.ImgPool";
    public static final String MEM_TRACE = "mem_Trace";
    public static final String PANELMANAGER_TAG = "PanelManager";
    public static final String SIGN_TAG = "tag_sign";
    public static final String STARTUTCASE_TAG = "TaoSdk.StartUT";
    public static final String TAOBAO_TAG = "Taobao";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f1544a;

    static {
        kge.a(-1556881586);
        f1544a = true;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f1544a;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f1544a = z;
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (str == null || str2 == null || !f1544a) {
        } else {
            Log.e(str, str2);
        }
    }
}
