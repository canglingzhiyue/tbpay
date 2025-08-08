package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import mtopsdk.common.util.StringUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class cg {

    /* renamed from: a  reason: collision with root package name */
    private static volatile cg f24393a;

    /* renamed from: a  reason: collision with other field name */
    private Context f157a;

    /* renamed from: a  reason: collision with other field name */
    private cf f158a;

    /* renamed from: a  reason: collision with other field name */
    private final HashMap<String, ce> f160a = new HashMap<>();

    /* renamed from: a  reason: collision with other field name */
    private ThreadPoolExecutor f161a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a  reason: collision with other field name */
    private final ArrayList<a> f159a = new ArrayList<>();

    /* loaded from: classes9.dex */
    public static abstract class a implements Runnable {

        /* renamed from: a  reason: collision with other field name */
        private a f163a;

        /* renamed from: a  reason: collision with other field name */
        private String f164a;

        /* renamed from: a  reason: collision with other field name */
        private WeakReference<Context> f165a;
        protected String b;

        /* renamed from: a  reason: collision with other field name */
        protected ce f162a = null;

        /* renamed from: a  reason: collision with other field name */
        private Random f166a = new Random();

        /* renamed from: a  reason: collision with root package name */
        private int f24394a = 0;

        public a(String str) {
            this.f164a = str;
        }

        public SQLiteDatabase a() {
            return this.f162a.getWritableDatabase();
        }

        /* renamed from: a  reason: collision with other method in class */
        public Object m1776a() {
            return null;
        }

        /* renamed from: a  reason: collision with other method in class */
        public String m1777a() {
            return this.f164a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(Context context) {
            a aVar = this.f163a;
            if (aVar != null) {
                aVar.a(context, m1776a());
            }
            b(context);
        }

        public abstract void a(Context context, SQLiteDatabase sQLiteDatabase);

        public void a(Context context, Object obj) {
            cg.a(context).a(this);
        }

        void a(ce ceVar, Context context) {
            this.f162a = ceVar;
            this.b = this.f162a.a();
            this.f165a = new WeakReference<>(context);
        }

        public void a(a aVar) {
            this.f163a = aVar;
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m1778a() {
            return this.f162a == null || StringUtils.isEmpty(this.b) || this.f165a == null;
        }

        public void b(Context context) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            WeakReference<Context> weakReference = this.f165a;
            if (weakReference == null || (context = weakReference.get()) == null || context.getFilesDir() == null || this.f162a == null || StringUtils.isEmpty(this.f164a)) {
                return;
            }
            File file = new File(this.f164a);
            u.a(context, new File(file.getParentFile(), bl.b(file.getAbsolutePath())), new ci(this, context));
        }
    }

    /* loaded from: classes9.dex */
    public static abstract class b<T> extends a {

        /* renamed from: a  reason: collision with root package name */
        private int f24395a;

        /* renamed from: a  reason: collision with other field name */
        private String f167a;

        /* renamed from: a  reason: collision with other field name */
        private List<String> f168a;

        /* renamed from: a  reason: collision with other field name */
        private String[] f169a;
        private List<T> b;
        private String c;
        private String d;
        private String e;

        public b(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i) {
            super(str);
            this.b = new ArrayList();
            this.f168a = list;
            this.f167a = str2;
            this.f169a = strArr;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f24395a = i;
        }

        @Override // com.xiaomi.push.cg.a
        public SQLiteDatabase a() {
            return this.f162a.getReadableDatabase();
        }

        /* renamed from: a */
        public abstract T mo1774a(Context context, Cursor cursor);

        @Override // com.xiaomi.push.cg.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            this.b.clear();
            List<String> list = this.f168a;
            String str = null;
            if (list == null || list.size() <= 0) {
                strArr = null;
            } else {
                String[] strArr2 = new String[this.f168a.size()];
                this.f168a.toArray(strArr2);
                strArr = strArr2;
            }
            int i = this.f24395a;
            if (i > 0) {
                str = String.valueOf(i);
            }
            Cursor query = sQLiteDatabase.query(this.b, strArr, this.f167a, this.f169a, this.c, this.d, this.e, str);
            if (query != null && query.moveToFirst()) {
                do {
                    T mo1774a = mo1774a(context, query);
                    if (mo1774a != null) {
                        this.b.add(mo1774a);
                    }
                } while (query.moveToNext());
                query.close();
            }
            a(context, (List) this.b);
        }

        public abstract void a(Context context, List<T> list);
    }

    /* loaded from: classes9.dex */
    public static class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<a> f24396a;

        public c(String str, ArrayList<a> arrayList) {
            super(str);
            this.f24396a = new ArrayList<>();
            this.f24396a.addAll(arrayList);
        }

        @Override // com.xiaomi.push.cg.a
        public final void a(Context context) {
            super.a(context);
            Iterator<a> it = this.f24396a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    next.a(context);
                }
            }
        }

        @Override // com.xiaomi.push.cg.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            Iterator<a> it = this.f24396a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    next.a(context, sQLiteDatabase);
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class d extends a {

        /* renamed from: a  reason: collision with root package name */
        private String f24397a;

        /* renamed from: a  reason: collision with other field name */
        protected String[] f170a;

        public d(String str, String str2, String[] strArr) {
            super(str);
            this.f24397a = str2;
            this.f170a = strArr;
        }

        @Override // com.xiaomi.push.cg.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.delete(this.b, this.f24397a, this.f170a);
        }
    }

    /* loaded from: classes9.dex */
    public static class e extends a {

        /* renamed from: a  reason: collision with root package name */
        private ContentValues f24398a;

        public e(String str, ContentValues contentValues) {
            super(str);
            this.f24398a = contentValues;
        }

        @Override // com.xiaomi.push.cg.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.insert(this.b, null, this.f24398a);
        }
    }

    private cg(Context context) {
        this.f157a = context;
    }

    private ce a(String str) {
        ce ceVar = this.f160a.get(str);
        if (ceVar == null) {
            synchronized (this.f160a) {
                if (ceVar == null) {
                    ceVar = this.f158a.a(this.f157a, str);
                    this.f160a.put(str, ceVar);
                }
            }
        }
        return ceVar;
    }

    public static cg a(Context context) {
        if (f24393a == null) {
            synchronized (cg.class) {
                if (f24393a == null) {
                    f24393a = new cg(context);
                }
            }
        }
        return f24393a;
    }

    private void a() {
        ah.a(this.f157a).b(new ch(this), com.xiaomi.push.service.az.a(this.f157a).a(ih.StatDataProcessFrequency.a(), 5));
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m1775a(String str) {
        return a(str).a();
    }

    public void a(a aVar) {
        ce ceVar;
        if (aVar == null) {
            return;
        }
        if (this.f158a == null) {
            throw new IllegalStateException("should exec init method first!");
        }
        String m1777a = aVar.m1777a();
        synchronized (this.f160a) {
            ceVar = this.f160a.get(m1777a);
            if (ceVar == null) {
                ceVar = this.f158a.a(this.f157a, m1777a);
                this.f160a.put(m1777a, ceVar);
            }
        }
        if (this.f161a.isShutdown()) {
            return;
        }
        aVar.a(ceVar, this.f157a);
        synchronized (this.f159a) {
            this.f159a.add(aVar);
            a();
        }
    }

    public void a(Runnable runnable) {
        if (!this.f161a.isShutdown()) {
            this.f161a.execute(runnable);
        }
    }

    public void a(ArrayList<a> arrayList) {
        if (this.f158a != null) {
            HashMap hashMap = new HashMap();
            if (this.f161a.isShutdown()) {
                return;
            }
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.m1778a()) {
                    next.a(a(next.m1777a()), this.f157a);
                }
                ArrayList arrayList2 = (ArrayList) hashMap.get(next.m1777a());
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(next.m1777a(), arrayList2);
                }
                arrayList2.add(next);
            }
            for (String str : hashMap.keySet()) {
                ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                if (arrayList3 != null && arrayList3.size() > 0) {
                    c cVar = new c(str, arrayList3);
                    cVar.a(((a) arrayList3.get(0)).f162a, this.f157a);
                    this.f161a.execute(cVar);
                }
            }
            return;
        }
        throw new IllegalStateException("should exec setDbHelperFactory method first!");
    }

    public void b(a aVar) {
        ce ceVar;
        if (aVar == null) {
            return;
        }
        if (this.f158a == null) {
            throw new IllegalStateException("should exec init method first!");
        }
        String m1777a = aVar.m1777a();
        synchronized (this.f160a) {
            ceVar = this.f160a.get(m1777a);
            if (ceVar == null) {
                ceVar = this.f158a.a(this.f157a, m1777a);
                this.f160a.put(m1777a, ceVar);
            }
        }
        if (this.f161a.isShutdown()) {
            return;
        }
        aVar.a(ceVar, this.f157a);
        a((Runnable) aVar);
    }
}
