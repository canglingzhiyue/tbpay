package tb;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public class bmw extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private EditText f25987a;
    private EditText b;
    private String c;
    private a d;
    private a e;

    /* loaded from: classes2.dex */
    public interface a {
        void a(DialogInterface dialogInterface, CharSequence charSequence);
    }

    static {
        kge.a(-1714934220);
    }

    public static /* synthetic */ Object ipc$super(bmw bmwVar, String str, Object... objArr) {
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

    public static /* synthetic */ EditText a(bmw bmwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("47bf19fb", new Object[]{bmwVar}) : bmwVar.b;
    }

    public static /* synthetic */ a b(bmw bmwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4b1613f0", new Object[]{bmwVar}) : bmwVar.d;
    }

    public static /* synthetic */ a c(bmw bmwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d19bce8f", new Object[]{bmwVar}) : bmwVar.e;
    }

    public static /* synthetic */ EditText d(bmw bmwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("82b6947e", new Object[]{bmwVar}) : bmwVar.f25987a;
    }

    public bmw(Context context) {
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
        setContentView(R.layout.trade_text_input);
        this.b = (EditText) findViewById(R.id.et_input);
        findViewById(R.id.tv_cancel).setOnClickListener(new View.OnClickListener() { // from class: tb.bmw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                bmw.this.dismiss();
                if (bmw.a(bmw.this) == null || bmw.b(bmw.this) == null) {
                    return;
                }
                a b = bmw.b(bmw.this);
                bmw bmwVar = bmw.this;
                b.a(bmwVar, bmw.a(bmwVar).getText());
            }
        });
        findViewById(R.id.tv_confirm).setOnClickListener(new View.OnClickListener() { // from class: tb.bmw.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                bmw.this.dismiss();
                if (bmw.a(bmw.this) == null || bmw.c(bmw.this) == null) {
                    return;
                }
                Editable text = bmw.a(bmw.this).getText();
                bmw.d(bmw.this).setText(text);
                bmw.c(bmw.this).a(bmw.this, text);
            }
        });
    }

    public void a(EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe55bd7", new Object[]{this, editText});
            return;
        }
        this.f25987a = editText;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        EditText editText = this.f25987a;
        if (editText == null || this.b == null) {
            return;
        }
        Object tag = editText.getTag(bmp.ID_KEY_BOARD);
        if (tag instanceof Integer) {
            bmu.a(this.b, ((Integer) tag).intValue());
        }
        Object tag2 = this.f25987a.getTag(bmp.ID_MAX_LENGTH);
        if (tag2 instanceof Integer) {
            bmu.b(this.b, ((Integer) tag2).intValue());
        }
        Object tag3 = this.f25987a.getTag(bmp.ID_PLACE_HOLDER);
        if (tag3 != null) {
            bmu.a(this.b, tag3.toString());
        }
        Object tag4 = this.f25987a.getTag(bmp.ID_PLACE_HOLDER_COLOR);
        if (tag4 instanceof Integer) {
            bmu.c(this.b, ((Integer) tag4).intValue());
        }
        Object tag5 = this.f25987a.getTag(bmp.ID_TV_TEXT);
        if (tag5 != null) {
            this.c = tag5.toString();
            bmu.b(this.b, this.c);
        }
        Editable text = this.b.getText();
        if (StringUtils.isEmpty(text)) {
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
        try {
            super.show();
            a(getContext());
            a();
            b();
        } catch (Throwable th) {
            jqg.a("TDTextInputDialog", th.getMessage());
        }
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
            ipChange.ipc$dispatch("7af5aaef", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }
}
