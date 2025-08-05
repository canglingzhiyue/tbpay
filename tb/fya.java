package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface fya<VideoData, Video> {
    Collection<String> a();

    Collection<Video> a(String str, VideoData videodata);

    List<Video> a(String str);

    Collection<Video> b(String str, VideoData videodata);

    Collection<Video> b(String str, List<VideoData> list);

    List<Video> b(String str);

    Map<String, List<Video>> b();

    List<Video> c(String str);

    void c(String str, Video video);

    boolean c();

    Video d(String str);

    void d(String str, Video video);

    Video e(String str);

    Video e(String str, Video video);

    Video f(String str, Video video);

    Video g(String str, Video video);

    boolean h(String str, Video video);

    int i(String str, Video video);

    a<VideoData> j(String str, Video video);

    /* loaded from: classes5.dex */
    public static class a<VideoData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final VideoData f28201a;

        static {
            kge.a(1238419024);
        }

        public a(VideoData videodata) {
            this.f28201a = videodata;
        }

        public VideoData a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (VideoData) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f28201a;
        }
    }
}
