package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.tao.log.statistics.d;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pkn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f32720a;
    public String b = "0";
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    static {
        kge.a(1766755915);
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (this.f32720a != 0) {
            hashMap.put("watchTime", String.valueOf(System.currentTimeMillis() - this.f32720a));
        }
        String str = this.b;
        if (str != null) {
            hashMap.put(d.PARAM_IS_RETRY, str);
        }
        String str2 = this.c;
        if (str2 != null) {
            hashMap.put("playerErrorCode", str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            hashMap.put("roomStatus", str3);
        }
        String str4 = this.e;
        if (str4 != null) {
            hashMap.put("liveScene", str4);
        }
        String str5 = this.f;
        if (str5 != null) {
            hashMap.put(aw.PARAM_PLAY_MODE, str5);
        }
        String str6 = this.g;
        if (str6 != null) {
            hashMap.put("playToken", str6);
        }
        String str7 = this.h;
        if (str7 != null) {
            hashMap.put(pqq.KEY_LIVE_SOURCE, str7);
        }
        String str8 = this.i;
        if (str8 != null) {
            hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, str8);
        }
        String str9 = this.j;
        if (str9 != null) {
            hashMap.put("feed_type", str9);
        }
        return hashMap;
    }
}
