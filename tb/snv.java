package tb;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.av;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.ax;
import com.taobao.avplayer.ba;
import com.taobao.avplayer.bb;
import com.taobao.avplayer.bl;
import com.taobao.avplayer.common.z;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.k;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public interface snv {
    public static final String EXP_KEY_COMMON_PRELOAD_PLAY = "commonPreloadPlay";
    public static final String EXP_KEY_FROM_LAUNCHER = "isFromLauncher";
    public static final String EXP_KEY_FULL_PAGE_CONTENT_TYPE = "full_page_content_type";
    public static final String EXP_KEY_FULL_PAGE_INDEX = "full_page_index";
    public static final String EXP_KEY_FULL_PAGE_TAB_NAME = "full_page_tab_name";
    public static final String EXP_KEY_FULL_PAGE_TITLE = "full_page_title";
    public static final String EXP_KEY_FULL_PAGE_UID = "full_page_uid";
    public static final String EXP_KEY_GG_LIVE_WARMUP_BUCKET_ID = "gg_live_warmup_bucketid";
    public static final String EXP_KEY_IS_HUITUI = "isHuitui";
    public static final String EXP_KEY_IS_LOCAL_VIDEO = "isLocalVideo";
    public static final String EXP_KEY_LAUNCHER_NODE_URL = "launcherNodeUrl";
    public static final String EXP_KEY_PRECREATED_DW = "precreatedw";
    public static final String EXP_KEY_PRELOAD_REAL_PLAY = "preloadRealPlay";
    public static final String EXP_KEY_PROCESS_LAUNCHER_FLAG = "processLauncherFlag";
    public static final String EXP_KEY_SUB_BUSINESS_TYPE = "sub_business_type";
    public static final String EXP_KEY_USE_SOFTWARE_FOR_FIRSTVideo = "useSoftwareForFirstVideo";
    public static final String EXP_KEY_VIDEO_ACTIONTYPE = "videoActionType";

    /* loaded from: classes5.dex */
    public interface a {
        a a(int i);

        a a(DWAspectRatio dWAspectRatio);

        a a(DWInstanceType dWInstanceType);

        a a(String str);

        a a(HashMap<String, String> hashMap);

        a a(JSONObject jSONObject);

        a a(boolean z);

        snv a();

        snv a(bl blVar);

        snv a(s sVar);

        a b(int i);

        a b(String str);

        a b(HashMap<String, String> hashMap);

        a b(boolean z);

        a c(String str);

        a c(HashMap<String, String> hashMap);

        a c(boolean z);

        a d(String str);

        a d(boolean z);

        a e(String str);

        a e(boolean z);

        a f(boolean z);

        a g(boolean z);
    }

    void a();

    void a(float f);

    void a(float f, float f2, int i, int i2);

    void a(int i);

    void a(int i, int i2);

    void a(int i, boolean z);

    void a(ImageView imageView);

    void a(DWInstanceType dWInstanceType);

    void a(av avVar);

    void a(aw awVar);

    void a(ax axVar);

    void a(ba baVar);

    void a(bb bbVar);

    void a(z zVar);

    void a(MediaLiveWarmupConfig mediaLiveWarmupConfig);

    void a(String str);

    void a(String str, boolean z, HashMap<String, String> hashMap);

    void a(HashMap<String, String> hashMap);

    void a(Map<String, String> map);

    void a(dde ddeVar);

    void a(boolean z);

    void b();

    void b(float f);

    void b(HashMap<String, String> hashMap);

    void b(boolean z);

    void c();

    void c(HashMap<String, String> hashMap);

    void c(boolean z);

    void d();

    void d(boolean z);

    int e();

    void e(boolean z);

    ViewGroup f();

    void g();

    String h();

    Map<String, String> i();

    void j();

    boolean k();

    boolean l();

    k n();

    boolean o();
}
