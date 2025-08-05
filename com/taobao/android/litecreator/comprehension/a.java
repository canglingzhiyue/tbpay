package com.taobao.android.litecreator.comprehension;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.ab;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.litecreator.util.n;
import com.taobao.android.litecreator.util.u;
import com.taobao.tao.Globals;
import com.uploader.export.i;
import com.uploader.export.j;
import com.uploader.export.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.gxe;
import tb.ios;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class a extends Observable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Handler b;
    public String c;
    private b d;
    public String g;
    private String h;
    private JSONObject i;
    private String j;
    private Runnable m;
    private Runnable n;
    private gxe o;
    private AsyncTaskC0515a p;
    public long q;
    public int r;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f13314a = new ArrayList();
    private List<String> e = new ArrayList();
    private String f = "";
    private volatile boolean k = false;
    private volatile boolean l = false;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Runnable a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("c83b5d2f", new Object[]{aVar}) : aVar.n;
    }

    public static /* synthetic */ Runnable a(a aVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("6ac2da71", new Object[]{aVar, runnable});
        }
        aVar.n = runnable;
        return runnable;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded6ab33", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.l = z;
        return z;
    }

    public static /* synthetic */ Runnable b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("4a86120e", new Object[]{aVar}) : aVar.m;
    }

    public static /* synthetic */ Runnable b(a aVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("69e969d0", new Object[]{aVar, runnable});
        }
        aVar.m = runnable;
        return runnable;
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8f229d2", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.k = z;
        return z;
    }

    public static /* synthetic */ b c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3486ea2b", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ String d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c422f8d8", new Object[]{aVar}) : aVar.j;
    }

    public static /* synthetic */ Handler e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a01d14da", new Object[0]) : b;
    }

    static {
        kge.a(-1309361756);
        b = new Handler(Looper.getMainLooper());
    }

    public a(String str, b bVar) {
        this.d = bVar;
        this.j = str;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (this.k) {
            this.m = runnable;
        } else {
            runnable.run();
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String str = h.INSTANCE.d().get(this.h);
        return !TextUtils.isEmpty(str) ? gxe.a(str) : "";
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
        } else if (this.l) {
            this.n = runnable;
        } else {
            runnable.run();
        }
    }

    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.e.clear();
        List<String> list2 = this.e;
        if (list == null) {
            list = new ArrayList<>();
        }
        list2.addAll(list);
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.h = str;
        if (!TextUtils.isEmpty(h.INSTANCE.d().get(str))) {
            return;
        }
        if (this.o == null) {
            this.o = new gxe();
        }
        this.l = true;
        this.o.a(Globals.getApplication(), str, new gxe.a() { // from class: com.taobao.android.litecreator.comprehension.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gxe.a
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    return;
                }
                h.INSTANCE.d().put(str, str2);
                a.a(a.this, false);
                au.a(a.a(a.this));
                a.a(a.this, (Runnable) null);
            }

            @Override // tb.gxe.a
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                } else {
                    a.a(a.this, false);
                }
            }
        });
    }

    public void a(List<String> list, boolean z, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9aef36", new Object[]{this, list, new Boolean(z), cVar});
        } else if (list == null || list.size() <= 0) {
            au.a(this.m);
            this.m = null;
            this.k = false;
        } else {
            AsyncTaskC0515a asyncTaskC0515a = this.p;
            if (asyncTaskC0515a != null) {
                AsyncTaskC0515a.a(asyncTaskC0515a);
            }
            this.k = true;
            this.d.d().g = list.size();
            this.p = new AsyncTaskC0515a(list, this, cVar, new Runnable() { // from class: com.taobao.android.litecreator.comprehension.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    au.a(a.b(a.this));
                    a.b(a.this, (Runnable) null);
                    a.b(a.this, false);
                }
            });
            this.p.execute(new Object[0]);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.i = jSONObject;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f13314a.clear();
        this.e.clear();
        this.f = null;
        this.i = null;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f13314a.size() > 0 || this.e.size() > 0 || !TextUtils.isEmpty(this.f) || !TextUtils.isEmpty(this.g);
    }

    public JSONObject a(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5d5fb280", new Object[]{this, jSONArray, jSONObject});
        }
        final JSONArray jSONArray2 = new JSONArray();
        ab.a(this.f13314a, new ab.a<String>() { // from class: com.taobao.android.litecreator.comprehension.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.util.ab.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("imageUrl", (Object) str);
                jSONArray2.add(jSONObject2);
            }
        });
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = this.i;
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            jSONObject2.putAll(this.i);
        }
        jSONObject2.put("title", this.c);
        jSONObject2.put("text", this.f);
        jSONObject2.put("selectItems", b(this.e));
        jSONObject2.put("images", (Object) jSONArray2);
        jSONObject2.put("recommendKeys", (Object) jSONArray);
        if (!TextUtils.isEmpty(this.g)) {
            JSONArray jSONArray3 = new JSONArray();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("title", (Object) this.g);
            jSONObject4.put("categoryId", (Object) Long.valueOf(this.q));
            jSONArray3.add(jSONObject4);
            jSONObject2.put("items", (Object) jSONArray3);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("total", (Object) Integer.valueOf(this.r));
            jSONObject2.put("score", (Object) jSONObject5);
        }
        if (jSONObject != null) {
            Object jSONArray4 = jSONObject.getJSONArray("labels");
            String string = jSONObject.getString("materialVersion");
            if (jSONArray4 != null) {
                jSONObject2.put("labels", jSONArray4);
            }
            if (!TextUtils.isEmpty(string)) {
                jSONObject2.put("materialVersion", Integer.valueOf(string));
            }
        }
        u.b("LCCOM.Data", "start to request data: " + jSONArray2.size());
        return jSONObject2;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f13314a.size();
    }

    private JSONArray b(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b9b3a024", new Object[]{this, list});
        }
        final JSONArray jSONArray = new JSONArray();
        ab.a(list, new ab.a<String>() { // from class: com.taobao.android.litecreator.comprehension.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.util.ab.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    jSONArray.add(str);
                }
            }
        });
        return jSONArray;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    /* renamed from: com.taobao.android.litecreator.comprehension.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class AsyncTaskC0515a extends AsyncTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final c f13319a;
        private List<String> c;
        private List<String> e;
        private Runnable f;
        private a g;
        private boolean b = false;
        private List<String> d = new ArrayList();

        static {
            kge.a(1067704153);
        }

        public static /* synthetic */ Object ipc$super(AsyncTaskC0515a asyncTaskC0515a, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ void a(AsyncTaskC0515a asyncTaskC0515a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fabe0b28", new Object[]{asyncTaskC0515a});
            } else {
                asyncTaskC0515a.b();
            }
        }

        public static /* synthetic */ void a(AsyncTaskC0515a asyncTaskC0515a, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fed5baf2", new Object[]{asyncTaskC0515a, str});
            } else {
                asyncTaskC0515a.a(str);
            }
        }

        public static /* synthetic */ void a(AsyncTaskC0515a asyncTaskC0515a, String str, CountDownLatch countDownLatch) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85652404", new Object[]{asyncTaskC0515a, str, countDownLatch});
            } else {
                asyncTaskC0515a.a(str, countDownLatch);
            }
        }

        public static /* synthetic */ a b(AsyncTaskC0515a asyncTaskC0515a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e85bdcaa", new Object[]{asyncTaskC0515a}) : asyncTaskC0515a.g;
        }

        public static /* synthetic */ void b(AsyncTaskC0515a asyncTaskC0515a, String str, CountDownLatch countDownLatch) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5e039a3", new Object[]{asyncTaskC0515a, str, countDownLatch});
            } else {
                asyncTaskC0515a.c(str, countDownLatch);
            }
        }

        private synchronized void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.d.add(str);
            }
        }

        private synchronized List<String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
            }
            return this.d;
        }

        public AsyncTaskC0515a(List<String> list, a aVar, c cVar, Runnable runnable) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                arrayList.addAll(list);
            }
            this.c = arrayList;
            this.g = aVar;
            this.e = aVar.f13314a;
            this.f = runnable;
            this.f13319a = cVar;
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr});
            }
            if (this.b) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            final CountDownLatch countDownLatch = new CountDownLatch(this.c.size());
            ab.a(this.c, new ab.a<String>() { // from class: com.taobao.android.litecreator.comprehension.a.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.litecreator.util.ab.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else {
                        AsyncTaskC0515a.a(AsyncTaskC0515a.this, str, countDownLatch);
                    }
                }
            });
            long j = 10000;
            try {
                if (this.f13319a != null) {
                    j = this.f13319a.f13331a;
                }
                boolean await = countDownLatch.await(j, TimeUnit.MILLISECONDS);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                u.c("LCCOM.Data", "processImage success:" + await + ", cost:" + currentTimeMillis2 + "ms");
                a.c(this.g).d().e = currentTimeMillis2;
                if (!this.b) {
                    this.e.addAll(a());
                }
            } catch (InterruptedException e) {
                u.d("LCCOM.Data", "processImage exception:" + Log.getStackTraceString(e));
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, obj});
                return;
            }
            super.onPostExecute(obj);
            Runnable runnable = this.f;
            if (runnable == null || this.b) {
                return;
            }
            runnable.run();
        }

        private void a(String str, CountDownLatch countDownLatch) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71f25ac4", new Object[]{this, str, countDownLatch});
            } else if (!k.a(str)) {
                countDownLatch.countDown();
            } else {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                float f = i2 == 0 ? 0.0f : i / i2;
                if (f < 0.33333334f || f > 3.0f) {
                    countDownLatch.countDown();
                    u.c("LCCOM.Data", "setImages.processImageEach. invalid image ratio:" + f);
                    return;
                }
                String str2 = h.INSTANCE.c().get(str);
                if (!TextUtils.isEmpty(str2)) {
                    a(str2);
                    countDownLatch.countDown();
                    u.b("LCCOM.Data", "setImages.processImageEach. image has already uploaded.");
                    return;
                }
                b(str, countDownLatch);
            }
        }

        private void b(final String str, final CountDownLatch countDownLatch) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77f62623", new Object[]{this, str, countDownLatch});
            } else {
                au.b(new Runnable() { // from class: com.taobao.android.litecreator.comprehension.a.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AsyncTaskC0515a.b(AsyncTaskC0515a.this, str, countDownLatch);
                        }
                    }
                });
            }
        }

        private void c(final String str, final CountDownLatch countDownLatch) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7df9f182", new Object[]{this, str, countDownLatch});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            final String d = n.d(Globals.getApplication());
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                int d2 = k.d(str);
                if (com.taobao.android.litecreator.util.c.a(Math.max(1.0f, Math.min(i / 256.0f, i2 / 256.0f))) == 1 && d2 == 0) {
                    k.a(str, d);
                    z = true;
                } else {
                    Bitmap b = b(str);
                    z = com.taobao.android.litecreator.util.c.a(b, d);
                    if (b != null && !b.isRecycled()) {
                        b.recycle();
                    }
                }
            } catch (Throwable unused) {
                z = false;
            }
            if (!z || !k.a(d)) {
                u.d("LCCOM.Data", "compressAndUploadImageAsync. compress failed!");
                countDownLatch.countDown();
                return;
            }
            u.b("LCCOM.Data", "compressAndUploadImageAsync: time=" + (System.currentTimeMillis() - currentTimeMillis) + " p=" + d + " " + k.b(d));
            a.c(this.g).d().a(System.currentTimeMillis() - currentTimeMillis);
            final long currentTimeMillis2 = System.currentTimeMillis();
            f fVar = new f();
            fVar.b(ios.a(a.d(this.g)).h());
            fVar.c(f.FILE_TYPE_IMAGE_JPG);
            fVar.a(d);
            l.a().uploadAsync(fVar, new e() { // from class: com.taobao.android.litecreator.comprehension.a.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.litecreator.comprehension.e, com.uploader.export.d
                public void onSuccess(i iVar, com.uploader.export.e eVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e0ea4aef", new Object[]{this, iVar, eVar});
                        return;
                    }
                    k.c(d);
                    String b2 = eVar != null ? eVar.b() : "";
                    if (TextUtils.isEmpty(b2)) {
                        countDownLatch.countDown();
                        return;
                    }
                    a.c(AsyncTaskC0515a.b(AsyncTaskC0515a.this)).d().b(System.currentTimeMillis() - currentTimeMillis2);
                    h.INSTANCE.c().put(str, b2);
                    AsyncTaskC0515a.a(AsyncTaskC0515a.this, b2);
                    countDownLatch.countDown();
                }

                @Override // com.taobao.android.litecreator.comprehension.e, com.uploader.export.d
                public void onFailure(i iVar, j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b751f291", new Object[]{this, iVar, jVar});
                        return;
                    }
                    u.d("LCCOM.Data", "compressAndUploadImageAsync. upload failed! error:(" + jVar.c + "," + jVar.f24058a + riy.BRACKET_END_STR);
                    countDownLatch.countDown();
                }
            }, a.e());
        }

        private Bitmap b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("a657cb51", new Object[]{this, str});
            }
            Bitmap a2 = com.taobao.android.litecreator.util.c.a(str, 256, false);
            if (a2 == null) {
                return null;
            }
            float min = Math.min(a2.getWidth() / 256.0f, a2.getHeight() / 256.0f);
            Matrix matrix = new Matrix();
            float f = 1.0f / min;
            matrix.postScale(f, f);
            return Bitmap.createBitmap(a2, 0, 0, a2.getWidth(), a2.getHeight(), matrix, true);
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            u.c("LCCOM.Data", "ProcessImageTask.cancel.");
            this.b = true;
        }
    }
}
