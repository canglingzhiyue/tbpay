package com.zoloz.android.phone.zdoc.utils;

import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import tb.kge;
import tb.rrv;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private rrv c;
    private int d;

    /* renamed from: a  reason: collision with root package name */
    private final String f24762a = "ZdocRecord";
    private ArrayList<String> b = new ArrayList<>();
    private long e = 0;

    static {
        kge.a(505110859);
    }

    public a() {
        this.c = null;
        this.c = (rrv) BioServiceManager.getCurrentInstance().getBioService(rrv.class);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ArrayList<String> arrayList = this.b;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        BioLog.i("ZdocRecord", "recordBasicCheck");
        HashMap hashMap = new HashMap(2);
        hashMap.put(rrv.PAGE_NUMBER, Integer.toString(this.d));
        hashMap.put(rrv.PAGE_CONTENT, Arrays.toString(this.b.toArray()));
        rrv rrvVar = this.c;
        if (rrvVar != null) {
            rrvVar.a(rrv.BASIC_CHECK, hashMap);
        }
        this.b.clear();
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(rrv.PAGE_NUMBER, Integer.toString(this.d));
        hashMap.put(rrv.UPLOAD_RESULT, Integer.toString(i));
        hashMap.put(rrv.VALIDATION_RESULT, Integer.toString(i2));
        hashMap.put(rrv.SERVER_RESULT, Integer.toString(i3));
        hashMap.put(rrv.UPLOAD_TIME, String.valueOf(System.currentTimeMillis() - this.e));
        rrv rrvVar = this.c;
        if (rrvVar == null) {
            return;
        }
        rrvVar.a(rrv.UPLOAD_END, hashMap);
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        this.e = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put(rrv.PAGE_NUMBER, Integer.toString(this.d));
        hashMap.put("payload", String.valueOf(((float) j) / 1024.0f));
        rrv rrvVar = this.c;
        if (rrvVar == null) {
            return;
        }
        rrvVar.a("uploadStart", hashMap);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put(rrv.PAGE_NUMBER, Integer.toString(this.d));
        hashMap.put("reason", str);
        rrv rrvVar = this.c;
        if (rrvVar == null) {
            return;
        }
        rrvVar.a(rrv.ALERT_APPEAR, hashMap);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put(rrv.PAGE_NUMBER, Integer.toString(this.d));
        hashMap.put(rrv.PAGE_CONTENT, str);
        hashMap.put(rrv.CLICK_ALERT, str2);
        rrv rrvVar = this.c;
        if (rrvVar == null) {
            return;
        }
        rrvVar.a(rrv.ALERT_CHOOSE, hashMap);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(rrv.AUTH_CHECK_RESULT, Integer.toString(i));
        rrv rrvVar = this.c;
        if (rrvVar != null) {
            rrvVar.a(rrv.AUTH_CHECK, hashMap);
        }
        if (i != 0) {
            return;
        }
        a(rrv.CAMERA_ERROR);
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put(rrv.PAGE_NUMBER, Integer.toString(this.d));
        hashMap.put(rrv.ON_PAGE, str);
        hashMap.put(rrv.CLICK_ITEM, str2);
        rrv rrvVar = this.c;
        if (rrvVar == null) {
            return;
        }
        rrvVar.a("clickButton", hashMap);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(rrv.PAGE_NUMBER, Integer.toString(this.d));
        rrv rrvVar = this.c;
        if (rrvVar == null) {
            return;
        }
        rrvVar.a(rrv.OVER_THRESHOLD, hashMap);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        rrv rrvVar = this.c;
        if (rrvVar == null) {
            return;
        }
        rrvVar.a(str);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        rrv rrvVar = this.c;
        if (rrvVar == null) {
            return;
        }
        rrvVar.a();
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.c == null) {
        } else {
            HashMap hashMap = new HashMap(2);
            hashMap.put("width", String.valueOf(i));
            hashMap.put("height", String.valueOf(i2));
            this.c.a(rrv.FRAME_SIZE_WH, hashMap);
        }
    }
}
