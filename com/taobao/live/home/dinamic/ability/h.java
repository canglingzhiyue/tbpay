package com.taobao.live.home.dinamic.ability;

import android.os.CountDownTimer;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.dla;
import tb.dll;

/* loaded from: classes7.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static h b;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, CountDownTimer> f17734a = new HashMap<>();

    private h() {
    }

    public static h a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("f7e9443a", new Object[0]);
        }
        if (b == null) {
            b = new h();
        }
        return b;
    }

    public void a(String str, long j, long j2, final dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f920993e", new Object[]{this, str, new Long(j), new Long(j2), dllVar});
        } else if (this.f17734a.containsKey(str)) {
        } else {
            CountDownTimer countDownTimer = new CountDownTimer(j, j2) { // from class: com.taobao.live.home.dinamic.ability.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.CountDownTimer
                public void onTick(long j3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j3)});
                    }
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                        return;
                    }
                    dll dllVar2 = dllVar;
                    if (dllVar2 == null) {
                        return;
                    }
                    dllVar2.callback("success", new dla());
                }
            };
            countDownTimer.start();
            this.f17734a.put(str, countDownTimer);
        }
    }

    public void a(String str, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2548053e", new Object[]{this, str, dllVar});
            return;
        }
        HashMap<String, CountDownTimer> hashMap = this.f17734a;
        if (hashMap == null || hashMap.size() == 0 || TextUtils.isEmpty(str)) {
            b = null;
            return;
        }
        try {
            this.f17734a.remove(str).cancel();
        } catch (Exception unused) {
        }
        if (dllVar == null) {
            return;
        }
        dllVar.callback("success", new dla());
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HashMap<String, CountDownTimer> hashMap = this.f17734a;
        if (hashMap == null || hashMap.size() == 0) {
            b = null;
            return;
        }
        try {
            for (Map.Entry<String, CountDownTimer> entry : this.f17734a.entrySet()) {
                entry.getValue().cancel();
            }
        } catch (Exception unused) {
        }
        this.f17734a.clear();
        this.f17734a = null;
        b = null;
    }
}
