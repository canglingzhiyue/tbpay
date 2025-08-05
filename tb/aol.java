package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class aol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f25476a;
    private SharedPreferences b;
    private SharedPreferences.Editor c = null;
    private Context d;

    static {
        kge.a(1558958508);
    }

    public aol(Context context, String str, String str2, boolean z, boolean z2) {
        this.f25476a = "";
        this.b = null;
        this.d = null;
        this.f25476a = str2;
        this.d = context;
        if (context != null) {
            this.b = context.getSharedPreferences(str2, 0);
        }
    }

    private void b() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c != null || (sharedPreferences = this.b) == null) {
        } else {
            this.c = sharedPreferences.edit();
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        b();
        SharedPreferences.Editor editor = this.c;
        if (editor == null) {
            return;
        }
        editor.putString(str, str2);
    }

    public boolean a() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.c != null) {
            if (Build.VERSION.SDK_INT >= 9) {
                aqa.a(this.c);
            } else {
                this.c.commit();
            }
        }
        if (this.b != null && (context = this.d) != null) {
            this.b = context.getSharedPreferences(this.f25476a, 0);
        }
        return true;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!aqc.e(string)) {
                return string;
            }
        }
        return "";
    }
}
