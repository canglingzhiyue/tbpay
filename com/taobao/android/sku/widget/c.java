package com.taobao.android.sku.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.f;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private EditText f15242a;
    private EditText b;
    private String c;
    private a d;
    private a e;

    /* loaded from: classes6.dex */
    public interface a {
        void a(DialogInterface dialogInterface, CharSequence charSequence);
    }

    static {
        kge.a(658613919);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1373052399) {
            super.dismiss();
            return null;
        } else if (hashCode != -340027132) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.show();
            return null;
        }
    }

    public static /* synthetic */ EditText a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("a31c9d0b", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ a b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f04fecd2", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ a c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("729aa1b1", new Object[]{cVar}) : cVar.e;
    }

    public static /* synthetic */ EditText d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("5fd7ebe8", new Object[]{cVar}) : cVar.f15242a;
    }

    public c(Context context) {
        super(context);
        this.c = "";
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 17;
        attributes.width = -1;
        attributes.height = -2;
        attributes.x = 0;
        attributes.y = 0;
        window.setAttributes(attributes);
        window.setBackgroundDrawableResource(17170445);
        window.clearFlags(131072);
        window.setSoftInputMode(5);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        setContentView(R.layout.xsku_text_input);
        this.b = (EditText) findViewById(R.id.et_input);
        findViewById(R.id.tv_cancel).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.sku.widget.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                c.this.dismiss();
                if (c.a(c.this) == null || c.b(c.this) == null) {
                    return;
                }
                a b = c.b(c.this);
                c cVar = c.this;
                b.a(cVar, c.a(cVar).getText());
            }
        });
        findViewById(R.id.tv_confirm).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.sku.widget.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                c.this.dismiss();
                if (c.a(c.this) == null || c.c(c.this) == null) {
                    return;
                }
                Editable text = c.a(c.this).getText();
                c.d(c.this).setText(text);
                c.c(c.this).a(c.this, text);
            }
        });
    }

    public void a(EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe55bd7", new Object[]{this, editText});
            return;
        }
        this.f15242a = editText;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        EditText editText = this.f15242a;
        if (editText == null || this.b == null) {
            return;
        }
        Object tag = editText.getTag(com.taobao.android.sku.dinamicx.widget.c.ID_KEY_BOARD);
        if (tag instanceof Integer) {
            f.a(this.b, ((Integer) tag).intValue());
        }
        Object tag2 = this.f15242a.getTag(com.taobao.android.sku.dinamicx.widget.c.ID_MAX_LENGTH);
        if (tag2 instanceof Integer) {
            f.b(this.b, ((Integer) tag2).intValue());
        }
        Object tag3 = this.f15242a.getTag(com.taobao.android.sku.dinamicx.widget.c.ID_PLACE_HOLDER);
        if (tag3 != null) {
            f.a(this.b, tag3.toString());
        }
        Object tag4 = this.f15242a.getTag(com.taobao.android.sku.dinamicx.widget.c.ID_PLACE_HOLDER_COLOR);
        if (tag4 instanceof Integer) {
            f.c(this.b, ((Integer) tag4).intValue());
        }
        Object tag5 = this.f15242a.getTag(com.taobao.android.sku.dinamicx.widget.c.ID_TV_TEXT);
        if (tag5 != null) {
            this.c = tag5.toString();
            f.b(this.b, this.c);
        }
        Editable text = this.b.getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        this.b.setSelection(text.length());
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        a(getContext());
        a();
        b();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            super.dismiss();
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d6d9ff", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }
}
