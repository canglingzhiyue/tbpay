package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.monitor.config.a;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/* loaded from: classes4.dex */
public class gtt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int b = a.a().b().getMaxFilesSize();

    /* renamed from: a  reason: collision with root package name */
    private final PriorityQueue<com.taobao.android.cachecleaner.monitor.info.node.a> f28450a = new PriorityQueue<>(this.b, Collections.reverseOrder());

    static {
        kge.a(-2105235851);
    }

    public void a(com.taobao.android.cachecleaner.monitor.info.node.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e294b0c1", new Object[]{this, aVar});
            return;
        }
        try {
            if (this.f28450a.size() < this.b) {
                this.f28450a.add(aVar);
            } else if (this.f28450a.peek() == null || aVar.getSize() <= this.f28450a.peek().getSize()) {
            } else {
                this.f28450a.poll();
                this.f28450a.add(aVar);
            }
        } catch (Exception e) {
            TLog.loge(CacheCleaner.MODULE, "SortFileList", "add Error ->" + e);
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f28450a.size();
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        HashMap hashMap = new HashMap(4);
        PriorityQueue<com.taobao.android.cachecleaner.monitor.info.node.a> priorityQueue = this.f28450a;
        if (priorityQueue != null && priorityQueue.size() != 0) {
            Iterator<com.taobao.android.cachecleaner.monitor.info.node.a> it = this.f28450a.iterator();
            while (it.hasNext()) {
                com.taobao.android.cachecleaner.monitor.info.node.a next = it.next();
                if (next.getName() != null) {
                    hashMap.put(next.getName(), next.path());
                }
            }
        }
        return hashMap;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        try {
            return JSON.toJSONString(new ArrayList(this.f28450a));
        } catch (Exception e) {
            TLog.loge(CacheCleaner.MODULE, "SortFileList", "toJsonString Error ->" + e);
            return "";
        }
    }
}
