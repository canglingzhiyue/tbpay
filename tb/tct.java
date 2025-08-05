package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class tct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1729542609);
    }

    public static void a(Map<String, ?> map, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae1ec4f", new Object[]{map, outputStream});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            arrayList.add(new tcm(entry.getKey()));
            if (value instanceof Boolean) {
                arrayList.add(new tbp(((Boolean) value).booleanValue()));
            } else if (value instanceof Integer) {
                arrayList.add(new tcg(((Integer) value).intValue()));
            } else if (value instanceof Float) {
                arrayList.add(new tcf(((Float) value).floatValue()));
            } else if (value instanceof Long) {
                arrayList.add(new tch(((Long) value).longValue()));
            } else if (value instanceof String) {
                arrayList.add(new tcm((String) value));
            } else if (value instanceof Set) {
                arrayList.add(new tcn((Set) value));
            } else {
                throw new IllegalArgumentException();
            }
        }
        new tcl(new Date(), arrayList).a(outputStream);
    }

    public static Map<String, ?> a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b928ffd4", new Object[]{file}) : tcj.a(new qrl(file));
    }
}
