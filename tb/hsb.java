package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.c;
import com.taobao.android.mediapick.media.VideoMedia;
import com.taobao.taobao.R;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public class hsb extends c<VideoMedia> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ImageView f28751a;
    private TextView b;

    static {
        kge.a(102305618);
    }

    @Override // com.taobao.android.mediapick.c
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.mediapick.c
    public View a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ee74837c", new Object[]{this, activity});
        }
        View inflate = activity.getLayoutInflater().inflate(R.layout.rv_item_media_video, (ViewGroup) null, false);
        this.f28751a = (ImageView) inflate.findViewById(R.id.iv_thumbnail);
        this.b = (TextView) inflate.findViewById(R.id.tv_video_duration);
        return inflate;
    }

    @Override // com.taobao.android.mediapick.c
    public void a(VideoMedia videoMedia, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("866aa0c", new Object[]{this, videoMedia, new Boolean(z)});
            return;
        }
        this.n.a(videoMedia, this.f28751a);
        this.b.setText(a(videoMedia.duration));
    }

    private static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        return simpleDateFormat.format(Long.valueOf(j));
    }
}
