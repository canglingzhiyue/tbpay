package com.taobao.themis.widget.group;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.FrameLayout;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.search.common.util.i;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.utils.o;
import com.taobao.themis.widget.group.c;
import com.uc.webview.export.media.MessageID;
import java.net.URLDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.ljl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0014J\b\u0010\n\u001a\u00020\u0006H\u0014J\b\u0010\u000b\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/taobao/themis/widget/group/WidgetPreviewActivity;", "Landroid/support/v4/app/FragmentActivity;", "()V", "mGroupInstance", "Lcom/taobao/themis/widget/group/TMSWidgetGroupInstance;", i.b.MEASURE_ONCREATE, "", "savedInstanceState", "Landroid/os/Bundle;", MessageID.onDestroy, "onPause", "onResume", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class WidgetPreviewActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f22926a;

    static {
        kge.a(856380590);
    }

    public static /* synthetic */ Object ipc$super(WidgetPreviewActivity widgetPreviewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
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

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setContentView(frameLayout);
        String a2 = o.a(getIntent().getStringExtra("oriUrl"), "piUrl");
        if (a2 == null || (str = URLDecoder.decode(a2, "UTF-8")) == null) {
            str = "https://dev.weex.alibaba-inc.com/build/u/kjhwwmdc/mggj0o9xqc90?wh_weex=true&weex_mode=dom";
        }
        this.f22926a = new c(this, str, new a());
        c cVar = this.f22926a;
        if (cVar == null) {
            q.b("mGroupInstance");
        }
        frameLayout.addView(cVar.b());
        c cVar2 = this.f22926a;
        if (cVar2 == null) {
            q.b("mGroupInstance");
        }
        cVar2.a((WeexValue) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/widget/group/WidgetPreviewActivity$onCreate$1", "Lcom/taobao/themis/widget/group/TMSWidgetGroupInstance$RenderListener;", "onRenderError", "", "errorCode", "", "errorMsg", ljl.RENDER_SUCCESS_TIME, "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.widget.group.c.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                TMSLogger.d("TestActivity", "renderSuccess");
            }
        }

        @Override // com.taobao.themis.widget.group.c.a
        public void a(String errorCode, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, errorCode, errorMsg});
                return;
            }
            q.d(errorCode, "errorCode");
            q.d(errorMsg, "errorMsg");
            TMSLogger.d("TestActivity", "renderError");
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        c cVar = this.f22926a;
        if (cVar == null) {
            q.b("mGroupInstance");
        }
        cVar.d();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        c cVar = this.f22926a;
        if (cVar == null) {
            q.b("mGroupInstance");
        }
        cVar.c();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        c cVar = this.f22926a;
        if (cVar == null) {
            q.b("mGroupInstance");
        }
        cVar.e();
    }
}
