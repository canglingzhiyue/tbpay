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
public class pqk extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f32818a;
    private TextView b;
    private TextView c;
    private TextView d;

    static {
        kge.a(1231451587);
    }

    public pqk(Context context) {
        super(context);
        a(context);
    }

    public pqk(Context context, int i) {
        super(context, i);
        a(context);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.live_layout_common_dialog, (ViewGroup) null);
        setContentView(inflate);
        this.f32818a = (TextView) inflate.findViewById(R.id.title);
        this.b = (TextView) inflate.findViewById(R.id.content);
        this.c = (TextView) inflate.findViewById(R.id.positive);
        this.d = (TextView) inflate.findViewById(R.id.negative);
    }

    public pqk a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pqk) ipChange.ipc$dispatch("7c73ecca", new Object[]{this, str});
        }
        this.f32818a.setText(str);
        return this;
    }

    public pqk b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pqk) ipChange.ipc$dispatch("7d209869", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.b.setVisibility(0);
            this.b.setText(str);
        } else {
            this.b.setVisibility(8);
        }
        return this;
    }

    public pqk a(String str, final View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pqk) ipChange.ipc$dispatch("f6c02095", new Object[]{this, str, onClickListener});
        }
        this.c.setVisibility(0);
        this.c.setText(str);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: tb.pqk.1
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
                pqk.this.dismiss();
            }
        });
        return this;
    }

    public pqk b(String str, final View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pqk) ipChange.ipc$dispatch("447f9896", new Object[]{this, str, onClickListener});
        }
        this.d.setVisibility(0);
        this.d.setText(str);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: tb.pqk.2
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
                pqk.this.dismiss();
            }
        });
        return this;
    }
}
