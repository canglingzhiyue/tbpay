package com.taobao.android.litecreator.sdk.editor;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.AiQuality;
import com.taobao.android.litecreator.sdk.editor.data.Cut;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import com.taobao.android.litecreator.sdk.editor.data.Filter;
import com.taobao.android.litecreator.sdk.editor.data.Music;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import com.taobao.android.litecreator.sdk.editor.data.RichLabel;
import com.taobao.android.litecreator.sdk.editor.data.Sticker;
import com.taobao.android.litecreator.sdk.editor.data.Video;
import com.taobao.android.litecreator.sdk.editor.data.VideoEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.Volume;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;
import com.taobao.android.litecreator.sdk.editor.v;
import com.taobao.android.litecreator.sdk.editor.z;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import tb.hdy;
import tb.hdz;
import tb.hea;
import tb.hec;
import tb.hed;
import tb.hee;
import tb.hef;
import tb.heg;
import tb.heh;
import tb.hej;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class c implements af {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Video f13428a;
    private List<Video> b;
    private y c;
    private u d;
    private w e;
    private aa f;
    private ah g;
    private ad h;
    private ab i;
    private r j;
    private s k;
    private HashMap<Object, com.taobao.android.litecreator.sdk.editor.data.base.b> l;
    private Stack<v> m;
    private VideoEditInfo n;
    private VideoEditInfo o;
    private long p;

    static {
        kge.a(638815342);
        kge.a(-1799714104);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    @Override // com.taobao.android.litecreator.sdk.editor.z
    public /* synthetic */ void a(Video video) {
        z.CC.$default$a(this, video);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.v
    public /* synthetic */ com.taobao.android.litecreator.sdk.editor.data.base.b t() {
        return v.CC.$default$t(this);
    }

    public /* synthetic */ List<T> v() {
        return z.CC.$default$v(this);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af, com.taobao.android.litecreator.sdk.editor.z
    public /* synthetic */ AbsEditInfo r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsEditInfo) ipChange.ipc$dispatch("ab5ad8e9", new Object[]{this}) : h();
    }

    public c(Video video, VideoEditInfo videoEditInfo) {
        this.l = new HashMap<>();
        this.m = new Stack<>();
        this.f13428a = video;
        this.b = new ArrayList();
        this.b.add(video);
        C();
        a(videoEditInfo);
    }

    public c(List<Video> list, EditorInfo editorInfo) {
        this.l = new HashMap<>();
        this.m = new Stack<>();
        this.b = list;
        this.f13428a = list.get(0);
        C();
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.p = j;
        }
    }

    public void a(VideoEditInfo videoEditInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8262380", new Object[]{this, videoEditInfo});
            return;
        }
        this.n = (VideoEditInfo) JSON.parseObject(JSON.toJSONString(videoEditInfo), VideoEditInfo.class);
        if (videoEditInfo == null) {
            return;
        }
        if (videoEditInfo.filter != null) {
            this.l.get(Filter.class).a((com.taobao.android.litecreator.sdk.editor.data.base.b) videoEditInfo.filter);
        }
        if (videoEditInfo.labels != null) {
            this.l.get(RichLabel.class).a((com.taobao.android.litecreator.sdk.editor.data.base.b) videoEditInfo.labels);
        }
        if (videoEditInfo.cut != null) {
            this.l.get(Cut.class).a((com.taobao.android.litecreator.sdk.editor.data.base.b) videoEditInfo.cut);
        }
        if (videoEditInfo.music != null) {
            this.l.get(Music.class).a((com.taobao.android.litecreator.sdk.editor.data.base.b) videoEditInfo.music);
        }
        if (videoEditInfo.volume != null) {
            this.l.get(Volume.class).a((com.taobao.android.litecreator.sdk.editor.data.base.b) videoEditInfo.volume);
        }
        if (videoEditInfo.sticker != null) {
            this.l.get(Sticker.class).a((com.taobao.android.litecreator.sdk.editor.data.base.b) videoEditInfo.sticker);
        }
        if (videoEditInfo.pasters != null) {
            this.l.get(Paster.class).a((com.taobao.android.litecreator.sdk.editor.data.base.b) videoEditInfo.pasters);
        }
        if (videoEditInfo.aiQuality != null) {
            this.l.get(AiQuality.class).a((com.taobao.android.litecreator.sdk.editor.data.base.b) videoEditInfo.aiQuality);
        }
        if (videoEditInfo.beauty == null) {
            return;
        }
        this.l.get(Beauty.class).a((com.taobao.android.litecreator.sdk.editor.data.base.b) videoEditInfo.beauty);
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        D();
        E();
    }

    private void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        this.e = (w) f.a(hed.class);
        this.c = (y) f.a(hee.class);
        this.d = (u) f.a(hec.class);
        this.f = (aa) f.a(hef.class);
        this.g = (ah) f.a(hej.class);
        this.h = (ad) f.a(heh.class);
        this.i = (ab) f.a(heg.class);
        this.j = (r) f.a(hdy.class);
        this.k = (s) f.a(hea.class);
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        a(this.c);
        a(this.e);
        a(this.d);
        a(this.f);
        a(this.g);
        a(this.h);
        a(this.i);
        a(this.j);
        a(this.k);
    }

    private void a(v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0df04ac", new Object[]{this, vVar});
        } else if (!(vVar instanceof hdz)) {
        } else {
            com.taobao.android.litecreator.sdk.editor.data.base.b t = ((hdz) vVar).t();
            Class a2 = a(vVar.getClass().getGenericSuperclass());
            if (a2 == null) {
                return;
            }
            this.l.put(a2, t);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.u
    public void a(Cut cut) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670a3c11", new Object[]{this, cut});
            return;
        }
        this.m.push(this.d);
        this.d.a(cut);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.u
    public Cut f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Cut) ipChange.ipc$dispatch("8f5eda72", new Object[]{this}) : this.d.f();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.w
    public void a(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb0b1a5", new Object[]{this, filter});
            return;
        }
        this.m.push(this.e);
        this.e.a(filter);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.w
    public Filter a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Filter) ipChange.ipc$dispatch("6584f925", new Object[]{this}) : this.e.a();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.w
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.m.push(this.e);
        this.e.b();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.y
    public void a(RichLabel richLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673856db", new Object[]{this, richLabel});
            return;
        }
        this.m.push(this.c);
        this.c.a(richLabel);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.y
    public void a(RichLabel richLabel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd2f788", new Object[]{this, richLabel, new Integer(i)});
            return;
        }
        this.m.push(this.c);
        this.c.a(richLabel, i);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.y
    public List<RichLabel> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.c.e();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.y
    public void b(RichLabel richLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac7db1c", new Object[]{this, richLabel});
            return;
        }
        this.m.push(this.c);
        this.c.b(richLabel);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.z
    public <T> void a(com.taobao.android.litecreator.sdk.editor.data.base.d<T> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d709d7", new Object[]{this, dVar});
            return;
        }
        com.taobao.android.litecreator.sdk.editor.data.base.b<T> c = c(dVar);
        if (c == null) {
            return;
        }
        c.a((com.taobao.android.litecreator.sdk.editor.data.base.d) dVar);
    }

    private <T> com.taobao.android.litecreator.sdk.editor.data.base.b<T> c(com.taobao.android.litecreator.sdk.editor.data.base.d<T> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.litecreator.sdk.editor.data.base.b) ipChange.ipc$dispatch("4d7de606", new Object[]{this, dVar});
        }
        com.taobao.android.litecreator.sdk.editor.data.base.b<T> bVar = this.l.get(a(dVar.getClass().getGenericInterfaces()[0]));
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.z
    public <T> void b(com.taobao.android.litecreator.sdk.editor.data.base.d<T> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdad536", new Object[]{this, dVar});
            return;
        }
        com.taobao.android.litecreator.sdk.editor.data.base.b<T> c = c(dVar);
        if (c == null) {
            return;
        }
        c.b(dVar);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public Video g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Video) ipChange.ipc$dispatch("dfbb7c38", new Object[]{this}) : this.f13428a;
    }

    private Class a(Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("195e4984", new Object[]{this, type});
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (!(type instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getActualTypeArguments().length <= 0) {
            return null;
        }
        return a(parameterizedType.getActualTypeArguments()[0]);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public VideoEditInfo h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoEditInfo) ipChange.ipc$dispatch("cee1e05f", new Object[]{this});
        }
        VideoEditInfo videoEditInfo = this.o;
        if (videoEditInfo == null) {
            videoEditInfo = new VideoEditInfo();
        }
        videoEditInfo.cut = f();
        videoEditInfo.filter = a();
        videoEditInfo.labels = e();
        videoEditInfo.music = l();
        videoEditInfo.volume = n();
        videoEditInfo.sticker = p();
        videoEditInfo.pasters = c();
        videoEditInfo.video = g();
        videoEditInfo.medias = q();
        videoEditInfo.aiQuality = j();
        videoEditInfo.beauty = i();
        videoEditInfo.videoOriginDurationUs = this.p;
        this.o = videoEditInfo;
        return videoEditInfo;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public VideoEditInfo o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoEditInfo) ipChange.ipc$dispatch("b62e9938", new Object[]{this}) : this.n;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.aa
    public Music l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Music) ipChange.ipc$dispatch("91b14b69", new Object[]{this}) : this.f.l();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.aa
    public void a(Music music) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd249a8e", new Object[]{this, music});
            return;
        }
        this.m.push(this.f);
        this.f.a(music);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.aa
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            this.f.m();
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ah
    public void a(Volume volume) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315e5ac3", new Object[]{this, volume});
            return;
        }
        this.m.push(this.g);
        this.g.a(volume);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ah
    public Volume n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Volume) ipChange.ipc$dispatch("9761b790", new Object[]{this}) : this.g.n();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ad
    public Sticker p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Sticker) ipChange.ipc$dispatch("2b9b600d", new Object[]{this}) : this.h.p();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public List<Video> q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("dc936ecf", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public void a(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799f3f7e", new Object[]{this, paster});
        } else {
            this.i.a(paster);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public void a(Paster paster, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba492345", new Object[]{this, paster, new Integer(i)});
        } else {
            this.i.a(paster, i);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public void a(List<Paster> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.i.a(list);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public List<Paster> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.i.c();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public List<Paster> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.i.d();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public void b(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa30add", new Object[]{this, paster});
        } else {
            this.i.b(paster);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.r
    public void a(AiQuality aiQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e47a3c", new Object[]{this, aiQuality});
        } else {
            this.j.a(aiQuality);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.r
    public AiQuality j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AiQuality) ipChange.ipc$dispatch("97152b59", new Object[]{this}) : this.j.j();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.r
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.j.k();
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.s
    public void a(Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c0de99", new Object[]{this, beauty});
        } else {
            this.k.a(beauty);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.s
    public Beauty i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Beauty) ipChange.ipc$dispatch("2cb0fc97", new Object[]{this}) : this.k.i();
    }
}
