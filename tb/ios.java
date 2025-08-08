package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes5.dex */
public class ios {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALGO_BIZ_CODE_UPLOAD_VIDEO = "guangguang_algo_video";
    public static final String BIZ_CODE_UPLOAD_IMAGE = "m_tb_svideo_preimg";
    public static final String DEFAULT_BIZ_LINE = "guangguang";
    public static final String DEFAULT_BIZ_SCENE = "guangguang";
    public static final String KEY_BACK_PARAMS = "back_params";
    public static final String KEY_BIZ_LINE = "biz_line";
    public static final String KEY_DEFAULT_TAB = "default_tab";
    public static final String KEY_DISABLE_TAB = "disable_tab";
    public static final String KEY_ENABLE_AWARD_FUN_ATMOSPHERE = "enable_award_fun_atmosphere";
    public static final String KEY_ENABLE_IMAGE_MUSIC = "image_music_enable";
    public static final String KEY_ENABLE_TAB = "enable_tab";
    public static final String KEY_GOODS_ID = "goods_id";
    public static final String KEY_HIGHLIGHT_ICON_URL = "highlight_icon";
    public static final String KEY_HIGHLIGHT_TAB_TYPE = "highlight_tab_type";
    public static final String KEY_IS_CONTENT_ULTRA = "is_content_ultra";
    public static final String KEY_IS_USE_NEW_PUBLISHER = "is_rcmd_publisher";
    public static final String KEY_MATERIAL_TAB = "material_tab";
    public static final String KEY_MEDIA_ID = "mediaId";
    public static final String KEY_MEDIA_TYPE = "media_type";
    public static final String KEY_ONIOLN_FITTING_ROOM_SCENE = "ugc_scene";
    public static final String KEY_RECOMMEND_CONTENTIDS = "recommendContentIds";
    public static final String KEY_REF_ID = "ref_id";
    public static final String KEY_REF_NAME = "ref_name";
    public static final String KEY_SHOW_HISTORY = "show_history";
    public static final String KEY_TEXT_PARAMS = "text_params";
    public static final String KEY_UMI_PUB_TRACE_ID = "umi_pub_trace_id";
    public static final String KEY_XGC_APPEND_MODE = "xgc_append_mode";
    public static final String KEY_X_ACTIVITY_ID = "x_activity_id";
    public static final String KEY_X_TASK_TYPE = "x_task_type";
    public static final String K_BIZ_SCENE = "biz_scene";
    public static final String K_DEVICE_SCORE = "device_score";
    public static final String TAG = "UrlParams";
    public static final String URL_KEY_ALGO_PHOTO_UPLOAD_CODE = "algo_photo_upload_code";
    public static final String URL_KEY_ALGO_VIDEO_UPLOAD_CODE = "algo_video_upload_code";
    public static final String URL_KEY_BIZ_LINE = "bizLine";
    public static final String URL_KEY_PHOTO_BIZ_CODE = "photo_biz_code";
    public static final String URL_KEY_PHOTO_UPLOAD_CODE = "photo_upload_code";
    public static final String URL_KEY_VIDEO_BIZ_CODE = "video_biz_code";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, a> f29194a;
    private static final a b;

    static {
        kge.a(-1461016145);
        f29194a = new HashMap();
        b = new a();
    }

