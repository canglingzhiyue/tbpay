package com.taobao.themis.container.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qos;
import tb.qqb;
import tb.trn;
import tb.xla;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u00013B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0015H\u0016J\u001a\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\u0015H\u0016J\b\u0010/\u001a\u00020\u0015H\u0016J\b\u00100\u001a\u00020\u0015H\u0016J\b\u00101\u001a\u00020\u0015H\u0016J\b\u00102\u001a\u00020\u0015H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u00064"}, d2 = {"Lcom/taobao/themis/container/app/TMSAppContainerHelper;", "Lcom/taobao/themis/container/TMSContainerHelper;", "activity", "Landroid/support/v4/app/FragmentActivity;", "splashViewContainer", "Landroid/view/ViewGroup;", "(Landroid/support/v4/app/FragmentActivity;Landroid/view/ViewGroup;)V", "CRASH_INFO_KEY", "", RPCDataItems.SWITCH_TAG_LOG, "mCrashInfoData", "Lcom/alibaba/fastjson/JSONObject;", "mIsDestroy", "", "mJavaCrashListener", "Lcom/taobao/themis/container/app/TMSAppContainerHelper$JavaCrashListener;", "mPageStackStatusCallback", "Lcom/taobao/themis/kernel/page/ITMSPageManager$PageStackStatusCallback;", "getMPageStackStatusCallback", "()Lcom/taobao/themis/kernel/page/ITMSPageManager$PageStackStatusCallback;", "buildCrashInfo", "", "buildJavaCrashMap", "", "", "clearCrashInfoData", "getContainerType", "Lcom/taobao/themis/kernel/TMSContainerType;", "init", "Lcom/taobao/themis/kernel/TMSInstance;", "url", "extraData", "launch", "solutionType", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "renderListener", "Lcom/taobao/themis/kernel/TMSInstance$IRenderListener;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", MessageID.onDestroy, "onKeyDown", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onPause", "onResume", "onStart", MessageID.onStop, "setCrashListener", "JavaCrashListener", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class a extends qos {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FragmentActivity f22356a;
    private final qqb.b b;
    private volatile boolean c;
    private final String d;
    private final String e;
    private JSONObject f;
    private final b g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/themis/container/app/TMSAppContainerHelper$mPageStackStatusCallback$1", "Lcom/taobao/themis/kernel/page/ITMSPageManager$PageStackStatusCallback;", "onPageStackEmpty", "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.container.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0931a implements qqb.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0931a() {
        }

        @Override // tb.qqb.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (a.b(a.this) || a.d(a.this)) {
            } else {
                a.a(a.this).finish();
            }
        }
    }

    static {
        kge.a(-2124544650);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 91915241) {
            super.b();
            return null;
        } else if (hashCode == 691170269) {
            return super.a((String) objArr[0], (JSONObject) objArr[1]);
        } else {
            if (hashCode != 1135491724) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.a((TMSSolutionType) objArr[0], (f.c) objArr[1]);
            return null;
        }
    }

    public void a(Configuration newConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510fd488", new Object[]{this, newConfig});
        } else {
            q.d(newConfig, "newConfig");
        }
    }

    public static final /* synthetic */ Activity a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("9ccb63e", new Object[]{aVar}) : aVar.d();
    }

    public static final /* synthetic */ boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8726438d", new Object[]{aVar})).booleanValue() : aVar.c;
    }

    public static final /* synthetic */ Map c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1fae709d", new Object[]{aVar}) : aVar.m();
    }

    public static final /* synthetic */ boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3562254b", new Object[]{aVar})).booleanValue() : aVar.r();
    }

    public /* synthetic */ a(FragmentActivity fragmentActivity, ViewGroup viewGroup, int i, o oVar) {
        this(fragmentActivity, (i & 2) != 0 ? null : viewGroup);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FragmentActivity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        q.d(activity, "activity");
        this.f22356a = activity;
        this.d = "TMSAppContainerHelper";
        this.e = "commonDatas";
        this.f = new JSONObject();
        this.g = new b();
        this.b = new C0931a();
    }

    public qqb.b h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qqb.b) ipChange.ipc$dispatch("a0889937", new Object[]{this}) : this.b;
    }

    @Override // tb.qos, tb.trk
    public com.taobao.themis.kernel.f a(String url, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.f) ipChange.ipc$dispatch("29326bdd", new Object[]{this, url, jSONObject});
        }
        q.d(url, "url");
        com.taobao.themis.kernel.f a2 = super.a(url, jSONObject);
        a2.a(new trn());
        a2.a(new xla(a2));
        return a2;
    }

    @Override // tb.qos, tb.trk
    public void a(TMSSolutionType tMSSolutionType, f.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ae3a8c", new Object[]{this, tMSSolutionType, cVar});
            return;
        }
        super.a(tMSSolutionType, cVar);
        k();
        if (com.taobao.themis.utils.f.a(d())) {
            Toast.makeText(d(), "Themis 容器", 1).show();
        }
        d().overridePendingTransition(R.anim.tms_fragment_translate_in_left, R.anim.tms_fragment_translate_out_left);
    }

    @Override // tb.trk
    public TMSContainerType j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSContainerType) ipChange.ipc$dispatch("d27e2c5", new Object[]{this}) : TMSContainerType.GENERIC;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.themis.kernel.f e = e();
        if (e == null) {
            return;
        }
        e.E();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.themis.kernel.f e = e();
        if (e == null) {
            return;
        }
        e.z();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.taobao.themis.kernel.f e = e();
        if (e == null) {
            return;
        }
        e.y();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        com.taobao.themis.kernel.f e = e();
        if (e == null) {
            return;
        }
        e.F();
    }

    @Override // tb.qos
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = true;
        super.b();
        com.taobao.themis.kernel.f e = e();
        if (e != null) {
            e.r();
        }
        n();
        TCrashSDK.instance().removeJvmUncaughtCrashListener(this.g);
    }

    public boolean a(int i, KeyEvent keyEvent) {
        com.taobao.themis.kernel.f e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14b42c5", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4 && (e = e()) != null) {
            return e.a(TMSBackPressedType.ON_KEY_DOWN);
        }
        return false;
    }

    private final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        l();
        try {
            TCrashSDK instance = TCrashSDK.instance();
            q.b(instance, "TCrashSDK.instance()");
            instance.getCrashCaughtHeader().addHeaderInfo(this.e, new JSONObject(this.f).toJSONString());
            TCrashSDK.instance().addJvmUncaughtCrashListener(this.g);
        } catch (Throwable th) {
            TMSLogger.a(this.d, th);
        }
    }

    private final void l() {
        TMSSolutionType j;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        com.taobao.themis.kernel.f e = e();
        String str = null;
        String h = e != null ? e.h() : null;
        com.taobao.themis.kernel.f e2 = e();
        String g = e2 != null ? e2.g() : null;
        com.taobao.themis.kernel.f e3 = e();
        if (e3 != null && (j = e3.j()) != null) {
            str = j.name();
        }
        String str2 = h;
        if (!(str2 == null || str2.length() == 0)) {
            this.f.put((JSONObject) "appId", h);
        }
        String str3 = g;
        if (!(str3 == null || str3.length() == 0)) {
            this.f.put((JSONObject) "url", g);
        }
        String str4 = str;
        if (str4 == null || str4.length() == 0) {
            z = true;
        }
        if (z) {
            return;
        }
        this.f.put((JSONObject) "solutionType", str);
    }

    private final Map<String, Object> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("44113da9", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(this.e, this.f);
        return hashMap;
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.f.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/container/app/TMSAppContainerHelper$JavaCrashListener;", "Lcom/taobao/android/tcrash/JvmUncaughtCrashListener;", "(Lcom/taobao/themis/container/app/TMSAppContainerHelper;)V", "onJvmUncaughtCrash", "", "", "", "thread", "Ljava/lang/Thread;", "throwable", "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public final class b implements JvmUncaughtCrashListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1162830507);
            kge.a(-1747099954);
        }

        public b() {
        }

        @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
        public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable throwable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, throwable});
            }
            q.d(thread, "thread");
            q.d(throwable, "throwable");
            return a.c(a.this);
        }
    }
}
