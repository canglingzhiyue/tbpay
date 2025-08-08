package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.view.embed.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.k;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.u;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hfk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(74079699);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enablePoplayerReportNewUrl", "true"));
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : pmd.a().d().a("tblive", "tbLiveRoomReportUrl", "https://market.m.taobao.com/app/msd/buyer-aqcenter/report.html?bizSource=taobao&from=livePage#/poplayer");
    }

    public static void a(Context context, TBLiveDataModel tBLiveDataModel, IMediaPlayer iMediaPlayer, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8029e25", new Object[]{context, tBLiveDataModel, iMediaPlayer, new Boolean(z)});
            return;
        }
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (pmd.a().a("reportUrlForTaoBao")) {
            if (k.a() == 2) {
                z2 = true;
            }
            if (!z && !z2 && u.Z() && videoInfo != null && videoInfo.reportUrlPopLayer != null) {
                String str = videoInfo.reportUrlPopLayer;
                if (a()) {
                    JSONObject parseObject = JSON.parseObject(Uri.parse(str).getQueryParameter("params"));
                    String b = b();
                    if (StringUtils.isEmpty(b)) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("subjectType", "LIVE");
                    hashMap.put("reportType", "LIVE");
                    hashMap.put("subjectId", videoInfo.liveId);
                    hashMap.put("ttid", pmd.a().u().a());
                    JSONObject jSONObject = new JSONObject();
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = 0;
                    if ("1".equals(videoInfo.roomStatus)) {
                        j = currentTimeMillis - videoInfo.startTime;
                    } else if ("2".equals(videoInfo.roomStatus)) {
                        j = iMediaPlayer.m();
                    }
                    jSONObject.put("reportStartTime", (Object) String.valueOf(currentTimeMillis));
                    jSONObject.put(c.LIVE_TYPE, (Object) videoInfo.roomStatus);
                    jSONObject.put("liveRecordTime", (Object) String.valueOf(j));
                    hashMap.put("extParams", jSONObject.toJSONString());
                    String a2 = pma.a(b, hashMap);
                    plx.a("ReportUtils", "appQueryOriginUrl = " + a2);
                    parseObject.put("url", (Object) a2);
                    str = pma.a(str, "params", parseObject.toJSONString());
                }
                c();
                Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                intent.putExtra("event", str);
                intent.putExtra("param", str);
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
            } else if (videoInfo == null || videoInfo.reportUrl == null) {
            } else {
                c();
                s.a(context, videoInfo.reportUrl, true);
            }
        } else if (videoInfo == null || videoInfo.openReportUrl == null) {
        } else {
            s.a(context, videoInfo.openReportUrl, true);
        }
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (hkl.a().b() == null) {
        } else {
            hkl.a().b().updateNextPageProperties();
        }
    }
}
