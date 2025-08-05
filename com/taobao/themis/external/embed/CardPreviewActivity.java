package com.taobao.themis.external.embed;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.search.common.util.i;
import com.taobao.themis.external.embed.a;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.uc.webview.export.media.MessageID;
import java.net.URLDecoder;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.kge;
import tb.ljl;
import tb.tnz;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0014J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0014J\b\u0010\u0016\u001a\u00020\u0006H\u0014J\b\u0010\u0017\u001a\u00020\u0006H\u0014J\b\u0010\u0018\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/taobao/themis/external/embed/CardPreviewActivity;", "Landroid/support/v4/app/FragmentActivity;", "()V", "card", "Lcom/taobao/themis/external/embed/TMSEmbed;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", i.b.MEASURE_ONCREATE, "savedInstanceState", "Landroid/os/Bundle;", MessageID.onDestroy, "onKeyDown", "", "keyCode", "event", "Landroid/view/KeyEvent;", "onPause", "onResume", "onStart", MessageID.onStop, "Companion", "themis_interface_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class CardPreviewActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "CardPreviewActivity";

    /* renamed from: a  reason: collision with root package name */
    private TMSEmbed f22405a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/taobao/themis/external/embed/CardPreviewActivity$onCreate$3$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public b(String str) {
            this.b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TMSEmbed a2 = CardPreviewActivity.a(CardPreviewActivity.this);
            StartParams startParams = new StartParams();
            startParams.setUrl(this.b);
            t tVar = t.INSTANCE;
            TMSEmbed.a(a2, startParams, null, 2, null);
        }
    }

    static {
        kge.a(-1378007613);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(CardPreviewActivity cardPreviewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
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
            case 2133689546:
                super.onStart();
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

    public static final /* synthetic */ TMSEmbed a(CardPreviewActivity cardPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbed) ipChange.ipc$dispatch("1a6a69e2", new Object[]{cardPreviewActivity});
        }
        TMSEmbed tMSEmbed = cardPreviewActivity.f22405a;
        if (tMSEmbed == null) {
            q.b("card");
        }
        return tMSEmbed;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/external/embed/CardPreviewActivity$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_interface_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(1234114891);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        TMSEmbedSolutionType m2371constructorimpl;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        CardPreviewActivity cardPreviewActivity = this;
        FrameLayout frameLayout = new FrameLayout(cardPreviewActivity);
        setContentView(frameLayout);
        String stringExtra = getIntent().getStringExtra("oriUrl");
        String solution = com.taobao.themis.utils.o.a(stringExtra, "tms_solution");
        try {
            Result.a aVar = Result.Companion;
            q.b(solution, "solution");
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        if (solution == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String upperCase = solution.toUpperCase();
        q.b(upperCase, "(this as java.lang.String).toUpperCase()");
        m2371constructorimpl = Result.m2371constructorimpl(TMSEmbedSolutionType.valueOf(upperCase));
        TMSEmbedSolutionType tMSEmbedSolutionType = TMSEmbedSolutionType.WEB_SINGLE_PAGE;
        if (Result.m2377isFailureimpl(m2371constructorimpl)) {
            m2371constructorimpl = tMSEmbedSolutionType;
        }
        TMSEmbedSolutionType tMSEmbedSolutionType2 = (TMSEmbedSolutionType) m2371constructorimpl;
        String a2 = com.taobao.themis.utils.o.a(stringExtra, "tms_reload_url");
        String decode = a2 != null ? URLDecoder.decode(a2, "UTF-8") : null;
        this.f22405a = new TMSEmbed(this, tMSEmbedSolutionType2);
        TMSEmbed tMSEmbed = this.f22405a;
        if (tMSEmbed == null) {
            q.b("card");
        }
        tMSEmbed.a(new c());
        TMSEmbed tMSEmbed2 = this.f22405a;
        if (tMSEmbed2 == null) {
            q.b("card");
        }
        StartParams startParams = new StartParams();
        startParams.setUrl(stringExtra);
        t tVar = t.INSTANCE;
        tMSEmbed2.a(startParams);
        TMSEmbed tMSEmbed3 = this.f22405a;
        if (tMSEmbed3 == null) {
            q.b("card");
        }
        tMSEmbed3.a();
        TMSEmbed tMSEmbed4 = this.f22405a;
        if (tMSEmbed4 == null) {
            q.b("card");
        }
        frameLayout.addView(tMSEmbed4.b());
        String str = decode;
        if (str != null && !n.a((CharSequence) str)) {
            z = false;
        }
        if (z) {
            return;
        }
        Button button = new Button(cardPreviewActivity);
        button.setText("reload");
        button.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        button.setOnClickListener(new b(decode));
        t tVar2 = t.INSTANCE;
        frameLayout.addView(button);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/taobao/themis/external/embed/CardPreviewActivity$onCreate$1", "Lcom/taobao/themis/external/embed/TMSEmbed$IRenderListener;", ljl.LAUNCHER_FINISH_TIME, "", "onPop", "onRenderFailed", "errorCode", "", "errorMsg", ljl.RENDER_SUCCESS_TIME, "themis_interface_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c extends a.C0936a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
        /* loaded from: classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Toast.makeText(CardPreviewActivity.this, "onPop", 0).show();
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/themis/external/embed/CardPreviewActivity$onCreate$1$onLaunchFinish$1", "Lcom/taobao/themis/kernel/extension/controller/IContainerExtension$OnCloseHandler;", "onClose", "", "themis_interface_release"}, k = 1, mv = {1, 4, 1})
        /* loaded from: classes9.dex */
        public static final class b implements tnz.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // tb.tnz.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    CardPreviewActivity.this.finish();
                }
            }
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -650670724) {
                super.a((String) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 90991720) {
                super.a();
                return null;
            } else if (hashCode != 94685804) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.e();
                return null;
            }
        }

        public c() {
        }

        @Override // com.taobao.themis.external.embed.a.C0936a
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
                return;
            }
            super.e();
            tnz tnzVar = (tnz) CardPreviewActivity.a(CardPreviewActivity.this).a(tnz.class);
            if (tnzVar == null) {
                return;
            }
            tnzVar.a(new b());
        }

        @Override // com.taobao.themis.external.embed.a.C0936a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            super.a();
            TMSLogger.d(CardPreviewActivity.TAG, ljl.RENDER_SUCCESS_TIME);
        }

        @Override // com.taobao.themis.external.embed.a.C0936a
        public void a(String errorCode, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, errorCode, errorMsg});
                return;
            }
            q.d(errorCode, "errorCode");
            q.d(errorMsg, "errorMsg");
            super.a(errorCode, errorMsg);
            TMSLogger.d(CardPreviewActivity.TAG, "onRenderFailed errorCode:" + errorCode + " errorMsg:" + errorMsg);
        }

        @Override // com.taobao.themis.external.embed.a.C0936a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                CardPreviewActivity.this.runOnUiThread(new a());
            }
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        TMSEmbed tMSEmbed = this.f22405a;
        if (tMSEmbed == null) {
            q.b("card");
        }
        tMSEmbed.d();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TMSEmbed tMSEmbed = this.f22405a;
        if (tMSEmbed == null) {
            q.b("card");
        }
        tMSEmbed.f();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TMSEmbed tMSEmbed = this.f22405a;
        if (tMSEmbed == null) {
            q.b("card");
        }
        tMSEmbed.g();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        TMSEmbed tMSEmbed = this.f22405a;
        if (tMSEmbed == null) {
            q.b("card");
        }
        tMSEmbed.e();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TMSEmbed tMSEmbed = this.f22405a;
        if (tMSEmbed == null) {
            q.b("card");
        }
        tMSEmbed.c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        TMSEmbed tMSEmbed = this.f22405a;
        if (tMSEmbed == null) {
            q.b("card");
        }
        tnz tnzVar = (tnz) tMSEmbed.a(tnz.class);
        if (tnzVar == null) {
            return super.onKeyDown(i, keyEvent);
        }
        if (tnzVar.b()) {
            tnzVar.a();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        TMSEmbed tMSEmbed = this.f22405a;
        if (tMSEmbed == null) {
            q.b("card");
        }
        tMSEmbed.a(i, i2, intent);
    }
}
