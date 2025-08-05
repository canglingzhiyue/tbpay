package com.alibaba.aliweex.bundle;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.aliweex.bundle.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.WXLogUtils;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class e implements k.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f2013a;
    private Activity b;
    private long c = 0;
    private long d = 0;
    private boolean e = true;
    private long f;

    static {
        kge.a(-110573555);
        kge.a(1095375821);
    }

    public static /* synthetic */ Activity a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("efc4ffda", new Object[]{eVar}) : eVar.e();
    }

    public e(Activity activity) {
        this.f2013a = true;
        this.f = 500L;
        this.f2013a = true;
        this.b = activity;
        com.alibaba.aliweex.e l = com.alibaba.aliweex.d.a().l();
        if (l != null) {
            try {
                this.f = Long.parseLong(l.getConfig("android_weex_common_config", "skipFast2001Time", "500"));
            } catch (NumberFormatException e) {
                WXLogUtils.e("UTPresenter", e);
                this.f = 500L;
            }
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f2013a;
    }

    @Override // com.alibaba.aliweex.bundle.k.f
    public void a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        com.alibaba.aliweex.e l = com.alibaba.aliweex.d.a().l();
        if (l == null) {
            return;
        }
        if (TextUtils.equals("false", l.getConfig("android_weex_common_config", "enableSkipFast2001", "true"))) {
            this.e = false;
        }
        if (TextUtils.isEmpty(str)) {
            this.e = false;
        }
        Uri parse = Uri.parse(str);
        if (parse == null || !parse.getPath().contains("app/tb-shop/mini-shop")) {
            this.e = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.c = currentTimeMillis;
        if (currentTimeMillis - this.d <= this.f) {
            z = false;
        }
        if ((!z && this.e) || e() == null || !a()) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(e());
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(e());
        if (TextUtils.isEmpty(str) || parse == null) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageUrl(e(), parse);
        if (!parse.isHierarchical() || parse.getQueryParameter("scm") == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scm", parse.getQueryParameter("scm"));
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(e(), hashMap);
    }

    @Override // com.alibaba.aliweex.bundle.k.f
    public void b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.d = currentTimeMillis;
        if (currentTimeMillis - this.c > this.f) {
            z = true;
        }
        if ((!z && this.e) || e() == null || !a()) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(e());
    }

    @Override // com.alibaba.aliweex.bundle.k.f
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (e() == null || !a()) {
        } else {
            b();
            UTAnalytics.getInstance().getDefaultTracker().skipPage(e());
            a(str);
        }
    }

    @Override // com.alibaba.aliweex.bundle.k.f
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!a()) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(e());
        }
    }

    @Override // com.alibaba.aliweex.bundle.k.f
    public void a(WXSDKInstance wXSDKInstance) {
        WXComponent z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421b9086", new Object[]{this, wXSDKInstance});
        } else if (!a() || (z = wXSDKInstance.z()) == null) {
        } else {
            String str = (String) z.getAttrs().get("spmId");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("spm-cnt", str + ".0.0");
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(e(), hashMap);
        }
    }

    @Override // com.alibaba.aliweex.bundle.k.f
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!a() || e() == null || TextUtils.isEmpty(str)) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(e(), Uri.parse(str).buildUpon().clearQuery().build().toString());
        }
    }

    @Override // com.alibaba.aliweex.bundle.k.f
    public void b(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65ac8e5", new Object[]{this, wXSDKInstance});
        } else {
            wXSDKInstance.a(new com.taobao.weex.c() { // from class: com.alibaba.aliweex.bundle.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.weex.c
                public void onCreate(WXComponent wXComponent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dcbed927", new Object[]{this, wXComponent});
                    }
                }

                @Override // com.taobao.weex.c
                public void onPreDestory(WXComponent wXComponent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ebb808dc", new Object[]{this, wXComponent});
                    }
                }

                @Override // com.taobao.weex.c
                public void onViewCreated(WXComponent wXComponent, View view) {
                    com.ut.mini.internal.a exposureViewHandler;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9884402", new Object[]{this, wXComponent, view});
                    } else if (!e.this.a() || (exposureViewHandler = com.ut.mini.internal.f.getInstance().getExposureViewHandler(e.a(e.this))) == null || !exposureViewHandler.isExposureView(com.ut.mini.l.getInstance().getPageUrl(e.a(e.this)), view)) {
                    } else {
                        com.ut.mini.internal.f.getInstance().setExposureTagForWeex(view);
                    }
                }
            });
        }
    }

    @Override // com.alibaba.aliweex.bundle.k.f
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f2013a = true;
        this.b = null;
    }

    private Activity e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("28c80bbc", new Object[]{this}) : this.b;
    }
}
