package tb;

import android.support.v7.widget.RecyclerView;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.atn;

/* loaded from: classes2.dex */
public class auq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-289222561);
    }

    public static void a(RecyclerView.ViewHolder viewHolder) {
        AURARenderComponent a2;
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6090f25", new Object[]{viewHolder});
        } else if (!(viewHolder instanceof atn.a) || (a2 = ((atn.a) viewHolder).a()) == null || (aURARenderComponentData = a2.data) == null) {
        } else {
            Map map = aURARenderComponentData.fields;
            if (map == null) {
                map = new HashMap();
            }
            map.put("asyncStatus", "init");
        }
    }
}
