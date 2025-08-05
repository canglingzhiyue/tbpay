package android.taobao.safemode;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes.dex */
public class SafeModeActivity extends Activity implements f, View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f1513a = "Launch";
    public static String b = "Version";
    private e d;
    private boolean c = false;
    private boolean e = true;
    private String f = "";
    private boolean g = true;

    public static /* synthetic */ Object ipc$super(SafeModeActivity safeModeActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        b();
        setContentView(R.layout.activity_safemode);
        this.e = getIntent().getBooleanExtra(f1513a, true);
        this.f = getIntent().getStringExtra(b);
        String str = "Crash version:" + this.f;
        this.d = new e(getApplication(), this.f, this.e, this);
        findViewById(R.id.activity_safemode_btn_skip).setOnClickListener(this);
        this.d.b();
        if ("false".equals(getSharedPreferences("SafeModeOrange", 0).getString("downloadPatchAfterClick", "true"))) {
            this.g = false;
        }
        if (!this.g && this.e) {
            this.d.a();
            this.g = false;
            return;
        }
        this.g = true;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.contains(getPackageName()) && !runningAppProcessInfo.processName.contains(":safemode")) {
                    Process.killProcess(runningAppProcessInfo.pid);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Process.killProcess(Process.myPid());
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c) {
        } else {
            this.c = true;
            this.d.c();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.activity_safemode_btn_fix) {
            if (this.g) {
                this.d.a();
            }
            ((TextView) findViewById(R.id.activity_safemode_btn_fix)).setText(R.string.safemode_fixing);
            c();
        } else {
            this.d.a(true);
        }
    }

    @Override // android.taobao.safemode.f
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d.a(false);
        }
    }
}
