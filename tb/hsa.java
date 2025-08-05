package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.IMediaPickClient;
import com.taobao.android.mediapick.c;
import com.taobao.android.mediapick.media.ImageMedia;
import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public class hsa extends c<ImageMedia> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ImageView f28750a;
    private CheckedTextView b;
    private ImageView c;

    static {
        kge.a(1735443506);
    }

    @Override // com.taobao.android.mediapick.c
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.mediapick.c
    public View a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ee74837c", new Object[]{this, activity});
        }
        View inflate = activity.getLayoutInflater().inflate(R.layout.rv_item_media_image, (ViewGroup) null, false);
        this.f28750a = (ImageView) inflate.findViewById(R.id.iv_thumbnail);
        this.b = (CheckedTextView) inflate.findViewById(R.id.tv_pickview);
        this.c = (ImageView) inflate.findViewById(R.id.iv_disable);
        return inflate;
    }

    @Override // com.taobao.android.mediapick.c
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.mediapick.c
    public void a(ImageMedia imageMedia, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d205912c", new Object[]{this, imageMedia, new Boolean(z)});
            return;
        }
        this.n.a(imageMedia, this.f28750a);
        this.b.setChecked(z);
        String str = "";
        if (IMediaPickClient.PickMode.MULTIP_REPEAT != this.l.g()) {
            int indexOf = this.l.d().indexOf(imageMedia);
            CheckedTextView checkedTextView = this.b;
            if (indexOf != -1) {
                str = String.valueOf(indexOf + 1);
            }
            checkedTextView.setText(str);
        } else {
            this.b.setText(str);
        }
        if (this.l.d().size() < this.l.h() || ((IMediaPickClient.PickMode.MULTIP_REPEAT != this.l.g() && IMediaPickClient.PickMode.MULTIP != this.l.g()) || z)) {
            z2 = false;
        }
        ImageView imageView = this.c;
        if (!z2) {
            i = 8;
        }
        imageView.setVisibility(i);
    }
}
