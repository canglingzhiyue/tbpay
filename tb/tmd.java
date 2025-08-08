package tb;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.pre.LiveDetailPreRequestParams;
import com.taobao.taolive.room.pre.a;
import com.taobao.taolive.room.utils.u;
import com.taobao.taolive.sdk.core.impl.TBLiveDataProvider;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.f;
import tb.ppq;

/* loaded from: classes8.dex */
public class tmd implements tnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-338900694);
        kge.a(-1534444585);
    }

    @Override // tb.tnm
    public void a(final Context context, String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{this, context, str, str2});
        } else if (!tmc.b()) {
        } else {
            Uri parse = Uri.parse(str);
            if (!tnn.a().b(str2)) {
                tnn.a().a(context, str2);
                return;
            }
            LiveDetailPreRequestParams a2 = u.a(parse);
            if (StringUtils.isEmpty(a2.liveSource)) {
                a2.liveSource = str2;
            }
            if (!Boolean.parseBoolean(a2.needRecommend)) {
                a2.needRecommend = "true";
            }
            a.a().a(a2, str2);
            a a3 = a.a();
            a3.a(a.PRE_CREATE_ROOM_REC + str2, new ppq.a() { // from class: tb.tmd.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ppq.a
                public void onGetFandomInfoSuccess(FandomInfo fandomInfo, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e52d6dd", new Object[]{this, fandomInfo, str3});
                    }
                }

                @Override // tb.ppq.a
                public void onGetVideoInfoSuccess(VideoInfo videoInfo, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5889673f", new Object[]{this, videoInfo, str3});
                    } else if (videoInfo == null || videoInfo.liveId == null) {
                        a a4 = a.a();
                        a4.a(a.PRE_CREATE_ROOM_REC + str2);
                        TLog.loge("tblive", "RecPreCreateImpl", "live id 为空");
                    } else {
                        tnp tnpVar = new tnp();
                        tnpVar.b = videoInfo.liveId;
                        tnpVar.c = str3;
                        tnpVar.f34233a = str2;
                        MediaData a5 = com.taobao.taolive.sdk.model.common.a.a(videoInfo);
                        f a6 = new tla().a(context, a5);
                        tnn.a().a(str2, tnpVar);
                        tno tnoVar = new tno();
                        tnoVar.f34232a = videoInfo.liveId;
                        tnoVar.b = a5;
                        if (a6 != null) {
                            tnoVar.c = a6.L();
                        }
                        tnn.a().a(videoInfo.liveId, tnoVar);
                    }
                }

                @Override // tb.ppq.a
                public void onGetVideoInfoFail(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fa662561", new Object[]{this, str3});
                        return;
                    }
                    a a4 = a.a();
                    a4.a(a.PRE_CREATE_ROOM_REC + str2);
                }
            }, (TBLiveDataProvider.b) null);
        }
    }
}
