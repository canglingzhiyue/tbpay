package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.d;
import com.taobao.android.mediapick.media.Media;
import com.taobao.android.mediapick.media.MediaBucket;
import java.util.List;

/* loaded from: classes6.dex */
public class hsc extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MediaBucket f28752a;

    static {
        kge.a(2045649610);
    }

    public hsc(MediaBucket mediaBucket, int i) {
        super(i);
        this.f28752a = mediaBucket;
    }

    @Override // com.taobao.android.mediapick.d
    public List<Media> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : hsl.a(j(), this.f28752a, g(), h());
    }
}
