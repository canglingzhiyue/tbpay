package com.taobao.mrt.task;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static g f18258a;
    private ConcurrentHashMap<Object, MRTTaskDescription> b = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, com.taobao.mrt.thread.d> c = new ConcurrentHashMap<>();
    private Set<String> d = Collections.synchronizedSet(new HashSet());
    private ConcurrentHashMap<Long, HashMap<String, String>> f = new ConcurrentHashMap<>();
    private com.taobao.mrt.d e = null;

    static {
        kge.a(646685544);
        f18258a = new g();
    }

    private g() {
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        long id = Thread.currentThread().getId();
        HashMap<String, String> hashMap = this.f.get(Long.valueOf(id));
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.f.put(Long.valueOf(id), hashMap);
        }
        hashMap.put(str, str2);
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        HashMap<String, String> hashMap = this.f.get(Long.valueOf(Thread.currentThread().getId()));
        if (hashMap == null) {
            return;
        }
        hashMap.remove(str);
    }

    public String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{this, str});
        }
        HashMap<String, String> hashMap = this.f.get(Long.valueOf(Thread.currentThread().getId()));
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(str);
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("497c74a9", new Object[0]) : f18258a;
    }

    public void a(String str, String str2, List<Object> list, boolean z, String str3, h hVar, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d704b0", new Object[]{this, str, str2, list, new Boolean(z), str3, hVar, iVar});
        } else {
            a(str, str2, list, z, str3, hVar, iVar, null);
        }
    }

    public void a(String str, String str2, List<Object> list, boolean z, String str3, h hVar, i iVar, Map<String, Map<String, Object>> map) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ae0d5", new Object[]{this, str, str2, list, new Boolean(z), str3, hVar, iVar, map});
        } else if (a.f18251a != null && a.f18251a.a(str, str2, list, iVar, hVar)) {
        } else {
            com.taobao.mrt.utils.a.g("TaskManager", "任务触发:" + str);
            if (!com.taobao.mrt.c.a()) {
                a(str, iVar, 1, "mrt is not available", null);
            } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str3)) {
                a(str, iVar, 201, "Invalid Param", null);
            } else if (com.taobao.mrt.thread.c.a().b(str) == MRTJobRefuseReason.MRTJobRefuseReasonBug) {
                com.taobao.mrt.utils.a.c("TaskManager", "Skip Buggy Model:" + str);
                a(str, iVar, 1001, "Task cancelled because of timeslot exhaust", null);
            } else {
                MRTTaskDescription b = b(str);
                if (b == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid Task Name");
                    sb.append(com.taobao.mrt.c.b ? " Y" : " N");
                    a(str, iVar, 201, sb.toString(), null);
                    return;
                }
                com.taobao.mrt.thread.d dVar = null;
                if (b != null) {
                    dVar = this.c.get(str3);
                }
                if (dVar == null) {
                    a(str, iVar, 1001, "Task cancelled because of thread exhaust", null);
                } else if (dVar.a()) {
                    com.taobao.mrt.utils.a.c("TaskManager", ":All Threads Used. Model: " + str + " is Rejected");
                    a(str, iVar, 1001, "Task cancelled because of thread exhaust", null);
                } else {
                    com.taobao.mrt.d dVar2 = this.e;
                    if (dVar2 != null) {
                        if (!dVar2.f18245a) {
                            a(str, iVar, 83, "", null);
                            return;
                        }
                        if (dVar2.e != null && dVar2.e.size() > 0) {
                            z2 = !dVar2.e.contains(str);
                        }
                        if (!z2 && dVar2.d != null) {
                            z2 = dVar2.d.contains(str);
                        }
                        if (z2) {
                            a(str, iVar, 84, null, null);
                            return;
                        }
                    }
                    dVar.a(new f(b, iVar, str2, list, z, hVar, map));
                }
            }
        }
    }

    public void a(MRTTaskDescription mRTTaskDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c1480a", new Object[]{this, mRTTaskDescription});
        } else if (mRTTaskDescription == null) {
        } else {
            com.taobao.mrt.d dVar = this.e;
            if ((dVar != null && dVar.b) || StringUtils.isEmpty(mRTTaskDescription.name)) {
                return;
            }
            this.b.put(mRTTaskDescription.name, mRTTaskDescription);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.b.remove(str);
        }
    }

    public MRTTaskDescription b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MRTTaskDescription) ipChange.ipc$dispatch("82dee595", new Object[]{this, str}) : this.b.get(str);
    }

    public void a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.c.put(str, new com.taobao.mrt.thread.d(i, i2, str));
        }
    }

    public void a(com.taobao.mrt.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5578d846", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            this.e = dVar;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.d.add(str);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.d.remove(str);
        }
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue() : this.d.contains(str);
    }

    private void a(String str, i iVar, int i, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b24f0ec", new Object[]{this, str, iVar, new Integer(i), str2, obj});
            return;
        }
        com.taobao.mrt.utils.a.g("TaskManager", "任务结束:" + str + ",code:" + i + ",msg:" + str2);
        if (iVar == null) {
            return;
        }
        iVar.onCompletion(i, new MRTRuntimeException(i, str2), obj);
    }
}
