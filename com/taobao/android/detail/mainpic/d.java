package com.taobao.android.detail.mainpic;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.annotation.AliSDetailScaleType;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.bk;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;
import com.taobao.weex.utils.WXViewUtils;
import java.util.HashMap;
import java.util.Map;
import tb.epv;
import tb.euq;
import tb.euu;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<Integer, DWInstance> f10143a = new HashMap();
    public g b;
    public Activity c;

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f10144a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : AliSDetailScaleType.centerCrop.equals(this.f);
        }
    }

    public d(Activity activity, g gVar) {
        this.c = activity;
        this.b = gVar;
    }

    public DWInstance a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInstance) ipChange.ipc$dispatch("e6b4d84b", new Object[]{this, iDMComponent});
        }
        a c = c(iDMComponent);
        if (c == null || c.f10144a == null) {
            return null;
        }
        String str = c.f10144a + c.b;
        if (this.f10143a.containsKey(Integer.valueOf(str.hashCode()))) {
            return this.f10143a.get(Integer.valueOf(str.hashCode()));
        }
        bk.a aVar = new bk.a(this.c);
        aVar.e("DETAILMAIN");
        aVar.c("TBVideo");
        aVar.b(c.c);
        aVar.f(true);
        aVar.q(true);
        aVar.g(false);
        aVar.a(c.f10144a);
        aVar.c(WXViewUtils.getScreenWidth(this.c));
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("itemId", c.d);
        aVar.a(hashMap);
        aVar.d(euu.a(euq.a(iDMComponent), this.b));
        aVar.N(true);
        aVar.H(false);
        aVar.B(false);
        aVar.r(true);
        if (c.a()) {
            aVar.a(DWAspectRatio.DW_CENTER_CROP);
        }
        g gVar = this.b;
        if (gVar != null && gVar.u()) {
            aVar.a(DWAspectRatio.DW_FIT_CENTER);
        }
        long j = -1;
        try {
            j = Long.parseLong(iDMComponent.getFields().getString("sellerId"));
        } catch (Exception unused) {
        }
        if (j > 0) {
            aVar.b(j);
        }
        if (!TextUtils.isEmpty(c.b)) {
            aVar.i(true);
            com.taobao.avplayer.interactivelifecycle.frontcover.model.a aVar2 = new com.taobao.avplayer.interactivelifecycle.frontcover.model.a();
            DWFrontCoverBean dWFrontCoverBean = new DWFrontCoverBean(0L, null, c.b);
            if (this.b.k().j()) {
                dWFrontCoverBean.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            aVar2.a(dWFrontCoverBean);
            aVar.a(aVar2);
        }
        a(aVar, c);
        DWInstance b = aVar.b();
        b.hideCloseView();
        b.hideMiniProgressBar();
        b.orientationDisable();
        ImageView imageView = new ImageView(this.c);
        if (imageView.getParent() != null) {
            ((ViewGroup) imageView.getParent()).removeView(imageView);
        }
        try {
            b.addFullScreenCustomView(imageView);
        } catch (Throwable unused2) {
        }
        this.f10143a.put(Integer.valueOf((c.f10144a + c.b).hashCode()), b);
        return b;
    }

    public View a(DWInstance dWInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("43dea6cb", new Object[]{this, dWInstance});
        }
        ViewGroup view = dWInstance.getView();
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        return view;
    }

    public boolean a(DWInstance dWInstance, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f45402f", new Object[]{this, dWInstance, iDMComponent})).booleanValue();
        }
        if (!epv.b && !Boolean.TRUE.toString().equals(iDMComponent.getFields().getString("noUseMinVideo")) && this.b.g() != null) {
            return this.b.g().a(dWInstance, iDMComponent);
        }
        return false;
    }

    public boolean b(DWInstance dWInstance, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7361b4e", new Object[]{this, dWInstance, iDMComponent})).booleanValue();
        }
        if (!epv.b && !Boolean.TRUE.toString().equals(iDMComponent.getFields().getString("noUseMinVideo")) && this.b.g() != null) {
            return this.b.g().b(dWInstance, iDMComponent);
        }
        return false;
    }

    public void b(IDMComponent iDMComponent) {
        IDMComponent b;
        a c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73527f0b", new Object[]{this, iDMComponent});
        } else if (this.b.j() || (c = c((b = euq.b(iDMComponent)))) == null || TextUtils.isEmpty(c.f10144a) || TextUtils.isEmpty(c.b)) {
        } else {
            String str = c.f10144a + c.b;
            if (!this.f10143a.containsKey(Integer.valueOf(str.hashCode()))) {
                return;
            }
            DWInstance dWInstance = this.f10143a.get(Integer.valueOf(str.hashCode()));
            if (dWInstance.getVideoState() != 1) {
                return;
            }
            a(dWInstance, b);
        }
    }

    private void a(DWInstance.a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806d563d", new Object[]{this, aVar, aVar2});
        } else {
            aVar.a(0, 9, 35, 0);
        }
    }

    public static a c(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4ef297c3", new Object[]{iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        a aVar = new a();
        aVar.f10144a = iDMComponent.getFields().getString("url");
        aVar.b = iDMComponent.getFields().getString("videoThumbnailURL");
        aVar.c = iDMComponent.getFields().getString("videoId");
        aVar.d = iDMComponent.getFields().getString("itemId");
        aVar.e = iDMComponent.getFields().getString("spatialVideoDimension");
        aVar.f = iDMComponent.getFields().getString("videoModel");
        return aVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (DWInstance dWInstance : this.f10143a.values()) {
            dWInstance.setRootViewClickListener(null);
            dWInstance.setVideoLifecycleListener(null);
            dWInstance.orientationDisable();
            dWInstance.destroy();
        }
    }
}
