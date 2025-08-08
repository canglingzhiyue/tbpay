package com.taobao.update.datasource.local;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import tb.kge;
import tb.rfy;
import tb.rgq;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EFFECTIVE_VERSION = "instantpatch_effective_version";

    /* renamed from: a  reason: collision with root package name */
    private static a f23377a;
    private SharedPreferences b;
    private String c;
    private UpdateInfo d;
    private int e;

    static {
        kge.a(-712293744);
    }

    private a(Context context) {
        this.b = PreferenceManager.getDefaultSharedPreferences(context);
        File file = new File(context.getCacheDir().getPath(), "mtl_update.json");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.c = file.getAbsolutePath();
        try {
            if (!rgq.getVersionName().equals(this.b.getString("instantpatch_mainversion", ""))) {
                this.e = 0;
            } else {
                this.e = Integer.parseInt(this.b.getString("instantpatch_effective_version", "0"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static a getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("cc460669", new Object[]{context});
        }
        if (f23377a == null) {
            if (context == null) {
                context = rfy.sContext;
            }
            f23377a = new a(context);
        }
        return f23377a;
    }

    public void updateData(UpdateInfo updateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e916a455", new Object[]{this, updateInfo});
        } else if (updateInfo == null || updateInfo.updateList == null) {
        } else {
            UpdateInfo updateInfo2 = this.d;
            if (updateInfo2 == null) {
                this.d = updateInfo;
            } else {
                updateInfo2.updateList.putAll(updateInfo.updateList);
            }
            this.d.updateList.remove("cmd");
            this.d.lastUpdateTime = System.currentTimeMillis();
            a(JSON.toJSONString(this.d), this.c);
        }
    }

    public void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
            return;
        }
        this.d = null;
        a("", this.c);
    }

    public UpdateInfo getCacheData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UpdateInfo) ipChange.ipc$dispatch("8d32fe3c", new Object[]{this}) : this.d;
    }

    public void resetData(UpdateInfo updateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953fa10f", new Object[]{this, updateInfo});
            return;
        }
        this.d = updateInfo;
        this.d.lastUpdateTime = System.currentTimeMillis();
        a(JSON.toJSONString(this.d), this.c);
    }

    public void resetMemoryData(UpdateInfo updateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c31260e", new Object[]{this, updateInfo});
            return;
        }
        this.d = updateInfo;
        this.d.lastUpdateTime = System.currentTimeMillis();
    }

    public UpdateInfo getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdateInfo) ipChange.ipc$dispatch("d7276c46", new Object[]{this});
        }
        if (this.d == null) {
            String a2 = a(this.c);
            if (!StringUtils.isEmpty(a2)) {
                try {
                    this.d = (UpdateInfo) JSON.parseObject(a2, UpdateInfo.class);
                } catch (Throwable unused) {
                }
            }
        }
        return this.d;
    }

    public void updateSP(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86ff1901", new Object[]{this, str, str2});
            return;
        }
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public String getSP(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12af6e9c", new Object[]{this, str}) : this.b.getString(str, "");
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            String a2 = a(fileInputStream);
            fileInputStream.close();
            return a2;
        } catch (Throwable th) {
            Log.e(TLogTracker.SCENE_EXCEPTION, "File read failed: " + th.toString());
            return "";
        }
    }

    private String a(InputStream inputStream) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("172620d5", new Object[]{this, inputStream});
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File(str2)));
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (IOException e) {
            Log.e(TLogTracker.SCENE_EXCEPTION, "File write failed: " + e.toString());
        }
    }

    public int getCurrentPatchVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1d4d74d", new Object[]{this})).intValue() : this.e;
    }
}
