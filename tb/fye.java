package tb;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bf;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.fya;

/* loaded from: classes5.dex */
public class fye<VideoData, Video> implements bf.a, fxy<VideoData, Video> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PLAY_CONTROL_MAX_FINDING_COUNT = 3;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<RecyclerView> f28203a;
    public final fya<VideoData, Video> b;
    public final fyb<Video> c;
    public final DXVideoControlConfig<VideoData> d;
    public final boolean e;
    private final a<VideoData, Video> f;
    private int g = 0;
    private Handler h;

    /* loaded from: classes5.dex */
    public interface a<VideoData, Video> {
        boolean a(Video video, fya.a<VideoData> aVar);
    }

    static {
        kge.a(-131136944);
        kge.a(-100868778);
        kge.a(151788738);
    }

    public static /* synthetic */ void a(fye fyeVar, Collection collection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3c72e1", new Object[]{fyeVar, collection, str});
        } else {
            fyeVar.a(collection, str);
        }
    }

    public fye(RecyclerView recyclerView, fya<VideoData, Video> fyaVar, fyb<Video> fybVar, DXVideoControlConfig<VideoData> dXVideoControlConfig, a<VideoData, Video> aVar) {
        this.f28203a = new WeakReference<>(recyclerView);
        this.b = fyaVar;
        this.c = fybVar;
        this.d = dXVideoControlConfig;
        this.f = aVar;
        this.e = dXVideoControlConfig.q();
        if (dXVideoControlConfig.o()) {
            recyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: tb.fye.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
                    } else {
                        fye.this.a();
                    }
                }
            });
        }
        if (dXVideoControlConfig.p()) {
            DinamicXEngine.a(this);
        }
    }

    @Override // com.taobao.android.dinamicx.bf.a
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            return;
        }
        if (DinamicXEngine.j()) {
            fuw.d("DXVideoController", "receive apm event: " + i + "; at thread " + Thread.currentThread().getName());
        }
        if (i == 2) {
            fxe.a(new Runnable() { // from class: tb.fye.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (String str : fye.this.b.a()) {
                        fye.a(fye.this, (Collection) null, str);
                    }
                }
            });
        } else if (i != 1) {
        } else {
            fxe.a(new Runnable() { // from class: tb.fye.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String next;
                    List<Video> c;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator<String> it = fye.this.b.a().iterator();
                    while (it.hasNext() && (c = fye.this.b.c((next = it.next()))) != null && !c.isEmpty()) {
                        for (Video video : c) {
                            if (fye.this.c.a(video)) {
                                fye.this.c.b(fye.this, video, next);
                            }
                        }
                    }
                }
            });
        }
    }

    public Collection<String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("846747e", new Object[]{this}) : this.b.a();
    }

    @Override // tb.fxy
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (!f()) {
                h();
                return;
            }
            for (Map.Entry<String, List<Video>> entry : this.b.b().entrySet()) {
                for (Video video : entry.getValue()) {
                    this.c.b(this, video, entry.getKey());
                }
            }
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    @Override // tb.fxy
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            if (!f()) {
                c(str);
                return;
            }
            for (Video video : this.b.a(str)) {
                this.c.b(this, video, str);
            }
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    @Override // tb.fxy
    public void a(VideoData videodata, String str) {
        List<Video> b;
        List<Video> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, videodata, str});
            return;
        }
        try {
            if (!f()) {
                f(videodata, str);
                return;
            }
            Collection<Video> a2 = this.b.a(str, videodata);
            if (this.d.h() == 2 && (b = this.b.b(str)) != null) {
                Video video = null;
                Iterator<Video> it = b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Video next = it.next();
                        fya.a<VideoData> j = this.b.j(str, next);
                        if (j != null && j.a() == videodata) {
                            video = next;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (video != null) {
                    if (this.c.a() == 0 && (c = this.b.c(str)) != null && !c.isEmpty()) {
                        Iterator<Video> it2 = c.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Video next2 = it2.next();
                            if (this.c.a(next2)) {
                                this.b.d(str, next2);
                                this.c.b(this, next2, str);
                                break;
                            }
                        }
                    }
                    if (this.c.a() <= 0) {
                        return;
                    }
                    this.b.c(str, video);
                    this.c.a(this, video, str);
                    return;
                }
            }
            d();
            a((Collection) a2, str);
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    @Override // tb.fxy
    public void a(List<VideoData> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
            return;
        }
        try {
            if (!f()) {
                b((List) list, str);
            } else if (list.isEmpty()) {
            } else {
                if (DinamicXEngine.j()) {
                    fuw.d("DXVideoController", "start batchAppendVideo data size: " + list.size());
                }
                Collection<Video> b = this.b.b(str, (List) list);
                if (this.d.h() == 2) {
                    b(str);
                } else {
                    d();
                    a((Collection) b, str);
                }
                if (!DinamicXEngine.j()) {
                    return;
                }
                fuw.d("DXVideoController", "end batchAppendVideo");
            }
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    @Override // tb.fxy
    public void b(VideoData videodata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26bde0f", new Object[]{this, videodata, str});
        } else {
            a((fye<VideoData, Video>) videodata, str, true);
        }
    }

    @Override // tb.fxy
    public void a(VideoData videodata, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ab6186", new Object[]{this, videodata, str, new Boolean(z)});
            return;
        }
        try {
            if (!f()) {
                g(videodata, str);
                return;
            }
            Collection<Video> b = this.b.b(str, (String) videodata);
            if (b == null && this.e) {
                return;
            }
            a((Collection) b, str, z);
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    @Override // tb.fxy
    public void c(Video video, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f0c0910", new Object[]{this, video, str});
        } else {
            b(video, str, false);
        }
    }

    @Override // tb.fxy
    public void d(Video video, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac3411", new Object[]{this, video, str});
            return;
        }
        try {
            if (!f()) {
                i(video, str);
                return;
            }
            this.c.b(video);
            Video e = e(video, str);
            this.b.g(str, video);
            if (e == null || e == video) {
                return;
            }
            b(str, (String) e);
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    private void b(Video video, String str, boolean z) {
        Video e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b1096a5", new Object[]{this, video, str, new Boolean(z)});
            return;
        }
        try {
            if (!f()) {
                h(video, str);
                return;
            }
            if (z && this.c.a(video)) {
                this.c.b(this, video, str);
            } else {
                this.c.b(video);
            }
            RecyclerView recyclerView = this.f28203a.get();
            if ((recyclerView instanceof fyl) && this.b.d(str) == video) {
                ((fyl) recyclerView).onDidFinishPlayingLastItem(this.b.i(str, video), this.b.c(), str, new HashMap());
            }
            if (this.d.h() == 3) {
                e = this.b.e(str);
            } else {
                e = e(video, str);
            }
            if (e == null) {
                d();
            } else {
                b(str, (String) e);
            }
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    private Video e(Video video, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("d4d67e60", new Object[]{this, video, str});
        }
        Video e = this.b.e(str, video);
        if (e == null) {
            return null;
        }
        while (e != null && this.c.a(e)) {
            Video f = this.b.f(str, e);
            if (f != null && f == e) {
                break;
            }
            e = f;
        }
        return e;
    }

    private void a(Collection<Video> collection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94631a3", new Object[]{this, collection, str});
        } else {
            a((Collection) collection, str, true);
        }
    }

    private void a(Collection<Video> collection, String str, boolean z) {
        List<Video> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f80b591", new Object[]{this, collection, str, new Boolean(z)});
            return;
        }
        if (collection != null) {
            for (Video video : collection) {
                if (this.c.a(video) && !this.b.h(str, video)) {
                    this.c.b(this, video, str);
                }
            }
        }
        if (!z || (c = this.b.c(str)) == null) {
            return;
        }
        Iterator<Video> it = c.iterator();
        while (it.hasNext()) {
            Video next = it.next();
            b(str, (String) next);
            while (this.c.a() > 0 && (next = this.b.f(str, next)) != null && !this.c.a(next) && !e()) {
                b(str, (String) next);
            }
        }
    }

    public void b(String str) {
        Video d;
        List<Video> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.b.b(str) == null || (d = this.b.d(str)) == null) {
        } else {
            if (this.c.a() == 0 && (c = this.b.c(str)) != null && !c.isEmpty()) {
                Iterator<Video> it = c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Video next = it.next();
                    if (this.c.a(next) && next != d) {
                        this.b.d(str, next);
                        this.c.b(this, next, str);
                        break;
                    }
                }
            }
            if (this.c.a() <= 0) {
                return;
            }
            this.b.c(str, d);
            this.c.a(this, d, str);
        }
    }

    private void b(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, video});
        } else if (fqi.K()) {
            c();
            if (!a(str, (String) video)) {
                if (e()) {
                    return;
                }
                b(video, str, true);
                return;
            }
            this.c.a(this, video, str);
            d();
        } else {
            this.c.a(this, video, str);
        }
    }

    public boolean a(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{this, str, video})).booleanValue();
        }
        RecyclerView recyclerView = this.f28203a.get();
        if (this.f != null && recyclerView != null && recyclerView.getScrollState() == 0) {
            return this.f.a(video, this.b.j(str, video));
        }
        return true;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!fqi.K()) {
        } else {
            this.g++;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!fqi.K()) {
        } else {
            this.g = 0;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : fqi.K() && this.g >= 3;
    }

    private static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : Looper.getMainLooper() == Looper.myLooper();
    }

    private Handler g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("98203298", new Object[]{this});
        }
        if (this.h == null) {
            this.h = new Handler(Looper.getMainLooper());
        }
        return this.h;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            g().post(new Runnable() { // from class: tb.fye.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        fye.this.a();
                    }
                }
            });
        }
    }

    private void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            g().post(new Runnable() { // from class: tb.fye.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        fye.this.a(str);
                    }
                }
            });
        }
    }

    private void f(final VideoData videodata, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24ec8a13", new Object[]{this, videodata, str});
        } else {
            g().post(new Runnable() { // from class: tb.fye.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        fye.this.a((fye) videodata, str);
                    }
                }
            });
        }
    }

    private void b(final List<VideoData> list, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f0624", new Object[]{this, list, str});
        } else {
            g().post(new Runnable() { // from class: tb.fye.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        fye.this.a((List) list, str);
                    }
                }
            });
        }
    }

    private void g(final VideoData videodata, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18cb514", new Object[]{this, videodata, str});
        } else {
            g().post(new Runnable() { // from class: tb.fye.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        fye.this.b((fye) videodata, str);
                    }
                }
            });
        }
    }

    private void h(final Video video, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2ce015", new Object[]{this, video, str});
        } else {
            g().post(new Runnable() { // from class: tb.fye.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        fye.this.c(video, str);
                    }
                }
            });
        }
    }

    private void i(final Video video, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cacd0b16", new Object[]{this, video, str});
        } else {
            g().post(new Runnable() { // from class: tb.fye.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        fye.this.d(video, str);
                    }
                }
            });
        }
    }
}
