package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;

/* loaded from: classes6.dex */
public class ita extends itd<Object, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1338376188);
    }

    @Override // tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "BlankCellViewHolder";
    }

    @Override // tb.itd
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
        }
    }

    public ita(Activity activity, ium iumVar, ListStyle listStyle, int i) {
        super(a((Context) activity), activity, iumVar, listStyle, i, null);
    }

    private static View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{context});
        }
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return view;
    }
}
