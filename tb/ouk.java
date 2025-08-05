package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.handler.worker.c;
import com.taobao.tao.util.BitmapUtil;

/* loaded from: classes8.dex */
public abstract class ouk implements ouj<oui> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f32433a;
    public c b;

    static {
        kge.a(161344275);
        kge.a(1547584775);
    }

    public ouk(Context context) {
        this.f32433a = context.getApplicationContext();
    }

    public Bitmap a(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("99351448", new Object[]{this, view}) : BitmapUtil.createViewBitmap(view);
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        c cVar = this.b;
        return cVar == null ? "" : cVar.a();
    }
}
