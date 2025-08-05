package com.etao.feimagesearch.quicksearch;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.o;
import com.etao.feimagesearch.util.s;
import com.taobao.android.searchbaseframe.util.f;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.q;
import com.taobao.search.common.util.k;
import com.taobao.taobao.R;
import java.util.Map;
import kotlin.TypeCastException;
import tb.cou;
import tb.cox;
import tb.kge;

/* loaded from: classes3.dex */
public final class ScreenRecordActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MediaProjectionManager b;
    private MediaProjection c;
    private com.etao.feimagesearch.quicksearch.a e;
    private Dialog f;
    private boolean g;
    private p h;
    private Intent i;

    /* renamed from: a  reason: collision with root package name */
    private final int f6950a = 1;
    private boolean d = true;
    private Handler j = new Handler(Looper.getMainLooper());

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ Intent c;

        public a(int i, Intent intent) {
            this.b = i;
            this.c = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ScreenRecordActivity screenRecordActivity = ScreenRecordActivity.this;
            if (ScreenRecordActivity.a(screenRecordActivity, this.b, this.c, true, ScreenRecordActivity.c(screenRecordActivity))) {
                return;
            }
            ScreenRecordActivity.d(ScreenRecordActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ScreenRecordActivity.a(ScreenRecordActivity.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ScreenRecordActivity.a(ScreenRecordActivity.this, com.etao.feimagesearch.quicksearch.b.Instance.b(), com.etao.feimagesearch.quicksearch.b.Instance.a(), false, ScreenRecordActivity.c(ScreenRecordActivity.this))) {
            } else {
                ScreenRecordActivity.d(ScreenRecordActivity.this);
            }
        }
    }

    static {
        kge.a(921639893);
    }

    public static /* synthetic */ Object ipc$super(ScreenRecordActivity screenRecordActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static final /* synthetic */ void a(ScreenRecordActivity screenRecordActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb46d64", new Object[]{screenRecordActivity});
        } else {
            screenRecordActivity.c();
        }
    }

    public static final /* synthetic */ boolean a(ScreenRecordActivity screenRecordActivity, int i, Intent intent, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dadf2060", new Object[]{screenRecordActivity, new Integer(i), intent, new Boolean(z), new Boolean(z2)})).booleanValue() : screenRecordActivity.a(i, intent, z, z2);
    }

    public static final /* synthetic */ void b(ScreenRecordActivity screenRecordActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f2dd03", new Object[]{screenRecordActivity});
        } else {
            screenRecordActivity.b();
        }
    }

    public static final /* synthetic */ boolean c(ScreenRecordActivity screenRecordActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77314ca6", new Object[]{screenRecordActivity})).booleanValue() : screenRecordActivity.d;
    }

    public static final /* synthetic */ void d(ScreenRecordActivity screenRecordActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fbc41", new Object[]{screenRecordActivity});
        } else {
            screenRecordActivity.d();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        com.etao.feimagesearch.j.INSTANCE.b();
        if (com.etao.feimagesearch.config.b.dR()) {
            o.b();
        }
        if (com.etao.feimagesearch.config.b.v()) {
            cou.a(this, k.PAILITAO_URL);
            finish();
            return;
        }
        cox.a(this, "Page_PltScreenRecord");
        setTitle("");
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        Object systemService = getSystemService("media_projection");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        }
        this.b = (MediaProjectionManager) systemService;
        if (this.b == null) {
            finish();
            return;
        }
        this.d = com.taobao.application.common.c.a().a("isInBackground", false);
        cox.a("plt_qs_clk", new String[0]);
        if (this.d) {
            cox.a("plt_qs_otherapp_clk", new String[0]);
        }
        if (getApplicationInfo().targetSdkVersion >= 30) {
            this.i = new Intent(getApplicationContext(), ScreenRecordForegroundService.class);
            if (Build.VERSION.SDK_INT >= 26) {
                startForegroundService(this.i);
            } else {
                startService(this.i);
            }
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b(), 500L);
        a();
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String bW = com.etao.feimagesearch.config.b.bW();
        this.h = q.a().a(this);
        p pVar = this.h;
        if (pVar == null) {
            kotlin.jvm.internal.q.a();
        }
        pVar.registerRenderListener(new c());
        s.Companion.a(this.h, bW, bW, null, null);
    }

    /* loaded from: classes3.dex */
    public static final class c implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.weex_framework.g
        public void onDestroyed(MUSDKInstance instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, instance});
            } else {
                kotlin.jvm.internal.q.c(instance, "instance");
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onFatalException(p instance, int i, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bcd71451", new Object[]{this, instance, new Integer(i), errorMsg});
                return;
            }
            kotlin.jvm.internal.q.c(instance, "instance");
            kotlin.jvm.internal.q.c(errorMsg, "errorMsg");
        }

        @Override // com.taobao.android.weex_framework.g
        public void onForeground(p instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fafc624", new Object[]{this, instance});
            } else {
                kotlin.jvm.internal.q.c(instance, "instance");
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onJSException(p instance, int i, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("831fc52e", new Object[]{this, instance, new Integer(i), errorMsg});
                return;
            }
            kotlin.jvm.internal.q.c(instance, "instance");
            kotlin.jvm.internal.q.c(errorMsg, "errorMsg");
        }

        @Override // com.taobao.android.weex_framework.g
        public void onPrepareSuccess(p instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9635d60b", new Object[]{this, instance});
            } else {
                kotlin.jvm.internal.q.c(instance, "instance");
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshFailed(p instance, int i, String errorMsg, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f63c5f14", new Object[]{this, instance, new Integer(i), errorMsg, new Boolean(z)});
                return;
            }
            kotlin.jvm.internal.q.c(instance, "instance");
            kotlin.jvm.internal.q.c(errorMsg, "errorMsg");
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshSuccess(p instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, instance});
            } else {
                kotlin.jvm.internal.q.c(instance, "instance");
            }
        }

        public c() {
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderSuccess(p instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fdf238", new Object[]{this, instance});
                return;
            }
            kotlin.jvm.internal.q.c(instance, "instance");
            ScreenRecordActivity.b(ScreenRecordActivity.this);
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderFailed(p instance, int i, String errorMsg, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4253181b", new Object[]{this, instance, new Integer(i), errorMsg, new Boolean(z)});
                return;
            }
            kotlin.jvm.internal.q.c(instance, "instance");
            kotlin.jvm.internal.q.c(errorMsg, "errorMsg");
            ScreenRecordActivity.b(ScreenRecordActivity.this);
        }
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        p pVar = this.h;
        if (pVar != null) {
            pVar.destroy();
        }
        this.h = null;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.g = false;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.g = true;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        Dialog dialog = this.f;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        try {
            MediaProjection mediaProjection = this.c;
            if (mediaProjection != null) {
                mediaProjection.stop();
            }
        } catch (Exception unused) {
        }
        Intent intent = this.i;
        if (intent != null) {
            stopService(intent);
        }
        com.etao.feimagesearch.quicksearch.a aVar = this.e;
        if (aVar != null) {
            aVar.a();
        }
        b();
    }

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        cox.a("plt_qs_start_record", new String[0]);
        MediaProjectionManager mediaProjectionManager = this.b;
        if (mediaProjectionManager == null) {
            Toast.makeText(this, com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19057), 0).show();
            finish();
        } else if (Build.VERSION.SDK_INT >= 34 || com.etao.feimagesearch.quicksearch.b.Instance.a() == null) {
            startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), this.f6950a);
        } else {
            this.j.postDelayed(new d(), 1L);
        }
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        cox.a("plt_qs_fail", new String[0]);
        Toast.makeText(this, com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19052), 0).show();
        stopService(this.i);
        finish();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        ScreenRecordActivity screenRecordActivity = this;
        cox.a(screenRecordActivity, "Page_PltScreenRecord");
        if (i != this.f6950a) {
            return;
        }
        if (i2 == 0) {
            cox.a("plt_qs_denied", new String[0]);
            Toast.makeText(screenRecordActivity, com.alibaba.ability.localization.b.a(R.string.tao_screen_shot_cancel), 0).show();
            finish();
            return;
        }
        com.etao.feimagesearch.quicksearch.b.Instance.a(i2);
        com.etao.feimagesearch.quicksearch.b.Instance.a(intent);
        cox.a("plt_qs_authorized", new String[0]);
        new Handler(Looper.getMainLooper()).postDelayed(new a(i2, intent), 300L);
    }

    private final boolean a(int i, Intent intent, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a363dedc", new Object[]{this, new Integer(i), intent, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        try {
            MediaProjectionManager mediaProjectionManager = this.b;
            this.c = mediaProjectionManager != null ? mediaProjectionManager.getMediaProjection(i, intent) : null;
            Map<String, String> params = f.a(getIntent());
            Point point = new Point();
            Window window = getWindow();
            kotlin.jvm.internal.q.a((Object) window, "window");
            WindowManager windowManager = window.getWindowManager();
            kotlin.jvm.internal.q.a((Object) windowManager, "window.windowManager");
            windowManager.getDefaultDisplay().getRealSize(point);
            this.e = new com.etao.feimagesearch.quicksearch.a();
            com.etao.feimagesearch.quicksearch.a aVar = this.e;
            if (aVar != null) {
                MediaProjection mediaProjection = this.c;
                int i2 = point.x;
                int i3 = point.y;
                Resources resources = getResources();
                kotlin.jvm.internal.q.a((Object) resources, "resources");
                int i4 = resources.getDisplayMetrics().densityDpi;
                kotlin.jvm.internal.q.a((Object) params, "params");
                aVar.a(this, mediaProjection, i2, i3, i4, z, z2, params);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
