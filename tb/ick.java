package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.b;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.android.preload.e;
import com.taobao.android.preload.f;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class ick {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, CopyOnWriteArrayList<PreloadTaskEntity.a>>> f28904a = new ConcurrentHashMap<>();

    public void a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e007018", new Object[]{this, str, bVar});
            return;
        }
        f.b(e.a("PreloadTaskDataSource"), "更新数据源列表");
        PreloadTaskEntity parser = PreloadTaskEntity.parser(str, bVar);
        if (StringUtils.isEmpty(parser.sourceFrom)) {
            f.a(e.a("PreloadTaskDataSource"), "sourceFrom is null");
            return;
        }
        ArrayList<PreloadTaskEntity.a> arrayList = parser.items;
        if (arrayList == null || arrayList.isEmpty()) {
            f.a(e.a("PreloadTaskDataSource"), "preloadTaskEntity items is null");
            return;
        }
        String str2 = parser.pageIndex;
        if (StringUtils.isEmpty(str2)) {
            f.a(e.a("PreloadTaskDataSource"), "preloadTaskEntity pageIndex is null");
            return;
        }
        String a2 = a(parser);
        ConcurrentHashMap<String, CopyOnWriteArrayList<PreloadTaskEntity.a>> concurrentHashMap = this.f28904a.get(a2);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        CopyOnWriteArrayList<PreloadTaskEntity.a> copyOnWriteArrayList = concurrentHashMap.get(str2);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        copyOnWriteArrayList.addAll(arrayList);
        concurrentHashMap.put(str2, copyOnWriteArrayList);
        this.f28904a.put(a2, concurrentHashMap);
    }

    public void b(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3b2199", new Object[]{this, str, bVar});
            return;
        }
        f.b(e.a("PreloadTaskDataSource"), "清理数据源列表");
        PreloadTaskEntity parser = PreloadTaskEntity.parser(str, bVar);
        if (StringUtils.isEmpty(parser.sourceFrom)) {
            f.a(e.a("PreloadTaskDataSource"), "sourceFrom is null");
        } else if (StringUtils.isEmpty(parser.pageToken)) {
            f.a(e.a("PreloadTaskDataSource"), "pageToken  is null");
        } else {
            b(a(parser));
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        for (Map.Entry<String, ConcurrentHashMap<String, CopyOnWriteArrayList<PreloadTaskEntity.a>>> entry : this.f28904a.entrySet()) {
            String key = entry.getKey();
            if (key.contains(str)) {
                ConcurrentHashMap<String, CopyOnWriteArrayList<PreloadTaskEntity.a>> value = entry.getValue();
                this.f28904a.remove(key);
                if (value != null) {
                    value.clear();
                }
            }
        }
    }

    public String a(PreloadTaskEntity preloadTaskEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4051d4a7", new Object[]{this, preloadTaskEntity});
        }
        return preloadTaskEntity.sourceFrom + preloadTaskEntity.pageToken;
    }

    public CopyOnWriteArrayList<PreloadTaskEntity.a> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("795c90df", new Object[]{this, str});
        }
        CopyOnWriteArrayList<PreloadTaskEntity.a> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        ConcurrentHashMap<String, CopyOnWriteArrayList<PreloadTaskEntity.a>> concurrentHashMap = this.f28904a.get(str);
        if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
            for (Map.Entry<String, CopyOnWriteArrayList<PreloadTaskEntity.a>> entry : concurrentHashMap.entrySet()) {
                CopyOnWriteArrayList<PreloadTaskEntity.a> value = entry.getValue();
                if (value != null) {
                    copyOnWriteArrayList.addAll(value);
                }
            }
        }
        return copyOnWriteArrayList;
    }
}
