package com.taobao.message.kit.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.core.splitinstall.o;
import com.alibaba.android.split.core.tasks.d;
import com.alibaba.android.split.k;
import com.alibaba.android.split.u;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleListing;
import com.android.tools.bundleInfo.b;
import com.taobao.android.behavix.feature.a;
import com.taobao.appbundle.c;
import com.taobao.message.uikit.util.ActivityUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ao;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.v;
import kotlin.t;
import tb.bif;
import tb.kge;
import tb.ruk;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J`\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2%\u0010\u0011\u001a!\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000e0\u00122!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u000e0\u0012Jz\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001d2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u000e0\u00122\b\b\u0002\u0010\u0010\u001a\u00020\b2%\b\u0002\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012JY\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020%2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001d2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u000e0\u0012H\u0007J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040'2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u0004\u0018\u00010\u0004J\b\u0010+\u001a\u0004\u0018\u00010\u0004J\u000e\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020.J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010/\u001a\u00020\bJ\u0018\u00100\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u00061"}, d2 = {"Lcom/taobao/message/kit/util/BundleSplitUtil;", "", "()V", "ACTIVITY_NAME", "", "FEATURE_NAME", RPCDataItems.SWITCH_TAG_LOG, "hasFlexa", "", "isDynamicFeature", "()Z", "isMsgBundleDownloaded", "isMsgBundleReady", "checkClazzReady", "", "clazzName", "withInit", "onSuccess", "Lkotlin/Function1;", "Ljava/lang/Class;", "Lkotlin/ParameterName;", "name", "clazz", "onFailure", "errorMsg", "checkMsgBundleReady", "source", "withRetry", "", "Lkotlin/Function0;", "onProgress", "a", "checkTargetBundleReady", "bundleName", a.FEATURE_NAME, "showLoading", "context", "Landroid/app/Activity;", "getFeatureNames", "", "bundleInfo", "Lcom/android/tools/bundleInfo/BundleListing$BundleInfo;", "getMsgFeatureVersion", "getWrapperFeatureVersion", "injectResource", "ctx", "Landroid/content/Context;", "autoLoadModule", "isTargetBundleReady", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class BundleSplitUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTIVITY_NAME = "com.taobao.message.activity.ChatActivity";
    public static final String FEATURE_NAME = "taobao_wangxin";
    public static final BundleSplitUtil INSTANCE;
    public static final String TAG = "BundleSplitUtil";
    private static final boolean hasFlexa;

    static {
        boolean z;
        kge.a(2082326657);
        INSTANCE = new BundleSplitUtil();
        try {
            Class.forName(g.class.getName());
            Class.forName(c.class.getName());
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        hasFlexa = z;
    }

    private BundleSplitUtil() {
    }

    private final Set<String> getFeatureNames(BundleListing.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("9303dbab", new Object[]{this, aVar});
        }
        Set<String> b = ao.b(aVar.d);
        List<String> list = aVar.o;
        q.a((Object) list, "bundleInfo.dependencies");
        b.addAll(list);
        return b;
    }

    public final void injectResource(Context ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6005b8c2", new Object[]{this, ctx});
            return;
        }
        q.c(ctx, "ctx");
        if (!hasFlexa) {
            return;
        }
        j.b(ctx);
    }

    public final String getMsgFeatureVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75275eec", new Object[]{this});
        }
        if (hasFlexa) {
            return bif.a().a("taobao_wangxin");
        }
        return null;
    }

    public final String getWrapperFeatureVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc61ed9a", new Object[]{this});
        }
        if (hasFlexa) {
            return bif.a().a("messagesdkwrapper");
        }
        return null;
    }

    public final boolean isDynamicFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa84218c", new Object[]{this})).booleanValue();
        }
        if (!hasFlexa || c.Companion.a().c() == null) {
            return false;
        }
        Boolean bool = b.a().l(ACTIVITY_NAME).b;
        q.a((Object) bool, "bundleInfo.dynamicFeature");
        return bool.booleanValue();
    }

    public final boolean isMsgBundleDownloaded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("923309eb", new Object[]{this})).booleanValue();
        }
        try {
            if (!isDynamicFeature()) {
                return true;
            }
            u a2 = k.a();
            q.a((Object) a2, "SplitCompatHolder.get()");
            return a2.b().c("taobao_wangxin").exists();
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
            return false;
        }
    }

    public final boolean isMsgBundleReady() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cd41c755", new Object[]{this})).booleanValue() : isMsgBundleReady(true);
    }

    public final boolean isMsgBundleReady(boolean z) {
        g c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daf7d5a7", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!hasFlexa || (c = c.Companion.a().c()) == null) {
            return true;
        }
        BundleListing.a bundleInfo = b.a().l(ACTIVITY_NAME);
        if (!bundleInfo.b.booleanValue()) {
            return true;
        }
        if (z) {
            Set<String> a2 = c.a();
            q.a((Object) bundleInfo, "bundleInfo");
            if (!a2.containsAll(getFeatureNames(bundleInfo))) {
                long currentTimeMillis = System.currentTimeMillis();
                TraceUtil.beginSection("SplitCompatHolder load");
                boolean a3 = q.a((Object) "1", (Object) ConfigUtil.getValue("mpm_data_switch", "degradeLoadBeforeTen", "0"));
                boolean onlyOneActivity = ActivityUtil.onlyOneActivity(ApplicationUtil.getApplication());
                if (a3 || Build.VERSION.SDK_INT > 29 || onlyOneActivity) {
                    u a4 = k.a();
                    Application application = ApplicationUtil.getApplication();
                    v vVar = new v(2);
                    vVar.b(bundleInfo.d);
                    ArrayList arrayList = bundleInfo.o;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array != null) {
                        vVar.a((Object) array);
                        a4.a(application, false, (String[]) vVar.a((Object[]) new String[vVar.a()]));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                TLog.loge(TAG, "SplitCompatHolder load time: " + currentTimeMillis2);
                RemoteMonitorUtil.INSTANCE.remoteAssembleStat(currentTimeMillis2);
                TraceUtil.endTrace();
            }
        }
        Set<String> a5 = c.a();
        q.a((Object) bundleInfo, "bundleInfo");
        return a5.containsAll(getFeatureNames(bundleInfo));
    }

    public static /* synthetic */ void checkMsgBundleReady$default(BundleSplitUtil bundleSplitUtil, String str, int i, ruk rukVar, rul rulVar, boolean z, rul rulVar2, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c244378", new Object[]{bundleSplitUtil, str, new Integer(i), rukVar, rulVar, new Boolean(z), rulVar2, new Integer(i2), obj});
        } else {
            bundleSplitUtil.checkMsgBundleReady(str, (i2 & 2) != 0 ? 0 : i, rukVar, rulVar, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : rulVar2);
        }
    }

    public final void checkMsgBundleReady(String source, int i, ruk<t> onSuccess, final rul<? super String, t> onFailure, boolean z, rul<? super Integer, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ee9a2", new Object[]{this, source, new Integer(i), onSuccess, onFailure, new Boolean(z), rulVar});
            return;
        }
        q.c(source, "source");
        q.c(onSuccess, "onSuccess");
        q.c(onFailure, "onFailure");
        TLog.loge(TAG, "checkMsgBundleReady: " + source);
        if (isMsgBundleReady()) {
            onSuccess.mo2427invoke();
            return;
        }
        g c = ApplicationUtil.getApplication() == null ? c.Companion.a().c() : h.a(ApplicationUtil.getApplication());
        if (c != null) {
            c.a(new BundleSplitUtil$checkMsgBundleReady$listener$1(b.a().l(ACTIVITY_NAME), rulVar, System.currentTimeMillis(), source, c, z, onSuccess, onFailure));
            c.a(com.alibaba.android.split.core.splitinstall.j.a().a("taobao_wangxin").a()).a(BundleSplitUtil$checkMsgBundleReady$task$1.INSTANCE).a(new d() { // from class: com.taobao.message.kit.util.BundleSplitUtil$checkMsgBundleReady$task$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.core.tasks.d
                public final void onFailure(Exception exc) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    } else {
                        rul.this.mo2421invoke("install feature failed");
                    }
                }
            });
            return;
        }
        TLog.loge(TAG, "manager is null");
        onFailure.mo2421invoke("manager is null");
    }

    public final void checkClazzReady(String clazzName, boolean z, rul<? super Class<?>, t> onSuccess, rul<? super String, t> onFailure) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c0473e", new Object[]{this, clazzName, new Boolean(z), onSuccess, onFailure});
            return;
        }
        q.c(clazzName, "clazzName");
        q.c(onSuccess, "onSuccess");
        q.c(onFailure, "onFailure");
        long currentTimeMillis = System.currentTimeMillis();
        if (isMsgBundleReady()) {
            Class<?> cls = Class.forName(clazzName);
            q.a((Object) cls, "Class.forName(clazzName)");
            onSuccess.mo2421invoke(cls);
        }
        com.alibaba.flexa.compat.c.a(clazzName, new BundleSplitUtil$checkClazzReady$1(currentTimeMillis, clazzName, z, onSuccess, onFailure));
    }

    @JvmStatic
    public static final boolean isTargetBundleReady(String bundleName, String featureName) {
        g c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8adacc05", new Object[]{bundleName, featureName})).booleanValue();
        }
        q.c(bundleName, "bundleName");
        q.c(featureName, "featureName");
        if (!hasFlexa || (c = c.Companion.a().c()) == null) {
            return true;
        }
        BundleListing.a d = b.a().d(bundleName);
        if (d != null && !d.b.booleanValue()) {
            return true;
        }
        Set<String> a2 = c.a();
        List singletonList = Collections.singletonList(featureName);
        q.a((Object) singletonList, "Collections.singletonList(featureName)");
        return a2.containsAll(singletonList);
    }

    @JvmStatic
    public static final void checkTargetBundleReady(String bundleName, final String featureName, boolean z, Activity context, final ruk<t> onSuccess, final rul<? super String, t> onFailure) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80cfae12", new Object[]{bundleName, featureName, new Boolean(z), context, onSuccess, onFailure});
            return;
        }
        q.c(bundleName, "bundleName");
        q.c(featureName, "featureName");
        q.c(context, "context");
        q.c(onSuccess, "onSuccess");
        q.c(onFailure, "onFailure");
        if (isTargetBundleReady(bundleName, featureName)) {
            onSuccess.mo2427invoke();
            return;
        }
        g c = ApplicationUtil.getApplication() == null ? c.Companion.a().c() : h.a(ApplicationUtil.getApplication());
        if (c != null) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = false;
            System.currentTimeMillis();
            final g gVar = c;
            c.a(new o() { // from class: com.taobao.message.kit.util.BundleSplitUtil$checkTargetBundleReady$listener$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.core.listener.b
                public void onStateUpdate(m state) {
                    int b;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6f72d846", new Object[]{this, state});
                        return;
                    }
                    q.c(state, "state");
                    if (!state.g().contains(featureName) || (b = state.b()) == 2 || b == 4) {
                        return;
                    }
                    if (b != 5) {
                        if (b != 6) {
                            return;
                        }
                        TLog.loge(BundleSplitUtil.TAG, ":failed");
                        gVar.b(this);
                        onFailure.mo2421invoke("msg init failed");
                        return;
                    }
                    gVar.b(this);
                    if (!booleanRef.element) {
                        onSuccess.mo2427invoke();
                    } else {
                        TLog.loge(BundleSplitUtil.TAG, ":cancel");
                    }
                }
            });
            c.a(com.alibaba.android.split.core.splitinstall.j.a().a(z).a(new com.alibaba.android.split.ui.a(context, new DialogInterface.OnCancelListener() { // from class: com.taobao.message.kit.util.BundleSplitUtil$checkTargetBundleReady$request$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                    } else {
                        Ref.BooleanRef.this.element = true;
                    }
                }
            }, BundleSplitUtil$checkTargetBundleReady$request$2.INSTANCE, BundleSplitUtil$checkTargetBundleReady$request$3.INSTANCE)).a(featureName).a()).a(BundleSplitUtil$checkTargetBundleReady$task$1.INSTANCE).a(new d() { // from class: com.taobao.message.kit.util.BundleSplitUtil$checkTargetBundleReady$task$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.core.tasks.d
                public final void onFailure(Exception exc) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    } else {
                        rul.this.mo2421invoke("install feature failed");
                    }
                }
            });
            return;
        }
        TLog.loge(TAG, "manager is null");
        onFailure.mo2421invoke("manager is null");
    }
}
