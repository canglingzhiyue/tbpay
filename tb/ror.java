package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.b;
import com.uploader.implement.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.android.spdy.IPluginFetchCallback;
import org.android.spdy.SpdyAgent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.rog;

/* loaded from: classes9.dex */
public class ror {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f33272a;
    private SharedPreferences b;
    private d c;
    private ThreadPoolExecutor d;
    private HashMap<String, Pair<Boolean, Long>> e;
    private boolean f;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final ror f33278a = new ror();

        public static /* synthetic */ ror a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ror) ipChange.ipc$dispatch("f0a25e9", new Object[0]) : f33278a;
        }
    }

    public static /* synthetic */ void a(ror rorVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6e68e3", new Object[]{rorVar});
        } else {
            rorVar.d();
        }
    }

    public static /* synthetic */ void a(ror rorVar, boolean z, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c03449", new Object[]{rorVar, new Boolean(z), str, new Long(j)});
        } else {
            rorVar.a(z, str, j);
        }
    }

    public static /* synthetic */ d b(ror rorVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("9f2169c", new Object[]{rorVar}) : rorVar.c;
    }

    public static /* synthetic */ HashMap c(ror rorVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("cb25dc08", new Object[]{rorVar}) : rorVar.e;
    }

    public static /* synthetic */ SharedPreferences d(ror rorVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("1e2693ba", new Object[]{rorVar}) : rorVar.b;
    }

    private ror() {
    }

    public static ror a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ror) ipChange.ipc$dispatch("f0a25e9", new Object[0]) : a.a();
    }

    public void a(Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd02a0a", new Object[]{this, context, dVar});
        } else if (this.f) {
        } else {
            this.f33272a = context;
            this.b = PreferenceManager.getDefaultSharedPreferences(context);
            this.c = dVar;
            this.d = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(1024), new ThreadFactory() { // from class: tb.ror.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "aus_quic_detect");
                }
            });
            if (Build.VERSION.SDK_INT > 8) {
                this.d.allowCoreThreadTimeOut(true);
            }
            this.f = true;
            if (!c()) {
                SpdyAgent.registerQuicListener(new IPluginFetchCallback() { // from class: tb.ror.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // org.android.spdy.IPluginFetchCallback
                    public void onFetchFinished(boolean z, Map<String, Object> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1d759e5", new Object[]{this, new Boolean(z), map});
                        } else if (!z) {
                        } else {
                            ror.this.b();
                            SpdyAgent.unregisterQuicListener(this);
                        }
                    }
                });
            } else {
                b();
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = this.d;
        if (threadPoolExecutor == null) {
            return;
        }
        threadPoolExecutor.submit(new Runnable() { // from class: tb.ror.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    ror.a(ror.this);
                } catch (Exception e) {
                    if (!com.uploader.implement.a.a(16)) {
                        return;
                    }
                    com.uploader.implement.a.a(16, "QuicConnectionDetector", "detect error.", e);
                }
            }
        });
    }

    private void d() {
        NetworkInfo b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (b.c() && c() && (b = roz.b(this.f33272a)) != null && b.isConnected()) {
            final String extraInfo = !TextUtils.isEmpty(b.getExtraInfo()) ? b.getExtraInfo() : "default";
            if (this.e == null) {
                this.e = new HashMap<>();
                String string = this.b.getString("aus_quic_history_record", null);
                if (!TextUtils.isEmpty(string)) {
                    try {
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("network");
                            boolean z = jSONObject.getBoolean("result");
                            this.e.put(string2, new Pair<>(Boolean.valueOf(z), Long.valueOf(jSONObject.getLong("time"))));
                            if (string2 != null && string2.equalsIgnoreCase(extraInfo)) {
                                this.c.f24068a.b(z);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
            final long currentTimeMillis = System.currentTimeMillis();
            Pair<Boolean, Long> pair = this.e.get(extraInfo);
            if (pair != null && currentTimeMillis - ((Long) pair.second).longValue() < android.taobao.windvane.util.b.DEFAULT_MAX_AGE) {
                if (!com.uploader.implement.a.a(16)) {
                    return;
                }
                com.uploader.implement.a.a(16, "QuicConnectionDetector", "detect in valid period, not need to detect.");
                return;
            }
            List<d.a.b> f = this.c.f24068a.f();
            if (f.size() == 0) {
                return;
            }
            d.a.b bVar = f.get(0);
            final rog rogVar = new rog(this.c, new rok(bVar.f24072a, bVar.b, true, bVar.d, bVar.c));
            final ros rosVar = new ros();
            rosVar.f33279a = bVar.f24072a;
            rosVar.b = bVar.b;
            rosVar.c = bVar.c;
            rosVar.d = extraInfo;
            rogVar.a(new rog.a() { // from class: tb.ror.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rog.a
                public void a(int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i2), new Integer(i3)});
                    }
                }

                @Override // tb.rog.a
                public void a(byte[] bArr, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2713f1b4", new Object[]{this, bArr, new Integer(i2)});
                    }
                }

                @Override // tb.rog.a
                public void b(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
                    }
                }

                @Override // tb.rog.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    ror.a(ror.this, true, extraInfo, currentTimeMillis);
                    rogVar.b();
                    ros rosVar2 = rosVar;
                    rosVar2.e = 1;
                    rosVar2.g = System.currentTimeMillis() - currentTimeMillis;
                    rosVar.a();
                }

                @Override // tb.rog.a
                public void a(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                    } else if (i2 == -2002) {
                    } else {
                        ror.a(ror.this, false, extraInfo, currentTimeMillis);
                        ros rosVar2 = rosVar;
                        rosVar2.e = 0;
                        rosVar2.f = i2;
                        rosVar2.a();
                    }
                }
            });
            rogVar.a();
        }
    }

    private void a(final boolean z, final String str, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec16434e", new Object[]{this, new Boolean(z), str, new Long(j)});
        } else {
            this.d.submit(new Runnable() { // from class: tb.ror.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (com.uploader.implement.a.a(16)) {
                        com.uploader.implement.a.a(16, "QuicConnectionDetector", "saveResult, result:" + z + ", network:" + str);
                    }
                    ror.b(ror.this).f24068a.b(z);
                    ror.c(ror.this).put(str, new Pair(Boolean.valueOf(z), Long.valueOf(j)));
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry entry : ror.c(ror.this).entrySet()) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("network", entry.getKey());
                            jSONObject.put("result", ((Pair) entry.getValue()).first);
                            jSONObject.put("time", ((Pair) entry.getValue()).second);
                            jSONArray.put(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                    ror.d(ror.this).edit().putString("aus_quic_history_record", jSONArray.toString()).apply();
                }
            });
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : SpdyAgent.isQuicReady();
    }
}
