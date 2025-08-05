package com.taobao.update.instantpatch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.common.PatchInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.InstantPatcher;
import com.android.alibaba.ip.server.Restarter;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.update.instantpatch.flow.b;
import com.taobao.update.instantpatch.model.InstantUpdateInfo;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import tb.kge;
import tb.rfx;
import tb.rfy;
import tb.rfz;
import tb.rgj;
import tb.rgp;
import tb.rgq;

/* loaded from: classes9.dex */
public class InstantPatchUpdater extends com.taobao.update.framework.d implements rfz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EFFECTIVE_VERSION = "instantpatch_effective_version";
    public static final String PATCH_FROM = "patch_from";

    /* renamed from: a  reason: collision with root package name */
    private Context f23428a;
    private String b;
    private volatile boolean c;
    private PublishType d;
    private String e;
    private boolean f;
    private rfz.a g;
    private SharedPreferences h;
    private boolean i;
    private boolean j;

    /* renamed from: com.taobao.update.instantpatch.InstantPatchUpdater$2  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23430a = new int[PublishType.values().length];

        static {
            try {
                f23430a[PublishType.BETA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23430a[PublishType.RELEASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public enum PublishType {
        BETA,
        RELEASE
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final InstantPatchUpdater f23431a;

        static {
            kge.a(223790551);
            f23431a = new InstantPatchUpdater();
        }

        public static /* synthetic */ InstantPatchUpdater a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (InstantPatchUpdater) ipChange.ipc$dispatch("95fe8510", new Object[0]) : f23431a;
        }
    }

    static {
        kge.a(1716827053);
        kge.a(-108454860);
    }

    public static /* synthetic */ Object ipc$super(InstantPatchUpdater instantPatchUpdater, String str, Object... objArr) {
        if (str.hashCode() == -2083440012) {
            super.onBackground();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void setStartFromBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17767c75", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    private InstantPatchUpdater() {
        this.i = false;
    }

    public static InstantPatchUpdater instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InstantPatchUpdater) ipChange.ipc$dispatch("1b1a465c", new Object[0]) : a.a();
    }

    @Override // com.taobao.update.framework.d
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (this.k) {
        } else {
            this.f23428a = context;
            System.setProperty("update_patch", "inited");
            this.b = rgq.getVersionName();
            this.h = PreferenceManager.getDefaultSharedPreferences(context);
            if (!this.b.equals(this.h.getString("instantpatch_mainversion", ""))) {
                this.h.edit().putString("instantpatch_mainversion", this.b).putString("instantpatch_effective_version", "").putString(InstantPatchChangeInfo.INSTANT_PATCH_EFFECTIVE_TYPE, "").apply();
                try {
                    InstantPatcher.create(context).purge();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            this.k = true;
        }
    }

    @Override // com.taobao.update.framework.d
    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
            return;
        }
        super.onBackground();
        if (!this.i) {
            return;
        }
        c();
        rgq.killChildProcesses(getContext());
        System.exit(0);
    }

    @Override // com.taobao.update.framework.d
    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
        } else if (!this.i) {
        } else {
            c();
            rgq.killChildProcesses(getContext());
            System.exit(0);
        }
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.f23428a;
    }

    public void setDisabledPatchClazzes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386abd4d", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            List asList = Arrays.asList(str.split(","));
            if (isNumeric((String) asList.get(0))) {
                InstantPatcher.create(this.f23428a).setDisabledClazzes((String) asList.get(0), Arrays.asList(Arrays.copyOfRange(asList.toArray(new String[0]), 1, asList.size())));
            } else {
                Log.e("InstantPatchUpdater", "DisabledPatchClazzes must has patchVersion!");
            }
        }
    }

    public static boolean isNumeric(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b5c88d8", new Object[]{str})).booleanValue();
        }
        try {
            new BigDecimal(str).toString();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // tb.rfz
    public void onUpdate(boolean z, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ba63f5", new Object[]{this, new Boolean(z), jSONObject, str});
            return;
        }
        if (!this.k) {
            init(rfy.getInstance().getApplication());
        }
        if (!a(str)) {
            return;
        }
        if (this.c) {
            if (!str.equals(rfx.SCAN)) {
                return;
            }
            c("instantpatch updating ......");
            return;
        }
        this.c = true;
        try {
            InstantUpdateInfo create = InstantUpdateInfo.create(jSONObject);
            if (TextUtils.isEmpty(create.patchUrl) && !create.rollback) {
                return;
            }
            if (create.rollback) {
                rollback(create);
                a(create.channelProcNeedRestart);
            } else if (b(create)) {
                if (str.equals(rfx.SCAN)) {
                    c("instantpatch from scan has patched, please clear data and retry!");
                }
            } else if (!a(create)) {
            } else {
                a(create, str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.c = false;
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (b() && !rfx.SCAN.equals(str)) {
            return false;
        }
        return rfx.SCAN.equals(str) || !a().equals(rfx.SCAN);
    }

    private String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.h.getString(PATCH_FROM, "");
    }

    private boolean a(InstantUpdateInfo instantUpdateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8700e63e", new Object[]{this, instantUpdateInfo})).booleanValue();
        }
        this.d = instantUpdateInfo.beta ? PublishType.BETA : PublishType.RELEASE;
        this.e = instantUpdateInfo.patchVersion;
        String string = this.h.getString(InstantPatchChangeInfo.INSTANT_PATCH_EFFECTIVE_TYPE, "");
        String string2 = this.h.getString("instantpatch_effective_version", "");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return true;
        }
        int i = AnonymousClass2.f23430a[this.d.ordinal()];
        return i != 1 ? i != 2 || string.equals(this.d.name()) || !string.equals(PublishType.BETA) || Integer.valueOf(this.e).intValue() > Integer.valueOf(string2).intValue() : Integer.valueOf(this.e).intValue() > Integer.valueOf(string2).intValue();
    }

    private boolean b(InstantUpdateInfo instantUpdateInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("417686bf", new Object[]{this, instantUpdateInfo})).booleanValue() : InstantPatcher.create(this.f23428a).hasPatched(createPatchInfo(instantUpdateInfo));
    }

    private void a(InstantUpdateInfo instantUpdateInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f632b584", new Object[]{this, instantUpdateInfo, str});
            return;
        }
        if (str.equals(rfx.SCAN)) {
            c("start to do instantpatch!");
        }
        long currentTimeMillis = System.currentTimeMillis();
        rgj.stat(true, "revupdate", 0L, 0, "", Long.valueOf(instantUpdateInfo.patchVersion).longValue());
        d dVar = new d();
        dVar.context = this.f23428a;
        dVar.workDir = dVar.getPatchPath();
        if (!TextUtils.isEmpty(instantUpdateInfo.contentBase64)) {
            dVar.path = new File(dVar.getPatchPath(), instantUpdateInfo.name).getAbsolutePath();
            new com.taobao.update.instantpatch.flow.c(dVar).decode(instantUpdateInfo.contentBase64);
            if (!dVar.success || !new File(dVar.path).exists() || !rgp.isMd5Same(instantUpdateInfo.md5, dVar.path)) {
                rgj.stat(false, rgj.ARG_PATCHDECODE, System.currentTimeMillis() - currentTimeMillis, 0, "", Long.valueOf(instantUpdateInfo.patchVersion).longValue());
            } else {
                rgj.stat(true, rgj.ARG_PATCHDECODE, System.currentTimeMillis() - currentTimeMillis, 0, "", Long.valueOf(instantUpdateInfo.patchVersion).longValue());
            }
        }
        if (!dVar.success || TextUtils.isEmpty(dVar.path) || !new File(dVar.path).exists() || !rgp.isMd5Same(instantUpdateInfo.md5, dVar.path)) {
            long currentTimeMillis2 = System.currentTimeMillis();
            new com.taobao.update.instantpatch.flow.a(dVar).download(instantUpdateInfo);
            if (!dVar.success || TextUtils.isEmpty(dVar.path)) {
                if (str.equals(rfx.SCAN)) {
                    c("instantpatch download failed!");
                }
                rgj.stat(false, "download", 0L, dVar.errorCode, dVar.errorMsg, Long.valueOf(instantUpdateInfo.patchVersion).longValue());
                rfz.a aVar = this.g;
                if (aVar == null) {
                    return;
                }
                aVar.patchFailed(dVar.errorMsg);
                return;
            }
            System.setProperty("update_patch", "downloaded patch:" + instantUpdateInfo);
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
            if (str.equals(rfx.SCAN)) {
                c("instantpatch download success!");
            }
            rgj.stat(true, "download", currentTimeMillis3, dVar.errorCode, dVar.errorMsg, Long.valueOf(instantUpdateInfo.patchVersion).longValue());
        }
        long currentTimeMillis4 = System.currentTimeMillis();
        new b(dVar).install(instantUpdateInfo);
        long currentTimeMillis5 = System.currentTimeMillis() - currentTimeMillis4;
        System.setProperty("update_patch", "installed patch:" + instantUpdateInfo);
        if (dVar.success) {
            a(instantUpdateInfo.channelProcNeedRestart);
            rgj.stat(true, "install", currentTimeMillis5, dVar.errorCode, dVar.errorMsg, Long.valueOf(instantUpdateInfo.patchVersion).longValue());
            b(str);
            rfz.a aVar2 = this.g;
            if (aVar2 != null) {
                aVar2.patchSuccess();
            }
            if (str.equals(rfx.SCAN)) {
                c("instantpatch do patch success!");
                if (InstantPatcher.hasResources && c.waitForConfirmAction("Instantpatch当前有资源patch,重启生效?")) {
                    Context context = this.f23428a;
                    Restarter.restartApp(context, Restarter.getActivities(context, false));
                }
            }
            if (!InstantPatcher.hasResources) {
                return;
            }
            this.i = true;
            return;
        }
        rgj.stat(false, "install", 0L, dVar.errorCode, dVar.errorMsg, Long.valueOf(instantUpdateInfo.patchVersion).longValue());
        rfz.a aVar3 = this.g;
        if (aVar3 != null) {
            aVar3.patchFailed(dVar.errorMsg);
        }
        if (!str.equals(rfx.SCAN)) {
            return;
        }
        c("instantpatch do patch failed!");
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(this.f23428a.getPackageName());
        intent.setAction("com.alibaba.android.instantpatch_action");
        intent.putExtra("instantpatch_channelProcNeedRestart", z);
        intent.putExtra("triggered_from_app_after_instantpatch", true);
        intent.putExtra("triggered_from_app_background", this.f);
        this.f23428a.sendBroadcast(intent);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.h.edit().putString(InstantPatchChangeInfo.INSTANT_PATCH_EFFECTIVE_TYPE, this.d.name()).putString("instantpatch_effective_version", this.e).putString(PATCH_FROM, str).commit();
        }
    }

    public void rollback(InstantUpdateInfo instantUpdateInfo) {
        try {
            Log.e("InstantPatchUpdater", "rollback patch");
            InstantPatcher create = InstantPatcher.create(this.f23428a);
            Method declaredMethod = InstantPatcher.class.getDeclaredMethod("clearPatchInfo", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(create, new Object[0]);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
        this.h.edit().putString("instantpatch_effective_version", "").putString(InstantPatchChangeInfo.INSTANT_PATCH_EFFECTIVE_TYPE, "").commit();
        a(instantUpdateInfo.channelProcNeedRestart);
    }

    public PatchInfo createPatchInfo(InstantUpdateInfo instantUpdateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PatchInfo) ipChange.ipc$dispatch("8fc006cb", new Object[]{this, instantUpdateInfo});
        }
        PatchInfo patchInfo = new PatchInfo();
        patchInfo.setPatchVersion(Integer.valueOf(instantUpdateInfo.patchVersion).intValue());
        patchInfo.setBaseVersion(instantUpdateInfo.baseVersion);
        patchInfo.setPriority(Integer.valueOf(instantUpdateInfo.priority).intValue());
        return patchInfo;
    }

    @Override // tb.rfz
    public void patchProcessListener(rfz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d0ecef", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    private void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.update.instantpatch.InstantPatchUpdater.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(rfy.sContext, str, 1).show();
                    }
                }
            });
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            if ((getContext().getApplicationInfo().flags & 2) != 0) {
                z = true;
            }
            this.j = z;
        } catch (Exception unused) {
            this.j = true;
        }
        return this.j;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (Activity activity : Restarter.getActivities(getContext(), false)) {
            activity.finish();
        }
    }
}
