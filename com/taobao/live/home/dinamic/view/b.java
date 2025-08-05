package com.taobao.live.home.dinamic.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.taobao.R;
import com.taobao.taolive.uikit.homepage.e;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.med;
import tb.mek;
import tb.mel;
import tb.mfj;
import tb.mfm;

/* loaded from: classes7.dex */
public class b extends med<IMTOPDataObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f17751a = "b";
    private Context b;
    private ViewGroup c;
    private mel d;
    private a e;
    private Rect f;

    public static /* synthetic */ ViewGroup a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("e31ab214", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ mel b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mel) ipChange.ipc$dispatch("ee107b32", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : f17751a;
    }

    public mel a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mel) ipChange.ipc$dispatch("f07b9ca", new Object[]{this}) : this.d;
    }

    public b(Context context, ViewGroup viewGroup, int i) {
        super(viewGroup, i);
        this.f = new Rect();
        this.b = context;
        if (this.itemView != null) {
            this.c = (ViewGroup) this.itemView.findViewById(R.id.live_dinamic_card_container);
            this.c.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        }
    }

    public DinamicDataObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicDataObject) ipChange.ipc$dispatch("5623a4ca", new Object[]{this});
        }
        mel melVar = this.d;
        if (melVar != null) {
            return melVar.e();
        }
        return null;
    }

    public void a(IMTOPDataObject iMTOPDataObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40bbbf83", new Object[]{this, iMTOPDataObject, new Integer(i)});
        } else if (!(iMTOPDataObject instanceof DinamicDataObject)) {
        } else {
            DinamicDataObject dinamicDataObject = (DinamicDataObject) iMTOPDataObject;
            dinamicDataObject.mPosition = i;
            if (dinamicDataObject.data == null) {
                return;
            }
            JSONObject jSONObject = dinamicDataObject.data.get("data");
            if (jSONObject != null) {
                jSONObject.put("index", (Object) Integer.valueOf(i));
            }
            mel melVar = this.d;
            if (melVar != null) {
                if (dinamicDataObject == melVar.e()) {
                    this.d.a();
                    k();
                    this.d.h();
                    if (!mfm.j()) {
                        this.d.m();
                    }
                    this.d.a(true);
                    this.d.b();
                    j();
                    this.d.o();
                    return;
                }
                TemplateObject a2 = LiveHomeController.a().a(dinamicDataObject.templateName);
                if (this.d.e() != null && a2 != null && a2.equals(this.d.f())) {
                    this.d.a();
                    k();
                    this.d.a(dinamicDataObject);
                    this.d.h();
                    if (!mfm.j()) {
                        this.d.m();
                    }
                    this.d.a(true);
                    this.d.b();
                    j();
                    this.d.o();
                    return;
                }
            }
            this.d = new mel(dinamicDataObject, this.b, this.c);
            this.d.a(this.e);
            this.d.a(LiveHomeController.a().a(dinamicDataObject.templateName));
            this.d.a(new mek.a() { // from class: com.taobao.live.home.dinamic.view.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.mek.a
                public void a(mek mekVar, View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("98cc208d", new Object[]{this, mekVar, view});
                        return;
                    }
                    if (b.a(b.this) != null) {
                        b.a(b.this).setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        b.a(b.this).removeAllViews();
                        b.a(b.this).addView(view);
                    }
                    b.b(b.this).o();
                    if (!mfm.j()) {
                        b.b(b.this).m();
                    }
                    b.b(b.this).a(true);
                    b.this.j();
                }

                @Override // tb.mek.a
                public void a(mek mekVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4561425", new Object[]{this, mekVar});
                    } else {
                        mfj.c(b.i(), "Dinamic card inflate fail.");
                    }
                }
            });
            this.d.g();
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a74682", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    public boolean a(boolean z, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bdf00b4", new Object[]{this, new Boolean(z), eVar})).booleanValue();
        }
        mel melVar = this.d;
        if (melVar == null) {
            return false;
        }
        return melVar.a(z, eVar, null);
    }

    public boolean a(boolean z, e eVar, mek.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad92e5b3", new Object[]{this, new Boolean(z), eVar, bVar})).booleanValue();
        }
        if (bVar == null) {
            return a(z, eVar, null);
        }
        mel melVar = this.d;
        if (melVar == null) {
            return false;
        }
        return melVar.a(z, eVar, bVar);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        mel melVar = this.d;
        if (melVar == null) {
            return;
        }
        melVar.b();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        mel melVar = this.d;
        if (melVar == null) {
            return;
        }
        melVar.a();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        mel melVar = this.d;
        if (melVar == null) {
            return;
        }
        melVar.c();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i != 1 && i != 2) {
        } else {
            if (h() < 0.2f) {
                d();
                k();
                return;
            }
            c();
            j();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        mel melVar = this.d;
        if (melVar == null) {
            return;
        }
        melVar.i();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        mel melVar = this.d;
        if (melVar == null) {
            return;
        }
        melVar.j();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        mel melVar = this.d;
        if (melVar == null) {
            return;
        }
        melVar.l();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        mel melVar = this.d;
        if (melVar == null) {
            return;
        }
        melVar.k();
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (i != 0 || !mfm.n()) {
        } else {
            c();
            mel melVar = this.d;
            if (melVar == null) {
                return;
            }
            melVar.i();
        }
    }

    public float h() {
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10df", new Object[]{this})).floatValue();
        }
        if (this.itemView == null || (height = this.itemView.getHeight()) == 0) {
            return 0.0f;
        }
        this.itemView.getLocalVisibleRect(this.f);
        return this.f.height() / height;
    }
}
