package tb;

import android.content.Context;
import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.s;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.mnncv.MNNCV;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class gwx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME_DUP_IMAGE = "dup_image_detector";
    public static final String MODULE_NAME_FRAME_SCORE = "guangguang_frame_score";
    public static final String MODULE_NAME_FRAME_SCORE_INFERIOR = "guangguang_frame_inferior";

    static {
        kge.a(622195301);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : s.b() && b();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : MNNCV.isAvailable();
    }

    public List<Integer> a(List<Bitmap> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        List<Integer> arrayList = new ArrayList<>();
        gxb gxbVar = new gxb();
        if (gxbVar.a((Context) Globals.getApplication())) {
            arrayList = gxbVar.a((gxb) list);
            u.b("LcMNN", "execDetector: " + arrayList);
        }
        gxbVar.d();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public static void a(gxd gxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb219065", new Object[]{gxdVar});
        } else {
            gxc.a(gxdVar);
        }
    }
}
