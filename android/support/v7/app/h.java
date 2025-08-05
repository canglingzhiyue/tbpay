package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.taobao.R;
import tb.acn;

/* loaded from: classes2.dex */
public class h extends Dialog implements c {
    private AppCompatDelegate mDelegate;

    public h(Context context) {
        this(context, 0);
    }

    public h(Context context, int i) {
        super(context, getThemeResId(context, i));
        getDelegate().a((Bundle) null);
        getDelegate().j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }

    private static int getThemeResId(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().b(view, layoutParams);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().a(i);
    }

    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.a(this, this);
        }
        return this.mDelegate;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().a();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().i();
        super.onCreate(bundle);
        getDelegate().a(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        getDelegate().d();
    }

    @Override // android.support.v7.app.c
    public void onSupportActionModeFinished(acn acnVar) {
    }

    @Override // android.support.v7.app.c
    public void onSupportActionModeStarted(acn acnVar) {
    }

    @Override // android.support.v7.app.c
    public acn onWindowStartingSupportActionMode(acn.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        getDelegate().b(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        getDelegate().a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().a(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().a(charSequence);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().c(i);
    }
}
