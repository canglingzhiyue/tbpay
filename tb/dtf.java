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

/* loaded from: classes4.dex */
public class dtf extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private EditText f26953a;
    private EditText b;
    private a c;
    private a d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface a {
        void a(DialogInterface dialogInterface, CharSequence charSequence);
    }

    static {
        kge.a(392024532);
    }

    public static /* synthetic */ Object ipc$super(dtf dtfVar, String str, Object... objArr) {
        if (str.hashCode() == -340027132) {
            super.show();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ EditText a(dtf dtfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("6c663371", new Object[]{dtfVar}) : dtfVar.f26953a;
    }

    public static /* synthetic */ a b(dtf dtfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("58ee98b0", new Object[]{dtfVar}) : dtfVar.c;
    }

    public static /* synthetic */ a c(dtf dtfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("df74534f", new Object[]{dtfVar}) : dtfVar.d;
    }

    public static /* synthetic */ EditText d(dtf dtfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("a75dadf4", new Object[]{dtfVar}) : dtfVar.b;
    }

    public dtf(Context context) {
        super(context);
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        a();
        b();
        c();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        setContentView(R.layout.alibuy_text_input_dialog);
        this.f26953a = (EditText) findViewById(R.id.et_input);
        findViewById(R.id.tv_cancel).setOnClickListener(new View.OnClickListener() { // from class: tb.dtf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                dtf.this.dismiss();
                if (dtf.a(dtf.this) == null || dtf.b(dtf.this) == null) {
                    return;
                }
                a b = dtf.b(dtf.this);
                dtf dtfVar = dtf.this;
                b.a(dtfVar, dtf.a(dtfVar).getText());
            }
        });
        findViewById(R.id.tv_confirm).setOnClickListener(new View.OnClickListener() { // from class: tb.dtf.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                dtf.this.dismiss();
                if (dtf.a(dtf.this) == null || dtf.c(dtf.this) == null) {
                    return;
                }
                Editable text = dtf.a(dtf.this).getText();
                dtf.d(dtf.this).setText(text);
                dtf.c(dtf.this).a(dtf.this, text);
            }
        });
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Window window = getWindow();
        if (window == null) {
            return;
        }
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

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        EditText editText = this.b;
        if (editText == null || this.f26953a == null) {
            return;
        }
        Object tag = editText.getTag(dtg.ID_KEY_BOARD);
        if (tag instanceof Integer) {
            dte.b(this.f26953a, ((Integer) tag).intValue());
        }
        Object tag2 = this.b.getTag(dtg.ID_MAX_LENGTH);
        if (tag2 instanceof Integer) {
            dte.c(this.f26953a, ((Integer) tag2).intValue());
        }
        Object tag3 = this.b.getTag(dtg.ID_PLACE_HOLDER);
        if (tag3 != null) {
            dte.a(this.f26953a, tag3.toString());
        }
        Object tag4 = this.b.getTag(dtg.ID_PLACE_HOLDER_COLOR);
        if (tag4 instanceof Integer) {
            dte.a(this.f26953a, ((Integer) tag4).intValue());
        }
        Object tag5 = this.b.getTag(dtg.ID_TV_TEXT);
        if (tag5 != null) {
            dte.b(this.f26953a, tag5.toString());
        }
        Editable text = this.f26953a.getText();
        if (StringUtils.isEmpty(text)) {
            return;
        }
        this.f26953a.setSelection(text.length());
    }

    public void a(EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe55bd7", new Object[]{this, editText});
            return;
        }
        this.b = editText;
        c();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00140e5", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }
}
