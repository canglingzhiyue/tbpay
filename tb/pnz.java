package tb;

import android.content.Context;
import android.view.View;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.d;
import java.util.Map;

/* loaded from: classes8.dex */
public interface pnz {
    View a();

    void a(Context context, VideoInfo videoInfo, String str, Map<String, String> map, ipz ipzVar);

    void a(Context context, d dVar, VideoInfo videoInfo, boolean z, boolean z2, Map<String, String> map, ipz ipzVar);

    void a(View.OnClickListener onClickListener);

    void b();

    boolean c();

    boolean d();

    boolean e();
}
