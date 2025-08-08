package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.j;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class plw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_FOLLOW = "follow";

    static {
        kge.a(1774255033);
    }

    public static void a(TBLiveDataModel tBLiveDataModel, a aVar, String str) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76bea64e", new Object[]{tBLiveDataModel, aVar, str});
        } else if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null) {
        } else {
            String str2 = videoInfo.topic;
            if (StringUtils.isEmpty(str2)) {
                return;
            }
            boolean z = videoInfo.publishCommentsUseMtop;
            String str3 = videoInfo.broadCaster != null ? videoInfo.broadCaster.accountId : null;
            g gVar = new g(aVar.h());
            if ("follow".equals(str)) {
                if (z) {
                    gVar.a(str3, str2, j.SYS_PREFIX + str, (HashMap<String, String>) null, (d) null);
                } else {
                    gVar.a(str2, j.SYS_PREFIX + str);
                }
            }
            g gVar2 = new g(aVar.h());
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(aw.PARAM_CHAT_RENDERS_ENHANCE, str);
            gVar2.a(str3, str2, "test", hashMap, (d) null);
        }
    }
}
