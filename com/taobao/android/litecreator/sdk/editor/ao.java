package com.taobao.android.litecreator.sdk.editor;

import android.graphics.Rect;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import android.view.SurfaceView;
import android.view.View;
import com.alibaba.marvel.Const;
import com.alibaba.marvel.Editor;
import com.alibaba.marvel.Marvel;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.TemplateEditor;
import com.alibaba.marvel.Viewer;
import com.alibaba.marvel.exporter.DraftExporter;
import com.alibaba.marvel.java.BackgroundBlurType;
import com.alibaba.marvel.java.ExportMonitor;
import com.alibaba.marvel.java.OnCompleteListener;
import com.alibaba.marvel.java.OnFrameUpdateListener;
import com.alibaba.marvel.java.OnPrepareListener;
import com.alibaba.marvel.java.OnProgressListener;
import com.alibaba.marvel.java.OnStatListener;
import com.alibaba.marvel.java.ScaleType;
import com.alibaba.marvel.java.SourceType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.ag;
import com.taobao.android.litecreator.sdk.editor.data.AiQuality;
import com.taobao.android.litecreator.sdk.editor.data.Canvas;
import com.taobao.android.litecreator.sdk.editor.data.Cut;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import com.taobao.android.litecreator.sdk.editor.data.Filter;
import com.taobao.android.litecreator.sdk.editor.data.Media;
import com.taobao.android.litecreator.sdk.editor.data.MediaClips;
import com.taobao.android.litecreator.sdk.editor.data.Music;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.litecreator.sdk.editor.data.Sticker;
import com.taobao.android.litecreator.sdk.editor.data.Video;
import com.taobao.android.litecreator.sdk.editor.data.VideoEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.Volume;
import com.taobao.android.litecreator.sdk.editor.data.a;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;
import com.taobao.android.litecreator.util.MarvelFrameIntervalHelper;
import com.taobao.android.litecreator.util.au;
import com.taobao.tao.Globals;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.hek;
import tb.hel;
import tb.hfa;
import tb.ioo;
import tb.kge;

/* loaded from: classes5.dex */
public class ao extends c implements ag, hek {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DELAY_MILLIS = 1000;
    private final ArrayList<ac> A;
    private boolean B;
    private List<Media> C;
    private boolean D;
    private String E;
    private boolean F;
    private boolean G;
    private boolean H;
    private float I;
    private float J;
    private long K;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<Filter> L;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<Cut> M;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<Music> N;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<Volume> O;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<Sticker> P;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<List<Paster>> Q;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<AiQuality> R;
    private a.InterfaceC0518a S;
    private com.taobao.android.litecreator.sdk.editor.data.a T;
    private boolean U;
    private Runnable V;
    private ioo W;
    private boolean X;
    private boolean Y;
    private ExportMonitor Z;

    /* renamed from: a  reason: collision with root package name */
    private String f13405a;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<Beauty> aa;
    private ap ab;
    private long b;
    private boolean c;
    private Media d;
    private boolean e;
    private Handler f;
    private View g;
    private Editor h;
    private MeEditor i;
    private Project j;
    private Viewer k;
    private boolean l;
    private String m;
    private int n;
    private String o;
    private String p;
    private String q;
    private String r;
    private long s;
    private long t;
    private ArrayList<String> u;
    private ArrayList<String> v;
    private String w;
    private List<ag.a> x;
    private ag.b y;
    private final ArrayList<ag.c> z;

