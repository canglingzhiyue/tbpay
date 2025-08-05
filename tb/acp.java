package tb;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public class acp extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private int f25245a;
    private Resources.Theme b;
    private LayoutInflater c;
    private Configuration d;
    private Resources e;

    public acp() {
        super(null);
    }

    public acp(Context context, int i) {
        super(context);
        this.f25245a = i;
    }

    public acp(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }

    private Resources b() {
        Resources resources;
        if (this.e == null) {
            if (this.d == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(this.d).getResources();
            }
            this.e = resources;
        }
        return this.e;
    }

    private void c() {
        boolean z = this.b == null;
        if (z) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        a(this.b, this.f25245a, z);
    }

    public int a() {
        return this.f25245a;
    }

    protected void a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.c == null) {
                this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.f25245a == 0) {
            this.f25245a = R.style.Theme_AppCompat_Light;
        }
        c();
        return this.b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f25245a != i) {
            this.f25245a = i;
            c();
        }
    }
}
