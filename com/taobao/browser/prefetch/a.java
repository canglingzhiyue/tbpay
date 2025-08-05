package com.taobao.browser.prefetch;

import android.os.Environment;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f16835a;
    private JSONObject b = new JSONObject();
    private long c;
    private long d;
    private long e;

    static {
        kge.a(1859018263);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("18648576", new Object[0]);
        }
        if (f16835a == null) {
            synchronized (a.class) {
                if (f16835a == null) {
                    f16835a = new a();
                }
            }
        }
        return f16835a;
    }

    private a() {
        try {
            this.b.put("type", "H5");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            this.b.put("pageName", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
            return;
        }
        JSONArray optJSONArray = this.b.optJSONArray("stage");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
            try {
                this.b.put("stage", optJSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        optJSONArray.put(jSONObject);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!new File("/data/local/tmp/.apm_online").exists()) {
        } else {
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), android.taobao.windvane.config.a.f.getPackageName());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("stageName", "visible");
                jSONObject.put("beginTime", this.d);
                jSONObject.put("endTime", this.e);
                jSONObject.put("thread", Thread.currentThread().getName());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            a(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("stageName", "finishLoad");
                jSONObject2.put("beginTime", this.c);
                jSONObject2.put("endTime", this.d);
                jSONObject2.put("thread", Thread.currentThread().getName());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            a(jSONObject2);
            BufferedWriter bufferedWriter = null;
            try {
                try {
                    try {
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(file.getAbsolutePath(), "APM_ONLINE");
                        if (!file2.exists()) {
                            file2.createNewFile();
                        }
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true)));
                        try {
                            bufferedWriter2.write("\n");
                            bufferedWriter2.write(this.b.toString());
                            bufferedWriter2.write("\n");
                            m.c("TMQ", "write tmq data = [" + this.b.toString() + riy.ARRAY_END_STR);
                            bufferedWriter2.close();
                        } catch (IOException e3) {
                            e = e3;
                            bufferedWriter = bufferedWriter2;
                            e.printStackTrace();
                            m.e("TMQ", "write tmq data error, msg = [" + e.getMessage() + riy.ARRAY_END_STR);
                            if (bufferedWriter != null) {
                                bufferedWriter.close();
                            }
                            this.b = new JSONObject();
                            this.b.put("type", "H5");
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (Throwable unused2) {
            }
            this.b = new JSONObject();
            try {
                this.b.put("type", "H5");
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
    }
}
