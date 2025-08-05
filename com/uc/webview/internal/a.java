package com.uc.webview.internal;

import android.util.Log;
import com.uc.webview.internal.interfaces.ICore2Sdk;
import com.uc.webview.internal.setup.c;
import com.uc.webview.internal.stats.i;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public class a implements ICore2Sdk {

    /* renamed from: a  reason: collision with root package name */
    private static String f23853a = "a";
    private final AtomicInteger b = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uc.webview.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1041a {

        /* renamed from: a  reason: collision with root package name */
        static final a f23854a = new a();
    }

    public static a a() {
        return C1041a.f23854a;
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        if (i == 1) {
            try {
                c.b.f23896a.a((String) objArr[0]);
                return null;
            } catch (Throwable th) {
                Log.e(f23853a, "invoke failed", th);
                return null;
            }
        }
        String str = "unsupport id: " + i + ", params: " + Arrays.toString(objArr);
        return null;
    }

    @Override // com.uc.webview.internal.interfaces.ICore2Sdk
    public void onActivityStatus(int i) {
        "onActivityStatus: ".concat(String.valueOf(i));
        int andSet = this.b.getAndSet(i);
        boolean z = (andSet == i || andSet == 0) ? false : true;
        if (i == 1) {
            if (!z) {
                return;
            }
            i.a().a(false);
        } else if (i == 2) {
        } else {
            if (i == 3) {
                if (!z) {
                    return;
                }
                i.a().a(true);
            } else if (i == 4) {
            } else {
                if (i != 5) {
                    "onActivityStatus invliad: ".concat(String.valueOf(i));
                } else if (!z) {
                } else {
                    i.a().a(false);
                }
            }
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICore2Sdk
    public void onInitStatus(int i, boolean z) {
        c.b.f23896a.a(i, z);
    }

    @Override // com.uc.webview.internal.interfaces.ICore2Sdk
    public void onPageView(int i, String str) {
        i.a().a(i, str, false);
    }

    @Override // com.uc.webview.internal.interfaces.ICore2Sdk
    public void postTask(String str, Runnable runnable) {
        if (str == null) {
            str = runnable.toString();
        }
        com.uc.webview.base.task.d.a(str, runnable);
    }
}
