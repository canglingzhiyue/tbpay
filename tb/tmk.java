package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.e;
import com.taobao.android.weex.h;
import com.taobao.android.weex_framework.ui.i;
import com.taobao.android.weex_framework.util.g;
import com.taobao.search.common.util.k;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.entity.a;
import com.taobao.themis.kernel.extension.page.f;
import com.taobao.themis.kernel.extension.page.s;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.logger.b;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.preload.c;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.j;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.o;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.text.d;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes9.dex */
public class tmk extends qqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WeexInstance c;
    private String d;
    private Activity e;
    private JSONObject f;
    private FrameLayout g;

    static {
        kge.a(406995874);
    }

    public static /* synthetic */ Object ipc$super(tmk tmkVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -69967319:
                super.a((qqo) objArr[0]);
                return null;
            case 90991720:
                super.a();
                return null;
            case 94685804:
                super.e();
                return null;
            case 95609325:
                super.f();
                return null;
            case 104844535:
                super.p();
                return null;
            case 105768056:
                super.q();
                return null;
            case 108538619:
                super.t();
                return null;
            case 109462140:
                super.u();
                return null;
            case 1914437276:
                super.b((String) objArr[0], (JSON) objArr[1]);
                return null;
            case 2045969029:
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.qqq
    public void a(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8072587d", new Object[]{this, str, json});
        }
    }

    @Override // tb.qqq
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "Weex";
    }

    @Override // tb.qqq
    public Bitmap di_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("db94d7df", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ ITMSPage a(tmk tmkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("ee44b93b", new Object[]{tmkVar}) : tmkVar.b;
    }

    public static /* synthetic */ void a(tmk tmkVar, qqo qqoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add5b447", new Object[]{tmkVar, qqoVar});
        } else {
            tmkVar.b(qqoVar);
        }
    }

    public static /* synthetic */ f b(tmk tmkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("89f1e834", new Object[]{tmkVar}) : tmkVar.f33035a;
    }

    public static /* synthetic */ f c(tmk tmkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("e10fd913", new Object[]{tmkVar}) : tmkVar.f33035a;
    }

    public static /* synthetic */ ITMSPage d(tmk tmkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("77ce8858", new Object[]{tmkVar}) : tmkVar.b;
    }

    public static /* synthetic */ String e(tmk tmkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d89fc356", new Object[]{tmkVar}) : tmkVar.d;
    }

    public static /* synthetic */ void f(tmk tmkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a947dd0b", new Object[]{tmkVar});
        } else {
            tmkVar.h();
        }
    }

    public tmk(ITMSPage iTMSPage) {
        super(iTMSPage);
        this.e = iTMSPage.b().o();
        this.g = new FrameLayout(this.e);
        if (this.e == null) {
            return;
        }
        this.d = iTMSPage.e();
        this.f = this.b.c().f().getJSONObject(a.KEY_WEEX_INIT_DATA);
        a(this.e, this.d);
        s sVar = (s) iTMSPage.a(s.class);
        if (sVar == null || iTMSPage.b().j() != TMSSolutionType.WEEX) {
            return;
        }
        sVar.a(new s.c() { // from class: tb.tmk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.themis.kernel.extension.page.s.c
            public int b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
                }
                return 9;
            }

            @Override // com.taobao.themis.kernel.extension.page.s.c
            public boolean a(ITMSPage iTMSPage2, TMSBackPressedType tMSBackPressedType) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("19000c3b", new Object[]{this, iTMSPage2, tMSBackPressedType})).booleanValue();
                }
                if (!TMSBackPressedType.ON_KEY_DOWN.equals(tMSBackPressedType) || tmk.this.c == null || !tmk.this.c.canGoBack()) {
                    return false;
                }
                tmk.this.c.goBack();
                return true;
            }
        });
    }

    @Override // tb.qqn, tb.qqq
    public void b(qqp qqpVar, qqo qqoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f559a1ca", new Object[]{this, qqpVar, qqoVar});
            return;
        }
        if (qqpVar == null) {
            qqpVar = new qqp();
            qqpVar.f33036a = this.d;
        }
        WeexInstance weexInstance = this.c;
        if (weexInstance != null) {
            weexInstance.destroy();
        }
        this.d = qqpVar.f33036a;
        this.f = qqpVar.b;
        a(this.e, this.d);
        a(qqoVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tmk.a(android.content.Context, java.lang.String):void");
    }

    private static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str2)) {
            return false;
        }
        try {
            for (String str3 : str2.split(",")) {
                if (c(str, str3)) {
                    return true;
                }
            }
        } catch (Exception e) {
            g.c("LayoutNG", "isMatchTargetList exception: ", e);
        }
        return false;
    }

    private static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{str, str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return false;
        }
        if (!str.startsWith(k.HTTPS_PREFIX) || !str2.startsWith(k.HTTPS_PREFIX)) {
            return str.contains(str2);
        }
        Uri b = o.b(str);
        Uri b2 = o.b(str2);
        return b != null && b2 != null && StringUtils.equals(b.getHost(), b2.getHost()) && StringUtils.equals(b.getPath(), b2.getPath());
    }

    @Override // tb.qqn, tb.qqq
    public void a(final qqo qqoVar) {
        ITMSPage iTMSPage;
        byte[] bytes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd46229", new Object[]{this, qqoVar});
            return;
        }
        super.a(qqoVar);
        if (this.c == null) {
            return;
        }
        if (n.aJ()) {
            a("tabBarHeight", Integer.valueOf(qqc.r(this.b)));
        }
        if (n.az() && (iTMSPage = this.b) != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                bytes = qqc.a(iTMSPage, true).getBytes(StandardCharsets.UTF_8);
            } else {
                bytes = qqc.a(iTMSPage, true).getBytes();
            }
            this.c.execute(bytes, "injected.js");
        }
        final com.taobao.themis.kernel.extension.page.f fVar = (com.taobao.themis.kernel.extension.page.f) this.b.a(com.taobao.themis.kernel.extension.page.f.class);
        if (fVar != null && fVar.d()) {
            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, "ON_BIND_MAINDOCUMENT_EXTENSION", b.a(this.f33035a), b.a(this.b), new JSONObject());
            fVar.a(new f.b() { // from class: tb.tmk.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.themis.kernel.extension.page.f.b
                public void a(c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f61bb256", new Object[]{this, cVar});
                    } else if (tmk.a(tmk.this) == null || tmk.b(tmk.this) == null) {
                        fVar.a();
                    } else {
                        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, "ON_FINISH_MAINDOCUMENT_EXTENSION", b.a(tmk.c(tmk.this)), b.a(tmk.d(tmk.this)), new JSONObject());
                        if (cVar.b() != null) {
                            tmk.this.c.initWithData(cVar.b(), tmk.e(tmk.this));
                        } else {
                            tmk.this.c.initWithURL(tmk.e(tmk.this));
                        }
                        com.taobao.themis.kernel.utils.a.a(new Runnable() { // from class: tb.tmk.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    tmk.a(tmk.this, qqoVar);
                                }
                            }
                        });
                    }
                }
            });
            return;
        }
        this.c.initWithURL(this.d);
        b(qqoVar);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c == null) {
        } else {
            if (this.g.getChildCount() > 0) {
                this.g.removeAllViews();
            }
            this.g.addView(this.c.getRootView());
        }
    }

    private void b(final qqo qqoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5768aa", new Object[]{this, qqoVar});
        } else if (this.b == null || this.f33035a == null || this.c == null) {
        } else {
            c();
            if (n.aq() || this.f33035a.j() == TMSSolutionType.UNIAPP) {
                this.c.execute(j.a(this.b).getBytes(d.UTF_8), "safeArea.js");
            }
            this.c.execute(j.b(this.b).getBytes(d.UTF_8), "titleBarPos.js");
            this.c.render(WeexValueImpl.ofJSON(this.f));
            this.c.addInstanceListener(new h() { // from class: tb.tmk.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex.h
                public void onDestroyed(WeexInstance weexInstance) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onEngineException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onExecuteFailed(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onExecuteSuccess(WeexInstance weexInstance) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onScriptException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
                    }
                }

                @Override // com.taobao.android.weex.h
                public void onInitSuccess(WeexInstance weexInstance, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
                        return;
                    }
                    qqo qqoVar2 = qqoVar;
                    if (qqoVar2 == null) {
                        return;
                    }
                    qqoVar2.a();
                }

                @Override // com.taobao.android.weex.h
                public void onInitFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                        return;
                    }
                    qqo qqoVar2 = qqoVar;
                    if (qqoVar2 != null && weexErrorType != null) {
                        qqoVar2.a("TMS_ERR_WEEX_" + weexErrorType.name(), str);
                    }
                    tmk.f(tmk.this);
                }

                @Override // com.taobao.android.weex.h
                public void onRenderSuccess(WeexInstance weexInstance, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
                        return;
                    }
                    qqo qqoVar2 = qqoVar;
                    if (qqoVar2 == null) {
                        return;
                    }
                    qqoVar2.b();
                }

                @Override // com.taobao.android.weex.h
                public void onRenderFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                    } else {
                        tmk.f(tmk.this);
                    }
                }
            });
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.b == null || this.b.f() == null || this.b.f().getCurrentActivity() == null) {
        } else {
            if (n.bF()) {
                HashMap hashMap = new HashMap();
                hashMap.put("category", mbn.BROWSER_ONLY_CATEGORY);
                hashMap.put("skipPreProcessor", true);
                hashMap.put("disableTransition", true);
                hashMap.put("disallowLoopback", true);
                INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) qpt.b(INavigatorAdapter.class);
                if (iNavigatorAdapter == null) {
                    return;
                }
                iNavigatorAdapter.openURL(this.b.f().getCurrentActivity(), this.d, null, null, hashMap);
            } else {
                Nav.from(this.b.f().getCurrentActivity()).withCategory(mbn.BROWSER_ONLY_CATEGORY).skipPreprocess().disableTransition().disallowLoopback().toUri(this.d);
            }
            this.b.b().r();
        }
    }

    public i a(final boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("8f61ac6f", new Object[]{this, new Boolean(z)}) : new i() { // from class: tb.tmk.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.ui.i
            public View a(Context context, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("2955c7b6", new Object[]{this, context, bundle});
                }
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                if (!z) {
                    return frameLayout;
                }
                frameLayout.setBackgroundColor(-1);
                return frameLayout;
            }

            @Override // com.taobao.android.weex_framework.ui.i
            public void a(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("39112e6", new Object[]{this, runnable});
                } else {
                    runnable.run();
                }
            }
        };
    }

    @Override // tb.qqq
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.g;
    }

    @Override // tb.qqn, tb.qqq
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        WeexInstance weexInstance = this.c;
        if (weexInstance != null) {
            weexInstance.onActivityPause();
        }
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_LIFECYCLE, b.a(this.b), com.taobao.themis.kernel.logger.a.a(b.a(this.b)), com.taobao.themis.kernel.utils.f.a(new Pair("name", "WeexInstance.onActivityPause")));
    }

    @Override // tb.qqn, tb.qqq
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        WeexInstance weexInstance = this.c;
        if (weexInstance != null) {
            weexInstance.onActivityResume();
        }
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_LIFECYCLE, b.a(this.b), com.taobao.themis.kernel.logger.a.a(b.a(this.b)), com.taobao.themis.kernel.utils.f.a(new Pair("name", "WeexInstance.onActivityResume")));
    }

    @Override // tb.qqn, tb.qqq
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        super.p();
        WeexInstance weexInstance = this.c;
        if (weexInstance != null) {
            weexInstance.onActivityStart();
        }
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_LIFECYCLE, b.a(this.b), com.taobao.themis.kernel.logger.a.a(b.a(this.b)), com.taobao.themis.kernel.utils.f.a(new Pair("name", "WeexInstance.onActivityStart")));
    }

    @Override // tb.qqn, tb.qqq
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        super.q();
        WeexInstance weexInstance = this.c;
        if (weexInstance != null) {
            weexInstance.onActivityStop();
        }
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_LIFECYCLE, b.a(this.b), com.taobao.themis.kernel.logger.a.a(b.a(this.b)), com.taobao.themis.kernel.utils.f.a(new Pair("name", "WeexInstance.onActivityStop")));
    }

    @Override // tb.qqn, tb.qqq
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.a(i, i2, intent);
        WeexInstance weexInstance = this.c;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onActivityResult(i, i2, intent);
    }

    @Override // tb.qqn, tb.qqq
    public void b(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("721bfe9c", new Object[]{this, str, json});
            return;
        }
        super.b(str, json);
        WeexInstance weexInstance = this.c;
        if (weexInstance == null) {
            return;
        }
        weexInstance.dispatchEvent(WeexEventTarget.WINDOW_TARGET, str, e.b().a((JSONObject) json));
    }

    @Override // tb.qqn, tb.qqq
    public void a(String str, String str2, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578c98f3", new Object[]{this, str, str2, json});
            return;
        }
        WeexEventTarget weexEventTarget = WeexEventTarget.WINDOW_TARGET;
        if (com.taobao.android.weex_framework.util.a.ATOM_EXT_window.equals(str)) {
            weexEventTarget = WeexEventTarget.WINDOW_TARGET;
        } else if (AgooConstants.MESSAGE_BODY.equals(str)) {
            weexEventTarget = WeexEventTarget.BODY_TARGET;
        } else if ("document".equals(str)) {
            weexEventTarget = WeexEventTarget.DOCUMENT_TARGET;
        } else if ("weex".equals(str)) {
            weexEventTarget = WeexEventTarget.WEEX_TARGET;
        }
        WeexInstance weexInstance = this.c;
        if (weexInstance == null) {
            return;
        }
        weexInstance.dispatchEvent(weexEventTarget, str2, e.b().a((JSONObject) json));
    }

    @Override // tb.qqq
    public void a(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3ac339", new Object[]{this, bArr, str});
            return;
        }
        WeexInstance weexInstance = this.c;
        if (weexInstance == null) {
            return;
        }
        weexInstance.execute(bArr, str);
    }

    @Override // tb.qqq
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        WeexInstance weexInstance = this.c;
        if (weexInstance == null) {
            return;
        }
        weexInstance.execute(str.getBytes(), str2);
    }

    @Override // tb.qqn, tb.qqq
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        WeexInstance weexInstance = this.c;
        if (weexInstance == null || !"tabBarHeight".equals(str) || !(obj instanceof Integer)) {
            return;
        }
        com.taobao.android.weex.o oVar = new com.taobao.android.weex.o();
        oVar.a(((Integer) obj).intValue());
        weexInstance.updateRenderEnvironments(oVar);
    }

    @Override // tb.qqn, tb.qqq
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        super.t();
        WeexInstance weexInstance = this.c;
        if (weexInstance != null) {
            weexInstance.onViewAppear();
        }
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_LIFECYCLE, b.a(this.b), com.taobao.themis.kernel.logger.a.a(b.a(this.b)), com.taobao.themis.kernel.utils.f.a(new Pair("name", "WeexInstance.onViewAppear")));
    }

    @Override // tb.qqn, tb.qqq
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        super.u();
        WeexInstance weexInstance = this.c;
        if (weexInstance != null) {
            weexInstance.onViewDisappear();
        }
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_LIFECYCLE, b.a(this.b), com.taobao.themis.kernel.logger.a.a(b.a(this.b)), com.taobao.themis.kernel.utils.f.a(new Pair("name", "WeexInstance.onViewDisappear")));
    }

    @Override // tb.qqn, tb.qqq
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        WeexInstance weexInstance = this.c;
        if (weexInstance == null) {
            return;
        }
        weexInstance.destroy();
        this.c = null;
    }
}
