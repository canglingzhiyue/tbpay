package tb;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.f;
import com.taobao.taolive.sdk.ui.media.g;
import com.taobao.taolive.sdk.ui.media.h;
import com.taobao.taolive.sdk.ui.media.r;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class tla implements tnl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MediaPlayerPreCreateImpl";

    /* renamed from: a  reason: collision with root package name */
    private static final long f34182a;

    static {
        kge.a(-989393675);
        kge.a(-598850066);
        f34182a = TimeUnit.SECONDS.toMillis(30L);
    }

    @Override // tb.tnl
    public f a(Context context, MediaData mediaData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("2b44fc18", new Object[]{this, context, mediaData});
        }
        if (!tmc.a()) {
            return null;
        }
        if (!(context instanceof Activity)) {
            ab.c(TAG, "Can't pre play, not instance of activity");
            return null;
        }
        Activity activity = (Activity) context;
        h hVar = new h();
        hVar.b = r.a(mediaData, null);
        hVar.f21934a = g.e(hVar.b);
        f fVar = new f(hVar);
        fVar.s(false);
        fVar.a(context);
        fVar.a(mediaData, (String) null);
        fVar.f(true);
        fVar.a(true);
        fVar.d("LiveRoom");
        final ViewGroup G = fVar.G();
        if (G == null) {
            ab.c(TAG, "[Metrics-VideoPrePlay: mediaView is null");
            fVar.I();
            return null;
        }
        fVar.g();
        fVar.a(f34182a, true);
        final ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        viewGroup.addView(G, new ViewGroup.LayoutParams(1, 1));
        fVar.a(new IMediaPlayer.g() { // from class: tb.tla.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (j == 3 && viewGroup.indexOfChild(G) != -1) {
                    viewGroup.removeView(G);
                }
                return false;
            }
        });
        fVar.a(new IMediaPlayer.e() { // from class: tb.tla.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                if (viewGroup.indexOfChild(G) != -1) {
                    viewGroup.removeView(G);
                }
                return false;
            }
        });
        return fVar;
    }
}
