package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class coz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static coq f26369a;

    static {
        kge.a(-1576864072);
    }

    public static boolean a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acc0f2ca", new Object[]{bitmap})).booleanValue();
        }
        coq coqVar = f26369a;
        return (coqVar == null || bitmap == null || !coqVar.a(bitmap)) ? false : true;
    }

    public static String b(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a8a4cdb", new Object[]{bitmap});
        }
        coq coqVar = f26369a;
        if (coqVar != null && bitmap != null) {
            return coqVar.b(bitmap);
        }
        return null;
    }

    public static void a(coq coqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3d54333", new Object[]{coqVar});
        } else {
            f26369a = coqVar;
        }
    }
}
