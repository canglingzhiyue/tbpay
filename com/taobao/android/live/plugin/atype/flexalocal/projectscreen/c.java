package com.taobao.android.live.plugin.atype.flexalocal.projectscreen;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.ProjectScreenResult;
import com.taobao.taobaoavsdk.dlna.DLNADeviceInfo;
import com.taobao.taobaoavsdk.dlna.DLNAManager;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.LinkedList;
import tb.hjx;
import tb.hjy;
import tb.hkk;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f13986a;
    private DLNADeviceInfo b;
    private long c = -1;

    static {
        kge.a(-1200314402);
    }

    private c() {
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("709b92cc", new Object[0]);
        }
        if (f13986a == null) {
            synchronized (c.class) {
                if (f13986a == null) {
                    f13986a = new c();
                }
            }
        }
        return f13986a;
    }

    public DLNADeviceInfo b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DLNADeviceInfo) ipChange.ipc$dispatch("9710e814", new Object[]{this}) : this.b;
    }

    public void a(DLNADeviceInfo dLNADeviceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6134f3af", new Object[]{this, dLNADeviceInfo});
        } else {
            this.b = dLNADeviceInfo;
        }
    }

    public void a(final hjx hjxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1a3762", new Object[]{this, hjxVar});
        } else {
            DLNAManager.getInstance().searchProjectionScreenDevice(new DLNAManager.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taobaoavsdk.dlna.DLNAManager.a
                public void a(LinkedList<DLNADeviceInfo> linkedList) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6098cdc0", new Object[]{this, linkedList});
                    } else if (hjxVar == null) {
                    } else {
                        com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.b bVar = new com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.b();
                        bVar.a(linkedList);
                        bVar.a(true);
                        hjxVar.onProjectScreenSearchDevice(bVar);
                    }
                }

                @Override // com.taobao.taobaoavsdk.dlna.DLNAManager.a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    } else if (hjxVar == null) {
                    } else {
                        com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.b bVar = new com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model.b();
                        bVar.a(false);
                        hjxVar.onProjectScreenSearchDevice(bVar);
                    }
                }
            });
        }
    }

    public void a(final DLNADeviceInfo dLNADeviceInfo, VideoInfo.ProjectScreenInfo projectScreenInfo, final hjy hjyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4add7848", new Object[]{this, dLNADeviceInfo, projectScreenInfo, hjyVar});
        } else if (dLNADeviceInfo == null || projectScreenInfo == null) {
        } else {
            if (a().b() != null) {
                c();
            }
            String str = projectScreenInfo.projectScreenPlayUrl;
            String str2 = projectScreenInfo.projectScreenPlayUrlBackup;
            HashMap<String, String> hashMap = new HashMap<>();
            if (hkk.i()) {
                str = str2;
            }
            hashMap.put("projectScreenPlayUrl", str);
            hashMap.put("projectScreenPlayUrlBackup", str2);
            DLNAManager.getInstance().startProjectScreenToDevice(dLNADeviceInfo, hashMap, new DLNAManager.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.projectscreen.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taobaoavsdk.dlna.DLNAManager.b
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    } else if (hjyVar == null) {
                    } else {
                        ProjectScreenResult projectScreenResult = new ProjectScreenResult();
                        projectScreenResult.a(i);
                        projectScreenResult.a(dLNADeviceInfo);
                        hjyVar.onStartProjectScreen(projectScreenResult);
                    }
                }
            });
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a((DLNADeviceInfo) null);
        DLNAManager.getInstance().stopProjectScreenToDevice(null);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            DLNAManager.getInstance().release();
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("playToken", str);
        hashMap.put("accountId", str2);
        hashMap.put("playScenario", str3);
        hashMap.put("feedId", str4);
        hashMap.put("subBusinessType", str5);
        DLNAManager.getInstance().updateStat(hashMap);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.c = System.currentTimeMillis();
        }
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        String str = "0";
        if (this.c == -1) {
            return str;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.c;
        if (currentTimeMillis > j) {
            str = Long.toString(currentTimeMillis - j);
        }
        this.c = -1L;
        return str;
    }
}
