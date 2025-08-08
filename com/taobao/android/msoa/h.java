package com.taobao.android.msoa;

import android.app.ActivityManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.annotation.MSOAServiceDefinition;
import com.taobao.android.msoa.annotation.MSOAServiceInvoke;
import java.util.List;
import java.util.Map;
import tb.acg;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private g f14435a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Map<String, Object> f;
    private int g;
    private String i;
    private String j;
    private String k;
    private String h = "1.0";
    private String l = "2.0";

    public h(String str, Map<String, Object> map) {
        MSOAServiceInvoke mSOAServiceInvoke = (MSOAServiceInvoke) getClass().getAnnotation(MSOAServiceInvoke.class);
        if (mSOAServiceInvoke == null) {
            throw new IllegalArgumentException("MSOARequestV2 must be annotated with MSOAServiceInvoke");
        }
        this.d = mSOAServiceInvoke.bizName();
        this.b = mSOAServiceInvoke.serviceId();
        this.c = mSOAServiceInvoke.version();
        if (StringUtils.isEmpty(this.d) || StringUtils.isEmpty(this.b) || StringUtils.isEmpty(this.c)) {
            throw new IllegalArgumentException("MSOAServiceInvoke annotation should have bizName and serviceId and version");
        }
        try {
            this.i = Thread.currentThread().getStackTrace()[3].getClassName();
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) acg.a().getApplicationContext().getSystemService("activity")).getRunningTasks(1);
            if (runningTasks != null) {
                this.j = runningTasks.get(0).topActivity.getClassName();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.e = str;
        this.f = map;
        this.g = MSOAServiceDefinition.Platform.NATIVE.value();
        if (StringUtils.isEmpty(this.e)) {
            throw new IllegalArgumentException("params sceneName can not be null or empty");
        }
        this.f14435a = new g(this.b, this.c, this.d, this.e, this.f);
        g gVar = this.f14435a;
        gVar.m = this.h;
        gVar.n = this.i;
        gVar.o = this.j;
        gVar.q = this.l;
    }

    public h(String str, String str2, String str3, String str4, Map<String, Object> map) {
        this.d = str;
        this.b = str2;
        this.c = str3;
        try {
            this.i = Thread.currentThread().getStackTrace()[3].getClassName();
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) acg.a().getApplicationContext().getSystemService("activity")).getRunningTasks(1);
            if (runningTasks != null) {
                this.j = runningTasks.get(0).topActivity.getClassName();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.e = str4;
        this.f = map;
        this.g = MSOAServiceDefinition.Platform.NATIVE.value();
        if (StringUtils.isEmpty(this.d) || StringUtils.isEmpty(this.b) || StringUtils.isEmpty(this.c) || StringUtils.isEmpty(this.e)) {
            throw new IllegalArgumentException("params bizName serviceId version sceneName all can not be null or empty");
        }
        this.f14435a = new g(this.b, this.c, this.d, this.e, this.f);
        g gVar = this.f14435a;
        gVar.m = this.h;
        gVar.n = this.i;
        gVar.o = this.j;
        gVar.q = this.l;
    }

    public h(String str, String str2, String str3, String str4, String str5, Map<String, Object> map, int i) {
        this.d = str;
        this.b = str2;
        this.c = str3;
        try {
            this.i = Thread.currentThread().getStackTrace()[3].getClassName();
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) acg.a().getApplicationContext().getSystemService("activity")).getRunningTasks(1);
            if (runningTasks != null) {
                this.j = runningTasks.get(0).topActivity.getClassName();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.k = str4;
        this.e = str5;
        this.f = map;
        this.g = i;
        if (StringUtils.isEmpty(this.d) || StringUtils.isEmpty(this.b) || StringUtils.isEmpty(this.c) || StringUtils.isEmpty(this.k) || StringUtils.isEmpty(this.e)) {
            throw new IllegalArgumentException("params bizName serviceId version invokePageUrl sceneName all can not be null or empty");
        }
        this.f14435a = new g(this.b, this.c, this.d, this.e, this.f, this.g);
        g gVar = this.f14435a;
        gVar.m = this.h;
        gVar.n = this.i;
        gVar.o = this.j;
        gVar.p = this.k;
        gVar.q = this.l;
    }

    public g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("8d4ed8d6", new Object[]{this}) : this.f14435a;
    }
}
