package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.c;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.b;

/* loaded from: classes8.dex */
public class plz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DIANTAO_OFFICIAL = 1;

    static {
        kge.a(447630664);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        DisplayMetrics displayMetrics = pmd.a().u().c().getResources().getDisplayMetrics();
        return displayMetrics.widthPixels > displayMetrics.heightPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        return ((int) (a() * 0.251f)) - b.a(context, c.f21538a ? 0.0f : 24.0f);
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue() : (d.c() - d.a(context, 33.0f)) - d.b(110.0f);
    }

    public static String a(Context context, pmz pmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7128816d", new Object[]{context, pmzVar});
        }
        String str = null;
        if (pmzVar instanceof pmy) {
            str = ((pmy) pmzVar).f32766a;
        }
        return !StringUtils.isEmpty(str) ? str : context.getString(R.string.taolive_user_follow_account_success);
    }

    public static boolean a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ead9f969", new Object[]{videoInfo})).booleanValue() : videoInfo != null && (videoInfo.newRoomType & 256) == 256;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return "https://h5.m.taobao.com/taolive/video.html?id=" + str;
    }

    public static boolean b(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18b293c8", new Object[]{videoInfo})).booleanValue() : c(videoInfo) && videoInfo.displayInfo.diantaoOfficialAtmosphereInfo != null && !StringUtils.isEmpty(videoInfo.displayInfo.diantaoOfficialAtmosphereInfo.taoLiveIcon);
    }

    public static boolean c(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("468b2e27", new Object[]{videoInfo})).booleanValue() : (videoInfo == null || videoInfo.displayInfo == null || videoInfo.displayInfo.diantaoRoomType != 1) ? false : true;
    }

    public static boolean d(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7463c886", new Object[]{videoInfo})).booleanValue() : videoInfo != null && a(videoInfo) && videoInfo.taoLiveAtmosphereInfo != null && !StringUtils.isEmpty(videoInfo.taoLiveAtmosphereInfo.taoLiveIcon);
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue();
        }
        return pmd.a().w() != null ? pmd.a().w().a() : System.currentTimeMillis();
    }
}
