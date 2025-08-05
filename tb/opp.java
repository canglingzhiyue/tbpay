package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes.dex */
public class opp implements a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f32263a;

    static {
        kge.a(1862935582);
        kge.a(-1129696407);
    }

    @Override // com.taobao.android.tschedule.parser.a.b
    public String b(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5273f964", new Object[]{this, context, intent});
        }
        if (intent == null) {
            return String.valueOf(false);
        }
        return String.valueOf(a(intent));
    }

    private boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        int a2 = a();
        int b = opt.b(ksk.REC_CART.f30287a);
        if (a(data)) {
            return a(a2, b);
        }
        return a2 <= b;
    }

    private int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        JSONObject a2 = opq.a(ksk.REC_CART.f30287a);
        if (a2 == null) {
            lap.a("recmdPrefetch", "ShoppingCartRecmdPrefetchParser", "sceneInfo == null");
            return 0;
        }
        return a2.getIntValue("count");
    }

    private boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!f32263a) {
            f32263a = true;
            if (i <= i2) {
                return true;
            }
        }
        return false;
    }

    private boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{this, uri})).booleanValue() : "/awp/base/newcart.htm".equals(uri.getPath());
    }
}
