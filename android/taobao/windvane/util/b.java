package android.taobao.windvane.util;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_MAX_AGE = 21600000;
    public static final long DEFAULT_SMALL_MAX_AGE = 1800000;
    public static final String KEY_DATA = "wv-data";
    public static final String KEY_TIME = "wv-time";
    public static final String ROOT_WINDVANE_CONFIG_DIR = "windvane/config";

    /* renamed from: a  reason: collision with root package name */
    private static String f1703a;
    private static final ReentrantReadWriteLock b;

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : b(str);
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f1703a;
    }

    public static /* synthetic */ ReentrantReadWriteLock c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ReentrantReadWriteLock) ipChange.ipc$dispatch("e7278435", new Object[0]) : b;
    }

    public static /* synthetic */ String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5bded401", new Object[]{str, str2}) : e(str, str2);
    }

    static {
        kge.a(1775124528);
        f1703a = "ConfigStorage";
        b = new ReentrantReadWriteLock();
    }

    public static synchronized boolean a() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
            } else if (android.taobao.windvane.config.a.f == null) {
                return false;
            } else {
                File a2 = android.taobao.windvane.file.b.a(android.taobao.windvane.config.a.f, ROOT_WINDVANE_CONFIG_DIR);
                String str = f1703a;
                m.e(str, "createDir: dir[" + a2.getAbsolutePath() + "]:" + a2.exists());
                return a2.exists();
            }
        }
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        String str2 = "";
        if (android.taobao.windvane.config.a.f == null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append(android.taobao.windvane.config.a.f.getFilesDir().getAbsolutePath());
        sb.append(File.separator);
        sb.append(ROOT_WINDVANE_CONFIG_DIR);
        if (str != null) {
            str2 = File.separator + str;
        }
        sb.append(str2);
        return sb.toString();
    }

    public static synchronized void a(final String str, final String str2, final String str3) {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            } else if (str == null || str2 == null) {
            } else {
                AsyncTask.execute(new Runnable() { // from class: android.taobao.windvane.util.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        String d = b.d(str, str2);
                        try {
                            android.taobao.windvane.file.a.a(b.a(d), ByteBuffer.wrap(str3.getBytes()));
                        } catch (Exception unused) {
                            String b2 = b.b();
                            m.e(b2, "can not sava file : " + d + " value : " + str3);
                        }
                    }
                });
            }
        }
    }

    public static void b(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
        } else if (str == null || str2 == null) {
        } else {
            android.taobao.windvane.thread.c.a().a(new Runnable() { // from class: android.taobao.windvane.util.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b.c().writeLock().lock();
                    String d = b.d(str, str2);
                    try {
                        android.taobao.windvane.file.a.a(b.a(d), ByteBuffer.wrap(str3.getBytes()));
                        String b2 = b.b();
                        m.e(b2, "putStringValByLock: " + d + " value : " + str3);
                    } catch (Exception unused) {
                        String b3 = b.b();
                        m.e(b3, "can not sava file : " + d + " value : " + str3);
                    }
                    b.c().writeLock().unlock();
                }
            });
        }
    }

    public static synchronized void a(final String str, final String str2, final long j) {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4dba98c8", new Object[]{str, str2, new Long(j)});
            } else if (str == null || str2 == null) {
            } else {
                AsyncTask.execute(new Runnable() { // from class: android.taobao.windvane.util.b.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        String d = b.d(str, str2);
                        String a2 = b.a(d);
                        try {
                            ByteBuffer allocate = ByteBuffer.allocate(8);
                            allocate.putLong(j);
                            android.taobao.windvane.file.a.a(a2, allocate);
                        } catch (Exception unused) {
                            String b2 = b.b();
                            m.e(b2, "can not sava file : " + d + " value : " + j);
                        }
                    }
                });
            }
        }
    }

    public static String a(String str, String str2) {
        String str3;
        String str4 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        b.readLock().lock();
        String e = e(str, str2);
        try {
            if (new File(b(e)).exists()) {
                str3 = new String(android.taobao.windvane.file.a.a(new File(b(e))));
                try {
                    str4 = "read " + e + " by file : " + str3;
                    m.e(f1703a, str4);
                } catch (Exception unused) {
                    m.e(f1703a, "can not read file : " + e);
                    b.readLock().unlock();
                    return str3;
                }
            } else {
                SharedPreferences d = d();
                if (d == null) {
                    return str4;
                }
                str4 = d.getString(e, str4);
                a(str, str2, str4);
                SharedPreferences.Editor edit = d.edit();
                edit.remove(e);
                edit.commit();
                m.e(f1703a, "read " + e + " by sp : " + str4);
                str3 = str4;
            }
        } catch (Exception unused2) {
            str3 = str4;
        }
        b.readLock().unlock();
        return str3;
    }

    public static synchronized String b(String str, String str2) {
        String str3;
        String string;
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
            }
            m.e(f1703a, "file read start ");
            String e = e(str, str2);
            try {
                if (new File(b(e)).exists()) {
                    str3 = new String(android.taobao.windvane.file.a.a(new File(b(e))));
                    try {
                        string = "read " + e + " by file : " + str3;
                        m.b(f1703a, string);
                    } catch (Exception unused) {
                        m.e(f1703a, "can not read file : " + e);
                        m.e(f1703a, "file read end ");
                        return str3;
                    }
                } else {
                    SharedPreferences d = d();
                    if (d == null) {
                        return "";
                    }
                    string = d.getString(e, "");
                    a(str, str2, string);
                    SharedPreferences.Editor edit = d.edit();
                    edit.remove(e);
                    edit.commit();
                    m.c(f1703a, "read " + e + " by sp : " + string);
                    str3 = string;
                }
            } catch (Exception unused2) {
                str3 = string;
            }
            m.e(f1703a, "file read end ");
            return str3;
        }
    }

    public static long c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f277e372", new Object[]{str, str2})).longValue();
        }
        String e = e(str, str2);
        long j = 0;
        try {
            File file = new File(b(e));
            if (file.exists()) {
                byte[] a2 = android.taobao.windvane.file.a.a(file);
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.put(a2);
                allocate.flip();
                j = allocate.getLong();
                String str3 = f1703a;
                m.b(str3, "read " + e + " by file : " + j);
            } else {
                SharedPreferences d = d();
                if (d == null) {
                    return 0L;
                }
                j = d.getLong(e, 0L);
                a(str, str2, j);
                SharedPreferences.Editor edit = d.edit();
                edit.remove(e);
                edit.commit();
                String str4 = f1703a;
                m.c(str4, "read " + e + " by sp : " + j);
            }
        } catch (Exception unused) {
            String str5 = f1703a;
            m.e(str5, "can not read file : " + e);
        }
        return j;
    }

    private static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8cbeb20", new Object[]{str, str2});
        }
        return "WindVane_" + str + str2;
    }

    private static SharedPreferences d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("9a13e8ff", new Object[0]);
        }
        if (android.taobao.windvane.config.a.f != null) {
            return PreferenceManager.getDefaultSharedPreferences(android.taobao.windvane.config.a.f);
        }
        return null;
    }
}
