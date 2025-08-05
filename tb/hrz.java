package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.c;
import com.taobao.android.mediapick.media.MediaBucket;
import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public class hrz extends c<MediaBucket> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ImageView f28749a;
    private TextView b;
    private TextView c;

    static {
        kge.a(1335013669);
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
        View inflate = activity.getLayoutInflater().inflate(R.layout.rv_item_media_bucket, (ViewGroup) null, false);
        this.f28749a = (ImageView) inflate.findViewById(R.id.iv_thumbnail);
        this.b = (TextView) inflate.findViewById(R.id.tv_folder_name);
        this.c = (TextView) inflate.findViewById(R.id.tv_folder_count);
        return inflate;
    }

    @Override // com.taobao.android.mediapick.c
    public void a(MediaBucket mediaBucket, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f791a83", new Object[]{this, mediaBucket, new Boolean(z)});
            return;
        }
        this.n.a(mediaBucket, this.f28749a);
        this.b.setText(mediaBucket.displayName);
        this.c.setText(String.valueOf(mediaBucket.count));
    }
}
