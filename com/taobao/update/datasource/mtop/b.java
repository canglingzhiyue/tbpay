package com.taobao.update.datasource.mtop;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import tb.kge;
import tb.rfx;
import tb.rfy;
import tb.rgn;
import tb.rgq;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context mContext;
    public String mFrom;
    public String mGroup;
    public boolean mIsOutApk;
    public String mTtid;

    static {
        kge.a(-824343079);
    }

    private b(Context context, String str, String str2, boolean z, String str3) {
        this.mContext = context;
        this.mTtid = str;
        this.mGroup = str2;
        this.mIsOutApk = z;
        this.mFrom = str3;
    }

    public JSONObject queryUpdateInfo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("78c5b9ae", new Object[]{this, new Boolean(z)});
        }
        UpdateRequest updateRequest = new UpdateRequest(this.mIsOutApk);
        if (!StringUtils.isEmpty(this.mFrom) && !this.mFrom.equals(rfx.MTOP_SOURCE)) {
            updateRequest.betaSource = this.mFrom;
        }
        updateRequest.brand = Build.MANUFACTURER;
        updateRequest.model = Build.MODEL;
        updateRequest.identifier = this.mGroup;
        updateRequest.appVersion = rgq.getVersionName();
        updateRequest.apiLevel = Build.VERSION.SDK_INT;
        updateRequest.patchVersion = com.taobao.update.datasource.local.a.getInstance(this.mContext).getCurrentPatchVersion();
        updateRequest.userUpdate = !z;
        if (b()) {
            updateRequest.protocolVersion = "1.0";
        }
        if (c()) {
            updateRequest.requireContent = true;
        }
        updateRequest.cpuArch = rgn.getCpuArch();
        updateRequest.apkArch = rgn.getInstalledApkCpuArchValue(rfy.sContext);
        d.a().a(this.mContext);
        Set<String> b = d.a().b();
        if (b == null) {
            b = new HashSet<>();
        }
        updateRequest.deployVersions = b;
        updateRequest.isYunos = a();
        ArrayList arrayList = new ArrayList();
        arrayList.add("main");
        arrayList.add(rfx.DYNAMICUPDATE);
        arrayList.add(rfx.HOTPATCH);
        arrayList.add(rfx.CPPINLINEPATCH);
        arrayList.add("preload");
        updateRequest.updateTypes = arrayList;
        updateRequest.lastPopTime = rgq.getLastPopTime();
        return rfy.sUpdateAdapter.invokePullApi(updateRequest, this.mContext, this.mTtid, this.mIsOutApk);
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : Boolean.parseBoolean(rfy.sUpdateAdapter.getConfig(rfx.UPDATE_CONFIG_GROUP, rfx.NEW_PATCH_UPDATE, "false"));
    }

    private boolean a() {
        String str;
        String str2 = null;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            str = (String) method.invoke(null, "ro.yunos.version");
            try {
                str2 = (String) method.invoke(null, "java.vm.name");
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = null;
        }
        return (str2 != null && str2.toLowerCase().contains("lemur")) || (str != null && str.trim().length() > 0);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        SharedPreferences sharedPreferences = rfy.sContext.getSharedPreferences("dynamic_features_config", 0);
        return sharedPreferences.getBoolean("new_featureupdate_opened_" + rgq.getVersionName(), true);
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f23379a;
        private String b;
        private String c;
        private boolean d;
        private String e;

        static {
            kge.a(-365857872);
        }

        public static a newBuilder(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("12baf9a8", new Object[]{context}) : new a(context);
        }

        private a(Context context) {
            this.f23379a = context;
        }

        public a setTtid(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1ad62070", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a setGroup(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a7cc3c90", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a setOutApk(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("98cc417f", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a setFrom(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("520223ff", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b build() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d7eee494", new Object[]{this}) : new b(this.f23379a, this.b, this.c, this.d, this.e);
        }
    }
}
