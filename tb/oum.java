package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes8.dex */
public class oum extends ouk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View c;

    static {
        kge.a(295488045);
    }

    public static /* synthetic */ Object ipc$super(oum oumVar, String str, Object... objArr) {
        if (str.hashCode() == -1724574648) {
            return super.a((View) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ouj
    public Bitmap b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e5c3e7c7", new Object[]{this});
        }
        return null;
    }

    public oum(Context context) {
        super(context);
    }

    @Override // tb.ouj
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        this.c = LayoutInflater.from(context).inflate(R.layout.share_base_layout, (ViewGroup) null);
        return this.c;
    }

    @Override // tb.ouj
    public Bitmap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("bc740346", new Object[]{this}) : super.a(this.c);
    }
}
