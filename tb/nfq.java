package tb;

import android.app.Activity;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.Constants;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public class nfq extends ContentObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31427a;
    private static final String[] b;
    private static final String[] c;
    private static final String[] d;
    private final Set<String> e;
    private final Uri f;
    private final Activity g;
    private nfp h;

    public static /* synthetic */ Object ipc$super(nfq nfqVar, String str, Object... objArr) {
        if (str.hashCode() == -1222901218) {
            super.onChange(((Boolean) objArr[0]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-1712884233);
        f31427a = nfq.class.getSimpleName();
        b = new String[]{"bucket_display_name", "_data", "_size", "width", "height", "mime_type", "datetaken"};
        c = new String[]{"screenshot", "screen_shot", "com.taobao.pha.core.screen-shot", "com.taobao.pha.core.screen shot", "screencapture", "screen_capture", "com.taobao.pha.core.screen-capture", "com.taobao.pha.core.screen capture", "screencap", "screen_cap", "com.taobao.pha.core.screen-cap", "com.taobao.pha.core.screen cap"};
        d = new String[]{Constants.SHARETYPE_WITH_QRCODE, "image/jpeg"};
    }

    public nfq(Activity activity, Uri uri, Handler handler) {
        super(handler);
        this.e = new HashSet();
        this.f = uri;
        this.g = activity;
    }

    public void a(nfp nfpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f61b4a20", new Object[]{this, nfpVar});
        } else {
            this.h = nfpVar;
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        nfs b2;
        nfp nfpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onChange(z);
        String str = f31427a;
        ngr.c(str, "onChange invoked selfChange = " + z + " uri = " + this.f + " " + System.currentTimeMillis());
        if (Build.VERSION.SDK_INT > 28) {
            b2 = a();
        } else {
            b2 = b();
        }
        if (b2 == null) {
            return;
        }
        synchronized (this.e) {
            if (this.e.contains(b2.f31430a)) {
                return;
            }
            if (this.e.size() > 2048) {
                this.e.clear();
            }
            this.e.add(b2.f31430a);
            if (!a(b2) || (nfpVar = this.h) == null) {
                return;
            }
            nfpVar.a(b2);
        }
    }

    private boolean a(nfs nfsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f61ca741", new Object[]{this, nfsVar})).booleanValue();
        }
        if (nfsVar.c > ngn.b() || TextUtils.isEmpty(nfsVar.f31430a)) {
            return false;
        }
        String lowerCase = nfsVar.f31430a.toLowerCase();
        for (String str : c) {
            if (lowerCase.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private nfs a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfs) ipChange.ipc$dispatch("f0832c3", new Object[]{this});
        }
        Bundle a2 = a("mime_type=? or mime_type=?", "datetaken DESC");
        a2.putInt("android:query-arg-limit", 1);
        nfs nfsVar = null;
        try {
            Cursor query = this.g.getContentResolver().query(this.f, b, a2, null);
            if (query == null) {
                return null;
            }
            nfsVar = a(query);
            query.close();
            return nfsVar;
        } catch (Exception e) {
            ngr.b(f31427a, e.toString());
            return nfsVar;
        }
    }

    private nfs b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfs) ipChange.ipc$dispatch("16b9d822", new Object[]{this});
        }
        nfs nfsVar = null;
        try {
            Cursor query = this.g.getContentResolver().query(this.f, b, "mime_type=? or mime_type=?", d, "datetaken DESC limit 1 ");
            nfsVar = a(query);
            if (query != null) {
                query.close();
            }
        } catch (Exception e) {
            ngr.b(f31427a, e.toString());
        }
        return nfsVar;
    }

    private nfs a(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfs) ipChange.ipc$dispatch("ad459b1c", new Object[]{this, cursor});
        }
        nfs nfsVar = new nfs();
        if (cursor != null && !cursor.isClosed() && cursor.moveToFirst()) {
            String string = cursor.getString(cursor.getColumnIndexOrThrow(b[1]));
            long j = cursor.getLong(cursor.getColumnIndexOrThrow(b[2]));
            int i = cursor.getInt(cursor.getColumnIndexOrThrow(b[3]));
            int i2 = cursor.getInt(cursor.getColumnIndexOrThrow(b[4]));
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow(b[5]));
            long j2 = cursor.getLong(cursor.getColumnIndexOrThrow(b[6]));
            nfsVar.c = i;
            nfsVar.d = i2;
            nfsVar.e = string2;
            nfsVar.b = j;
            nfsVar.f31430a = string;
            nfsVar.f = j2;
        }
        return nfsVar;
    }

    private Bundle a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("70980340", new Object[]{this, str, str2});
        }
        Bundle bundle = new Bundle();
        bundle.putString("android:query-arg-sql-selection", str);
        bundle.putStringArray("android:query-arg-sql-selection-args", d);
        bundle.putString("android:query-arg-sql-sort-order", str2);
        bundle.putString("android:query-arg-limit", String.valueOf(1));
        return bundle;
    }
}
