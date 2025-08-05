package com.taobao.alivfssdk.cache;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.h;
import java.io.InputStream;
import tb.kge;

/* loaded from: classes.dex */
public abstract class a implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(89174037);
        kge.a(1442231793);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : a(str, (String) null);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public <T> T b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str}) : (T) b(str, null);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("21de4147", new Object[]{this, str, cls}) : (T) a(str, (String) null, (Class<Object>) cls);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public <T> void a(String str, Class<T> cls, final h.b<T> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c8df4e", new Object[]{this, str, cls, bVar});
        } else {
            a(str, (String) null, cls, new h.c<T>() { // from class: com.taobao.alivfssdk.cache.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.alivfssdk.cache.h.c
                public void a(String str2, String str3, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("45199658", new Object[]{this, str2, str3, obj});
                    } else {
                        bVar.a(str2, obj);
                    }
                }
            });
        }
    }

    public <T> void a(final String str, final String str2, final Class<T> cls, final h.c<T> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("619037a3", new Object[]{this, str, str2, cls, cVar});
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.alivfssdk.cache.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    h.c cVar2 = cVar;
                    String str3 = str;
                    String str4 = str2;
                    cVar2.a(str3, str4, a.this.a(str3, str4, (Class<Object>) cls));
                }
            });
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{this, str, obj})).booleanValue() : a(str, (String) null, obj);
    }

    public boolean a(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4519965c", new Object[]{this, str, str2, obj})).booleanValue() : a(str, (String) null, obj, 0);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public void a(String str, Object obj, h.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08830d", new Object[]{this, str, obj, fVar});
        } else {
            a(str, obj, 0, fVar);
        }
    }

    public void a(final String str, final String str2, final Object obj, final h.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631e9236", new Object[]{this, str, str2, obj, gVar});
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.alivfssdk.cache.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    h.g gVar2 = gVar;
                    String str3 = str;
                    String str4 = str2;
                    gVar2.a(str3, str4, a.this.a(str3, str4, obj));
                }
            });
        }
    }

    public void a(String str, Object obj, int i, final h.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ee64b4", new Object[]{this, str, obj, new Integer(i), fVar});
        } else {
            a(str, (String) null, obj, new h.g() { // from class: com.taobao.alivfssdk.cache.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.alivfssdk.cache.h.g
                public void a(String str2, String str3, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4dbad4d8", new Object[]{this, str2, str3, new Boolean(z)});
                    } else {
                        fVar.onObjectSetCallback(str2, z);
                    }
                }
            });
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue() : c(str, null);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public void a(String str, final h.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934c02f3", new Object[]{this, str, dVar});
        } else {
            a(str, (String) null, new h.e() { // from class: com.taobao.alivfssdk.cache.a.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.alivfssdk.cache.h.e
                public void a(String str2, String str3, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4dbad4d8", new Object[]{this, str2, str3, new Boolean(z)});
                    } else {
                        dVar.onObjectRemoveCallback(str2, z);
                    }
                }
            });
        }
    }

    public void a(final String str, final String str2, final h.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf6109c", new Object[]{this, str, str2, eVar});
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.alivfssdk.cache.a.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    h.e eVar2 = eVar;
                    String str3 = str;
                    String str4 = str2;
                    eVar2.a(str3, str4, a.this.c(str3, str4));
                }
            });
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public void a(final h.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90126e0c", new Object[]{this, aVar});
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.alivfssdk.cache.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        aVar.onAllObjectRemoveCallback(a.this.b());
                    }
                }
            });
        }
    }

    @Override // com.taobao.alivfssdk.cache.h
    public InputStream d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("89c9c678", new Object[]{this, str}) : d(str, null);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7a571a5", new Object[]{this, str, inputStream})).booleanValue() : a(str, (String) null, inputStream);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public boolean a(String str, String str2, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adbec29b", new Object[]{this, str, str2, inputStream})).booleanValue() : a(str, str2, inputStream, 0);
    }

    @Override // com.taobao.alivfssdk.cache.h
    public long e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1c6cb12a", new Object[]{this, str})).longValue() : e(str, null);
    }
}
