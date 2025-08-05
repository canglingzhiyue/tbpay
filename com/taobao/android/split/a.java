package com.taobao.android.split;

import android.text.TextUtils;
import com.alibaba.android.split.j;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.xin;

/* loaded from: classes6.dex */
public class a implements xin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private xin f15267a;
    private boolean b = false;
    private j c = (j) com.alibaba.android.split.a.a((Class<? extends Object>) j.class, new Object[0]);
    private int d;

    static {
        kge.a(-1475003650);
        kge.a(2104778297);
    }

    public void a(xin xinVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7551e1b", new Object[]{this, xinVar});
            return;
        }
        this.f15267a = xinVar;
        this.b = FlexaNative.a();
    }

    @Override // tb.xin
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            if (this.d == 0) {
                this.d = k.a().b().a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.b) {
            String fileMd5 = FlexaNative.getFileMd5(str);
            if (!TextUtils.isEmpty(fileMd5)) {
                this.c.a("md5_native", true, "md5", System.currentTimeMillis() - currentTimeMillis, 0, "", this.d);
                return fileMd5;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            String a2 = this.f15267a.a(str);
            this.c.a("md5_java", true, "md5", System.currentTimeMillis() - currentTimeMillis2, 1, "", this.d);
            return a2;
        }
        String a3 = this.f15267a.a(str);
        this.c.a("md5_java", true, "md5", System.currentTimeMillis() - currentTimeMillis, 2, "", this.d);
        return a3;
    }

    @Override // tb.xin
    public void a(ClassLoader classLoader, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cce905e", new Object[]{this, classLoader, obj});
            return;
        }
        try {
            if (this.d == 0) {
                this.d = k.a().b().a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.b && !a(obj)) {
            FlexaNative.registerDexFile(classLoader, obj);
            this.c.a("registerDexFile_native", true, "registerDexFile", 0L, 0, "", this.d);
            return;
        }
        this.f15267a.a(classLoader, obj);
        this.c.a("registerDexFile_java", true, "registerDexFile", 0L, 0, "", this.d);
    }

    @Override // tb.xin
    public boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        if (!this.b) {
            return this.f15267a.a(obj);
        }
        return FlexaNative.isDexFileRegistered(obj);
    }

    @Override // tb.xin
    public boolean a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee2b494", new Object[]{this, str, str2, str3, str4})).booleanValue();
        }
        try {
            if (this.d == 0) {
                this.d = k.a().b().a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.b) {
            boolean a2 = this.f15267a.a(str, str2, str3, str4);
            this.c.a("mergePatchAndVerify_java", a2, "mergePatchAndVerify", System.currentTimeMillis() - currentTimeMillis, 0, "", this.d);
            return a2;
        }
        boolean mergePatchAndVerify = FlexaNative.mergePatchAndVerify(str, str2, str3, str4);
        this.c.a("mergePatchAndVerify_native", mergePatchAndVerify, "mergePatchAndVerify", System.currentTimeMillis() - currentTimeMillis, 0, "", this.d);
        return mergePatchAndVerify;
    }
}
