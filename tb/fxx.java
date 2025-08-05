package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fya;

/* loaded from: classes5.dex */
public abstract class fxx<VideoData, Video> implements fya<VideoData, Video> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Pair<List<VideoData>, fyc<Video>>> f28200a = new HashMap();
    private final Map<String, Map<Video, fya.a<VideoData>>> b = new HashMap();
    private final fxz<VideoData, Video> c;
    private final Comparator<VideoData> d;
    private final boolean e;
    private final boolean f;

    static {
        kge.a(-2048674972);
        kge.a(-950221);
    }

    public abstract int a(VideoData videodata);

    public abstract List<Video> a(VideoData videodata, List<VideoData> list, fyc<Video> fycVar);

    public abstract List<VideoData> a(List<VideoData> list, VideoData videodata);

    public abstract boolean a(List<VideoData> list, List<VideoData> list2);

    public abstract List<VideoData> b(List<VideoData> list, VideoData videodata);

    public abstract List<VideoData> b(List<VideoData> list, List<VideoData> list2);

    public abstract fyc<Video> d();

    public fxx(fxz<VideoData, Video> fxzVar, Comparator<VideoData> comparator, boolean z, boolean z2) {
        this.c = fxzVar;
        this.d = comparator;
        this.e = z;
        this.f = z2;
    }

    @Override // tb.fya
    public Collection<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("66d215f", new Object[]{this}) : this.c.a();
    }

    public Collection<Video> a(String str, List<VideoData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("ffcbab84", new Object[]{this, str, list});
        }
        if (DinamicXEngine.j()) {
            fuw.d("DXVideoManager", "start refreshQueue videoDataSize: " + list.size());
        }
        Pair<List<VideoData>, fyc<Video>> pair = this.f28200a.get(str);
        List<VideoData> arrayList = pair != null ? (List) pair.first : new ArrayList<>();
        fyc<Video> fycVar = pair != null ? (fyc) pair.second : null;
        if (list.size() > 1) {
            Collections.sort(list, this.d);
        }
        if (!a((List) arrayList, (List) list)) {
            if (DinamicXEngine.j()) {
                fuw.d("DXVideoManager", "end refreshQueue(not changed)");
            }
            return null;
        }
        g(str);
        fyc<Video> a2 = a(str, list, arrayList, fycVar);
        this.f28200a.put(str, new Pair<>(list, a2));
        a2.d();
        if (fycVar == null) {
            a2.b(0);
            if (DinamicXEngine.j()) {
                fuw.d("DXVideoManager", "end refreshQueue(oldQueue empty)");
            }
            return Collections.emptyList();
        }
        List<Video> b = fycVar.b();
        if (b.isEmpty() && !fycVar.f()) {
            a2.b(Math.max(0, a2.d(fycVar.a(fycVar.g() - 1)) + 1));
            for (Video video : fycVar.c()) {
                a2.f(video);
            }
        }
        for (Video video2 : b) {
            a2.b(Math.max(0, a2.d(video2)));
        }
        if (b.isEmpty()) {
            a2.b(0);
        }
        if (DinamicXEngine.j()) {
            fuw.d("DXVideoManager", "end refreshQueue");
        }
        return fycVar.h();
    }

    @Override // tb.fya
    public Map<String, List<Video>> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Pair<List<VideoData>, fyc<Video>>> entry : this.f28200a.entrySet()) {
            hashMap.put(entry.getKey(), ((fyc) entry.getValue().second).h());
        }
        this.f28200a.clear();
        return hashMap;
    }

    @Override // tb.fya
    public List<Video> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        Pair<List<VideoData>, fyc<Video>> remove = this.f28200a.remove(str);
        if (remove != null) {
            arrayList.addAll(((fyc) remove.second).h());
        }
        return arrayList;
    }

    @Override // tb.fya
    public List<Video> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        Pair<List<VideoData>, fyc<Video>> pair = this.f28200a.get(str);
        if (pair != null) {
            arrayList.addAll(((fyc) pair.second).h());
        }
        return arrayList;
    }

    @Override // tb.fya
    public Collection<Video> a(String str, VideoData videodata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("1b034df9", new Object[]{this, str, videodata});
        }
        Pair<List<VideoData>, fyc<Video>> pair = this.f28200a.get(str);
        return a(str, (List) b((List<List<VideoData>>) (pair != null ? (List) pair.first : new ArrayList<>()), (List<VideoData>) videodata));
    }

    @Override // tb.fya
    public Collection<Video> b(String str, List<VideoData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("5cf76e3", new Object[]{this, str, list});
        }
        Pair<List<VideoData>, fyc<Video>> pair = this.f28200a.get(str);
        return a(str, (List) b((List) (pair != null ? (List) pair.first : new ArrayList<>()), (List) list));
    }

    @Override // tb.fya
    public Collection<Video> b(String str, VideoData videodata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("af41bd98", new Object[]{this, str, videodata});
        }
        Pair<List<VideoData>, fyc<Video>> pair = this.f28200a.get(str);
        return a(str, (List) a((List<List<VideoData>>) (pair != null ? (List) pair.first : new ArrayList<>()), (List<VideoData>) videodata));
    }

    @Override // tb.fya
    public List<Video> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb209513", new Object[]{this, str});
        }
        fyc<Video> f = f(str);
        if (f != null) {
            return f.b();
        }
        return null;
    }

    @Override // tb.fya
    public void c(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f6a990", new Object[]{this, str, video});
            return;
        }
        fyc<Video> f = f(str);
        if (f == null) {
            return;
        }
        f.b(f.d(video));
    }

    @Override // tb.fya
    public void d(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3196d491", new Object[]{this, str, video});
            return;
        }
        fyc<Video> f = f(str);
        if (f == null) {
            return;
        }
        f.c(f.d(video));
    }

    @Override // tb.fya
    public Video e(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("7670ede0", new Object[]{this, str, video});
        }
        fyc<Video> f = f(str);
        if (f != null) {
            return a(video, f.a((fyc<Video>) video), f);
        }
        return null;
    }

    @Override // tb.fya
    public Video f(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("35e04ff", new Object[]{this, str, video});
        }
        fyc<Video> f = f(str);
        if (f != null) {
            return a(video, f.b((fyc<Video>) video), f);
        }
        return null;
    }

    @Override // tb.fya
    public Video g(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("904b1c1e", new Object[]{this, str, video});
        }
        fyc<Video> f = f(str);
        if (f != null) {
            return f.c((fyc<Video>) video);
        }
        return null;
    }

    @Override // tb.fya
    public boolean h(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64178099", new Object[]{this, str, video})).booleanValue();
        }
        fyc<Video> f = f(str);
        return f != null && f.d(video) >= 0;
    }

    @Override // tb.fya
    public Video d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("1c8a47dd", new Object[]{this, str});
        }
        fyc<Video> f = f(str);
        if (f != null) {
            return f.a();
        }
        return null;
    }

    @Override // tb.fya
    public int i(String str, Video video) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0b7ab89", new Object[]{this, str, video})).intValue();
        }
        Pair<List<VideoData>, fyc<Video>> pair = this.f28200a.get(str);
        if (pair == null) {
            return -1;
        }
        List list = (List) pair.first;
        int intValue = ((fyc) pair.second).g(video).intValue();
        if (intValue >= 0 && intValue < list.size()) {
            return a((fxx<VideoData, Video>) list.get(intValue));
        }
        return -1;
    }

    @Override // tb.fya
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f;
    }

    @Override // tb.fya
    public Video e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("73a838bc", new Object[]{this, str});
        }
        fyc<Video> f = f(str);
        if (f == null || f.f()) {
            return null;
        }
        f.d();
        f.b(0);
        return f.a(0);
    }

    @Override // tb.fya
    public fya.a<VideoData> j(String str, Video video) {
        Map<Video, fya.a<VideoData>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fya.a) ipChange.ipc$dispatch("e3eaa944", new Object[]{this, str, video});
        }
        if (!fqi.K() || (map = this.b.get(str)) == null) {
            return null;
        }
        return map.get(video);
    }

    public fyc<Video> a(String str, List<VideoData> list, List<VideoData> list2, fyc<Video> fycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fyc) ipChange.ipc$dispatch("b8971982", new Object[]{this, str, list, list2, fycVar});
        }
        fyc<Video> d = d();
        for (int i = 0; i < list.size(); i++) {
            VideoData videodata = list.get(i);
            List<Video> list3 = null;
            if (fycVar != null && !list2.isEmpty()) {
                list3 = a((fxx<VideoData, Video>) videodata, (List<fxx<VideoData, Video>>) list2, (fyc) fycVar);
            }
            if (list3 == null || list3.isEmpty()) {
                list3 = this.c.a(videodata, str);
            }
            if (list3 != null && !list3.isEmpty()) {
                if (this.e) {
                    Collections.reverse(list3);
                }
                d.a(i, list3);
                for (Video video : list3) {
                    a(str, (String) video, (fya.a) new fya.a<>(videodata));
                }
            }
        }
        return d;
    }

    private Video a(Video video, Video video2, fyc<Video> fycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("84ec1b92", new Object[]{this, video, video2, fycVar});
        }
        if (!fycVar.e(video)) {
            return null;
        }
        if (!this.f || video2 != null || fycVar.f()) {
            return video2;
        }
        fycVar.e();
        fycVar.b(0);
        return fycVar.a(0);
    }

    private fyc<Video> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fyc) ipChange.ipc$dispatch("7fced83f", new Object[]{this, str});
        }
        Pair<List<VideoData>, fyc<Video>> pair = this.f28200a.get(str);
        if (pair != null) {
            return (fyc) pair.second;
        }
        return null;
    }

    private void a(String str, Video video, fya.a<VideoData> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6023773", new Object[]{this, str, video, aVar});
        } else if (!fqi.K()) {
        } else {
            Map<Video, fya.a<VideoData>> map = this.b.get(str);
            if (map == null) {
                map = new HashMap<>();
                this.b.put(str, map);
            }
            map.put(video, aVar);
        }
    }

    private void g(String str) {
        Map<Video, fya.a<VideoData>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else if (!fqi.K() || (map = this.b.get(str)) == null) {
        } else {
            map.clear();
        }
    }
}
