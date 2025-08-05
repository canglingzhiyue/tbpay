package com.taobao.android.litecreator.sdk.editor;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Adjust;
import com.taobao.android.litecreator.sdk.editor.data.AiQuality;
import com.taobao.android.litecreator.sdk.editor.data.Crop;
import com.taobao.android.litecreator.sdk.editor.data.Filter;
import com.taobao.android.litecreator.sdk.editor.data.Image;
import com.taobao.android.litecreator.sdk.editor.data.ImageEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.Media;
import com.taobao.android.litecreator.sdk.editor.data.Music;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.litecreator.sdk.editor.data.RichLabel;
import com.taobao.android.litecreator.sdk.editor.data.TemplateInfo;
import com.taobao.android.litecreator.sdk.editor.data.Volume;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import com.taobao.android.litecreator.sdk.editor.v;
import com.taobao.android.litecreator.sdk.editor.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import tb.hen;
import tb.hep;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class a implements x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Inject
    public ar K;

    /* renamed from: a  reason: collision with root package name */
    public boolean f13390a;
    public Image b;
    public ai c;
    @Inject
    public y d;
    @Inject
    public t e;
    @Inject
    public ab f;
    @Inject
    public w g;
    @Inject
    public r h;
    @Inject
    public aa i;
    @Inject
    public ah j;
    @Inject
    public hen k;
    @Inject
    public s l;
    public Map<Class<? extends EditableBean>, v> m = new HashMap();
    @Inject
    public ae n;
    public TemplateInfo o;

    static {
        kge.a(1771239758);
        kge.a(-667289688);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.v
    public /* synthetic */ com.taobao.android.litecreator.sdk.editor.data.base.b t() {
        return v.CC.$default$t(this);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.z
    public /* synthetic */ List<Image> v() {
        return z.CC.$default$v(this);
    }

    @Override // com.taobao.android.litecreator.sdk.editor.x, com.taobao.android.litecreator.sdk.editor.z
    public /* synthetic */ AbsEditInfo r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsEditInfo) ipChange.ipc$dispatch("ab5ad8e9", new Object[]{this}) : h();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.android.litecreator.sdk.editor.data.Media, com.taobao.android.litecreator.sdk.editor.data.Image] */
    @Override // com.taobao.android.litecreator.sdk.editor.z
    public /* synthetic */ Image s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Media) ipChange.ipc$dispatch("6b44a363", new Object[]{this}) : g();
    }

    public a(ai aiVar, Image image, ImageEditInfo imageEditInfo) {
        this.c = aiVar;
        this.b = image;
        this.o = imageEditInfo != null ? imageEditInfo.templateInfo : null;
        this.f13390a = a(imageEditInfo);
        w();
        b(imageEditInfo);
    }

    private boolean a(ImageEditInfo imageEditInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e5a7c2a4", new Object[]{this, imageEditInfo})).booleanValue() : imageEditInfo != null && imageEditInfo.templateInfo != null && com.taobao.android.litecreator.util.k.a(imageEditInfo.templateInfo.draftPath) && (TextUtils.equals(imageEditInfo.templateInfo.resourceType, Resource.TYPE_TEMPLATE_IMG) || TextUtils.equals(imageEditInfo.templateInfo.resourceType, Resource.TYPE_TEMPLATE_TEXT_IMAGE));
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        ai aiVar = this.c;
        if (aiVar != null) {
            aiVar.a(this);
        } else {
            d.a().a(this);
        }
        this.m.put(RichLabel.class, this.d);
        this.m.put(Crop.class, this.e);
        this.m.put(Paster.class, this.f);
        this.m.put(Filter.class, this.g);
        this.m.put(AiQuality.class, this.h);
        this.m.put(Music.class, this.i);
        this.m.put(Volume.class, this.j);
        this.m.put(TemplateInfo.class, this.n);
        this.m.put(Beauty.class, this.l);
        this.m.put(Adjust.class, this.K);
    }

    private void b(ImageEditInfo imageEditInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1693e61", new Object[]{this, imageEditInfo});
        } else if (imageEditInfo != null) {
            if (!q()) {
                this.g.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.filter);
                this.f.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.pasters);
                this.d.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.labels);
                this.e.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.crop);
                this.h.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.aiQuality);
                this.i.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.music);
                this.l.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.beauty);
                this.K.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.adjust);
                return;
            }
            this.n.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.templateInfo);
            List<Paster> list = imageEditInfo.pasters;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (Paster paster : list) {
                    if (paster.isInTemplate) {
                        arrayList.add(paster);
                    } else {
                        paster.isInDraft = true;
                    }
                }
                list.removeAll(arrayList);
            }
            this.f.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.pasters);
            if (imageEditInfo.filter != null) {
                imageEditInfo.filter.isInDraft = true;
            }
            this.g.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.filter);
            if (imageEditInfo.aiQuality != null) {
                imageEditInfo.aiQuality.isInDraft = true;
            }
            this.h.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.aiQuality);
            this.d.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.labels);
            this.e.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.crop);
            this.i.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.music);
            this.l.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.beauty);
            this.K.t().a((com.taobao.android.litecreator.sdk.editor.data.base.b) imageEditInfo.adjust);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.w
    public void a(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb0b1a5", new Object[]{this, filter});
        } else {
            this.g.a(filter);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.w
    public Filter a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Filter) ipChange.ipc$dispatch("6584f925", new Object[]{this}) : this.g.a();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.w
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.g.b();
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public void a(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799f3f7e", new Object[]{this, paster});
        } else {
            this.f.a(paster);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public void a(Paster paster, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba492345", new Object[]{this, paster, new Integer(i)});
        } else {
            this.f.a(paster, i);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public void a(List<Paster> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f.a(list);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public List<Paster> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.f.c();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public List<Paster> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.f.d();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ab
    public void b(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa30add", new Object[]{this, paster});
        } else {
            this.f.b(paster);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ar
    public void a(Adjust adjust) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a33a2e", new Object[]{this, adjust});
        } else {
            this.K.a(adjust);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ar
    public Adjust O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Adjust) ipChange.ipc$dispatch("2799aa5c", new Object[]{this}) : this.K.O();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.y
    public void a(RichLabel richLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673856db", new Object[]{this, richLabel});
        } else {
            this.d.a(richLabel);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.y
    public void a(RichLabel richLabel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd2f788", new Object[]{this, richLabel, new Integer(i)});
        } else {
            this.d.a(richLabel, i);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.y
    public List<RichLabel> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.d.e();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.y
    public void b(RichLabel richLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac7db1c", new Object[]{this, richLabel});
        } else {
            this.d.b(richLabel);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.t
    public void a(Crop crop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f09ccd", new Object[]{this, crop});
        } else {
            this.e.a(crop);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.t
    public Crop f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Crop) ipChange.ipc$dispatch("5c7b0a92", new Object[]{this}) : this.e.f();
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
        v vVar = this.m.get(hep.a(dVar.getClass().getGenericInterfaces()[0]));
        com.taobao.android.litecreator.sdk.editor.data.base.b<T> t = vVar != null ? vVar.t() : null;
        if (t != null) {
            return t;
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

    public Image g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Image) ipChange.ipc$dispatch("c9c38358", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.z
    public void a(Image image) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779b8b98", new Object[]{this, image});
        } else {
            this.b = image;
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.x
    public ImageEditInfo h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageEditInfo) ipChange.ipc$dispatch("9880c77f", new Object[]{this});
        }
        ImageEditInfo imageEditInfo = new ImageEditInfo();
        imageEditInfo.crop = f();
        imageEditInfo.filter = a();
        imageEditInfo.labels = e();
        imageEditInfo.pasters = c();
        imageEditInfo.aiQuality = j();
        imageEditInfo.music = l();
        imageEditInfo.volume = n();
        imageEditInfo.templateInfo = o();
        imageEditInfo.beauty = i();
        imageEditInfo.adjust = O();
        return imageEditInfo;
    }

    @Override // com.taobao.android.litecreator.sdk.editor.s
    public void a(Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c0de99", new Object[]{this, beauty});
        } else {
            this.l.a(beauty);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.s
    public Beauty i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Beauty) ipChange.ipc$dispatch("2cb0fc97", new Object[]{this}) : this.l.i();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.r
    public void a(AiQuality aiQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e47a3c", new Object[]{this, aiQuality});
        } else {
            this.h.a(aiQuality);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.r
    public AiQuality j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AiQuality) ipChange.ipc$dispatch("97152b59", new Object[]{this}) : this.h.j();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.r
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.h.k();
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.aa
    public Music l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Music) ipChange.ipc$dispatch("91b14b69", new Object[]{this}) : this.i.l();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.aa
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            this.i.m();
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.aa
    public void a(Music music) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd249a8e", new Object[]{this, music});
        } else {
            this.i.a(music);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ah
    public Volume n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Volume) ipChange.ipc$dispatch("9761b790", new Object[]{this}) : this.j.n();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ah
    public void a(Volume volume) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315e5ac3", new Object[]{this, volume});
        } else {
            this.j.a(volume);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ae
    public void a(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8899f15", new Object[]{this, templateInfo});
        } else {
            this.n.a(templateInfo);
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ae
    public TemplateInfo o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateInfo) ipChange.ipc$dispatch("57c804e3", new Object[]{this}) : this.n.o();
    }

    @Override // com.taobao.android.litecreator.sdk.editor.ae
    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
        } else {
            this.n.P();
        }
    }

    @Override // com.taobao.android.litecreator.sdk.editor.x
    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.f13390a;
    }
}
