package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import tb.ajm;
import tb.akh;
import tb.akl;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a */
    private static final Map<String, o<g>> f1746a = new HashMap();
    private static final byte[] b = {80, 75, 3, 4};

    private static i a(g gVar, String str) {
        for (i iVar : gVar.l().values()) {
            if (iVar.d().equals(str)) {
                return iVar;
            }
        }
        return null;
    }

    public static /* synthetic */ n a(g gVar) throws Exception {
        return new n(gVar);
    }

    public static n<g> a(JsonReader jsonReader, String str) {
        return a(jsonReader, str, true);
    }

    private static n<g> a(JsonReader jsonReader, String str, boolean z) {
        try {
            try {
                g a2 = ajm.a(jsonReader);
                if (str != null) {
                    akh.c("fromJsonReaderSyncInternal:key==" + str);
                    com.airbnb.lottie.model.f.a().a(str, a2);
                }
                n<g> nVar = new n<>(a2);
                if (z) {
                    akl.a(jsonReader);
                }
                return nVar;
            } catch (Exception e) {
                n<g> nVar2 = new n<>(e);
                if (z) {
                    akl.a(jsonReader);
                }
                return nVar2;
            }
        } catch (Throwable th) {
            if (z) {
                akl.a(jsonReader);
            }
            throw th;
        }
    }

    private static n<g> a(InputStream inputStream, String str, boolean z) {
        try {
            return a(JsonReader.a(okio.e.a(okio.e.a(inputStream))), str);
        } finally {
            if (z) {
                akl.a(inputStream);
            }
        }
    }

    public static /* synthetic */ n a(WeakReference weakReference, Context context, int i, String str) throws Exception {
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            context2 = context;
        }
        return b(context2, i, str);
    }

    public static o<g> a(Context context, int i) {
        return a(context, i, c(context, i));
    }

    public static o<g> a(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: com.airbnb.lottie.-$$Lambda$h$G9q7SLlyNvYSivAQnWZH0XuTIDs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h.lambda$G9q7SLlyNvYSivAQnWZH0XuTIDs(weakReference, applicationContext, i, str);
            }
        });
    }

    public static o<g> a(Context context, String str) {
        return a(context, str, "url_" + str);
    }

    public static o<g> a(final Context context, final String str, final String str2) {
        return a(str2, new Callable() { // from class: com.airbnb.lottie.-$$Lambda$h$f0CwjLXnod1GASbk3t9QShlG6AU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h.lambda$f0CwjLXnod1GASbk3t9QShlG6AU(context, str, str2);
            }
        });
    }

    public static o<g> a(final InputStream inputStream, final String str) {
        return a(str, new Callable() { // from class: com.airbnb.lottie.-$$Lambda$h$zufdhl91UThaiHu9wE112gy1xwU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h.lambda$zufdhl91UThaiHu9wE112gy1xwU(inputStream, str);
            }
        });
    }

    private static o<g> a(final String str, Callable<n<g>> callable) {
        final g a2 = str == null ? null : com.airbnb.lottie.model.f.a().a(str);
        if (a2 != null) {
            akh.c(str + " has cache LottieComposition");
            return new o<>(new Callable() { // from class: com.airbnb.lottie.-$$Lambda$h$OYIaw-VbvybZsNZu5kOzprRRYrk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    n a3;
                    a3 = h.a(g.this);
                    return a3;
                }
            });
        } else if (str != null && f1746a.containsKey(str)) {
            return f1746a.get(str);
        } else {
            o<g> oVar = new o<>(callable);
            if (str != null) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                oVar.a(new j() { // from class: com.airbnb.lottie.-$$Lambda$h$iWCwH56o2vInVyYYt5dc5ZGwSAU
                    @Override // com.airbnb.lottie.j
                    public final void onResult(Object obj) {
                        h.a(str, atomicBoolean, (g) obj);
                    }
                });
                oVar.c(new j() { // from class: com.airbnb.lottie.-$$Lambda$h$1EHyB5Wx3Fz7kPlBfIhPglcgj58
                    @Override // com.airbnb.lottie.j
                    public final void onResult(Object obj) {
                        h.lambda$1EHyB5Wx3Fz7kPlBfIhPglcgj58(str, atomicBoolean, (Throwable) obj);
                    }
                });
                if (!atomicBoolean.get()) {
                    f1746a.put(str, oVar);
                }
            }
            return oVar;
        }
    }

    public static o<g> a(final ZipInputStream zipInputStream, final String str) {
        return a(str, new Callable() { // from class: com.airbnb.lottie.-$$Lambda$h$q7nUJ9MegrDoYYM4-tTUyXWt27o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h.m92lambda$q7nUJ9MegrDoYYM4tTUyXWt27o(zipInputStream, str);
            }
        });
    }

    private static Boolean a(okio.d dVar) {
        try {
            okio.d d = dVar.d();
            for (byte b2 : b) {
                if (d.g() != b2) {
                    return false;
                }
            }
            d.close();
            return true;
        } catch (Exception e) {
            akh.b("Failed to check zip file header", e);
            return false;
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static /* synthetic */ void a(String str, AtomicBoolean atomicBoolean, g gVar) {
        f1746a.remove(str);
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void a(String str, AtomicBoolean atomicBoolean, Throwable th) {
        f1746a.remove(str);
        atomicBoolean.set(true);
    }

    private static boolean a(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static n<g> b(Context context, int i) {
        return b(context, i, c(context, i));
    }

    public static n<g> b(Context context, int i, String str) {
        try {
            akh.c("fromRawResSync:rawRes==" + i + " key==" + str);
            okio.d a2 = okio.e.a(okio.e.a(context.getResources().openRawResource(i)));
            return a(a2).booleanValue() ? b(new ZipInputStream(a2.e()), str) : b(a2.e(), str);
        } catch (Resources.NotFoundException e) {
            return new n<>(e);
        }
    }

    public static n<g> b(InputStream inputStream, String str) {
        return a(inputStream, str, true);
    }

    public static n<g> b(ZipInputStream zipInputStream, String str) {
        try {
            return c(zipInputStream, str);
        } finally {
            akl.a(zipInputStream);
        }
    }

    public static o<g> b(Context context, String str) {
        return b(context, str, "asset_" + str);
    }

    public static o<g> b(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return a(str2, new Callable() { // from class: com.airbnb.lottie.-$$Lambda$h$7DTFVfFeLZxPonMNm9lmX9oxCrs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h.lambda$7DTFVfFeLZxPonMNm9lmX9oxCrs(applicationContext, str, str2);
            }
        });
    }

    public static n<g> c(Context context, String str) {
        return c(context, str, "asset_" + str);
    }

    public static n<g> c(Context context, String str, String str2) {
        try {
            akh.c("fromAssetSync:fileName==" + str + " key==" + str2);
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return b(context.getAssets().open(str), str2);
            }
            return b(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new n<>(e);
        }
    }

    private static n<g> c(ZipInputStream zipInputStream, String str) {
        String[] split;
        akh.c("fromZipStreamSyncInternal:key==" + str);
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            g gVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("__MACOSX") && !nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    if (nextEntry.getName().contains(".json")) {
                        gVar = a(JsonReader.a(okio.e.a(okio.e.a(zipInputStream))), (String) null, false).a();
                    } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                        hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (gVar == null) {
                return new n<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                i a2 = a(gVar, (String) entry.getKey());
                if (a2 != null) {
                    a2.a(akl.a((Bitmap) entry.getValue(), a2.a(), a2.b()));
                }
            }
            for (Map.Entry<String, i> entry2 : gVar.l().entrySet()) {
                if (entry2.getValue().e() == null) {
                    return new n<>(new IllegalStateException("There is no image for " + entry2.getValue().d()));
                }
            }
            if (str != null) {
                com.airbnb.lottie.model.f.a().a(str, gVar);
            }
            return new n<>(gVar);
        } catch (IOException e) {
            return new n<>(e);
        }
    }

    private static String c(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(a(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    public static /* synthetic */ n e(Context context, String str, String str2) throws Exception {
        n<g> a2 = f.a(context).a(str, str2);
        if (str2 != null && a2.a() != null) {
            com.airbnb.lottie.model.f.a().a(str2, a2.a());
        }
        return a2;
    }

    public static /* synthetic */ void lambda$1EHyB5Wx3Fz7kPlBfIhPglcgj58(String str, AtomicBoolean atomicBoolean, Throwable th) {
        a(str, atomicBoolean, th);
    }

    public static /* synthetic */ n lambda$7DTFVfFeLZxPonMNm9lmX9oxCrs(Context context, String str, String str2) {
        return c(context, str, str2);
    }

    public static /* synthetic */ n lambda$G9q7SLlyNvYSivAQnWZH0XuTIDs(WeakReference weakReference, Context context, int i, String str) {
        return a(weakReference, context, i, str);
    }

    public static /* synthetic */ n lambda$f0CwjLXnod1GASbk3t9QShlG6AU(Context context, String str, String str2) {
        return e(context, str, str2);
    }

    /* renamed from: lambda$q7nUJ9MegrDoYYM4-tTUyXWt27o */
    public static /* synthetic */ n m92lambda$q7nUJ9MegrDoYYM4tTUyXWt27o(ZipInputStream zipInputStream, String str) {
        return b(zipInputStream, str);
    }

    public static /* synthetic */ n lambda$zufdhl91UThaiHu9wE112gy1xwU(InputStream inputStream, String str) {
        return b(inputStream, str);
    }
}