    public static void a(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ef355", new Object[]{str, uri});
        } else if (StringUtils.isEmpty(str) || f29194a.containsKey(str)) {
        } else {
            a aVar = new a(uri);
            a.a(aVar).put(ior.f29193a, str);
            f29194a.put(str, aVar);
        }
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("23211f8a", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return b;
        }
        a aVar = f29194a.get(str);
        return aVar == null ? b : aVar;
    }

    public static a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ab515f69", new Object[]{str});
        }
        if (!StringUtils.isEmpty(str)) {
            return f29194a.remove(str);
        }
        return null;
    }

    public static a a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("13661224", new Object[]{str, aVar});
        }
        if (!StringUtils.isEmpty(str)) {
            return f29194a.put(str, aVar);
        }
        return null;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Map<String, String> f29195a = new HashMap();

        static {
            kge.a(64167483);
        }

        public static /* synthetic */ Map a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e0a11ac3", new Object[]{aVar}) : aVar.f29195a;
        }

        public a() {
        }

        public a(Uri uri) {
            a(uri);
        }

        public void a(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
                return;
            }
            this.f29195a.clear();
            for (String str : uri.getQueryParameterNames()) {
                this.f29195a.put(str, uri.getQueryParameter(str));
            }
        }

        public void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            this.f29195a.clear();
            if (map == null) {
                return;
            }
            this.f29195a.putAll(map);
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            this.f29195a.clear();
            if (jSONObject == null) {
                return;
            }
            for (String str : jSONObject.keySet()) {
                this.f29195a.put(str, jSONObject.getString(str));
            }
        }

        public void a(org.json.JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                return;
            }
            this.f29195a.clear();
            if (jSONObject == null) {
                return;
            }
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!StringUtils.isEmpty(next)) {
                        this.f29195a.put(next, jSONObject.get(next).toString());
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public Map<String, String> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f29195a;
        }

        public String a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
            }
            String str3 = this.f29195a.get(str);
            return StringUtils.isEmpty(str3) ? str2 : str3;
        }

        public String a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : this.f29195a.get(str);
        }

        public boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            String str2 = this.f29195a.get(str);
            return StringUtils.isEmpty(str2) ? z : str2.equalsIgnoreCase("true") || str2.equalsIgnoreCase("1");
        }

        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            } else {
                this.f29195a.put(str, str2);
            }
        }

        public int a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
            }
            String str2 = this.f29195a.get(str);
            return StringUtils.isEmpty(str2) ? i : b(str2, i);
        }

        public long a(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue();
            }
            String str2 = this.f29195a.get(str);
            return StringUtils.isEmpty(str2) ? j : b(str2, j);
        }

        private int b(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7d253be3", new Object[]{this, str, new Integer(i)})).intValue();
            }
            try {
                return Integer.parseInt(str);
            } catch (Exception e) {
                u.d(ios.TAG, "string2Integer Exception v=" + str + " d=" + i, e);
                return i;
            }
        }

        private long b(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7d253fa5", new Object[]{this, str, new Long(j)})).longValue();
            }
            try {
                return Long.parseLong(str);
            } catch (Exception e) {
                u.d(ios.TAG, "string2Long Exception v=" + str + " d=" + j, e);
                return j;
            }
        }

        public int[] a(String str, int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("c7f84224", new Object[]{this, str, iArr});
            }
            String str2 = this.f29195a.get(str);
            if (!StringUtils.isEmpty(str2) && str2.contains("x")) {
                int indexOf = str2.indexOf("x");
                int[] iArr2 = new int[2];
                try {
                    iArr2[0] = Integer.parseInt(str2.substring(0, indexOf));
                    iArr2[1] = Integer.parseInt(str2.substring(indexOf + 1));
                    if (iArr2[0] > 0 && iArr2[1] > 0) {
                        return iArr2;
                    }
                } catch (Exception unused) {
                }
            }
            return iArr;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : a("biz_scene");
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : a(ios.KEY_ONIOLN_FITTING_ROOM_SCENE);
        }

        public String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : a(ios.KEY_BIZ_LINE);
        }

        public String f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : a(ios.URL_KEY_VIDEO_BIZ_CODE);
        }

        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
            }
            String a2 = a(ios.URL_KEY_PHOTO_UPLOAD_CODE);
            return StringUtils.isEmpty(a2) ? ios.BIZ_CODE_UPLOAD_IMAGE : a2;
        }

        public String h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
            }
            String a2 = a(ios.URL_KEY_ALGO_PHOTO_UPLOAD_CODE);
            return StringUtils.isEmpty(a2) ? ios.BIZ_CODE_UPLOAD_IMAGE : a2;
        }

        public String i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
            }
            String a2 = a(ios.URL_KEY_ALGO_VIDEO_UPLOAD_CODE);
            return StringUtils.isEmpty(a2) ? ios.ALGO_BIZ_CODE_UPLOAD_VIDEO : a2;
        }
    }
}
