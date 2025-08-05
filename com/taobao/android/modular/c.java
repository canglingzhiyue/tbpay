package com.taobao.android.modular;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final b f14414a;
    private static volatile b b;

    static {
        kge.a(-1810035217);
        a aVar = new a();
        f14414a = aVar;
        b = aVar;
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0048d6d", new Object[]{bVar});
        } else {
            b = bVar;
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            b.a(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else {
            b.a(str, str2, th);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586f5b98", new Object[]{str, str2, th});
        } else {
            b.b(str, str2, th);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            b.b(str, str2);
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-969454308);
            kge.a(-1742020611);
        }

        @Override // com.taobao.android.modular.b
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            }
        }

        @Override // com.taobao.android.modular.b
        public void b(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("586f5b98", new Object[]{this, str, str2, th});
            }
        }

        private a() {
        }

        @Override // com.taobao.android.modular.b
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            } else {
                Log.e(str, str2);
            }
        }

        @Override // com.taobao.android.modular.b
        public void a(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c430ebf9", new Object[]{this, str, str2, th});
            } else {
                Log.e(str, str2, th);
            }
        }
    }
}
