package com.taobao.tbreachflow.shortcuts.windvane;

import android.os.Build;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.BroadcastAddListenerEventResult;
import com.taobao.android.abilityidl.ability.BroadcastEventResult;
import com.taobao.android.abilityidl.ability.o;
import com.taobao.tbhudong.TBHuDongServiceImp;
import tb.ffw;
import tb.ffx;
import tb.qif;
import tb.qoh;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ffx f22283a = ffx.a();

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        o a2 = o.a("ShortCutsRefresh");
        a2.f8890a = "ShortCuts";
        a2.b = "ShortCutsRefresh";
        f22283a.a(a2, new ffw() { // from class: com.taobao.tbreachflow.shortcuts.windvane.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ffw, tb.gml
            public void a(ErrorResult errorResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                }
            }

            @Override // tb.ffw, com.taobao.android.abilityidl.ability.bg
            public void onEvent(BroadcastEventResult broadcastEventResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("560ff2e1", new Object[]{this, broadcastEventResult});
                    return;
                }
                qif.a("ShortcutsMegaHelper onEvent", broadcastEventResult);
                if (Build.VERSION.SDK_INT < 25) {
                    return;
                }
                qoh.a(TBHuDongServiceImp.getApplication()).e();
            }

            @Override // tb.ffw, com.taobao.android.abilityidl.ability.bg
            public void a(BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("afb25af0", new Object[]{this, broadcastAddListenerEventResult});
                } else {
                    qif.a("ShortcutsMegaHelper onAdd", broadcastAddListenerEventResult);
                }
            }
        });
    }
}
