package dt;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import dt.DTExperience;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.rrx;
import tb.rry;
import tv.danmaku.ijk.media.player.CommonMonitor;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes9.dex */
public abstract class c extends CommonMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DTOnlyMonitor";
    public String liveSource = "";
    public long tScreenCut;

    static {
        kge.a(1787754015);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public String[] filter(String[] strArr) {
        DTExperience.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d71fbe8f", new Object[]{this, strArr});
        }
        if (!a.f24789a || (a2 = DTExperience.a()) == null) {
            return strArr;
        }
        for (int i = 0; i < strArr.length; i++) {
            try {
                if (strArr[i].contains("net_type=")) {
                    strArr[i] = "net_type=" + a2.b();
                } else if (strArr[i].contains("spm=")) {
                    strArr[i] = "spm=" + a2.a(this.mExtInfo, this.mConfigClone.y, this.mConfigClone.G, this.mConfigClone.x);
                } else if (strArr[i].contains("sub_business_type=")) {
                    strArr[i] = "sub_business_type=" + a2.a(this.mConfigClone, this.mExtInfo, this.liveSource);
                } else if (strArr[i].contains("video_definition=")) {
                    strArr[i] = "video_definition=" + a2.a(this.mConfigClone.af, this.mConfigClone.x, this.mConfigClone.D, this.mPlayUrl);
                } else if (strArr[i].contains("user_to_first_frame=")) {
                    strArr[i] = "user_to_first_frame=" + a2.a(this.mConfigClone, this.mRenderTimeFromInnerStart, this.tScreenCut, this.mExtInfo);
                }
            } catch (Throwable th) {
                DTExperience.LogType logType = DTExperience.LogType.ERROR;
                String str = "throwable:" + th.getMessage();
            }
        }
        b.a();
        return strArr;
    }

    public String filter(String str) {
        DTExperience.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee9ccbb7", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || !a.f24789a || (a2 = DTExperience.a()) == null) {
            return str;
        }
        try {
            if (this.mConfigClone.aa.containsKey("livesource")) {
                str = str + ",livesource=" + this.mConfigClone.aa.get("livesource");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String[] split = str.split(",");
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (str2.contains("sub_business_type=") && str2.length() > 18) {
                sb.append("sub_business_type=");
                sb.append(a2.a(this.mConfigClone, this.mExtInfo, this.liveSource));
            } else {
                sb.append(str2);
            }
            sb.append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1);
    }

    public String appendExperienceParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0bcb825", new Object[]{this, str});
        }
        DTExperience.a a2 = DTExperience.a();
        if (a2 == null) {
            return str;
        }
        String str2 = (str + ",dt_user_swipe_first_frame_time=" + a2.a(this.mConfigClone, this.mRenderTimeFromInnerStart, this.tScreenCut, this.mExtInfo)) + ",host=" + a2.a(this.mPlayUrl);
        HashMap<String, String> a3 = a2.a();
        if (a3 == null || a3.size() <= 0) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(str2);
        for (Map.Entry<String, String> entry : a3.entrySet()) {
            sb.append(",");
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    public long fetchMaxPipeSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef752178", new Object[]{this, new Long(j)})).longValue();
        }
        DTExperience.a a2 = DTExperience.a();
        return (a2 == null || !a2.a("DynamicDataPacket", "true")) ? j : j << 1;
    }

    public void noticeDataNotice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf837a1", new Object[]{this});
        } else if (!a.f24789a || !rry.a().b()) {
        } else {
            try {
                rrx rrxVar = new rrx();
                commonData(rrxVar);
                rry.a().a(rrxVar);
            } catch (Throwable th) {
                if (DTExperience.a() == null) {
                    return;
                }
                DTExperience.LogType logType = DTExperience.LogType.ERROR;
                String str = "noticeDataNotice:" + th.getMessage();
            }
        }
    }

    private void commonData(rrx rrxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb8eb74", new Object[]{this, rrxVar});
            return;
        }
        rrxVar.b = this.mConfigClone.B;
        rrxVar.d = this.mConfigClone.R;
        rrxVar.e = this.mUserFirstRenderTime;
        rrxVar.f = this.tScreenCut;
        rrxVar.g = this.mConfig.u;
        rrxVar.h = this.mConfig.x.equals(MediaConstant.LBLIVE_SOURCE) ? this.mConfig.aD : this.mConfig.af;
        rrxVar.i = getVideoWidth();
        rrxVar.j = getVideoHeight();
        rrxVar.l = this.mCdnIp;
        rrxVar.n = this.mPlayUrl;
        rrxVar.m = this.mEncodeType;
        rrxVar.q = DTExperience.a().a(this.mConfigClone, this.mRenderTimeFromInnerStart, this.tScreenCut, this.mExtInfo);
        rrxVar.o = this.mServerIP;
        rrxVar.w = DTExperience.a().a(this.mPlayUrl);
        rrxVar.y = Boolean.valueOf(this.bIsHitCache);
        rrxVar.k = getDuration();
        TaobaoMediaPlayer taobaoMediaPlayer = (TaobaoMediaPlayer) this;
        rrxVar.c = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_AVG_BITRATE, 0L);
        rrxVar.r = taobaoMediaPlayer._getPropertyLong(20009, 0L);
        rrxVar.s = taobaoMediaPlayer._getPropertyLong(TaobaoMediaPlayer.FFP_PROP_INT64_AVFORMAT_STREAM_INFO_TIME, 0L);
        if (this.mExtInfo != null && this.mExtInfo.containsKey("videoScore")) {
            rrxVar.p = this.mExtInfo.get("videoScore");
        }
        if (this.mExtInfo == null || !this.mExtInfo.containsKey("tl_def_list")) {
            return;
        }
        rrxVar.x = this.mExtInfo.get("tl_def_list");
    }
}
