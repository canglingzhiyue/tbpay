package com.uc.webview.base;

import android.os.StrictMode;
import mtopsdk.common.util.StringUtils;
import com.uc.webview.base.SdkGlobalSettings;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes9.dex */
final class e implements SdkGlobalSettings.Interface {

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantReadWriteLock f23778a = new ReentrantReadWriteLock(false);
    private final BitSet b = new BitSet(k.f23790a.length);

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        if (EnvInfo.n()) {
            a();
        }
    }

    private void a() {
        int[] iArr;
        if (f.d.length <= 0) {
            return;
        }
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            for (int i : f.d) {
                String a2 = h.a("gs-" + f.f23779a[i], (String) null);
                if (a2 != null) {
                    set(i, a2);
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        } catch (Throwable unused) {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    @Override // com.uc.webview.base.SdkGlobalSettings.Interface
    public final String get(int i) {
        try {
            this.f23778a.readLock().lock();
            return k.f23790a[i];
        } finally {
            this.f23778a.readLock().unlock();
        }
    }

    @Override // com.uc.webview.base.SdkGlobalSettings.Interface
    public final Map<Integer, String> getModified() {
        try {
            this.f23778a.readLock().lock();
            if (this.b.isEmpty()) {
                this.f23778a.readLock().unlock();
                return null;
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i)) {
                    hashMap.put(Integer.valueOf(i), k.f23790a[i]);
                }
            }
            return hashMap;
        } finally {
            this.f23778a.readLock().unlock();
        }
    }

    @Override // com.uc.webview.base.SdkGlobalSettings.Interface
    public final boolean isAccessible(int i, String str) {
        try {
            this.f23778a.readLock().lock();
            return SdkGlobalSettings.isAccessible(str, k.f23790a[i]);
        } finally {
            this.f23778a.readLock().unlock();
        }
    }

    @Override // com.uc.webview.base.SdkGlobalSettings.Interface
    public final boolean set(int i, String str) {
        try {
            this.f23778a.writeLock().lock();
            if (StringUtils.equals(str, k.f23790a[i])) {
                this.f23778a.writeLock().unlock();
                return false;
            }
            k.f23790a[i] = str;
            this.b.set(i);
            this.f23778a.writeLock().unlock();
            return true;
        } catch (Throwable th) {
            this.f23778a.writeLock().unlock();
            throw th;
        }
    }
}
