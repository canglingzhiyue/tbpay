package com.taobao.android.riverlogger;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONStringer;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RVLLevel f14902a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public long h;
    public String i;
    public boolean j = false;
    private String k;

    static {
        kge.a(-1589504720);
    }

    public d(RVLLevel rVLLevel, String str, long j) {
        this.f14902a = rVLLevel;
        this.b = str;
        this.h = j;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (this.k == null) {
            if (this.j) {
                try {
                    JSONStringer object = new JSONStringer().object();
                    if (this.e != null) {
                        object.key("event").value(this.e);
                    }
                    if (this.c != null) {
                        object.key("id").value(this.c);
                    }
                    if (this.d != null) {
                        object.key("parentId").value(this.d);
                    }
                    object.key("time").value(this.h);
                    if (this.f != null) {
                        object.key("errorCode").value(this.f);
                    }
                    if (this.g != null) {
                        object.key("errorMsg").value(this.g);
                    }
                    if (this.i == null) {
                        object.endObject();
                        this.k = object.toString();
                    } else {
                        this.k = object + ",\"ext\":" + this.i + riy.BLOCK_END_STR;
                    }
                } catch (JSONException unused) {
                }
            } else {
                this.k = this.i;
            }
        }
        return this.k;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.c = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.d = str;
        }
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        this.e = str;
        return true;
    }

    public boolean a(Object obj) {
        String obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            obj2 = (String) obj;
        } else {
            if (obj instanceof Number) {
                obj2 = obj.toString();
            }
            return false;
        }
        if (!StringUtils.isEmpty(obj2) && !"0".contentEquals(obj2)) {
            this.f = obj2;
            if (this.f14902a.value > RVLLevel.Warn.value) {
                this.f14902a = RVLLevel.Error;
            }
            return true;
        }
        return false;
    }
}
