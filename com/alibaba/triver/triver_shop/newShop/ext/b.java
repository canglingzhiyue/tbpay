package com.alibaba.triver.triver_shop.newShop.ext;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.cei;
import tb.kge;
import tb.ruk;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f3845a;
    private static final HandlerThread b;
    private static final Handler c;
    private static final HandlerThread d;
    private static final Handler e;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3846a;
        public final /* synthetic */ ruk<t> b;

        public a(String str, ruk<t> rukVar) {
            this.f3846a = str;
            this.b = rukVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object m2371constructorimpl;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            cei ceiVar = new cei();
            ruk<t> rukVar = this.b;
            try {
                Result.a aVar = Result.Companion;
                if (rukVar != null) {
                    rukVar.mo2427invoke();
                }
                m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
            }
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            if (m2374exceptionOrNullimpl != null) {
                ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
            }
            ceg.a aVar3 = ceg.Companion;
            aVar3.b("shopAsyncTask : " + ((Object) this.f3846a) + " , cost : " + ceiVar.a());
        }
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.ext.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class RunnableC0138b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ruk f3847a;

        public RunnableC0138b(ruk rukVar) {
            this.f3847a = rukVar;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f3847a.mo2427invoke();
            }
        }
    }

    static {
        kge.a(709092848);
        f3845a = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("shopAsyncTaskThread");
        handlerThread.start();
        b = handlerThread;
        c = new Handler(b.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("jsApiThread");
        handlerThread2.start();
        d = handlerThread2;
        e = new Handler(d.getLooper());
    }

    public static final void f(ruk<t> block) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64ee7d5", new Object[]{block});
            return;
        }
        q.d(block, "block");
        e.post(new RunnableC0138b(block));
    }

    private static final void a(ruk<t> rukVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5ffbd1a", new Object[]{rukVar, str});
        } else {
            c.post(new a(str, rukVar));
        }
    }

    public static final void a(String str, ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3daa3d1a", new Object[]{str, rukVar});
        } else {
            a(rukVar, str);
        }
    }

    public static final void a(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfc750", new Object[]{rukVar});
        } else {
            a(rukVar, (String) null);
        }
    }

    public static final void b(ruk<t> block) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec42cdd1", new Object[]{block});
            return;
        }
        q.d(block, "block");
        f3845a.post(new RunnableC0138b(block));
    }

    public static final void e(ruk<t> block) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7cbe154", new Object[]{block});
            return;
        }
        q.d(block, "block");
        if (q.a(Looper.myLooper(), Looper.getMainLooper())) {
            block.mo2427invoke();
        } else {
            b(block);
        }
    }

    public static final void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
            return;
        }
        Handler handler = f3845a;
        if (runnable == null) {
            return;
        }
        handler.post(runnable);
    }

    public static final void a(ruk<t> block, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba399974", new Object[]{block, new Long(j)});
            return;
        }
        q.d(block, "block");
        f3845a.postDelayed(new RunnableC0138b(block), j);
    }

    public static final void c(ruk<t> block) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac5d452", new Object[]{block});
            return;
        }
        q.d(block, "block");
        f3845a.postDelayed(new RunnableC0138b(block), 300L);
    }

    public static final void b(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706b13bd", new Object[]{runnable, new Long(j)});
            return;
        }
        Handler handler = f3845a;
        if (runnable == null) {
            return;
        }
        handler.postDelayed(runnable, j);
    }

    public static final void d(ruk<t> block) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c948dad3", new Object[]{block});
            return;
        }
        q.d(block, "block");
        f3845a.postDelayed(new RunnableC0138b(block), 32L);
    }

    public static final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : !q.a(Looper.getMainLooper(), Looper.myLooper());
    }

    public static final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : !a();
    }

    public static final String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, kotlin.text.d.UTF_8);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static final int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static final long b(String str) {
        Long e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{str})).longValue();
        }
        if (str != null && (e2 = kotlin.text.n.e(str)) != null) {
            return e2.longValue();
        }
        return 0L;
    }

    public static final Uri c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("5eff5feb", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return Uri.parse(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static final String a(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        q.d(context, "<this>");
        if (a(str, str2) || (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) == null) {
            return null;
        }
        return sharedPreferences.getString(str2, "");
    }

    public static final void a(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
            return;
        }
        q.d(context, "<this>");
        if (a(str, str2) || (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) == null || (edit = sharedPreferences.edit()) == null || (putString = edit.putString(str2, str3)) == null) {
            return;
        }
        putString.apply();
    }

    public static final void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        q.d(context, "<this>");
        if (str == null || !c()) {
            return;
        }
        Toast.makeText(context, str, 0).show();
    }

    public static final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        try {
            Application application = Globals.getApplication();
            q.b(application, "getApplication()");
            return (application.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final Bundle a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("b5b101a1", new Object[]{map});
        }
        q.d(map, "<this>");
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static final <K, V> String b(Map<K, ? extends V> map) {
        Iterator<T> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{map});
        }
        q.d(map, "<this>");
        String str = "";
        try {
            Result.a aVar = Result.Companion;
            while (map.entrySet().iterator().hasNext()) {
                str = str + " {" + ((Map.Entry) it.next()) + '}';
            }
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
        return str;
    }

    public static final <K, V> Map<String, String> c(Map<K, ? extends V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ca0735d0", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            HashMap hashMap2 = hashMap;
            K key = entry.getKey();
            String str = null;
            String obj = key == null ? null : key.toString();
            V value = entry.getValue();
            if (value != null) {
                str = value.toString();
            }
            hashMap2.put(obj, str);
        }
        return hashMap;
    }

    public static final <K, V> Map<String, String> d(Map<K, ? extends V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("726f9ef", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                HashMap hashMap2 = hashMap;
                String valueOf = String.valueOf(entry.getKey());
                V value = entry.getValue();
                hashMap2.put(valueOf, value == null ? null : value.toString());
            }
        }
        return hashMap;
    }

    public static final <K, V> Map<String, String> e(Map<K, ? extends V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4446be0e", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                HashMap hashMap2 = hashMap;
                String valueOf = String.valueOf(entry.getKey());
                V value = entry.getValue();
                hashMap2.put(valueOf, value == null ? null : value.toString());
            }
        }
        return hashMap;
    }

    public static final boolean a(Activity activity) {
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        q.d(activity, "<this>");
        return (Build.VERSION.SDK_INT < 28 || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootWindowInsets = decorView.getRootWindowInsets()) == null || rootWindowInsets.getDisplayCutout() == null) ? false : true;
    }

    public static final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        q.d(context, "<this>");
        if (!(context instanceof Activity)) {
            return;
        }
        ((Activity) context).finish();
    }

    public static final int a(Context context, int i) {
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{context, new Integer(i)})).intValue();
        }
        q.d(context, "<this>");
        if (Build.VERSION.SDK_INT < 28 || !(context instanceof Activity)) {
            return i;
        }
        Window window = ((Activity) context).getWindow();
        WindowInsets windowInsets = null;
        if (window != null && (decorView = window.getDecorView()) != null) {
            windowInsets = decorView.getRootWindowInsets();
        }
        return com.taobao.taolive.room.ui.a.c(context, windowInsets);
    }

    public static final boolean b(Context context) {
        NetworkInfo networkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        q.d(context, "<this>");
        try {
            Result.a aVar = Result.Companion;
            Object systemService = context.getSystemService("connectivity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            return (connectivityManager.getActiveNetworkInfo() == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null || networkInfo.getState() != NetworkInfo.State.CONNECTED) ? false : true;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
            return false;
        }
    }

    public static final DisplayMetrics b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("d880ad1e", new Object[]{activity});
        }
        q.d(activity, "<this>");
        Object systemService = activity.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final void a(Uri.Builder builder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ecf472", new Object[]{builder, str});
            return;
        }
        q.d(builder, "<this>");
        if (str == null) {
            return;
        }
        Uri build = builder.build();
        Set<String> queryParameterNames = build.getQueryParameterNames();
        if (!queryParameterNames.contains(str)) {
            return;
        }
        builder.clearQuery();
        for (String str2 : queryParameterNames) {
            if (!q.a((Object) str2, (Object) str)) {
                builder.appendQueryParameter(str2, build.getQueryParameter(str2));
            }
        }
    }

    public static final Map<String, String> a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e82965d4", new Object[]{uri});
        }
        q.d(uri, "<this>");
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (str != null) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final Map<String, String> b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5c689e33", new Object[]{uri});
        }
        q.d(uri, "<this>");
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (str != null) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final void a(Uri.Builder builder, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b72cb48", new Object[]{builder, jSONObject});
            return;
        }
        q.d(builder, "<this>");
        if (jSONObject == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            builder.appendQueryParameter(key, value == null ? null : value.toString());
        }
    }

    public static final long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue() : j > 0 ? j - (System.currentTimeMillis() - SystemClock.uptimeMillis()) : j;
    }

    public static final Class<?> d(String className) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("b32c1ea2", new Object[]{className});
        }
        q.d(className, "className");
        Class<?> cls = null;
        try {
            Result.a aVar = Result.Companion;
            cls = Class.forName(className);
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            Log.e("commonExt", "load class error : ", m2374exceptionOrNullimpl);
        }
        return cls;
    }

    public static final boolean a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f0514e", new Object[]{fragment})).booleanValue();
        }
        q.d(fragment, "<this>");
        if (!fragment.isAdded()) {
            return false;
        }
        FragmentManager fragmentManager = null;
        try {
            Result.a aVar = Result.Companion;
            fragmentManager = fragment.getChildFragmentManager();
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
        return fragmentManager != null;
    }

    public static final void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        q.d(context, "<this>");
        if (str == null) {
            return;
        }
        Toast.makeText(context, str, 0).show();
    }

    public static final void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54b79e8", new Object[]{context, str});
            return;
        }
        q.d(context, "<this>");
        if (str == null) {
            return;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static final boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        q.d(context, "<this>");
        if (!(context instanceof Activity)) {
            return false;
        }
        return ((Activity) context).isFinishing();
    }

    public static final boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("792c4740", new Object[]{activity})).booleanValue();
        }
        q.d(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 17) {
            return activity.isDestroyed();
        }
        return activity.isFinishing();
    }

    public static final <K, V> HashMap<K, V> f(Map<K, ? extends V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8926e95b", new Object[]{map});
        }
        HashMap<K, V> hashMap = new HashMap<>();
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public static final Map<String, String> g(Map<?, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("be86464c", new Object[]{map});
        }
        q.d(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                String valueOf = String.valueOf(entry.getKey());
                Object value = entry.getValue();
                linkedHashMap.put(valueOf, value == null ? null : value.toString());
            }
        }
        return linkedHashMap;
    }

    public static final float a(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97cbe858", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)})).floatValue();
        }
        double d2 = 2;
        return (float) Math.sqrt(((float) Math.pow(Math.abs(f - f3), d2)) + ((float) Math.pow(Math.abs(f2 - f4), d2)));
    }

    public static final float a(Number number, Number den) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd1fdefc", new Object[]{number, den})).floatValue();
        }
        q.d(number, "<this>");
        q.d(den, "den");
        if (q.a(den, den instanceof Float ? Float.valueOf(0.0f) : 0)) {
            ceg.Companion.b("hhh div 0");
            return 1.0f;
        }
        return number.floatValue() / den.floatValue();
    }

    public static final boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        q.d(context, "<this>");
        return com.taobao.android.autosize.l.b(context);
    }

    public static final boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue();
        }
        q.d(context, "<this>");
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        return com.taobao.android.autosize.l.d(context);
    }

    public static final boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{context})).booleanValue();
        }
        q.d(context, "<this>");
        return !e(context) && !d(context);
    }

    public static final boolean a(Object... objectArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b63135cd", new Object[]{objectArray})).booleanValue();
        }
        q.d(objectArray, "objectArray");
        for (Object obj : objectArray) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static final void a(Uri.Builder builder, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7651dd", new Object[]{builder, map});
            return;
        }
        q.d(builder, "<this>");
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                builder.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
    }
}
