package com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.WeexFrameLayout;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.e;
import com.taobao.android.weex.h;
import com.taobao.tao.flexbox.layoutmanager.core.w;
import com.taobao.weex.common.Constants;
import com.ut.mini.UTAnalytics;
import com.ut.mini.l;
import java.util.Map;
import tb.juh;
import tb.jvq;
import tb.jvs;
import tb.kge;
import tb.mto;
import tb.oeb;
import tb.oec;
import tb.ogg;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f13223a;
    private WeexInstance b;
    private WeexContainer c;
    private int d;
    private b e;
    private String g;
    private Uri h;
    private h i = new h() { // from class: com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.d.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.weex.h
        public void onExecuteSuccess(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onInitSuccess(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
                return;
            }
            ogg.a("WeexSecondPage", "onInitSuccess @" + weexInstance.getInstanceId());
        }

        @Override // com.taobao.android.weex.h
        public void onInitFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            } else {
                d.a(d.this, "onInitFailed", new String[]{"isCache", String.valueOf(z), "WeexErrorType", weexErrorType.name(), "errorMsg", str});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onRenderSuccess(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
                return;
            }
            ogg.a("WeexSecondPage", "onRenderSuccess @" + weexInstance.getInstanceId() + ":" + d.c(d.this).toString());
        }

        @Override // com.taobao.android.weex.h
        public void onRenderFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            } else {
                d.a(d.this, "onRenderFailed", new String[]{"isRefresh", String.valueOf(z), "WeexErrorType", weexErrorType.name(), "errorMsg", str});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onExecuteFailed(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
            } else {
                d.a(d.this, "onExecuteFailed", new String[]{"WeexErrorType", weexErrorType.name(), "errorMsg", str});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onScriptException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
            } else {
                d.a(d.this, "onScriptException", new String[]{"WeexErrorType", weexErrorType.name(), "errorMsg", str});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onEngineException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
            } else {
                d.a(d.this, "onEngineException", new String[]{"WeexErrorType", weexErrorType.name(), "errorMsg", str});
            }
        }

        @Override // com.taobao.android.weex.h
        public void onDestroyed(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
                return;
            }
            ogg.a("WeexSecondPage", "onDestroyed @" + weexInstance.getInstanceId());
        }
    };
    private Activity f = new Activity();

    static {
        kge.a(-1419236896);
    }

    public static /* synthetic */ int a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1f34f124", new Object[]{dVar})).intValue() : dVar.d;
    }

    public static /* synthetic */ void a(d dVar, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6204c84", new Object[]{dVar, str, strArr});
        } else {
            dVar.a(str, strArr);
        }
    }

    public static /* synthetic */ WeexContainer b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexContainer) ipChange.ipc$dispatch("211ca05d", new Object[]{dVar}) : dVar.c;
    }

    public static /* synthetic */ Uri c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("e7789fa6", new Object[]{dVar}) : dVar.h;
    }

    public d(b bVar) {
        this.e = bVar;
    }

    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        ogg.a("WeexSecondPage", "onCreateRootView context:" + context + " ;;; " + this);
        this.f13223a = context;
        this.c = new WeexContainer(context);
        this.c.setBackgroundColor(-1);
        this.d = oec.a((Object) oeb.a("weexTouchSlop", "3"), 3);
        return this.c;
    }

    public void a(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1b95e9", new Object[]{this, uri, str});
            return;
        }
        this.h = uri;
        this.g = str;
        e();
        WeexValue a2 = e.b().a(new JSONObject(c.a(uri)));
        ogg.a("WeexSecondPage", "onRenderContent weexInstance: " + this.b + " ;;; context: " + this.f13223a + " ;;; " + this);
        if (this.b == null && this.c != null && this.f13223a != null) {
            com.taobao.android.weex.config.b bVar = new com.taobao.android.weex.config.b();
            WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
            weexUnicornConfig.a(WeexUnicornConfig.RenderMode.texture);
            weexUnicornConfig.a(true);
            bVar.a(weexUnicornConfig);
            Context context = this.f13223a;
            this.b = e.a(context, c.b() + "&profileContainerMode=embed", WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, bVar);
            this.b.setTag("ut_page_object", this.f);
            this.b.addInstanceListener(this.i);
            this.b.initWithURL(c.b());
            this.b.render(a2);
            this.b.setTag("profileContainer", this.e);
            this.b.registerModule("guangProfile", GuangProfileWeexModule.class);
            ((juh) this.b.getExtend(juh.class)).a(new jvs() { // from class: com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jvs
                public void a(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    } else if (map == null || !Constants.Value.HORIZONTAL.equals(map.get("axis"))) {
                    } else {
                        Object obj = map.get(Constants.Name.CONTENT_OFFSET);
                        if (!(obj instanceof org.json.JSONObject) || ((org.json.JSONObject) obj).optDouble("x", mto.a.GEO_NOT_SUPPORT) <= d.a(d.this)) {
                            return;
                        }
                        d.b(d.this).setWeexConsume(WeexFrameLayout.WEEX_STATE_NOT_CONSUME);
                    }
                }
            });
            ((juh) this.b.getExtend(juh.class)).a(new jvq() { // from class: com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jvq
                public void a(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    } else if (map == null || map.isEmpty()) {
                    } else {
                        d.b(d.this).setWeexConsume(oec.a(map.get("state"), false) ? WeexFrameLayout.WEEX_STATE_CONSUME : WeexFrameLayout.WEEX_STATE_NOT_CONSUME);
                    }
                }
            });
            View rootView = this.b.getRootView();
            if (rootView.getParent() != null) {
                ((ViewGroup) rootView.getParent()).removeView(rootView);
            }
            this.c.addView(rootView, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.b.onViewAppear();
            this.b.dispatchEvent(WeexEventTarget.WINDOW_TARGET, "onDataChange", a2);
        }
        this.c.setWeexConsume(WeexFrameLayout.WEEX_STATE_NOT_EXIST);
        ogg.a("WeexSecondPage", "onRenderContent " + this.h.toString() + "@" + this.b.getInstanceId());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        f();
        WeexInstance weexInstance = this.b;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onViewDisappear();
        this.b.dispatchEvent(WeexEventTarget.WINDOW_TARGET, "onDataClear", null);
        ogg.a("WeexSecondPage", "onClearContent @" + this.b.getInstanceId());
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e();
        WeexInstance weexInstance = this.b;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onViewAppear();
        ogg.a("WeexSecondPage", "onResume @" + this.b.getInstanceId());
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        f();
        WeexInstance weexInstance = this.b;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onViewDisappear();
        ogg.a("WeexSecondPage", "onPause @" + this.b.getInstanceId());
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.b == null) {
        } else {
            ogg.a("WeexSecondPage", "onDestroy @" + this.b.getInstanceId());
            this.b.destroy();
            this.b = null;
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        l.getInstance().pageDestroyed(this.f);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(this.g);
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(this.f);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f);
        }
    }

    private void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{this, str, strArr});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("profileUrl=");
        Uri uri = this.h;
        sb.append(uri == null ? "" : uri.toString());
        for (int i = 0; i < strArr.length; i += 2) {
            sb.append(",");
            String str2 = strArr[i];
            int i2 = i + 1;
            String str3 = i2 < strArr.length ? strArr[i2] : "";
            sb.append(str2);
            sb.append("=");
            sb.append(str3);
        }
        String sb2 = sb.toString();
        w.a(false, 100, str, null, sb2, c.b(), null, null, null, null);
        ogg.a("WeexSecondPage", "reportError:" + sb2);
    }
}
