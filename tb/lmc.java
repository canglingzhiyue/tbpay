package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.l;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import java.util.Map;

/* loaded from: classes.dex */
public class lmc implements l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1414898804);
        kge.a(-752328013);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.l
    public void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{this, obj, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, map);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.l
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.l
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(str);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.l
    public void a(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc66733", new Object[]{this, str, map, map2, map3});
        } else {
            UTAnalytics.getInstance().getUTSceneTracker().beginScene(str, map, map2, map3);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.l
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            UTAnalytics.getInstance().getUTSceneTracker().endScene(str);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.l
    public void a(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c357439", new Object[]{this, str, new Integer(i), str2, str3, str4, str5});
        } else {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, str5);
        }
    }
}
