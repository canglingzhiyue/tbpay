package com.taobao.live.home;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.live.home.dinamic.business.TemplateCardListOwner;
import com.taobao.live.home.dinamic.business.TemplateRequest;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.live.home.dinamic.sdk.DinamicSdkManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.mff;
import tb.mfg;
import tb.mfj;
import tb.mfn;
import tb.pro;

/* loaded from: classes7.dex */
public class LiveHomeController implements Serializable, mff {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f17721a = "LiveHomeController";
    private static LiveHomeController e;
    private TemplateCardListOwner b;
    private DinamicSdkManager c;

    public static LiveHomeController a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveHomeController) ipChange.ipc$dispatch("f431beb2", new Object[0]);
        }
        if (e == null) {
            e = new LiveHomeController();
        }
        return e;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        mfg.a().b(this);
        DinamicSdkManager dinamicSdkManager = this.c;
        if (dinamicSdkManager != null) {
            dinamicSdkManager.b();
        }
        e = null;
    }

    private LiveHomeController() {
        mfg.a().a(this);
    }

    public TemplateCardListOwner d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateCardListOwner) ipChange.ipc$dispatch("e4c7fca0", new Object[]{this});
        }
        g();
        return this.b;
    }

    public TemplateObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateObject) ipChange.ipc$dispatch("32e993a4", new Object[]{this, str});
        }
        g();
        return this.b.c(str);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        g();
        this.b.c();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        g();
        this.b.a(i);
    }

    public void a(TemplateCardListOwner templateCardListOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76baecdd", new Object[]{this, templateCardListOwner});
        } else {
            this.b = templateCardListOwner;
        }
    }

    public void a(DinamicSdkManager dinamicSdkManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0869ea", new Object[]{this, dinamicSdkManager});
        } else {
            this.c = dinamicSdkManager;
        }
    }

    public DinamicSdkManager f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicSdkManager) ipChange.ipc$dispatch("8c90aa8b", new Object[]{this}) : this.c;
    }

    @Override // tb.mff
    public void onLiveEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9ef1c", new Object[]{this, str, obj});
        } else if (!"com.taobao.live.home.template_list_ready".equals(str)) {
        } else {
            mfj.b(f17721a, "onLiveEvent template list ready");
            downloadTemplates();
        }
    }

    public void downloadTemplates() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5a8798", new Object[]{this});
        } else if (this.c != null) {
            g();
            List<TemplateObject> d = this.b.d();
            if (mfn.a(d)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (TemplateObject templateObject : d) {
                if (templateObject != null && !pro.e(templateObject.url4Android)) {
                    DXTemplateItem dXTemplateItem = new DXTemplateItem();
                    dXTemplateItem.f11925a = templateObject.name;
                    dXTemplateItem.b = templateObject.version4Android;
                    dXTemplateItem.c = templateObject.url4Android;
                    arrayList.add(dXTemplateItem);
                }
            }
            this.c.a(arrayList);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.b != null) {
        } else {
            this.b = new TemplateCardListOwner() { // from class: com.taobao.live.home.d$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.live.home.dinamic.business.TemplateCardListOwner
                public TemplateRequest a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (TemplateRequest) ipChange2.ipc$dispatch("5eeb6013", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.taobao.live.home.dinamic.business.TemplateCardListOwner
                public List<TemplateObject> a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (List) ipChange2.ipc$dispatch("287b5bd5", new Object[]{this, str});
                    }
                    return null;
                }
            };
        }
    }
}
