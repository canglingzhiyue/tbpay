package android.taobao.windvane.runtimepermission;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f1695a;

    static {
        kge.a(-105780305);
    }

    public static /* synthetic */ a a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e3c04164", new Object[]{aVar});
        }
        f1695a = aVar;
        return aVar;
    }

    public static synchronized a a(Context context, String[] strArr) {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fcf6059d", new Object[]{context, strArr});
            } else if (context == null) {
                throw new NullPointerException("context can not be null");
            } else {
                if (strArr == null || strArr.length == 0) {
                    throw new NullPointerException("permissions can not be null");
                }
                a aVar = new a();
                a.a(aVar, context);
                a.a(aVar, strArr);
                return aVar;
            }
        }
    }

    public static void a(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6953b2", new Object[]{new Integer(i), strArr, iArr});
            return;
        }
        a aVar = f1695a;
        if (aVar == null) {
            return;
        }
        aVar.a(a(iArr));
        f1695a = null;
    }

    public static void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{new Integer(i), new Integer(i2), intent});
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            a aVar = f1695a;
            aVar.a(Settings.canDrawOverlays(aVar.a()));
        }
        f1695a = null;
    }

    private static boolean a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c19817a", new Object[]{iArr})).booleanValue();
        }
        if (iArr == null || iArr.length <= 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f1696a;
        private String[] b;
        private String c;
        private String d;
        private Runnable e;
        private Runnable f;

        static {
            kge.a(-1060162544);
        }

        public static /* synthetic */ Context a(a aVar, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("676c1aba", new Object[]{aVar, context});
            }
            aVar.f1696a = context;
            return context;
        }

        public static /* synthetic */ String[] a(a aVar, String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("93005e28", new Object[]{aVar, strArr});
            }
            aVar.b = strArr;
            return strArr;
        }

        public Context a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f1696a;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ae877bd0", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9fd90b51", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("886aa784", new Object[]{this, runnable});
            }
            if (runnable == null) {
                throw new NullPointerException("permissionGrantedRunnable is null");
            }
            this.e = runnable;
            return this;
        }

        public a b(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6b965ac5", new Object[]{this, runnable});
            }
            this.f = runnable;
            return this;
        }

        public void b() {
            String[] strArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (Build.VERSION.SDK_INT >= 23) {
                String[] strArr2 = this.b;
                if (strArr2.length == 1 && strArr2[0].equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                    if (!Settings.canDrawOverlays(this.f1696a)) {
                        Intent intent = new Intent();
                        intent.setClass(this.f1696a, PermissionActivity.class);
                        intent.putExtra("permissions", this.b);
                        b.a(this);
                        this.f1696a.startActivity(intent);
                        return;
                    }
                    this.e.run();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (String str : this.b) {
                    try {
                        if (ActivityCompat.checkSelfPermission(this.f1696a, str) != 0) {
                            arrayList.add(str);
                        }
                    } catch (Throwable unused) {
                        this.e.run();
                        return;
                    }
                }
                if (arrayList.size() == 0) {
                    this.e.run();
                    return;
                }
                Intent intent2 = new Intent();
                intent2.setClass(this.f1696a, PermissionActivity.class);
                if (!(this.f1696a instanceof Activity)) {
                    intent2.addFlags(268435456);
                }
                intent2.putExtra("permissions", this.b);
                intent2.putExtra(TBRunTimePermission.EXPLAIN_PARAM_NAME, this.d);
                intent2.putExtra("title", this.c);
                b.a(this);
                this.f1696a.startActivity(intent2);
            } else if (Build.VERSION.SDK_INT >= 18) {
                if (ActivityCompat.checkSelfPermission(this.f1696a, this.b[0]) == 0) {
                    this.e.run();
                } else {
                    this.f.run();
                }
            } else {
                try {
                    this.e.run();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            if (z) {
                Runnable runnable = this.e;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                Runnable runnable2 = this.f;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
            c();
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            this.f1696a = null;
            this.e = null;
            this.f = null;
        }
    }
}
