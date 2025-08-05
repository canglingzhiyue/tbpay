package com.taobao.search.mmd.onesearch;

import android.content.res.Resources;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.taobao.tao.Globals;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class c extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f19176a = -1;
    private String[] b;
    private String[] c;
    private e d;

    static {
        kge.a(-1852403873);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public c() {
        Resources resources = Globals.getApplication().getResources();
        this.b = resources.getString(R.string.tbsearch_sharshops_callback_result).split(";");
        this.c = resources.getString(R.string.tbsearch_shop_detail_url_regularExpression).split(";");
    }

    @Override // com.taobao.search.mmd.onesearch.d
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        q.a("lx", "SearchUrlFilter=" + str);
        int i = this.f19176a;
        if (i == 0) {
            b(str);
            return true;
        } else if (i == 1) {
            b(str);
            return true;
        } else if (i == 2) {
            if (Constants.isRegularIndex(str, this.b)) {
                if (c(str).trim().equals("1")) {
                    e eVar = this.d;
                    if (eVar != null) {
                        eVar.a();
                    }
                } else {
                    e eVar2 = this.d;
                    if (eVar2 != null) {
                        eVar2.b();
                    }
                }
                return true;
            } else if (Constants.isRegularIndex(str, this.c)) {
                e eVar3 = this.d;
                if (eVar3 != null) {
                    eVar3.a(str);
                }
                return true;
            } else {
                b(str);
                return true;
            }
        } else {
            b(str);
            return true;
        }
    }

    @Override // com.taobao.search.mmd.onesearch.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e eVar = this.d;
        if (eVar == null) {
            return;
        }
        eVar.c();
    }

    @Override // com.taobao.search.mmd.onesearch.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e eVar = this.d;
        if (eVar == null) {
            return;
        }
        eVar.d();
    }

    @Override // com.taobao.search.mmd.onesearch.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        e eVar = this.d;
        if (eVar == null) {
            return;
        }
        eVar.e();
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        e eVar = this.d;
        if (eVar == null) {
            return;
        }
        eVar.b(str);
    }

    private String c(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        if (str == null || str.trim().length() <= 0 || (indexOf = str.indexOf("data=")) == -1) {
            return "";
        }
        String substring = str.substring(indexOf);
        int indexOf2 = substring.indexOf("&");
        if (indexOf2 != -1) {
            return substring.substring(5, indexOf2);
        }
        return substring.substring(5);
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cdc7f14", new Object[]{this, eVar});
        } else {
            this.d = eVar;
        }
    }
}
