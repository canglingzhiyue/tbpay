package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertController;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public class b extends h implements DialogInterface {

    /* renamed from: a  reason: collision with root package name */
    final AlertController f1329a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.a f1330a;
        private final int b;

        public a(Context context) {
            this(context, b.a(context, 0));
        }

        public a(Context context, int i) {
            this.f1330a = new AlertController.a(new ContextThemeWrapper(context, b.a(context, i)));
            this.b = i;
        }

        public Context a() {
            return this.f1330a.f1312a;
        }

        public a a(int i) {
            AlertController.a aVar = this.f1330a;
            aVar.f = aVar.f1312a.getText(i);
            return this;
        }

        public a a(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.f1330a;
            aVar.i = aVar.f1312a.getText(i);
            this.f1330a.k = onClickListener;
            return this;
        }

        public a a(DialogInterface.OnCancelListener onCancelListener) {
            this.f1330a.s = onCancelListener;
            return this;
        }

        public a a(DialogInterface.OnKeyListener onKeyListener) {
            this.f1330a.u = onKeyListener;
            return this;
        }

        public a a(Drawable drawable) {
            this.f1330a.d = drawable;
            return this;
        }

        public a a(View view) {
            this.f1330a.g = view;
            return this;
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.f1330a;
            aVar.w = listAdapter;
            aVar.x = onClickListener;
            return this;
        }

        public a a(CharSequence charSequence) {
            this.f1330a.f = charSequence;
            return this;
        }

        public a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.f1330a;
            aVar.i = charSequence;
            aVar.k = onClickListener;
            return this;
        }

        public a a(boolean z) {
            this.f1330a.r = z;
            return this;
        }

        public a a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.f1330a;
            aVar.v = charSequenceArr;
            aVar.x = onClickListener;
            return this;
        }

        public a b(int i) {
            AlertController.a aVar = this.f1330a;
            aVar.h = aVar.f1312a.getText(i);
            return this;
        }

        public a b(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.f1330a;
            aVar.l = aVar.f1312a.getText(i);
            this.f1330a.n = onClickListener;
            return this;
        }

        public a b(View view) {
            AlertController.a aVar = this.f1330a;
            aVar.z = view;
            aVar.y = 0;
            aVar.E = false;
            return this;
        }

        public a b(CharSequence charSequence) {
            this.f1330a.h = charSequence;
            return this;
        }

        public a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.f1330a;
            aVar.l = charSequence;
            aVar.n = onClickListener;
            return this;
        }

        public b b() {
            b bVar = new b(this.f1330a.f1312a, this.b);
            this.f1330a.a(bVar.f1329a);
            bVar.setCancelable(this.f1330a.r);
            if (this.f1330a.r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f1330a.s);
            bVar.setOnDismissListener(this.f1330a.t);
            if (this.f1330a.u != null) {
                bVar.setOnKeyListener(this.f1330a.u);
            }
            return bVar;
        }

        public a c(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.f1330a;
            aVar.o = aVar.f1312a.getText(i);
            this.f1330a.q = onClickListener;
            return this;
        }

        public a c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.a aVar = this.f1330a;
            aVar.o = charSequence;
            aVar.q = onClickListener;
            return this;
        }

        public b c() {
            b b = b();
            b.show();
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Context context) {
        this(context, 0);
    }

    protected b(Context context, int i) {
        super(context, a(context, i));
        this.f1329a = new AlertController(getContext(), this, getWindow());
    }

    static int a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button a(int i) {
        return this.f1329a.d(i);
    }

    public ListView a() {
        return this.f1329a.b();
    }

    public void a(View view) {
        this.f1329a.c(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1329a.a();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f1329a.a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f1329a.b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.support.v7.app.h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1329a.a(charSequence);
    }
}
