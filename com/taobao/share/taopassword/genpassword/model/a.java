package com.taobao.share.taopassword.genpassword.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f19662a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public C0810a h;
    public long i;
    public Map<String, String> j;
    public String k;
    public String l;
    public String m;
    public int n = -1;
    public String o;

    /* renamed from: com.taobao.share.taopassword.genpassword.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0810a {

        /* renamed from: a  reason: collision with root package name */
        public String f19663a;
        public String b;

        static {
            kge.a(1685123685);
        }
    }

    static {
        kge.a(139254965);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f19662a = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }
}
