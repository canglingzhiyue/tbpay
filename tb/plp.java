package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.utils.d;
import com.taobao.taolive.movehighlight.utils.f;
import com.taobao.taolive.movehighlight.utils.n;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* loaded from: classes8.dex */
public class plp implements phi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(572285447);
        kge.a(-440209312);
    }

    @Override // tb.phi
    public void a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead9f965", new Object[]{this, videoInfo});
        } else if (videoInfo == null) {
        } else {
            f.a().a(System.currentTimeMillis());
            f.a().a(f.f);
            d.a(videoInfo.liveId, null, null, n.SOURCE_SWITCH_REPLAY);
        }
    }
}
