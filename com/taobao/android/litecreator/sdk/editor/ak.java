package com.taobao.android.litecreator.sdk.editor;

import android.content.res.Resources;
import android.graphics.Rect;
import mtopsdk.common.util.StringUtils;
import android.util.Size;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.alibaba.marvel.Const;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.TemplateEditor;
import com.alibaba.marvel.Viewer;
import com.alibaba.marvel.java.OnFirstFrameListener;
import com.alibaba.marvel.java.ResourceInspector;
import com.alibaba.marvel.java.ScaleType;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.ImageBean;
import com.taobao.android.litecreator.sdk.editor.ag;
import com.taobao.android.litecreator.sdk.editor.data.Adjust;
import com.taobao.android.litecreator.sdk.editor.data.AiQuality;
import com.taobao.android.litecreator.sdk.editor.data.Crop;
import com.taobao.android.litecreator.sdk.editor.data.Filter;
import com.taobao.android.litecreator.sdk.editor.data.Image;
import com.taobao.android.litecreator.sdk.editor.data.ImageEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.Music;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.litecreator.sdk.editor.data.TemplateInfo;
import com.taobao.android.litecreator.sdk.editor.data.Transform;
import com.taobao.android.litecreator.sdk.editor.data.a;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.hek;
import tb.hel;
import tb.ioo;
import tb.kge;
import tb.mxy;

/* loaded from: classes5.dex */
public class ak extends a implements hek {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long IMAGE_CLIP_DURATION_US = 3000000;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<List<Paster>> A;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<Music> B;
    private String C;
    private int D;
    private ioo E;
    private ArrayList<String> F;
    private a.InterfaceC0518a G;
    private com.taobao.android.litecreator.sdk.editor.data.a H;
    private TemplateEditor I;
    private boolean J;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<Beauty> L;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<Adjust> M;
    private ap N;
    private mxy O;
    private ResourceInspector P;
    private Project Q;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<TemplateInfo> R;
    private final Size p;
    private SurfaceView q;
    private hel r;
    private Project s;
    private MeEditor t;
    private Viewer u;
    private Rect v;
    private ag.b w;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<Filter> x;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<Crop> y;
    private com.taobao.android.litecreator.sdk.editor.data.base.d<AiQuality> z;

    static {
        kge.a(1330919227);
        kge.a(1285909452);
    }

