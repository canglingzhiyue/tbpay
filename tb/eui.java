package tb;

import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.f;
import com.taobao.android.ultron.common.model.b;

/* loaded from: classes4.dex */
public class eui extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public f f27578a;

    public eui(f fVar) {
        this.f27578a = fVar;
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(e eVar) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        b b = b();
        if (b == null || (fields = b.getFields()) == null) {
            return;
        }
        String string = fields.getString("locator");
        f fVar = this.f27578a;
        if (fVar == null) {
            return;
        }
        fVar.a(string);
    }
}
