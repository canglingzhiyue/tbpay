package com.tanx.exposer.achieve;

import android.database.Cursor;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tanx.exposer.achieve.retry.AdMonitorRetryType;
import com.tanx.exposer.c;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import tb.dhc;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f8153a;
    private String b;
    private String c;
    private String d;
    private AdMonitorType e;
    private String f;
    private c g;
    private final int h;
    private AtomicInteger i;
    private long j;
    private String k;
    private AdMonitorRetryType l;

    static {
        kge.a(2041324217);
    }

    public b(String str, String str2, AdMonitorType adMonitorType, String str3, String str4, int i) {
        this.f8153a = -1L;
        this.i = new AtomicInteger(0);
        this.l = AdMonitorRetryType.MEMORY;
        this.b = str;
        this.c = str2;
        this.e = adMonitorType;
        this.d = str3;
        this.f = str4;
        this.h = i;
        long currentTimeMillis = System.currentTimeMillis();
        this.k = dhc.a(currentTimeMillis, "yyyy-MM-dd");
        this.j = currentTimeMillis + 86400000;
    }

    public b(Cursor cursor) {
        this.f8153a = -1L;
        this.i = new AtomicInteger(0);
        this.l = AdMonitorRetryType.MEMORY;
        this.f8153a = cursor.getLong(cursor.getColumnIndex("id"));
        this.e = AdMonitorType.valueOf(cursor.getString(cursor.getColumnIndex("monitor_type")));
        this.b = cursor.getString(cursor.getColumnIndex("monitor_url"));
        this.c = cursor.getString(cursor.getColumnIndex("monitor_original_url"));
        this.d = cursor.getString(cursor.getColumnIndex("monitor_url_host"));
        this.f = cursor.getString(cursor.getColumnIndex("monitor_url_hash"));
        this.i = new AtomicInteger(cursor.getInt(cursor.getColumnIndex("retry_times")));
        this.h = cursor.getInt(cursor.getColumnIndex("max_retry_times"));
        this.k = cursor.getString(cursor.getColumnIndex("date"));
        this.j = cursor.getLong(cursor.getColumnIndex(PushConstants.REGISTER_STATUS_EXPIRE_TIME));
        String string = cursor.getString(cursor.getColumnIndex("monitor_extra_params"));
        if (!TextUtils.isEmpty(string)) {
            try {
                this.g = new c(string);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749a1b9f", new Object[]{this, cVar});
        } else {
            this.g = cVar;
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.f8153a = j;
        }
    }

    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.f8153a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public AdMonitorType d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AdMonitorType) ipChange.ipc$dispatch("2dc498f2", new Object[]{this}) : this.e;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.f;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.d;
    }

    public long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : this.j;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.k;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.h;
    }

    public AtomicInteger j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("15a5c59b", new Object[]{this}) : this.i;
    }

    public c k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("c4ab47db", new Object[]{this}) : this.g;
    }

    public AdMonitorRetryType l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AdMonitorRetryType) ipChange.ipc$dispatch("4be85e89", new Object[]{this}) : this.l;
    }

    public void a(AdMonitorRetryType adMonitorRetryType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34881c7e", new Object[]{this, adMonitorRetryType});
        } else {
            this.l = adMonitorRetryType;
        }
    }
}
