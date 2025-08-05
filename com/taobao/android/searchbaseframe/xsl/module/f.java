package com.taobao.android.searchbaseframe.xsl.module;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import java.util.Map;
import tb.htg;
import tb.imn;
import tb.itt;
import tb.kge;

/* loaded from: classes6.dex */
public class f extends com.taobao.android.meta.data.f<htg, XslSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean c;
    private String d;
    private String e;
    private String f;

    static {
        kge.a(356953496);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -550593762) {
            if (hashCode == -295964400) {
                super.a((f) ((BaseSearchResult) objArr[0]));
                return null;
            } else if (hashCode != 1576018983) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.a((f) ((MetaResult) objArr[0]), (JSONObject) objArr[1]);
                return null;
            }
        }
        return super.a((Map) objArr[0], (a.C0571a) objArr[1]);
    }

    public f(imn imnVar) {
        super(imnVar, null);
        this.d = "";
        this.e = "2.0";
        this.f = "wxrcmd";
        this.c = false;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c = true;
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        this.d = str;
        this.e = str2;
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.b
    public void a(XslSearchResult xslSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd6163a", new Object[]{this, xslSearchResult});
        } else if (this.c) {
            super.a((f) xslSearchResult);
        } else if (xslSearchResult.getCellsCount() != 0) {
        } else {
            xslSearchResult.getMainInfo().finish = true;
        }
    }

    @Override // com.taobao.android.meta.data.f, com.taobao.android.searchbaseframe.datasource.impl.b
    public void a(XslSearchResult xslSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39a553f6", new Object[]{this, xslSearchResult, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("result");
        if (jSONArray != null && jSONArray.size() > 0 && jSONArray.getJSONObject(0) != null) {
            b(xslSearchResult, jSONArray.getJSONObject(0));
        }
        xslSearchResult.setCurrentData(jSONObject);
    }

    public void b(XslSearchResult xslSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b09f77", new Object[]{this, xslSearchResult, jSONObject});
        } else {
            super.a((f) xslSearchResult, jSONObject);
        }
    }

    @Override // com.taobao.android.meta.data.f, com.taobao.android.searchbaseframe.datasource.impl.b
    public itt.a a(Map<String, String> map, a.C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itt.a) ipChange.ipc$dispatch("df2e9b1e", new Object[]{this, map, c0571a});
        }
        if (this.c) {
            return super.a(map, c0571a);
        }
        return new itt.a(this.d, this.e, this.f);
    }

    @Override // com.taobao.android.meta.data.f
    public itt.a a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itt.a) ipChange.ipc$dispatch("bea4bbe3", new Object[]{this, map}) : new itt.a(this.d, this.e, this.f);
    }
}
