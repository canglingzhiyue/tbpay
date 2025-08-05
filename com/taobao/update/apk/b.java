package com.taobao.update.apk;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.apk.history.ApkUpdateHistory;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.framework.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.rev;
import tb.rfr;
import tb.rfs;
import tb.rfx;
import tb.rfy;
import tb.rfz;
import tb.rge;
import tb.rgf;
import tb.rgm;
import tb.rgq;

/* loaded from: classes9.dex */
public class b extends d implements rfr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private rfz.a f23371a;
    private rev b;
    private List<rfs> c = new ArrayList();
    private rge d = rgf.getLog(b.class, (rge) null);

    static {
        kge.a(1232718515);
        kge.a(2054979656);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == 1621086737) {
            super.init((Context) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public b() {
        rfy.getInstance().registerListener("main", this);
    }

    @Override // tb.rfr
    public void registerInterceptor(rfs rfsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936b6b5a", new Object[]{this, rfsVar});
        } else {
            this.c.add(rfsVar);
        }
    }

    @Override // com.taobao.update.framework.d
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (this.k) {
        } else {
            super.init(context);
            this.b = (rev) com.taobao.update.framework.a.getInstance(rev.class);
            try {
                b();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.k = true;
        }
    }

    @Override // com.taobao.update.framework.d
    public boolean doUpdate(JSONObject jSONObject, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14471eed", new Object[]{this, jSONObject, new Boolean(z), str})).booleanValue();
        }
        if (!this.k) {
            init(rfy.getInstance().getApplication());
        }
        if (this.c.size() > 0 && a()) {
            for (rfs rfsVar : this.c) {
                if (rfsVar.interrupt(jSONObject, z, str)) {
                    return false;
                }
            }
        }
        if (jSONObject == null || !rgq.greaterThen(jSONObject.getString("version"), rgq.getVersionName())) {
            if (!z) {
                UpdateRuntime.toast(rgq.getAppNameString(R.string.notice_noupdate, UpdateRuntime.sAppName));
            }
            return false;
        }
        rfz.a aVar = this.f23371a;
        if (aVar != null) {
            aVar.patchStart();
        }
        try {
            MainUpdateData mainUpdateData = (MainUpdateData) rgq.toJavaObject(jSONObject, MainUpdateData.class);
            File file = new File("/sdcard/test_pri.txt");
            if (file.exists()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    String trim = bufferedReader.readLine().trim();
                    Log.e("update", " FIXME delete before release ... " + trim);
                    if (trim != null) {
                        mainUpdateData.remindStrategy = Integer.valueOf(trim).intValue();
                        String trim2 = bufferedReader.readLine().trim();
                        if (trim2 != null) {
                            mainUpdateData.remindCount = Integer.valueOf(trim2).intValue();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            Log.e("main_update", JSON.toJSONString(mainUpdateData));
            com.taobao.update.framework.c execute = new a().execute(z, mainUpdateData);
            if (execute != null && execute.success) {
                rfy.getInstance().clearCache();
                if (this.f23371a != null) {
                    this.f23371a.patchSuccess();
                }
            } else if (this.f23371a != null) {
                this.f23371a.patchFailed(execute.errorMsg);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return true;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : Boolean.valueOf(PreferenceManager.getDefaultSharedPreferences(rfy.sContext).getString(rfx.UPDATE_ENABLED_INTERCEPROT, "true")).booleanValue();
    }

    private void b() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ApkUpdateHistory.Data data = ApkUpdateHistory.getData();
        if (data != null) {
            boolean equals = rgq.getVersionName().equals(data.toVersion);
            if (equals) {
                try {
                    new File(data.ext).delete();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (!equals) {
                str = String.valueOf(rgq.getVersionName().equals(data.fromVersion) ? -71 : -72);
                str2 = "fromVersion=" + data.fromVersion + ",toVersion=" + data.toVersion;
            } else {
                str = "";
                str2 = str;
            }
            rev revVar = this.b;
            if (revVar != null) {
                revVar.add("apefficiency", equals, "install", str, str2, data.fromVersion, data.toVersion, "");
                this.b.commit("apefficiency");
            }
            ApkUpdateHistory.reset();
        }
        c();
    }

    private void c() {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        File file = new File(rgq.getStorePath(UpdateRuntime.getContext()) + "/apkupdate");
        if (!file.exists() || file.listFiles() == null) {
            return;
        }
        String versionName = rgq.getVersionName();
        for (File file2 : file.listFiles()) {
            if (rgq.greaterThen(versionName, file2.getName())) {
                rgm.deleteDir(file2);
            }
        }
    }

    @Override // tb.rfz
    public void onUpdate(boolean z, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ba63f5", new Object[]{this, new Boolean(z), jSONObject, str});
        } else {
            doUpdate(jSONObject, z, str);
        }
    }

    @Override // tb.rfz
    public void patchProcessListener(rfz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d0ecef", new Object[]{this, aVar});
        } else {
            this.f23371a = aVar;
        }
    }
}
