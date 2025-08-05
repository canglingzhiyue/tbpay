package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.m;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.c;
import com.taobao.tao.flexbox.layoutmanager.core.f;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class tqu extends c.a<TNodeRecyclerView, m.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-501655947);
    }

    public static /* synthetic */ Object ipc$super(tqu tquVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.c
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.c
    public void a(f fVar, TNodeRecyclerView tNodeRecyclerView, m.b bVar, aa.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dcdf55", new Object[]{this, fVar, tNodeRecyclerView, bVar, dVar});
        } else if (!(fVar instanceof m)) {
        } else {
            a((m) fVar);
        }
    }

    public void a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc08b925", new Object[]{this, mVar});
        } else if (mVar != null && mVar.r() != null) {
            try {
                for (Map.Entry<String, String> entry : a(mVar.getNode()).entrySet()) {
                    mVar.r().putExtra(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                ogg.a("RecordAttributeHandler", "updateExtra error" + th.getMessage());
            }
        }
    }

    private Map<String, String> a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("608c7685", new Object[]{this, aaVar});
        }
        HashMap hashMap = new HashMap();
        String a2 = oec.a(aaVar.e(sjx.KEY_RECORD_EXTRA), (String) null);
        if (!TextUtils.isEmpty(a2)) {
            for (String str : a2.split(";")) {
                String[] split = str.split(":");
                if (split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return hashMap;
    }
}
