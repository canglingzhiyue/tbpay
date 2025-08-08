package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.e;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.performance.preload.core.task.PreloadTaskEntity;
import com.taobao.android.detail.core.utils.i;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class eiv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, CopyOnWriteArrayList<PreloadTaskEntity.a>>> f27334a = new ConcurrentHashMap<>();

    static {
        kge.a(169145453);
    }

    public eiv() {
        emu.a("com.taobao.android.detail.core.performance.preload.core.PreloadTaskDataSource");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        i.c(l.a("PreloadTaskDataSource"), "更新数据源列表");
        PreloadTaskEntity parser = PreloadTaskEntity.parser(str);
        String str2 = parser.sourceFrom;
        if (StringUtils.isEmpty(str2)) {
            i.a(l.a("PreloadTaskDataSource"), "sourceFrom is null");
        } else if (!e.a(str2)) {
            i.a(l.a("PreloadTaskDataSource"), "detailOpt is unEnable");
        } else {
            ArrayList<PreloadTaskEntity.a> arrayList = parser.items;
            if (arrayList == null || arrayList.isEmpty()) {
                i.a(l.a("PreloadTaskDataSource"), "preloadTaskEntity items is null");
                return;
            }
            String str3 = parser.pageIndex;
            if (StringUtils.isEmpty(str3)) {
                i.a(l.a("PreloadTaskDataSource"), "preloadTaskEntity pageIndex is null");
                return;
            }
            String a2 = a(parser);
            ConcurrentHashMap<String, CopyOnWriteArrayList<PreloadTaskEntity.a>> concurrentHashMap = this.f27334a.get(a2);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
            }
            CopyOnWriteArrayList<PreloadTaskEntity.a> copyOnWriteArrayList = concurrentHashMap.get(str3);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            }
            copyOnWriteArrayList.addAll(arrayList);
            concurrentHashMap.put(str3, copyOnWriteArrayList);
            this.f27334a.put(a2, concurrentHashMap);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        i.c(l.a("PreloadTaskDataSource"), "清理数据源列表");
        PreloadTaskEntity parser = PreloadTaskEntity.parser(str);
        String str2 = parser.sourceFrom;
        if (StringUtils.isEmpty(str2)) {
            i.a(l.a("PreloadTaskDataSource"), "sourceFrom is null");
        } else if (StringUtils.isEmpty(parser.pageToken)) {
            i.a(l.a("PreloadTaskDataSource"), "pageToken  is null");
        } else if (!e.a(str2)) {
            i.a(l.a("PreloadTaskDataSource"), "detailOpt is unEnable");
        } else {
            d(a(parser));
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        for (Map.Entry<String, ConcurrentHashMap<String, CopyOnWriteArrayList<PreloadTaskEntity.a>>> entry : this.f27334a.entrySet()) {
            String key = entry.getKey();
            if (key.contains(str)) {
                ConcurrentHashMap<String, CopyOnWriteArrayList<PreloadTaskEntity.a>> value = entry.getValue();
                this.f27334a.remove(key);
                if (value != null) {
                    value.clear();
                }
            }
        }
    }

    public String a(PreloadTaskEntity preloadTaskEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1173db56", new Object[]{this, preloadTaskEntity});
        }
        return preloadTaskEntity.sourceFrom + preloadTaskEntity.pageToken;
    }

    public CopyOnWriteArrayList<PreloadTaskEntity.a> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("14db80e1", new Object[]{this, str});
        }
        CopyOnWriteArrayList<PreloadTaskEntity.a> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        ConcurrentHashMap<String, CopyOnWriteArrayList<PreloadTaskEntity.a>> concurrentHashMap = this.f27334a.get(str);
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