    /* renamed from: com.taobao.android.litecreator.sdk.editor.ao$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass5 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ao aoVar = ao.this;
            ao.a(aoVar, ao.d(aoVar), false);
        }
    }

    static {
        kge.a(-773497985);
        kge.a(1913665611);
        kge.a(1285909452);
    }

    public static /* synthetic */ Object ipc$super(ao aoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.hek
    public hel G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hel) ipChange.ipc$dispatch("46faa849", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public ag y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ag) ipChange.ipc$dispatch("ff2400f6", new Object[]{this}) : this;
    }

    public static /* synthetic */ void a(ao aoVar, AiQuality aiQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a24d24d4", new Object[]{aoVar, aiQuality});
        } else {
            aoVar.b(aiQuality);
        }
    }

    public static /* synthetic */ void a(ao aoVar, Cut cut) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8cb8a9", new Object[]{aoVar, cut});
        } else {
            aoVar.b(cut);
        }
    }

    public static /* synthetic */ void a(ao aoVar, Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a591ce0d", new Object[]{aoVar, filter});
        } else {
            aoVar.b(filter);
        }
    }

    public static /* synthetic */ void a(ao aoVar, Music music) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdfa5126", new Object[]{aoVar, music});
        } else {
            aoVar.b(music);
        }
    }

    public static /* synthetic */ void a(ao aoVar, Sticker sticker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2205224e", new Object[]{aoVar, sticker});
        } else {
            aoVar.a(sticker);
        }
    }

    public static /* synthetic */ void a(ao aoVar, Volume volume) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b3f772b", new Object[]{aoVar, volume});
        } else {
            aoVar.b(volume);
        }
    }

    public static /* synthetic */ void a(ao aoVar, Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa94331", new Object[]{aoVar, beauty});
        } else {
            aoVar.b(beauty);
        }
    }

    public static /* synthetic */ void a(ao aoVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f6eca", new Object[]{aoVar, str});
        } else {
            aoVar.d(str);
        }
    }

    public static /* synthetic */ void a(ao aoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b63a14", new Object[]{aoVar, str, str2});
        } else {
            aoVar.a(str, str2);
        }
    }

    public static /* synthetic */ void a(ao aoVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233611f1", new Object[]{aoVar, list});
        } else {
            aoVar.e(list);
        }
    }

    public static /* synthetic */ boolean a(ao aoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39f18504", new Object[]{aoVar})).booleanValue() : aoVar.Y;
    }

    public static /* synthetic */ boolean a(ao aoVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e0af1d4e", new Object[]{aoVar, str, new Boolean(z)})).booleanValue() : aoVar.a(str, z);
    }

    public static /* synthetic */ boolean a(ao aoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43fcdd8", new Object[]{aoVar, new Boolean(z)})).booleanValue();
        }
        aoVar.Y = z;
        return z;
    }

    public static /* synthetic */ void b(ao aoVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef78db2", new Object[]{aoVar, list});
        } else {
            aoVar.c(list);
        }
    }

    public static /* synthetic */ boolean b(ao aoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7d7ca2c5", new Object[]{aoVar})).booleanValue() : aoVar.Z();
    }

    public static /* synthetic */ boolean b(ao aoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32186837", new Object[]{aoVar, new Boolean(z)})).booleanValue();
        }
        aoVar.B = z;
        return z;
    }

    public static /* synthetic */ void c(ao aoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c107c082", new Object[]{aoVar});
        } else {
            aoVar.O();
        }
    }

    public static /* synthetic */ boolean c(ao aoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ff10296", new Object[]{aoVar, new Boolean(z)})).booleanValue();
        }
        aoVar.D = z;
        return z;
    }

    public static /* synthetic */ String d(ao aoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("af2d04bd", new Object[]{aoVar}) : aoVar.R();
    }

    public static /* synthetic */ boolean e(ao aoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("481dfc08", new Object[]{aoVar})).booleanValue() : aoVar.B;
    }

    public static /* synthetic */ void f(ao aoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba919c5", new Object[]{aoVar});
        } else {
            aoVar.P();
        }
    }

    public static /* synthetic */ ag.b g(ao aoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ag.b) ipChange.ipc$dispatch("d94ca572", new Object[]{aoVar}) : aoVar.y;
    }

    public static /* synthetic */ boolean h(ao aoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("12bf554b", new Object[]{aoVar})).booleanValue() : aoVar.D;
    }

    public static /* synthetic */ Viewer i(ao aoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Viewer) ipChange.ipc$dispatch("b2ea498", new Object[]{aoVar}) : aoVar.k;
    }

    public static /* synthetic */ ArrayList j(ao aoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("39713623", new Object[]{aoVar}) : aoVar.A;
    }

    public static /* synthetic */ Handler k(ao aoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("4865cffc", new Object[]{aoVar}) : aoVar.f;
    }

    public static /* synthetic */ Runnable l(ao aoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("66d52769", new Object[]{aoVar}) : aoVar.V;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.android.litecreator.sdk.editor.data.Video, com.taobao.android.litecreator.sdk.editor.data.Media] */
    @Override // com.taobao.android.litecreator.sdk.editor.z
    public /* synthetic */ Video s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Media) ipChange.ipc$dispatch("6b44a363", new Object[]{this}) : I();
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            com.taobao.android.litecreator.util.u.b("VideoEditor", "run: mCheck=======reloadFilter() scene=" + str);
            W();
            b(a());
        }
    }

    public ao(Project project, List<Video> list, List<Media> list2, Media media, EditorInfo editorInfo, long j) {
        super(list, editorInfo);
        this.v = new ArrayList<>();
        this.z = new ArrayList<>();
        this.A = new ArrayList<>();
        this.E = "none";
        this.F = false;
        this.G = true;
        this.K = 0L;
        this.U = true;
        this.L = new com.taobao.android.litecreator.sdk.editor.data.base.d<Filter>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Filter> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.M = new com.taobao.android.litecreator.sdk.editor.data.base.d<Cut>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Cut> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.N = new com.taobao.android.litecreator.sdk.editor.data.base.d<Music>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Music> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.O = new com.taobao.android.litecreator.sdk.editor.data.base.d<Volume>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Volume> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.P = new com.taobao.android.litecreator.sdk.editor.data.base.d<Sticker>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Sticker> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.Q = new com.taobao.android.litecreator.sdk.editor.data.base.d<List<Paster>>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<List<Paster>> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.R = new com.taobao.android.litecreator.sdk.editor.data.base.d<AiQuality>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<AiQuality> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.aa = new com.taobao.android.litecreator.sdk.editor.data.base.d<Beauty>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Beauty> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.V = new Runnable() { // from class: com.taobao.android.litecreator.sdk.editor.ao.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                boolean b = ao.b(ao.this);
                com.taobao.android.litecreator.util.u.b("VideoEditor", "run: mCheck layoutOutsideOfMedia=" + b);
                if (ao.a(ao.this) != b) {
                    ao.a(ao.this, "layoutOutsideOfMedia");
                }
                ao.a(ao.this, b);
            }
        };
        this.Y = false;
        this.Z = new ExportMonitor() { // from class: com.taobao.android.litecreator.sdk.editor.ao.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onProgress(float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5ec8ea6d", new Object[]{this, new Float(f)});
                }
            }

            public void onStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                } else {
                    ao.c(ao.this);
                }
            }

            public void onComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                } else {
                    au.c(new Runnable() { // from class: com.taobao.android.litecreator.sdk.editor.ao.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (!ao.a(ao.this, ao.d(ao.this), ao.e(ao.this))) {
                            } else {
                                ao.b(ao.this, false);
                            }
                        }
                    });
                }
            }

            public void onError(String str, String str2, int i, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9c8c7f09", new Object[]{this, str, str2, new Integer(i), str3});
                } else {
                    ao.a(ao.this, str3, String.valueOf(i));
                }
            }

            public void onCancel() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("379d4540", new Object[]{this});
                } else {
                    ao.f(ao.this);
                }
            }
        };
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.K = j;
        if (editorInfo.resource != null) {
            this.c = true;
            this.f13405a = editorInfo.resource.type;
            if (!TextUtils.isEmpty(editorInfo.resource.draftPath)) {
                String str = editorInfo.resource.draftPath;
                this.c = false;
            } else {
                com.taobao.android.litecreator.util.n.a(Globals.getApplication(), "json");
            }
            if (project == null) {
                this.j = Marvel.createProject();
            } else {
                this.j = project;
            }
            this.h = this.j.getEditor();
            this.i = this.j.getMeEditor();
            this.k = this.j.getViewer();
            if (!this.c) {
                this.b = this.k.getDurationUs();
            }
            String str2 = "VideoEditor: mProjectTotalDurationUs " + this.b;
            this.f = new Handler(Looper.getMainLooper());
            this.j.setOnStatListener(new OnStatListener() { // from class: com.taobao.android.litecreator.sdk.editor.ao.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onStat(String str3, Map<String, String> map) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("2921a3e1", new Object[]{this, str3, map});
                    } else if (ao.g(ao.this) == null) {
                    } else {
                        ao.g(ao.this).a(str3, map);
                    }
                }
            });
            this.k.setOnFrameUpdateListener(new OnFrameUpdateListener() { // from class: com.taobao.android.litecreator.sdk.editor.ao.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onFrameUpdate() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("d6b6e23e", new Object[]{this});
                    } else {
                        au.c(new Runnable() { // from class: com.taobao.android.litecreator.sdk.editor.ao.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (ao.h(ao.this)) {
                                } else {
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    if (ao.g(ao.this) != null) {
                                        ao.g(ao.this).a(elapsedRealtime2);
                                    }
                                    ao.c(ao.this, true);
                                }
                            }
                        });
                    }
                }
            });
            if (this.c) {
                e(true);
            } else {
                for (Video video : q()) {
                    this.v.add(video.clipId);
                }
                U();
                if (media != null) {
                    this.d = media;
                    this.e = true;
                    this.u = new ArrayList<>();
                    this.u.add(media.clipId);
                } else {
                    this.e = false;
                    this.C = list2;
                }
            }
            boolean z = this.c;
            this.w = com.taobao.android.litecreator.util.n.a(Globals.getApplication(), ".json");
            Q();
            if (editorInfo.operation != null && editorInfo.operation.videoEditInfo != null) {
                a(editorInfo.operation.videoEditInfo);
            }
        }
        a(x());
    }

    private boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        List<ag.a> list = this.x;
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (ag.a aVar : this.x) {
            aVar.a(str, z);
        }
        return true;
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        List<ag.a> list = this.x;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<ag.a> it = this.x.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
            return;
        }
        List<ag.a> list = this.x;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<ag.a> it = this.x.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
            return;
        }
        List<ag.a> list = this.x;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<ag.a> it = this.x.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c5ab3d", new Object[]{this})).intValue();
        }
        MeEditor meEditor = this.i;
        if (meEditor == null) {
            return 0;
        }
        return meEditor.getCanvasWidth();
    }

    public int H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40c20c2", new Object[]{this})).intValue();
        }
        MeEditor meEditor = this.i;
        if (meEditor == null) {
            return 0;
        }
        return meEditor.getCanvasHeight();
    }

    public float a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c22", new Object[]{this, str})).floatValue();
        }
        MeEditor meEditor = this.i;
        if (meEditor == null) {
            return 0.0f;
        }
        return meEditor.getContentWidth(str);
    }

    public float b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e563", new Object[]{this, str})).floatValue();
        }
        MeEditor meEditor = this.i;
        if (meEditor == null) {
            return 0.0f;
        }
        return meEditor.getContentHeight(str);
    }

    private void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
            return;
        }
        DraftExporter draftExporter = new DraftExporter();
        draftExporter.setOutputPath(R());
        draftExporter.setMonitor(this.Z);
        this.j.export(draftExporter);
    }

    public ao(Video video, VideoEditInfo videoEditInfo) {
        super(video, videoEditInfo);
        this.v = new ArrayList<>();
        this.z = new ArrayList<>();
        this.A = new ArrayList<>();
        this.E = "none";
        this.F = false;
        this.G = true;
        this.K = 0L;
        this.U = true;
        this.L = new com.taobao.android.litecreator.sdk.editor.data.base.d<Filter>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Filter> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.M = new com.taobao.android.litecreator.sdk.editor.data.base.d<Cut>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Cut> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.N = new com.taobao.android.litecreator.sdk.editor.data.base.d<Music>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Music> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.O = new com.taobao.android.litecreator.sdk.editor.data.base.d<Volume>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Volume> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.P = new com.taobao.android.litecreator.sdk.editor.data.base.d<Sticker>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Sticker> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.Q = new com.taobao.android.litecreator.sdk.editor.data.base.d<List<Paster>>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<List<Paster>> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.R = new com.taobao.android.litecreator.sdk.editor.data.base.d<AiQuality>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<AiQuality> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.aa = new com.taobao.android.litecreator.sdk.editor.data.base.d<Beauty>() { // from class: com.taobao.android.litecreator.sdk.editor.ao.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Beauty> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ao.a(ao.this, bVar.a());
                }
            }
        };
        this.V = new Runnable() { // from class: com.taobao.android.litecreator.sdk.editor.ao.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                boolean b = ao.b(ao.this);
                com.taobao.android.litecreator.util.u.b("VideoEditor", "run: mCheck layoutOutsideOfMedia=" + b);
                if (ao.a(ao.this) != b) {
                    ao.a(ao.this, "layoutOutsideOfMedia");
                }
                ao.a(ao.this, b);
            }
        };
        this.Y = false;
        this.Z = new ExportMonitor() { // from class: com.taobao.android.litecreator.sdk.editor.ao.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onProgress(float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5ec8ea6d", new Object[]{this, new Float(f)});
                }
            }

            public void onStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                } else {
                    ao.c(ao.this);
                }
            }

            public void onComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                } else {
                    au.c(new Runnable() { // from class: com.taobao.android.litecreator.sdk.editor.ao.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (!ao.a(ao.this, ao.d(ao.this), ao.e(ao.this))) {
                            } else {
                                ao.b(ao.this, false);
                            }
                        }
                    });
                }
            }

            public void onError(String str, String str2, int i, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9c8c7f09", new Object[]{this, str, str2, new Integer(i), str3});
                } else {
                    ao.a(ao.this, str3, String.valueOf(i));
                }
            }

            public void onCancel() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("379d4540", new Object[]{this});
                } else {
                    ao.f(ao.this);
                }
            }
        };
        this.c = true;
        e(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Marvel/Draft/" + System.currentTimeMillis() + "/draft.json");
        a(x());
    }

    private String R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ce20f5e7", new Object[]{this}) : this.w;
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        this.j = Marvel.createProject(str);
        this.h = this.j.getEditor();
        this.i = this.j.getMeEditor();
        e(true);
        this.k = this.j.getViewer();
        this.f = new Handler(Looper.getMainLooper());
    }

    private void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
            return;
        }
        View view = this.g;
        if (!(view instanceof SurfaceView)) {
            com.taobao.android.litecreator.util.u.d("VideoEditor", "initViewer: mDisplayView is not SurfaceView!!!");
            return;
        }
        this.k.attachTo((SurfaceView) view);
        this.k.setOnPrepareListener(new OnPrepareListener() { // from class: com.taobao.android.litecreator.sdk.editor.ao.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onPrepared() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fc853dc3", new Object[]{this});
                }
            }
        });
        this.l = false;
        if (this.H) {
            MarvelFrameIntervalHelper.a(this.k, this.J, this.I, 0);
        }
        this.k.prepare();
        this.k.setOnCompleteListener(new OnCompleteListener() { // from class: com.taobao.android.litecreator.sdk.editor.ao.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                } else if (!ao.this.ak_() || ao.i(ao.this) == null) {
                } else {
                    ao.i(ao.this).seekTo(0L, Const.SeekFlag.SeekEnd);
                    ao.i(ao.this).start();
                }
            }
        });
        this.k.setOnProgressListener(new OnProgressListener() { // from class: com.taobao.android.litecreator.sdk.editor.ao.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void onProgress(final float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ec8ea6d", new Object[]{this, new Float(f)});
                } else if (ao.j(ao.this).size() <= 0) {
                } else {
                    ao.k(ao.this).post(new Runnable() { // from class: com.taobao.android.litecreator.sdk.editor.ao.8.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            Iterator it = ao.j(ao.this).iterator();
                            while (it.hasNext()) {
                                ac acVar = (ac) it.next();
                                if (acVar != null) {
                                    acVar.a(f);
                                }
                            }
                        }
                    });
                }
            }
        });
        this.i.transact();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public void a(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1901d4", new Object[]{this, new Boolean(z), new Float(f)});
            return;
        }
        this.H = z;
        this.I = f;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.J = f;
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.z
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.g = view;
        a(this.L);
        a(this.M);
        a(this.N);
        a(this.O);
        a(this.P);
        a(this.Q);
        a(this.R);
        a(this.aa);
        T();
        b(a());
        b(f());
        b(l());
        b(n());
        a(p());
        e(c());
        b(j());
        b(i());
        S();
    }

    private void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
            return;
        }
        this.S = new an(this) { // from class: com.taobao.android.litecreator.sdk.editor.ao.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass9 anonymousClass9, String str, Object... objArr) {
                if (str.hashCode() == 1734329099) {
                    super.j((String) objArr[0], (Paster) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // com.taobao.android.litecreator.sdk.editor.an
            public long a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : ao.this.x();
            }

            @Override // com.taobao.android.litecreator.sdk.editor.an, com.taobao.android.litecreator.sdk.editor.data.a.b, com.taobao.android.litecreator.sdk.editor.data.a.InterfaceC0518a
            public void j(String str, Paster paster) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("675fc30b", new Object[]{this, str, paster});
                    return;
                }
                super.j(str, paster);
                ao.k(ao.this).removeCallbacks(ao.l(ao.this));
                ao.k(ao.this).postDelayed(ao.l(ao.this), 1000L);
            }
        };
        this.T = new com.taobao.android.litecreator.sdk.editor.data.a();
        this.T.a(this.S);
    }

    private void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            c(q());
            String str = "initTrack: addMainClip cost=" + (System.currentTimeMillis() - currentTimeMillis) + " ";
        } else {
            View view = this.g;
            if (view == null) {
                return;
            }
            view.post(new Runnable() { // from class: com.taobao.android.litecreator.sdk.editor.ao.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ao aoVar = ao.this;
                    ao.b(aoVar, aoVar.q());
                }
            });
        }
    }

    private void c(List<? extends Media> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else if (list != null && list.size() > 0) {
            this.v.clear();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = true;
            for (Media media : list) {
                long j = media.sourceStartTimeUs;
                long j2 = media.sourceEndTimeUs;
                long j3 = media.durationMs * 1000;
                if (media.sourceEndTimeUs <= 0) {
                    j2 = j3;
                }
                String addMainClip = this.i.addMainClip(media.path, j < 0 ? 0L : j, j2 > j3 ? j3 : j2);
                media.clipId = addMainClip;
                this.v.add(addMainClip);
                if (TextUtils.isEmpty(addMainClip)) {
                    z = false;
                }
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            HashMap hashMap = new HashMap();
            hashMap.put("media_size", Integer.valueOf(list.size()));
            hfa.a("edit.video", "add_main_clips", elapsedRealtime2, z, hashMap);
            U();
            ah();
        }
    }

    private void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[]{this});
        } else if (this.W != null) {
        } else {
            this.W = new ioo();
            this.W.a(this.i);
        }
    }

    private void ah() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab55252e", new Object[]{this});
        } else if (this.ab != null) {
        } else {
            this.ab = new ap();
            this.ab.a(this.i, (TemplateEditor) null);
        }
    }

    private void f(String str) {
        BackgroundBlurType backgroundBlurType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else if (!V()) {
        } else {
            String str2 = this.E;
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != -1078030475) {
                if (hashCode != 107348) {
                    if (hashCode == 107876 && str2.equals("max")) {
                        c = 2;
                    }
                } else if (str2.equals("low")) {
                    c = 0;
                }
            } else if (str2.equals("medium")) {
                c = 1;
            }
            if (c == 0) {
                backgroundBlurType = BackgroundBlurType.kBlurLow;
            } else if (c == 1) {
                backgroundBlurType = BackgroundBlurType.kBlurMedium;
            } else if (c == 2) {
                backgroundBlurType = BackgroundBlurType.kBlurMax;
            } else {
                backgroundBlurType = BackgroundBlurType.kNone;
            }
            this.i.setCanvasBackground(str, backgroundBlurType);
        }
    }

    private boolean V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[]{this})).booleanValue() : com.taobao.android.litecreator.util.s.i();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.z
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        this.g = null;
        b(this.L);
        b(this.M);
        b(this.N);
        b(this.O);
        b(this.P);
        b(this.Q);
        b(this.R);
        b(this.aa);
    }

    public Video I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Video) ipChange.ipc$dispatch("5bf2c696", new Object[]{this}) : g();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.c, com.taobao.android.litecreator.sdk.editor.z
    public List<Video> v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("62bc9eaa", new Object[]{this}) : q();
    }

    private void b(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b47d04", new Object[]{this, filter});
        } else if (filter == null) {
            W();
        } else if (filter.srcDirPath != null && this.i != null && filter.isVisibilityChange()) {
            Iterator<String> it = this.v.iterator();
            while (it.hasNext()) {
                this.i.setLookupVisibility(it.next(), filter.visibilityValue == 1);
            }
            filter.resetVisibility();
        } else if (X()) {
            e(filter);
        } else {
            c(filter);
        }
    }

    private void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
            return;
        }
        aa();
        ab();
    }

    private boolean X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[]{this})).booleanValue() : g(this.f13405a) && Y() && !Z();
    }

    private boolean Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fbb064", new Object[]{this})).booleanValue() : this.G;
    }

    private boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[]{this})).booleanValue();
        }
        List<Paster> c = c();
        if (c == null) {
            return false;
        }
        for (Paster paster : c) {
            if (com.taobao.android.litecreator.util.ad.a(paster, this)) {
                return true;
            }
        }
        return false;
    }

    private void c(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b84863", new Object[]{this, filter});
        } else if (filter.srcDirPath == null || this.i == null) {
        } else {
            if (d(filter)) {
                if (!TextUtils.isEmpty(this.m)) {
                    this.i.deleteClip(this.m);
                }
                this.m = this.i.addLookupClip("", filter.srcDirPath, 0L, x());
            }
            this.n = filter.filterId;
            this.i.setLookupIntensity(this.m, filter.level / 100.0f);
        }
    }

    private boolean d(Filter filter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8dbc13c6", new Object[]{this, filter})).booleanValue() : filter.filterId != this.n;
    }

    private void aa() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf280a7", new Object[]{this});
            return;
        }
        MeEditor meEditor = this.i;
        if (meEditor == null || (str = this.m) == null) {
            return;
        }
        meEditor.deleteClip(str);
        this.n = -1;
        this.m = "";
    }

    private void e(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93bfdf21", new Object[]{this, filter});
        } else if (filter.srcDirPath == null || this.i == null) {
        } else {
            if (d(filter)) {
                Iterator<String> it = this.v.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    this.i.removeLookup(next);
                    this.i.setLookupPath(next, filter.srcDirPath);
                }
            }
            this.n = filter.filterId;
            float f = filter.level / 100.0f;
            Iterator<String> it2 = this.v.iterator();
            while (it2.hasNext()) {
                this.i.setLookupIntensity(it2.next(), f);
            }
        }
    }

    private void ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab009828", new Object[]{this});
        } else if (this.i == null || this.v.size() <= 0) {
        } else {
            Iterator<String> it = this.v.iterator();
            while (it.hasNext()) {
                this.i.removeLookup(it.next());
            }
            this.n = -1;
        }
    }

    private void b(Cut cut) {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9e4512", new Object[]{this, cut});
        } else if (this.i == null) {
        } else {
            if (cut == null) {
                j2 = x();
                j = 0;
            } else {
                j = cut.startTime;
                j2 = cut.endTime;
            }
            long max = Math.max(0L, j);
            long min = Math.min(x(), j2);
            if (!g(this.f13405a) && (!this.F || !ad())) {
                if (com.taobao.android.litecreator.util.s.f() && !this.c) {
                    b(max, min);
                } else {
                    a(max, min);
                }
            }
            c(cut);
        }
    }

    private void a(long j, long j2) {
        long j3 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j3), new Long(j2)});
            return;
        }
        List<Video> q = q();
        if (q == null || q.size() <= 0) {
            return;
        }
        int i = -1;
        long j4 = 0;
        long j5 = 0;
        int i2 = 0;
        int i3 = -1;
        for (Video video : q) {
            long j6 = video.durationMs * 1000;
            j5 += j6;
            if (j3 > j5) {
                this.i.setSourceStartTimeUs(this.v.get(i2), 0L);
                this.i.setSourceEndTimeUs(this.v.get(i2), j6);
            } else if (i3 == i) {
                if (i2 > 0) {
                    for (int i4 = 0; i4 < i2; i4++) {
                        this.i.setSourceStartTimeUs(this.v.get(i4), j4);
                        this.i.setSourceEndTimeUs(this.v.get(i4), j4);
                    }
                }
                this.i.setSourceStartTimeUs(this.v.get(i2), j6 - (j5 - j3));
                this.i.setSourceEndTimeUs(this.v.get(i2), j6);
                i3 = i2;
            }
            if (j2 <= j5) {
                this.i.setSourceEndTimeUs(this.v.get(i2), j6 - (j5 - j2));
                for (int i5 = i2 + 1; i5 < this.v.size(); i5++) {
                    this.i.setSourceStartTimeUs(this.v.get(i5), 0L);
                    this.i.setSourceEndTimeUs(this.v.get(i5), 0L);
                }
                return;
            }
            j4 = 0;
            this.i.setSourceEndTimeUs(this.v.get(i2), j6);
            i2++;
            j3 = j;
            i = -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
        if (r14 > r28) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(long r26, long r28) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.litecreator.sdk.editor.ao.b(long, long):void");
    }

    private Size ac() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("ee77916c", new Object[]{this});
        }
        Video g = g();
        int displayWidth = g.getDisplayWidth();
        int displayHeight = g.getDisplayHeight();
        if (!this.U) {
            return new Size(displayWidth, displayHeight);
        }
        if (displayWidth / displayHeight >= 0.5625f) {
            if (displayWidth > com.taobao.android.litecreator.util.s.d()) {
                z = true;
            }
            displayWidth = z ? 1080 : 720;
            displayHeight = z ? 1920 : 1280;
        }
        return new Size(displayWidth, displayHeight);
    }

    private void c(Cut cut) {
        Size ac;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2324e13", new Object[]{this, cut});
            return;
        }
        boolean z = this.G;
        if (g(this.f13405a)) {
            ac = d(q());
        } else {
            ac = ac();
            this.G = true;
        }
        if (cut != null && cut.canvas != null) {
            Canvas canvas = cut.canvas;
            canvas.width = ac.getWidth();
            canvas.height = ac.getHeight();
            this.i.setCanvasSize((int) canvas.width, (int) canvas.height);
            if (this.c) {
                this.i.setCanvasScaleType(ScaleType.kCenterInside);
            }
            Iterator<String> it = this.v.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (TextUtils.isEmpty(canvas.bgPath)) {
                    this.i.setCanvasBackground(next, canvas.bgColor);
                } else if (com.taobao.android.litecreator.util.k.a(canvas.bgPath)) {
                    this.i.setCanvasBackground(next, canvas.bgPath);
                }
                this.i.setPosition(next, canvas.xPosition, canvas.yPosition);
            }
        } else {
            if (g(this.f13405a)) {
                c(Y() ? "none" : "max");
            }
            this.i.setCanvasSize(ac.getWidth(), ac.getHeight());
            if (this.c) {
                this.i.setCanvasScaleType(ScaleType.kCenterInside);
            }
        }
        if (!f(z)) {
            return;
        }
        d("lastResolutionSame");
    }

    private boolean f(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0aa0e8b", new Object[]{this, new Boolean(z)})).booleanValue() : z != this.G;
    }

    private Size d(List<Video> list) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("8147e4df", new Object[]{this, list});
        }
        int i = 720;
        Size size = new Size(720, 1280);
        if (list == null || list.size() == 0) {
            hfa.a("Video.Editor", "mul_canvas_size_invalid", "mainMediaResList == null or size == 0", null);
            return size;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        for (Video video : list) {
            if (video == null || video.getDisplayHeight() == 0) {
                com.taobao.android.litecreator.util.u.d("VideoEditor", "video == null || video.getDisplayHeight() == 0, " + video);
                hfa.a("Video.Editor", "mul_canvas_size_invalid", "video == null or video.getDisplayHeight() == 0", null);
            } else {
                int displayHeight = video.getDisplayHeight();
                float displayWidth = video.getDisplayWidth() / displayHeight;
                if (displayHeight > i2) {
                    i3 = video.getDisplayWidth();
                    i2 = displayHeight;
                }
                arrayList.add(Float.valueOf(displayWidth));
            }
        }
        if (arrayList.size() <= 0) {
            return size;
        }
        Collections.sort(arrayList);
        Float f = (Float) arrayList.get(0);
        this.G = f.compareTo((Float) arrayList.get(arrayList.size() - 1)) == 0;
        if (f.compareTo(Float.valueOf(0.5625f)) >= 0) {
            if (i3 <= com.taobao.android.litecreator.util.s.d()) {
                z = false;
            }
            if (z) {
                i = 1080;
            }
            i2 = z ? 1920 : 1280;
        } else if (i3 < 720) {
            i2 = (int) (720 / f.floatValue());
        } else {
            i = (int) (i2 * f.floatValue());
        }
        return new Size(i, i2);
    }

    private static boolean g(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{str})).booleanValue() : TextUtils.equals(str, Resource.TYPE_DEFAULT_MULTI) || TextUtils.equals(str, Resource.TYPE_RECORD_MULTI);
    }

    private boolean ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[]{this})).booleanValue() : com.taobao.android.litecreator.base.workflow.e.a(this.f13405a);
    }

    private void ae() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2adeab", new Object[]{this});
            return;
        }
        Iterator<ag.c> it = this.z.iterator();
        while (it.hasNext()) {
            it.next().a(this.l);
        }
    }

    private void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
            return;
        }
        Iterator<ag.c> it = this.z.iterator();
        while (it.hasNext()) {
            it.next().a(f);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        MeEditor meEditor = this.i;
        if (meEditor == null) {
            return;
        }
        meEditor.setCanvasSize(i, i2);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public Size w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("3dc06801", new Object[]{this});
        }
        MeEditor meEditor = this.i;
        if (meEditor == null) {
            return null;
        }
        return new Size(meEditor.getCanvasWidth(), this.i.getCanvasHeight());
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.U = z;
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ag
    public void ah_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c204b19f", new Object[]{this});
            return;
        }
        Viewer viewer = this.k;
        if (viewer == null) {
            return;
        }
        long j = this.K;
        if (j > 0) {
            viewer.seekTo(j, Const.SeekFlag.SeekGoing);
        }
        this.k.start();
        this.l = true;
        ae();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ag
    public void ai_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b98a3e", new Object[]{this});
            return;
        }
        Viewer viewer = this.k;
        if (viewer == null) {
            return;
        }
        viewer.seekTo(this.K, Const.SeekFlag.SeekGoing);
        this.K = 0L;
        this.k.start();
        this.l = true;
        ae();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ag
    public void aj_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c56e62dd", new Object[]{this});
            return;
        }
        Viewer viewer = this.k;
        if (viewer == null) {
            return;
        }
        viewer.pause();
        this.l = false;
        ae();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ag
    public boolean ak_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c7233b80", new Object[]{this})).booleanValue() : this.l;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ag
    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            a(f, Const.SeekFlag.SeekGoing);
        }
    }

    public void a(float f, Const.SeekFlag seekFlag) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8abf35", new Object[]{this, new Float(f), seekFlag});
        } else if (this.k == null) {
        } else {
            Cut f2 = f();
            if (f2 == null) {
                this.k.seekTo(((float) x()) * f, seekFlag);
            } else {
                this.k.seekTo(((float) (f2.endTime - f2.startTime)) * f, seekFlag);
            }
            c(f);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ag
    public void a(ag.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d360e9", new Object[]{this, cVar});
        } else if (cVar == null || this.z.contains(cVar)) {
        } else {
            this.z.add(cVar);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ag
    public void b(ag.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e126a", new Object[]{this, cVar});
        } else {
            this.z.remove(cVar);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ag
    public void a(ac acVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ec108c", new Object[]{this, acVar});
        } else if (acVar == null || this.A.contains(acVar)) {
        } else {
            this.A.add(acVar);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ag
    public void b(ac acVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d772e4d", new Object[]{this, acVar});
        } else {
            this.A.remove(acVar);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        Viewer viewer = this.k;
        if (viewer != null) {
            viewer.stop();
            this.k.destroy();
        }
        Editor editor = this.h;
        if (editor != null) {
            editor.destroy();
        }
        final Project project = this.j;
        if (project != null) {
            au.b(new Runnable() { // from class: com.taobao.android.litecreator.sdk.editor.ao.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        project.destroy();
                    }
                }
            });
        }
        this.h = null;
        this.k = null;
        this.j = null;
        this.i = null;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public void b(Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85dd1930", new Object[]{this, media});
            return;
        }
        com.taobao.android.litecreator.util.ad.a(this.i, media.clipId, media.subClipId, media.clipExtendInfo, media.path, media.sourceStartTimeUs, media.sourceEndTimeUs);
    }

    private void af() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab38f62c", new Object[]{this});
            return;
        }
        Cut f = f();
        if (f == null) {
            f = new Cut();
        }
        f.startTime = 0L;
        f.endTime = x();
        a(f);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public void b(List<Video> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        Iterator<String> it = this.v.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!TextUtils.isEmpty(next)) {
                this.i.deleteClip(next);
            }
        }
        q().clear();
        q().addAll(list);
        c(list);
        af();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public void a(MediaClips mediaClips) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57088f9e", new Object[]{this, mediaClips});
        } else if (!(h() instanceof VideoEditInfo)) {
        } else {
            h().mediaClips = mediaClips;
        }
    }

    public Project J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Project) ipChange.ipc$dispatch("1e47778a", new Object[]{this}) : this.j;
    }

    public MeEditor K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MeEditor) ipChange.ipc$dispatch("6d7fe16f", new Object[]{this}) : this.i;
    }

    public Rect L() {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("3b921fdc", new Object[]{this});
        }
        ArrayList<String> arrayList = this.v;
        if (arrayList != null && arrayList.size() > 0) {
            String str = this.v.get(0);
            int width = this.g.getWidth();
            int height = this.g.getHeight();
            int canvasWidth = this.i.getCanvasWidth();
            int canvasHeight = this.i.getCanvasHeight();
            float contentWidth = this.i.getContentWidth(str);
            float contentHeight = this.i.getContentHeight(str);
            float positionX = this.i.getPositionX(str);
            float positionY = this.i.getPositionY(str);
            float f = canvasWidth;
            int i2 = (int) ((width * canvasHeight) / f);
            float f2 = canvasHeight;
            float f3 = height;
            if (f / f2 < width / f3) {
                i = (int) ((f3 * f) / f2);
                i2 = height;
            } else {
                i = width;
                z = false;
            }
            float f4 = i;
            int i3 = (int) (contentWidth * f4);
            float f5 = i2;
            int i4 = (int) (contentHeight * f5);
            int i5 = (int) (((height - i4) / 2.0f) + (f5 * positionY));
            int i6 = (int) (f4 * positionX);
            if (z) {
                i6 = (int) (i6 + ((width - i) / 2.0f));
            }
            Rect rect = new Rect(i6, i5, i3 + i6, i4 + i5);
            rect.offset(this.g.getLeft(), this.g.getTop());
            return rect;
        }
        return new Rect();
    }

    public int M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4529647", new Object[]{this})).intValue();
        }
        int width = this.g.getWidth();
        int height = this.g.getHeight();
        int canvasWidth = this.i.getCanvasWidth();
        int canvasHeight = this.i.getCanvasHeight();
        if (canvasHeight == 0 || height == 0) {
            return 0;
        }
        float f = canvasWidth;
        float f2 = height;
        if (f / canvasHeight < width / f2) {
            return this.g.getTop();
        }
        return this.g.getTop() + ((int) ((f2 - ((width * canvasHeight) / f)) / 2.0f));
    }

    public Rect N() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("ae34415e", new Object[]{this});
        }
        int width = this.g.getWidth();
        int height = this.g.getHeight();
        int canvasWidth = this.i.getCanvasWidth();
        int canvasHeight = this.i.getCanvasHeight();
        if (canvasWidth == 0) {
            return new Rect();
        }
        Rect rect = new Rect();
        this.g.getHitRect(rect);
        float f = canvasWidth;
        int i4 = (int) ((width * canvasHeight) / f);
        int i5 = (int) ((height - i4) / 2.0f);
        float f2 = canvasHeight;
        float f3 = height;
        if (f / f2 < width / f3) {
            i = (int) ((f3 * f) / f2);
            i2 = (int) ((width - i) / 2.0f);
        } else {
            i = width;
            height = i4;
            i3 = i5;
            i2 = 0;
        }
        Rect rect2 = new Rect(i2, i3, i + i2, height + i3);
        rect2.offset(rect.left, rect.top);
        return rect2;
    }

    private void b(Music music) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edda674f", new Object[]{this, music});
        } else if (this.e) {
            String str = this.u.get(0);
            if (music != null && !TextUtils.isEmpty(music.musicId)) {
                music.musicClipId = str;
                long j = music.startClipTime * 1000;
                this.i.changeClipRes(str, music.path, j, j + (this.d.durationMs * 1000));
            } else {
                this.i.changeClipRes(str, "", 0L, 0L);
            }
            h().isInputMusic = true;
        } else if (music != null && !TextUtils.isEmpty(music.uniqueId())) {
            if (!music.uniqueId().equalsIgnoreCase(this.r)) {
                ag();
                c(music);
            } else if (d(music)) {
                ag();
                c(music);
            }
            this.r = music.uniqueId();
        } else {
            ag();
        }
    }

    private void c(Music music) {
        int i;
        long j;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe903410", new Object[]{this, music});
        } else if (music == null) {
        } else {
            long j2 = music.startClipTime * 1000;
            long j3 = music.endClipTime * 1000;
            this.s = j2;
            this.t = j3;
            this.u = new ArrayList<>();
            long x = x() / 1000;
            Cut f = f();
            if (f != null) {
                x = f.getDuration() / 1000;
            }
            if (music.cutDuration > 0 && x > 0 && music.cutDuration < x) {
                int ceil = (int) Math.ceil(((float) x) / ((float) music.cutDuration));
                while (i2 < ceil) {
                    long j4 = music.cutDuration * 1000 * i2;
                    if (i2 == 0) {
                        i = ceil;
                        j = j3;
                        String addMusicClip = this.i.addMusicClip("", music.path, j4, j2, j3);
                        this.q = this.i.getClipParentId(addMusicClip);
                        this.u.add(addMusicClip);
                    } else {
                        i = ceil;
                        j = j3;
                        this.u.add(this.i.addMusicClip(this.q, music.path, j4, j2, j3));
                    }
                    i2++;
                    ceil = i;
                    j3 = j;
                }
                return;
            }
            String addMusicClip2 = this.i.addMusicClip("", music.path, 0L, j2, j3);
            this.q = this.i.getClipParentId(addMusicClip2);
            this.u.add(addMusicClip2);
        }
    }

    private boolean d(Music music) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f4600d5", new Object[]{this, music})).booleanValue() : (this.s == music.startClipTime && this.t == music.endClipTime) ? false : true;
    }

    private void ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab470dad", new Object[]{this});
            return;
        }
        ArrayList<String> arrayList = this.u;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                Iterator<String> it = this.u.iterator();
                while (it.hasNext()) {
                    this.i.deleteClip(it.next());
                }
            }
            this.u.clear();
        }
        this.r = "";
    }

    private void b(Volume volume) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37622622", new Object[]{this, volume});
        } else if (volume != null) {
            ArrayList<String> arrayList = this.v;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<String> it = this.v.iterator();
                while (it.hasNext()) {
                    this.i.setClipVolume(it.next(), volume.originVolume * volume.originScaleValue);
                }
            }
            List<Media> list = this.C;
            if (list != null && list.size() > 0) {
                for (Media media : this.C) {
                    if (media != null) {
                        this.i.setClipVolume(media.clipId, volume.originVolume);
                    }
                }
            }
            ArrayList<String> arrayList2 = this.u;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                return;
            }
            Iterator<String> it2 = this.u.iterator();
            while (it2.hasNext()) {
                this.i.setClipVolume(it2.next(), volume.musicVolume);
            }
        }
    }

    private void a(Sticker sticker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2b1b6", new Object[]{this, sticker});
        } else if (sticker != null) {
            if (!new File(sticker.path).exists() || sticker.resId.equalsIgnoreCase(this.p)) {
                return;
            }
            MeEditor meEditor = this.i;
            if (meEditor != null) {
                String str = this.o;
                if (str != null) {
                    meEditor.deleteClip(str);
                    this.o = null;
                    this.p = "";
                }
                this.o = this.i.addExtensionClip("", sticker.path, 0L, x(), "RaceSticker", SourceType.kSourceTexture, 0L);
            }
            this.p = sticker.resId;
        } else {
            String str2 = this.o;
            if (str2 == null) {
                return;
            }
            this.i.deleteClip(str2);
            this.o = null;
            this.p = "";
        }
    }

    private void e(List<Paster> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f968ff5d", new Object[]{this, list});
        } else if (this.i == null || list == null) {
        } else {
            this.T.a(list);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public long x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b088f3", new Object[]{this})).longValue();
        }
        if (!this.c) {
            return this.b;
        }
        long j = 0;
        if (q() != null && q().size() > 0) {
            long j2 = 0;
            for (Video video : q()) {
                if (video.clipEndTimeUs > 0 && video.clipEndTimeUs - video.clipStartTimeUs < video.durationMs * 1000) {
                    j2 += (video.clipEndTimeUs - video.clipStartTimeUs) / 1000;
                } else {
                    j2 += video.durationMs;
                }
            }
            j = j2;
        }
        return j * 1000;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ag
    public void a(ag.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d2782b", new Object[]{this, aVar});
            return;
        }
        if (this.x == null) {
            this.x = new ArrayList();
        }
        this.x.add(aVar);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ag
    public void a(ag.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d2ec8a", new Object[]{this, bVar});
        } else {
            this.y = bVar;
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.i.forbidNotify(z);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        this.E = str;
        if (q() == null) {
            return;
        }
        for (Video video : q()) {
            f(video.clipId);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public void c(Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9692e5f1", new Object[]{this, media});
        } else if (media == null) {
        } else {
            String str = media.clipId;
            if (!this.v.contains(str)) {
                return;
            }
            this.i.setSourceStartTimeUs(str, media.sourceStartTimeUs);
            this.i.setSourceEndTimeUs(str, media.sourceEndTimeUs);
            media.clipStartTimeUs = this.i.getClipStartTimeUs(str);
            media.clipEndTimeUs = this.i.getClipEndTimeUs(str);
            media.clipDurationMs = media.clipEndTimeUs - media.clipStartTimeUs;
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : Y();
    }

    private void b(AiQuality aiQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73fe7d", new Object[]{this, aiQuality});
            return;
        }
        ioo iooVar = this.W;
        if (iooVar == null) {
            return;
        }
        iooVar.a(aiQuality, this.v);
    }

    private void b(Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480569a", new Object[]{this, beauty});
            return;
        }
        ap apVar = this.ab;
        if (apVar == null) {
            return;
        }
        apVar.a(beauty, this.v);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.X = z;
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.af
    public boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue() : this.X;
    }

    @Override // tb.hek
    public Project D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Project) ipChange.ipc$dispatch("ed25f850", new Object[]{this}) : this.j;
    }

    @Override // tb.hek
    public MeEditor E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MeEditor) ipChange.ipc$dispatch("7a717969", new Object[]{this}) : this.i;
    }

    @Override // tb.hek
    public Viewer F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Viewer) ipChange.ipc$dispatch("4634871d", new Object[]{this}) : this.k;
    }
}
