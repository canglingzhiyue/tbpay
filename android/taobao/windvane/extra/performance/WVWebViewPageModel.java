package android.taobao.windvane.extra.performance;

import android.taobao.windvane.config.j;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.dqn;
import tb.kge;

/* loaded from: classes2.dex */
public class WVWebViewPageModel implements dqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<dqn> mWebViewPageModelList = new CopyOnWriteArrayList();
    private final ConcurrentHashMap<String, Long> stageMap = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Object> propertyMap = new ConcurrentHashMap<>();

    static {
        kge.a(-1403523422);
        kge.a(-966459203);
    }

    @Override // tb.dqn
    public void onStage(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
            return;
        }
        this.stageMap.put(str, Long.valueOf(j));
        for (dqn dqnVar : this.mWebViewPageModelList) {
            dqnVar.onStage(str, j);
        }
    }

    @Override // tb.dqn
    public void onProperty(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1991a501", new Object[]{this, str, obj});
            return;
        }
        this.propertyMap.put(str, obj);
        for (dqn dqnVar : this.mWebViewPageModelList) {
            dqnVar.onProperty(str, obj);
        }
    }

    public ConcurrentHashMap<String, Long> getStageMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("9666c20b", new Object[]{this}) : this.stageMap;
    }

    public ConcurrentHashMap<String, Object> getPropertyMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("6aad66ce", new Object[]{this}) : this.propertyMap;
    }

    public void addWebViewPageModel(dqn dqnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb98458", new Object[]{this, dqnVar});
            return;
        }
        if (j.commonConfig.cT) {
            try {
                for (String str : this.stageMap.keySet()) {
                    dqnVar.onStage(str, this.stageMap.get(str).longValue());
                }
                for (String str2 : this.propertyMap.keySet()) {
                    dqnVar.onProperty(str2, this.propertyMap.get(str2));
                }
            } catch (Exception e) {
                e.a(RVLLevel.Error, "WVWebViewPageModel.addWebViewPageModel error: ", e.getMessage());
            }
        }
        this.mWebViewPageModelList.add(dqnVar);
    }

    @Override // tb.dqn
    public void onStageIfAbsent(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2a227e", new Object[]{this, str, new Long(j)});
        } else if (!this.stageMap.containsKey(str)) {
            this.stageMap.put(str, Long.valueOf(j));
            for (dqn dqnVar : this.mWebViewPageModelList) {
                dqnVar.onStageIfAbsent(str, j);
            }
        }
    }

    @Override // tb.dqn
    public void onPropertyIfAbsent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564eb9d7", new Object[]{this, str, obj});
        } else if (!this.propertyMap.containsKey(str)) {
            this.propertyMap.put(str, obj);
            for (dqn dqnVar : this.mWebViewPageModelList) {
                dqnVar.onPropertyIfAbsent(str, obj);
            }
        }
    }
}
