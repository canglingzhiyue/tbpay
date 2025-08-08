package com.taobao.desktop.channel.desktoplinktask.trigger;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import tb.kge;
import tb.kha;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final String f16949a;
    private final String b;
    private final JSONObject c;
    private JSONObject d;

    static {
        kge.a(-299590248);
    }

    public static /* synthetic */ void lambda$Nbh4LcPQPfFMyXDaN_1qfOVkPJk(c cVar) {
        cVar.e();
    }

    public static /* synthetic */ void lambda$PuEvTwrirROxgoGoLXNW5py7XLQ(c cVar, String str) {
        cVar.f(str);
    }

    public static /* synthetic */ void lambda$Wgn9o5Bcxs_zYNZ5NRMHS_1CnCM(c cVar) {
        cVar.f();
    }

    public c(Context context) {
        String str = context.getFilesDir().getAbsolutePath() + File.separator + "desktop" + File.separator;
        this.f16949a = str + "configs";
        this.b = str + "record";
        this.d = d(this.f16949a);
        this.c = d(this.b);
    }

    public JSONObject a() {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        synchronized (c.class) {
            parseObject = JSONObject.parseObject(this.c.toJSONString());
        }
        return parseObject;
    }

    public JSONObject b() {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        synchronized (c.class) {
            parseObject = JSONObject.parseObject(this.d.toJSONString());
        }
        return parseObject;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            synchronized (c.class) {
                try {
                    this.d = JSON.parseObject(str);
                    a(this.f16949a, str);
                }
            }
        }
    }

    public Pair<String, JSONObject> b(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4f8080fd", new Object[]{this, str});
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (!parseObject.getBooleanValue("ignoreIndexId") && (jSONObject = this.d) != null && !jSONObject.isEmpty() && parseObject.getLongValue("indexId") <= this.d.getLongValue("indexId")) {
                return new Pair<>("indexIdIsOld", parseObject);
            }
            return new Pair<>("", parseObject);
        } catch (Throwable unused) {
            return new Pair<>("newConfigInvalid", null);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            kha.a(new Runnable() { // from class: com.taobao.desktop.channel.desktoplinktask.trigger.-$$Lambda$c$Wgn9o5Bcxs_zYNZ5NRMHS_1CnCM
                {
                    c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.lambda$Wgn9o5Bcxs_zYNZ5NRMHS_1CnCM(c.this);
                }
            });
        }
    }

    public /* synthetic */ void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        synchronized (c.class) {
            try {
                JSONObject jSONObject = this.c.getJSONObject("displayFatigue");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    jSONObject.put("biz", (Object) new JSONObject());
                    this.c.put("displayFatigue", (Object) jSONObject);
                }
                long longValue = jSONObject.getLongValue("lastTime");
                if (longValue > 0 && !a(longValue * 1000)) {
                    jSONObject.put(Constants.KEY_TIMES, (Object) 0);
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("biz");
                Iterator<Map.Entry<String, Object>> it = jSONObject2.entrySet().iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(it.next().getKey());
                    if (jSONObject3 != null) {
                        long longValue2 = jSONObject3.getLongValue("lastTime");
                        int i = (longValue2 > 0L ? 1 : (longValue2 == 0L ? 0 : -1));
                        if (i > 0 && b(longValue2 * 1000)) {
                            it.remove();
                        }
                        if (i > 0 && !a(longValue2 * 1000)) {
                            jSONObject3.put(Constants.KEY_TIMES, (Object) 0);
                        }
                    }
                }
                a(this.b, JSON.toJSONString(this.c));
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            kha.a(new Runnable() { // from class: com.taobao.desktop.channel.desktoplinktask.trigger.-$$Lambda$c$Nbh4LcPQPfFMyXDaN_1qfOVkPJk
                {
                    c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.lambda$Nbh4LcPQPfFMyXDaN_1qfOVkPJk(c.this);
                }
            });
        }
    }

    public /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        synchronized (c.class) {
            try {
                JSONObject jSONObject = this.c.getJSONObject("requestFatigue");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    this.c.put("requestFatigue", (Object) jSONObject);
                }
                long longValue = jSONObject.getLongValue("lastTime");
                int intValue = jSONObject.getIntValue(Constants.KEY_TIMES);
                if (longValue <= 0 || a(longValue * 1000)) {
                    i = intValue;
                }
                jSONObject.put(Constants.KEY_TIMES, (Object) Integer.valueOf(i + 1));
                jSONObject.put("lastTime", (Object) Long.valueOf(System.currentTimeMillis() / 1000));
                a(this.b, JSON.toJSONString(this.c));
            }
        }
    }

    public void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            kha.a(new Runnable() { // from class: com.taobao.desktop.channel.desktoplinktask.trigger.-$$Lambda$c$PuEvTwrirROxgoGoLXNW5py7XLQ
                {
                    c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.lambda$PuEvTwrirROxgoGoLXNW5py7XLQ(c.this, str);
                }
            });
        }
    }

    public /* synthetic */ void f(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        synchronized (c.class) {
            try {
                JSONObject jSONObject = this.c.getJSONObject("displayFatigue");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    jSONObject.put("biz", (Object) new JSONObject());
                    this.c.put("displayFatigue", (Object) jSONObject);
                }
                long longValue = jSONObject.getLongValue("lastTime");
                int intValue = jSONObject.getIntValue(Constants.KEY_TIMES);
                if (longValue <= 0 || a(longValue * 1000)) {
                    i = intValue;
                }
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                jSONObject.put(Constants.KEY_TIMES, (Object) Integer.valueOf(i + 1));
                jSONObject.put("lastTime", (Object) Long.valueOf(currentTimeMillis));
                if (!StringUtils.isEmpty(str)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("biz");
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
                    if (jSONObject3 == null) {
                        jSONObject3 = new JSONObject();
                        jSONObject2.put(str, (Object) jSONObject3);
                    }
                    long longValue2 = jSONObject3.getLongValue("lastTime");
                    long longValue3 = jSONObject3.getLongValue(Constants.KEY_TIMES);
                    if (longValue2 > 0 && !a(longValue2 * 1000)) {
                        longValue3 = 0;
                    }
                    jSONObject3.put(Constants.KEY_TIMES, (Object) Long.valueOf(longValue3 + 1));
                    jSONObject3.put("lastTime", (Object) Long.valueOf(currentTimeMillis));
                }
                a(this.b, JSON.toJSONString(this.c));
            }
        }
    }

    private JSONObject d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("efd4af15", new Object[]{this, str});
        }
        try {
            String e = e(str);
            return !StringUtils.isEmpty(e) ? JSON.parseObject(e) : new JSONObject();
        } catch (Throwable th) {
            th.printStackTrace();
            return new JSONObject();
        }
    }

    private boolean b(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66fff", new Object[]{this, new Long(j)})).booleanValue() : j > 0 && (System.currentTimeMillis() / 1000) - j > 2592000;
    }

    public boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (j <= 0) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(System.currentTimeMillis()));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j));
        return calendar2.get(1) == calendar.get(1) && calendar2.get(6) == calendar.get(6);
    }

    private String e(String str) {
        FileInputStream fileInputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        if (!file.exists()) {
            return "";
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                return new String(bArr);
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                    return "";
                } finally {
                    a(fileInputStream);
                }
            }
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    private void a(String str, String str2) {
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            Closeable closeable = null;
            try {
                File file = new File(str);
                if (file.exists() && file.isDirectory()) {
                    file.delete();
                }
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                if (!file.exists()) {
                    file.createNewFile();
                }
                fileOutputStream = new FileOutputStream(file, false);
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileOutputStream.write(str2.getBytes());
                fileOutputStream.flush();
                a(fileOutputStream);
            } catch (Throwable th2) {
                closeable = fileOutputStream;
                th = th2;
                try {
                    th.printStackTrace();
                } finally {
                    a(closeable);
                }
            }
        }
    }

    private void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{this, closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
