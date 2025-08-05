package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.taolive.room.utils.d;

/* loaded from: classes8.dex */
public class sgn implements sgq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(184732692);
        kge.a(-1207877784);
    }

    @Override // tb.sgq
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : psm.z();
    }

    @Override // tb.sgq
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : context != null && a() && l.b(context);
    }

    @Override // tb.sgq
    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue() : context != null && Build.VERSION.SDK_INT >= 19 && a() && l.d(context);
    }

    @Override // tb.sgq
    public int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{this, context})).intValue();
        }
        int a2 = d.a(context, 375.0f);
        if (context == null || !a()) {
            return a2;
        }
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int i2 = context.getResources().getDisplayMetrics().heightPixels;
        int i3 = (int) ((i > i2 ? i2 : i) * 0.5f);
        return i3 < a2 ? a2 : i3;
    }

    @Override // tb.sgq
    public int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0236730", new Object[]{this, context})).intValue();
        }
        if (context != null && a()) {
            return (int) (context.getResources().getDisplayMetrics().heightPixels * 0.725f);
        }
        return 0;
    }

    @Override // tb.sgq
    public boolean e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{this, context})).booleanValue() : a() && sgo.a().a(context);
    }

    @Override // tb.sgq
    public boolean f(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{this, context})).booleanValue() : a() && (a(context) || (b(context) && e(context)));
    }

    @Override // tb.sgq
    public boolean g(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{this, context})).booleanValue() : a() && (a(context) || b(context)) && e(context);
    }

    @Override // tb.sgq
    public boolean h(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2d615bd", new Object[]{this, context})).booleanValue() : context != null && a() && e(context) && b(context);
    }

    @Override // tb.sgq
    public void a(sgr sgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb2857a", new Object[]{this, sgrVar});
        } else {
            sgo.a().a(sgrVar);
        }
    }

    @Override // tb.sgq
    public void b(sgr sgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed358bfb", new Object[]{this, sgrVar});
        } else {
            sgo.a().b(sgrVar);
        }
    }
}
