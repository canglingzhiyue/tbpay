package tb;

import android.content.Intent;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ag;

/* loaded from: classes6.dex */
public class icc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DURATION_MS = "duration_ms";
    public static final String KEY_TP_RETURN_DURATION_S = "duration";
    public static final String KEY_TP_RETURN_VIDEO_COVER_CDN_URL = "coverUrl";
    public static final String KEY_TP_RETURN_VIDEO_HEIGHT = "height";
    public static final String KEY_TP_RETURN_VIDEO_MSG = "message";
    public static final String KEY_TP_RETURN_VIDEO_WIDTH = "width";
    public static final String MESSAGE_FAILURE = "publish error";

    static {
        kge.a(129293527);
    }

    public static void a(Intent intent, r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254a6bbb", new Object[]{intent, rVar});
            return;
        }
        rVar.a("fileId", intent.getStringExtra("fileId"));
        rVar.a("fileURL", intent.getStringExtra("fileURL"));
        rVar.a("videoId", intent.getStringExtra("videoId"));
        rVar.a("height", Integer.valueOf(intent.getIntExtra("height", 0)));
        rVar.a("width", Integer.valueOf(intent.getIntExtra("width", 0)));
        rVar.a("duration", Integer.valueOf(intent.getIntExtra("duration", 0)));
        rVar.a(KEY_DURATION_MS, Integer.valueOf(intent.getIntExtra(KEY_DURATION_MS, 0)));
        rVar.a("message", intent.getStringExtra("message"));
        a(rVar, intent, "launchUri");
        a(rVar, intent, ag.KEY_MISSION_ID);
        a(rVar, intent, "fileSource");
        a(rVar, intent, "bindState");
        a(rVar, intent, icf.KEY_IMAGE_PATH);
        a(rVar, intent, "videoCoverPath");
        a(rVar, intent, "coverUrl");
    }

    private static void a(r rVar, Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69801545", new Object[]{rVar, intent, str});
        } else {
            rVar.a(str, intent.getStringExtra(str));
        }
    }
}
