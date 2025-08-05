package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.d;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.c;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class sos {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1632205724);
    }

    private static int b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66fee", new Object[]{new Long(j)})).intValue();
        }
        if (j <= 5242880) {
            return (int) j;
        }
        return 5242880;
    }

    public static void a(Context context, String str, long j, String str2, d dVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3d2b79", new Object[]{context, str, new Long(j), str2, dVar});
            return;
        }
        int a2 = a(j);
        JSONObject jSONObject2 = null;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Exception e) {
                e = e;
            }
            try {
                jSONObject2 = c.a(jSONObject, true);
                spz.c("PickPreloadController_DownloadVideoUtils_PreloadVideoModule", "preDownloadCurrent start 码率决策");
            } catch (Exception e2) {
                e = e2;
                jSONObject2 = jSONObject;
                spz.a("PickPreloadController_DownloadVideoUtils_PreloadVideoModule", "", e);
                if (jSONObject2 != null) {
                }
                String a3 = oyx.a(context, jSONObject2, a2, dVar, a(str));
                spz.c("PickPreloadController_DownloadVideoUtils_PreloadVideoModule", "preDownloadCurrent start downloadSize=" + a2 + "url=" + a3);
            }
        }
        if (jSONObject2 != null && a2 < 0) {
            return;
        }
        String a32 = oyx.a(context, jSONObject2, a2, dVar, a(str));
        spz.c("PickPreloadController_DownloadVideoUtils_PreloadVideoModule", "preDownloadCurrent start downloadSize=" + a2 + "url=" + a32);
    }

    private static int a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821974f", new Object[]{new Long(j)})).intValue();
        }
        if (j != -1) {
            return b(j);
        }
        return -1;
    }

    private static HashMap<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a40d9915", new Object[]{str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("from", str);
        hashMap.put(oyw.VIDEO_PLAY_SCENES, "videoFullScreen");
        return hashMap;
    }
}
