package com.etao.feimagesearch.videosearch;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.util.PicParamUtils;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.o;
import com.etao.feimagesearch.util.w;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.mtop.domain.MtopResponse;
import tb.cui;
import tb.kge;

/* loaded from: classes4.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ThreadPoolExecutor f7081a = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.etao.feimagesearch.videosearch.o.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public AtomicInteger f7082a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "VideoResultFetcher_" + this.f7082a.getAndIncrement());
        }
    });
    private Handler b = new Handler(Looper.getMainLooper());
    private long c = System.currentTimeMillis();
    private Map<String, a> d = new HashMap();
    private Map<String, Set<b>> e = new HashMap();

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f7087a;
        public String b;
        public boolean c;

        static {
            kge.a(-483987495);
        }

        public a(JSONObject jSONObject, String str, boolean z) {
            this.f7087a = jSONObject;
            this.b = str;
            this.c = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface b {
        void a();

        void a(JSONObject jSONObject, String str, boolean z);
    }

    static {
        kge.a(-1631825270);
    }

    public static /* synthetic */ Bitmap a(o oVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("6cf9084b", new Object[]{oVar, str}) : oVar.b(str);
    }

    public static /* synthetic */ Map a(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8293a258", new Object[]{oVar}) : oVar.d;
    }

    public static /* synthetic */ void a(o oVar, Bitmap bitmap, String str, RectF rectF, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abdf544", new Object[]{oVar, bitmap, str, rectF, str2, new Boolean(z)});
        } else {
            oVar.a(bitmap, str, rectF, str2, z);
        }
    }

    public static /* synthetic */ void a(o oVar, String str, JSONObject jSONObject, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7deec547", new Object[]{oVar, str, jSONObject, str2, new Boolean(z)});
        } else {
            oVar.a(str, jSONObject, str2, z);
        }
    }

    public static /* synthetic */ Handler b(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("66642c22", new Object[]{oVar}) : oVar.b;
    }

    public static /* synthetic */ void b(o oVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c190ee", new Object[]{oVar, str});
        } else {
            oVar.a(str);
        }
    }

    public o() {
        this.f7081a.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        this.f7081a.allowCoreThreadTimeOut(true);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.removeCallbacksAndMessages(null);
        }
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.c;
    }

    private boolean a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c59ca6f3", new Object[]{this, str, bVar})).booleanValue();
        }
        a aVar = this.d.get(str);
        if (aVar == null) {
            return false;
        }
        bVar.a(aVar.f7087a, aVar.b, aVar.c);
        return true;
    }

    public void a(final String str, final RectF rectF, b bVar, final String str2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5978f74a", new Object[]{this, str, rectF, bVar, str2, new Boolean(z)});
            return;
        }
        final String a2 = a(str, rectF);
        if (a(a2, bVar)) {
            return;
        }
        if (this.e.containsKey(a2)) {
            this.e.get(a2).add(bVar);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(bVar);
        this.e.put(a2, hashSet);
        this.f7081a.execute(new ac() { // from class: com.etao.feimagesearch.videosearch.o.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    o.a(o.this, o.a(o.this, str), a2, rectF, str2, z);
                }
            }
        });
    }

    private String a(String str, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db930dbd", new Object[]{this, str, rectF});
        }
        return str + rectF.toString();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f7081a.shutdownNow();
        }
    }

    private void a(Bitmap bitmap, final String str, RectF rectF, String str2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acde3e89", new Object[]{this, bitmap, str, rectF, str2, new Boolean(z)});
            return;
        }
        final String str3 = ((int) Math.floor(rectF.left * bitmap.getWidth())) + "," + ((int) Math.floor(rectF.right * bitmap.getWidth())) + "," + ((int) Math.floor(rectF.top * bitmap.getHeight())) + "," + ((int) Math.floor(rectF.bottom * bitmap.getHeight()));
        String a2 = com.etao.feimagesearch.util.d.a(bitmap, Bitmap.CompressFormat.JPEG, 70);
        HashMap hashMap = new HashMap(w.a(str2, null));
        hashMap.put("pssource", str2);
        hashMap.put(PicParamUtils.b(), PicParamUtils.CameraMode.unknown.name());
        if (!StringUtils.isEmpty(a2)) {
            hashMap.put(com.etao.feimagesearch.util.o.KEY_IMG, a2);
        }
        hashMap.put(com.etao.feimagesearch.util.h.KEY_VIDEO_ID, String.valueOf(this.c));
        hashMap.put("region", str3);
        com.etao.feimagesearch.util.o.a(hashMap);
        com.etao.feimagesearch.util.o.b(hashMap);
        com.etao.feimagesearch.util.o.a(com.etao.feimagesearch.config.b.i(str2), com.etao.feimagesearch.config.b.I(), com.etao.feimagesearch.config.b.J(), hashMap, new o.a() { // from class: com.etao.feimagesearch.videosearch.o.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.o.a
            public void a(MtopResponse mtopResponse, String str4, String str5, final JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5796e64f", new Object[]{this, mtopResponse, str4, str5, jSONObject});
                } else {
                    o.b(o.this).post(new Runnable() { // from class: com.etao.feimagesearch.videosearch.o.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            o.a(o.this).put(str, new a(jSONObject, str3, z));
                            o.a(o.this, str, jSONObject, str3, z);
                        }
                    });
                }
            }

            @Override // com.etao.feimagesearch.util.o.a
            public void a(String str4, String str5, Integer num, String str6) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5e122485", new Object[]{this, str4, str5, num, str6});
                } else {
                    o.b(o.this).post(new Runnable() { // from class: com.etao.feimagesearch.videosearch.o.3.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                o.b(o.this, str);
                            }
                        }
                    });
                }
            }
        });
    }

    private void a(String str, JSONObject jSONObject, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd8c388c", new Object[]{this, str, jSONObject, str2, new Boolean(z)});
            return;
        }
        Set<b> remove = this.e.remove(str);
        if (remove == null) {
            return;
        }
        for (b bVar : remove) {
            bVar.a(jSONObject, str2, z);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Set<b> remove = this.e.remove(str);
        if (remove == null) {
            return;
        }
        for (b bVar : remove) {
            bVar.a();
        }
    }

    private Bitmap b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a657cb51", new Object[]{this, str});
        }
        int maxSize = IrpParamModel.getMaxSize(Globals.getApplication());
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (str.startsWith("/") || StringUtils.isEmpty(scheme)) {
            return cui.a(BitmapFactory.decodeFile(str), 0, 1, 1, maxSize);
        }
        if (StringUtils.equals(scheme, "file")) {
            return cui.a(cui.a(Globals.getApplication(), parse, maxSize), 0, 1, 1, maxSize);
        }
        if (!StringUtils.equals(scheme, "content")) {
            return null;
        }
        return cui.a(cui.a(Globals.getApplication(), parse, maxSize), 0, 1, 1, maxSize);
    }
}
