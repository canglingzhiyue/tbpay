package com.alibaba.security.realidentity;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.dynamic.model.PureWirelessConfHttpResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.TbDownloader;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;

/* loaded from: classes3.dex */
public class v2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String d = "v2";
    public static final String e = "fdmodel.bin";
    public static final String f = "ldmodel.bin";
    public static final String g = "ldClassifier.bin";
    public static final String h = "faceContinuity.bin";
    public static final String i = "rpsdk_model_info";

    /* renamed from: a  reason: collision with root package name */
    public final String f3588a;
    public final String[] b = {"fdmodel.bin", "ldmodel.bin", "ldClassifier.bin", "faceContinuity.bin"};
    public final SharedPreferences c;

    /* loaded from: classes3.dex */
    public static class a implements kml {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final o2 f3589a;
        public final RPBizConfig b;
        public final WeakReference<v2> c;

        public a(v2 v2Var, o2 o2Var, RPBizConfig rPBizConfig) {
            this.f3589a = o2Var;
            this.b = rPBizConfig;
            this.c = new WeakReference<>(v2Var);
        }

        @Override // tb.kml
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
            } else {
                this.f3589a.remoteAssetsResult(false, i, str2);
            }
        }

        @Override // tb.kml
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            try {
                File file = new File(str2);
                if (!file.exists()) {
                    this.f3589a.remoteAssetsResult(false, e2.D0, str2);
                    return;
                }
                v2 v2Var = this.c.get();
                if (v2Var != null) {
                    f.a(v2Var.c());
                    v2Var.a(this.b.getBasicsConfig().modelInfo);
                    f.b(file, v2Var.c());
                }
                this.f3589a.remoteAssetsResult(true, 0, str2);
            } catch (Throwable th) {
                this.f3589a.remoteAssetsResult(false, e2.D0, th.getMessage());
            }
        }

        @Override // tb.kml
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.kml
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.kml
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            String a2 = v2.a();
            com.alibaba.security.realidentity.a.a(a2, "DownloadTask " + z);
        }

        @Override // tb.kml
        public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
            }
        }
    }

    public v2(Context context) {
        this.f3588a = context.getFilesDir() + "/flm/";
        this.c = context.getSharedPreferences(f2.u, 0);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : d;
    }

    private PureWirelessConfHttpResponse.ModelInfo d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PureWirelessConfHttpResponse.ModelInfo) ipChange.ipc$dispatch("4dd85e2d", new Object[]{this});
        }
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences == null) {
            return null;
        }
        String string = sharedPreferences.getString(i, null);
        if (!TextUtils.isEmpty(string)) {
            return (PureWirelessConfHttpResponse.ModelInfo) b.b(string, PureWirelessConfHttpResponse.ModelInfo.class);
        }
        return null;
    }

    public void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
        } else {
            TbDownloader.getInstance().c(i2);
        }
    }

    public File c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("298485e3", new Object[]{this}) : new File(this.f3588a);
    }

    public int a(Context context, RPBizConfig rPBizConfig, o2 o2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f62cf81e", new Object[]{this, context, rPBizConfig, o2Var})).intValue();
        }
        try {
            kmm kmmVar = new kmm();
            kmmVar.b.f30169a = "rpsdk";
            kmmVar.b.d = 7;
            String str = context.getExternalCacheDir().getAbsolutePath() + File.separator + "modelTemp";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            kmmVar.b.h = str;
            kmmVar.b.j = false;
            PureWirelessConfHttpResponse.ModelInfo modelInfo = rPBizConfig.getBasicsConfig().modelInfo;
            if (modelInfo != null && !TextUtils.isEmpty(modelInfo.modelUrl) && !TextUtils.isEmpty(modelInfo.md5)) {
                kmo kmoVar = new kmo();
                kmoVar.f30167a = modelInfo.modelUrl;
                kmoVar.d = modelInfo.modelName;
                kmoVar.c = modelInfo.md5;
                kmoVar.b = Long.parseLong(modelInfo.size);
                kmmVar.f30166a.add(kmoVar);
                return TbDownloader.getInstance().a(kmmVar, new a(this, o2Var, rPBizConfig));
            }
            o2Var.remoteAssetsResult(false, e2.C0, "null model info found");
            return e2.C0;
        } catch (Throwable th) {
            if (o2Var != null) {
                o2Var.remoteAssetsResult(false, e2.C0, th.getMessage());
            }
            return e2.C0;
        }
    }

    public boolean b(RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a871a91", new Object[]{this, rPBizConfig})).booleanValue();
        }
        if (b()) {
            return a(rPBizConfig);
        }
        return true;
    }

    private boolean b() {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        File file = new File(this.f3588a);
        if (!file.exists() || !file.isDirectory() || file.listFiles() == null || file.listFiles().length != this.b.length) {
            return false;
        }
        for (File file2 : file.listFiles()) {
            if (!Arrays.asList(this.b).contains(file2.getName()) || file2.length() <= 0) {
                return false;
            }
        }
        return true;
    }

    public void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
        } else {
            TbDownloader.getInstance().b(i2);
        }
    }

    private boolean a(RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f79650", new Object[]{this, rPBizConfig})).booleanValue();
        }
        String str = rPBizConfig.getBasicsConfig().modelInfo.md5;
        String str2 = rPBizConfig.getBasicsConfig().modelInfo.size;
        PureWirelessConfHttpResponse.ModelInfo d2 = d();
        return d2 == null || !d2.md5.equals(str) || !d2.size.equals(str2);
    }

    public void a(PureWirelessConfHttpResponse.ModelInfo modelInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7039b4a", new Object[]{this, modelInfo});
        } else if (this.c == null) {
        } else {
            this.c.edit().putString(i, b.a(modelInfo)).apply();
        }
    }
}
