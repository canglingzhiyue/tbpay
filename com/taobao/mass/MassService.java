package com.taobao.mass;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.kge;

/* loaded from: classes7.dex */
public class MassService implements IMassService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private static volatile MassService instance;
    private HashMap<String, Set<String>> topicMap = new HashMap<>();

    static {
        kge.a(-919427431);
        kge.a(-1662534016);
        TAG = MassService.class.getSimpleName();
    }

    public static MassService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MassService) ipChange.ipc$dispatch("b6fa29ca", new Object[0]);
        }
        if (instance == null) {
            synchronized (MassClient.class) {
                if (instance == null) {
                    instance = new MassService();
                }
            }
        }
        return instance;
    }

    @Override // com.taobao.mass.IMassService
    public void registerTopic(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba126267", new Object[]{this, str, str2});
            return;
        }
        ALog.i(TAG, "registerTopic", "topic", str2);
        Set<String> set = this.topicMap.get(str);
        if (set == null) {
            set = new HashSet<>();
            this.topicMap.put(str, set);
        }
        if (set.contains(str2)) {
            return;
        }
        set.add(str2);
    }

    private MassService() {
    }

    @Override // com.taobao.mass.IMassService
    public void unregisterTopic(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56dc16e", new Object[]{this, str, str2});
            return;
        }
        ALog.i(TAG, "unregisterTopic", "topic", str2);
        Set<String> set = this.topicMap.get(str);
        if (set == null) {
            return;
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str2)) {
                ALog.i(TAG, "unregisterTopic remove success", "topic", str2);
                it.remove();
            }
        }
    }

    @Override // com.taobao.mass.IMassService
    public List<String> getTopicsByService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b740deb2", new Object[]{this, str});
        }
        Set<String> set = this.topicMap.get(str);
        return set == null ? Collections.emptyList() : new ArrayList(set);
    }
}
