package com.taobao.android.livehome.plugin.atype.flexalocal.dxengine;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.l;
import com.taobao.live.home.dinamic.business.TemplateRequest;
import com.taobao.live.home.dinamic.model.TemplateObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.mff;
import tb.mfg;
import tb.mfj;
import tb.mfn;

/* loaded from: classes6.dex */
public class LiveHomeController2 implements Serializable, mff {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private DinamicSdkManager2 mDinamicSdkManager2;
    private TemplateCardListOwner mTemplateCardListOwner;

    static {
        kge.a(1711711743);
        kge.a(1038752494);
        kge.a(1028243835);
        TAG = LiveHomeController2.class.getSimpleName();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        mfg.a().b(this);
        DinamicSdkManager2 dinamicSdkManager2 = this.mDinamicSdkManager2;
        if (dinamicSdkManager2 == null) {
            return;
        }
        dinamicSdkManager2.onDestroy();
    }

    public LiveHomeController2() {
        mfg.a().a(this);
    }

    public TemplateCardListOwner getTemplateCardListOwner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateCardListOwner) ipChange.ipc$dispatch("2571aa6a", new Object[]{this});
        }
        checkTemplateCardListOwner();
        return this.mTemplateCardListOwner;
    }

    public void loadTemplate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebd7fdc", new Object[]{this, new Integer(i)});
            return;
        }
        checkTemplateCardListOwner();
        this.mTemplateCardListOwner.a(i);
    }

    public void setTemplateCardListOwner(TemplateCardListOwner templateCardListOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31497c0", new Object[]{this, templateCardListOwner});
        } else {
            this.mTemplateCardListOwner = templateCardListOwner;
        }
    }

    public void setDinamicSdkManager(DinamicSdkManager2 dinamicSdkManager2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5937be", new Object[]{this, dinamicSdkManager2});
        } else {
            this.mDinamicSdkManager2 = dinamicSdkManager2;
        }
    }

    public DinamicSdkManager2 getDinamicSdkManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicSdkManager2) ipChange.ipc$dispatch("6b04efe8", new Object[]{this}) : this.mDinamicSdkManager2;
    }

    @Override // tb.mff
    public void onLiveEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9ef1c", new Object[]{this, str, obj});
        } else if (!"com.taobao.live.home.template_list_ready".equals(str)) {
        } else {
            mfj.b(TAG, "onLiveEvent template list ready");
            downloadTemplates();
        }
    }

    public void downloadTemplates() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5a8798", new Object[]{this});
        } else if (this.mDinamicSdkManager2 != null) {
            checkTemplateCardListOwner();
            List<TemplateObject> c = this.mTemplateCardListOwner.c();
            if (mfn.a(c)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (TemplateObject templateObject : c) {
                if (templateObject != null && !l.a((CharSequence) templateObject.url4Android)) {
                    DXTemplateItem dXTemplateItem = new DXTemplateItem();
                    dXTemplateItem.f11925a = templateObject.name;
                    dXTemplateItem.b = templateObject.version4Android;
                    dXTemplateItem.c = templateObject.url4Android;
                    arrayList.add(dXTemplateItem);
                }
            }
            this.mDinamicSdkManager2.downloadTemplates(arrayList);
        }
    }

    private void checkTemplateCardListOwner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5dac00a", new Object[]{this});
        } else if (this.mTemplateCardListOwner != null) {
        } else {
            this.mTemplateCardListOwner = new TemplateCardListOwner() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.LiveHomeController2.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.TemplateCardListOwner
                public TemplateRequest a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (TemplateRequest) ipChange2.ipc$dispatch("5eeb6013", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.TemplateCardListOwner
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
