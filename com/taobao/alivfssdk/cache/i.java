package com.taobao.alivfssdk.cache;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.h;
import com.taobao.android.protodb.Config;
import com.taobao.android.protodb.LSDB;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.kge;

/* loaded from: classes4.dex */
public class i implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final LSDB f8495a;
    private final int b;

    static {
        kge.a(-771163850);
        kge.a(1442231793);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21de4147", new Object[]{this, str, cls});
        }
        return null;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public <T> T a(String str, String str2, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2686b011", new Object[]{this, str, str2, cls});
        }
        return null;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public void a(h.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90126e0c", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public void a(String str, h.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934c02f3", new Object[]{this, str, dVar});
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public <T> void a(String str, Class<T> cls, h.b<T> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c8df4e", new Object[]{this, str, cls, bVar});
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public void a(String str, Object obj, h.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08830d", new Object[]{this, str, obj, fVar});
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{this, str, obj})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str, String str2, InputStream inputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1a0350", new Object[]{this, str, str2, inputStream, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str, String str2, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e19a7af", new Object[]{this, str, str2, obj, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public <T> T b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public <T> T b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4f41c855", new Object[]{this, str, str2});
        }
        return null;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        }
    }

    public static i a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("f643df24", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        Config config = new Config();
        config.walSize = i;
        return new i(LSDB.open(str, config), i2);
    }

    private i(LSDB lsdb, int i) {
        this.f8495a = lsdb;
        this.b = i;
    }

    private String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75b9023f", new Object[]{this, str, str2});
        }
        return str + '-' + str2;
    }

    private String g(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{this, str}) : str.substring(str.lastIndexOf(45) + 1);
    }

    private String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bc4e8c7", new Object[]{this, str});
        }
        return str + '-';
    }

    private String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2e2d9a6", new Object[]{this, str});
        }
        return str + '-' + android.taobao.windvane.cache.c.DIVISION;
    }

    private String j(String str) {
        String a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a00ca85", new Object[]{this, str}) : (str.length() <= 255 || (a2 = com.taobao.orange.util.c.a(str)) == null || a2.length() == 0) ? str : a2;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this});
        }
        com.taobao.android.protodb.d<com.taobao.android.protodb.e> keyIterator = this.f8495a.keyIterator();
        HashSet hashSet = new HashSet();
        if (keyIterator != null) {
            while (true) {
                com.taobao.android.protodb.e a2 = keyIterator.a();
                if (a2 == null) {
                    break;
                }
                hashSet.add(a2.a());
            }
        }
        return hashSet;
    }

    @Override // com.taobao.alivfssdk.cache.h
    public List<String> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f186af0", new Object[]{this, str});
        }
        com.taobao.android.protodb.d<com.taobao.android.protodb.e> keyIterator = this.f8495a.keyIterator(new com.taobao.android.protodb.e(h(j(str))), new com.taobao.android.protodb.e(i(j(str))));
        if (keyIterator == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.taobao.android.protodb.e a2 = keyIterator.a();
            if (a2 == null) {
                return arrayList;
            }
            arrayList.add(g(a2.a()));
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue() : this.f8495a.delete(new com.taobao.android.protodb.e(str));
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{this, str, str2})).booleanValue() : this.f8495a.delete(new com.taobao.android.protodb.e(f(j(str), str2)));
    }

    @Override // com.taobao.alivfssdk.cache.h
    public InputStream d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("89c9c678", new Object[]{this, str});
        }
        byte[] binary = this.f8495a.getBinary(new com.taobao.android.protodb.e(j(str)));
        if (binary == null) {
            return null;
        }
        return new ByteArrayInputStream(binary);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public InputStream d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("f7041402", new Object[]{this, str, str2});
        }
        byte[] binary = this.f8495a.getBinary(new com.taobao.android.protodb.e(f(j(str), str2)));
        if (binary == null) {
            return null;
        }
        return new ByteArrayInputStream(binary);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7a571a5", new Object[]{this, str, inputStream})).booleanValue() : this.f8495a.insertStream(new com.taobao.android.protodb.e(j(str)), this.b, inputStream);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str, String str2, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adbec29b", new Object[]{this, str, str2, inputStream})).booleanValue() : this.f8495a.insertStream(new com.taobao.android.protodb.e(f(j(str), str2)), this.b, inputStream);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public long e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1c6cb12a", new Object[]{this, str})).longValue() : this.f8495a.getDataSize(new com.taobao.android.protodb.e(j(str)));
    }

    @Override // com.taobao.alivfssdk.cache.h
    public long e(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb83974", new Object[]{this, str, str2})).longValue() : this.f8495a.getDataSize(new com.taobao.android.protodb.e(f(j(str), str2)));
    }
}
