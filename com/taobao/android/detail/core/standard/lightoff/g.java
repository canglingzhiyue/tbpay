package com.taobao.android.detail.core.standard.lightoff;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.arc;
import tb.elq;
import tb.elr;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class g implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f9852a;
    private String b;
    private c c;
    private boolean e = false;
    private PicGalleryLightOffDialogFragment d = new PicGalleryLightOffDialogFragment();

    static {
        kge.a(-605085438);
        kge.a(1450561036);
    }

    public g(Context context, String str) {
        this.f9852a = context;
        this.b = str;
        this.c = new PicGalleryLightOffWeexView(context, this.b);
        emu.a("com.taobao.android.detail.core.standard.lightoff.PicGalleryLightOffWeexManager");
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c.setLoadUrl(str);
        }
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.e) {
        } else {
            this.c.loadView();
            this.e = true;
        }
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.a
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (!e()) {
        } else {
            a();
            this.d.show(elr.a(this.b), this.c, ((FragmentActivity) this.f9852a).getSupportFragmentManager(), PicGalleryLightOffDialogFragment.generateFragmentTag(), map);
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (!(this.f9852a instanceof FragmentActivity)) {
            return false;
        }
        elq a2 = elr.a(this.b);
        if (a2 == null) {
            arc.a().c("PicGalleryLightOffWeexManager", "show", "picGalleryAuraPresenter is null");
            return false;
        } else if (a2.l()) {
            return true;
        } else {
            arc.a().c("PicGalleryLightOffWeexManager", "show", "lightOffData is invalid");
            return false;
        }
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.d.dismiss();
        }
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d.isShowing();
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.onDestroy();
        this.c = null;
    }

    @Override // com.taobao.android.detail.core.standard.lightoff.a
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.c.onLocatorTo(jSONObject);
        }
    }
}
