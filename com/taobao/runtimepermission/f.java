package com.taobao.runtimepermission;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import com.taobao.runtimepermission.config.RPConfig;
import com.taobao.runtimepermission.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.lys;
import tb.nml;
import tb.nmm;
import tb.nmn;
import tb.nmo;
import tb.tfr;

/* loaded from: classes7.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PERMISSION_BIZ_DENIED = -2;
    public static final int PERMISSION_FORCE_DENIED = -3;
    public static final int PERMISSION_GRANTED = 0;
    public static final int PERMISSION_SYS_DENIED = -1;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<Integer, a> f18989a = new ConcurrentHashMap<>();
    private static final List<i> b = new LinkedList();

    public static /* synthetic */ ConcurrentHashMap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("f779de7e", new Object[0]) : f18989a;
    }

    public static a a(Context context, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("16748a3e", new Object[]{context, strArr});
        }
        if (context == null) {
            throw new NullPointerException("context can not be null");
        }
        if (strArr == null || strArr.length == 0) {
            throw new NullPointerException("permissions can not be null");
        }
        a aVar = new a();
        if (context instanceof Application) {
            a.a(aVar, context);
        } else {
            a.a(aVar, context.getApplicationContext());
        }
        a.a(aVar, strArr);
        return aVar;
    }

    public static d a(Context context, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("57ef4a67", new Object[]{context, str, strArr});
        }
        if (context == null || StringUtils.isEmpty(str) || strArr == null || strArr.length == 0) {
            return null;
        }
        String c = com.taobao.runtimepermission.config.a.a().c(str);
        int[] iArr = new int[nmo.a(strArr)];
        RPConfig b2 = com.taobao.runtimepermission.config.a.a().b();
        if (b2.rollbackBizList != null && b2.rollbackBizList.contains(c)) {
            Arrays.fill(iArr, -3);
        } else {
            boolean b3 = com.taobao.runtimepermission.config.a.a().b(c);
            for (int i = 0; i < strArr.length; i++) {
                if (ActivityCompat.checkSelfPermission(context, strArr[i]) != 0) {
                    iArr[i] = -1;
                } else if (!b3 && !c.a(context, c, strArr[i])) {
                    iArr[i] = -2;
                } else {
                    iArr[i] = 0;
                }
            }
        }
        d a2 = d.a(strArr, iArr);
        nmn.a(str, c, a2);
        return a2;
    }

    public static void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d74569", new Object[]{iVar});
        } else {
            b.add(iVar);
        }
    }

    public static void a(int i, int i2, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7098c2a5", new Object[]{new Integer(i), new Integer(i2), strArr, iArr});
            return;
        }
        a remove = f18989a.remove(Integer.valueOf(i));
        if (remove == null) {
            return;
        }
        a.a(remove, a(iArr), strArr, iArr);
        if (!a.a(remove) || !a.b(remove)) {
            return;
        }
        c.a(a.c(remove), a.d(remove), strArr, iArr);
        b(remove);
        nmn.b(a.e(remove), a.d(remove), a.f(remove));
    }

    public static void a(int i, int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("391bbff8", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), intent});
            return;
        }
        a remove = f18989a.remove(Integer.valueOf(i));
        if (remove == null) {
            return;
        }
        boolean canDrawOverlays = Settings.canDrawOverlays(a.c(remove));
        a.a(remove, canDrawOverlays, new String[]{"android.permission.SYSTEM_ALERT_WINDOW"}, new int[]{canDrawOverlays ? 0 : -1});
    }

    private static boolean a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c19817a", new Object[]{iArr})).booleanValue();
        }
        if (iArr.length <= 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    private static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd2f4b0", new Object[]{aVar});
            return;
        }
        RPConfig b2 = com.taobao.runtimepermission.config.a.a().b();
        if (!a.a(aVar) || StringUtils.isEmpty(a.d(aVar))) {
            return;
        }
        if (b2.callbackBizBlackList != null && b2.callbackBizBlackList.contains(a.d(aVar))) {
            return;
        }
        for (i iVar : b) {
            try {
                iVar.a(a.c(aVar), a.g(aVar), a.h(aVar), a.f(aVar));
            } catch (Throwable th) {
                tfr.b("PermissionUtil", String.format("onAfterPermissionGrant: execute listener %s with exception %s!", iVar, th));
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final AtomicInteger q = new AtomicInteger(0);

        /* renamed from: a  reason: collision with root package name */
        private Context f18990a;
        private String[] b;
        private d f;
        private Runnable l;
        private Runnable m;
        private nmm n;
        private nml o;
        private final int r = q.getAndIncrement();
        private final List<String> c = new ArrayList();
        private final List<String> d = new ArrayList();
        private final List<String> e = new ArrayList();
        private String g = null;
        private String s = null;
        private String h = null;
        private boolean t = false;
        private boolean i = false;
        private boolean j = false;
        private long k = -1;
        private boolean p = false;

        public static /* synthetic */ Context a(a aVar, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("e750bd31", new Object[]{aVar, context});
            }
            aVar.f18990a = context;
            return context;
        }

        public static /* synthetic */ void a(a aVar, boolean z, String[] strArr, int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc51d248", new Object[]{aVar, new Boolean(z), strArr, iArr});
            } else {
                aVar.a(z, strArr, iArr);
            }
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2d1fd73", new Object[]{aVar})).booleanValue() : aVar.i;
        }

        public static /* synthetic */ String[] a(a aVar, String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("38a3bb1f", new Object[]{aVar, strArr});
            }
            aVar.b = strArr;
            return strArr;
        }

        public static /* synthetic */ boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bd2f4b4", new Object[]{aVar})).booleanValue() : aVar.j;
        }

        public static /* synthetic */ Context c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("5407c7e9", new Object[]{aVar}) : aVar.f18990a;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ede59bae", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef1bee8d", new Object[]{aVar}) : aVar.s;
        }

        public static /* synthetic */ d f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("e55bd388", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ List g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("14be60b2", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ List h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2ed9df51", new Object[]{aVar}) : aVar.e;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c8dffd2b", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6963c531", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3264bc72", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            if (this.t) {
                this.j = false;
            }
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ca16500a", new Object[]{this, str});
            }
            this.s = str;
            this.g = com.taobao.runtimepermission.config.a.a().c(str);
            this.t = com.taobao.runtimepermission.config.a.a().b(this.g);
            if (this.t) {
                this.j = false;
            }
            return this;
        }

        public a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("25703f41", new Object[]{this, new Long(j)});
            }
            this.k = j;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fb65b3b3", new Object[]{this, new Boolean(z)});
            }
            this.p = z;
            return this;
        }

        public a a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6a3bdcf7", new Object[]{this, runnable});
            }
            this.l = runnable;
            return this;
        }

        public a b(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f728f416", new Object[]{this, runnable});
            }
            this.m = runnable;
            return this;
        }

        @Deprecated
        public a a(nmm nmmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8b91c2d3", new Object[]{this, nmmVar});
            }
            this.n = nmmVar;
            return this;
        }

        public a a(nml nmlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("77e9ef52", new Object[]{this, nmlVar});
            }
            this.o = nmlVar;
            return this;
        }

        public void a() {
            String[] strArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (Build.VERSION.SDK_INT >= 23) {
                String[] strArr2 = this.b;
                if (strArr2.length == 1 && strArr2[0].equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                    if (!Settings.canDrawOverlays(this.f18990a)) {
                        if (c()) {
                            return;
                        }
                        Intent intent = new Intent();
                        intent.setClass(this.f18990a, PermissionActivity.class);
                        intent.putExtra("permissions", this.b);
                        intent.putExtra(com.taobao.tao.log.statistics.d.PARAM_TASK_ID, this.r);
                        intent.addFlags(268435456);
                        f.a().put(Integer.valueOf(this.r), this);
                        this.f18990a.startActivity(intent);
                        return;
                    }
                    a(this.l, (nml) null, 0);
                    return;
                }
                RPConfig b = com.taobao.runtimepermission.config.a.a().b();
                if (b.rollbackBizList != null && b.rollbackBizList.contains(this.g)) {
                    f.a().put(Integer.valueOf(this.r), this);
                    int[] iArr = new int[nmo.a(this.b)];
                    Arrays.fill(iArr, -3);
                    f.a(this.r, 1096, this.b, iArr);
                    return;
                }
                if (!b.enable || ((b.sameScreenPopBizBlackList != null && b.sameScreenPopBizBlackList.contains(this.g)) || StringUtils.isEmpty(this.g) || StringUtils.isEmpty(this.h))) {
                    this.i = false;
                }
                for (String str : this.b) {
                    int a2 = a(this.f18990a, this.i && this.j, this.g, str);
                    if (a2 == 8291) {
                        this.d.add(str);
                    } else if (a2 == 8292) {
                        this.e.add(str);
                    } else {
                        this.c.add(str);
                    }
                }
                if (!this.i && this.d.size() == 0) {
                    a(this.l, (nml) null, 0);
                } else if (this.i && this.d.size() == 0 && this.e.size() == 0) {
                    a(this.l, this.o, 0);
                } else {
                    String[] strArr3 = new String[this.d.size() + this.e.size()];
                    nmo.a(strArr3, this.d.toArray(new String[0]), this.e.toArray(new String[0]));
                    if (a(strArr3, this.d.size(), (String[]) this.c.toArray(new String[0]))) {
                        return;
                    }
                    Intent intent2 = new Intent();
                    intent2.setClass(this.f18990a, PermissionActivity.class);
                    if (!(this.f18990a instanceof Activity)) {
                        intent2.addFlags(268435456);
                    }
                    intent2.putExtra("sysPermissions", (String[]) this.d.toArray(new String[0]));
                    intent2.putExtra("bizPermissions", (String[]) this.e.toArray(new String[0]));
                    intent2.putExtra("bizName", this.g);
                    intent2.putExtra("originBizName", this.s);
                    intent2.putExtra(TBRunTimePermission.EXPLAIN_PARAM_NAME, new e().a(this.f18990a, strArr3, this.h));
                    intent2.putExtra("showRational", this.i);
                    intent2.putExtra(TBRunTimePermission.SILENCE_INTERVAL_NAME, this.k);
                    intent2.putExtra("transparentBackground", this.p);
                    intent2.putExtra(com.taobao.tao.log.statistics.d.PARAM_TASK_ID, this.r);
                    f.a().put(Integer.valueOf(this.r), this);
                    this.f18990a.startActivity(intent2);
                }
            } else if (Build.VERSION.SDK_INT >= 18) {
                if (j.a.a(this.f18990a, this.b)) {
                    a(this.l, this.o, 0);
                } else {
                    a(this.m, this.o, -1);
                }
            } else {
                a(this.l, this.o, 0);
            }
        }

        private boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            boolean a2 = lys.a();
            if (a2) {
                a(this.m, (nml) null, -1);
            }
            return a2;
        }

        private boolean a(String[] strArr, int i, String[] strArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4d1de377", new Object[]{this, strArr, new Integer(i), strArr2})).booleanValue();
            }
            boolean a2 = lys.a();
            if (a2) {
                Runnable runnable = this.m;
                if (runnable != null) {
                    runnable.run();
                }
                int length = strArr.length + strArr2.length;
                String[] strArr3 = new String[length];
                nmo.a(strArr3, strArr, strArr2);
                if (this.n != null) {
                    int[] iArr = new int[length];
                    Arrays.fill(iArr, 0, i, -1);
                    Arrays.fill(iArr, i, iArr.length, 0);
                    this.n.a(strArr3, iArr);
                }
                if (this.o != null) {
                    int[] iArr2 = new int[length];
                    Arrays.fill(iArr2, 0, i, -1);
                    Arrays.fill(iArr2, i, strArr.length, -2);
                    Arrays.fill(iArr2, strArr.length, iArr2.length, 0);
                    this.o.a(d.a(strArr, iArr2));
                }
            }
            return a2;
        }

        private void a(Runnable runnable, nml nmlVar, int i) {
            String[] strArr;
            String[] strArr2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ee3c27a", new Object[]{this, runnable, nmlVar, new Integer(i)});
                return;
            }
            if (runnable != null) {
                runnable.run();
            }
            if (this.n != null && (strArr2 = this.b) != null) {
                int[] iArr = new int[strArr2.length];
                Arrays.fill(iArr, i);
                this.n.a(this.b, iArr);
            }
            if (nmlVar == null || (strArr = this.b) == null) {
                return;
            }
            int[] iArr2 = new int[strArr.length];
            Arrays.fill(iArr2, i);
            nmlVar.a(d.a(this.b, iArr2));
        }

        private int a(Context context, boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ec99e57b", new Object[]{this, context, new Boolean(z), str, str2})).intValue();
            }
            if (ActivityCompat.checkSelfPermission(context, str2) != 0) {
                return 8291;
            }
            return (!z || c.a(context, str, str2)) ? 8290 : 8292;
        }

        private void a(boolean z, String[] strArr, int[] iArr) {
            String[] strArr2;
            String[] strArr3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5983d081", new Object[]{this, new Boolean(z), strArr, iArr});
                return;
            }
            if (z) {
                Runnable runnable = this.l;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                Runnable runnable2 = this.m;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
            if (this.n != null && (strArr2 = this.b) != null) {
                int[] iArr2 = new int[strArr2.length];
                int i = 0;
                while (true) {
                    strArr3 = this.b;
                    if (i >= strArr3.length) {
                        break;
                    }
                    iArr2[i] = ActivityCompat.checkSelfPermission(this.f18990a, strArr3[i]);
                    i++;
                }
                this.n.a(strArr3, iArr2);
            }
            int[] iArr3 = new int[this.c.size()];
            Arrays.fill(iArr3, 0);
            String[] strArr4 = new String[nmo.a(this.b)];
            int[] iArr4 = new int[nmo.a(this.b)];
            nmo.a(strArr4, this.c.toArray(new String[0]), strArr);
            nmo.a(iArr4, iArr3, iArr);
            this.f = d.a(strArr4, iArr4);
            nml nmlVar = this.o;
            if (nmlVar != null) {
                nmlVar.a(this.f);
            }
            b();
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
        }
    }
}
