package com.taobao.runtimepermission;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsPermissionAbility;
import com.taobao.android.abilityidl.ability.PermissionRequestPermissionEvent;
import com.taobao.android.abilityidl.ability.PermissionResult;
import com.taobao.android.abilityidl.ability.cg;
import com.taobao.android.abilityidl.ability.ch;
import com.taobao.android.abilityidl.ability.ci;
import com.taobao.android.abilityidl.ability.dq;
import com.taobao.android.abilityidl.ability.dr;
import com.taobao.android.abilityidl.ability.ds;
import com.taobao.runtimepermission.group.e;
import java.util.HashMap;
import tb.als;
import tb.nml;

/* loaded from: classes7.dex */
public class MegaPermissionAbility extends AbsPermissionAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ PermissionResult a(com.taobao.runtimepermission.group.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PermissionResult) ipChange.ipc$dispatch("a32e73a1", new Object[]{dVar}) : b(dVar);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPermissionAbility
    public void check(als alsVar, dq dqVar, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5987f0", new Object[]{this, alsVar, dqVar, cgVar});
            return;
        }
        String[] strArr = null;
        Context f = alsVar.b() == null ? null : alsVar.b().f();
        if (dqVar.f8822a != null) {
            strArr = (String[]) dqVar.f8822a.toArray(new String[0]);
        }
        com.taobao.runtimepermission.group.d a2 = com.taobao.runtimepermission.group.e.a(f, dqVar.b, strArr);
        if (a2.f18993a) {
            cgVar.a(b(a2));
        } else {
            cgVar.a(new ErrorResult(a2.c, a2.d));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPermissionAbility
    public void request(als alsVar, dr drVar, final ch chVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74bd0375", new Object[]{this, alsVar, drVar, chVar});
            return;
        }
        String[] strArr = null;
        Context f = alsVar.b() == null ? null : alsVar.b().f();
        if (drVar.f8823a != null) {
            strArr = (String[]) drVar.f8823a.toArray(new String[0]);
        }
        com.taobao.runtimepermission.group.c cVar = new com.taobao.runtimepermission.group.c();
        cVar.f18992a = f;
        cVar.b = strArr;
        cVar.c = drVar.b;
        cVar.d = drVar.c;
        cVar.g = drVar.d;
        cVar.e = true;
        cVar.f = true;
        com.taobao.runtimepermission.group.e.a(cVar, new e.a() { // from class: com.taobao.runtimepermission.MegaPermissionAbility.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.runtimepermission.group.e.a
            public void a(com.taobao.runtimepermission.group.d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("875a99e", new Object[]{this, dVar});
                } else if (dVar.f18993a) {
                    chVar.a(MegaPermissionAbility.a(dVar));
                } else {
                    chVar.a(new ErrorResult(dVar.c, dVar.d));
                }
            }
        });
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPermissionAbility
    public void requestPermission(als alsVar, ds dsVar, ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c048ca2", new Object[]{this, alsVar, dsVar, ciVar});
        } else {
            a.a(alsVar, dsVar, ciVar);
        }
    }

    private static PermissionResult b(com.taobao.runtimepermission.group.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionResult) ipChange.ipc$dispatch("6a5dbfc0", new Object[]{dVar});
        }
        PermissionResult permissionResult = new PermissionResult();
        permissionResult.COARSE_LOCATION = dVar.b.get("COARSE_LOCATION");
        permissionResult.FINE_LOCATION = dVar.b.get("FINE_LOCATION");
        permissionResult.READ_CALENDAR = dVar.b.get("READ_CALENDAR");
        permissionResult.WRITE_CALENDAR = dVar.b.get("WRITE_CALENDAR");
        permissionResult.READ_CONTACTS = dVar.b.get("READ_CONTACTS");
        permissionResult.WRITE_CONTACTS = dVar.b.get("WRITE_CONTACTS");
        permissionResult.READ_IMAGES = dVar.b.get("READ_IMAGES");
        permissionResult.WRITE_IMAGES = dVar.b.get("WRITE_IMAGES");
        permissionResult.READ_VIDEO = dVar.b.get("READ_VIDEO");
        permissionResult.WRITE_VIDEO = dVar.b.get("WRITE_VIDEO");
        permissionResult.READ_AUDIO = dVar.b.get("READ_AUDIO");
        permissionResult.WRITE_AUDIO = dVar.b.get("WRITE_AUDIO");
        permissionResult.RECORD_AUDIO = dVar.b.get("RECORD_AUDIO");
        permissionResult.TAKE_CAMERA = dVar.b.get("TAKE_CAMERA");
        permissionResult.READ_PASTEBOARD = dVar.b.get("READ_PASTEBOARD");
        return permissionResult;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ PermissionRequestPermissionEvent a(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PermissionRequestPermissionEvent) ipChange.ipc$dispatch("3054a232", new Object[]{dVar}) : b(dVar);
        }

        public static void a(als alsVar, ds dsVar, final ci ciVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52d2bb45", new Object[]{alsVar, dsVar, ciVar});
                return;
            }
            String[] strArr = null;
            Context f = alsVar.b() == null ? null : alsVar.b().f();
            if (dsVar.f8824a != null) {
                strArr = (String[]) dsVar.f8824a.toArray(new String[0]);
            }
            if (f == null || StringUtils.isEmpty(dsVar.b) || strArr == null || strArr.length == 0) {
                ciVar.a(new ErrorResult("UNKNOWN_BIZ_ERROR", "invalid parameter"));
                return;
            }
            String[] strArr2 = new String[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                strArr2[i] = "android.permission." + strArr[i];
            }
            try {
                f.a(f, strArr2).a(true).b(dsVar.b).b(true).a(dsVar.c).a(dsVar.d).a(new nml() { // from class: com.taobao.runtimepermission.MegaPermissionAbility.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.nml
                    public void a(d dVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c1d4ff8e", new Object[]{this, dVar});
                        } else {
                            ci.this.a(a.a(dVar));
                        }
                    }
                }).a();
            } catch (Exception e) {
                ciVar.a(new ErrorResult("UNKNOWN_BIZ_ERROR", e.toString()));
            }
        }

        private static PermissionRequestPermissionEvent b(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PermissionRequestPermissionEvent) ipChange.ipc$dispatch("f5869391", new Object[]{dVar});
            }
            PermissionRequestPermissionEvent permissionRequestPermissionEvent = new PermissionRequestPermissionEvent();
            if (dVar.f18987a != null && dVar.b != null) {
                HashMap hashMap = new HashMap();
                for (int i = 0; i < dVar.f18987a.length; i++) {
                    String replace = dVar.f18987a[i].replace("android.permission.", "");
                    int i2 = dVar.b[i];
                    if (i2 == -1) {
                        hashMap.put(replace, "denied");
                    } else if (i2 == 0) {
                        hashMap.put(replace, "authorized");
                    } else {
                        hashMap.put(replace, "unsupport");
                    }
                }
                permissionRequestPermissionEvent.result = hashMap;
            }
            return permissionRequestPermissionEvent;
        }
    }
}
