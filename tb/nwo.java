package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.datasource.c;
import tb.isu;

/* loaded from: classes8.dex */
public class nwo extends ris {
    static {
        kge.a(1955514820);
    }

    public nwo(Context context, final c cVar) {
        super(context, "allitems_inShop_channel", new rir() { // from class: tb.nwo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rir
            public void a(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                } else if (!(obj instanceof JSONObject) || !"true".equals(((JSONObject) obj).getString("gotoTop"))) {
                } else {
                    c.this.postEvent(isu.a.a());
                }
            }
        });
    }
}
