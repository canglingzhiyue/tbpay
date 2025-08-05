package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.s;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.mnncv.MNNCVImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/* loaded from: classes5.dex */
public class gxb extends gxa<List<Bitmap>, List<Integer>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1862023346);
    }

    public static /* synthetic */ Object ipc$super(gxb gxbVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.gxa
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : gwx.MODULE_NAME_DUP_IMAGE;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List<java.lang.Integer>, java.lang.Object] */
    @Override // tb.gxa
    public /* synthetic */ List<Integer> b(List<Bitmap> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, list}) : a(list);
    }

    public List<Integer> a(List<Bitmap> list) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        if (list == null || list.size() <= 0) {
            d();
            a(false);
            return null;
        }
        HashMap hashMap = new HashMap();
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        Vector vector4 = new Vector();
        int e = s.e();
        for (Bitmap bitmap : list) {
            if (bitmap != null) {
                vector.add(new MNNCVImage(bitmap));
                vector2.add(Integer.valueOf(e));
                vector3.add(Integer.valueOf(bitmap.getWidth()));
                vector4.add(Integer.valueOf(bitmap.getHeight()));
            }
        }
        hashMap.put("_format_list", vector2);
        hashMap.put("_image_list", vector);
        hashMap.put("_image_width_list", vector3);
        hashMap.put("_image_height_list", vector4);
        hashMap.put("_threshold", Float.valueOf(f()));
        Map<String, Object> a2 = this.f28549a.a(hashMap);
        u.b("LCMNN.DuplicateDetector", a() + " process result: " + a2);
        List<Integer> arrayList = new ArrayList<>();
        if (a2 != null && a2.containsKey("image_index")) {
            Object obj = a2.get("image_index");
            if (obj instanceof ArrayList) {
                ArrayList arrayList2 = (ArrayList) obj;
                if (arrayList2.size() > 0 && (arrayList2.get(0) instanceof Integer)) {
                    arrayList = (List) obj;
                }
            }
        }
        if (a2 == null) {
            z = false;
        }
        a(z);
        return arrayList;
    }

    private float f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue() : s.a(0.1f);
    }
}
