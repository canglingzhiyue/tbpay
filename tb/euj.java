package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.f;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes4.dex */
public class euj extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public f f27579a;

    public euj(f fVar) {
        this.f27579a = fVar;
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(e eVar) {
        List<IDMComponent> children;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        IDMComponent i = this.f27579a.i();
        if (i != null && (children = i.getChildren()) != null && children.size() > 0) {
            for (IDMComponent iDMComponent : children) {
                JSONObject fields = iDMComponent.getFields();
                if (fields != null && TextUtils.equals(fields.getString("imageType"), "apng")) {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return;
        }
        this.f27579a.j().a(i);
    }
}
