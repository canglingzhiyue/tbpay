package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbreachflow.shortcuts.bean.ContentMapVO;
import com.taobao.tbreachflow.shortcuts.bean.ContentVO;
import com.taobao.tbreachflow.shortcuts.bean.ModuleVO;
import com.taobao.tbreachflow.shortcuts.bean.ShortcutsVO;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class qoi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private khf f32985a;

    public void a(khf khfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f114638f", new Object[]{this, khfVar});
            return;
        }
        this.f32985a = khfVar;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("android_default");
        khd.a().a("shortcuts", arrayList, null, this.f32985a);
    }

    public ContentVO a(String str) {
        ContentMapVO contentMap;
        ShortcutsVO shortcuts;
        List<ContentVO> content;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentVO) ipChange.ipc$dispatch("a40a717f", new Object[]{this, str});
        }
        try {
            ModuleVO moduleVO = (ModuleVO) JSONObject.parseObject(str, ModuleVO.class);
            if (moduleVO != null && (contentMap = moduleVO.getContentMap()) != null && (shortcuts = contentMap.getShortcuts()) != null && (content = shortcuts.getContent()) != null && !content.isEmpty()) {
                return content.get(0);
            }
            return null;
        } catch (Exception e) {
            qif.a("convertJsonToModel: parseObject error -> " + e.getMessage());
            return null;
        }
    }
}