    public static /* synthetic */ Object ipc$super(ak akVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1736390785) {
            if (hashCode != 75291863) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.P();
            return null;
        }
        return super.h();
    }

    public static /* synthetic */ ag.b a(ak akVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ag.b) ipChange.ipc$dispatch("200465b4", new Object[]{akVar}) : akVar.w;
    }

    public static /* synthetic */ void a(ak akVar, Adjust adjust) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead2392", new Object[]{akVar, adjust});
        } else {
            akVar.b(adjust);
        }
    }

    public static /* synthetic */ void a(ak akVar, AiQuality aiQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51536658", new Object[]{akVar, aiQuality});
        } else {
            akVar.b(aiQuality);
        }
    }

    public static /* synthetic */ void a(ak akVar, Crop crop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d8f31", new Object[]{akVar, crop});
        } else {
            akVar.b(crop);
        }
    }

    public static /* synthetic */ void a(ak akVar, Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ba9b09", new Object[]{akVar, filter});
        } else {
            akVar.b(filter);
        }
    }

    public static /* synthetic */ void a(ak akVar, Music music) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a45f4aa", new Object[]{akVar, music});
        } else {
            akVar.b(music);
        }
    }

    public static /* synthetic */ void a(ak akVar, TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaafed79", new Object[]{akVar, templateInfo});
        } else {
            akVar.b(templateInfo);
        }
    }

    public static /* synthetic */ void a(ak akVar, Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("112533b5", new Object[]{akVar, beauty});
        } else {
            akVar.b(beauty);
        }
    }

    public static /* synthetic */ void a(ak akVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84aeb875", new Object[]{akVar, list});
        } else {
            akVar.b(list);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.a, com.taobao.android.litecreator.sdk.editor.x, com.taobao.android.litecreator.sdk.editor.z
    public /* synthetic */ AbsEditInfo r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsEditInfo) ipChange.ipc$dispatch("ab5ad8e9", new Object[]{this}) : h();
    }

    public ak(hel helVar, ai aiVar, Image image, ImageEditInfo imageEditInfo) {
        this(helVar, aiVar, image, null, imageEditInfo);
    }

    public ak(hel helVar, Image image, Size size, ImageEditInfo imageEditInfo) {
        this(helVar, null, image, size, imageEditInfo);
    }

    public ak(hel helVar, ai aiVar, Image image, Size size, ImageEditInfo imageEditInfo) {
        super(aiVar, image, imageEditInfo);
        this.v = new Rect();
        this.x = new com.taobao.android.litecreator.sdk.editor.data.base.d<Filter>() { // from class: com.taobao.android.litecreator.sdk.editor.ak.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Filter> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ak.a(ak.this, bVar.a());
                }
            }
        };
        this.y = new com.taobao.android.litecreator.sdk.editor.data.base.d<Crop>() { // from class: com.taobao.android.litecreator.sdk.editor.ak.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Crop> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ak.a(ak.this, bVar.a());
                }
            }
        };
        this.z = new com.taobao.android.litecreator.sdk.editor.data.base.d<AiQuality>() { // from class: com.taobao.android.litecreator.sdk.editor.ak.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<AiQuality> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ak.a(ak.this, bVar.a());
                }
            }
        };
        this.A = new com.taobao.android.litecreator.sdk.editor.data.base.d<List<Paster>>() { // from class: com.taobao.android.litecreator.sdk.editor.ak.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<List<Paster>> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ak.a(ak.this, bVar.a());
                }
            }
        };
        this.B = new com.taobao.android.litecreator.sdk.editor.data.base.d<Music>() { // from class: com.taobao.android.litecreator.sdk.editor.ak.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Music> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ak.a(ak.this, bVar.a());
                }
            }
        };
        this.L = new com.taobao.android.litecreator.sdk.editor.data.base.d<Beauty>() { // from class: com.taobao.android.litecreator.sdk.editor.ak.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Beauty> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ak.a(ak.this, bVar.a());
                }
            }
        };
        this.M = new com.taobao.android.litecreator.sdk.editor.data.base.d<Adjust>() { // from class: com.taobao.android.litecreator.sdk.editor.ak.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<Adjust> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ak.a(ak.this, bVar.a());
                }
            }
        };
        this.R = new com.taobao.android.litecreator.sdk.editor.data.base.d<TemplateInfo>() { // from class: com.taobao.android.litecreator.sdk.editor.ak.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.data.base.d
            public void a(com.taobao.android.litecreator.sdk.editor.data.base.b<TemplateInfo> bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9d62119", new Object[]{this, bVar});
                } else {
                    ak.a(ak.this, bVar.a());
                }
            }
        };
        this.F = new ArrayList<>();
        this.G = null;
        this.H = null;
        this.P = new ResourceInspector() { // from class: com.taobao.android.litecreator.sdk.editor.ak.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public ResourceInspector.Ret onResourceInspect(Map<String, String> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ResourceInspector.Ret) ipChange.ipc$dispatch("bea897c0", new Object[]{this, map});
                }
                com.taobao.android.litecreator.modules.template.c.a(map);
                return ResourceInspector.Ret.Pass;
            }
        };
        this.r = helVar;
        this.p = size;
        this.s = this.r.a();
        this.G = new an(this) { // from class: com.taobao.android.litecreator.sdk.editor.ak.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.editor.an
            public long a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : ak.IMAGE_CLIP_DURATION_US;
            }
        };
        this.H = new com.taobao.android.litecreator.sdk.editor.data.a(this.G);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.z
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.q = (SurfaceView) view;
        a(this.x);
        a(this.y);
        a(this.z);
        a(this.A);
        a(this.B);
        a(this.L);
        a(this.M);
        a(this.R);
        w();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.z
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        this.q = null;
        b(this.x);
        b(this.y);
        b(this.z);
        b(this.A);
        b(this.B);
        b(this.L);
        b(this.M);
        b(this.R);
        B();
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        x();
        y();
        z();
        C();
        A();
        K();
        S();
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else if (this.J || this.o == null) {
        } else {
            this.s.load(this.o.draftPath, this.P);
            this.I = new TemplateEditor(this.s.getApp());
            this.I.setProject(this.s);
            if (this.o.metaJsonPath != null) {
                File file = new File(this.o.metaJsonPath);
                if (file.exists()) {
                    this.s.loadTemplateMetaInfo(file.getPath());
                }
            }
            this.J = true;
        }
    }

    private void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
        } else if (this.o == null || !StringUtils.equals(this.o.resourceType, Resource.TYPE_TEMPLATE_TEXT_IMAGE)) {
        } else {
            T();
            g().width = this.t.getCanvasWidth();
            g().height = this.t.getCanvasHeight();
        }
    }

    private void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
        } else if (this.o == null) {
        } else {
            this.I.setTemplateTextVariable("editable_text", this.o.templateContent);
            this.I.applyTemplateTextVariable();
        }
    }

    private void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        Viewer viewer = this.u;
        if (viewer == null) {
            return;
        }
        viewer.prepare();
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        MeEditor meEditor = this.t;
        if (meEditor != null) {
            meEditor.getCoreEditor().setProject(this.s);
            return;
        }
        this.t = this.r.b();
        this.t.getCoreEditor().setProject(this.s);
        this.t.transact();
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else if (this.q == null) {
        } else {
            Viewer viewer = this.u;
            if (viewer != null) {
                viewer.setProject(this.s);
                return;
            }
            this.u = this.r.c();
            this.u.setProject(this.s);
            this.u.attachTo(this.q);
            this.u.setFrameInterval(16);
            this.u.setOnFirstFrameListener(new OnFirstFrameListener() { // from class: com.taobao.android.litecreator.sdk.editor.ak.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onDraw() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("73be92ca", new Object[]{this});
                    } else if (ak.a(ak.this) == null) {
                    } else {
                        ak.a(ak.this).a(-1L);
                    }
                }
            });
        }
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        if (!q()) {
            com.taobao.android.litecreator.util.u.d("ImageEditorV2", "restoreEditInfoIfNeed: main clip------> ");
            if (this.F.size() > 0) {
                return;
            }
            Size J = J();
            String addMainClip = this.t.addMainClip(g().path, 0L, (long) IMAGE_CLIP_DURATION_US);
            this.t.setCanvasSize(J.getWidth(), J.getHeight());
            this.t.setCanvasScaleType(ScaleType.kCenterCrop);
            com.taobao.android.litecreator.util.u.d("ImageEditorV2", "restoreEditInfoIfNeed: setCanvasSize " + J.getWidth() + " " + J.getHeight());
            this.F.add(addMainClip);
        }
        if (this.J) {
            return;
        }
        L();
    }

    private void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        b(a());
        b(f());
        b(j());
        b(d());
        b(l());
        b(i());
        b(O());
    }

    private void b(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b47d04", new Object[]{this, filter});
        } else if (filter == null) {
            M();
        } else {
            c(filter);
        }
    }

    private void M() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        MeEditor meEditor = this.t;
        if (meEditor == null || (str = this.C) == null) {
            return;
        }
        meEditor.deleteClip(str);
        this.D = -1;
        this.C = "";
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        com.taobao.android.litecreator.util.u.a(RPCDataItems.SWITCH_TAG_LOG, "aYou thumbnailL focus onDestroy, releaseMarvelEnv");
        Viewer viewer = this.u;
        if (viewer != null) {
            viewer.attachTo((TextureView) null);
            this.u.stop();
            this.r.a(this.u);
            this.u = null;
        }
        MeEditor meEditor = this.t;
        if (meEditor == null) {
            return;
        }
        this.r.a(meEditor);
        this.t = null;
    }

    private void c(Filter filter) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b84863", new Object[]{this, filter});
        } else if (filter.isInDraft || filter.srcDirPath == null || this.t == null) {
        } else {
            if (filter.isVisibilityChange()) {
                MeEditor meEditor = this.t;
                String str = this.C;
                if (filter.visibilityValue == 1) {
                    z = true;
                }
                meEditor.setLookupVisibility(str, z);
                filter.resetVisibility();
                return;
            }
            if (d(filter)) {
                if (!StringUtils.isEmpty(this.C)) {
                    this.t.deleteClip(this.C);
                }
                this.C = this.t.addLookupClip("", filter.srcDirPath, 0L, I());
            }
            this.D = filter.filterId;
            this.t.setLookupIntensity(this.C, filter.level / 100.0f);
        }
    }

    private boolean d(Filter filter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8dbc13c6", new Object[]{this, filter})).booleanValue() : filter.filterId != this.D;
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        this.E = new ioo();
        this.E.a(this.t);
    }

    private void b(AiQuality aiQuality) {
        ioo iooVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73fe7d", new Object[]{this, aiQuality});
        } else if ((aiQuality != null && aiQuality.isInDraft) || (iooVar = this.E) == null) {
        } else {
            iooVar.a(aiQuality, this.F);
        }
    }

    private void b(Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480569a", new Object[]{this, beauty});
            return;
        }
        if (this.N == null) {
            this.N = new ap();
        }
        this.N.a(this.t, this.I);
        this.N.a(beauty, this.F);
    }

    private void b(Adjust adjust) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da7058d", new Object[]{this, adjust});
            return;
        }
        if (this.O == null) {
            this.O = new mxy();
            this.O.a(this.t);
        }
        this.O.a(adjust, this.F);
    }

    private void b(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b92734", new Object[]{this, templateInfo});
        } else if (templateInfo == null) {
        } else {
            if (templateInfo.isDirty) {
                this.F.clear();
                this.f13390a = true;
                if (this.Q == null) {
                    this.Q = this.s;
                }
                this.s = this.r.a();
                this.o = templateInfo;
                this.J = false;
                Q();
                this.o.isDirty = false;
                ap apVar = this.N;
                if (apVar != null) {
                    apVar.a();
                }
            }
            if (!templateInfo.isContentDirty) {
                return;
            }
            this.o.templateContent = templateInfo.templateContent;
            T();
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.a, com.taobao.android.litecreator.sdk.editor.ae
    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
            return;
        }
        super.P();
        if (this.o == null) {
            return;
        }
        this.f13390a = false;
        R();
        Viewer viewer = this.u;
        if (viewer != null) {
            viewer.stop();
        }
        Project project = this.Q;
        if (project == null) {
            project = this.r.a();
        }
        this.s = project;
        w();
        this.u.seekTo(1000L, Const.SeekFlag.SeekEnd);
    }

    private void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
            return;
        }
        Viewer viewer = this.u;
        if (viewer != null) {
            viewer.stop();
        }
        w();
        this.u.seekTo(1000L, Const.SeekFlag.SeekEnd);
    }

    private void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
        } else if (this.o == null || StringUtils.isEmpty(this.o.singleHolderPath)) {
        } else {
            ImageBean a2 = com.taobao.android.litecreator.base.data.g.a(this.o.singleHolderPath);
            this.b.width = a2.width;
            this.b.height = a2.height;
            this.b.path = a2.path;
            this.b.rotation = a2.rotate;
        }
    }

    private void b(Crop crop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ddb3ec", new Object[]{this, crop});
        } else if (crop == null || crop.rect == null) {
        } else {
            String N = N();
            if (StringUtils.isEmpty(N)) {
                return;
            }
            if (c(crop)) {
                Size J = J();
                this.t.setCanvasSize(J.getWidth(), J.getHeight());
                com.taobao.android.litecreator.util.u.d("ImageEditorV2", "applyCrop: setCanvasSize " + J.getWidth() + " " + J.getHeight());
            }
            this.v = crop.rect;
            a(N, crop);
        }
    }

    private boolean c(Crop crop) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8ecacb0f", new Object[]{this, crop})).booleanValue() : (this.v == null || (crop.rect.width() == this.v.width() && crop.rect.height() == this.v.height())) ? false : true;
    }

    private String N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b40a0b6b", new Object[]{this}) : this.F.size() > 0 ? this.F.get(0) : "";
    }

    private void a(String str, Crop crop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5560743", new Object[]{this, str, crop});
            return;
        }
        int originDisplayWidth = g().getOriginDisplayWidth();
        int originDisplayHeight = g().getOriginDisplayHeight();
        Transform transform = crop.transform;
        float f = originDisplayWidth;
        float f2 = crop.transform.unRotateOffsetX / f;
        float f3 = originDisplayHeight;
        float f4 = crop.transform.unRotateOffsetY / f3;
        float width = ((crop.rect.width() * transform.sampleSize) / transform.scale) / f;
        float height = ((crop.rect.height() * crop.transform.sampleSize) / transform.scale) / f3;
        com.taobao.android.litecreator.util.u.d("ImageEditorV2", "startCrop: cropWidth=" + width + " cropHeight=" + height);
        this.t.setClipCrop(str, f2, f4, width, height, -((float) ((transform.rotate / 180.0f) * 3.141592653589793d)), true);
    }

    private void b(List<Paster> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        if (list != null) {
            for (Paster paster : list) {
                paster.endTimeUs = IMAGE_CLIP_DURATION_US;
            }
        }
        this.H.a(list);
    }

    private void b(Music music) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edda674f", new Object[]{this, music});
        } else if (music != null && !StringUtils.isEmpty(music.path)) {
            this.k.a(music.path);
        } else {
            this.k.a("");
        }
    }

    @Override // tb.hek
    public Project D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Project) ipChange.ipc$dispatch("ed25f850", new Object[]{this}) : this.s;
    }

    @Override // tb.hek
    public MeEditor E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MeEditor) ipChange.ipc$dispatch("7a717969", new Object[]{this}) : this.t;
    }

    @Override // tb.hek
    public Viewer F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Viewer) ipChange.ipc$dispatch("4634871d", new Object[]{this}) : this.u;
    }

    @Override // tb.hek
    public hel G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hel) ipChange.ipc$dispatch("46faa849", new Object[]{this}) : this.r;
    }

    public TemplateEditor H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateEditor) ipChange.ipc$dispatch("14b32bca", new Object[]{this}) : this.I;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.a, com.taobao.android.litecreator.sdk.editor.x
    public ImageEditInfo h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageEditInfo) ipChange.ipc$dispatch("9880c77f", new Object[]{this});
        }
        ImageEditInfo h = super.h();
        h.version = 1;
        return h;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.x
    public void a(ag.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d2ec8a", new Object[]{this, bVar});
        } else {
            this.w = bVar;
        }
    }

    public long I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41a3844", new Object[]{this})).longValue();
        }
        Viewer viewer = this.u;
        return viewer != null ? viewer.getDurationUs() : IMAGE_CLIP_DURATION_US;
    }

    public Size J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("33087794", new Object[]{this});
        }
        Size size = this.p;
        if (size != null && size.getWidth() > 0 && this.p.getHeight() > 0) {
            return this.p;
        }
        int i = Resources.getSystem().getDisplayMetrics().widthPixels;
        return new Size(i, (int) ((g().getDisplayHeight() * i) / g().getDisplayWidth()));
    }

    @Override // com.taobao.android.litecreator.sdk.editor.a
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else {
            x();
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.x
    public SurfaceView U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceView) ipChange.ipc$dispatch("59cb21", new Object[]{this}) : this.q;
    }
}
