package com.taobao.accs.net;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import java.util.Calendar;
import tb.kge;

/* loaded from: classes.dex */
public class b extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PendingIntent c;
    private AlarmManager d;

    static {
        kge.a(-1435227535);
    }

    @Override // com.taobao.accs.net.d
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "alarm";
    }

    public b(Context context) {
        super(context);
        try {
            this.d = (AlarmManager) this.f8269a.getSystemService("alarm");
        } catch (Throwable th) {
            ALog.e("AlarmHeartBeatMgr", "AlarmHeartBeatMgr", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.d
    public void a(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.d == null) {
            this.d = (AlarmManager) this.f8269a.getSystemService("alarm");
        }
        if (this.d == null) {
            ALog.e("AlarmHeartBeatMgr", "setInner null", new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            z = false;
        }
        if (this.c == null) {
            Intent intent = new Intent();
            intent.setPackage(this.f8269a.getPackageName());
            intent.addFlags(32);
            intent.setAction(Constants.ACTION_COMMAND);
            intent.putExtra("command", -1);
            this.c = com.android.taobao.aop.a.b(this.f8269a, 0, intent, z ? 67108864 : 0);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(13, i);
        this.d.set(0, calendar.getTimeInMillis(), this.c);
    }
}
