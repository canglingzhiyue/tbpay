package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.activity.BootImageActivity;
import com.taobao.tao.log.TLog;
import com.taobao.tao.welcome.Welcome;
import com.taobao.themis.kernel.i;
import com.uc.webview.export.media.MessageID;
import java.util.Map;

/* loaded from: classes.dex */
public class ked {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f30004a;
    private String b;
    private long c;
    private long d;
    private final keb e;
    private String f;
    private boolean g = false;
    private int h = 0;

    static {
        kge.a(-1488007663);
    }

    public ked(keb kebVar) {
        this.e = kebVar;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        long b = keo.b() - this.d;
        long c = kem.a().c();
        if (b < c) {
            kej.a(kem.TAG, "show failed: backTime=" + b + ", configTime=" + c);
        } else {
            z = false;
        }
        if (z) {
            kej.a("PageStateService", "onActivityResumed, return, isBackTooFast == true");
        }
        return z;
    }

    private static boolean a(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null) {
            return false;
        }
        try {
            kej.a("PageStateService", "isOutLink uri = " + data.toString());
            return "1".equals(data.getQueryParameter(i.KEY_AFC_LINK));
        } catch (Throwable th) {
            kej.a("PageStateService", "isOutLink throwable = " + th.toString());
            return false;
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        long b = keo.b();
        this.d = b;
        if (b <= this.c + kem.a().g()) {
            return false;
        }
        this.c = b;
        return true;
    }

    private boolean b(Intent intent) {
        Uri data;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null) {
            return false;
        }
        try {
            str = data.getQueryParameter("bootImage");
            kej.a("PageStateService", "onActivityResumed, return, checkSkip == true");
        } catch (UnsupportedOperationException unused) {
            kej.a("PageStateService", "onActivityResumed, return, checkSkip == true");
            str = "";
        } catch (Throwable th) {
            kej.a("PageStateService", "onActivityResumed, return, checkSkip == true");
            throw th;
        }
        return "0".equalsIgnoreCase(str);
    }

    private boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("792c4740", new Object[]{this, activity})).booleanValue() : TextUtils.equals(activity.getLocalClassName(), this.b) || TextUtils.equals(BootImageActivity.class.getCanonicalName(), this.b);
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        try {
            kej.a("PageStateService", "PageStateService enableOnResume activity：" + activity.getClass().getSimpleName());
            if (ker.a(activity)) {
                kej.a("PageStateService", "onActivityResumed, pageInErrorState return, isWelcome == true" + activity);
                ken.a("enable_onresume", "isWelcome", (String) null, (Map<String, String>) null);
            } else if (b(activity.getIntent())) {
                kej.a("PageStateService", "onActivityResumed, pageInErrorState SKIP_FROM_URI");
                ken.a("enable_onresume", "checkSkip", (String) null, (Map<String, String>) null);
            } else {
                boolean a2 = a(activity.getIntent());
                kej.a("PageStateService", "onActivityResumed, isOutLink = " + a2);
                boolean c = c();
                boolean b = ker.b(activity);
                kej.a("PageStateService", "onActivityResumed, isFromWelcome  = " + c + ",isHomepage = " + b + ", welcomeEnterCount = " + this.h);
                if (c && b && this.h <= 0) {
                    this.h++;
                    kej.a("PageStateService", "onActivityResumed, enter, fromWelcome && isHomePage " + activity);
                    kej.a("PageStateService", "开始冷启闪屏 coldStart");
                    this.g = true;
                    this.e.a(activity, a2);
                    return;
                }
                kej.a("PageStateService", "onActivityResumed, enter, !fromWelcome || !isHomePage " + activity);
                if (this.f30004a && c(activity)) {
                    if (a()) {
                        kej.a("PageStateService", "onActivityResumed, pageInErrorState isBackTooFast");
                        ken.a("enable_onresume", "isBackTooFast", (String) null, (Map<String, String>) null);
                        return;
                    } else if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null && activity.getIntent().getData().toString().equals("http://m.taobao.com/index.htm") && activity.getClass().getSimpleName().equals("Welcome")) {
                        kej.a("PageStateService", "onActivityResumed, pageInErrorState return hotStart isFirstHomePage");
                        ken.a("enable_onresume", "isFirstHomePage", (String) null, (Map<String, String>) null);
                        return;
                    } else {
                        TLog.logi(kem.TAG, "scene: hotstart1");
                        kej.a("PageStateService", "onActivityResumed, hotStart isOutLink=" + a2);
                        this.e.b(activity, a2);
                        return;
                    }
                }
                kej.a("PageStateService", "onActivityResumed, return, , fromBackground = " + this.f30004a + ", activity.getLocalClassName = " + activity.getLocalClassName() + ", lastLeaveActivityName = " + this.b);
                kej.a("PageStateService", "onActivityResumed, pageInErrorState notSameActivity || notFromBackground");
                ken.a("enable_onresume", "notSameActivity", (String) null, (Map<String, String>) null);
            }
        } catch (Throwable th) {
            try {
                kej.a("PageStateService", "onActivityResumed", th);
                this.e.a("onResume", th);
            } finally {
                this.f30004a = false;
                this.b = null;
            }
        }
    }

    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        try {
            kej.a("PageStateService", "PageStateService enableOnStop activity：" + activity.getClass().getSimpleName());
            a(activity.getClass().getSimpleName());
            if (!ker.a()) {
                kej.a("PageStateService", "enableOnStop not isInBackground ");
                return;
            }
            this.f30004a = true;
            this.b = activity.getLocalClassName();
            kej.a("PageStateService", "enableOnStop lastLeaveActivityName：" + this.b);
            if (c()) {
                kej.a("PageStateService", "enableOnStop isFromWelcome");
                return;
            }
            if (b()) {
                kej.a("PageStateService", "enableOnStop updateBootImageData");
                BootImageDataMgr.a().h();
            }
            this.e.a(activity);
        } catch (Throwable th) {
            kej.a("PageStateService", "onActivityStop", th);
            this.e.a(MessageID.onStop, th);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.f = str;
        kej.a("PageStateService", "PageStateService isFromWelcome frontActivityName：" + this.f);
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        kej.a("PageStateService", "PageStateService isFromWelcome frontActivityName：" + this.f);
        String str = this.f;
        return str == null || (TextUtils.equals(str, Welcome.class.getSimpleName()) && !this.g);
    }
}
