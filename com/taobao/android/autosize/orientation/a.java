package com.taobao.android.autosize.orientation;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class a extends ContentObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f9126a;
    private final ContentResolver b;
    private int c;
    public boolean d;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -1222901218) {
            super.onChange(((Boolean) objArr[0]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private a(Handler handler, Activity activity, int i) {
        super(handler);
        this.d = false;
        this.f9126a = activity;
        this.b = activity.getContentResolver();
        this.c = i;
    }

    public static a a(Activity activity) {
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("365dc7d5", new Object[]{activity});
        }
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        Object tag = decorView.getTag(R.id.auto_rotation_operator);
        if (tag instanceof a) {
            return (a) tag;
        }
        a aVar = new a(new Handler(Looper.getMainLooper()), activity, activity.getRequestedOrientation());
        decorView.setTag(R.id.auto_rotation_operator, aVar);
        return aVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onChange(z);
        c();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, this);
        this.d = true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.d) {
        } else {
            this.b.unregisterContentObserver(this);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (Build.VERSION.SDK_INT < 18) {
        } else {
            int a2 = a(this.b);
            int i2 = com.taobao.android.autosize.config.a.a().e(this.f9126a) ? 14 : -1;
            if (a2 == 0) {
                b.a(this.f9126a, i2);
                this.c = i;
            }
            if (a2 != 1) {
                return;
            }
            b.a(this.f9126a, i);
            this.c = i;
        }
    }

    private void c() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        int requestedOrientation = this.f9126a.getRequestedOrientation();
        if (requestedOrientation == 0 || requestedOrientation == 1 || Build.VERSION.SDK_INT < 18) {
            return;
        }
        int i2 = -1;
        if (!com.taobao.android.autosize.config.a.a().e(this.f9126a) && requestedOrientation == -1) {
            return;
        }
        int a2 = a(this.b);
        if (a2 == 0) {
            if (com.taobao.android.autosize.config.a.a().e(this.f9126a)) {
                i2 = 14;
            }
            if (requestedOrientation != i2) {
                b.a(this.f9126a, i2);
                this.c = requestedOrientation;
            }
        }
        if (a2 != 1 || (i = this.c) == requestedOrientation) {
            return;
        }
        b.a(this.f9126a, i);
    }

    public static int a(ContentResolver contentResolver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd6b3163", new Object[]{contentResolver})).intValue();
        }
        if (Build.VERSION.SDK_INT < 18) {
            return -1;
        }
        if (contentResolver == null) {
            return -2;
        }
        try {
            return Settings.System.getInt(contentResolver, "accelerometer_rotation");
        } catch (Settings.SettingNotFoundException e) {
            TLog.loge("TBAutoSize.AutoRotation", "getAccelerometerRotationState", e);
            return -3;
        }
    }
}
