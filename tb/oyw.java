package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.cache.library.StorageUtils;
import com.taobao.taobaoavsdk.cache.library.i;
import java.io.File;

/* loaded from: classes8.dex */
public class oyw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALI_DROP_0_REF_VF = "ali_drop_0_ref_vf";
    public static final String ALI_DROP_SKIP_REF_VF = "ali_drop_skip_ref_vf";
    public static final String ALI_FLV_RETAIN = "ali_flv_retain";
    public static final String BIZ_CODE = "bizCode";
    public static final String CDN_IP = "cdnIp";
    public static final String CONNECT_TIMEOUT = "connTimeout";
    public static final String LIVE_BACKUP_IP = "tb_live_backup_ip";
    public static final String ONLY_VIDEO = "onlyvideo";
    public static final String PLAY_TOKEN_ID = "playTokenId";
    public static final String PRELOAD_NET_CUT_SIZE = "preloadNetCutSize";
    public static final String PRE_LOAD = "preLoad";
    public static final String READ_TIMEOUT = "readTimeout";
    public static final String RETRY_TIME = "RetryTime";
    public static final String TOP_ANCHOR = "top_anchor";
    public static final String USE_TBNET_PROXY = "useTBNetProxy";
    public static final String VIDEO_CACHE_ID = "videoCacheId";
    public static final String VIDEO_DEFINE = "videoDefine";
    public static final String VIDEO_ID = "videoId";
    public static final String VIDEO_LENGTH = "videoLength";
    public static final String VIDEO_PLAY_SCENES = "videoPlayScenes";

    /* renamed from: a  reason: collision with root package name */
    private static i f32500a;
    private static String b;

    static {
        kge.a(878489946);
    }

    public static i a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("94eca1a8", new Object[]{context});
        }
        i iVar = f32500a;
        if (iVar != null) {
            return iVar;
        }
        i b2 = b(context);
        f32500a = b2;
        return b2;
    }

    private static i b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("863e3129", new Object[]{context}) : new i.a(context.getApplicationContext()).a();
    }

    public static String a(Context context, String str) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        try {
            if (StringUtils.isEmpty(b)) {
                b = StorageUtils.getIndividualCacheDirectory(context).getAbsolutePath();
            }
            a2 = new ozd().a(str);
        } catch (Throwable unused) {
        }
        if (StringUtils.isEmpty(a2)) {
            return null;
        }
        File file = new File(b, a2);
        if (file.exists() && file.canRead() && file.length() > 1024) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str});
        }
        try {
            if (!StringUtils.isEmpty(str) && context != null) {
                if (StringUtils.isEmpty(b)) {
                    b = StorageUtils.getIndividualCacheDirectory(context).getAbsolutePath();
                }
                File file = new File(b, str);
                if (file.exists() && file.canRead() && file.length() > 1024) {
                    return file.getAbsolutePath();
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
