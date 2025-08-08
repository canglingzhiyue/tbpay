package com.etao.feimagesearch.album;

import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ac;
import com.huawei.hms.adapter.internal.CommonCode;
import com.taobao.taobao.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.com;
import tb.dau;
import tb.kge;

/* loaded from: classes3.dex */
public class q extends ac {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Set<String> f;
    private a c;
    private final boolean d;

    /* renamed from: a  reason: collision with root package name */
    private Handler f6498a = new Handler(Looper.getMainLooper());
    private List<k> b = new ArrayList();
    private volatile boolean e = false;
    private boolean g = true;
    private boolean h = false;

    /* loaded from: classes3.dex */
    public interface a {
        void a(o oVar);

        void a(List<o> list);

        void b(k kVar);

        void c(k kVar);
    }

    public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ List a(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9fc92212", new Object[]{qVar}) : qVar.b;
    }

    public static /* synthetic */ a b(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4aba7a10", new Object[]{qVar}) : qVar.c;
    }

    public static /* synthetic */ boolean c(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ade1a9b", new Object[]{qVar})).booleanValue() : qVar.e;
    }

    static {
        kge.a(1673450384);
        HashSet hashSet = new HashSet();
        f = hashSet;
        hashSet.add("screenshot");
        f.add("截屏");
        f.add("screen_shot");
        f.add("screen-shot");
        f.add("screen shot");
        f.add("screencapture");
        f.add("screen_capture");
        f.add("screen-capture");
        f.add("screen capture");
        f.add("screencap");
        f.add("screen_cap");
        f.add("screen-cap");
        f.add("screen cap");
    }

    public q(a aVar, boolean z) {
        this.c = aVar;
        this.d = z;
    }

    @Override // com.etao.feimagesearch.util.ac
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            d();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.e = true;
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        dau.h();
        Cursor e = e();
        Cursor f2 = f();
        HashMap hashMap = new HashMap();
        k kVar = new k("/" + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18952));
        this.b.add(kVar);
        a(kVar);
        if (e == null && f2 == null) {
            kVar.a(true);
        } else if ((e == null || !e.moveToFirst()) && (f2 == null || !f2.moveToFirst())) {
            if (e != null) {
                e.close();
            }
            if (f2 != null) {
                f2.close();
            }
            kVar.a(true);
        } else {
            dau.i();
            if (e != null && e.moveToFirst()) {
                a(e, hashMap, kVar);
            }
            if (f2 != null && f2.moveToFirst()) {
                b(f2, hashMap, kVar);
            }
            ArrayList arrayList = new ArrayList(hashMap.size());
            for (Map.Entry<String, k> entry : hashMap.entrySet()) {
                arrayList.add(entry.getValue());
            }
            this.b.addAll(arrayList);
        }
    }

    private Cursor e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("2c052ef3", new Object[]{this});
        }
        try {
            return MediaStore.Images.Media.query(com.b().getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "date_modified", "_display_name", "orientation"}, null, null, String.format("%1$s DESC,%2$s DESC,%3$s DESC", "date_modified", "_display_name", "_id"));
        } catch (Exception unused) {
            return null;
        }
    }

    private Cursor f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("55551374", new Object[]{this});
        }
        if (!this.d) {
            return null;
        }
        try {
            return MediaStore.Images.Media.query(com.b().getContentResolver(), MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "date_modified", "duration", CommonCode.MapKey.HAS_RESOLUTION}, null, null, "title");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b A[LOOP:0: B:12:0x0051->B:47:0x011b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e A[EDGE_INSN: B:58:0x011e->B:48:0x011e ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.database.Cursor r26, java.util.Map<java.lang.String, com.etao.feimagesearch.album.k> r27, com.etao.feimagesearch.album.k r28) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.album.q.a(android.database.Cursor, java.util.Map, com.etao.feimagesearch.album.k):void");
    }

    private List<o> a(Map<k, List<o>> map, k kVar, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8025fae8", new Object[]{this, map, kVar, oVar});
        }
        List<o> list = map.get(kVar);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(oVar);
        return list;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : f) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private void b(Cursor cursor, Map<String, k> map, k kVar) {
        k kVar2;
        IpChange ipChange = $ipChange;
        int i = 4;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd4824ea", new Object[]{this, cursor, map, kVar});
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(10);
        com.etao.feimagesearch.result.f.a("album video count", String.valueOf(cursor.getCount()));
        if (com.r() || com.s()) {
            i = 8;
        }
        int i2 = 0;
        boolean z = true;
        while (!this.e) {
            try {
                long j = cursor.getLong(cursor.getColumnIndex("_id"));
                String string = cursor.getString(cursor.getColumnIndex("_data"));
                long j2 = cursor.getLong(cursor.getColumnIndex("date_modified"));
                long j3 = cursor.getLong(cursor.getColumnIndex("duration"));
                if (!StringUtils.isEmpty(string) && string.endsWith(com.taobao.android.litecreator.comprehension.f.FILE_TYPE_VIDEO_MP4)) {
                    File file = new File(string);
                    if (file.exists()) {
                        o oVar = new o(j, string, "", j2, j3, true);
                        arrayList.add(oVar);
                        String parent = file.getParent();
                        if (map.containsKey(parent)) {
                            kVar2 = map.get(parent);
                        } else {
                            k kVar3 = new k(parent);
                            map.put(parent, kVar3);
                            a(kVar3);
                            kVar2 = kVar3;
                        }
                        hashMap.put(kVar2, a(hashMap, kVar2, oVar));
                        hashMap.put(kVar, arrayList);
                        i2 = i2 + 1 + 1;
                        if (i2 == (z ? i : 100)) {
                            a(hashMap, arrayList2);
                            hashMap = new HashMap();
                            arrayList = new ArrayList();
                            arrayList2 = new ArrayList(10);
                            i2 = 0;
                            z = false;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (!cursor.moveToNext()) {
                break;
            }
        }
        cursor.close();
        if (arrayList.isEmpty()) {
            return;
        }
        a(hashMap, arrayList2);
    }

    private void a(final k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238bb95b", new Object[]{this, kVar});
        } else {
            this.f6498a.post(new ac() { // from class: com.etao.feimagesearch.album.q.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    q.a(q.this).add(kVar);
                    if (q.b(q.this) == null || q.c(q.this)) {
                        return;
                    }
                    q.b(q.this).b(kVar);
                }
            });
        }
    }

    private void a(final Map<k, List<o>> map, final List<o> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560ac50e", new Object[]{this, map, list});
            return;
        }
        boolean z = this.g;
        final boolean z2 = !z;
        if (z) {
            this.g = false;
        }
        if (z2) {
            dau.j();
        }
        final HashMap hashMap = new HashMap(map.size());
        for (Map.Entry<k, List<o>> entry : map.entrySet()) {
            if (entry.getValue() != null && entry.getKey() != null) {
                entry.getKey().a(entry.getValue());
                entry.getKey().h();
                entry.getKey().i();
                hashMap.put(entry.getKey().b(), entry.getKey().j());
            }
        }
        if (z2) {
            dau.k();
        }
        this.f6498a.post(new ac() { // from class: com.etao.feimagesearch.album.q.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                if (z2) {
                    dau.l();
                }
                if (q.b(q.this) == null || q.c(q.this)) {
                    return;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    if (entry2.getValue() != null) {
                        ((k) entry2.getKey()).a((k) hashMap.get(((k) entry2.getKey()).b()));
                        q.b(q.this).c((k) entry2.getKey());
                    }
                }
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                q.b(q.this).a(list);
            }
        });
    }
}
