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
import com.alibaba.android.ultron.trade.dinamicX.constructor.TradeTextInputConstructor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public class bmn extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private EditText f25978a;
    private EditText b;
    private String c;
    private a d;
    private a e;

    /* loaded from: classes2.dex */
    public interface a {
        void a(DialogInterface dialogInterface, CharSequence charSequence);
    }

    static {
        kge.a(-324079797);
    }

    public static /* synthetic */ Object ipc$super(bmn bmnVar, String str, Object... objArr) {
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

    public static /* synthetic */ EditText a(bmn bmnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("d065d7a4", new Object[]{bmnVar}) : bmnVar.b;
    }

    public static /* synthetic */ a b(bmn bmnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e876c210", new Object[]{bmnVar}) : bmnVar.d;
    }

    public static /* synthetic */ a c(bmn bmnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6efc7caf", new Object[]{bmnVar}) : bmnVar.e;
    }

    public static /* synthetic */ EditText d(bmn bmnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("b5d5227", new Object[]{bmnVar}) : bmnVar.f25978a;
    }

    public bmn(Context context) {
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
        findViewById(R.id.tv_cancel).setOnClickListener(new View.OnClickListener() { // from class: tb.bmn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                bmn.this.dismiss();
                if (bmn.a(bmn.this) == null || bmn.b(bmn.this) == null) {
                    return;
                }
                a b = bmn.b(bmn.this);
                bmn bmnVar = bmn.this;
                b.a(bmnVar, bmn.a(bmnVar).getText());
            }
        });
        findViewById(R.id.tv_confirm).setOnClickListener(new View.OnClickListener() { // from class: tb.bmn.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                bmn.this.dismiss();
                if (bmn.a(bmn.this) == null || bmn.c(bmn.this) == null) {
                    return;
                }
                Editable text = bmn.a(bmn.this).getText();
                bmn.d(bmn.this).setText(text);
                bmn.c(bmn.this).a(bmn.this, text);
            }
        });
    }

    public void a(EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe55bd7", new Object[]{this, editText});
            return;
        }
        this.f25978a = editText;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        EditText editText = this.f25978a;
        if (editText == null || this.b == null) {
            return;
        }
        Object tag = editText.getTag(TradeTextInputConstructor.ID_KEY_BOARD);
        if (tag != null) {
            bmm.a(this.b, tag.toString());
        }
        Object tag2 = this.f25978a.getTag(TradeTextInputConstructor.ID_MAX_LENGTH);
        if (tag2 != null) {
            bmm.b(this.b, tag2.toString());
        }
        Object tag3 = this.f25978a.getTag(TradeTextInputConstructor.ID_PLACE_HOLDER);
        if (tag3 != null) {
            bmm.c(this.b, tag3.toString());
        }
        Object tag4 = this.f25978a.getTag(TradeTextInputConstructor.ID_PLACE_HOLDER_COLOR);
        if (tag4 != null) {
            bmm.d(this.b, tag4.toString());
        }
        Object tag5 = this.f25978a.getTag(TradeTextInputConstructor.ID_TV_TEXT);
        if (tag5 != null) {
            this.c = tag5.toString();
            bmm.e(this.b, this.c);
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
            ipChange.ipc$dispatch("6b9a0d58", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }
}
