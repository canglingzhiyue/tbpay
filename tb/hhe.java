package tb;

import android.media.MediaMetadataRetriever;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.at;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.mediapick.media.VideoMedia;
import com.taobao.tao.Globals;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public class hhe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28642a;
    private a b;
    private Future<?> c;

    static {
        kge.a(5103575);
        f28642a = true;
    }

    public void a(VideoMedia videoMedia, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c00357c", new Object[]{this, videoMedia, textView});
        } else if (videoMedia.duration > 0 || !f28642a) {
            textView.setText(at.a(videoMedia.duration));
        } else {
            String valueOf = String.valueOf(videoMedia.id);
            if (hbh.sDurationCache.containsKey(valueOf)) {
                textView.setText(hbh.sDurationCache.get(valueOf));
            } else {
                b(videoMedia, textView);
            }
        }
    }

    private void b(VideoMedia videoMedia, TextView textView) {
        Future<?> future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cceb3fd", new Object[]{this, videoMedia, textView});
            return;
        }
        if (this.b != null && (future = this.c) != null) {
            future.cancel(true);
            this.b = null;
            this.c = null;
        }
        this.b = new a(videoMedia, textView);
        try {
            this.c = hbh.a().submit(this.b);
        } catch (Throwable unused) {
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private VideoMedia f28643a;
        private TextView b;

        static {
            kge.a(562718290);
            kge.a(-1390502639);
        }

        public static /* synthetic */ VideoMedia a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (VideoMedia) ipChange.ipc$dispatch("71e3e2d6", new Object[]{aVar}) : aVar.f28643a;
        }

        public static /* synthetic */ TextView b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("66aab26b", new Object[]{aVar}) : aVar.b;
        }

        private a(VideoMedia videoMedia, TextView textView) {
            this.f28643a = videoMedia;
            this.b = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (Thread.interrupted()) {
            } else {
                try {
                    if (hbh.f28570a == null) {
                        hbh.f28570a = new MediaMetadataRetriever();
                    }
                    hbh.f28570a.setDataSource(Globals.getApplication(), this.f28643a.uri);
                    final String a2 = at.a(at.a(hbh.f28570a.extractMetadata(9), 0L));
                    au.a(new Runnable() { // from class: tb.hhe.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            hbh.sDurationCache.put(String.valueOf(a.a(a.this).id), a2);
                            a.b(a.this).setText(a2);
                        }
                    });
                } catch (Exception unused) {
                }
            }
        }
    }
}
