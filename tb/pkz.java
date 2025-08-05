package tb;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes8.dex */
public class pkz extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f32742a;
    private TextView b;
    private TextView c;

    static {
        kge.a(668133795);
    }

    public pkz(Context context) {
        this(context, R.style.TLLive_Permission_Dialog);
    }

    public pkz(Context context, int i) {
        super(context, i);
        a(context);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.taolive_base_prompt_dialog, (ViewGroup) null);
        setContentView(inflate);
        this.f32742a = (TextView) inflate.findViewById(R.id.title);
        this.b = (TextView) inflate.findViewById(R.id.content);
        this.c = (TextView) inflate.findViewById(R.id.positive);
        inflate.findViewById(R.id.taolive_close).setOnClickListener(new View.OnClickListener() { // from class: tb.pkz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    pkz.this.dismiss();
                }
            }
        });
    }

    public pkz a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pkz) ipChange.ipc$dispatch("7c73d815", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.f32742a.setVisibility(0);
            this.f32742a.setText(str);
        }
        return this;
    }

    public pkz b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pkz) ipChange.ipc$dispatch("7d2083b4", new Object[]{this, str});
        }
        this.b.setText(c(str));
        return this;
    }

    public pkz a(String str, final View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pkz) ipChange.ipc$dispatch("f6c00be0", new Object[]{this, str, onClickListener});
        }
        this.c.setVisibility(0);
        this.c.setText(str);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: tb.pkz.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                View.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
                pkz.this.dismiss();
            }
        });
        return this;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 12288) {
                charArray[i] = ' ';
            } else if (charArray[i] > 65280 && charArray[i] < 65375) {
                charArray[i] = (char) (charArray[i] - 65248);
            }
        }
        return new String(charArray);
    }
}
