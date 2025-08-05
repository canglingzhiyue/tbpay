package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.d;
import com.taobao.android.nav.e;
import com.taobao.android.nav.h;
import com.taobao.android.nav.n;
import com.taobao.tao.log.TLog;

/* loaded from: classes6.dex */
public class sxw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FastChains";

    /* renamed from: a  reason: collision with root package name */
    private int f33931a = 0;

    static {
        kge.a(1687912034);
    }

    private int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = -1;
        while (i != 0) {
            i2++;
            if ((i & 1) == 1 && i2 < sxv.c.length && sxv.c[i2] == this.f33931a) {
                return i2;
            }
            i >>= 1;
        }
        return -1;
    }

    private e b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("93f8e345", new Object[]{this, new Integer(i)});
        }
        int a2 = a(i);
        if (a2 != -1 && a2 < sxv.b.length) {
            return sxv.b[a2];
        }
        return null;
    }

    private int a(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        int i2 = 3;
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            this.f33931a = i3;
            if (i3 > 72) {
                return -1;
            }
            char charAt = str.charAt(i3);
            if (charAt == '?') {
                return i2;
            }
            if (charAt >= 'A' && charAt <= 'Z') {
                i = charAt - 'A';
            } else if (charAt >= 'a' && charAt <= 'z') {
                i = charAt - 'a';
            } else if (charAt == '.') {
                i = 26;
            } else if (charAt == '/') {
                i = 27;
            } else if (charAt == ':') {
                i = 28;
            } else if (charAt == '-') {
                i = 29;
            } else if (charAt == '#') {
                i = 30;
            } else if (charAt < '0' || charAt > '9') {
                return -1;
            } else {
                i = (charAt - '0') + 31;
            }
            i2 &= sxv.f33930a[i3][i];
            if (i2 == 0) {
                return -1;
            }
        }
        this.f33931a = length;
        return i2;
    }

    public Intent a(Uri uri, Intent intent, d dVar) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("5e3f426d", new Object[]{this, uri, intent, dVar});
        }
        String uri2 = uri.toString();
        if (TextUtils.isEmpty(uri2) || (a2 = a(uri2)) == -1) {
            return null;
        }
        TLog.loge(TAG, "runWithNavContext addr:" + a2);
        e b = b(a2);
        if (b == null) {
            return null;
        }
        intent.setData(uri);
        try {
            b.process(intent, dVar);
            dVar.a(true, TAG);
            TLog.loge(TAG, "runWithNavContext success " + intent.getDataString());
            return intent;
        } catch (Throwable th) {
            TLog.loge(TAG, "runWithNavContext error", th);
            return null;
        }
    }

    public static Intent a(Uri uri, Intent intent, d dVar, boolean z, n nVar) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("e9c4e125", new Object[]{uri, intent, dVar, new Boolean(z), nVar});
        }
        if (!h.c()) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!z) {
            String uri2 = uri.toString();
            if (uri2.startsWith("TNAVF://") || uri2.startsWith("tnavf://")) {
                z2 = true;
            }
        }
        if (!z && !z2) {
            return null;
        }
        Intent a2 = new sxw().a(uri, intent, dVar);
        if (h.d()) {
            dVar.b((String) null);
        }
        if (a2 != null && nVar != null) {
            nVar.a(dVar.a(), "fastChains run", SystemClock.uptimeMillis() - uptimeMillis);
        }
        return a2;
    }
}
