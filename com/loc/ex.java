package com.loc;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public abstract class ex<T> {

    /* renamed from: a  reason: collision with root package name */
    public String f7776a;
    private File b;
    private Handler e;
    private String f;
    private boolean g;
    private boolean c = false;
    private Map<String, a> d = new ConcurrentHashMap();
    private Runnable h = new Runnable() { // from class: com.loc.ex.2
        @Override // java.lang.Runnable
        public final void run() {
            if (ex.this.c) {
                if (ex.this.g) {
                    ex.this.e();
                    ex.this.g = false;
                }
                if (ex.this.e == null) {
                    return;
                }
                ex.this.e.postDelayed(ex.this.h, 60000L);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f7779a;
        long b;
        long c;

        public a(int i, long j, long j2) {
            this.f7779a = i;
            this.b = j;
            this.c = j2;
        }
    }

    public ex(Context context, String str, Handler handler) {
        this.f = null;
        if (context == null) {
            return;
        }
        this.e = handler;
        this.f7776a = TextUtils.isEmpty(str) ? "unknow" : str;
        this.f = fy.l(context);
        try {
            this.b = new File(context.getFilesDir().getPath(), this.f7776a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        d();
    }

    public static int a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    private void b(T t, long j) {
        if (t == null || d((ex<T>) t) < 0) {
            return;
        }
        String b = b((ex<T>) t);
        a aVar = this.d.get(b);
        if (aVar == null) {
            a((ex<T>) t, j);
            this.d.put(b, new a(c((ex<T>) t), d((ex<T>) t), j));
            this.g = true;
            return;
        }
        aVar.c = j;
        if (aVar.f7779a == c((ex<T>) t)) {
            a((ex<T>) t, aVar.b);
            return;
        }
        a((ex<T>) t, j);
        aVar.f7779a = c((ex<T>) t);
        aVar.b = d((ex<T>) t);
        this.g = true;
    }

    private void d() {
        try {
            StringBuilder sb = new StringBuilder("restore from：\n");
            for (String str : fy.a(this.b)) {
                String str2 = new String(fg.b(p.b(str), this.f), "UTF-8");
                sb.append(str2);
                sb.append("\n");
                String[] split = str2.split(",");
                this.d.put(split[0], new a(Integer.parseInt(split[1]), Long.parseLong(split[2]), split.length >= 4 ? Long.parseLong(split[3]) : fy.b()));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (c() > 0) {
            this.d.size();
            if (b() > 0) {
                long b = fy.b();
                Iterator<Map.Entry<String, a>> it = this.d.entrySet().iterator();
                while (it.hasNext()) {
                    if (b - this.d.get(it.next().getKey()).c > b()) {
                        it.remove();
                    }
                }
            }
            if (this.d.size() > c()) {
                ArrayList arrayList = new ArrayList(this.d.keySet());
                Collections.sort(arrayList, new Comparator<String>() { // from class: com.loc.ex.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.Comparator
                    /* renamed from: a */
                    public int compare(String str, String str2) {
                        return ex.a(((a) ex.this.d.get(str2)).c, ((a) ex.this.d.get(str)).c);
                    }
                });
                for (int c = (int) c(); c < arrayList.size(); c++) {
                    this.d.remove(arrayList.get(c));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, a> entry : this.d.entrySet()) {
            String str = entry.getKey() + "," + entry.getValue().f7779a + "," + entry.getValue().b + "," + entry.getValue().c;
            try {
                sb.append(p.b(fg.a(str.getBytes("UTF-8"), this.f)) + "\n");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(sb2)) {
            fy.a(this.b, sb2);
        }
    }

    public final void a() {
        Handler handler;
        if (!this.c && (handler = this.e) != null) {
            handler.removeCallbacks(this.h);
            this.e.postDelayed(this.h, 60000L);
        }
        this.c = true;
    }

    public final void a(T t) {
        b(t, fy.b());
    }

    abstract void a(T t, long j);

    public final void a(List<T> list) {
        long b = fy.b();
        for (T t : list) {
            b(t, b);
        }
        if (this.d.size() >= list.size()) {
            this.g = true;
        }
        if (this.d.size() > 16384 || c() <= 0) {
            this.d.clear();
            for (T t2 : list) {
                this.d.put(b((ex<T>) t2), new a(c((ex<T>) t2), d((ex<T>) t2), b));
            }
        }
    }

    public final void a(boolean z) {
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacks(this.h);
        }
        if (!z) {
            this.h.run();
        }
        this.c = false;
    }

    abstract long b();

    public abstract String b(T t);

    abstract int c(T t);

    abstract long c();

    abstract long d(T t);

    public final long e(T t) {
        return (fy.b() - d((ex<T>) t)) / 1000;
    }
}
